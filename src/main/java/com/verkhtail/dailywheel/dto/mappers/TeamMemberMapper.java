package com.verkhtail.dailywheel.dto.mappers;

import com.verkhtail.dailywheel.dto.TeamMemberDTO;
import com.verkhtail.dailywheel.repositories.entities.TeamMemberEntity;
import org.mapstruct.factory.Mappers;

public interface TeamMemberMapper extends BaseMapper<TeamMemberEntity, TeamMemberDTO> {
    TeamMemberMapper INSTANCE = Mappers.getMapper(TeamMemberMapper.class);
}
