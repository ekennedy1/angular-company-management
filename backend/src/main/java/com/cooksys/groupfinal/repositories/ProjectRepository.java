package com.cooksys.groupfinal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cooksys.groupfinal.entities.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

    Project findByTeam_Company_IdAndTeam_IdAndId(Long companyId, Long teamId, Long projectId);
}