package com.cs304project.MotorTraffic.dto;
import org.springframework.http.HttpStatus;

public class ResponseLoginDTO {
        private String date;
        private String message;
        private Integer status;
        private String role;
        private String nic;

        public ResponseLoginDTO() {
            this.status = HttpStatus.OK.value();
            this.date=date;
            this.message =message;

        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }
}
