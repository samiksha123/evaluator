package client;

import library.Evaluator;

import java.io.IOException;

public class EvaluatorClient {
    public static void main(String[] args) throws IOException {
        Evaluator e = new Evaluator();
        String str = "2 + 3";
        System.out.println(e.evaluate(str));
    }
}
