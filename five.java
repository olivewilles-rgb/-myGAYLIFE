import java.util.Scanner;
public class five {
    public static void go(){
        
        x.clearScreen();
        TheImages images = new TheImages();
        String t = images.getNotSure("Teach2");
        System.out.print(t);
        
        x.simpleEnter();
        
        x.pl("Teacher?");
        x.simpleEnter();
        x.pl("Yes");
        x.simpleEnter();
        x.pl("Are you asleep?");
        x.simpleEnter();
        x.p("No" );
        x.simpleEnter();
        x.pl("Pop quiz");
        x.simpleEnter();
        x.pl("Ok");
        x.simpleEnter();
        x.clearScreen();
        
        Scanner input = new Scanner(System.in);
        x.pl(Colors.BRIGHT_RED + "EXAM: 2 FRQ 2 MCQ");
        x.simpleEnter();
        x.pl(Colors.ORANGE+ "Question 1:\nDid you study?");
        x.pl("");
        x.p(Colors.YELLOW + "Your answer: ");
        String a1 = input.nextLine();
        x.pl(Colors.BRIGHT_GREEN + "\nQuestion 2:\nWhat's your FAVORITE thing to inspect (no wrong answer)");
        x.pl("");
        x.p(Colors.BLUE + "Your answer: ");
        String a2 = input.nextLine();
        x.pl(Colors.PURPLE + "\nQuestion 3:\nOn the syllabus I clearly outlined one animal we will be dealing with this semester. Which animal?");
        x.pl("");
        x.pl(Colors.BRIGHT_RED + "a: Pig\nb: Cow\nc: Sheep\nd: Idk");
        x.pl("");
        x.p(Colors.ORANGE + "Your answer: ");
        String a3 = input.nextLine();
        x.pl(Colors.YELLOW + "\nQuestion 4:\nMagnifying glass (a) or microscope (b)?");
        x.pl("");
        x.p(Colors.GREEN + "Your answer: ");
        String a4 = input.nextLine();
        x.pl("");
        x.pl(Colors.BLUE + "Exam over. Sign your name and turn it in at the front.");
        x.pl("");
        x.p(Colors.PURPLE + "Your name: ");
        String name = input.nextLine();
        x.pl("Ready to turn your paper in? ");
        x.waitForEnter();
        
        
    }
}
