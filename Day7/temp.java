import java.io.*;

public class temp extends c2 {
    public static void main(String[] args) {
        // c1 c1_obj = new c2();
        c2.func();
    }
}

 class c1 {
    c1() {
        System.out.println("c1 constructor");
    }

    void func() {
        System.out.println("c1 func called");
    }
}

abstract class c2 {
    c2() {
        System.out.println("c2 constructor");
    }

    static void func() {
        System.out.println("c2 func called");
    }
}
