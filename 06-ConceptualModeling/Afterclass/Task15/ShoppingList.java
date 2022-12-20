import java.util.ArrayList;


public class ShoppingList{
    private ArrayList<String> products = new ArrayList<String>();

    void displayList(){
        System.out.println("Shopping list:");
        for (String product : products){
            System.out.println("Product name : " + product);
        }
    }

    void displayNumOfProducts(){
        System.out.println("Number of products to be purchased : " + products.size());
    }

    void addProduct(String product){
        products.add(product);
    }

    public static void main(String[] args) {
        ShoppingList s = new ShoppingList();
        s.displayList();
        s.displayNumOfProducts();
        s.addProduct("apple");
        s.addProduct("melon");
        s.addProduct("peach");
        s.displayList();
        s.displayNumOfProducts();
        s.addProduct("pear");
        s.displayList();
        s.displayNumOfProducts();
    }
}