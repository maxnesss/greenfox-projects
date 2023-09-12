package harrypotter;

public abstract class Book {
    private String title;
    private double price;

    public Book(String title) {
        this.title = title;
        this.price = 8.5;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}
