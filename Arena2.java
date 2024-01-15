import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Arena2 extends World
{

    public Arena2()
    {    
       super(620, 385, 1);
        /*memanggil objek gambar player, gambar AI, bardarah player, bardarah AI, 
        tampilan hitung mundur*/
        addObject(new Player1(), 100, 333);
        addObject(new Player3(), 520, 340);
        addObject(new Darah1(), 100, 35);
        addObject(new Darah3(), 520, 35);
        addObject(new count(), 304, 187);
         showText("Level 2",310,35);
    }
}
