package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable;

@SpringBootApplication
public class Application {
    private Map<String, Object> cache = new HashMap<String, object>();
	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		//chages for HIS-134
int a = 10 ;
		run.close();
		
	
	}
	//HIS-301 chages
	public void localDataToCache(){
	//logic
	}
	

}
