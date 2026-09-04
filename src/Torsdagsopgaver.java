public class Torsdagsopgaver {
    public static void main(String[] args) {

        double price [] = new double [3];
        price [0] = 25.50;
        price [1] = 15.00;
        price [2] = 30.00;

        double sum = price[0] + price[1] + price[2];

        System.out.println(sum);

        double momsprocenten = 25.0;
        double momspris = sum * (momsprocenten / 100);
        double totalprice = sum + momspris;
        System.out.println(totalprice);


    }
}
