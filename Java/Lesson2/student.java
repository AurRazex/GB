package Java.Lesson2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.tools.JavaFileObject;

public class student {
    private static final String JsonStr = null;

    public static void main(String[] args) {
        String jsonstr = readStringFromFile("data.json");
        JsonArray array =new Gson().fromJson(JsonStr, JsonArray.class);
        StringBuilder sb = new StringBuilder();

        for (JsonElement element : array) {
            JavaFileObject obj =element.getAsJsonObject();
            String surname = obj.get("Фамилия").getAsString();
            String mark = obj.get("Оценка").getAsString();
            String subject = obj.get("Предмет").getAsString();

            sb.append("Студент ")
                .append(surname)

                .append(" получил ")

                .append(mark)

                .append(" по предмету ")

                .append(subject)

                .append(".n");
        }
        System.out.println(sb.toString());
    }

    private static String readStringFromFile(String filename) {
        try {
            BufferedReader br =new BufferedReader(new FileReader(filename));

            StringBuilder sb =new StringBuilder();

            String line;

            While((line = br.readLine()) != null) {

                sb.append(line);

            }

            br.close();

            return sb.toString();

        }catch(IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}
