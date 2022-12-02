package com.personal.practice.service.ServiceImpl;

import com.personal.practice.dto.PropertyManagementDto;
import com.personal.practice.entity.PropertyManagement;
import com.personal.practice.mapper.PropertyManagementMapper;
import com.personal.practice.repository.PropertyManagementRepository;
import com.personal.practice.service.PropertyManagementService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PropertyManagementServiceImpl implements PropertyManagementService {

    @Autowired
    PropertyManagementRepository propertyManagementRepository;

    @Autowired
    PropertyManagementMapper propertyManagementMapper;

    @Override
    public PropertyManagementDto saveProperty(PropertyManagementDto propertyManagementDto) {
        PropertyManagement propertyManagement=new PropertyManagement();
        BeanUtils.copyProperties(propertyManagement,propertyManagement);
        PropertyManagement propertyManagement1=propertyManagementRepository.save(propertyManagement);
        BeanUtils.copyProperties(propertyManagement1,propertyManagementDto);
        return propertyManagementDto;
    }

    @Override
    public List<PropertyManagementDto> findAllProperty() {
        List<PropertyManagement> propertyManagement=propertyManagementRepository.findAll();
        List<PropertyManagementDto> propertyManagementDtos= new ArrayList<>();
        propertyManagement.forEach(property -> propertyManagementDtos.add(propertyManagementMapper.propertyManagementToPropertyManagementDto(property)));
        return propertyManagementDtos;
    }

    @Override
    public PropertyManagementDto findByID(Long id) {
        return propertyManagementMapper.propertyManagementToPropertyManagementDto(propertyManagementRepository.findById(id).orElse(null));
    }
}
