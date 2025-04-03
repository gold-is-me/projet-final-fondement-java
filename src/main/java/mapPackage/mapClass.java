package mapPackage;

public class mapClass {
    private int[][] map;
    private int size, loup, orque, dragonnet;

    public mapClass(int size, int loup, int orque, int dragonnet) {
        this.size = size;
        this.loup = loup;
        this.orque = orque;
        this.dragonnet = dragonnet;
        this.map = new int[size][size];
        generateMap();
    }

    private void generateMap() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                map[i][j] = 1;
            }
        }
    }

    public void printMap() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

}
