public class Product {
    String productName;
    Boolean isVegetarian;

    Product (String productName, Boolean isVegetarian){
        this.productName = productName;
        this.isVegetarian = isVegetarian;
    }

    void setProductName(String newProductName){
        this.productName = newProductName;
    }

    void setIsVegetarian(Boolean newIsVegetarian){
        this.isVegetarian = newIsVegetarian;
    }

    String getProductName(){
        return this.productName;
    }

    Boolean getIsVegetarian(){
        return this.isVegetarian;
    }
}
