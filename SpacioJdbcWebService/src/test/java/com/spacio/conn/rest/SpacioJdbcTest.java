package com.spacio.conn.rest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.spacio.conn.dto.LoginCredential;
import com.spacio.conn.dto.ResponseDTO;

import static org.junit.jupiter.api.Assertions.*;

//@RunWith(SpringRunner.class)
@SpringBootTest
//@AutoConfigureMockMvc
public class SpacioJdbcTest
{
	private static final Logger logger = LogManager.getLogger();
	
//	@Autowired
//	private LoginCredential credential;
	
	@Test
	public void setDefaults()
	{
		LoginCredential credential = new LoginCredential();
		
		RestTemplate template = new RestTemplate();
		
		final String uri = "http://localhost:8081/spacio/setDefaults";
		
		credential.setUsername("benign40");
		credential.setPassword("crmpass433");
		
		HttpEntity<LoginCredential> request = new HttpEntity<>(credential);
		
		ResponseDTO response = template.postForObject(uri, request, ResponseDTO.class);
		
		assertNotNull(response, "response is not null");
		
		assertTrue(response.getResult(), "result must be true");
		
		logger.info("response is " + response.getResult());
	}
	
}
