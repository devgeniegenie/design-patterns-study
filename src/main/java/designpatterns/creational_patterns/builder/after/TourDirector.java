package designpatterns.creational_patterns.builder.after;

import designpatterns.creational_patterns.builder.before.TourPlan;

import java.time.LocalDate;

public class TourDirector {

    private TourPlanBuilder tourPlanBuilder;

    public TourDirector(TourPlanBuilder tourPlanBuilder) {
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan cancunTrip() {
        return tourPlanBuilder.newInstance().title("칸쿤 여행")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2022, 2, 22))
                .whereToStay("리조트")
                .addPlan(0, "체크인")
                .addPlan(1, "낮잠")
                .getPlan();
    }

    public TourPlan longBeachTrip() {
        return tourPlanBuilder.newInstance().title("비치")
                .startDate(LocalDate.of(2022, 2, 23))
                .getPlan();
    }
}
