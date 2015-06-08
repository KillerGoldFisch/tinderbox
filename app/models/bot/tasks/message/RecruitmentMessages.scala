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


  //def occhioAzzurro=Occhio(colore="azzrurro");

  //def kirsten=Ruffoni( capelli="blue", occhi=occhioAzzurro, cavallo="Rocky");




  def messages = List( hi, hello);

}
