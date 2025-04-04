package mapPackage;

import java.util.ArrayList;
import java.util.Random;

public class mapClass {
    Random r = new Random();

    private int[][] map;
    private int size, loup, orque, dragonnet, posPlayerX=0, posPlayerY=0;

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
        map[0][0] = 0;
        for (int i = 0; i < loup; i++) {
            placeMonstre(2);
        }
        for (int i = 0; i < dragonnet; i++) {
            placeMonstre(3);
        }
        for (int i = 0; i < orque; i++) {
            placeMonstre(4);
        }
    }

    private void placeMonstre(int entity) {
        int r1 = r.nextInt(size);
        int r2 = r.nextInt(size);
        while (map[r1][r2] != 1 || (r1==1 && r2==0) || (r1==0 && r2==1)) {
            r1 = r.nextInt(size);
            r2 = r.nextInt(size);
        }
        map[r1][r2] = entity;
    }


    public void printMap() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(map[i][j] + "  ");
            }
            System.out.println("");
        }
    }

    public int getEntity(int x, int y) {
        try {
            return map[y][x];
        } catch (Exception e) {
            return 1;
        }
    }

    public boolean movePosPlayer(int x, int y) {
        try {
            if (map[posPlayerY + y][posPlayerX + x] == 1) {
                map[posPlayerY][posPlayerX] = 1;
                posPlayerX += x;
                posPlayerY += y;
                map[posPlayerY][posPlayerX] = 0;
                return true;
            } else {
                System.out.println("le joueur ne peut pas aller a cette position");
                return false;
            }
        } catch (Exception e) {
            System.out.println("le joueur ne peut pas aller a cette position");
            return false;
        }
    }

    public ArrayList<Integer> getMonster() {
        ArrayList<Integer> monsterNear = new ArrayList<>();
        if ((posPlayerX)<size && getEntity(posPlayerX+1, posPlayerY) != 1) {
            monsterNear.add(getEntity(posPlayerX+1, posPlayerY));
        }
        if ((posPlayerX-1)>=0 && getEntity(posPlayerX-1, posPlayerY) != 1) {
            monsterNear.add(getEntity(posPlayerX-1, posPlayerY));
        }
        if ((posPlayerY-1)>=0 && getEntity(posPlayerX, posPlayerY-1) != 1) {
            monsterNear.add(getEntity(posPlayerX, posPlayerY-1));
        }
        if ((posPlayerY+1)<size && getEntity(posPlayerX, posPlayerY+1) != 1) {
            monsterNear.add(getEntity(posPlayerX, posPlayerY+1));
        }
        return monsterNear;
    }

    public void setclean(int x, int y) {
        map[y][x] = 1;
    }

    public void setcleanaround() {
        if ((posPlayerX)<size && getEntity(posPlayerX+1, posPlayerY) != 1) {
            setclean(posPlayerX+1, posPlayerY);
        }
        if ((posPlayerX-1)>=0 && getEntity(posPlayerX-1, posPlayerY) != 1) {
            setclean(posPlayerX-1, posPlayerY);
        }
        if ((posPlayerY-1)>=0 && getEntity(posPlayerX, posPlayerY-1) != 1) {
            setclean(posPlayerX, posPlayerY-1);
        }
        if ((posPlayerY+1)<size && getEntity(posPlayerX, posPlayerY+1) != 1) {
           setclean(posPlayerX, posPlayerY+1);
        }
    }

    public void checkmap() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (!(map[i][j] == 1 || map[i][j] == 0)) {
                    return;
                }
            }
        }
        System.out.println("VICTOIIIRE!! tous les monstres sont morts!");
        System.exit(0);
    }
}
