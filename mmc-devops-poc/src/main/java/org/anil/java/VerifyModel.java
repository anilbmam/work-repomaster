package org.anil.java;

import java.util.ArrayList;

public class VerifyModel {
	
	String model;
	public String check(String modelName){
		ArrayList<String> listmodel=new ArrayList<String>();
		listmodel.add("Ford");
		listmodel.add("Maruthi");
		listmodel.add("Hundai");
		if(listmodel.contains(modelName))
		{
			model="ModelFound";
		}
		else {
			model="ModelNotFound";
		}
		return model;
		
	}
}
