public class WirelessPhone extends AbstractPhone{

    private int hour;

    public WirelessPhone(int year,int hour) {
        super(year);
        this.hour=hour;
    }

    @Override
    public void call(int outNumber) {
        System.out.println("Вызываю номер " + outNumber);
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("Вам звонит абонент " + inputNumber);

    }
}
