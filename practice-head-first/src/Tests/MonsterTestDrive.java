package Tests;

public class MonsterTestDrive {
    public static void main(String[] args) {
        Monster[] monsters = new Monster[3];
        monsters[0] = new Vampire();
        monsters[1] = new Vampire.Dragon();
        monsters[2] = new Monster();
        for (int i = 0; i < monsters.length; i++) {
            monsters[i].frighten(i);
        }
    }
}

class Monster {

    public boolean frighten(int i) {
        System.out.println("arrrgh");
        return true;
    }
}

class Vampire extends Monster {

    public boolean frighten(int i) {
        System.out.println("a bite?");
        return false;
    }


static class Dragon extends Monster {
    public boolean frighten(int degree) {
        System.out.println("breathe fire");
        return true;
    }

}}
