package com.wordpress.dutchcodemaker.CraziestClocks.rest;

import com.wordpress.dutchcodemaker.CraziestClocks.service.BinaryTimeService;
import com.wordpress.dutchcodemaker.CraziestClocks.service.VerballyTimeService;
import com.wordpress.dutchcodemaker.CraziestClocks.service.ProcentualTimeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
public class TimeEndPoints {

    @GetMapping("babylonically")
    public @ResponseBody
    ResponseEntity<String> babylonically() {
        return new ResponseEntity<>(LocalTime.now().toString(), HttpStatus.OK);
    }

    @GetMapping("verbally")
    public @ResponseBody
    ResponseEntity<String> verbally() {
        return new ResponseEntity<String>(VerballyTimeService.getVerballyTime(LocalTime.now()), HttpStatus.OK);
    }

    @GetMapping("binary")
    public @ResponseBody
    ResponseEntity<String> binary() {
        return new ResponseEntity<String>(BinaryTimeService.getTime(LocalTime.now()), HttpStatus.OK);
    }

    @GetMapping("procentual")
    public @ResponseBody
    ResponseEntity<String> procentual() {
        return new ResponseEntity<String>(ProcentualTimeService.getTime(LocalTime.now()) + "", HttpStatus.OK);
    }
}
