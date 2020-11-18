package abstract_factory;

public class AbstractFactoryTest {
    public static void main(String[] args)
    {
        Provider provider_lion=new LionFactory();
        Provider provider_tiger=new TigerFactory();
        MemberProduct2 pro_lion=provider_lion.produce();
        MemberProduct2 pro_tiger=provider_tiger.produce();
        pro_lion.product();
        pro_tiger.product();
    }
}
