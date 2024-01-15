import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mulai here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mulai extends Karakter
{
    public void act() 

    {
        //untuk mengatur tombol Mulai
        menusound.playLoop();
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("Clicked.mp3");
            menusound.stop();
            Greenfoot.setWorld(new Arena1());
            sound.play();
        }

    }    
}
