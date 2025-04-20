import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Baguette extends Actor
{
    public void act()
    {
        move(-3);
        
        if(getX() <=0) {
            resetBaguette();
        }
        
        if(isTouching(Hero.class)) {
            //add gameover symbol
            GameOver gameEnd = new GameOver();
            getWorld().addObject(gameEnd, 300, 200);
            getWorld().removeObject(this);
        }
    }
    
    public void resetBaguette() {
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0) {
            setLocation(600, 100);
        } else {
            setLocation(600, 300);
        }
    }
}
