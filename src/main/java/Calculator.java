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
    public int solver(){
        return div(times(add(10, 5), dif(15, 3)), 4);
    }
}
