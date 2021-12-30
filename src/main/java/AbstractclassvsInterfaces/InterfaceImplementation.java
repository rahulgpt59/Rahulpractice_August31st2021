package AbstractclassvsInterfaces;

public class InterfaceImplementation implements InterfacePractice {
    public static void main(String[] args) {
        InterfaceImplementation intimp=new InterfaceImplementation();
        InterfacePractice ipp= new InterfaceImplementation();
        intimp.test5();
        intimp.test6();
        intimp.test7();
        ipp.test5();
        ipp.test6();

    }

    @Override
    public void test5() {
        System.out.println("Implemented method 5 from interface");
    }
    public void test6() {
        System.out.println("Implemented method 6 from interface");
    }
    public void test7() {
        System.out.println("this is new method created in subclass");
    }
    public void test8() {
        System.out.println("this is new method created in subclass");
    }
}
