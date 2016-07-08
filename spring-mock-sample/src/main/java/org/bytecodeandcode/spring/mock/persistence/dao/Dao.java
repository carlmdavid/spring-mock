package org.bytecodeandcode.spring.mock.persistence.dao;

import org.bytecodeandcode.spring.mock.persistence.domain.StringValueGetter;
import org.springframework.stereotype.Repository;

@Repository
public class Dao {

	public void save(StringValueGetter domain) {
		
	}
	
	public StringValueGetter get() {
		return null;
	}
}
