import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        /*
        //Пункт 1

        //Создавать список строк, вводя их с клавиатуры, в бесконечном цикле. Для выхода из
        //цикла надо ввести ключевое слово «end». Все введенные слова вывести на экран.

        Scanner scanner =new Scanner(System.in);
        //Создаем список
        List<String> list = new ArrayList<>();
        String s = "end";
        //Бесконечный цикл
        while(true) {

                System.out.println("Введите элемент в список ");
                String a = scanner.nextLine();
                list.add("Элементы в списке: " + a + " \n");
                //Для того чтобы при вводе ключевого слова end завершался код
                if (a.equals(s)) {
                    System.out.print("Завершаем...\n");
                    System.out.print(list);
                    break;
                }

                System.out.print(list);


        }

         */
        //Пункт 2

        //Собрать «коллекцию» котов. Класс Cat с полями имя (String name) и цвет (String color).
        //Задача — создать коллекцию Map, и добавить в неё 10 котов. В качестве ключа
        //использовать имя кота. Вывести отдельно список «ключей», и отдельно список котов
        //вместе с их цветом

        Map<String,Cat>cat=new HashMap<>();

        //Добавляем элементы в коллекцию
        cat.put("Реалмадрид",new Cat("Реалмадрид","Розовый"));
        cat.put("Португа",new Cat("Португа","Фиолетовый"));
        cat.put("Испания",new Cat("Испания","Черный"));
        cat.put("Молдова",new Cat("Молдова","Красный"));
        cat.put("Бобик",new Cat("Бобик","Коричневый"));
        cat.put("Гений",new Cat("Гений","Серый"));
        cat.put("КурсJava",new Cat("КурсJava","Оранжевый"));
        cat.put("Пух",new Cat("Пух","серобуромалиновый"));
        cat.put("Фильтр",new Cat("Фильтр","Красивыйцвет"));
        cat.put("Пластик",new Cat("Пластик","Синий"));

        //Вывод чисто имен котиков
        System.out.println("Список имен котов: ");
        for (String key : cat.keySet()) {
            System.out.println(key);
        }

        //Вывод их имен и цветов
        System.out.println("Список котов с их цветами: ");
        for(Cat cats : cat.values()){
            System.out.println("Имя котика:" + "-"+cats.getName()+"-" + " его цвет ---> " + cats.getColor());
        }


    }
}