public abstract class Shape implements Locatable,Selectable {

    protected int x;
    protected int y;
    protected boolean selected;

    abstract double getArea();

    abstract double getPerimeter();

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setLocation(int x, int y){
        this.x = x;
        this.y = y;
    }

    public boolean getSelected(){
        return this.selected;
    }
    public void setSelected(boolean selected){
        this.selected = selected;
    }
    public boolean contains( int x, int y){
        return (this.x == x) && (this.y == y);
    }

}
