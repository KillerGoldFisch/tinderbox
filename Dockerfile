# Pull base image.
FROM java:7
MAINTAINER mondora <together@mondora.com>

# Install additional packages.
RUN apt-get update -y && \
  apt-get install -y zip unzip && \
  apt-get install -y curl && \
  rm -rf /var/lib/apt/lists/*

# Install Sbt.
ADD https://dl.bintray.com/sbt/debian/sbt-0.13.8.deb .
RUN dpkg -i sbt-0.13.8.deb

# Install Scala.
#ADD http://downloads.typesafe.com/scala/2.11.7/scala-2.11.7.deb .
#RUN dpkg -i scala-2.11.7.deb

# Setting up environment.
ENV HOME /root
ENV DEBIAN_FRONTEND noninteractive
WORKDIR $HOME
COPY ./ $HOME/

# Build project.
RUN chmod a+x $HOME/lib/build_tinderbox_dist
RUN lib/build_tinderbox_dist
RUN chmod a+x $HOME/lib/fetch_nlp_models
RUN lib/fetch_nlp_models

# Launch Tinderbox
EXPOSE 9000
CMD $HOME/dist/tinderbox-1.1-SNAPSHOT/bin/tinderbox
