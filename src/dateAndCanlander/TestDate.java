package dateAndCanlander;
import java.util.Date;
import java.text.*;

public class TestDate {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println("��ǰʱ�䣺"+d1);
        Date d2 = new Date(5000);
        System.out.println("time:"+d2.toString());
        System.out.println("time2:"+d2.getTime());
        System.out.println("time3:"+System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String str = sdf.format(d2);
        System.out.println("time4:"+str);
        String str1 = "2019-12-23 12:23:12";
        try {
            Date d3 = sdf.parse(str1);
            System.out.printf("�ַ��� %s ͨ����ʽ  yyyy/MM/dd HH:mm:ss %nת��Ϊ���ڶ���: %s",str,d3.toString());
            
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
