package Lambda;

/**
 * Created by Тимакс on 24.11.2015.
 */
public class CheckIfHopper implements CheckTrait {

    @Override
    public boolean test(Animal a) {
        return a.isCanHop();
    }
}
