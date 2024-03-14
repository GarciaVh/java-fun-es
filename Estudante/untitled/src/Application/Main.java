package Application;

import entities.Process;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Process estudante = new Process();

        System.out.println("NOME: ");
        estudante.name = sc.nextLine();
        do {
            System.out.println("Digite Sua 1 nota (limite de 30): ");
            estudante.nota1 = sc.nextDouble();
            if (estudante.nota1 > 30) {
                System.out.println("Nota excede o limite de 30. Tente novamente.");
            }
        } while (estudante.nota1 > 30);

        do {
            System.out.println("Digite Sua 2 nota (limite de 35): ");
            estudante.nota2 = sc.nextDouble();
            if (estudante.nota2 > 35) {
                System.out.println("Nota excede o limite de 35. Tente novamente.");
            }
        } while (estudante.nota2 > 35);

        do {
            System.out.println("Digite Sua 3 nota (limite de 35): ");
            estudante.nota3 = sc.nextDouble();
            if (estudante.nota3 > 35) {
                System.out.println("Nota excede o limite de 35. Tente novamente.");
            }
        } while (estudante.nota3 > 35);
            System.out.printf("FINAL GRADE: %.2f", estudante.calculo());


       if (estudante.calculo() < 60) {
            System.out.println(" FAILED ");
            System.out.printf("MISSING: %.2f", 60 - estudante.calculo());
        } else {
            System.out.println(" PASS :)");

        sc.close();
        }}}