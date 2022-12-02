package com.personal.practice.controller;

import com.personal.practice.dto.AgentDto;
import com.personal.practice.service.AgentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agent")
@Tag(description = "Practice Save,Find,Update and Delete Agent Service", name = "Controller for Agent Service")
public class AgentController {

    @Autowired
    AgentService agentService;

    @GetMapping(value = "/find-agent/{id}", produces = "application/json")
    @Operation(summary = "Search through agent Id the Agent Details")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Agent details have been retrieved successfully", content = {
                    @Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "417", description = "Something went wrong.", content = {
                    @Content(mediaType = "application/json")})})
   public ResponseEntity<AgentDto> findAgentById(@RequestParam Long id){
        return new ResponseEntity<>(agentService.findByIdAgent(id), HttpStatus.OK);
    }
    @PostMapping(value = "/save",consumes = "application/json")
    @Operation(summary = "Create Property Type Request")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Property Type request created successfully.", content = {
                    @Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "417", description = "Something went wrong.", content = {
                    @Content(mediaType = "application/json")})})
    public ResponseEntity<AgentDto> saveAgents(@RequestBody AgentDto agentDto){
    return new ResponseEntity<>(agentService.create(agentDto),HttpStatus.CREATED);
    }
    @GetMapping(value = "/find-all-agent", produces = "application/json")
    @Operation(summary = "Search all Agent Details")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Agent details have been retrieved successfully", content = {
                    @Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "417", description = "Something went wrong.", content = {
                    @Content(mediaType = "application/json")})})
    public ResponseEntity<List<AgentDto>> findAllAgents(){
        return new ResponseEntity<>(agentService.findAllAgents(),HttpStatus.OK);
    }
}
