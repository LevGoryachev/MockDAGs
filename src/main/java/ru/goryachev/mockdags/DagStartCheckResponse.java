package ru.goryachev.mockdags;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;


@JsonPropertyOrder({
        "dag_id",
        "duration",
        "end_date",
        "execution_date",
        "executor_config",
        "hostname",
        "max_tries",
        "operator",
        "pid",
        "pool",
        "pool_slots",
        "priority_weight",
        "queue",
        "queued_when",
        "sla_miss",
        "start_date",
        "state",
        "task_id",
        "try_number",
        "unixname"
})
@Data
public class DagStartCheckResponse {
    @JsonProperty("dag_id")
    private String dagId;
    @JsonProperty("duration")
    private Double duration;
    @JsonProperty("end_date")
    private String endDate;
    @JsonProperty("execution_date")
    private String executionDate;
    @JsonProperty("executor_config")
    private String executorConfig;
    @JsonProperty("hostname")
    private String hostname;
    @JsonProperty("max_tries")
    private Integer maxTries;
    @JsonProperty("operator")
    private String operator;
    @JsonProperty("pid")
    private Integer pid;
    @JsonProperty("pool")
    private String pool;
    @JsonProperty("pool_slots")
    private Integer poolSlots;
    @JsonProperty("priority_weight")
    private Integer priorityWeight;
    @JsonProperty("queue")
    private String queue;
    @JsonProperty("queued_when")
    private String queuedWhen;
    @JsonProperty("sla_miss")
    private String slaMiss;
    @JsonProperty("start_date")
    private String startDate;
    @JsonProperty("state")
    private String state;
    @JsonProperty("task_id")
    private String taskId;
    @JsonProperty("try_number")
    private Integer tryNumber;
    @JsonProperty("unixname")
    private String unixname;
}
