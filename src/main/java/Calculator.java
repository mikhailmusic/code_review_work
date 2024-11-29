public class Calculator {
    public int add(int a, int b) {
        System.out.println("🎉 Сложение — это легко! Считаем...");
        return a + b;
    }

    public int dif(int a, int b) {
        System.out.println("🤔 Убираем лишнее. Что получится?");
        return a - b;
    }

    public int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("🚨 Делить на ноль нельзя! Но вот тебе результат: бесконечность ♾️");
        }
        System.out.println("🔢 Делим аккуратно...");
        return a / b;
    }

    public int times(int a, int b) {
        System.out.println("💪 Умножаем числа. Результат будет впечатляющим!");
        return a * b;
    }

    /**
     * Solver: решает уравнение ax + b = c
     */
    public int solver(int a, int b, int c) {
        if (a == 0) {
            throw new ArithmeticException("😈 a = 0 - посчитай сам");
        }

        System.out.println("📐 Решаем уравнение: " + a + "x + " + b + " = " + c);

        int numerator = dif(c, b);
        int result = div(numerator, a);

        System.out.println("📊 Ответ: x = " + result);
        return result;
    }
}
