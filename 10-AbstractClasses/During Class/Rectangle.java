public class Rectangle extends Shape{
    private int a;
    private int b;
    
    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public float area() {
        return a*b;
    }

    @Override
    public float perimeter() {
        return 2 * a + 2 * b;
    }
}
