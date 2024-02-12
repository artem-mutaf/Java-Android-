public abstract class AbstractPhone {
    private int year;
    public AbstractPhone(int year){this.year=year;}
    public abstract void call(int outNumber);
    public abstract void ring(int inputNumber);
}
