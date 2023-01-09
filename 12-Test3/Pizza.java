public class Pizza extends Food implements Extra{
    int size;

    public Pizza(String name, int size) {
        super(name);
        this.size = size;
    }


    public void setPrice(){
        super.price = size - 10;
    }

    public float discount(){
        if (size >= 30){return 0.05f;}
        return 0;
    }

    public float delivery(){
        if (size >= 50){
            return 8;
        }
        return 6;
    }

    public float delivery(int tip){
        return delivery() + tip;
    }
    
    public String getName(){
        return name;
    }

    public float getPrice(){
        return super.price;
    }

    public void setPrice(float newPrice){
        super.price = newPrice;
    }
}

