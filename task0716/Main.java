import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<>();
        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static List fix(List<String> list) {
        List<String> list1 = new ArrayList<>(list);
        for (String s : list1){
            if (s.contains("л"))list.add(s);
            if (s.contains("р")) list.remove(s);

        }

        return list;
    }
}
