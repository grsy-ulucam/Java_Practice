package lessons;

import java.time.Month;

public class j41_Runner {

    public static void main(String[] args) {

        j41_Months month=j41_Months.MAYIS;
        System.out.println("month.days = " + month.days);
        System.out.println("month.ordinal() = " + month.ordinal());
        month.setDays();
        System.out.println("month.name() = " + month.name());
        System.out.println("month.compareTo(j41_Months.NISAN) = " + month.compareTo(j41_Months.NISAN));
        System.out.println("month.equals(j41_Months.MART) = " + month.equals(j41_Months.MART));

    }
}
