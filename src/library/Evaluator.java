package library;

public class Evaluator {
    public int evaluate(String str){
        String num[] = str.split(" ");
        for (int i = 0; i < num.length ; i++) {
            System.out.println(num[i]);
        }
    }
}
