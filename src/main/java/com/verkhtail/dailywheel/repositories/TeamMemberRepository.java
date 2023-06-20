package com.verkhtail.dailywheel.repositories;

import com.verkhtail.dailywheel.repositories.entities.TeamMemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamMemberRepository extends JpaRepository<TeamMemberEntity, Long> {
}
