import java.util.Scanner;
public class two {
    public static void go() {
        Scanner input = new Scanner(System.in);
        x.clearScreen();
        x.pl(Colors.BLUE + "You have arrived at school");
        x.simpleEnter();
        x.pl("Here's your schedule: ");
        x.simpleEnter();
        TheImages images = new TheImages();
        String cA = images.getNotSure("Classes");
        if (cA != null) {
            System.out.println(cA);
        } else {
            System.out.println("[Class image missing]");
        }
        x.simpleEnter();
        x.pl("Do you like your schedule?");
        x.pl("Yes or No");
        x.pl("");
        x.p("Type your answer: ");
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
        x.p("🤑 😩 😩 😩 🤏 😁");
        x.pl("");
        x.simpleEnter();
        x.pl("Please get to class and stop wasting time.");
        
        x.simpleEnter();
        three.go();
    }
}
