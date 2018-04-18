package se.lexicon.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service("randomNumberService")
public class RandomNumberServiceImpl implements RandomNumberService {

	@Override
	public Integer getRandomNumber() {

		Random rand = new Random();
		return rand.nextInt();

	}

}
