import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Menang extends World
{

    /**
     * Constructor for objects of class Menang.
     * 
     */
    public Menang()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(620,339, 1);
        //memanggil objek kata menang, tombol ulangi, tombol kembali
        addObject(new p1wins(),312,53);
        addObject(new lanjut(),204,300);
        addObject(new kembali1(),389,300); 
        
    }
}
