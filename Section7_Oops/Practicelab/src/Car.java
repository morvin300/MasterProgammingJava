public class Car {
    private String make="Tesla";
    private String color="Silver";

    private String model="Model 1";
    private int doors=2;
    private boolean convertible=true;

    public void CarFeature()
    {
        System.out.println(make +" Make "+
                color+ " Color "+
                doors +" Doors "+
                model +" "+
                (convertible ? "Convertible" : ""));
    }


}
