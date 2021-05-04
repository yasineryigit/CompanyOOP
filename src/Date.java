public class Date {
    int year, month, day;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    private boolean isLeapYear(int year){
        if(year%4==0&&year%100==0&&year%400==0){//4'e tam bölünüyorsa true
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.isLeapYear(1500));
    }
}
