public class GameEnemy {

    double width;
    double height;
    int positionX;
    int positionY;

    public GameEnemy() {
    }
    public GameEnemy(double width, double height) {
    }
    public GameEnemy(double width, double height, int positionX, int positionY) {
    }

    //    SET DIMENSION & POSITION
    public void setDimension(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public void setPosition(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    //    GET WIDTH, HEIGHT, X, Y
    public double getWidth() {
        return this.width;
    }
    public double getHeight() {
        return this.height;
    }
    public int getX() {
        return this.positionX;
    }
    public int getY() {
        return this.positionY;
    }

    //    RUN
    public void run() {
        System.out.println("Player is Running");
    }

}
