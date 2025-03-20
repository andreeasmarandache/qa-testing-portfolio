package Tests;

//public class TestBoats {
//    public static void main(String [] args){
//        Boat b1 = new Boat();
//        Sailboat b2 = new Sailboat();
//        Rowboat b3 = new Rowboat();
//
//        b2.setLength(32);
//        b1.rowTheBoat();
//        b3.rowTheBoat();
//    }
//}
//
//class Boat {
//    public void rowTheBoat () {
//        System.out.print("drift drift");
//    }
//}
//
//class Rowboat extends Sailboat {
//    public void rowTheBoat () {
//        System.out.print(" hoist sail");
//    }
//}
//
//class Sailboat {
//    private int length;
//    public void setLength(int len){
//        length = len;
//    }
//
//    public int getLength() {
//        return length;
//    }
//
//    public void move(){
//        System.out.print("stroke natasha");
//    }
//
//}

public class TestBoats {
    public static void main(String[] args){
        Boat b1 = new Boat();
        Sailboat b2 = new Sailboat();
        Rowboat b3 = new Rowboat();
        b2.setLength(32);
        b1.move();
        b3.move();
        b2.move();
    }
}

class Rowboat extends Boat {
    public void rowTheBoat() {
        System.out.print("stroke natasha");
    }
}
class Boat {
    private int length ;
    public void setLength ( int len ) {
        length = len;
    }
    public int getLength() {
        return length ;
    }
    public void move() {
        System.out.print("drift ");
    }
}

class Sailboat extends Boat {
    public void move() {
        System.out.print("hoist sail ");
    }
}
