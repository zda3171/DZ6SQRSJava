import ru.netology.sqr.SQRService;

public class Main {

    public static void main(String[] args) {
        SQRService service = new SQRService();
        int res = service.calcRangeSQRService(100,400);
        System.out.println(" Ваш диапазон включает " + res + " целых чисел в квадрате ");
    }
}
