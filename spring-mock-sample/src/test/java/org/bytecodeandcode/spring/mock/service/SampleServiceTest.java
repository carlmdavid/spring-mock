package org.bytecodeandcode.spring.mock.service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.bytecodeandcode.spring.mock.SpringMock;
import org.bytecodeandcode.spring.mock.persistence.dao.Dao;
import org.bytecodeandcode.spring.mock.persistence.domain.StringValueGetter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration({SpringMock.class})
public class SampleServiceTest {
	
	@Autowired
	@InjectMocks
	private SampleService sampleService;
	
	@Autowired
	@Mock
	private Dao dao;

	@Test
	public void test() {
		MockitoAnnotations.initMocks(this);
		
		when(dao.get())
			.thenReturn(new StringValueGetter());
		
		sampleService.run();
	}

}
