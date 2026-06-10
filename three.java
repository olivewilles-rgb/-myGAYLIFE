import java.util.Scanner;
public class three {
    public static void go(){
        
        Scanner input = new Scanner(System.in);
        x.clearScreen();
        x.pl(Colors.RESET + "405: Inspection");
        TheImages images = new TheImages();
        String doorArt = images.getNotSure("Door");
        if (doorArt != null) {
            System.out.println(doorArt);
        } else {
            System.out.println("[Door image missing]");
        }
        x.pl("Press Enter to continue");
        x.simpleEnter();
        x.pl("Enter this classroom? Enter yes or no");
        String yOrN = input.nextLine();
        x.pl("");
        if(yOrN.equalsIgnoreCase("yes")){
            x.pl("Good choice. SOMEHOW you've managed to not be late. That's really suprising.");
        }
        else{
            x.pl("Are you stupid? Did you not read your schedule? This is your first class. You're going in.");
        }
        x.simpleEnter();
        x.pl("Press Enter to open the door.");
        x.simpleEnter();
        x.clearScreen();
        String teacherArt = images.getNotSure("Teacher");
        if (teacherArt != null) {
            System.out.println(teacherArt);
        } else {
            System.out.println("[Teacher image missing]");
        }
        x.simpleEnter();
        x.pl("Teacher ^^^^^^^^^");
        x.simpleEnter();
        x.pl("Did you see that that is your teacher^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        x.simpleEnter();
        x.pl("Press Enter for greeting options:");
        x.simpleEnter();
        x.pl("1: This classroom smells HORRIBLE");
        x.p("2: You are WAY too pretty to be a teacher");
        x.pl("");
        x.pl("");
        x.p("Enter 1 or 2: ");
        int choice = input.nextInt();
        if(choice == 1){
            x.pl("");
            x.pl("She says: ");
            x.pl("Thanks. It's me. Anyways, I'm sooooooo excited we have a transfer. I love school.");
            x.simpleEnter();
            x.pl("Press Enter to choose a response:");
            x.simpleEnter();
            x.pl("1: Sniff sniff");
            x.pl("2: Can you tell me what do to do now.");
            x.pl("");
            choice = input.nextInt();
            if(choice == 1){
                x.pl("");
                x.pl("She says (?):");
                x.pl("😲");
                x.simpleEnter();
                x.pl("Please choose a seat.");
            }
            else{
                x.pl("Choose a seat.");
                x.simpleEnter();
            }
        }
        else{
            x.pl("");
            x.pl("She says: ");
            x.pl("Wait. Do you really think so?");
            x.pl("");
            x.pl("Press Enter to choose a response:");
            x.simpleEnter();
            x.pl("1: Yes that's why I said it.");
            x.pl("2: No I lied.");
            x.pl("");
            choice = input.nextInt();
            if(choice == 1){
                x.pl("");
                x.pl("She says: ");
                x.p("Thank you. BTW my name is Ms. Apple. Like the fruit.");
                x.simpleEnter();
                x.pl("Please find a seat and sit down.");
                x.simpleEnter();
            }
            else{
                x.pl("");
                x.pl("She says:");
                x.pl("SIT DOWN");
                x.simpleEnter();
            }
        }
        x.pl("");
        x.pl("Ready to find a chair?");
        x.waitForEnter();
        x.pl("end so far");
    }
}
