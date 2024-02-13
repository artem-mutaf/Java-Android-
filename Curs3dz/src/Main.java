import java.util.function.Function;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Не разобрались с последними 4-мя пунктами
        Phone phone = new Phone(77588191,"apple",23.2);
        System.out.print(phone.ToString());
        phone.ring();
        LandLinePhone phone1 = new LandLinePhone();
        phone1.ring();
        System.out.print(phone1.ToString());
        MobilePhone phone2 = new MobilePhone();







    }
}
