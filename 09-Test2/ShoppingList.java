import java.util.ArrayList;

public class ShoppingList {
    private ArrayList<Product> productList = new ArrayList<Product>();

    public void add(Product product){
        this.productList.add(product);
    }

    public String toString(){
        String returnString = "";
        for (Product prodcut : productList){
            returnString += ",";
            returnString += prodcut.getName();
        }
        return returnString.substring(1);
        
    }

    public int total(){
        int totalProducts= 0;
        for (Product product : productList){
            totalProducts += product.getQuantity();
        }
        return totalProducts;
    }

    public static void main(String[] args) {
        Product p1 = new Product("Milk", 1);
        Product p2 = new Product("Milk", 4);
        Product p3 = new Product("Milk", 5);

        ShoppingList s = new ShoppingList();
        s.add(p1);
        s.add(p2);
        s.add(p3);

        System.out.println(s.toString());
        System.out.println(s.total());
    }
}
