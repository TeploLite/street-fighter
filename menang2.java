import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class menang2 extends World
{

    /**
     * Constructor for objects of class menang2.
     * 
     */
    public menang2()
    {    
         // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(620,339, 1);
        //memanggil objek kata menang, tombol ulangi, tombol kembali
        addObject(new p1wins(),312,53);
        addObject(new Ulangi(),204,300);
        addObject(new Kembali(),389,300); 
    }
}
