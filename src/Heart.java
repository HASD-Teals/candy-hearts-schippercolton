import java.util.*;

public class Heart {
    // PROPERTIES
    private String color;
    private int size;
    private String sayings;
    private int calories;
    private double costPerPound;
    private boolean available;
    private int stock;


    // CONSTRUCTORS
    public Heart() {
        this.setColor("");
        this.setSize(0);
        this.setSayings("");
        this.setCalories(0);
        this.setCostPerPound(0);
        this.setAvailable(false);
        this.setStock(0);
    } 

    

    public Heart(String color, int size, String sayings, int calories, double costPerPound, boolean available, int stock) {
        this.setColor(color);
        this.setSize(size);
        this.setSayings(sayings);
        this.setCalories(calories);
        this.setCostPerPound(costPerPound);
        this.setAvailable(available);
        this.setStock(stock);
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public double getCostPerPound() {
        return costPerPound;
    }

    public void setCostPerPound(double costPerPound) {
        this.costPerPound = costPerPound;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getSayings() {
        return sayings;
    }

    public void setSayings(String sayings) {
        this.sayings = sayings;
    }

    public String getReport() {
        return this.color + "\n" + this.size + "\n" + this.sayings + "\n"
         + this.costPerPound + "\n" + this.available + "\n" + this.stock; 
    }

    public void adjPrice(double percentage) {
        if(percentage > 1) {
            this.costPerPound *= percentage;
        }
        if (percentage > 0 && percentage < 1) {
            this.costPerPound *= (1.0 + percentage);
        }
    }

    public static int buyOut(Heart[] arr) {
        return (Arrays.stream(arr).mapToInt(Heart::getStock).sum());
    }

    public static double placeOrder(Heart[] arr, String color, int num) {
        return (Arrays.stream(arr).filter(Hrt -> Hrt.getColor().toLowerCase().equals(color)).mapToDouble(Heart::getCostPerPound).sum()) * num;
    }

    public void adjStock(int num) {
        if(this.stock >= num )
            this.stock += num;
    } 

    public void inStock() {
        if(this.stock > 0) {
            this.available = true;
        } else {
            this.available = false;
        }
    }
}
