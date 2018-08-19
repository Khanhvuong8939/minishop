package com.venky.controller;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

public class CustomLoader implements ResourceLoaderAware{
	
	ResourceLoader loader;

	public void setResourceLoader(ResourceLoader resourceLoader) {
		loader = resourceLoader;
	}
	
	public Resource getResource(String path) {
		return loader.getResource(path);
	}
	
}
