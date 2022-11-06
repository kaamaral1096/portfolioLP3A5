import java.util.Optional;
import java.lang.ArithmeticException;

public class CreateOptional {
    private Optional<Integer> opt;

    public void OfNullableMethod() {
        Integer number = null;
        Optional<Integer> opt = Optional.ofNullable(number);

        System.out.println("Demo ofNullable com orElse: " + opt.orElse(0));
        System.out.println("Demo ofNullable com orElseGet: " + opt.orElseGet(() -> 0));
    }

    public void OfMethod() {
        Optional<Integer> opt = Optional.of(1);

        System.out.println("Demo of: " + opt  + "\n");

        System.out.println(
                "Valor de do método orElseThrow("
                        + "ArithmeticException::new): "
                        + opt.orElseThrow(
                        ArithmeticException::new) + "\n");
    }

    public void FilterMethod() {
        Optional<Integer> op
                = Optional.of(9456);

        System.out.println("Optional: "
                + op);
        System.out.println("Filtered value "
                + "for odd or even: "
                + op
                .filter(num
                        -> num % 2 == 0)  + "\n");
    }
}
