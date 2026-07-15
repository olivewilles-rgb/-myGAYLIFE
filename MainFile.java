import java.util.Scanner;
public class MainFile{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print(Colors.RED + "#myGAYLIFE by Olive Willes");
        x.l();
        TheImages images = new TheImages();
        String flagArt = images.getNotSure("Flag");
        if (flagArt != null) {
            System.out.print(flagArt);
        } else {
            System.out.println("[Flag image missing]");
        }
        x.p("Press Enter to play ");
        x.simpleEnter();
        one.go();
    }
}
