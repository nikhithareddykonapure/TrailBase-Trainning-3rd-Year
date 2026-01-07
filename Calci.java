package fourth.text;

public class Calci {
    Calculator cal;

    Calci(Calculator cal1) {
        this.cal = cal1;   // ✅ correct assignment
    }

    public int sum(int x, int y) {
        return cal.add(x, y);
    }
}
