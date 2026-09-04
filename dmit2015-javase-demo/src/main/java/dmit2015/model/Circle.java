package dmit2015.model;

public class Circle {
    //define a field to store the radius
    private double radius;

    //Define getters/setters for data fields

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        //Throw RunTimeException(unchecked exception) if the radius is 0 or less
        if(radius <= 0){
            throw new IllegalArgumentException("radius must be a positive non zero number");
        }
        this.radius = radius;
    }
    //Define an no-argument constructor

    public Circle() {
        radius = 1;
    }
    //Define a constructor to create a circle with a specific radius
    public Circle(double radius){
        setRadius(radius);
    }
    //Define an instance level to return the area of this circle
    public double area(){
        return Math.PI * radius * radius;
    }
    //perimeter
    public double perimeter(){
        return 2 * Math.PI * radius;
    }
    //diameter
    public double diameter(){
        return 2 * radius;
    }

    static void main(String[] args){
        // Create a new circle
        Circle currentCircle = new Circle();
        //Change the radius circle to 5
        currentCircle.setRadius(5);
        //Print a message with the Radius and Area of the current circle
        System.out.printf("Radius: %.2f, Area = %.2f\n",
                currentCircle.getRadius(),
                currentCircle.area());
    }
}

