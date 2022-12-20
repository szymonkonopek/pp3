public class Product {
    String productName;
    Boolean isVegetarian;
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public Boolean getIsVegetarian() {
        return isVegetarian;
    }
    public void setIsVegetarian(Boolean isVegetarian) {
        this.isVegetarian = isVegetarian;
    }
    public Product(String productName, Boolean isVegetarian) {
        this.productName = productName;
        this.isVegetarian = isVegetarian;
    }
}
