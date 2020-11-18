package abstract_factory;

public class TigerFactory implements Provider {
    @Override
    public MemberProduct2 produce() {
        return new TigerProduct2();
    }
}
