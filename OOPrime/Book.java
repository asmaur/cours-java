package OOPrime;

public class Book {
    private String title;
    private double price;
    private int quantity;
    private Author[] author;

    Book(String title, Author[] author, double price){
        this.title = title;
        this.price = price;
        this.author = author;
    }
    Book(String title, Author[] author){
        this.title = title;
        this.author = author;
        this.quantity = 0;
        //this.price = 0;
    }

    public String getTitle() {
        return this.title;
    }

    

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getAuthors() {
        String allAuthors = "";
        for (Author auth : author) {
            allAuthors += auth.toString();
        }
        return allAuthors;
        
    }
    /**public String getAuthorName(){
        return author.getName();
    }
    public String getAuthorEmail(){
        return author.getEmail();
    }
    public char getAuthorGender(){
        return author.getGender();
    } */

    public String toString() {
        return "Book[title="+getTitle()+" authors={"+getAuthors()+" }"+" price="+getPrice()+" quantity="+getQuantity()+"]";
    }   

    
    
}
