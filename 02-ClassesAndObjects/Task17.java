class Counter{
    int time;
    int initial_time;

    Counter(int time){
        this.time = time;
        this.initial_time = time;

    }

    void increase_by_1(){
        this.time += 1;
    }

    void increase_by_10(){
        this.time += 10;
    }

    void decrease_by_1(){
        this.time -= 1;
    }

    void decrease_by_10(){
        this.time -= 10;
    }

    void reset(){
        this.time = this.initial_time;
    }
}

public class Task17 {
    public static void main (String args[]){
        Counter counter1 = new Counter(23);
        Counter counter2 = new Counter(-47);

        System.out.println(counter1.time);
        System.out.println(counter2.time);
    }
}
