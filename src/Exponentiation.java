// класс Возведение числа в степень
public class Exponentiation implements Action {
    @Override
    public double doAction(double first, double second) {
        return (int) Math.pow(first, second);
    }
}
