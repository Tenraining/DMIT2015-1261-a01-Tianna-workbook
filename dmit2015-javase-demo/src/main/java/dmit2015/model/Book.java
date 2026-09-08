package dmit2015.model;

public class Book {
    private String title;
    private double price;
    //big decimal for money values


    public Book(String title, double price) {
        if(title == null || title.isBlank()){
            //isblank different than isnullorwhi9tespace
            throw new IllegalArgumentException("Title is required");
        }
        if(price<=0){
            throw new IllegalArgumentException(("Price must be.."));
        }
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
    //not every class needs getters and setters -> imutable may not need it

}
