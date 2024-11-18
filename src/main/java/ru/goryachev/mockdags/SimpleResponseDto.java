package ru.goryachev.mockdags;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SimpleResponseDto {
    @JsonProperty("conf")
    public String message;
    @JsonProperty("dag_id")
    public Boolean isSuccess;
}
