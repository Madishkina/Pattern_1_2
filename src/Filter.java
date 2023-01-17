import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {

        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();//метод для фильтрации списка.
        List<Integer> result = new ArrayList<>();
        for (int value : source) {
            if (value >= treshold) {
                logger.log(String.format("Элемент \"%d\" проходит", value));
                result.add(value);
            } else {
                logger.log(String.format("Элемент \"%d\" не проходит", value));
            }
        }
        return result;
    }
}
