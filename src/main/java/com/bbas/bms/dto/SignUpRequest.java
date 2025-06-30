package com.bbas.bms.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class SignUpRequest {
    
    @NotBlank(message = "사용자 이름은 필수입니다")
    @Size(min = 3, max = 50)
    private String nickname;
    
    @NotBlank(message = "비밀번호는 필수입니다")
    @Size(min = 6, max = 100)
    private String password;
    
    @NotBlank(message = "이메일은 필수입니다")
    @Email(message = "유효한 이메일 주소를 입력해주세요")
    private String email;
}