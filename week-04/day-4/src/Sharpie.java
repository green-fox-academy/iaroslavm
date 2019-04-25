public class Sharpie {
    int inkAmount = 2;
    String color;
    int width;

    public Sharpie(String color, int width) {
        this.color = color;
        this.width = width;
    }

    public int getInkAmount() {
        return inkAmount;
    }

    public String getColor() {
        return color;
    }

    public int getWidth() {
        return width;
    }

    void use() {
        inkAmount--;
    }
}
