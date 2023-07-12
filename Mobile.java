 public class  Mobile{
    static String lockScreenColor = "Black";
    static int foundYear = 1973;
    String chargingType;
    int price =25000;
    String mobileName;

   



    public static void main(String[] args) {
        
    
         Mobile  mobile = new  Mobile();

        Mobile.mobileName = "RealMe";
        System.out.println( mobile.mobileName);
        System.out.println( mobile.price);
        System.out.println( mobile.lockScreenColor);
         Mobile.charger =ChargingType.CTYPE;
        System.out.println( Mobile.charger);
       
       

        IPhone iphone = new IPhone();
        iphone.cost = 50000;
        System.out.println(iphone.cost);
        System.out.println(iphone.cover);
        System.out.println(iphone.noOfEdges);
   
    }
    


    public enum ChargingType {
        CTYPE("C"),NORMAL("Common"),CIRCLE("Round Shape");
        String result;

         ChargingType(String result){
        this.result = result;

    }
    public String getVlaue(){

        return this.result;
    }
    }    
}
class IPhone{
    static int numberOfLogo = 1;
    static String iphoneCEO= "TIM COOK";
    String  backColor = "White";
    int cost;
    Color cover = Color.BLACK;


    public enum Color {
    BLACK("Black"), WHITE("White"), GRAY("Gray");
        String value;
    
    Color(String value){
        this.value = value;

    }
    public String getVlaue(){

        return this.value;
    }
}
}