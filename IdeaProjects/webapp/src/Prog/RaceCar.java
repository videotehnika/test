package Prog;

/**
 * Created  on 20.07.2016.
 */
public class RaceCar extends AbstractCar {
public void driveCar (){
        System.out.println("Drive Csr at " + speed *2 + " Miles per our");
    }

    @Override
    public double getEngineVolume() {
        return 2.5;
    }
}
