package com.cognizant.ciqdashboardapi.models.chart.data;

import lombok.Data;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;


import java.util.List;
import java.util.Map;

@Data
public class YaxisCombineFusionChartData {

    public String chart;

    public List<Categories> categories;

    public DataSet dataset;

    public YaxisCombineFusionChartData(String chart, List<Categories> categories, DataSet dataset) {
        this.chart = chart;
        this.categories = categories;
        this.dataset = dataset;
    }
}
