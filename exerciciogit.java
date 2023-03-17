package ExercicioGit;

import java.util.Scanner;

public class exerciciogit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro numero: ");
            int num1 = scan.nextInt();

        } catch (Exception e) {
            System.out.println("Usuario Digitou letra");

        }
        try {
            System.out.println("Digite o segundo numero: ");
            int num2 = scan.nextInt();
        } catch (Exception e) {
            System.out.println("Usuario Digitou letra");
        }
    }

}
