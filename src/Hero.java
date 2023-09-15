public class Hero {
    private int Helf;
    private int uron;
    private String seperPauer;


    public int getHelf() {
        return Helf;
    }

    public int getUron() {
        return uron;
    }

    public String getSeperPauer() {
        return seperPauer;
    }

    public Hero(int helf, int uron, String seperPauer) {
        Helf = helf;
        this.uron = uron;
        this.seperPauer = seperPauer;
    }

    public Hero(int helf, int uron) {
        Helf = helf;
        this.uron = uron;
    }
}