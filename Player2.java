import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CopyOfPlayer2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player2 extends Karakter
{
private GreenfootImage punching1;
private GreenfootImage punching2;
private boolean isPunching;
private boolean isWalking;
private int punchTimer;
private int walkTimer;
private int walkTimer2;
private int sTimer;
private int lifeSpawn;
private int gerakAimaju = 0;
private int punchke = 0;
private int gerakAimundur = 0;
private int gayaTimer = 0;
private int maju = 0;
private int mundur = 0;
private int kena = 0;
private int player1Diam = 0;
private double a;
private int mulai = 0;
private int hit = 0;
private boolean gerak = false;



    public void act() 
    {
        gerakMaju();
        gerakMundur();
        serang();
        gerakMajulagi();

    }
    
    public Player2(){
        punching1 = new GreenfootImage("SagatKick1.png");
        punching2 = new GreenfootImage("SagatKick2.png");
        isPunching = false;    
        isWalking = false;
        punchTimer = 0;
        walkTimer = 0;
        walkTimer2 = 0;
        sTimer = 0;
        lifeSpawn = 0;
        a = 295/100;
    }
    //untuk gerak maju AI
    public void gerakMaju(){
    mulai ++;
    if (mulai == 150){
        Greenfoot.playSound("fight3.mp3");
    }
    if (mulai == 200){
        gerak=true;
    }
    if (gerakAimaju <= 300 && !contact(Player1.class) && mundur == 0 && punchke == 0 && gerak)
    { 
        
        move(-3);
        walkTimer ++;
        gerakAimaju ++;
   
            if(walkTimer == 0)
                setImage("SagatWalk1.png");
            if(walkTimer == 6){
                setImage("SagatWalk1.png");
                }
            if(walkTimer == 11)
                setImage("SagatWalk3.png");
            if(walkTimer == 16)
                setImage("SagatWalk2.png");
            if(walkTimer == 21)
            {
                setImage("SagatWalk2.png");
                walkTimer = 0;
            }

        }
    else
    { 
        if(hitPlayer2 == 0 && contact(Player1.class)&& p2Tahan == 0) 
        {
        maju = 0;
        player1Diam = 0;
        setImage("SagatWalk1.png");
        gerakAimundur = 0;
        
        }
        }
     
}


public void tahan(){
    if (hitPlayer2 == 1 && contact(Player1.class)){
        p2Tahan = 1 ;
        setImage("sagatBlock.png");
        
    }


}

//untuk gerak mundur AI
public void gerakMundur(){

 if ( punchke == 1 && gerakAimundur <= 50 && maju == 0 )
    {
         
         move (3);
         walkTimer2 ++;
         gerakAimundur ++;
        

            if(walkTimer2 == 0)
                setImage("SagatWalk2.png");
            if(walkTimer2 == 6)
                setImage("SagatWalk3.png");
            if(walkTimer2 == 11)
                setImage("SagatWalk4.png");
            if(walkTimer2 == 16)
                setImage("SagatWalk5.png");
            if(walkTimer2 == 21)
            {
                setImage("SagatWalk6.png");
                walkTimer2 = 0;
            }
        }
 //apabila AI pada posisi x = 590 atau pojok kanan maka AI akan dalam mode bertahan
 if( getX()>= 590){
    p2Tahan = 1;
    setImage("SagatBlock.png");
    
    
    }
 
    if (contact(Player1.class)){
        
        setImage("SagatBlock.png");
        
    }
  
}

public void gerakMajulagi(){
//saat AI telah gerak mundur dan timer = 50 maka AI akan gerak maju lagi
if ( gerakAimundur == 50 )
    {
    maju = 1 ;
    p2Tahan = 0;
    gerakAimaju = 0;
    punchke = 0;
    
    
    }

}
//AI melakukan tinju apabila kontak dengan player
public void serang(){
     if (contact(Player1.class) && punchke < 1 )
    {
        setImage(punching2);
        punchTimer++;
    } 
    
   
            if (contact(Player1.class)&& punchTimer == 7 && getImage() == punching2 )
                {
                    setImage(punching2);
                    isPunching = true;
                    hitPlayer1 = 1;
                    gerakAimaju = 300;
                }
               
            if (isPunching)
                {
                    setImage("SagatWalk1.png");
                    isPunching = false;
                    punchTimer = 0;
                    punchke = 1;
                }
            
}

 
}




