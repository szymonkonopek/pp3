class Person{
    String name;
    int weigth;
    int heigth;
    float BMI;
    Person(String name){
        this.name = name;
    }
    
    Person(String name, int weigth, int heigth){
        this.name = name;
        this.weigth = weigth;
        this.heigth = heigth;
    }
    
    void setWeightAndHeight(int new_weight,int new_heigth){
        this.weigth = new_weight;
        this.heigth = new_heigth;
    }
    
    void calculateBMI(){
        this.BMI = this.weigth / ((this.heigth / 100.0f) * (this.heigth / 100.0f));
    }
    
    void displayRecord(){
        System.out.println(this.name);
        System.out.println(this.weigth);
        System.out.println(this.heigth);
        System.out.println(this.BMI);
        if (this.BMI < 18.5f){
            System.out.println("BMI too low!");
        }
        else if (this.BMI > 24.9f){
            System.out.println("BMI too high!");
        }
        else {
            System.out.println("BMI Perfect!");
        }
        System.out.println("================");
    }
    
    public static void main(String[] args){
        Person p1 = new Person("Szymon", 63, 179 );
        Person p2 = new Person("Amelia", 58, 169 );
        Person p3 = new Person("Witkor", 150, 179 );
        
        p1.setWeightAndHeight(64, 179);

        p1.calculateBMI();        
        p2.calculateBMI();
        p3.calculateBMI();

 
        p1.displayRecord();
        p2.displayRecord();
        p3.displayRecord();
    }
    
}