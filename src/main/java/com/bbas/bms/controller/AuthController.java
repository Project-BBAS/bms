package com.bbas.bms.controller;

import com.bbas.bms.domain.user.Role;
import com.bbas.bms.dto.SignUpRequest;
import com.bbas.bms.entity.user.Users;
import com.bbas.bms.service.user.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@Valid @RequestBody SignUpRequest signUpRequest) {
        Users user = new Users();
        user.setNickname(signUpRequest.getNickname());
        user.setPassword(signUpRequest.getPassword());
        user.setEmail(signUpRequest.getEmail());
        user.setRole(Role.ROLE_USER);
        
        userService.createUser(user);
        
        return ResponseEntity.ok("사용자 등록이 완료되었습니다.");
    }
}