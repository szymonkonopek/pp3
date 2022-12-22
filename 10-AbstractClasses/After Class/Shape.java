public abstract class Shape{
    public abstract float area();
    public abstract float perimeter();

    public static void main(String[] args) {
        Rectangle r = new Rectangle(2,4);
        Triangle t = new Triangle(3,4,5);
        Circle c = new Circle(5);

        System.out.println("Areas");
        System.out.println(r.area());
        System.out.println(t.area());
        System.out.println(c.area());
        
        System.out.println();

        System.out.println("Perimeters");
        System.out.println(r.perimeter());
        System.out.println(t.perimeter());
        System.out.println(c.perimeter());

    }
}

