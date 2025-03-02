public class ArrayBlocks {
    public static void main(String[] args) {
        Blocks[] blArray = new Blocks[3];

        blArray[0] = new Blocks(100, 30, 12);
        blArray[1] = new Blocks(120, 40, 15);
        blArray[2] = new Blocks(210, 50, 25);

        for (int i = 0; i < blArray.length; i++) {
            System.out.println("Block " + i);
            System.out.println("Volume: " + blArray[i].countVolume());
            System.out.println("Surface Area: " + blArray[i].countArea());
            System.out.println("Perimeter: " + blArray[i].countPerimeter());
            System.out.println();
        }
    }
}
