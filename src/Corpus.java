import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Corpus {
    Map<String, List<String[]>> dict = new HashMap();
    public Corpus(String input)
    {
        Scanner scan = new Scanner(input);
        while (scan.hasNextLine()) {
            String tokens[] = scan.nextLine().split("/");
            String key = tokens[0] + "/" + tokens[1] + "/" + tokens[4];
            String value[] = new String[]{tokens[3], tokens[6]};
            if(!dict.containsKey(key))
            {
                List<String[]> values = new ArrayList();
                dict.put(key, values);
            }
            dict.get(key).add(value);
        }
        scan.close();
    }

    public String[][] getWord2Prob(String word1, String type1, String type2)
    {
        String key = word1 + "/" + type1 + "/" + type2;
        return dict.get(key).toArray(new String[dict.size()][]);
    }
}
