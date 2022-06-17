package ru.goryachev.mockdags;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/v1/dags")
@RequiredArgsConstructor
public class DagsController {

    @PostMapping("/{dagId}/dagRuns")
    public ResponseEntity<DagRunsResponseDto> create(@PathVariable("dagId") String dagId, @RequestBody ArpDecomApprovalRequestDto arpDecomApprovalRequestDto) {
        DagRunsResponseDto dto = new DagRunsResponseDto();
        dto.setDagId(dagId);
        dto.setEndDate(LocalDateTime.now());
        dto.setExecutionDate("31.12.2022");
        dto.setState("run");
        return ResponseEntity.ok(dto);
    }
}