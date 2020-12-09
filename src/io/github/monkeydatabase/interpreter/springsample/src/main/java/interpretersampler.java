import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class interpretersampler {
    public static void main(String[] args) {
        SpelExpressionParser parse=new SpelExpressionParser();
        Expression expression=parse.parseExpression("10*(2-1)*2+233");
        System.out.println(expression.getValue());
    }
}
