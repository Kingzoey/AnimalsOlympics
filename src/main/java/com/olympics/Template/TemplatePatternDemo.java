package com.olympics.Template;

public class TemplatePatternDemo {
    public static void main(String[] args) {

        System.out.println("现在开始模拟模板模式，对篮球赛和足球赛进行模拟。");
        Game game = new Basketball();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
