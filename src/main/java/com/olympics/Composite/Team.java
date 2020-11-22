package com.olympics.Composite;
import java.util.*;

public class Team extends Node{
    List<Node> nodeList =new ArrayList<Node>();
    public Team(String name)
    {
        super(name);
    }

    public void AddNode(Node node){
        nodeList.add(node);
    }
    @Override
    public void show()
    {
        System.out.println("Team name:"+name+"  ");
        for(Node node:nodeList)
            node.show();
    }
}
