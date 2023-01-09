public class Number {
    int system;
    String value;

    public Number(int system, String value) {
        this.system = system;
        this.value = value;
    }

    int get10(){
        int sum = 0;
        int i = value.length() - 1;
        for (char c : value.toCharArray()){
            int intVal = Integer.parseInt(c + "");
            if (intVal >= system){return -1;}

            sum += (int)Math.pow(system, i) * intVal;
            i --;
        }
        return sum;
    }

    public static void main(String[] args) {
        Number n = new Number(5, "101");
        System.out.println(n.get10());
        Number n2 = new Number(8 , "10283");
        System.out.println(n2.get10());
    }
}
