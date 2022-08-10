public class Bed {
    private String style;
    private int pillows;
    private int quilt;
    private int sheets;
    private int height;

    public Bed(String style, int pillows, int quilt, int sheets, int height) {
        this.style = style;
        this.pillows = pillows;
        this.quilt = quilt;
        this.sheets = sheets;
        this.height = height;
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getQuilt() {
        return quilt;
    }

    public int getSheets() {
        return sheets;
    }

    public int getHeight() {
        return height;
    }
    public void makeBed(){
        System.out.println("Bed-> making");
    }
}
