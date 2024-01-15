import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Darah2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Darah3 extends Karakter
{
public String[] life =
{"LifeBar.png", "LifeBar2.png", "LifeBar3.png", "LifeBar4.png", "LifeBar5.png", "LifeBar6.png", 
"LifeBar7.png", "LifeBar8.png", "LifeBar9.png", "LifeBar10.png", "LifeBar11.png", 
"LifeBar12.png", "LifeBar13.png", "LifeBar14.png", "LifeBar15.png", "LifeBar16.png"}; 
private int damageApplier;
public boolean isHit;
int health = 10;
int healthBarWidth = 150;
int healthBarHeight = 15;
int pixelsPerHealthPoint = (int)healthBarWidth/health; 

public Darah3(){
    damageApplier = 0;
    isHit  = false;
    kenaP1 = lifePlayer3;
}
    //untuk mengupdate bar darah
    public void act() 
    {
    //apabila terkena tinju oleh player namum AI menahan maka tidak mengurangi darah     
        if ( p3Tahan == 1 && hitPlayer3 ==1 )
    {
        hitPlayer3 = 0;
        p3Tahan = 0;
        Greenfoot.playSound("Punch.wav");
    }
    //apabila terkena tinju oleh player namum AI tidak menahan maka akan mengurangi darah 
         if ( p3Tahan == 0 && hitPlayer3 ==1 )
    {
        hitPlayer3 = 0;
        isHit = true;
        if (damageApplier == 0)
        {
            lifePlayer3++;
            damageApplier = 1;
            Greenfoot.playSound("pukul.wav");
            health--;
        }
    }
        if (damageApplier > 0 && !Greenfoot.isKeyDown("space")  )
    {
        damageApplier = 0;
        isHit = false;
    }
        update();
    }
    //untuk menampilkan bar darah
     public void update(){
        setImage(new GreenfootImage(healthBarWidth + 2, 35 ));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.WHITE);
        myImage.drawRect(0,0,healthBarWidth+1, healthBarHeight+1);
        myImage.setColor(Color.BLACK);
        myImage.fillRect(1,1,healthBarWidth, healthBarHeight );
        myImage.setColor(Color.RED);
        myImage.fillRect(1,1,health*pixelsPerHealthPoint, healthBarHeight );
        if (health == 0 ){
        sound.stop();
        Greenfoot.setWorld(new menang2());
        Greenfoot.playSound("menang.wav");
        }
    }
}
