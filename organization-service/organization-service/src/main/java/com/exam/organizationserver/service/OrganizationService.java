package com.exam.organizationserver.service;

import com.exam.organizationserver.dto.OrganizationDto;

public interface OrganizationService {

	
	OrganizationDto saveOrganization(OrganizationDto organizationDto);
	
	OrganizationDto getByOrganizationByCode(String organizationCode);
}
