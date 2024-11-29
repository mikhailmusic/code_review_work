public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int dif(int a, int b){
        return a - b;
    }
    public int div(int a, int b){
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }
        return a / b;
    }
    public int times(int a, int b){
        return a * b;
    }

    /**
     * solver: (((a + b) - 2) * c) / 5
     */
    public int solver(int a, int b, int c) {
        return div(times(dif(add(a, b), 2), c), 5);
    }
}
