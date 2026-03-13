package Factory;

public class FactoryTransport implements Factory{
    @Override
    public PachetTuristic createPachete() {
        return new PachetTransport();
    }
}
