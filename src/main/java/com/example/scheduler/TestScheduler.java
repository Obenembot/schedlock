package com.example.scheduler;

@Profile({"test"})
@Component
public class TestScheduler {


    @Scheduled(fixedDelay = 1 * 60 * 1000l)
    @SchedulerLock(name = "predictVehicles", lockAtMostFor = "50s", lockAtLeastFor = "30s")
    protected synchronized void predictVehicles() {


    }
}
