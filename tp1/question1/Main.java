package question1;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String args[]){
        Triangle triangle=new Triangle();
        Square square =new Square();
        Circle circle = new Circle();
        Circle circle2 = new Circle();
        circle.makeVisible();
        circle.moveHorizontal(100);
        circle.moveRight();
        triangle.makeVisible();
        triangle.moveVertical(40);
        triangle.moveLeft();
        square.makeVisible();
        square.moveDown();
        square.slowMoveHorizontal(40);
        circle2.makeVisible();
        circle2.moveUp();
        circle2.slowMoveVertical(70);
        circle2.changeSize(70);
        circle2.changeColor("black");

        
        //Canvas canvas = new Canvas("Canvas1",200,200,Color.BLUE);
        //canvas.setVisible(true);
    }
}
