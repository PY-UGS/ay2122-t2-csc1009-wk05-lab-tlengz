public class Q1Rectangle extends GeometricObject{
    private Double width;
    private Double height;

    public Q1Rectangle(){
        super();
    }
    public Q1Rectangle(Double width, Double height){
        super();
        this.width = width;
        this.height = height;
    }
    public Q1Rectangle(Double width, Double height, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.height = height;

    }
    public Double getWidth(){
        return width;   
    }
    public void setWidth(Double width){
        this.width = width;
    }
    public Double getHeight(){
        return height;
    }
    public void setHeight(Double height){
        this.height = height;
    }
    public Double getArea(){
        Double area = height * width;
        return area;
    }
    public Double getPerimeter(){
        Double perimeter = 2 * (height+width);
        return perimeter;
    }
    public void printRectangle(){
        System.out.print("The area is " + this.getArea() + "\nThe perimeter is " + this.getPerimeter());
    }

}
