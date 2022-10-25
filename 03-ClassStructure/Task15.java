import java.lang.Math;

public class Task15 {
    static int numOfItems(int x, int y){
        return Math.abs(y - x) + 1;
    }

    static int sumOfNumbers(int x, int y){
        return (int) ((x + y) * (numOfItems(x, y) / 2.0));
    }

    static double artMean(int x, int y){
        return (sumOfNumbers(x, y) / (numOfItems(x, y) + 0.0));
    }

    public static void main(String[] args){
        System.out.println(numOfItems(5, 10));
        System.out.println(sumOfNumbers(5, 10));
        System.out.println(artMean(5, 10));
    }
}
