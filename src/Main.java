import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product chocolate = new Product("шоколад Nuts",276.66);
        Product chips = new Product("чипсы Lays",288.37);
        Product sausage = new Product("Колбаса Докторская",970.21);
        Product cheese = new Product("Сыр Cheddar",360.40);
        Product.listProduct.add(chips);
        Product.listProduct.add(chocolate);
        Product.listProduct.add(chips);
        Product.listProduct.add(chips);
        Product.listProduct.add(cheese);
        Product.listProduct.add(cheese);
        Product.listProduct.add(chocolate);
        Product.listProduct.add(cheese);
        Product.listProduct.add(sausage);
        Product.listProduct.add(cheese);
        sausage.getPrice();
        cheese.setName("Сыр Peddar");
        Vending.fillWending();





    }
}