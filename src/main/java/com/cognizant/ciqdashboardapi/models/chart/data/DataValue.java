package com.cognizant.ciqdashboardapi.models.chart.data;

import lombok.Data;

import java.util.List;

@Data
public class DataValue {

   public Integer value;

    public DataValue(Integer value) {
        this.value = value;
    }

    public DataValue() {
    }
}
