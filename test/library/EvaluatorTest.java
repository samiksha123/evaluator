package library;

import static org.junit.Assert.assertEquals;

public class EvaluatorTest extends Evaluator {
    @org.junit.Test
    public void testEvaluate() throws Exception {
        String str = "2 + 3";
        Evaluator e = new Evaluator();
        int res = e.evaluate(str);
        assertEquals(res,5);
    }
}
