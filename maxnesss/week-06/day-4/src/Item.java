public class Item {
    private String name;
    private String description;
    private String price;
    private String qty;

    public Item(String name, String description, String price, String qty) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }

    public String getQty() {
        return qty;
    }
}
