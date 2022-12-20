import java.util.ArrayList;
import java.util.HashSet;

class Numbers{
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private int num5;

    public Numbers(int num1, int num2, int num3, int num4, int num5) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        this.num5 = num5;
    }

    public boolean different(){
        int[] array = {num1, num2, num3, num4, num5};
        HashSet<Integer> set = new HashSet<Integer>();
        for (int num : array){
            set.add(num);
        }
        if (set.size() == array.length){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Numbers n = new Numbers(1, 2, 2, 4, 5);
        System.out.println(n.different());
    }
}