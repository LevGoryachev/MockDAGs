package ru.goryachev.mockdags;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.sql.Timestamp;
import java.util.LinkedHashMap;


@JsonPropertyOrder({
        "conf",
        "dag_id",
        "dag_run_id",
        "end_date",
        "execution_date",
        "external_trigger",
        "logical_date",
        "start_date",
        "state"
})
@Data
public class DagResponseDto {
    public LinkedHashMap<String, Object> conf;
    @JsonProperty("dag_id")
    public String dagId;
    @JsonProperty("dag_run_id")
    public String dagRunId;
    @JsonProperty("end_date")
    public Timestamp endDate;
    @JsonProperty("execution_date")
    public String executionDate;
    @JsonProperty("external_trigger")
    public Boolean externalTrigger;
    @JsonProperty("logical_date")
    public String logicalDate;
    @JsonProperty("start_date")
    public Timestamp startDate;
    @JsonProperty("state")
    public String state;
}
