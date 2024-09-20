public class KitchenerFactory extends HumanFactory
{
    @Override
    public IHuman getInstance() {
        return new Kitchener();
    }
}
