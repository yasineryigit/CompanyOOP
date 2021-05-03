public class BlockTest {

    static{
        System.out.println("Inside Static Block");
    }

    {
        System.out.println("Inside Instance Block");
    }

    public BlockTest(){
        System.out.println("Inside constructor");
    }

    public static void main(String[] args) {
        BlockTest test1 = new BlockTest();
        BlockTest test2 = new BlockTest();
    }
}
