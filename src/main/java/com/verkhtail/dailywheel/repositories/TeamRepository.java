package com.verkhtail.dailywheel.repositories;

import com.verkhtail.dailywheel.repositories.entities.TeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<TeamEntity, Long> {
}
