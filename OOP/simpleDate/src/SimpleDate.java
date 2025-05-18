
public class SimpleDate {
    private int day;
    private int month;
    private int yaer;

    public SimpleDate(int day, int month, int yaer) {
        this.day = day;
        this.month = month;
        this.yaer = yaer;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        SimpleDate that = (SimpleDate) obj;
        return day == that.day && month == that.month && yaer == that.yaer;
    }

}

