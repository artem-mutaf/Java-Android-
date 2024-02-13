public class MobilePhone extends Phone{
    double screenSize;
    boolean isFoldable;
    public double getScreenSize(){ return this.screenSize=screenSize;}
    public void setScreenSize(double screenSize){ this.screenSize=screenSize;}
    public boolean getIsFoldable(){ return this.isFoldable=isFoldable;}
    public void setIsFoldable(boolean isFoldable){ this.isFoldable=isFoldable;}
    public MobilePhone(){}
    public MobilePhone(double screenSize,boolean isFoldable){
        this.isFoldable=isFoldable;
        this.screenSize=screenSize;
    }
    public void ring()
    {
        System.out.print("Телефон вибрирует");
    }

    public void sendMessage(String message,int number)
    {
    }
}
