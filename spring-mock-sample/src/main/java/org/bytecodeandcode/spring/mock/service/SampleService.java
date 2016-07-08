package org.bytecodeandcode.spring.mock.service;

import org.bytecodeandcode.spring.mock.persistence.dao.Dao;
import org.bytecodeandcode.spring.mock.persistence.domain.AbstractDomain;
import org.bytecodeandcode.spring.mock.persistence.domain.StringValueGetter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

	@Autowired
	private Dao dao;
	
	public void run() {
		StringValueGetter stringValueGetter = dao.get();
		AbstractDomain d = (AbstractDomain) stringValueGetter;
		
		d.getStringValue();
	}
}
