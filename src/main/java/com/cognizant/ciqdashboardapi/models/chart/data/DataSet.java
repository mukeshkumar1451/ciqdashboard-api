package com.cognizant.ciqdashboardapi.models.chart.data;

import lombok.Data;

import java.util.List;

@Data
public class DataSet {

    public String seriesname;
    public List<DataValue> data;

    public DataSet(String seriesname, List<DataValue> data) {
        this.seriesname = seriesname;
        this.data = data;
    }

    public DataSet() {
    }

}
