public class VectorCalculator extends AbstractCalculator{

    public VectorCalculator(Calculate add, Calculate subtract, Calculate multiply, Calculate divide) {
        super(add, subtract, multiply, divide);
    }

    @Override
    public Number add(Number a, Number b) {
        Number result = new Number((a.getA() + b.getA()), (a.getB() + b.getB()));
        return result;
    }

    @Override
    public Number subtract(Number a, Number b) {
        Number result = new Number((a.getA() - b.getA()), (a.getB() - b.getB()));
        return result;
    }

    @Override
    public Number multiply(Number a, Number b) {
        Number result = new Number((a.getA() * b.getA()), (a.getB() * b.getB()));
        return result;
    }

    @Override
    public Number divide(Number a, Number b) {
        Number result = new Number((a.getA() / b.getA()), (a.getB() / b.getB()));
        return result;
    }
}
