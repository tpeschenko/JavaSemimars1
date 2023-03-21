//Дана строка sql-запроса "select * from students where ".
//Сформируйте часть WHERE этого запроса,используя StringBuilder.
//Данные для фильтрации приведены ниже в виде json-строки.
//Если значение null, то параметр не должен попадать в запрос.
//Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
//На выходе: select * from students where name = 'Ivanov' and Country = 'Russia' and city = 'Moscow'
public class Task4 {
    public static void main(String[] args) {
    String startRequest = "select * from students where name =";
    String data = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";

    String finishRequest = data
            .substring(1, data.length() - 1);
    System.out.println(finishRequest);

    String[] myFinishRequest = finishRequest.split(",");
    StringBuilder myRequest = new StringBuilder();


    for (String i : myFinishRequest)
    {
        int count = 0;
        if(i.contains("null") != true)
        {
            for (int j = 0; j < i.length(); j++)
            {

                if(i.charAt(j) == "\"".charAt(0) && count < 2)
                {
                    count += 1;
                }
                else
                {
                    myRequest.append(i.charAt(j));
                    System.out.println(myRequest);
                }
            }


        }
        else
        {

            continue;
        }

    }
    System.out.printf("%s %s",startRequest, myRequest );

    }
}
