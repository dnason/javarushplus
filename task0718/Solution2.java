
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList();

        for (int i=0;i<10;i++)
        {
            list.add(reader.readLine());
        }

        int a=0;

        for (int i=0;i<list.size();i++) {
            String x = list.get(i);
            int b = x.length();
            if (a > b)
            {
                System.out.println(i);
                break;
            }
             a=b+1;
        }
    }
}

