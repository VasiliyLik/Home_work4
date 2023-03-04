//класс - собственное исключение - максимально допустимое значение расчета процентов (не более 100)
public class MaximumCalculatedPercentage extends Exception {
    public MaximumCalculatedPercentage(String message) {
        super(message);
    }
}
