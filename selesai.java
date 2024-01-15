import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class selesai here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class selesai extends World
{

    /**
     * Constructor for objects of class selesai.
     * 
     */
    public selesai()
    {    
         // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(620,339, 1);
        //memanggil objek kata menang, tombol ulangi, tombol kembali
        addObject(new p1wins(),312,53);
        addObject(new Ulangi(),204,300);
        addObject(new Kembali(),389,300); 
    }
}
