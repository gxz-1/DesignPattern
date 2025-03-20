public class SingleClass2 {
    private static volatile SingleClass2 instance;

    private SingleClass2() {
    }

    private static class instanceClass {
        private static final SingleClass2 instance = new SingleClass2();
    }

    public static SingleClass2 getInstance() {
        return instanceClass.instance;
    }
}
