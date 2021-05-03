import java.util.Arrays;

public class VarArgsTest {

    public static void main(String[] args) {


    }

    static void fun(int... v){
        System.out.println(Arrays.toString(v));
    }

    static void fun(int v1,int ... v){
        System.out.println(Arrays.toString(v));
    }






}
