import java.util.Calendar;
import java.util.Date;

public class Test0605 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(getDateForLastMonth(date));
    }

    public static Date getDateForLastMonth (Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date); // 设置为当前时间
        calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH) - 1); // 设置为上一个月
        date = calendar.getTime();
        return date ;
    }
}
