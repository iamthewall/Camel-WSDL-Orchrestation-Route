package com.redhat.demo.deceval2;

import java.util.HashMap;
import java.util.Map;

public class Store {
	private Map<String, Object> store;
	
	public Store()
	{
		store = new HashMap<String, Object>();
	}
	
	public void saveObject(String key, Object stuff)
	{
		store.put(key, stuff);
	}

	public Object loadObject(String key)
	{
		return store.get(key);
	}
}
