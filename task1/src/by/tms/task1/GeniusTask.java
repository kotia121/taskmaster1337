package by.tms.task1;

public class GeniusTask {

    public static void main(String[] args) {
        findSymbol("и", 10);
    }

    public static void findSymbol(String symbol, int offset) {
        String[] array = "абвгдеёжзийклмнопрстуфхцчшщэюя".split("");
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(symbol)) {
                System.out.println("Результат:" + array[i + offset] +"");
                break;
            }
        }

    }
}

