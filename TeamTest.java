public class TeamTest
{
    public static void main(String[] args)
    {
        TeamDirector director = new TeamDirector();
        Team team = director.constructTeam(new ConcreteBuilder());
        System.out.println(team.getPlayer1());
        System.out.println(team.getPlayer2());
    }
}