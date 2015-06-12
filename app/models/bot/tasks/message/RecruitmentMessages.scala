package models.bot.tasks.message

/**
 * A list of fun, pre-defined message trees.
 */
object RescruitmentMessages {

//example
  def hi=MessageTree( value = "hey {name}, hi!!", right= howareyou, left=sosorry );
  def sosorry=Some(MessageTree( value="I'm so sorry about that, what happen?", right=howareyou, left=None));
  def howareyou=Some(MessageTree( value = "How are you?", right=None, left=None ));
  def hello=MessageTree( value = "Hello {name}!", right=None, left=None );

//set1
def hi=MessageTree( value= "Hi!", right=howareyou, left=None);
def howareyou=MessageTree( value= "How are you?", right=imfine, left=sosorry);
def imfine=Some(MessageTree( value= "I'm fine too thanks!", right=wherefrom, left=None));
def sosorry=Some(MessageTree( value= "I'm sorry, how come?", right=None, left=None));
def wherefrom=MessageTree( value= "Where are you from?", right=niceplace, left=None);
def niceplace=Some(MessageTree( value= "Nice! I've never been there... What's it like?", right=interesting, left=None));
def interesting=MessageTree( value= "Haha, interesting", right=imfrom, left=None);
def imfrom=MessageTree( value= "I'm from Milan", right=itssunny, left=None);
def itssunny=MessageTree( value= "It's sunny and warm here today, very beautiful place", right=visit, left=None);
def visit=MessageTree( value= "You should visit some day!", right=mountains, left=None);
def mountains=MessageTree( value= "Do you like the mountains?", right=ilive, left=None);
def ilive=MessageTree( value= "I live in the mountains, it's lovely!", right=whatdoyoudo, left=None);
def whatdoyoudo=MessageTree( value= "What do you do for a living?", right=interesting, left=None);
def interesting=MessageTree( value= "interesting, do you enjoy it?", right=iwork, left=None);
def iwork=MessageTree( value= "I work for a software company", right=areyou, left=None);
def areyou=MessageTree( value= "Are you a tech person?", right=great, left=None);
def great=MessageTree( value= "Great! We have something in common!", right=whatareinterests, left=None);
def whatareinterests=MessageTree( value= "What are your interests in technology?", right=cool, left=None);
def cool=MessageTree( value= "Cool, I'm a software developer, so I'm interested in...", right=heardofit, left=None);
def heardofit=MessageTree( value= "Heard of it?", right=doyouknow, left=None);
def doyouknow=MessageTree( value= "Do you know, we are recruiting more people where I work.", right=wouldyoube, left=None);
def wouldyoube=MessageTree( value= "Would you be interested?", right=great2, left=None);
def great2=MessageTree( value= "Great! What we usually do with new people is have an initial chat on Whatsapp, so my colleagues can also get to know tou a bit.", right=itsmucheasier, left=None);
def itsmucheasier=MessageTree( value= "It's much easier than chatting one to one on Tinder!", right=wouldyoulike, left=None);
def wouldyoulike=MessageTree( value= "Would you like me to add you to out recruitment chat on Whatsapp?", right=couldyou, left=None);
def couldyou=MessageTree( value= "Could you please give me your number?", right=thankyou, left=None);
def thankyou=MessageTree( value= "Thank you very much!", right=beintouch, left=None);
def beintouch=MessageTree( value= "We will be in touch shortly!", right=None, left=None);


//set 2
def hello=MessageTree( value= "Hello:)", right=youtoday, left=None);
def youtoday=MessageTree( value= "How are you today?", right=imfine, left=sosorry);
def imfinetoo=Some(MessageTree( value= "I'm fine too thanks!", right=wherefrom, left=None));
def sosorry=Some(MessageTree( value= "I'm sorry, how come?", right=None, left=None));
def wherefrom=MessageTree( value= "Where are you from?", right=niceplace, left=None);
def niceplace=Some(MessageTree( value= "Nice! I've never been there... What's it like?", right=verynice, left=None));
def verynice=MessageTree( value= "Very nice!", right=imfrom, left=None);
def imfrom=MessageTree( value= "I'm from Milan", right=itssunny, left=None);
def itssunny=MessageTree( value= "It's sunny and warm here today, very beautiful place", right=visit, left=None);
def visit=MessageTree( value= "You should visit some day!", right=whatdoyoudo, left=None);
def whatdoyoudo=MessageTree( value= "What do you do for a living?", right=study, left=None);
def study=MessageTree( value= "What do you study?", right=wowreally, left=None);
def wowreally=MessageTree( value= "Wow, really? That's cool!", right=ihavestudied, left=None);
def ihavestudied=MessageTree( value= "I have studied... It's sooo interesting!", right=alotincommon, left=None);
def alotincommon=MessageTree( value= "We seem to have a lot in common, don't you think?", right=imalso, left=None);
def imalso=MessageTree( value= "I'm also interested in computer science, what about you?", right=greatinow, left=None);
def greatinow=MessageTree( value= "Great! I now work for a software company in Milan", right=job, left=None);
def job=MessageTree( value= "Do you have a job alongside your studies?", right=iusedto, left=None);
def iusedto=MessageTree( value= "I used to work part time when I was studying, it's been really good for my cv and career", right=actually, left=None);
def actually=MessageTree( value= "Actually, here where I work we are hiring, would you be interested?", right=persfect, left=None);
def perfect=MessageTree( value= "Perfect! Usually our first contact with people is through watsapp, a first informal chat before the interview.", right=wouldyoulike, left=None);
def wouldyoulike=MessageTree( value= "Would you like me to add you to our recruitment chat so you can find out more about available positions?", right=whatsappnumber, left=None);
def whatsappnumber=MessageTree( value= "Great! If you give me your whatsapp number I can add you and you can chat with my colleagues.", right=thanks, left=None);
def thanks=MessageTree( value= "Thanks! It's so weird to chat on tinder and end up finding a possible work colleague!", right=None, left=None);

//set 3
def hello=MessageTree( value= "Hello:)", right=youtoday, left=None);
def youtoday=MessageTree( value= "How are you today?", right=imfinetoo, left=sosorry);
def imfinetoo=Some(MessageTree( value= "I'm fine too thanks!", right=wherefrom, left=None));
def sosorry=Some(MessageTree( value= "I'm sorry, how come?", right=None, left=None));
def wherefrom=MessageTree( value= "Where are you from?", right=niceplace, left=None);
def niceplace=Some(MessageTree( value= "Nice! I've never been there... What's it like?", right=verynice, left=None));
def verynice=MessageTree( value= "Very nice!", right=imfrom, left=None);
def imfrom=MessageTree( value= "I'm from Milan", right=itssunny, left=None);
def itssunny=MessageTree( value= "It's sunny and warm here today, very beautiful place", right=visit, left=None);
def visit=MessageTree( value= "You should visit some day!", right=lakecomo, left=None);
def lakecomo=MessageTree( value= "Have you ever been to Lake Como?", right=iliveclose, left=None);
def iliveclose=MessageTree( value= "I live close to there, it's very beautiful!", right=whatdoyoudo, left=None);
def whatdoyoudo=MessageTree( value= "What do you do for a living?", right=wow2, left=None);
def wow2=MessageTree( value= "Wow, really? That's cool!", right=iwork, left=None);
def iwork=MessageTree( value= "I work for this amazing software company.", right=thefirst, left=None);
def thefirst=MessageTree( value= "We are the first certified IT B Corp in Europe!", right=doyouknow, left=None);
def doyouknow=MessageTree( value= "Do you know what a B Corp is?", right=certification, left=None);
def certification=MessageTree( value= "It's a certification that means we're very good at transparency, performance, ethics and environmental issues.", right=force, left=None);
def force=MessageTree( value= "We're trying to use business as a force for good!", right=forexample, left=None);
def forexample=MessageTree( value= "For example, we only buy organic food and we recycle waste :)", right=recycle, left=None);
def recycle=MessageTree( value= "Do you recycle?", right=carbonfootprint, left=None);
def carbonfootprint=MessageTree( value= "We also try to reduce our carbon footprint by cycling to work or sharing the same car.", right=cycling, left=None);
def cycling=MessageTree( value= "Do you like cycling?", right=itsverynice, left=None);
def itsverynice=MessageTree( value= "It's very nice to work for a company that tries to do some good in the world and not just make profits!", right=company, left=None);
def company=MessageTree( value= "Would you like to work for a company like this?", right=actually, left=None);
def actually=MessageTree( value= "Actually we're hiring if you're interested!", right=werelooking, left=None);
def werelooking=MessageTree( value= "We're looking for people who like technology and computers but we chat to people with other interests too as we have various positions available at the moment.", right=info, left=None);
def info=MessageTree( value= "If you want I can give you some more info?", right=usually, left=None);
def usually=MessageTree( value= "Great! Usually we have an initial chat with people who are interested in the company through whatsapp. Do you have a whatsapp account?", right=addyou, left=None);
def addyou=MessageTree( value= "If you like, I can add you to our recruitment chat and you can find out more about us :)", right=number, left=None);
def number=MessageTree( value= "Could you give me your whatsapp number please?", right=thanks3, left=None);
def thanks3=MessageTree( value= "Thanks! It's so weird to chat on tinder and end up finding a possible work colleague!", right=None, left=None);


  //def kirsten=Ruffoni( capelli="blue", occhi=occhioAzzurro, cavallo="Rocky");




  def messages = List( hi, hello);

}
