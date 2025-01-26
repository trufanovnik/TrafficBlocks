package org.example;

import com.opencsv.bean.CsvBindByName;
import lombok.Getter;

public class DateFields {
    @Getter
    @CsvBindByName(column = "Дата начала ограничения", required = true)
    private String beginBlock;

    @Getter
    @CsvBindByName(column = "Дата снятия ограничения", required = true)
    private String endBlock;
}
