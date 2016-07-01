
abstract class A {
    static String s = "";

    protected A(int z) {
        s += "alpha";
    }
}

class SubAlpha extends A {
    static int u = 2;

    private SubAlpha() {
        super(u);
        s += "sub ";
    }
}






