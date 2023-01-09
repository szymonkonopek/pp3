public class Numbers implements Ok{

    int[] array;

    public Numbers(int[] array) {
        this.array = array;
    }

    public boolean ok(){
        for (int i = 0; i < array.length; i++){
            if (( array[i] % 2 ) != ( i % 2 )){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] myArr = {6,7,6,1,4};
        Numbers n = new Numbers(myArr);
        System.out.println(n.ok());
        
        int[] myArr2 = {2,5,2,8,4};
        Numbers n2 = new Numbers(myArr2);
        System.out.println(n2.ok());
    }
}
