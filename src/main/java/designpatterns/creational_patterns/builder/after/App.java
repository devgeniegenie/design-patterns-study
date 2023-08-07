package designpatterns.creational_patterns.builder.after;

import designpatterns.creational_patterns.builder.before.TourPlan;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        /*TourPlanBuilder builder = new DefaultTourBuilder();

        TourPlan plan = builder.title("칸쿤 여행")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2022, 2, 22))
                .whereToStay("리조트")
                .addPlan(0, "체크인")
                .addPlan(1, "낮잠")
                .getPlan();
        System.out.println(plan);

        TourPlan longBeachTrip = builder.title("비치")
                .startDate(LocalDate.of(2022, 2, 23))
                .getPlan();
        System.out.println(longBeachTrip);*/

        TourDirector director = new TourDirector(new DefaultTourBuilder());

        TourPlan tourPlan = director.cancunTrip();
        TourPlan tourPlan2 = director.longBeachTrip();
        System.out.println(tourPlan);
        System.out.println(tourPlan2);

    }
}
