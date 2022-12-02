package com.personal.practice.service.ServiceImpl;

import com.personal.practice.dto.AgentDto;
import com.personal.practice.entity.Agent;
import com.personal.practice.mapper.AgentMapper;
import com.personal.practice.repository.AgentRepository;
import com.personal.practice.service.AgentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AgentServiceImpl implements AgentService {

    @Autowired
    AgentRepository agentRepository;

    @Autowired
    AgentMapper agentMapper;

    @Override
    public AgentDto create(AgentDto agentDto) {
        Agent agent = new Agent();
        BeanUtils.copyProperties(agentDto,agent);
        Agent agent1 =agentRepository.save(agent);
        BeanUtils.copyProperties(agent1,agentDto);
        return agentDto;
    }

    @Override
    public List<AgentDto> findAllAgents() {
           List<Agent> agents = agentRepository.findAll();
           List<AgentDto>agentDtos = new ArrayList<>();
           agents.forEach(agentDto -> agentDtos.add(agentMapper.agentToAgentDto(agentDto)));
        return agentDtos;
    }

    @Override
    public AgentDto findByIdAgent(Long id) {
        return agentMapper.agentToAgentDto(agentRepository.findById(id).orElse(null));
    }
}
