package Methods;

public class DivideMethod {
    public static void main(String[] args) {
        divide(8, 9);
        MethodReturnTypes types = new MethodReturnTypes();
        System.out.println(types.sendText() + " " + types.sendNum() + " " + types.sendTrue());
    }

    public static void divide(int first, int second) {
        System.out.println((1.0 * first) / second);
    }
}
