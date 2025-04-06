package desafio.banco.springboot.dto;

import java.util.DoubleSummaryStatistics;

public class StatisticsResponse {
    private long count;
    private double sum;
    private double min;
    private double max;
    private double avg;

    public StatisticsResponse(DoubleSummaryStatistics stats) {
        this.count = stats.getCount();
        this.sum = stats.getSum();
        this.min = stats.getMin();
        this.max = stats.getMax();
        this.avg = stats.getAverage();
    }

    public long getCount() {
        return count;
    }
    public double getSum() {
        return sum;
    }
    public double getMin() {
        return min;
    }
    public double getMax() {
        return max;
    }
    public double getAvg() {
        return avg;
    }
    
}
