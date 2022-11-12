class Person{
    private String name;
    private int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void setAge(int newAge){
        this.age = newAge;
    }

    void setName(String newName){
        this.name = newName;
    }

    int getAge(){
        return this.age;
    }

    String getName(){
        return this.name;
    }

    boolean isAdult(){
        return this.age >= 18 ? true : false;
    }

    public String toString(){
        return this.name + "," + this.age;
    }

    public static void main(String[] args){
        Person p = new Person("Anna", 21);
        System.out.println(p.getAge());
        System.out.println(p.isAdult());
        p.setAge(17);
        System.out.println(p.isAdult());
        System.out.println(p.toString());
    }
}