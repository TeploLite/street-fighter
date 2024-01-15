import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Karakter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Karakter extends Actor
{
public int lifePlayer1 = 0;
public int lifePlayer2 = 0;
public int lifePlayer3 = 0;
static int hitPlayer1 = 0;
static int hitPlayer2 = 0;
static int hitPlayer3 = 0;
static int kenaP1 = 0;
static int p2Tahan = 0;
static int p3Tahan = 0;

static GreenfootSound sound = new GreenfootSound("arena.wav");
static GreenfootSound menusound = new GreenfootSound("sfx.wav");

    public void act() 
    {
       
    } 
    //untuk mengatur nilai arah
    public boolean contact(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        return actor != null;        
    }
    public void move(double distance)
    {
        double rotation = Math.toRadians(getRotation());
        distance *= getWorld().getCellSize(); 
        int x = getX() + (int)Math.round(Math.cos(rotation)*distance),
        y = getY() + (int)Math.round(Math.sin(rotation)*distance);
        setLocation(x, y);
     }
     

}
