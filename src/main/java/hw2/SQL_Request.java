package hw2;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

// 1) Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса,
// используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
public class SQL_Request {

    public String human(String str) {
        String[] splits = str.split(",");

        StringBuilder builder = new StringBuilder();

        for (String item : splits) {
            String[] parts = item.split(":");
            if (!(splits.equals("null"))) {
                builder.append(Arrays.toString(splits));
            }
        }

        return builder.toString();
    }
}

