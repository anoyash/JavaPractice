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

enum WeekObservation {

    MONDAY(101, "1st Day of Week") {
        @Override
        public String getComment() {
            return "I am overriden for MONDAY const";
        }

        public void dummyMethod() {
            System.out.println("Dummy method in monday");
        }
    },
    TUESDAY(102, "2nd Day of Week") {

        public void dummyMethod() {
            System.out.println("Dummy method in tuesday");
        }
    },
    WEDENSDAY(103, "3rd Day of Week") {

        public void dummyMethod() {
            System.out.println("Dummy method in Wednesday ");
        }
    },
    THURSDAY(104, "4th Day of Week") {

        public void dummyMethod() {
            System.out.println("Dummy method in thursday");
        }
    },
    FRIDAY(105, "5th Day of Week") {

        public void dummyMethod() {
            System.out.println("Dummy method in friday");
        }
    },
    SATURDAY(106, "6th Day of Week") {

        public void dummyMethod() {
            System.out.println("Dummy method in saturday");
        }
    },
    SUNDAY(107, "7th Day of Week") {

        public void dummyMethod() {
            System.out.println("Dummy method in sunday");
        }
    };

    int key;
    String comment;

    WeekObservation(int key, String comment) {
        this.key = key;
        this.comment = comment;
    }

    public int getVal() {
        return this.key;
    }

    public String getComment() {
        return this.comment;
    }

    public abstract void dummyMethod();
}

interface InnerSampleEnum {
    public abstract String toLowerString(String name);
}

enum EnumSampleInterface implements InnerSampleEnum {

    MONDAY,
    TUESDAY;

    @Override
    public String toLowerString(String name) {
        return this.name().toLowerCase();
    }
}

public class SampleEnum {
    public static void main(String[] args) {

        for (WeekDays weeks : WeekDays.values())
            System.out.println(weeks);

        for (WeekDays weeks : WeekDays.values())
            System.out.println(weeks.ordinal());

        WeekDays week = WeekDays.valueOf("FRIDAY");
        System.out.println("Value of using , Week is : " + week + " " + week.name());

        for (WeekObservation weekObs : WeekObservation.values())
            System.out.println(weekObs + " : " + weekObs.key + " : " + weekObs.comment);

        for (WeekObservation weekObs : WeekObservation.values())
            System.out.println(weekObs.ordinal());

        WeekObservation weekOb = WeekObservation.valueOf("FRIDAY");
        System.out.println("Value of using , Week is : " + weekOb + " " + weekOb.name());

        System.out.println(WeekObservation.TUESDAY.getComment());
        System.out.println(WeekObservation.MONDAY.getComment());
    }
}