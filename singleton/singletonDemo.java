public class singletonDemo {
    public static void main(String[] args) {
        SingletonClass singletonClass = SingletonClass.getInstance();
        singletonClass.showMessage();
    }
}