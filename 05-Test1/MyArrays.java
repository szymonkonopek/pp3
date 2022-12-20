public class MyArrays {
    public static int even(int[] array){
        int evenNums = 0;
        for (int num : array){
            if (num % 2 == 0){
                evenNums ++;
            }
        }
        return evenNums;
    }

    static int positiveOdd(int[] array){
        int oddNums = 0;
        for (int num : array){
            if (num % 2 != 0 && num > 0){
                oddNums ++;
            }
        }
        return oddNums;
    }

    public static void main(String[] args){
        System.out.println(MyArrays.even(new int[] {2,-6,5,8}));
        System.out.println(MyArrays.even(new int[] {3,2,-5,4,1,-7}));
    }
}

