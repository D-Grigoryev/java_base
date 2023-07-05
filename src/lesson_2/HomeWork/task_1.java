package lesson_2.HomeWork;

//Задание
//        1) Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder.
//        Данные для фильтрации приведены ниже в виде строки.
//        Если значение null, то параметр не должен попадать в запрос.
//        Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

import org.json.simple.JSONObject;

public class task_1 {
    public static void main(String[] args) {

        JSONObject js = new JSONObject();
        js.put("name", "Foo");
        js.put("country", "Russia");
        js.put("city", "Moscow");
        js.put("age", "null");

        String st = "select * from students where ";

        task_1 t1 = new task_1();
        t1.sbCreator(t1.strBild(st, "Russia"), js);

    }

    public void sbCreator(String str, JSONObject jo) {
        String[] temp = str.split(" ");
        if (temp.length > 4) {
            if (String.valueOf(jo.get("name")).equals(temp[5])) System.out.println(jo.get("name"));
            else if (String.valueOf(jo.get("country")).equals(temp[5])) System.out.println(jo.get("country"));
            else if (String.valueOf(jo.get("city")).equals(temp[5])) System.out.println(jo.get("city"));
            else if (String.valueOf(jo.get("age")).equals(temp[5])) System.out.println(jo.get("age"));
            else System.out.println("Нет совпадений");
        }
    }
    public String strBild (String str, String filter ){
        StringBuilder sb = new StringBuilder();
        String result = String.valueOf(sb.append(str + filter));
        return result;
    }
}

