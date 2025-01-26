package org.example;

import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Main {
    private static int countOfBlocks = 0;
    public static void main(String[] args) throws IOException, ParseException {
        String csvFilePath = args[0];
        String targetDateString = args[1];

        List<DateFields> beans = new CsvToBeanBuilder<DateFields>(new FileReader(csvFilePath))
                .withType(DateFields.class)
                .build()
                .parse();
        SimpleDateFormat csvDateFormat = new SimpleDateFormat("yyyy.MM.dd");
        SimpleDateFormat targetDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date targetDate = targetDateFormat.parse(targetDateString);

        for (DateFields bean : beans){
            Date beginBlock = csvDateFormat.parse(bean.getBeginBlock());
            Date endBlock = csvDateFormat.parse(bean.getEndBlock());
            if (targetDate.compareTo(beginBlock) >= 0 && targetDate.compareTo(endBlock) <=0){
                countOfBlocks++;
            }
        }
        System.out.println("Всего ограничений " + targetDateString + ": " + csvDateFormat);
    }
}