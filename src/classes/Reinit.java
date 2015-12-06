package reinit.classes;

/**
 * Created by Тимакс on 06.12.2015.
 */
public class Reinit {
    public static void main(String[] args) {
        Float f = null;
        try {
            f = Float.valueOf("12.3");
            String s = f.toString();
            int i = Integer.parseInt(s);
            System.out.println("i = " + i);
        } catch (Exception e) {
            System.out.println("trouble : " + f);
        }

        String String = ""; //This is valid.
        String:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i + j > 10) break String;
            }
            System.out.println("hello");
        }

    }
}
