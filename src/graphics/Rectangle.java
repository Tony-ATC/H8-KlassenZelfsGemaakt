package graphics;

public class Rectangle {
    private final Object Rectangle;
    private int height;
    private int width;
    private int xPos;
    private int yPos;

    public void setHeight(int newHeight) {
        height = Math.abs(newHeight);
    }

    public int getHeight() {
        return height;
    }

    public void setWidth (int newWidth) {
        width = Math.abs(newWidth);
    }

    public int getWidth() {
        return width;
    }

    public void setPosition(int xPos, int yPos){
        this.xPos = xPos;
        this.yPos = yPos;

    }
    public int getXPosition(){
        return xPos;
    }
    public int getYPosition(){
        return yPos;
    }

    public void grow(int d) {
        this.height = getHeight()*Math.abs(d);
        this.width = Math.abs(d);
    }

    public double getArea() {
        return height*width;
    }

    public double getPerimeter() {
        return (width*2) + (height*2);
    }

    public Rectangle(int width, int height){
        this.setWidth(width);
        this.setHeight(height);
    }
    public Rectangle(int width, int height, int xPos, int yPos){
        this.setWidth(width);
        this.setHeight(height);
        this.setPosition(xPos, yPos);
    }
    
    public Rectangle(){
    }
}




/*public int[] setPosition() {
        int[] arrayPosition = new int[]{xPos,yPos};
        return arrayPosition;
    }*/