import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player1 extends Karakter
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
private boolean gerak = false;
private int mulai = 0;

    public void act() 
    {
        gerak();
        serang();
        
    } 
    
    public Player1(){
         punching1 = new GreenfootImage("RyuPunching1.png");
         punching2 = new GreenfootImage("RyuPunching2.png");
         isPunching = false;
         isWalking = false;
         punchTimer = 0;
         walkTimer = 0;
         walkTimer2 = 0;
         sTimer = 0;
         lifeSpawn = 0;
    
    }
    //untuk gerak maju
    public void gerak(){
    mulai ++;

    if (mulai == 200){
        gerak=true;
    } 
    if (Greenfoot.isKeyDown("right")&& !contact(Player2.class)&& gerak)
    { 
        move(3);
        walkTimer ++;

            if(walkTimer == 0)
                setImage("RyuWalking1.png");
            if(walkTimer == 6)
                setImage("RyuWalking1.png");
            if(walkTimer == 11)
                setImage("RyuWalking3.png");
            if(walkTimer == 16)
                setImage("RyuWalking2.png");
            if(walkTimer == 21)
            {
                setImage("RyuWalking2.png");
                walkTimer = 0;
            }

    }
     else
    {
        if(!Greenfoot.isKeyDown("left") && !Greenfoot.isKeyDown("right"))
        {
            setImage("RyuWalking1.png");
        }
        }
        //untuk gerak Mundur
    if (Greenfoot.isKeyDown("left")&&gerak) 
    {
        move(-3);
         walkTimer2 ++;

            if(walkTimer2 == 0)
        {
                setImage("RyuWalking2.png");
            }
            if(walkTimer2 == 6)
                setImage("RyuWalking3.png");
            if(walkTimer2 == 11)
                setImage("RyuWalking4.png");
            if(walkTimer2 == 16)
                setImage("RyuWalking5.png");
            if(walkTimer2 == 21)
            {
                setImage("RyuWalking6.png");
                walkTimer2 = 0;
            }
    
    }
    else
    {
        if(Greenfoot.isKeyDown("left") && Greenfoot.isKeyDown("space"))
        {
            setImage("RyuWalking1.png");
        }
        }
    
}
//untuk meninju
public void serang(){
    if (!isPunching && Greenfoot.isKeyDown("space") )
        {
            setImage(punching1);
            punchTimer++;
        //apabila tinju belum sampai pada timer 7 maka tinju gagal  
            if (Greenfoot.isKeyDown("space") && punchTimer == 7)
        {
            setImage(punching2);
            isPunching = true;
           
        }
        if (isPunching  && contact(Player2.class) &&  punchTimer == 7 && Greenfoot.isKeyDown("space") 
        &&!Greenfoot.isKeyDown("left"))
        {
            hitPlayer2 = 1;
        } 
        if (isPunching  && contact(Player3.class) &&  punchTimer == 7 && Greenfoot.isKeyDown("space") 
        &&!Greenfoot.isKeyDown("left"))
        {
            hitPlayer3 = 1;
        } 
    }
    if (!Greenfoot.isKeyDown("right")&&!Greenfoot.isKeyDown("left") && punchTimer == 7)
        {
            setImage(punching2);
        }

    if (isPunching && !Greenfoot.isKeyDown("space"))
        {
            setImage("RyuWalking1.png");
            isPunching = false;
            punchTimer = 0;
        }
     //untuk menahan
        if (Greenfoot.isKeyDown("down") &&!Greenfoot.isKeyDown("right") && !Greenfoot.isKeyDown("left")
        &&!Greenfoot.isKeyDown("space") )
    {
        setImage("RyuBlocking.png");
    } 
}
}
