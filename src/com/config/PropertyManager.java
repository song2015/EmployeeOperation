/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.config;

import java.io.IOException;
import java.util.Properties;

/**
 * 
 * 2016/03/23
 * author: Miao shan
 */

public class PropertyManager {
        static Properties props = new Properties();

	static {
		try {
			props.load(PropertyManager.class.getClassLoader().getResourceAsStream("com/config/default.properties"));  
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	private PropertyManager() {

        };
	
	public static String getProperty(String key) {
		return props.getProperty(key);
	}
}
