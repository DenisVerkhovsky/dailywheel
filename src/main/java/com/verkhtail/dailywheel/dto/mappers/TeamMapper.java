package com.verkhtail.dailywheel.dto.mappers;

import com.verkhtail.dailywheel.dto.TeamDTO;
import com.verkhtail.dailywheel.repositories.entities.TeamEntity;
import org.mapstruct.factory.Mappers;

public interface TeamMapper extends BaseMapper<TeamEntity, TeamDTO> {
    TeamMapper INSTANCE = Mappers.getMapper(TeamMapper.class);
}
