package com.example.desafio_itau.DTO;

import lombok.Data;

import java.util.DoubleSummaryStatistics;

@Data
public class TransactionStatistics {

    private DoubleSummaryStatistics statistics;
    private Double average;
    private Double max;
    private Double min;
    private Long count;
    private Double sum;

    //preciso fazer um construtor que recebe DoubleSummaryStatistics?
    public TransactionStatistics(DoubleSummaryStatistics statistics) {
        this.statistics = statistics;
        this.average = statistics.getAverage();
        this.max = statistics.getMax();
        this.min = statistics.getMin();
        this.count = statistics.getCount();
        this.sum = statistics.getSum();
    }
}
