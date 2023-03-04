// класс Проценты от числа
public class Percentage implements Action{
    @Override
    public double doAction(double first, double second) {
        return (first * second) / 100.0;
    }
}
