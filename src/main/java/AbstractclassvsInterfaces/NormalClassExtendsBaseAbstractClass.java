package AbstractclassvsInterfaces;

public class NormalClassExtendsBaseAbstractClass extends AbstractclassBase {
    public static void main(String[] args) {
        NormalClassExtendsBaseAbstractClass nc= new NormalClassExtendsBaseAbstractClass();
        AbstractclassBase abs= new NormalClassExtendsBaseAbstractClass() ;


        nc.test1();
        nc.test2();
        nc.test3();
        nc.test4();
        nc.test10();
        abs.test1();
        abs.test2();
        abs.test3();
        abs.test4();


    }
    public void test1() {
        System.out.println("Implemented test 1 abstract method from base abstract class");

    }
    public void test2() {
        System.out.println("override test 2 method in child class");

    }
    public void test4() {
        System.out.println("Implemented test 4 abstract method from base abstract class");

    }
    public void test10() {
        System.out.println("this is new method created in child class");

    }
}
