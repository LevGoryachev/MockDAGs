package ru.goryachev.mockdags;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Size;
import java.util.List;

@RestController
@RequestMapping("/mockadapters/v1")
@RequiredArgsConstructor
public class PE7Controller {

    //PE7
    //@PostMapping("/info_operation/v3/info_payment_transfer")
    @PostMapping("/info_operation/v3/send_swift_docs")
    public ResponseEntity<SimpleResponseDto> infoOperationTransfer(@RequestBody Object infoPaymentTransfer) {

        Object rObj = infoPaymentTransfer;

        SimpleResponseDto simpleResponseDto = new SimpleResponseDto();
        simpleResponseDto.setMessage(String.format("%s_%s", rObj, "PE message"));
        simpleResponseDto.setIsSuccess(true);
        return ResponseEntity.ok(simpleResponseDto);
    }

    @PostMapping("/email/v2/send")
    public ResponseEntity<SimpleResponseDto> sendEmail(@RequestParam(required=false, name="addressTo") @Size(min=1) List< String> addressTo, @RequestParam(required=false, name="addressCC") List< String> addressCC, @RequestParam(required=false, name="addressBCC") List< String> addressBCC, @RequestParam(required=false, name="addressFrom") String addressFrom, @RequestParam(required=false, name="subject") String subject, @RequestParam(required=false, name="encoding") String encoding, @RequestParam(required=false, name="format") String format, @RequestParam(required=false, name="body") String body, @RequestParam(required=false, name="attachName") List< String> attachName, @RequestParam(required=false, name="attachBody") List< String> attachBody, @RequestParam(required=false, name="attachFilePathArr") List< String> attachFilePathArr) {

        List< String> addresses = addressTo;

        SimpleResponseDto simpleResponseDto = new SimpleResponseDto();
        simpleResponseDto.setMessage(String.format("%s_%s", addresses, "PE message"));
        simpleResponseDto.setIsSuccess(true);
        return ResponseEntity.ok(simpleResponseDto);
    }
}
