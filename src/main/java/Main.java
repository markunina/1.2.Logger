import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите размер списка: ");
        Random random = new Random();
        int n = random.nextInt(20);
        System.out.println(n);
        System.out.print("Введите верхнюю границу значений: ");
        int m = random.nextInt(150);
        System.out.println(m);
        logger.log("Создаём и наполняем список");
        List<Integer> source = new ArrayList<>();
        for(int i = 0; i < n; i++){
            source.add(random.nextInt(m));
        }
        System.out.println("Вот случайный список:" + source.toString());
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int f = random.nextInt(m);
        System.out.println(f);
        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(f);
        List<Integer> result = filter.filterOut(source);
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + result.toString());
        logger.log("Завершаем программу");
    }
}

