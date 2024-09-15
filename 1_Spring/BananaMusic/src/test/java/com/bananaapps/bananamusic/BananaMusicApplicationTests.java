package com.bananaapps.bananamusic;

import com.bananaapps.bananamusic.config.SpringConfig;
import com.bananaapps.bananamusic.domain.user.User;
import com.bananaapps.bananamusic.persistence.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {SpringConfig.class})
@EnableAutoConfiguration
class BananaMusicApplicationTests {

	@Autowired
	EntityManager em;

	@Autowired
	UserRepository urepo;

	@Autowired
	EntityManagerFactory emf;
	@Test
	void contextLoads() {

		assertNotNull(emf);
		assertNotNull(em);

		// assertNotNull(u);
		assertNotNull(urepo);

		assertTrue(true);
	}

}
