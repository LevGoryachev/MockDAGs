package ru.goryachev.mockdags;

import lombok.Data;

import java.util.List;

@Data
public class ArpDecomApprovalRequestDto {
    private String param1;
    List<String> decomHeaderRk;
}
