package com.cognizant.ciqdashboardapi.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Document(collection = "source_skygrade_assurance")
public class SourceSkygradeAssurance {

    @Id
    private String id;
    private String projectId;
    private String projectName;
    private String projectKey;
    private String environment;
    private String statusName;
    private String projectTypeName;
    private String key;
    private Date startDate;
    private Date endDate;
    private double usage;
    private double cost;
}
