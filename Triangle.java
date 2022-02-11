public class Triangle extends Shape {
    public Triangle(Double dim1, Double dim2){
        super(dim1,dim2);
    }
    public Double area(){
        System.out.println("Inside Area for Triangle.");
        return 0.5 * dim1 * dim2;
    }
}
