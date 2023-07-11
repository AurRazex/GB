package Java.Lesson2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.tools.JavaFileObject;
import javax.xml.bind.JAXBElement;

public class student {
    private static final String JsonStr = null;

    public static void main(String[] args) {
        String jsonstr = readStringFromFile("data.json");
        JsonArray array =new Gson().fromJson(JsonStr, JsonArray.class);
        StringBuilder sb = new StringBuilder();

        for (JAXBElement element : array) {
            final JavaFileObject obj =((Object) element).getAsJsonObject();
            String surname = ((Object) obj).get("Фамилия").getAsString();
            String mark = ((Object) obj).get("Оценка").getAsString();
            String subject = ((Object) obj).get("Предмет").getAsString();

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

    private static void While(boolean b) {
    }

}
