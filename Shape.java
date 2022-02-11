public abstract class Shape {
    protected Double dim1;
    protected Double dim2;
    protected final Double PI = 3.14;

    public Shape(Double dim1, Double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    public abstract Double area();

    public static void main(String[] args){
        Q2Rectangle r = new Q2Rectangle(9.0, 5.0);
        Triangle t = new Triangle(10.0, 8.0);
        Q2Circle c = new Q2Circle(5.0, 5.0);
        Ellipse e = new Ellipse(7.0, 7.0);
        Square s = new Square(6.0, 6.0);
        Shape figref;
        figref = r;
        System.out.println("Area is " + figref.area());
        figref = t;
        System.out.println("Area is " + figref.area());
        figref = c;
        System.out.println("Area is " + String.format("%.1f", figref.area()));
        figref = e;
        System.out.println("Area is " + String.format("%.2f", figref.area()));
        figref = s;
        System.out.println("Area is " + figref.area());

    }
}
