package com.et.hng12.controller;


import com.et.hng12.dto.ResponseDto;
import org.springframework.beans.factory.annotation.Value;
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
      @Value("${email}")
      private  String email;
      @Value("${githuburl}")
      private String githuburl;

      @GetMapping
      public ResponseDto getInfo()
      {

            ResponseDto responseDto = new ResponseDto();

            responseDto.setCurrentDate(Instant.now().toString());
            responseDto.setEmail(email);
            responseDto.setGithub_url(githuburl);

            return responseDto;

      }
}
