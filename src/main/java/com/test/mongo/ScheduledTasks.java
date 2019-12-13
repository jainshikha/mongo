package com.test.mongo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Component
public class ScheduledTasks {
    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    @Scheduled(fixedRate = 60000)
    public void scheduleTaskWithFixedRate() {

        System.out.println("scheduleTaskWithFixedRate " + dateTimeFormatter.format(LocalDateTime.now()));
        Candle candle = new Candle();
        candle.setInstrumentToken(260617L);
/*        candle.setOpenAt();
        candle.setCloseAt();
        candle.getHigh();
        candle.getLow();
        List<Candle> _list = new ArrayList<Candle>();
        _list.add(14);
        _list.add(52);
        _list.add(26);
        _list.add(4);
        _list.add(57);
        _list.add(6);
        get_ochl(_list);*/
    }
    public static void get_ochl(List<Integer> list)
    {
        // Displaying ArrayList elements
        System.out.println("ArrayList contains: " + list);

        // Logic to get the last element from ArrayList
        IntSummaryStatistics summary = list.stream()
                .collect(Collectors.summarizingInt(Integer::intValue));
        if (list != null && !list.isEmpty()) {
            System.out.println("Max element is: "+ summary.getMax());
            System.out.println("Min element is: "+ summary.getMin());
            System.out.println("First element is: "+ list.get(0));
            System.out.println("Last element is: "+ list.get(list.size() - 1));
            return;
        }
    }
}