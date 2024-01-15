import greenfoot.*; 

public class Help extends World
{

    /**
     * Constructor for objects of class Help.
     * 
     */
    public Help()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(620, 339, 1); 
        //memanggil tombol kembali
        addObject(new Kembali(),501,300);
       
    }
}
