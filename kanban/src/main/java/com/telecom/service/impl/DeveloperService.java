package com.telecom.service.impl;
import java.util.List;

import com.telecom.domain.Developper;
import com.telecom.repository.DevelopperRepository;

public interface DeveloperService {

	List<Developper> findAll(DevelopperRepository repository);
}
