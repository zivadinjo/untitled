package day_48_encapsulation;

public class Square {

    private int side;

    public Square(int side) {
        setSide(side);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if (side > 0) {
            this.side = side;
        }
    }

}
