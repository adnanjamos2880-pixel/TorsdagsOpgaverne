public class opg3 {
    public static void main(String[] args) {

        double startsprisen = 300.0;
        double rabatprocenten = 20.0;
        double rabatprisen = startsprisen * (rabatprocenten /100) ;
        System.out.println(startsprisen);
        double momsprocenten = 25.0;
        double prisefterabat = startsprisen - rabatprisen;
        System.out.println(prisefterabat);
        double momsbeløb = prisefterabat * (momsprocenten / 100 );
        double finalprice = momsbeløb + prisefterabat;
        System.out.println(finalprice);





    }
}
