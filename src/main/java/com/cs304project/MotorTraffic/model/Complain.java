package com.cs304project.MotorTraffic.model;

import jakarta.persistence.*;


    @Entity
    @Table(name = "complain")
    public class Complain {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private String nic_num;
        private String phone;
        private String lastName;
        private String district;


        @Lob
        private String video;

        public Complain() {
        }

        public Complain(String nic_num, String phone, String district, String lastName, String video) {
            this.nic_num = nic_num;
            this.lastName=lastName;
            this.phone = phone;
            this.district = district;

            this.video = video;
        }

        public int getId() {
            return id;
        }

        public String getNic_num() {
            return nic_num;
        }

        public void setNic_num(String nic_num) {
            this.nic_num = nic_num;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getDistrict() {
            return district;
        }

        public void setDistrict(String district) {
            this.district = district;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = this.lastName;
        }

        public String getVideo() {
            return video;
        }

        public void setVideo(String video) {
            this.video = video;
        }
    }
