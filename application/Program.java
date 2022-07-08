package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    /*
    Fazer um programa para ler um número inteiro N e os dados (nome e preço) de N Produtos. Armazene os N produtos em um
    vetor. Em seguida, mostrar o preço médio dos produtos.
     */

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product quantity: ");
        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.print("Enter product name: ");
            String name = sc.nextLine();
            System.out.print("Enter product price: ");
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }

        double avg = sum / vect.length;

        System.out.println();
        System.out.printf("AVERAGE PRICE = %.2f%n", avg);

        sc.close();
    }
}
