package abstractexample23;

public class TestAbstraction1 {
    public static void main(String[] args) {
        Shape s = new Circle1();
        s.draw();
        Shape cc = new Rectangle();
        cc.draw();
    }
}
