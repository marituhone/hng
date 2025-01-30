package com.et.hng12.controller;


import com.et.hng12.dto.ResponseDto;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.time.LocalDate;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class ApiController {

      @GetMapping
      public ResponseDto getInfo()
      {
            ResponseDto responseDto = new ResponseDto();

            responseDto.setCurrentDate(Instant.now().toString());
            responseDto.setEmail("marehone12@gmail.com");
            responseDto.setGithub_url("https://github.com/marituhone/hng");

            return responseDto;

      }
}
