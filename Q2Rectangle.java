public class Q2Rectangle extends Shape{
    public Q2Rectangle(Double dim1, Double dim2){
        super(dim1,dim2);
    }
    public Double area(){
        System.out.println("Inside Area for Rectangle.");
        return dim1 * dim2;
    }
}
