package com.test.mongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.format.DateTimeFormatter;
import java.util.Date;

// Mongo database annotation.
@Document(collection= "Candle")
public class Candle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private long instrumentToken;
    private DateTimeFormatter openAt;
    private DateTimeFormatter closeAt;
    private double high;
    private double low;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getInstrumentToken() {
        return instrumentToken;
    }

    public void setInstrumentToken(long instrumentToken) {
        this.instrumentToken = instrumentToken;
    }

    public DateTimeFormatter getOpenAt() {
        return openAt;
    }

    public void setOpenAt(DateTimeFormatter openAt) {
        this.openAt = openAt;
    }

    public DateTimeFormatter getCloseAt() {
        return closeAt;
    }

    public void setCloseAt(DateTimeFormatter closeAt) {
        this.closeAt = closeAt;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public Candle() {
    }

    @Override
    public String toString() {
        return "Candle{" +
                "id=" + id + '\'' +
                ", instrumentToken=" + instrumentToken +
                ", openAt=" + openAt +
                ", closeAt=" + closeAt +
                ", high=" + high +
                ", low=" + low +
                '}';
    }
}