package com.verkhtail.dailywheel.services;

import com.verkhtail.dailywheel.dto.TeamDTO;
import com.verkhtail.dailywheel.dto.mappers.TeamMapper;
import com.verkhtail.dailywheel.repositories.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeamService {

    private final TeamRepository teamRepository;

    public List<TeamDTO> getAll() {
        return TeamMapper.INSTANCE.toDto(teamRepository.findAll());
    }

}
