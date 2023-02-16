import java.util.*;

public class Vending {
    private static List<String> listProduct = new ArrayList<>();
    private static Map<Product, Integer> listVending = new HashMap<Product, Integer>();

    public Vending(List<String> listProduct) {
        this.listProduct = listProduct;
    }

    public List<String> getListProduct() {
        return listProduct;
    }

    static public List<String> getInfo() {
        return listProduct;
    }

    static public Map<Product, Integer> getThat() {
        return listVending;
    }


    public void setListProduct(List<String> listProduct) {
        this.listProduct = listProduct;
    }

    public String toString() {
        return listVending.toString();
    }

    static void fillWending() {
        int count = 1;
        for (Product it : Product.listProduct) {
            if (listVending.containsKey(it)) {
                count = listVending.get(it);
                count++;
                listVending.put(it, count);
            } else {
                count = 1;
                listVending.put(it, count);
            }
        }
        for (Map.Entry test: listVending.entrySet()
        ) {
            System.out.println(test);

        }

    }


}
