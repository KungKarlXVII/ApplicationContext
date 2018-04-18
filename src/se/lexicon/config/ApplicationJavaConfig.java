package se.lexicon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import se.lexicon.service.RandomNumberService;
import se.lexicon.service.RandomNumberServiceLinuxImpl;
import se.lexicon.service.RandomNumberServiceWindowsImpl;

public class ApplicationJavaConfig {

	@Bean(name="randomNumberService")
	@Conditional(WindowsCondition.class)
	public RandomNumberService randomNumberServiceWindows() {
		return new RandomNumberServiceWindowsImpl();
	}

	@Bean(name="randomNumberService")
	@Conditional(LinuxCondition.class)
	public RandomNumberService randomNumberServiceLinux() {
		return new RandomNumberServiceLinuxImpl();
	}

}
