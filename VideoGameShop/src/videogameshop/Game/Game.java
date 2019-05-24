package videogameshop.Game;

import java.util.Date;

abstract public class Game {
    
    protected String id;
    protected String title;
    protected double price;
    protected int stock;
    protected String platform;
    protected Date releaseDate;

    public Game(String id, String title, double price, int stock, 
            String platform, Date releaseDate) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.stock = stock;
        this.platform = platform;
        this.releaseDate = releaseDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "id=" + id + ", title=" + title + ", price=" + price + 
                ", stock=" + stock + ", platform=" + platform + 
                ", releaseDate=" + releaseDate ;
    }
}
