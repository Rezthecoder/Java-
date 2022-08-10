public class PC {
    private Case theCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

public void pressPowerButton(){
    theCase.pressPowerButton();
    monitor.drawPixelAt(1500,1200,"red");
    motherBoard.loadProgram("Windows 11");
}

    public Case getTheCase() {
        return theCase;
    }

    public void setTheCase(Case theCase) {
        this.theCase = theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public MotherBoard getMotherboard() {
        return motherBoard;
    }

    public void setMotherboard(MotherBoard motherboard) {
        this.motherBoard = motherboard;
    }


    public PC(Case theCase, Monitor monitor, MotherBoard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherBoard = motherboard;
    }
}
