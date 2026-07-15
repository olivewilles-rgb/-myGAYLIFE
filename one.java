import java.util.Scanner;
public class one {
    public static void go(){
        Scanner input = new Scanner(System.in);
        x.clearScreen();
        x.printDay();
        x.p(Colors.CYAN + " [Press Enter to continue to next line]");
        x.l();
        x.l();
        
        x.p(Colors.PURPLE + "Good morning. Today you're going to a new school.");
        x.simpleEnter();
        x.l();
        x.p("Excited? You should be. It will be good.");
        x.simpleEnter();
        x.l();
        x.p("I don't know if you remember, but you were 'dismissed' from your last school. Rough.");
        x.simpleEnter();
        x.l();
        x.p("Luckily you were accepted to the United States American Academy School Boarding School for Young Women Aged 14 to 18! Awesome!");
        x.l();
        x.simpleEnter();
        x.p("The only thing you need to know is that NO ONE can find out the reason for your expulsion. I mean... your dismissal.");
        x.l();
        x.simpleEnter();
        x.p("What?");
        x.l();
        x.simpleEnter();
        x.p("First Day! Good luck!");
        x.simpleEnter();
        x.l();
        x.p(Colors.CYAN + "[Press Enter to continue]");
        x.simpleEnter();
        
        two.go();
    }
}
