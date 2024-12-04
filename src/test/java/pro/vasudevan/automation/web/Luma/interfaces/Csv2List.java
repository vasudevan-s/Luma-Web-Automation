package pro.vasudevan.automation.web.Luma.interfaces;

import org.junit.jupiter.params.aggregator.AggregateWith;
import pro.vasudevan.automation.web.Luma.helpers.CSVDataAggregator2List;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
Created By: Vasudevan Sampath
Csv2List.java is a custom annotation used in test methods needing multiple params for parsing test data
*/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
@AggregateWith(CSVDataAggregator2List.class)
public @interface Csv2List {}