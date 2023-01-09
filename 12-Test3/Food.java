public abstract class Food {
    String name;
    float price;

    public Food(String name) {
        this.name = name;
    }

    public abstract void setPrice();
    public abstract void setPrice(float price);
    public abstract float getPrice();
    public abstract String getName();   
}
