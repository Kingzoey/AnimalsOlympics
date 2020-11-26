package com.olympics.prototype;

class trophy implements Cloneable
{
    String name;
    String info;
    String sponsor;
    trophy(String name,String info,String college)
    {
        this.name=name;
        this.info=info;
        this.sponsor=sponsor;
        System.out.println("奖杯创建成功！");
    }
    void setName(String name)
    {
        this.name=name;
    }
    String getName()
    {
        return(this.name);
    }
    void display()
    {
        System.out.println(name+info+sponsor);
    }
    public Object clone() throws CloneNotSupportedException
    {
        System.out.println("奖杯拷贝成功！");
        return (trophy)super.clone();
    }
}
