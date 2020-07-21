package com.demo.homework1;

public interface shape {
    int area();
}

class Rectangle implements shape {
    int x = 100;
    int y = 200;
    int width = 120;
    int height = 120;

    @Override
    public int area() {
        return width+height;
    }
    @Override
    public String toString() {
        return "rect:"+x+","+y;
    }
}

class Circle implements shape {
    int x = 100;
    int y = 200;
    int radius = 60;

    @Override
    public int area (){
        return (int) (radius*radius*Math.PI);
    }
    @Override
    public String toString() {
        return "Circle:" + x + "," + y;
    }
}