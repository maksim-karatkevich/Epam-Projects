class B {
    static void m(A a) {
        a.str = "string";
    }

    public static void main(String[] args) {
        A a = new A();
        B1 b1 = new B1();
        B3 b3 = new B3();

        m(a);
        m(b1);
        m(b3);

        System.out.println(a);
        System.out.println(b1);
        System.out.println(b3);
    }

    static class A {
        public String str;
    }

    static class B1 extends A {
        public String str;
    }

    static class B3 extends B1 {
        public String str;
    }
}





