package dmit2015.model;

public class Rectangle {

    //P=2(l+w)

    private double length;
    private double width;

    public Rectangle(int i, int i1) {
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //Define a no-argument constructor

    public Rectangle() {
        width=1;
        length=1;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //Define an instance level to return the area of this circle
    public double perimeter() {
        return 2 * (length + width);
    }

    static void main(String[] args){
        // Create a new circle
        Rectangle currentRectangle = new Rectangle();
        //Change the radius circle to 5
        currentRectangle.setLength(5);
        currentRectangle.setWidth(5);
        //Print a message with the Radius and Area of the current circle
        System.out.printf("Length: %.2f, Width: %.2f, Perimeter = %.2f\n",
                currentRectangle.getLength(),
                currentRectangle.getWidth(),
                currentRectangle.perimeter());
    }


}

