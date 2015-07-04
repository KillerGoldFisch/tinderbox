# -*- mode: ruby -*-
# vi: set ft=ruby :
require 'yaml'

# Loading custom configuration file
yml_config = {}
if File.exist?("vagrant_config.yml")
  yml_config = YAML::load_file("vagrant_config.yml")
end

# Default configuration
user_config = {
}.merge(yml_config)

# Base system bootstrap script
$bootstrap_script = <<__BOOTSTRAP__

echo "----------Provisioning defaults----------"
sudo apt-get update -y
sudo apt-get upgrade -y
sudo apt-get install -y build-essential curl git
echo "----------Finished provisioning defaults----------"

echo "----------Downloading TinderBox----------"
mkdir /var/tinderbox
git clone https://github.com/mondora/tinderbox.git /var/tinderbox
echo "----------Finished downloading TinderBox----------"

__BOOTSTRAP__

Vagrant.configure(2) do |config|
  config.ssh.forward_agent = true

  config.vm.provider :virtualbox do |vbox|
    config.vm.box = "trusty64"
    config.vm.box_url = "https://cloud-images.ubuntu.com/vagrant/trusty/current/trusty-server-cloudimg-amd64-vagrant-disk1.box"
    config.vm.network :forwarded_port, host: 9000, guest: 9000
    vbox.customize ["modifyvm", :id, "--memory", "4096"]
    vbox.customize ["modifyvm", :id, "--cpus", "2"]
  end

  config.vm.provider :aws do |aws, override|
    aws.access_key_id = ""
    aws.secret_access_key = ""
    aws.keypair_name = ""
    #aws.ami = "ami-5ba23a2c"
    aws.ami = "ami-e9a9319e"
    #aws.instance_type = "t2.micro"
    aws.instance_type = "m1.small"
    aws.region = "eu-west-1"
    aws.security_groups = [""]
    aws.tags = {
      'Name' => ''
    }
    aws.associate_public_ip = true
    aws.subnet_id = ""
    aws.private_ip_address = ""
    override.vm.box = "dummy"
    override.vm.box_url = "https://github.com/mitchellh/vagrant-aws/raw/master/dummy.box"
    override.ssh.username = "ubuntu"
    override.ssh.private_key_path = ""
  end

  config.vm.provision "shell", inline: $bootstrap_script

  config.vm.provision "docker" do |d|
    d.build_image "/var/tinderbox/", args: "-t tinderbox:latest" #docker build -t tinderbox /var/tinderbox/
    d.run "tinderbox", args: "-p 0.0.0.0:9000:9000" #docker run -p 0.0.0.0:9000:9000 tinderbox:latest
  end
end
