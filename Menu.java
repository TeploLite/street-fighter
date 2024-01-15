import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Menu extends World
{

    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700,438, 1);
        //memanggil tombol mulai, tombol bantuan, tombol keluar
        addObject(new Bantuan(),360,398);
        addObject(new Mulai(),100,400);
        addObject(new Exit(),600,400);
        

        
    }

}
