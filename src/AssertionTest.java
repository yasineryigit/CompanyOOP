public class AssertionTest {

    public static void main(String[] args) {
     /*   double x = -5;
        assert x>0: "x " + x; //x'in her zaman 0 dan büyük olacağını garanti ettik. Aksi durumda hata fırlatacak
        double y = Math.sqrt(x);
        System.out.println(y);
*/
        try{
            double a = 2/0;
        }catch (ArithmeticException e ){
            System.out.println("Arithmetic Exception");
        }
        catch (Exception ex){
            System.out.println("Exception");
        }finally {
            System.out.println("Finally her türlü çalışır");
        }
    }

}
