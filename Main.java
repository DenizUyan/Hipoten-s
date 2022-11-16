import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);
        double uzunkenar, kisakenar, hipotenus;

        System.out.print("Uzun Kenari Gir:");
        uzunkenar = girdi.nextDouble();

        System.out.print("Kısa Kenari Gir: ");
        kisakenar = girdi.nextDouble();

        hipotenus = Math.sqrt((uzunkenar*uzunkenar)+(kisakenar*kisakenar));

        System.out.println("Hipotenus =" + hipotenus);


        // Alan Hesaplama

        
    }

}