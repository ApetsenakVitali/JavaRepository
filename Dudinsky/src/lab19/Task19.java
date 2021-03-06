package lab19;

/* Задание 19. Напишите два цикла выполняющих многократное сложение строк, один с помощью оператора сложения и String, а другой с помощью StringBuilder и метода append. Сравните скорость их выполнения. */
public class Task19 {

    private static final String TEST_STR = "test ";

    public static void main(String[] args) {
        int iterationQuantity = 100;
        long startTime = System.nanoTime();
        testStringAddition(iterationQuantity);
        long stringAddTestResult = System.nanoTime() - startTime;
        System.out.println("Результат теста String и оператора сложения, нс: " + stringAddTestResult);
        startTime = System.nanoTime();
        testStringBuilderAppend(iterationQuantity);
        long strBuildAppTestResult = System.nanoTime() - startTime;
        System.out.println("Результат теста StringBuilder и метода append, нс: " + strBuildAppTestResult);
        System.out.println("Вывод 1: метод append в StringBuilder быстрее простого сложения String оператором \'+\' в " + (double) stringAddTestResult / strBuildAppTestResult + " раз");
        startTime = System.nanoTime();
        testStringBufferAppend(iterationQuantity);
        long strBuffAppTestResult = System.nanoTime() - startTime;
        System.out.println("Результат теста StringBuffer и метода append, нс: " + strBuffAppTestResult);
        System.out.println("Вывод 2: метод append в StringBuffer быстрее простого сложения String оператором \'+\' в " + (double) stringAddTestResult / strBuffAppTestResult + " раз");
    }

    private static void testStringAddition(int iterationQuantity) {
        String resultString = "";
        for (int i = 0; i < iterationQuantity; i++) {
            resultString += TEST_STR;
        }
        System.out.println(resultString);
    }

    private static void testStringBuilderAppend(int iterationQuantity) {
        StringBuilder resultStringBuilder = new StringBuilder();
        for (int i = 0; i < iterationQuantity; i++) {
            resultStringBuilder.append(TEST_STR);
        }
        System.out.println(resultStringBuilder);
    }

    private static void testStringBufferAppend(int iterationQuantity) {
        StringBuffer resultStringBuffer = new StringBuffer();
        for (int i = 0; i < iterationQuantity; i++) {
            resultStringBuffer.append(TEST_STR);
        }
        System.out.println(resultStringBuffer);
    }
}