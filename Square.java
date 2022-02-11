public class Square extends Shape{
    public Square(Double dim1, Double dim2){
        super(dim1,dim2);
    }
    public Double area(){
        System.out.println("Inside Area for Square.");
        return dim1 * dim2;
    }

}
