public class t6 {
    public static void main(String[] args) {
        Three g = new Three();
        g.one();
        g.two();
        g.three();
    }
}

class One {
    public void one() {
        System.out.println("one");
    }
}

class Two extends One {
    public void two() {
        System.out.println("two");
    }
}

class Three extends Two {
    public void three() {
        System.out.println("three");
    }
}