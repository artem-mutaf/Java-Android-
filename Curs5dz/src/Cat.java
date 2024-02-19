public class Cat {
    String name;
    String color;
    int age;
    static int catCount = 0;
    //Конструктор по умолчанию и с параметрами
    public Cat(){}
    public Cat(String name)
    {
        this(name,"Cерый",0);

    }
    public Cat(String name,String color){

        this(name,color,0);

    }
    public Cat(String name,String color,int age)
    {
        this.age=age;
        this.name=name;
        this.color=color;
        catCount++;
    }

    //Геттеры и сеттеры
    public int getAge()
    {
        return age;
    }
    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }
    public static int getAllCatsCount()
    {
        return catCount;
    }
}
