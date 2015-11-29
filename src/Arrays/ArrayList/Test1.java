package Arrays.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Тимакс on 28.11.2015.
 */
public class Test1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Rob");
        names.add("Bran");
        names.add("Rick");
        names.add("Bran");
        if(names.remove("Bran")){
            names.remove("Josh");
        }
        System.out.println(names);
    }
}
