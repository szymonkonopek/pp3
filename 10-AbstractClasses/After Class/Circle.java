public class Circle extends Shape {
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public float area() {
        return (float) (Math.PI * r * r);
    }

    @Override
    public float perimeter() {
        return (float) (2 * Math.PI * r);
    }

    
}
