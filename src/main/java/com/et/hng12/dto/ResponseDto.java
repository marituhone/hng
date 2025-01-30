package com.et.hng12.dto;

import java.time.LocalDate;

public class ResponseDto {
      String email;
     String current_datetime;
      String github_url;

      public String getEmail() {
            return email;
      }

      public void setEmail(String email) {
            this.email = email;
      }

      public String getCurrent_datetime() {
            return current_datetime;
      }

      public void setCurrent_datetime(String current_datetime) {
            this.current_datetime = current_datetime;
      }

      public String getGithub_url() {
            return github_url;
      }

      public void setGithub_url(String github_url) {
            this.github_url = github_url;
      }
}


