public class HidingTest {

    public static void main(String[] args) {
        SuperClass sc  = new SubClass(); //Burada SuperClass referans tipiyle çalıştığı için direkt gidip SuperClass'taki metodu çağıracak
        sc.method();
        sc.staticMethod();
        SubClass.staticMethod(); //Static metotları çağırırken referanslar ile değil sınıf isimleri ile çağırırız.
    }
}

class SuperClass{

    public void method(){
        System.out.println("Instance method of super");
    }

    public static void staticMethod(){
        System.out.println("Static method of Super");
    }
}

class SubClass extends SuperClass{
    @Override
    public void method(){               //overriding
        System.out.println("Instance method of Sub");
    }

    public static void staticMethod(){    //hiding
        System.out.println("Static method of Sub");
    }

}
