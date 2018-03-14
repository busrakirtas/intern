package com.project.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.app.model.FonksiyonModel;
import com.project.app.service.IntegralService;
import com.project.app.service.SimpsonAlternativeService;
import com.project.app.service.SimpsonService;
import com.project.app.service.TrapezoidService;

@RestController
@RequestMapping(value="/calculate")
public class CalculateController {

	@Autowired
	IntegralService integralService;
	
	@Autowired 
	SimpsonService simpsonService;
	
	@Autowired
	TrapezoidService trapezoidService;
	
	@Autowired
	SimpsonAlternativeService simpsonAlternativeService;
	
	@PostMapping(value="/chartData")
	public List<Double> fonk(@RequestBody FonksiyonModel functionModel) {
		
		System.out.println("chart data----");
		
		System.err.println("fonksiyon"+functionModel.toString());
		
		List<Double> chartDataList = new ArrayList<Double>();
		
		chartDataList.add(integralService.calculateIntegral(functionModel));
		chartDataList.add(trapezoidService.calculateTrapezoid(functionModel));
		chartDataList.add(simpsonService.calculateSimpson(functionModel));
		chartDataList.add(simpsonAlternativeService.calculateSimpsonAlternative(functionModel));
		
		System.out.println("liste-->"+chartDataList);
		
		return chartDataList;
		
	}
	
}
