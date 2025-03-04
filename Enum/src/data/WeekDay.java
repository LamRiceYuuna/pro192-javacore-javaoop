/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author admin
 */
public enum WeekDay {
    Monday(3, 8, "sleep all day ", 10),
    Tuesday(1, 10, "play game   ", 15),
    Wednesday(0, 10, "hang out with LBzz ", 11),
    Thursday(2, 10, "LMAO with friend ", 20),
    Friday(4, 10, "sleep all day ", 21),
    Saturday(1, 10, "sleep all day ", 16),
    Sunday(0, 10, "sleep all day ", 16);

    int study_hours;
    int break_hours;
    String must_do_work;
    int time_of_must_do_work;

    WeekDay(int study_hours, int break_hours, String must_do_work, int time_of_must_do_work) {
        this.study_hours = study_hours;
        this.break_hours = break_hours;
        this.must_do_work = must_do_work;
        this.time_of_must_do_work = time_of_must_do_work;
    }

    public void disPlay() {
        System.out.println("Today is " + this.name());
        System.out.println("My study hours are: " + this.study_hours);
        System.out.println("My break hours are: " + this.break_hours);
        System.out.println("I must do " + this.must_do_work + "  at " + this.convertTimeTo12Hours());
    }

    public String convertTimeTo12Hours() {
        if (this.time_of_must_do_work > 12) {
            return this.time_of_must_do_work - 12 + "PM";
        }
        return this.time_of_must_do_work + "AM";

    }
    public static void doWorkInFreeTime(String d) {

        switch (d) {
            case "Monday":
                System.out.println("go to FPT university");
                WeekDay.Monday.disPlay();
                break;
            case "Tuesday":
                System.out.println(" Homework Exercise");
                WeekDay.Tuesday.disPlay();
                break;
            case "Wednesday":
                System.out.println("Go to FPT university");
                WeekDay.Wednesday.disPlay();
                break;
            case "Thursday":
                System.out.println("Play Game");
                WeekDay.Thursday.disPlay();
                break;
            case "Friday":
                System.out.println("Take Break ");
                WeekDay.Friday.disPlay();
                break;
            case "Saturday":
                System.out.println("Take Break");
                WeekDay.Saturday.disPlay();
                break;
            case "Sunday":
                System.out.println("Sleep all day!!!");
                WeekDay.Sunday.disPlay();
                break;
        
    }
}

}