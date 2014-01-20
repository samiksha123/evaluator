package library;

public class Evaluator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }
    public int evaluate(String expression) {
        String numArray[] = expression.split(" ");
        int result = 0;
        int num1 = Integer.parseInt(numArray[0]);
        if (numArray.length == 1) return num1;
        int num2 = Integer.parseInt(numArray[2]);
        if (numArray[1].equals("+"))
            result = add(num1, num2);
        return result;
    }
}
