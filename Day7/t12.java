public class t12 {
    public static void main(String[] args) {
        Child c = new Child();
        c.c1();
        c.c2();
    }
}

interface One {
    public void c1();
}

interface Two {
    public void c2();
}

interface Three extends One, Two {
    public void c1();
}

class Child implements Three {
    @Override
    public void c1() {
        System.out.println("Hello");
    }

    public void c2() {
        System.out.println("World");
    }
}