public class Blocks {
    public int length;
    public int width;
    public int height;

    public Blocks(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int countVolume() {
        return length * width * height;
    }

    public int countArea() {
        return 2 * ((length * width) + (width * height) + (length * height));
    }

    public int countPerimeter() {
        return 4 * (length + width + height);
    }
}
