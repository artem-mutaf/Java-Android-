import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {

        Cat cats1 = new Cat("Васька", "Рыжий", 2);
        Cat cats2 = new Cat("Антошка", "Черный", 3);
        Cat cats3 = new Cat("Барс", "Серый", 2);
        Cat cats4 = new Cat("Реал", "Белый", 8);
        Cat cats5 = new Cat("Мишаня", "Розовый", 10);
        Cat cats6 = new Cat("Егорчик", "Синий", 4);
        Cat cats7 = new Cat("Кедрик", "Оранжевый", 7);
        Cat cats8 = new Cat("Сахарок", "Белый", 5);
        Cat cats9 = new Cat("Америка", "Черный", 1);
        Cat cats52 = new Cat("Мелочь", "Лысый", 9);


        System.out.println("Кол-во котов: " + Cat.getAllCatsCount());

        List<Cat> c = new ArrayList<>();
        c.add(cats1);
        c.add(cats2);
        c.add(cats3);
        c.add(cats4);
        c.add(cats5);
        c.add(cats6);
        c.add(cats7);
        c.add(cats8);
        c.add(cats9);
        c.add(cats52);



        System.out.println("Список c именами котов в отсортированном порядке: ");
        Collections.sort(c,Comparator.comparing(Cat::getName));
        for (Cat cat : c) {
            System.out.println("Имя кота: " + cat.getName() + " " + "Цвет кота: " + cat.getColor() + "Возраст кота: "
                    + cat.getAge());
        }
        System.out.println("");
        System.out.println("Список котов с отсортированным возрастом котов: ");
        Collections.sort(c, Comparator.comparingInt(Cat::getAge));
        for (Cat cat : c) {
            System.out.println("Имя кота: " + cat.getName() + " " + "Цвет кота: " + cat.getColor() +
                    " " + " Возраст кота: " + cat.getAge());
        }
    }
}

