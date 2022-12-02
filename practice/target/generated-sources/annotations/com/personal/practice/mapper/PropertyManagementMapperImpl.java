package com.personal.practice.mapper;

import com.personal.practice.dto.PropertyManagementDto;
import com.personal.practice.entity.PropertyManagement;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-22T16:55:21+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.16.1 (Amazon.com Inc.)"
)
@Component
public class PropertyManagementMapperImpl implements PropertyManagementMapper {

    @Override
    public PropertyManagement propertyManagementDtoToPropertyManagement(PropertyManagementDto propertyManagementDto) {
        if ( propertyManagementDto == null ) {
            return null;
        }

        PropertyManagement propertyManagement = new PropertyManagement();

        propertyManagement.setId( propertyManagementDto.getId() );
        propertyManagement.setBedrooms( propertyManagementDto.getBedrooms() );
        propertyManagement.setLocation( propertyManagementDto.getLocation() );
        propertyManagement.setName( propertyManagementDto.getName() );
        propertyManagement.setPhoneNumber( propertyManagementDto.getPhoneNumber() );
        propertyManagement.setPropertyFor( propertyManagementDto.getPropertyFor() );
        propertyManagement.setEmail( propertyManagementDto.getEmail() );

        return propertyManagement;
    }

    @Override
    public PropertyManagementDto propertyManagementToPropertyManagementDto(PropertyManagement propertyManagement) {
        if ( propertyManagement == null ) {
            return null;
        }

        PropertyManagementDto propertyManagementDto = new PropertyManagementDto();

        propertyManagementDto.setId( propertyManagement.getId() );
        propertyManagementDto.setBedrooms( propertyManagement.getBedrooms() );
        propertyManagementDto.setLocation( propertyManagement.getLocation() );
        propertyManagementDto.setName( propertyManagement.getName() );
        propertyManagementDto.setPhoneNumber( propertyManagement.getPhoneNumber() );
        propertyManagementDto.setPropertyFor( propertyManagement.getPropertyFor() );
        propertyManagementDto.setEmail( propertyManagement.getEmail() );

        return propertyManagementDto;
    }
}
