public class Counter {
    private int counter;
    Counter() {
        this.counter = 0;
    }

    void increase(){
        this.counter ++;
    }

    void increase(int n){
        this.counter += n;
    }

    void decrease(){
        this.counter --;
    }

    void decrease(int n){
        this.counter -= n;
    }

    int value(){
        return this.counter;
    }

    public static void main(String[] args) {
        Counter c = new Counter();
        System.out.println(c.value());
        c.increase();
        c.increase();
        c.decrease();
        c.increase(5);
        c.decrease(2);
        System.out.println(c.value());
    }
}
