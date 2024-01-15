import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Arena1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arena1 extends World
{
    public Arena1()
    {    
        super(620, 385, 1);
        /*memanggil objek gambar player, gambar AI, bardarah player, bardarah AI, 
        tampilan hitung mundur*/
        addObject(new Player1(), 100, 335);
        addObject(new Player2(), 520, 325);
        addObject(new Darah1(), 100, 35);
        addObject(new Darah2(), 520, 35);
        addObject(new count(), 304, 187);
        showText("Level 1",310,35);
        
    }

}
