package graphics;

public class RectangleApp {
    public static void main(String[] args) {
        System.out.println("This Program uses a rectangle");
        Rectangle rect1 = new Rectangle(10,20);
        Rectangle rect2 = new Rectangle(20, 40);
        Rectangle rect3 = new Rectangle(4, 7);
        Rectangle rect4 = new Rectangle(2, 4, 5, 6);

        rect1.setHeight(10);
        rect1.setWidth(20);
        rect1.setPosition(2,4);

        rect2.setHeight(20);
        rect2.setWidth(40);
        rect2.setPosition(4,8);

        System.out.println("Parameters Rect 1");
        System.out.println("height rect1: " + rect1.getHeight());
        System.out.println("width rect1: " + rect1.getWidth());
        System.out.println("xPos rect1: " + rect1.getXPosition());
        System.out.println("yPos rect1: " + rect1.getYPosition());
        System.out.println("Area rect1: " + rect1.getArea());
        System.out.println("Perimeter rect1: " + rect1.getPerimeter());

        System.out.println("----------------");

        System.out.println("Parameters Rect 2");
        System.out.println("height rect2: " + rect2.getHeight());
        System.out.println("width rect2: " + rect2.getWidth());
        System.out.println("xPos rect2: " + rect2.getXPosition());
        System.out.println("yPos rect2: " + rect2.getYPosition());
        System.out.println("Area rect2: " + rect2.getArea());
        System.out.println("Perimeter rect2: " + rect2.getPerimeter());

        System.out.println("----------------");

        System.out.println("Parameters Rect 3");
        System.out.println("height rect3: " + rect3.getHeight());
        System.out.println("width rect3: " + rect3.getWidth());

        System.out.println("----------------");

        System.out.println("Parameters Rect 4");
        System.out.println("height rect4: " + rect4.getHeight());
        System.out.println("width rect4: " + rect4.getWidth());
        System.out.println("xPos rect4: " + rect4.getXPosition());
        System.out.println("yPos rect4: " + rect4.getYPosition());
    }
}
