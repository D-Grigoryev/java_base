package lesson_2;
import org.json.simple.JSONObject;
public class task_2 {
    public static void main(String[] args) {
        JSONObject js  = new JSONObject();
        js.put("name", "foo");
        js.put("num", 100);
        js.put("is_vip", true);
        js.put("nickname", null);
        System.out.println(js.toString());
    }

}
