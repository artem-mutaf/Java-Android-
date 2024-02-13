public class Phone implements RingAble{
    private int number;
    private String modelName;
    private double weight;

    public void receiveCall(String name)
    {
        System.out.print("Звонит"+name);
    }
    //Геттеры и сеттеры к приватным полям
    public int getNumber() {return this.number; }
    public int setNumber(int number) { this.number=number;
    return number;}
    public String getModelName(){ return this.modelName;}
    public void setModelName(String modelName){ this.modelName=modelName;}
    public double getWeight(){ return this.weight;}
    public void setWeight(double weight){ this.weight=weight;}
    public Phone(){}
    public Phone(int number,String modelName,double weight)
    {
        this.number=number;
        this.modelName=modelName;
        this.weight=weight;
    }
    //Метод вывода
    public String ToString()
    {
        return "Номер телефона: " + number + "\nНазвание модели телефона: " + modelName + "\nВес телефона: " + weight;
    }
    public void ring()
    {
        System.out.print ("\nзвенит телефон");
    }
    public void aboutPhone()
    {

    }

}
