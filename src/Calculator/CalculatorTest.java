package Calculator;



import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    public static void main(String[] args) {

        // правильный расчет суммы со скидкой
        assertThat(Calculator.calculatingDiscount(100.0, 10)).isEqualTo(90.0);
        assertThat(Calculator.calculatingDiscount(0.0, 10)).isEqualTo(0.0);
        assertThat(Calculator.calculatingDiscount(100.0, 0)).isEqualTo(100.0);

        // обработка негативных сценариев
        assertThatThrownBy(() ->
                Calculator.calculatingDiscount(-10.0, 10)
        ).isInstanceOf(ArithmeticException.class);

        assertThatThrownBy(() ->
                Calculator.calculatingDiscount(10.0, -20)
        ).isInstanceOf(ArithmeticException.class);

        assertThatThrownBy(() ->
                Calculator.calculatingDiscount(100.0, 101)
        ).isInstanceOf(ArithmeticException.class);

    }
}