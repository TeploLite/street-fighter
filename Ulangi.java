import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ulangi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ulangi extends Karakter
{
    /**
     * Act - do whatever the Ulangi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //untuk mengatur tombol ulangi
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("Clicked.mp3");
            
            Greenfoot.setWorld(new Arena1());
            sound.play();
        }
    }    
}
