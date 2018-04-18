package se.lexicon.service;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Service;
import se.lexicon.config.LinuxCondition;

import java.util.Random;

@Service("randomNumberService")
@Conditional(LinuxCondition.class)
public class RandomNumberServiceLinuxImpl implements RandomNumberService {

	@Override
	public String getRandomNumber() {

		Random rand = new Random();
		return "Linux-condition: " + rand.nextInt();

	}

}
