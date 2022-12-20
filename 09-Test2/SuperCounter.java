public class SuperCounter extends Counter {

    public SuperCounter(int initCount) {
        super(initCount);
    }

    public void addN(int n){
        for (int i = 0; i < n; i++){
            add1();
        }
    }
    public static void main(String[] args) {
        SuperCounter sc = new SuperCounter(0);
        sc.addN(10);
        System.out.println(sc.getCounter());
    }
}
