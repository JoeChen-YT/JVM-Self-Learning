package joe.jvm.experiment.classloading.type;

public class SubClass extends SuperClass {
    static {
        System.out.println("SubClass init!");
    }

    public static int subValue = 321;
}
