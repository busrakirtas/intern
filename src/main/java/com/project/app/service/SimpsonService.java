package com.project.app.service;

import org.springframework.stereotype.Service;
import com.project.app.math.Calculations;
import com.project.app.model.FonksiyonModel;

@Service
public class SimpsonService {
	
	public double calculateSimpson(FonksiyonModel sm)
	{
		Calculations calculations = new Calculations();
		double sonuc = calculations.calculateSimpson(sm);
		return sonuc;
	}
	
}
