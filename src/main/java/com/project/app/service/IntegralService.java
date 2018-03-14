package com.project.app.service;

import org.springframework.stereotype.Service;
import com.project.app.math.Calculations;
import com.project.app.model.FonksiyonModel;

@Service
public class IntegralService {
 	
	public double calculateIntegral(FonksiyonModel im)
	{
		Calculations calculations = new Calculations();
		double sonuc = calculations.calculateIntegral(im);
		return sonuc;
	}
}
