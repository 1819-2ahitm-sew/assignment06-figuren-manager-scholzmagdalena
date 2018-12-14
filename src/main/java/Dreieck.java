public class Dreieck extends Figure {

    private int seite1;
    private int seite2;
    private int winkel;

    public Dreieck(int seite1, int seite2, int winkel) {
        this.seite1 = seite1;
        this.seite2 = seite2;
        this.winkel = winkel;
    }

    public Dreieck() {
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double circumference() {
        return 0;
    }

    @Override
    public String output() {
        return String.format("Dreieck mit Seite 1 -> %d, Seite 2 -> %d, Winkel -> %d",seite1, seite2, winkel );
    }

    public int getSeite1() {
        return seite1;
    }

    public void setSeite1(int seite1) {
        this.seite1 = seite1;
    }

    public int getSeite2() {
        return seite2;
    }

    public void setSeite2(int seite2) {
        this.seite2 = seite2;
    }

    public int getWinkel() {
        return winkel;
    }

    public void setWinkel(int winkel) {
        this.winkel = winkel;
    }
}
