package hw2;

// 1) Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса,
// используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
public class SQL_Request {

    public String human(String str) {

        StringBuilder builder = new StringBuilder();

        String[] splits = str.split(",");

        for (int i = 0; i < splits.length; i++) {
            String[] parts = splits[i].split(":");
            if (!parts[1].equals("\"null\"") ) {
                builder.append(parts[1]);
            }
        }


        return builder.toString().replace('"',' ');
    }
}

