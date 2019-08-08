package inheritance;

public class Inheritance {
}

 class Parent {
	int x = 2;
	public void print() { System.out.println(x); }
}

 class Child extends Parent {
	int x = 3;
	public static void main(String s[]) {
		new Child().print();
	}
}


 class Parent1 {
	int x = 2;
	public void print() { System.out.println(x); }
}

 class Child1 extends Parent1 {
	int x = 3;
	public void print() { System.out.println(x); }
	public static void main(String s[]) {
		new Child1().print();
	}
}



class First {
    int value = 3;

    void addFive() {
        value += 5;
        System.out.println("first");
    }
}

class Second extends First {
    int value = 2;

    void addFive() {
        value += 5;
        System.out.println("first");
    }

    public static void main(String[] args) {
        First f = new Second();
        f.addFive();
        System.out.println(f.value);
    }
}


