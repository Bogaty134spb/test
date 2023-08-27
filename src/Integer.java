public class Integer {


    public static void main(String[] args) {
        int dais = 5000;
        int years = dais / 365;
        int month = (dais % 365) / 31 ;
        int LeftDais = dais - years * 365 - month * 31;
        System.out.println("Общее количество дней:"+ dais);
        System.out.println("Лет:" + years);
        System.out.println("Месяцев:"+ month);
        System.out.println("Дней:" + LeftDais);
    }



    }
