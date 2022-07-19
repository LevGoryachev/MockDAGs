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

    @GetMapping("/{dagId}/dagRuns/{dagRunId}/taskInstances/check_run")
    public ResponseEntity<DagStartCheckResponse> check_run(@PathVariable("dagId") String dagId, @PathVariable("dagRunId") String dagRunId) {

        if(dagRunId == null){
            return null;
        }

        DagStartCheckResponse dagChkResponse = new DagStartCheckResponse();

        dagChkResponse.setDagId(dagId);
        dagChkResponse.setDuration(0.189251);
        dagChkResponse.setEndDate("2022-07-09T14:57:05.279209+00:00");
        dagChkResponse.setExecutionDate("2022-07-09T14:57:04.360156+00:00");
        dagChkResponse.setExecutorConfig("{}");
        dagChkResponse.setHostname("d5apcs-apc001lk.corp.dev.vtb");
        dagChkResponse.setMaxTries(0);
        dagChkResponse.setOperator("PythonOperator");
        dagChkResponse.setPid(3913934);
        dagChkResponse.setPool("default_pool");
        dagChkResponse.setPoolSlots(1);
        dagChkResponse.setPriorityWeight(3);
        dagChkResponse.setQueue("default");
        dagChkResponse.setQueuedWhen("2022-07-09T14:57:04.506030+00:00");
        dagChkResponse.setSlaMiss(null);
        dagChkResponse.setStartDate("2022-07-09T14:57:05.089958+00:00");
        dagChkResponse.setState("success");
        dagChkResponse.setTaskId("check_run");
        dagChkResponse.setTryNumber(1);
        dagChkResponse.setUnixname("root");

        return ResponseEntity.ok(dagChkResponse);
    }

    @DeleteMapping("/{dagId}/dagRuns/{dagRunId}")
    public String deleteDag(@PathVariable(name = "dagId") String dagId,
                          @PathVariable(name = "dagRunId") String dagRunId) {
        return "Success.";
    }

    /*@GetMapping("/{dagId}/dagRuns/{dagRunId}/taskInstances/end_with_error_task")
    public ResponseEntity<DagResponseDto> create(@PathVariable("dagId") String dagId, @PathVariable("dagRunId") String dagRunId) {
        DagResponseDto dagResponseDto = new DagResponseDto();

        dagResponseDto.setDagId(dagId);
        dagResponseDto.setDagRunId("578");
        dagResponseDto.setEndDate(new Timestamp(System.currentTimeMillis()));
        dagResponseDto.setExecutionDate("31.12.2022");
        dagResponseDto.setStartDate(new Timestamp(System.currentTimeMillis()));
        dagResponseDto.setState("run");
        return ResponseEntity.ok(dagResponseDto);
    }*/

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