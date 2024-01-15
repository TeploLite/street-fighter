import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class count extends Karakter
{
    //untuk mengatur hitung mundur sebelum permainan
    private int hitung = 0;
    /**
     * Act - do whatever the count wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        hitung ++;
        if (hitung == 40){
            setImage("3.png");
       }
       if (hitung == 90){
           setImage("2.png");
       }
       if (hitung == 130){
           setImage("1.png");
       }
       if (hitung == 160){
           setImage("fight.png");
       }
       if (hitung == 185){
           getWorld().removeObject(this);
       }
    }    
}
