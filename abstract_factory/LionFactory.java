package abstract_factory;

public class LionFactory implements Provider {
    @Override
    public MemberProduct2 produce() {
        return new LionProduct2();
    }
}
