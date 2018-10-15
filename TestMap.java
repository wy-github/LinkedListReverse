import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        List<Map> list = new ArrayList<>();
        Map<String, Integer> map1 = new HashMap();
        map1.put("num",162);
        Map map2 = new HashMap();
        map2.put("num",3);
        list.add(map1);
        list.add(map2);
        int sum = 0;
        for(int i = 0;i < list.size();i++){
             sum = sum + (int)list.get(i).get("num");
        }
        System.out.println(sum);

    }
}
