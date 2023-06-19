package carparkS;

public class DateAndTime {

    private int Pdate;
    private int Pmonth;
    private int Phours;
    private int Pminutes;
    
    public DateAndTime(int Pdate, int Pmonth, int Phours, int Pminutes) {
        super();
        this.Pdate = Pdate;
        this.Pmonth = Pmonth;
        this.Phours = Phours;
        this.Pminutes = Pminutes;

        
    }

    public int getPDate() {
        return Pdate;
    }

    public void setPDate(int Pdate) {
        this.Pdate = Pdate;
    }

    public int getPMonth() {
        return Pmonth;
    }

    public void setPMonth(int Pmonth) {
        this.Pmonth = Pmonth;
    }

    public int getPHours() {
        return Phours;
    }

    public void setPHours(int Phours) {
        this.Phours = Phours;
    }

    public int getPMinutes() {
        return Pminutes;
    }

    public void setPMinutes(int Pminutes) {
        this.Pminutes = Pminutes;
    }

}
