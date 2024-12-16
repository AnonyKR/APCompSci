public class StepTracker {
    int activeDays;
    int totalDays;
    int defActive;
    int stepTotal;
    
    public StepTracker(int defActive) {
        this.defActive = defActive;
        this.activeDays = 0;
        this.totalDays = 0;
        this.stepTotal = 0;
    }
    
    public void addDailySteps(int steps) {
        this.totalDays++;
        this.stepTotal += steps;
        if (steps >= this.defActive) {
            this.activeDays++;
        }
    }
    
    public int activeDays() {
        return this.activeDays;
    }
    
    public double averageSteps() {
        return (this.stepTotal / (double) this.totalDays);
    }
}