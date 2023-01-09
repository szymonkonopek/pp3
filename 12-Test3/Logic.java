public class Logic {
    Boolean[] array;

    public Logic(Boolean[] array) {
        this.array = array;
    }

    public int opposite(){
        int numberOppo = 0;
        for (int i = 0; i < array.length - 2; i++ ){
            if (array[i] == array[i+2]){
                numberOppo ++;
            }
        }
        return numberOppo;
    }

    public static void main(String[] args) {
        Logic l = new Logic(new Boolean[]{true,false,false});
        Logic l2 = new Logic(new Boolean[]{true,false,true,true,false,true,false,true,false});
        System.out.println(l.opposite());
        System.out.println(l2.opposite());
    }
}
