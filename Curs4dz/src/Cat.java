import java.util.Map;
import java.util.HashMap;
public class Cat {
    //Поля в классе
    String name;
    String color;
    //Конструктор по умолчанию и с параметрами
    public Cat(){}
    public Cat(String name,String color){
        this.name=name;
        this.color=color;
    }

    //Геттеры и сеттеры
    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }






}
