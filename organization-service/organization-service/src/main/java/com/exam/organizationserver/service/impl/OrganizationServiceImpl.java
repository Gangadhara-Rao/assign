package com.exam.organizationserver.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.organizationserver.dto.OrganizationDto;
import com.exam.organizationserver.entity.Organization;
import com.exam.organizationserver.mapper.OrganizationMapper;
import com.exam.organizationserver.repository.OrganizationRepository;
import com.exam.organizationserver.service.OrganizationService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class OrganizationServiceImpl implements OrganizationService {
	
	@Autowired
	OrganizationRepository organizationRepository;
	
	
	@Override
	public OrganizationDto saveOrganization(OrganizationDto organizationDto) {

		Organization organization = OrganizationMapper.mapToOrganization(organizationDto);
		
		Organization savedOrganization = organizationRepository.save(organization);
		
		OrganizationDto saveOrganizationDto =  OrganizationMapper.mapToOrganizationDto(savedOrganization);
		

		return saveOrganizationDto;
	}


	@Override
	public OrganizationDto getByOrganizationByCode(String organizationCode) {
		
		Organization organization = organizationRepository.findByOrganizationCode(organizationCode);
		
		OrganizationDto organizationDto = OrganizationMapper.mapToOrganizationDto(organization);
		return organizationDto;
	}

}
