package dateAndCanlander;

import java.util.Arrays;
import java.util.Date;

public class DateSortTest {
    public static void main(String[] args) {
        Date beginTime = new Date(70,1,1,0,0,0);
        @SuppressWarnings("deprecation")
        Date finalTime = new Date(99,12,31,23,59,59);
        Date[] nineDateD = new Date[9];
        long[] nineDateL = new long[9];
        for (int i=0;i<9;i++) {
            nineDateL[i]=RandomTime.RandomNum(beginTime.getTime(),finalTime.getTime());
        }
        Arrays.parallelSort(nineDateL);
        for (int i=0;i<9;i++) {
            nineDateD[i] =new Date(nineDateL[i]);
            System.out.println(nineDateD[i]);
        }
        System.out.println(beginTime);
        System.out.println(finalTime);
    }
}
