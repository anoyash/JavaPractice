/*
 * Commmon Functions for enum class 
 *  WeekDays.values()
 *  WeekDays.ordinal()
 *  WeekDays.valueof()
 *  WeekDays.name()
 */
enum WeekDays {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDENSDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}

public class SampleEnum {
    public static void main(String[] args) {

        for (WeekDays weeks : WeekDays.values())
            System.out.println(weeks);

        for (WeekDays weeks : WeekDays.values())
            System.out.println(weeks.ordinal());

        WeekDays week = WeekDays.valueOf("FRIDAY");
        System.out.println("Value of using , Week is : " + week + " " + week.name());
    }
}