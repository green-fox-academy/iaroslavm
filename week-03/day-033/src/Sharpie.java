public class Sharpie {
    int inkAmount = 2;
    String color;
    float width;

    public Sharpie(String color, float width) {
        this.color = color;
        this.width = width;
    }

    void use() {
        inkAmount--;
    }
}
