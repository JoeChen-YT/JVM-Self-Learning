package joe.jvm.experiment.classloading.type;

public class SuperClass {
    static {
        System.out.println("SuperClass init!");
    }

    public static int superValue = 123;
    public static final int superConstValue = 1234;
}
