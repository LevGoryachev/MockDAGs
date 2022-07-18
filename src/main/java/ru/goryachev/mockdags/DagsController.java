package ru.goryachev.mockdags;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;

@RestController
@RequestMapping("/api/v1/dags")
@RequiredArgsConstructor
public class DagsController {

    @PostMapping("/{dagId}/dagRuns")
    public ResponseEntity<DagResponseDto> create(@PathVariable("dagId") String dagId, @RequestBody DagRequestDto dagRequestDto) {
        DagResponseDto dagResponseDto = new DagResponseDto();
        dagResponseDto.setConf(dagRequestDto.getConf());
        //dagResponseDto.getConf().put("newParameter", "Hello from MockDags");
        dagResponseDto.setDagId(dagId);
        dagResponseDto.setDagRunId("578");
        dagResponseDto.setEndDate(new Timestamp(System.currentTimeMillis()));
        dagResponseDto.setExecutionDate("31.12.2022");
        dagResponseDto.setStartDate(new Timestamp(System.currentTimeMillis()));
        dagResponseDto.setState("run");
        return ResponseEntity.ok(dagResponseDto);
    }

    @GetMapping("/{dagId}/dagRuns/{dagRunId}/taskInstances/end_with_error_task")
    public ResponseEntity<DagResponseDto> create(@PathVariable("dagId") String dagId, @PathVariable("dagRunId") String dagRunId) {
        DagResponseDto dagResponseDto = new DagResponseDto();

        dagResponseDto.setDagId(dagId);
        dagResponseDto.setDagRunId("578");
        dagResponseDto.setEndDate(new Timestamp(System.currentTimeMillis()));
        dagResponseDto.setExecutionDate("31.12.2022");
        dagResponseDto.setStartDate(new Timestamp(System.currentTimeMillis()));
        dagResponseDto.setState("run");
        return ResponseEntity.ok(dagResponseDto);
    }

    /*@PostMapping("/{dagId}/dagRuns")
    public ResponseEntity<DagResponseDto> create(@PathVariable("dagId") String dagId, @RequestBody DagRequestDto dagRequestDto) {
        DagResponseDto dagResponseDto = new DagResponseDto();
        LinkedHashMap<String, Object> confParameters = dagRequestDto.getConf();
        confParameters.put("newParameter", "Hello from MockDags");
        confParameters.remove("User_AD_Login");
        dagResponseDto.setConf(confParameters);
        dagResponseDto.setDagId(dagId);
        dagResponseDto.setDagRunId("578");
        dagResponseDto.setEndDate(new Timestamp(System.currentTimeMillis()));
        dagResponseDto.setExecutionDate("31.12.2022");
        dagResponseDto.setStartDate(new Timestamp(System.currentTimeMillis()));
        dagResponseDto.setState("run");
        return ResponseEntity.ok(dagResponseDto);
    }*/

    /*@PostMapping("/{dagId}/dagRuns")
    public ResponseEntity<DagRunsResponseDto> create(@PathVariable("dagId") String dagId, @RequestBody ArpDecomApprovalRequestDto arpDecomApprovalRequestDto) {
        DagRunsResponseDto dto = new DagRunsResponseDto();
        dto.setDagId(dagId);
        dto.setEndDate(LocalDateTime.now());
        dto.setExecutionDate("31.12.2022");
        dto.setState("run");
        return ResponseEntity.ok(dto);
    }*/
}