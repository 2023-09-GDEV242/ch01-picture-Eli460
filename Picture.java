/**
 * This is a basketball court with the squares representing the hooop
 * the triangle representing the rim and a scene of 2 people playing 
 * basketball outside at the park

 * @author  Elisha White 
 * @version 2022.09.10
 */
public class Picture 
{
    private Square court;
    private Square window;
    private Triangle rim;
    private Circle sun;
    private boolean drawn;
    private Square line1;
    private Person player;
    private Person player2;
    private Square hoop1;
    private Square hoop2;
    private Circle basketball;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        court = new Square();
        line1= new Square();
        hoop1 = new Square();
        hoop2 = new Square();
        //window = new Square();
        rim = new Triangle();  
        //sun = new Circle();
        player = new Person();
        player2 = new Person();
        basketball = new Circle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            court.moveHorizontal(-320);
            court.moveVertical(-320);
            court.changeSize(550);
            court.makeVisible();
            court.changeColor("blue");
            
            line1.changeColor("green");
            line1.moveHorizontal(-360);
            line1.moveVertical(100);
            line1.changeSize(550);
            line1.makeVisible();
        
            player.changeSize(80,40);
            player.moveHorizontal(100);
            player.moveVertical(25);
            player.makeVisible();
        
            player2.changeSize(80,40);
            player2.moveHorizontal(-50);
            player2.moveVertical(25);
            player2.makeVisible();
            
    
            hoop1.changeColor("white");
            hoop1.moveHorizontal(-250);
            hoop1.moveVertical(-55);
            hoop1.changeSize(80);
            hoop1.makeVisible();
        
            hoop2.changeColor("black");
            hoop2.moveHorizontal(-230);
            hoop2.moveVertical(-35);
            hoop2.changeSize(35);
            hoop2.makeVisible();
            
            rim.changeColor("orange");
            rim.changeSize(20, 30);
            rim.moveHorizontal(-65);
            rim.moveVertical(-15);
            rim.makeVisible();
        
            basketball.changeColor("orange");
            basketball.moveHorizontal(15);
            basketball.moveVertical(-10);
            basketball.changeSize(18);
            basketball.makeVisible();
            
            //window.changeColor("black");
            //window.moveHorizontal(-120);
            //window.moveVertical(40);
            //window.changeSize(40);
            //window.makeVisible();
    

    
            //sun.changeColor("yellow");
            //sun.moveHorizontal(100);
            //sun.moveVertical(-40);
            //sun.changeSize(80);
            //sun.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        court.changeColor("black");
         line1.changeColor("black");
         player.changeColor("white");
         player2.changeColor("white");
         hoop1.changeColor("white");
         hoop2.changeColor("black");
         rim.changeColor("white");
         basketball.changeColor("white");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        court.changeColor("green");
         line1.changeColor("blue");
         player.changeColor("yellow");
         player2.changeColor("yellow");
         hoop1.changeColor("white");
         hoop2.changeColor("black");
         rim.changeColor("white");
         basketball.changeColor("white");
    }
}
