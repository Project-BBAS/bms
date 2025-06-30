package com.bbas.bms.service.user;

import com.bbas.bms.entity.user.Users;
import com.bbas.bms.repository.user.UserRepository;
import com.bbas.bms.security.CustomUserDetails;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Users user = userRepository.findByUsername(userName)
                .orElseThrow(() -> new UsernameNotFoundException("해당 사용자가 존재하지 않습니다." + userName));
        return new CustomUserDetails(user);
    }
}