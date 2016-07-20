package Prog;

/**
 * Created  on 20.07.2016.
 */
public abstract class AbstractCar implements Car{
    protected int speed = 100;


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed + 10;
    }

    public void driveCar() {
        System.out.println("Drive Csr at " + speed + " Miles per our");
        }
}