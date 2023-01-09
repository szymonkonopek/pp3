class Person {
    String name;
    String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String toString(){
        return (name.toUpperCase().charAt(0) + "") + (surname.toUpperCase().charAt(0) + "");
    }

    public static void main(String[] args) {
        Person p = new Person("Szymon", "Konopek");
        System.out.println(p.toString());
    }
}