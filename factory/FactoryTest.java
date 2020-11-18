package factory;

public class FactoryTest {
    public static void main(String[] args)
    {
        ProductFactory fac=new ProductFactory();
        MemberProduct produce= fac.produce("tiger");
        produce.product();
    }
}
