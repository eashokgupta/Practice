package com.personal.practice.controller;


import com.personal.practice.dto.PropertyManagementDto;
import com.personal.practice.service.PropertyManagementService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/property")
@Tag(description = "Practice Save,Find,Update and Delete Property Management Service", name = "Controller for Property Management Service")

public class PropertyManagementController {
        @Autowired
        PropertyManagementService propertyManagementService;

        @GetMapping(value = "/find-property/{id}", produces = "application/json")
        @Operation(summary = "Search through agent Id the Property Management Details")
        @ApiResponses(value = {
                @ApiResponse(responseCode = "200", description = "Property Management details have been retrieved successfully", content = {
                        @Content(mediaType = "application/json")}),
                @ApiResponse(responseCode = "417", description = "Something went wrong.", content = {
                        @Content(mediaType = "application/json")})})
        public ResponseEntity<PropertyManagementDto> findPropertyById(@RequestParam Long id) {
            return new ResponseEntity<>(propertyManagementService.findByID(id), HttpStatus.OK);
        }

        @PostMapping(value = "/save", consumes = "application/json")
        @Operation(summary = "Create Property Type Request")
        @ApiResponses(value = {
                @ApiResponse(responseCode = "201", description = "Property Type request created successfully.", content = {
                        @Content(mediaType = "application/json")}),
                @ApiResponse(responseCode = "417", description = "Something went wrong.", content = {
                        @Content(mediaType = "application/json")})})
        public ResponseEntity<PropertyManagementDto> saveProperty(@RequestBody PropertyManagementDto dto) {
            return new ResponseEntity<>(propertyManagementService.saveProperty(dto), HttpStatus.CREATED);
        }

        @GetMapping(value = "/find-all-property", produces = "application/json")
        @Operation(summary = "Search all Agent Details")
        @ApiResponses(value = {
                @ApiResponse(responseCode = "200", description = "Property Managements details have been retrieved successfully", content = {
                        @Content(mediaType = "application/json")}),
                @ApiResponse(responseCode = "417", description = "Something went wrong.", content = {
                        @Content(mediaType = "application/json")})})
        public ResponseEntity<List<PropertyManagementDto>> findAllProperties() {
            return new ResponseEntity<>(propertyManagementService.findAllProperty(), HttpStatus.OK);
        }
    }

