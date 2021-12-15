package pl.akademia108;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Wprowadź swoje imię:");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();

        System.out.println("Wprowadź swoje nazwisko:");
        String lastName = scan.next();

        System.out.println("Witaj " + name + " " + lastName + " w świecie Java");
        scan.close();



    }
}
