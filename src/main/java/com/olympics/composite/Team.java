package com.olympics.composite;

import java.util.ArrayList;
import java.util.List;

public class Team extends Node {
    List<Node> nodeList = new ArrayList<>(); 

    public Team(String name) {
        super(name);
    }

    public void AddNode(Node node) {
        nodeList.add(node);
    }

    @Override
    public void show() {
        System.out.println("Team name:" + name + "  ");
        for (Node node : nodeList)
            node.show();
    }
}
