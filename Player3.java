import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player3 extends Karakter
{
private GreenfootImage punching1;
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
    
    public Player3(){
        punching1 = new GreenfootImage("KenPunching1.png");
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
                setImage("KenWalking2.png");
            if(walkTimer == 6){
                setImage("KenWalking3.png");
                }
            if(walkTimer == 11)
                setImage("KenWalking2.png");
            if(walkTimer == 16)
                setImage("KenWalking3.png");
            if(walkTimer == 21)
            {
                setImage("KenWalking2.png");
                walkTimer = 0;
            }

        }
    else
    { 
        if(hitPlayer2 == 0 && contact(Player1.class)&& p2Tahan == 0) 
        {
        maju = 0;
        player1Diam = 0;
        setImage("KenWalking1.png");
        gerakAimundur = 0;
        
        }
        }
     
}


public void tahan(){
    if (hitPlayer3 == 1 && contact(Player1.class)){
        p3Tahan = 1 ;
        setImage("KenBlocking.png");
        
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
                setImage("KenWalking4.png");
            if(walkTimer2 == 6)
                setImage("KenWalking5.png");
            if(walkTimer2 == 11)
                setImage("KenWalking6.png");
            if(walkTimer2 == 16)
                setImage("KenWalking5.png");
            if(walkTimer2 == 21)
            {
                setImage("KenWalking4.png");
                walkTimer2 = 0;
            }
        }
 //apabila AI pada posisi x = 590 atau pojok kanan maka AI akan dalam mode bertahan
 if( getX()>= 540){
    p3Tahan = 1;
    setImage("KenBlocking.png");
    
    
    }
 
    if (contact(Player1.class)){
        
        setImage("KenBlocking.png");
        
    }
  
}

public void gerakMajulagi(){
//saat AI telah gerak mundur dan timer = 50 maka AI akan gerak maju lagi
if ( gerakAimundur == 50 )
    {
    maju = 1 ;
    p3Tahan = 0;
    gerakAimaju = 0;
    punchke = 0;
    
    
    }

}
//AI melakukan tinju apabila kontak dengan player
public void serang(){
     if (contact(Player1.class) && punchke < 1 )
    {
        setImage(punching1);
        punchTimer++;
    } 
    
   
            if (contact(Player1.class)&& punchTimer == 7 && getImage() == punching1 )
                {
                    setImage(punching1);
                    isPunching = true;
                    hitPlayer1 = 1;
                    gerakAimaju = 300;
                }
               
            if (isPunching)
                {
                    setImage("KenWalking1.png");
                    isPunching = false;
                    punchTimer = 0;
                    punchke = 1;
                }
            
} 
}
