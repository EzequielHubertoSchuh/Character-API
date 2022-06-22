package com.ezequielschuh.challenge;

import static org.assertj.core.api.Assertions.assertThat;

import com.ezequielschuh.challenge.resource.CharacterResource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MarvelBackendChallengeApplicationTests {
    
    	@Autowired
	private CharacterResource characterResource;

	@Test
	void contextLoads() {
	    assertThat(characterResource).isNotNull();
	}

}
