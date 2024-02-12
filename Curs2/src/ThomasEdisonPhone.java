public class ThomasEdisonPhone extends AbstractPhone{

    public ThomasEdisonPhone(int year) {
        super(year);
    }

    @Override
    public void call(int outNumber) {
        System.out.println("Вращайте ручку");
        System.out.println("Сообщите номер абонента");

    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("Телефон звонит");

    }
}
