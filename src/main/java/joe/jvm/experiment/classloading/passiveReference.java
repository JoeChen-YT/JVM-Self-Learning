package joe.jvm.experiment.classloading;

import joe.jvm.experiment.classloading.type.SubClass;
import joe.jvm.experiment.classloading.type.SuperClass;

public class passiveReference {
    public static void main (String[] args) {
        // Scenario one: Access the static filed in the parent class will only cause the classloading for the
        // parent class, but not for child class.
        printSeparateLine();
        System.out.println("Test Scenario one");
        System.out.println(SubClass.superValue);
        printSeparateLine();

        // Scenario two: Instantiate an array of certain type(T) won't cause the classloading for that type, instead it
        // will cause a wrapper class "[T" to be classloaded.
        printSeparateLine();
        System.out.println("Test Scenario two");
        SuperClass[] superClassArray = new SuperClass[1];
        printSeparateLine();

        // Scenario three: Access a constant value within a class won't cause the classLoading for that type. It's
        // because of the compilation optimization.
        printSeparateLine();
        System.out.println("Test Scenario three");
        System.out.println(SuperClass.superConstValue);
        printSeparateLine();
    }

    private static void printSeparateLine() {
        System.out.println("=============================================");
    }
}
