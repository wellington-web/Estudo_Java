package entities;

import java.util.Scanner;

public class Menu {

    public static void menuPrincipal() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Controle de estoque");
        System.out.println();

        System.out.println("[1] Produto");
        System.out.println("[2] Estoque");
        System.out.println("[3] Consultar estoque");
        System.out.println("[4] Finalizar programa");

        int menu;
        do {
            System.out.println("Digite o que deseja realizar: ");
            menu = sc.nextInt();
            if (menu <= 0 || menu >= 5) {
                System.out.println("Número inválido, tente novamente");
            }
        } while (menu <= 0 || menu >= 5);
        if (menu == 1) {
            menuProduto();
        }
        if (menu == 2) {
        }
        if (menu == 3) {
        }
        if (menu == 4) {
        }
    }

    public static void menuProduto () {

        Scanner sc = new Scanner(System.in);

        System.out.println("Produto");

        System.out.println("[1] Registrar produto");
        System.out.println("[2] Tirar registro do produto");
        System.out.println("[3] Consultar lista de produtos");
        System.out.println("[4] Voltar");

        int menu;
        do {
            System.out.println("Digite o que deseja realizar: ");
            menu = sc.nextInt();
            if (menu <= 0 || menu >= 5) {
                System.out.println("Número inválido, tente novamente");
            }
        } while (menu <= 0 || menu >= 5);
        if (menu == 1) {
            Product.addProduto();
        }
        if (menu == 2) {
        }
        if (menu == 3) {
        }
        if (menu == 4) {
            menuPrincipal();
        }

    }
}
