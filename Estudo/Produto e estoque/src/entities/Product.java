package entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Product {

    private Integer id;
    private String name;
    private BigDecimal price;

    static List<Product> products = new ArrayList<>();

    public Product() {
    }

    public Product(Integer id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public List<Product> getProducts() {
        return products;
    }

     @Override
    public String toString() {
        return  "ID: " + id + " Name: " + name + " Price: $" + String.format("%.2f",price);
    }

    public static void registrarProduto() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite ID que deseja registrar o produto: ");
        Integer id = sc.nextInt();
        while (hasId(products,id)) {
            System.out.println("ID já usado tente outro: ");
            id = sc.nextInt();
        }

        System.out.print("Digite o nome do produto: ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.print("Digite o preço do produto: ");
        BigDecimal price = sc.nextBigDecimal();

        Product pro = new Product(id,name,price);
        products.add(pro);
        System.out.print("Produto registrado com sucesso!");
        Menu.menuProduto();
    }

    public static void removerProduto() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite ID do produto deseja remover da lista:");
        Integer idRemover = sc.nextInt();
        products.removeIf(product -> product.getId().equals(idRemover));

        Menu.menuProduto();
    }

    public static void consultaListaProduto () {
        System.out.println();
        System.out.println("Lista de produtos registrados: ");
        for (Product pro : products) {
            System.out.println(pro);
        }
        Menu.menuProduto();
    }

    public static boolean hasId(List<Product>list,Integer id) {
        Product pro = list.stream().filter(x -> x.getId().equals(id)).findFirst().orElse(null);
        return pro != null;
    }
}

