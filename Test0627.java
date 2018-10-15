import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test0627 {
    public static void main(String[] args) throws ParseException {
        Calendar ca = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
        SimpleDateFormat ff = new SimpleDateFormat("yyyy-MM");
        String cdutydate = "201805";
        Date date = sdf.parse(cdutydate);
        System.out.println(date);
       // String beg = ff.format(ff.parse(cdutydate));
       // beg = beg + "-01";
       // System.out.println(beg);
    }
}
