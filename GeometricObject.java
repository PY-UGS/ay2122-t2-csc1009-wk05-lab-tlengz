import java.util.Date;

public class GeometricObject {
    protected String color;
    protected boolean filled;
    private Date dateCreated;

    public GeometricObject(){
        this.color = "white";
        this.filled = false;
        this.dateCreated = new Date();
    }
    public GeometricObject(String colour, boolean filled){
        this.color = colour;
        this.filled = filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public Date getDateCreated(){
        return dateCreated;
    }
    public String toString(){
        return "created on " + this.getDateCreated() + "\ncolor: " + this.getColor() + " and filled: " + this.isFilled();
    }
}
