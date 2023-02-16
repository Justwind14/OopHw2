import java.util.ArrayList;
import java.util.List;

public class Product{
    private String name;
    private double price;
    static List<Product> listProduct = new ArrayList<>();
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        listProduct.add(this);
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public List<Product> getListProduct() {
        return listProduct;
    }

    public void setListProduct(List<Product> listProduct) {
        this.listProduct = listProduct;
    }

    public void getInfo(){
        System.out.println("Товар: "+name+". Цена: "+price+"руб.");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Product> getList(){
        return listProduct;
    }

    @Override
    public String toString() {
        return "Товар: "+name+". Цена: "+price+"руб. Количество ";
    }

}