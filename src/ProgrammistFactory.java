public class ProgrammistFactory extends HumanFactory
{
    @Override
    public IHuman getInstance() {
        return new Programmist();
    }
}

