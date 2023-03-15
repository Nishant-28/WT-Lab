// write a code to implement Dynamic Method Dispatch in Java

class A {
    public void show() {
        System.out.println("In A");
    }
}

class B extends A {
    public void show() {
        System.out.println("In B");
    }
}

class C extends A {
    public void show() {
        System.out.println("In C");
    }
}

class D extends A {
    public void show() {
        System.out.println("In D");
    }
}

class hey {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        A ref;

        ref = a;
        ref.show();

        ref = b;
        ref.show();

        ref = c;
        ref.show();

        ref = d;
        ref.show();
    }
}