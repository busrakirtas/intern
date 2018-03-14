package com.project.app.service;

import org.springframework.stereotype.Service;
import com.project.app.math.Calculations;
import com.project.app.model.FonksiyonModel;

@Service
public class TrapezoidService {

	public double calculateTrapezoid(FonksiyonModel tm)
	{
		Calculations calculations = new Calculations();
		double sonuc = calculations.calculateTrapezoid(tm);
		return sonuc;
	}
	
}
