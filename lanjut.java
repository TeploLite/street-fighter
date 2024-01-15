import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lanjut here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lanjut extends Karakter
{
    /**
     * Act - do whatever the lanjut wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("Clicked.mp3");
            
            Greenfoot.setWorld(new Arena2());
            sound.play();
        }
    }    
    
}
