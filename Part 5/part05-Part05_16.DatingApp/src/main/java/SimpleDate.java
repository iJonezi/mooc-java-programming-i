
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public void advance(){ // increase day by 1
        if (this.day == 30){ 
            this.day = 1;
            if (this.month == 12){ // last month of year
                this.month = 1;
                this.year++;
            } else {
                this.month++; // last day of month
            }
        } else {
            this.day++;
        }
    }
    
    public void advance(int howManyDays){
        if (this.day == 30){ // last day of month
            this.day = 1 + (howManyDays - 1); // day reset
            if (this.month == 12){ // last month of year
                this.month = 1;
                this.year++;
            } else {
                this.month++;
            }
        } else if ((this.day + howManyDays) > 30){ // if days added is over 30
            int count = 0;
            for (int i = this.day; i < 30; i++){ // get count of days between now and 30
                count++;
            }
            int over = howManyDays - count; // get amount of days over 30
            if(this.month == 12){
                this.month = 1;
                this.day = 1 + (over - 1);
                this.year++;
            } else {
                this.month++;
                this.day = 1 + (over - 1);
            }
        } else {
            this.day += howManyDays;
        }
    }
    
    public SimpleDate afterNumberOfDays(int howManyDays){
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        if (newDate.day == 30){ // last day of month
            newDate.day = 1 + (howManyDays - 1); // day reset
            if (newDate.month == 12){ // last month of year
                newDate.month = 1;
                newDate.year++;
            } else {
                newDate.month++;
            }
        } else if ((newDate.day + howManyDays) > 30){ // if days added is over 30
            int count = 0;
            for (int i = newDate.day; i < 30; i++){ // get count of days between now and 30
                count++;
            }
            int over = howManyDays - count; // get amount of days over 30
            if(newDate.month == 12){
                newDate.month = 1;
                newDate.day = 1 + (over - 1);
                newDate.year++;
            } else {
                newDate.month++;
                newDate.day = 1 + (over - 1);
            }
        } else {
            newDate.day += howManyDays;
        }
        return newDate;
    }

}
