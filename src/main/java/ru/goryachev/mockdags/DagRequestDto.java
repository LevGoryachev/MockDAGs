package ru.goryachev.mockdags;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.util.LinkedHashMap;

@JsonPropertyOrder({
        "conf",
        "dag_run_id",
        "logical_date",
        "state"
})
@Data
public class DagRequestDto {
    /*@JsonProperty("conf")
    private LinkedHashMap<String, Object> conf;*/
    @JsonProperty("conf")
    public Object conf;
    /*@JsonProperty("dag_run_id")
    private String dagRunId;*/
    @JsonProperty("logical_date")
    private String logicalDate;
    /*@JsonProperty("state")
    private String state;*/
}
