package com.project.app.service;

import org.springframework.stereotype.Service;
import com.project.app.math.Calculations;
import com.project.app.model.FonksiyonModel;

@Service
public class SimpsonAlternativeService {
	
	public double calculateSimpsonAlternative(FonksiyonModel sam)
	{
		Calculations calculations = new Calculations();
		double sonuc = calculations.calculateSimpsonAlternative(sam);
		return sonuc;
	}

}
