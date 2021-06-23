package com.example.caching.domain;

public enum WeekdaySchedule {

    Monday(new Schedulable() {
        @Override
        public String getSchedule(WeekdaySchedule weekday) {
            return "Monday Schedule";
        }
    }),
    Tuesday(weekday -> "Tuesday Schedule"),
    Wednesday(weekday -> "Wednesday Schedule"),
    Thursday(weekday -> "Thursday Schedule"),
    Friday(weekday -> "Friday Schedule");

    private interface Schedulable {
        String getSchedule(WeekdaySchedule weekday);
    }

    private final Schedulable schedulable;

    WeekdaySchedule(Schedulable schedulable) {
        this.schedulable = schedulable;
    }

    String getSchedule(WeekdaySchedule weekday){
        return this.schedulable.getSchedule(weekday);
    }
}
