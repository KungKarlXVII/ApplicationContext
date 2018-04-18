package se.lexicon.service;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Service;
import se.lexicon.config.WindowsCondition;

import java.util.Random;

@Service("randomNumberService")
@Conditional(WindowsCondition.class)
public class RandomNumberServiceWindowsImpl implements RandomNumberService {

	@Override
	public String getRandomNumber() {

		Random rand = new Random();
		return "Windows-condition: " + rand.nextInt();

	}

}
