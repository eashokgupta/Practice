package com.personal.practice.service;

import com.personal.practice.dto.PropertyManagementDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PropertyManagementService {
PropertyManagementDto saveProperty(PropertyManagementDto propertyManagementDto);

List<PropertyManagementDto> findAllProperty();
PropertyManagementDto findByID(Long id);

}
