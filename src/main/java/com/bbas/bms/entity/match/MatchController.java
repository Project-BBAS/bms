package com.bbas.bms.entity.match;

import com.bbas.bms.entity.match.Dto.MatchRequestDto;
import com.bbas.bms.entity.match.Dto.MatchResponseDto;
import com.bbas.bms.entity.match.Service.MatchService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/match")
@AllArgsConstructor
@RestController
public class MatchController {
    private final MatchService matchService;

    @PostMapping
    public ResponseEntity<MatchResponseDto> createMatch(@RequestBody MatchRequestDto requestDto){
        MatchResponseDto responseDto = matchService.createMatch(requestDto);
        return ResponseEntity.ok(responseDto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MatchResponseDto> getMatch(@PathVariable Long id){
        MatchResponseDto responseDto = matchService.getMatch(id);
        return ResponseEntity.ok(responseDto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MatchResponseDto> putMatch(@PathVariable Long id, @RequestBody MatchRequestDto requestDto){
        MatchResponseDto responseDto = matchService.putMatch(id, requestDto);
        return ResponseEntity.ok(responseDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<MatchResponseDto> deleteMatch(@PathVariable Long id){
        matchService.deleteMatch(id);
        return ResponseEntity.noContent().build();
    }



}
