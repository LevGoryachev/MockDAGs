package ru.goryachev.mockdags;

import lombok.Data;

import java.util.LinkedHashMap;

@Data
public class DagRequestDto {
    private LinkedHashMap<String, Object> conf;
}
