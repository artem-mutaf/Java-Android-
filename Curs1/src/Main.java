import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Привет, меня зовут Мутаф Артём! Я из курса Java(Android)");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во элементов массива: ");
        int n = scanner.nextInt();
        int [] elem = new int[n];
        int sum = 0;
        for(int i = 0;i<elem.length;i++)
        {
            System.out.print("Введите значение "+i +" элемента: ");
            int e = scanner.nextInt();
            sum = sum+e;
        }
        System.out.println("Сумма элементов массива равняется "+sum);
        double a = sum/n;
        System.out.print("Среднее арифметическое между элементами равняется "+a);










    }
}