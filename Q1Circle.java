public class Q1Circle extends GeometricObject{
    private Double radius;

    public Q1Circle(){
        super();
    }
    public Q1Circle(Double radius){
        super();
        this.radius = radius;
    }
    public Q1Circle(Double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    public Double getRadius(){
        return radius;
    }
    public void setRadius(Double radius){
        this.radius = radius;

    }
    public Double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
    public Double getPerimeter(){
        return Math.PI * (2 * radius);

    }
    public Double getDiameter(){
        return radius * 2;

    }
    public void printCircle(){
        System.out.print("The color is " + this.getColor() + "\nThe radius is " + this.getRadius() + "\nThe area is " + this.getArea() + "\nThe diameter is " + this.getDiameter());
    }
}
