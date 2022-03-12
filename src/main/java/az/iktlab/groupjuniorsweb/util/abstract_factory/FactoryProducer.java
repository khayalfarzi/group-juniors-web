package az.iktlab.groupjuniorsweb.util.abstract_factory;

public class FactoryProducer {
    public static AbstractFactory getFactory() {
        return new CarFactory();
    }
}
