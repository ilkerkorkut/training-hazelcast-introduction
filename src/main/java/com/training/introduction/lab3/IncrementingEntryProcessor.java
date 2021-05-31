package com.training.introduction.lab3;

import com.hazelcast.map.EntryProcessor;

import java.util.Map;

public class IncrementingEntryProcessor implements EntryProcessor<Integer, Integer, Integer> {

    public Integer process(Map.Entry<Integer, Integer> entry) {
        Integer value = entry.getValue();
        entry.setValue(value + 1);
        return value + 1;
    }

    @Override
    public EntryProcessor<Integer, Integer, Integer> getBackupProcessor() {
        return IncrementingEntryProcessor.this;
    }
}
