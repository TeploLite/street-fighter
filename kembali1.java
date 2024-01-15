import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kembali1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kembali1 extends Karakter
{
    /**
     * Act - do whatever the kembali1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
         if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("Clicked.mp3");
            
            Greenfoot.setWorld(new Menu());
            menusound.play();
        }
    }    
}

