package com.personal.practice.service;

import com.personal.practice.dto.AgentDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AgentService {
    AgentDto create(AgentDto agentDto);

    List<AgentDto> findAllAgents();

    AgentDto findByIdAgent(Long id);

}
