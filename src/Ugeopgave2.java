public class Ugeopgave2 {
    public static void main(String[] args) {
        double totalprice = 500;


        //if totalprice > 1000: 20% rabat
        //if 800<totalprice<=1000: 10% rabat
        //if totalprice <=800: no rabat

        double discount;
                discount = (20*1000) / 100;



        if (totalprice > 1000) {


            System.out.println(" 20 % Rabat" );

        } else if  (800 < totalprice) {

            System.out.println( " 10% discount " );

        } else {
            System.out.println("no rabat");
        }
    }
}
