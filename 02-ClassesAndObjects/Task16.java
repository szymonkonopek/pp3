import java.util.*; 

class Rectangle{
    int x;
    int y;

    Rectangle(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    int get_perimiter(){
        return 2 * this.x + 2 * this.y;
    }

    int[] get_dimensions(){
        return new int[] {this.x, this.y};
    }

    int get_surface_area(){
        return this.x * this.y;
    }

}

class Task16{   
    public static void main(String[] args){
        Rectangle rect1 = new Rectangle(3,4);
        Rectangle rect2 = new Rectangle(2,7);

        System.out.println("Rect 1");
        System.out.println(rect1.get_perimiter());
        System.out.println(Arrays.toString(rect1.get_dimensions()));
        System.out.println(rect1.get_surface_area());

        System.out.println("Rect 2");
        System.out.println(rect2.get_perimiter());
        System.out.println(Arrays.toString(rect2.get_dimensions()));
        System.out.println(rect2.get_surface_area());
    }
}
