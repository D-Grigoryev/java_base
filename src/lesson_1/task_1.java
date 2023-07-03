package lesson_1;
//Формат сдачи: ссылка на подписанный git-проект.
//Задание
//1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

public class task_1 {
    public static void main(String[] args) {
        System.out.println(sumN(10));
    }
    public static int sumN (int value)
    {
        return (value * (value + 1) / 2);
    }
}
