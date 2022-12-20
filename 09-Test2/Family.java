public class Family {
    private Person[] personArray;

    public Family(Person[] personArray) {
        this.personArray = personArray;
    }
    
    public int adults(){
        int numOfAdults = 0;
        for (Person person : personArray){
            if (person.getAge() >= 18){
                numOfAdults ++;
            }
        }
        return numOfAdults;
    }

    public static void main(String[] args) {
        Person[] personArray = {new Person("Szymon", 18), new Person("Szymon", 8), new Person("Szymon", 19)};
        Family f = new Family(personArray);
        System.out.println(f.adults());
    }
}
