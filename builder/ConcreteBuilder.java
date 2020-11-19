public class ConcreteBuilder implements ICarBuilder
{
    Team team;

    public ConcreteBuilder()
    {
        team = new Team();
    }

    @Override
    public void buildPlayer1()
    {
        team.setPlayer1("狮子");
    }

    @Override
    public void buildPlayer2()
    {
        team.setPlayer2("老虎");
    }
    
    @Override
    public Team buildTeam()
    {
        return this.team;
    }
}
