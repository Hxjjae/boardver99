package com.green.boardver99.user;

import com.green.boardver99.user.model.UserEntity;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    @Operation(summary = "회원가입", description = "" +
            "uid: [20] 회원 아이디, <br>" +
            "upw : [100] 회원 비밀번호,<br>" +
            "nm : [30] 회원명,<br>" +
            "gender: [1] 성별(M: 남성, F:여성),<br>"+
            "addr: [100] 대구시 달서구")
   public int postUser(@RequestBody UserEntity entity){
        return service.insUser(entity);
    }

}
