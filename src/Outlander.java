public class Outlander extends Car {
    private int serviceMonthsService;

    public Outlander(int serviceMonthsService) {
        super("Outlander", "4WD", 4, 5, 6, false);
        this.serviceMonthsService = serviceMonthsService;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
            setCurrentGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10) {
            setCurrentGear(1);
        } else if (newVelocity > 10 && newVelocity <= 20) {
            setCurrentGear(2);
        } else if (newVelocity > 20 && newVelocity <= 30) {
            setCurrentGear(3);
        } else if (newVelocity > 30 && newVelocity <= 40) {
            setCurrentGear(4);

        }
        if (newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }


    }
    }
