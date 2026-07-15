import java.util.Scanner;
public class four {
    public static void go(){
        x.clearScreen();
        Scanner input = new Scanner(System.in);
        
        x.pl("Chair options:");
        TheImages images = new TheImages();
        String c1 = images.getNotSure("chairOne");
        if (c1 != null) {
            System.out.println(c1);
        } else {
            System.out.println("[Chair image missing]");
        }
        String c2 = images.getNotSure("chairTwo");
        if (c2 != null) {
            System.out.println(c2);
        } else {
            System.out.println("[Chair image missing]");
        }
        String c3 = images.getNotSure("chairThree");
        if (c3 != null) {
            System.out.print(c3);
        } else {
            System.out.println("[Chair image missing]");
        }
        
        x.simpleEnter();
        
        x.p("Select 1, 2, or 3: ");
        
        int choice = input.nextInt();
        x.pl("");
        x.pl("Good choice here's your seatmate");
        x.simpleEnter();
        String sM = images.getNotSure("seatmate");
        if (sM != null) {
            System.out.print(sM);
        } else {
            System.out.println("[Chair image missing]");
        }
        
        x.simpleEnter();
        
        x.pl("HELLO I AM NEXT TO YOU IN THIS CLASS");
        x.simpleEnter();
        x.pl("Response options:");
        x.simpleEnter();
        x.pl("1: k\n2: Ok\n3: What's your class after this if it's Dissection can you walk me there");
        x.pl("");
        x.p("Your choice please: ");
        int answer = input.nextInt();
        input.nextLine(); 
        
        if(answer == 1 || answer == 2){
            x.pl("");
            x.pl("They say: Do you think I'm ugly");
            x.simpleEnter();
            x.p("I don't even know what to say so you can type a response: ");
            String reply = input.nextLine();
            x.simpleEnter();
            x.pl("I really hope that goes across well");
            x.simpleEnter();
            x.pl("Press Enter to see if it did");
            String f = images.getNotSure("theFace");
            if (f != null) {
                System.out.println(f);
            } else {
                System.out.println("[Face image missing]");
            }
            x.simpleEnter();
            x.pl("Too late. Class is starting");
            x.simpleEnter();
        }
        else{
            x.pl("");
            x.pl("They say: Yes my next class is Dissection and I would love two Walk you there! !");
            x.simpleEnter();
            x.pl("You reply: Thank you :) : ) :)");
            x.simpleEnter();
            x.pl("That was so nice. Class is starting now");
        }
        
        x.simpleEnter();
        
    }
}
