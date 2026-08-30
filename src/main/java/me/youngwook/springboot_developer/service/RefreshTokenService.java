package me.youngwook.springboot_developer.service;

import lombok.RequiredArgsConstructor;
import me.youngwook.springboot_developer.domain.RefreshToken;
import me.youngwook.springboot_developer.repository.RefreshTokenRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RefreshTokenService {
    private final RefreshTokenRepository refreshTokenRepository;

    public RefreshToken findByRefreshToken(String refreshToken) {
        return refreshTokenRepository.findByRefreshToken(refreshToken)
                .orElseThrow(() -> new IllegalArgumentException("Unexpected token"));
    }
}
