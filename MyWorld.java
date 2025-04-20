import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Hero guy = new Hero();
        addObject(guy, 100, 100);
        
        Baguette baguette = new Baguette();
        addObject(baguette, 600, 100);
    }
}
