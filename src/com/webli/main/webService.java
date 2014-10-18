package com.webli.main;


import resources.testResource;

import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Configuration;
import com.yammer.dropwizard.config.Environment;



@SuppressWarnings("rawtypes")
public class webService extends Service<com.webli.main.Configuration> {


	 public static void main(String[] args) throws Exception {
	        new webService().run(args);
	    }

	

	@Override
	public void initialize(Bootstrap<com.webli.main.Configuration> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run(com.webli.main.Configuration config, Environment arg1)
			throws Exception {
		final testResource resource=new testResource( config);
		 arg1.addResource(resource);
		
	}

}