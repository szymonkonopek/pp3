class Lamp{
    Boolean is_on;

    Lamp(Boolean is_on){
        this.is_on = is_on;
    }

    void change_state(Boolean state){
        this.is_on = state;
    }

    String get_current_state(){
        return (this.is_on ? "Lamp is switched ON" : "Lamp is switched OFF");
    }
}

class Task15{   
    public static void main(String[] args){
        Lamp lamp1 = new Lamp(true);
        Lamp lamp2 = new Lamp(false);

        System.out.println("Lamp 1");
        lamp1.change_state(false);
        System.out.println(lamp1.get_current_state());

        System.out.println("Lamp 2");
        lamp2.change_state(true);
        System.out.println(lamp2.get_current_state());
    }
}
