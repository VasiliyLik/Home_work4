//класс Сложения
public class Addition implements Action {
    @Override
    public double doAction(double first, double second) {
        return first + second;
    }
}
