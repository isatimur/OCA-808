package casting;

/**
 * Created by Тимакс on 29.11.2015.
 */
public class Test1 {
    public static void main(String[] args) {
        int iVar = 100;
        float fVar = 100.100f;
        double dVar = 123;
//        iVar = fVar; //compilation fails
        fVar = iVar;
        dVar = fVar;
//        fVar = dVar;//compilation fails
        dVar = iVar;
//        iVar = dVar;//compilation fails

    }
}
