import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static int listSize;

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запуск программы");
        Scanner scan = new Scanner(System.in);
        logger.log(" Просим пользователя ввести входные данные для списка");
        System.out.println("Введите размер списка: ");
        if (scan.hasNextInt()) {
            listSize = scan.nextInt();
            logger.log("Введено число");
        } else {
            logger.log("Введено не число");
        }
        if (listSize <= 0) {
            logger.log("Введите корректное число");
        }
        System.out.println("Введите верхнюю границу значений");
        int maxValue = scan.nextInt();
        logger.log(("Создаем и наполняем список"));
        Random random = new Random();

        List<Integer> list = new ArrayList<>(listSize);
        for (int i = 0; i < listSize; i++) {
            list.add(random.nextInt(maxValue));
        }
        System.out.println("Вот случайный список" + list);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра: ");
        int filterThreshhold = scan.nextInt();
        Filter filter = new Filter(filterThreshhold);
        List<Integer> filteredList = filter.filterOut(list);
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список" + filteredList);
        System.out.println("Завершаем программу");
    }
}