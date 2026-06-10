import java.util.Scanner;
public class two {
    public static void go() {
        Scanner input = new Scanner(System.in);
        x.clearScreen();
        x.pl(Colors.BLUE + "You have arrived at school");
        x.simpleEnter();
        x.pl("Here's your schedule: ");
        x.simpleEnter();
        x.pl("Classes:");
        x.pl("8:00 - 8:57: Inspection");
        x.pl("12:00 - 2:34: Dissection");
        x.pl("3:15 - 3:40: Writing");
        x.simpleEnter();
        x.pl("Do you like your schedule?");
        x.pl("Yes or no");
        String answer = input.nextLine();
        
        if(answer.equals("Yes") || answer.equals("yes")){
            x.pl("");
            x.pl("Good because you can't change it.");
        }
        else{
            x.pl("");
            x.pl("Doesn't matter because you can't change it.");
        }
        
        x.simpleEnter();
        x.p("OK.");
        x.pl("");
        x.noLineEnter();
        x.p("Sorry.");
        x.pl("");
        x.simpleEnter();
        x.p("School is going to be really fun.");
        x.pl("");
        x.simpleEnter();
        x.p("🤑😩😩😩🤏😁");
        x.pl("");
        x.simpleEnter();
        x.pl("Please get to class and stop wasting time.");
        
        x.simpleEnter();
        three.go();
    }
}
