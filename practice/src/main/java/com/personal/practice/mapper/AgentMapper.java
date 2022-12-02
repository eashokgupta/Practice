package com.personal.practice.mapper;

import com.personal.practice.dto.AgentDto;
import com.personal.practice.entity.Agent;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedSourcePolicy = ReportingPolicy.IGNORE, componentModel = "Spring")
public interface AgentMapper {

    Agent agentDtoToAgent (AgentDto agentDto);

    AgentDto agentToAgentDto (Agent agent);
}
