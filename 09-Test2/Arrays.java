public class Arrays {
    public static boolean arr(int[] arr1, int[] arr2){
        int twoNumArr1 = 0;
        int twoNumArr2 = 0;

        for (int num : arr1){
            if (num >= 10 && num <= 100){
                twoNumArr1 ++;
            }
        }

        for (int num : arr2){
            if (num >= 10 && num <= 100){
                twoNumArr2 ++;
            }
        }

        if (twoNumArr1 == twoNumArr2){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {15,8,2,37,49,117};
        int[] arr2 = {9,6,7,12,48,4,62,90,5};
        System.out.println(arr(arr1, arr2));

    }
}
