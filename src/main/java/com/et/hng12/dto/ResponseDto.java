package com.et.hng12.dto;

import java.time.LocalDate;

public class ResponseDto {
      String email;
      LocalDate currentDate;
      String github_url;

      public String getEmail() {
            return email;
      }

      public void setEmail(String email) {
            this.email = email;
      }

      public LocalDate getCurrentDate() {
            return currentDate;
      }

      public void setCurrentDate(LocalDate currentDate) {
            this.currentDate = currentDate;
      }

      public String getGithub_url() {
            return github_url;
      }

      public void setGithub_url(String github_url) {
            this.github_url = github_url;
      }
}


