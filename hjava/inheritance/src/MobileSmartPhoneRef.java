class MobilePhone{
    protected String number;

    public MobilePhone(String num){
        number = num;
    }
    public void answer(){
        System.out.println("난 모바일폰 "+number);
    }
}

class SmartPhone extends MobilePhone {
    private String androidVer;

    public SmartPhone(String num,String ver){
        super(num);
        androidVer=ver;
    }

    public void playApp(){
        System.out.println("App is running in"+androidVer);
    }
    public void answer(){
        System.out.println("난 스마트폰 "+number);
    }
}
class MobileSmartPhoneRef {
    public static void main(String[] args) {
        SmartPhone ph1=new SmartPhone("01023302302","ssksksk");
        MobilePhone ph2=new SmartPhone("0103232323","askdjalsdkj");

        ph1.answer();
        ph1.playApp();
        System.out.println();

        ph2.answer();
        //ph2.plapApp(); 에러
    }


}
