package com.personal.practice.mapper;

import com.personal.practice.dto.AgentDto;
import com.personal.practice.entity.Agent;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-22T16:55:21+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.16.1 (Amazon.com Inc.)"
)
@Component
public class AgentMapperImpl implements AgentMapper {

    @Override
    public Agent agentDtoToAgent(AgentDto agentDto) {
        if ( agentDto == null ) {
            return null;
        }

        Agent agent = new Agent();

        agent.setId( agentDto.getId() );
        agent.setSpecialization( agentDto.getSpecialization() );
        agent.setExperience( agentDto.getExperience() );
        agent.setLanguages( agentDto.getLanguages() );
        agent.setFacebook( agentDto.getFacebook() );
        agent.setInstagram( agentDto.getInstagram() );
        agent.setLinkedin( agentDto.getLinkedin() );
        agent.setYoutube( agentDto.getYoutube() );
        agent.setTwitter( agentDto.getTwitter() );
        agent.setDescription( agentDto.getDescription() );
        agent.setTitle( agentDto.getTitle() );
        agent.setPhoto( agentDto.getPhoto() );
        agent.setPhone( agentDto.getPhone() );
        agent.setName( agentDto.getName() );
        agent.setLicenceNo( agentDto.getLicenceNo() );
        agent.setEmail( agentDto.getEmail() );

        return agent;
    }

    @Override
    public AgentDto agentToAgentDto(Agent agent) {
        if ( agent == null ) {
            return null;
        }

        AgentDto agentDto = new AgentDto();

        agentDto.setId( agent.getId() );
        agentDto.setSpecialization( agent.getSpecialization() );
        agentDto.setExperience( agent.getExperience() );
        agentDto.setLanguages( agent.getLanguages() );
        agentDto.setFacebook( agent.getFacebook() );
        agentDto.setInstagram( agent.getInstagram() );
        agentDto.setLinkedin( agent.getLinkedin() );
        agentDto.setYoutube( agent.getYoutube() );
        agentDto.setTwitter( agent.getTwitter() );
        agentDto.setDescription( agent.getDescription() );
        agentDto.setTitle( agent.getTitle() );
        agentDto.setPhoto( agent.getPhoto() );
        agentDto.setPhone( agent.getPhone() );
        agentDto.setName( agent.getName() );
        agentDto.setLicenceNo( agent.getLicenceNo() );
        agentDto.setEmail( agent.getEmail() );

        return agentDto;
    }
}
