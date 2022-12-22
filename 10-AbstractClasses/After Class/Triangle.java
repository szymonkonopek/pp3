public class Triangle extends Shape{
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public float area() {
        float p = (a + b + c)/2;
        float s = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;        
    }

    @Override
    public float perimeter() {
        return a + b + c;
    }
}
