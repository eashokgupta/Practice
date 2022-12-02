package com.personal.practice.mapper;

import com.personal.practice.dto.PropertyManagementDto;
import com.personal.practice.entity.PropertyManagement;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedSourcePolicy = ReportingPolicy.IGNORE,componentModel = "Spring")
public interface PropertyManagementMapper {
    PropertyManagement propertyManagementDtoToPropertyManagement(PropertyManagementDto propertyManagementDto);
    PropertyManagementDto propertyManagementToPropertyManagementDto(PropertyManagement propertyManagement);

}
