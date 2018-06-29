package Accessories;

public class SheetMusic extends Accessory{

    private String author;
    private String title;

    public SheetMusic(String brand, Double boughtPrice, Double sellPrice, String author, String title) {
        super(brand, boughtPrice, sellPrice);
        this.author = author;
        this.title = title;

    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}
