package interpreter;

public class AndExpression implements Expression {
    
    private Expression country=null;
    private Expression team=null;
    public AndExpression(Expression country, Expression team) {
        this.country = country;
        this.team = team;
    }
    @Override
    public boolean interpret(String context) {
        String s[]=context.split(" ");
        return country.interpret(s[0])&& team.interpret(s[1]);
    }
}
