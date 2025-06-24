package com.bbas.bms.entity.match.Service;

import com.bbas.bms.entity.match.Dto.MatchRequestDto;
import com.bbas.bms.entity.match.Dto.MatchResponseDto;
import com.bbas.bms.entity.match.Repository.MatchRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class MatchService {
    private final MatchRepository matchRepository;

    public MatchResponseDto createMatch(MatchRequestDto requestDto) {

        MatchResponseDto matchResponseDto = null;

        return matchResponseDto;
    }

    public MatchResponseDto getMatch(Long id) {
        MatchResponseDto matchResponseDto = null;
        return matchResponseDto;
    }

    public MatchResponseDto putMatch(Long id, MatchRequestDto requestDto) {
        MatchResponseDto matchResponseDto = null;
        return matchResponseDto;
    }

    public MatchResponseDto deleteMatch(Long id) {
        return null;
    }
}
