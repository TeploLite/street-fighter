import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Kalah extends World
{

    /**
     * Constructor for objects of class Kalah.
     * 
     */
    public Kalah()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(620, 339, 1); 
        //memanggil objek kata kalah, tombol ulangi, tombol kembali
        addObject(new p2wins(),312,53);
        addObject(new Ulangi(),204,300);
        addObject(new Kembali(),389,300); 
    }
}
