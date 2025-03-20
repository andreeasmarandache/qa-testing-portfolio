package Tests;

import Objects.A;
import Objects.B;
import Objects.C;

public class Mix2 {
    public static void main (String[] args){
        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();

        //A's m1, A's m2, C's m3, 13

        a.m1();
        b.m2();
        c.m3();

        a2.m1();
        a2.m2();
        a2.m3();

        //B's m1, A's m2, A's m3

        b.m1();
        c.m2();
        a.m3();

        //B's m1, A's m2, C's m3, 13

        c.m1();
        c.m2();
        c.m3();


    }
}
