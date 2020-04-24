package at.pwimmer.metering.models;

import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.Objects;
import java.util.UUID;

public class EnergyMetric {
    private UUID meter;
    private Instant time;

    private long total;
    private long min;
    private long max;

    public EnergyMetric(UUID smartMeter, Instant time, long totalConsumption, long minConsumption, long maxConsumption) {
        this.meter = smartMeter;
        this.time = time;
        this.total = totalConsumption;
        this.max = maxConsumption;
        this.min = minConsumption;
    }

    public EnergyMetric(UUID smartMeter, long totalConsumption, long minConsumption, long maxConsumption) {
        this.meter = smartMeter;
        this.time = Instant.now();
        this.total = totalConsumption;
        this.max = maxConsumption;
        this.min = minConsumption;
    }

    public EnergyMetric(UUID smartMeter, ZonedDateTime dateTime, long totalConsumption, long minConsumption, long maxConsumption) {
        this.meter = smartMeter;
        this.time = dateTime.toInstant();
        this.total = totalConsumption;
        this.max = maxConsumption;
        this.min = minConsumption;
    }

    public EnergyMetric() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EnergyMetric)) return false;
        EnergyMetric that = (EnergyMetric) o;
        return total == that.total &&
                min == that.min &&
                max == that.max &&
                meter.equals(that.meter) &&
                time.equals(that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meter, time, total, min, max);
    }

    public UUID getMeter() {
        return meter;
    }

    public void setMeter(UUID meter) {
        this.meter = meter;
    }

    public Instant getTime() {
        return time;
    }

    public void setTime(Instant time) {
        this.time = time;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public long getMin() {
        return min;
    }

    public void setMin(long min) {
        this.min = min;
    }

    public long getMax() {
        return max;
    }

    public void setMax(long max) {
        this.max = max;
    }
}