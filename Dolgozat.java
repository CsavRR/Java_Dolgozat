import java.util.Scanner;

public class Dolgozat {
    static void main() {
        System.out.println("1. feladat");
        Scanner sc = new Scanner(System.in);
        System.out.print("Adjon meg egy nevet: ");
        String name = sc.nextLine();
        int num1 = 0;
        while (num1 <= 1 || num1 >= 10){
            System.out.print("Adjon meg egy számot 1 és 10 között: ");
            num1 = sc.nextInt();
        }
        int num2 = 0;
        while (num2 < 10 || num2 > 90){
            System.out.print("Adjon meg egy számot 10 és 90 között: ");
            num2 = sc.nextInt();
        }
        System.out.println("Hello " + name + "!");

        System.out.println("2. feladat");
        double korTerulet = Math.pow(num1, 2) * Math.PI;
        String korTeruletStr = "" + korTerulet;
        System.out.println("The circle area: " + korTeruletStr.substring(0, korTeruletStr.indexOf('.')) + korTeruletStr.substring(korTeruletStr.indexOf('.'), korTeruletStr.indexOf('.') + 3) + ", rounded area: " + Math.round(korTerulet));

        System.out.println("3. feladat");
        if (num2 < 10 || num2 > 90){
            System.out.println("A szám nem helyes.");
        }
        if (num2 % 3 == 0 && num2 % 5 == 0){
            System.out.println("FizzBuzz");
        } else if (num2 % 3 == 0){
            System.out.println("Fizz");
        } else if (num2 % 5 == 0){
            System.out.println("Buzz");
        } else {
            System.out.println(num2);
        }

        System.out.println("4. feladat");
        if (num1 < 1 || num1 > 10){
            System.out.println("A szám téves.");
        }
        int osztok = 0;
        String osztokStr = "";
        for (int i = 1; i < num1 + 1; i++){
            if (num1 % i == 0){
                osztok++;
                if (i != 1 && i != num1) {
                    osztokStr += (i + ", ");
                }
            }
        }
        if (osztok == 2){
            System.out.println(num1 + " is prime");
        } else {
            System.out.println(num1 + " is not prime; it is divisible by " + osztokStr);
        }
    }
}
