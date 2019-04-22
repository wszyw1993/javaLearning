package dateAndCanlander;
import java.util.Date;

public class RandomTime {
    public static long RandomNum(long beginTime, long finalTime) {
        long randomNum = finalTime - beginTime;
        long time = (long)(Math.random()*randomNum)+beginTime;
        return time;
    }
    
    public static void main(String[] args) {
        @SuppressWarnings("deprecation")
        Date beginTime = new Date(95,1,1,0,0,0);
        @SuppressWarnings("deprecation")
        Date finalTime = new Date(95,12,31,23,59,59);
        Date randomTime = new Date(RandomNum(beginTime.getTime(),finalTime.getTime()));
        System.out.println(randomTime);
        Date d1 = new Date(951962126663l);
        System.out.println(d1);
        
    }

}
