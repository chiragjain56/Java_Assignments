package Unit5.DesignPatterns;

import java.util.Calendar;

public class _2Singleton {
    public static void main(String[] args) {
        Calendar.getInstance();
        //eager Init
        MyCalendarEagerLoaded calendar1= MyCalendarEagerLoaded.getMyCalendar();
        MyCalendarEagerLoaded calendar2= MyCalendarEagerLoaded.getMyCalendar();
        //MyCalendarEagerLoaded obj=new MyCalendarEagerLoaded();
        //System.out.println(obj==calendar2);
        System.out.println(calendar1==calendar2);

        //using enum
        CalendarWithEnum calendarWithEnum1 = CalendarWithEnum.UNIQUE_CALENDAR_OBJECT;
        CalendarWithEnum calendarWithEnum2 = CalendarWithEnum.UNIQUE_CALENDAR_OBJECT;
        System.out.println(calendarWithEnum2==calendarWithEnum1);

        //USING lazy loading
        MyCalendarWithLazyLoaded myCalendarWithLazyLoaded1=MyCalendarWithLazyLoaded.getMyCalendar();
        MyCalendarWithLazyLoaded myCalendarWithLazyLoaded2=MyCalendarWithLazyLoaded.getMyCalendar();
        System.out.println(myCalendarWithLazyLoaded1==myCalendarWithLazyLoaded2);
    }

}
//singleton class> only one object
//eager Init
 class MyCalendarEagerLoaded {
        //create an object
    private static MyCalendarEagerLoaded myCalendarObjectEagerLoaded =new MyCalendarEagerLoaded();
    public static MyCalendarEagerLoaded getMyCalendar() {
        return myCalendarObjectEagerLoaded;
    }
    private MyCalendarEagerLoaded(){}

}
//enum way
enum CalendarWithEnum {UNIQUE_CALENDAR_OBJECT}

//lazy loading way

class MyCalendarWithLazyLoaded{
    private static volatile MyCalendarWithLazyLoaded myCalendarObjectLazyLoaded;
    private MyCalendarWithLazyLoaded(){}
    public static synchronized MyCalendarWithLazyLoaded getMyCalendar(){
        if(myCalendarObjectLazyLoaded!=null){
            myCalendarObjectLazyLoaded=new MyCalendarWithLazyLoaded();
        }
        return myCalendarObjectLazyLoaded;
    }
}