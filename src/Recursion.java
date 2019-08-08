public class Recursion {
    public static void main(String[] args) {
        f(1);
        System.out.println("End");
    }

    private static void f(int k) {
        System.out.println(k);
        if (k < 7) {
            f(2 * k);
        }
    }
}

class Recursion1 {
    public static void main(String[] args) {
        f(1);
        System.out.println("End");
    }

    private static void f(int k) {
        if (k < 7) {
            f(2 * k);
        }
        System.out.println(k);
    }
}


class Recursion3 {
    public static void main(String[] args) {
        recur(99);
    }

    static void recur(int a) {
        if (a<=100) {
            System.out.println("a= " + a);
            recur(++a);
            System.out.println("a= " + a);
        }
    }
}





