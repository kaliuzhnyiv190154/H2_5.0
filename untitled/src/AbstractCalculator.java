public abstract class AbstractCalculator {
    protected Calculate add;
    protected Calculate subtract;
    protected Calculate multiply;
    protected Calculate divide;

    public AbstractCalculator(Calculate add, Calculate subtract, Calculate multiply, Calculate divide) {
        this.add = add;
        this.subtract = subtract;
        this.multiply = multiply;
        this.divide = divide;
    }

    public abstract Number add(Number a, Number b);
    public abstract Number subtract(Number a, Number b);
    public abstract Number multiply(Number a, Number b);
    public abstract Number divide(Number a, Number b);
}
