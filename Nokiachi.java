import java.util.Scanner;
public class Nokiachi{
public static void main(String... args) {

String prompt = """
### Welcome to Nokia ###
press
1 -> Phonebook
2 -> Messages
3 -> Chat
4 -> Call register
5 -> Tones
6 -> Settings
7 -> Call divert
8 -> Games
9 -> Calculator
10 -> Reminders
11 -> Clock
12 -> Profiles
13 -> Sim services
""";
int input;
int input1 = 0;
int input2 = 0;
int input3 = 0;
int input4 = 0;
int input5 = 0;
int input6 = 0;
int input11 = 0;
System.out.println(prompt);
Scanner freddie = new Scanner(System.in);
input = freddie.nextInt();








           String pb ="""
              1. Search
              2. Service Nos
              3. Add name
              4. Erase
              5. Edit
              6. Assign tone
              7. Send b'card
              8. Option
              9. Speed dials
              10. Voice tags

             """;




String M ="""
1. Write messages
2. Inbox
3. Outbox
4. Picture messages
5. Templates
6. Smileys
7. Message settings
8. Info service
9. Voice mailbox number
10. Service command editor
""";




               String c ="Chat";


String cr ="""
1. Missed calls
2. Received calls
3. Dailed number
4. Erase recent call lists
5. Show call duration
6. Show call costs
7. Call cost limit
8. prepaid credit
""";




       String To ="""
         1. Ringing tone
         2. Ringing volume
         3. Incoming call alert
         4. Computer
         5. Message alert tone
         6. Keypad tones
         7. Warning and games tone
         8. Vibrating alert
         9. Screen saver
        """;




String St ="""
1. Call settings
2. Phone settings 
3. Security settings
4. Restore factory settings
""";




         String Cd ="Call divert";



String Gs ="Games";



        String Cr ="Calculator";



String Rs ="Reminders";



     String Ck ="""
       1. Alarm clock
       2. Clock settings
       3. Date settings
       4. Stopwatch
       5. Countdown timer
       6. Auto update of date and time
       """;



String Pf ="Profiles";



       String Ss ="SIM services";


 



switch (input) {
case 1 -> {
System.out.println("Phonebook");
System.out.println(pb);
System.out.println("choose next option");
input1 = freddie.nextInt();
   }
}



      switch (input1) {
         case 1 -> {System.out.println("search");}
         case 2 -> {System.out.println("Service Nos");}
         case 3 -> {System.out.println("Add name");}
         case 4 -> {System.out.println("Erase");}
         case 5 -> {System.out.println("Edit");}
         case 6 -> {System .out.println("Assign tone");}
         case 7 -> {System.out.println("Send b'card");}
         case 8 -> {
           System.out.println("Option");
           System.out.println("1.Type of view");
           System.out.println("2.Memory status");
          Scanner scanner = new Scanner(System.in);
       int output = scanner.nextInt();
      switch (output) {
case 1 -> System.out.println("Type of view");
case 2 -> System.out.println("Memory status");
}

}
case 9 -> {System.out.println("Speed dials");}
case 10 -> {System.out.println("Voice tags");}
}

switch (input){
case 2 -> {
 System.out.println("Messages");
System.out.println(M);
System.out.println("choose next option");
input2 = freddie.nextInt();
}
}




switch (input2) {
case 1 -> {System.out.println("Write messages");}
case 2 -> {System.out.println("inbox");}
case 3 -> {System.out.println("outbox");}
case 4 -> {System.out.println("Picture messages");}
case 5 -> {System.out.println("Templates");}
case 6 -> {System.out.println("Smileys");}
case 7 -> {System.out.println("Message settings");

System.out.println("1.Set 1");
System.out.println("2.common");

Scanner fareed = new Scanner(System.in);
int ans = fareed.nextInt();
switch (ans){
case 1 -> System.out.println("set 1");
case 2 -> System.out.println("common");
}
System.out.println("1.Messages center number");
System.out.println("2.Messages sent as");
System.out.println("3.Message validity");


Scanner x = new Scanner(System.in);
int mess = x.nextInt();
switch (mess){
case 1 -> System.out.println("Message center number");
case 2 -> System.out.println("Message sent as");
case 3 -> System.out.println("Message validity");

}
System.out.println("1.Delivery reports");
System.out.println("2.Reply via same center");
System.out.println("3.Character support");

Scanner y = new Scanner(System.in);
int set = y.nextInt();
switch (set){
case 1 -> System.out.println("Delivery reports");
case 2 -> System.out.println("Reply via same center");
case 3 -> System.out.println("Character support");
}


}
case 8 -> {System.out.println("info service");}
case 9 -> {System.out.println("Voice mailbox number");}
case 10 -> {System.out.println("Service command editor");}
}




switch (input){
case 3 -> {
System.out.println(c);
}
}




switch (input){
case 4 -> {
 System.out.println("Call register");
System.out.println(cr);
System.out.println("choose next option");
input4 = freddie.nextInt();
}
}

switch (input4) {
case 1 -> {System.out.println("missed calls");}
case 2 -> {System.out.println("Received calls");}
case 3 -> {System.out.println("Dialled numbers");}
case 4 -> {System.out.println("Erase recent call lists");}
case 5 -> {
System.out.println("Show call duration");
System.out.println("1.last call duration"); 
System.out.println("2.All calls duration");
System.out.println("3.Received calls' duration");
System.out.println("4.Dailed calls' duration");
System.out.println("5.Clear timers");


Scanner z = new Scanner(System.in);
int cd = z.nextInt();
switch (cd) {
case 1 -> System.out.println("last call duration");
case 2 -> System.out.println("All calls duration");
case 3 -> System.out.println("Received calls' duration");
case 4 -> System.out.println("Dailed calls' duration");
case 5 -> System.out.println("Clear timers");
}

}
case 6 -> {
System.out.println("show call cost");
System.out.println("1.last call cost");
System.out.println("2.All calls' cost");
System.out.println("3.Clear counters");
Scanner s = new Scanner(System.in);
int sc = s.nextInt();
switch (sc) {
case 1 -> System.out.println("last call cost");
case 2 -> System.out.println("All calls' cost");
case 3 -> System.out.println("Clear counters");
}
}

case 7 -> {
System.out.println("call cost settings");
System.out.println("1.Call cost limit");
System.out.println("2.Show cost in");
Scanner zs = new Scanner(System.in);
int css = zs.nextInt();
switch(css) {
case 1 -> System.out.println("Call cost limit");
case 2 -> System.out.println("Show cost in");
}
}

case 8 -> {System.out.println("prepaid credit");}
}


switch (input){
case 5 -> {
 System.out.println("Tones");
System.out.println(To);
System.out.println("choose next option");
input5 = freddie.nextInt();
}
}

switch (input5) {
case 1 -> {System.out.println("Ringing tone");}
case 2 -> {System.out.println("Ringing volume");}
case 3 -> {System.out.println("Incoming call alert");}
case 4 -> {System.out.println("Composer");}
case 5 -> {System.out.println("Message alert tone");}
case 6 -> {System.out.println("Keypad tones");}
case 7 -> {System.out.println("Warning and game tones");} 
case 8 -> {System.out.println("Vibrating alert");}
case 9-> {System.out.println("Screen saver");}
}
switch (input){
case 6 -> {
System.out.println("Settings");
System.out.println(St);
System.out.println("Choose next option");
input6 = freddie.nextInt();
}
}

switch (input6) {
case 1 -> {
System.out.println("Call settings");
System.out.println("1.Automatic redial");
System.out.println("2.Speed dailing");
System.out.println("3.Call waiting options");
System.out.println("4.Own number sending");
System.out.println("5.phone line in use");
System.out.println("6.Automatic answer");
Scanner u = new Scanner(System.in);
int ar = u.nextInt();
switch(ar) {
case 1 -> System.out.println("Automatic redial");
case 2 -> System.out.println("Speed dailing");
case 3 -> System.out.println("Call waiting options");
case 4 -> System.out.println("Own number sending");
case 5 -> System.out.println("phone line in use");
case 6 -> System.out.println("Automatic answer");
}
}


case 2 -> {
System.out.println("Phone settings");
System.out.println("1.language");
System.out.println("2.Cell info display");
System.out.println("3.Welcome note");
System.out.println("4.network selection");
System.out.println("5.Lights");
System.out.println("6.Confirm SIM service actions");
Scanner l = new Scanner(System.in);
int ps = l.nextInt();
switch(ps) {
case 1 -> System.out.println("language");
case 2 -> System.out.println("Cell info display");
case 3 -> System.out.println("Welcome note");
case 4 -> System.out.println("network selection");
case 5 -> System.out.println("Lights");
case 6 -> System.out.println("Confirm SIM service actions");
}
}


case 3 -> {
System.out.println("Security settings");
System.out.println("1.PIN code request");
System.out.println("2.Call barring service");
System.out.println("3.Fixed dialing");
System.out.println("4.Closed user group");
System.out.println("5.Phone security");
System.out.println("6.Change access codes");
Scanner it = new Scanner(System.in);
int pcr = it.nextInt();
switch(pcr) {
case 1 -> System.out.println("PIN code request");
case 2 -> System.out.println("Call barring service");
case 3 -> System.out.println("Fixed dialing");
case 4 -> System.out.println("Closed user group");
case 5 -> System.out.println("Phone security");
case 6 -> System.out.println("Change access codes");
}
}

case 4 -> {System.out.println("Restore factory settings");}
}


switch (input) {
case 7 -> {
System.out.println(Cd);
}
}


switch (input) {
case 8 -> {
System.out.println(Gs);
}
}


switch (input) {
case 9 -> {
System.out.println(Cr);
}
}


switch (input) {
case 10 -> {
System.out.println(Rs);
}
}


switch (input) {
case 11 -> {
System.out.println("Clock");
System.out.println(Ck);
System.out.println("Choose next option");
input11 = freddie.nextInt();
}
}

switch (input11){
case 1 ->{System.out.println("Alarm clock");}
case 2 ->{System.out.println("Clock settings");}
case 3 ->{System.out.println("Date setting");}
case 4 ->{System.out.println("StopWatch");}
case 5 ->{System.out.println("Countdown timer");}
case 6 ->{System.out.println("Auto update of date and time");}



}
switch (input) {
case 12 -> {
System.out.println(Pf);
}
}


switch (input) {
case 13 -> {
System.out.println(Ss);
}
}





}
}
