import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;

public class Example {
     static Map<Character, BinaryOperator<Integer>> map = new HashMap<>();
    public static void fillMap() {
        map.put('*', (x, y) -> x * y);
        map.put('/', (x, y) -> x / y);
        map.put('-', (x, y) -> x - y);
        map.put('+', (x, y) -> x + y);
    }
    public static void main(String[] args) {
        fillMap();
        System.out.println(switchCases('+', 5, 4));
        System.out.println(switchToMap('+', 5, 4));
    }

    public static double switchCases(char operator, int a, int b) {
        double result = 0;
        switch (operator) {
            case '*':
                result = a * b;
            break;
            case '+':
                result = a + b;
            break;
            case '-':
                result = a - b;
            break;
            case '/':
                result = (double) a / b;
            break;
            default:
               throw new RuntimeException("Операция не поддерживается");


        }
        return result;

    }

    public static double switchToMap(char operator, int a, int b) {
        return map.get(operator).apply(a, b);
    }


}