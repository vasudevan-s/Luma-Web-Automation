package pro.vasudevan.automation.web.Luma.helpers;

import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.aggregator.ArgumentsAggregationException;
import org.junit.jupiter.params.aggregator.ArgumentsAggregator;

import java.util.List;

/*
Created By: Vasudevan Sampath
CSVDataAggregator2List.java implements ArgumentsAggregator interface for aggregating parameters
*/
public class CSVDataAggregator2List implements ArgumentsAggregator {
    @Override
    public List<Object> aggregateArguments(ArgumentsAccessor accessor, ParameterContext context) throws ArgumentsAggregationException {
        return accessor.toList();
    }
}
