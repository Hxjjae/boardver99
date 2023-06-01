package com.green.boardver99.user.model;

import lombok.Data;

@Data
    public class UserEntity {
    private int iuser;
    private String uid;
    private String upw;
    private String nm;
    private char gender;
    private String addr;
    private String main_pic;
    private String created_At;
    private String updated_At;
}
