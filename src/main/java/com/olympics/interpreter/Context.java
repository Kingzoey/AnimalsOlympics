package com.olympics.interpreter;

public class Context {
    private String[] countries = {"Chinese", "American"};
    private String[] teams = {"dragon", "hawk"};
    private Expression CountryTeam;

    public Context() {
        Expression country = new TerminalExpression(countries);
        Expression team = new TerminalExpression(teams);
        CountryTeam = new AndExpression(country, team);
    }

    public void result(String context) {
        boolean IfEnterFinal = CountryTeam.interpret(context);
        if (IfEnterFinal)
            System.out.println(context + " enters the final");
        else
            System.out.println(context + " doesn't enter the final");
    }

}
