import java.util.Scanner;
public class x {
    
    //Variables
    private static int day = 1;
    
    //Variable methods
    public static int printDay(){
        System.out.print("Day " + day);
        return day;
    }
    
    //Text methods
    public static void p(String text){
        System.out.print(text);
    }
    
    public static void pl(String text){
        System.out.println(text);
    }
    
    public static void l(){
        System.out.println();
    }
    
    //Screen methods
    public static void waitForEnter() {
        Scanner input = new Scanner(System.in);
        System.out.println("Press Enter to continue");
        input.nextLine();
    }
    
    public static void simpleEnter(){
        Scanner input = new Scanner(System.in);
        System.out.print("");
        input.nextLine();
    }
    
    public static void noLineEnter(){
        Scanner input = new Scanner(System.in);
        input.nextLine();
    }
    
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
