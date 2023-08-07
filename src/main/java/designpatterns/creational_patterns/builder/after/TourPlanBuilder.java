package designpatterns.creational_patterns.builder.after;

import designpatterns.creational_patterns.builder.before.TourPlan;

import java.time.LocalDate;

public interface TourPlanBuilder {

    TourPlanBuilder newInstance();

    TourPlanBuilder title(String title);

    TourPlanBuilder nightsAndDays(int night, int days);

    TourPlanBuilder startDate(LocalDate localDate);

    TourPlanBuilder whereToStay(String whereToStay);

    TourPlanBuilder addPlan(int day, String plan);

    TourPlan getPlan();

}
