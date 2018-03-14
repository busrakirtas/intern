package com.project.app.controller;

import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.project.app.model.FonksiyonModel;
import com.project.app.service.IntegralService;
import com.project.app.service.SimpsonAlternativeService;
import com.project.app.service.SimpsonService;
import com.project.app.service.TrapezoidService;

@Controller
@RequestMapping(value = "/proje")
public class MyProjectController {
	private static final Logger logger = LoggerFactory.getLogger(MyProjectController.class);

	@Autowired
	IntegralService integralService;

	@Autowired
	TrapezoidService trapezoidService;

	@Autowired
	SimpsonService simpsonService;

	@Autowired
	SimpsonAlternativeService simpsonAlternativeService;

	@GetMapping(value = "/integral")
	public ModelAndView integral() {
		ModelAndView modelAndView = new ModelAndView("integral");
		return modelAndView;
	}

	@PostMapping(value = "/integral")
	public ModelAndView createIntegral(@Valid FonksiyonModel fonksiyonModel, BindingResult result) {
		System.err.println(fonksiyonModel.toString());
		ModelAndView modelAndView = new ModelAndView();
		if (result.hasErrors()) {
			logger.info("Validation errors while submitting form.");
			modelAndView.setViewName("integral");
			modelAndView.addObject("fonksiyonModel", fonksiyonModel);
			return modelAndView;
		}
		logger.info(fonksiyonModel.toString());
		double sonuc = integralService.calculateIntegral(fonksiyonModel);
		fonksiyonModel.setResult(sonuc);
		System.out.println("Sonuc :" + sonuc);
		modelAndView.setViewName("iresult");
		return modelAndView;
	}

	@GetMapping(value = "/riemansum")
	public ModelAndView riemansum() {
		ModelAndView modelAndView = new ModelAndView("riemansum");
		modelAndView.addObject("fonksiyonModel", new FonksiyonModel());
		return modelAndView;
	}

	@PostMapping(value = "/riemansum")
	public ModelAndView createRiemansum(@Valid FonksiyonModel fonksiyonModel, BindingResult result) {
		System.err.println(fonksiyonModel.toString());
		ModelAndView modelAndView = new ModelAndView();
		if (result.hasErrors()) {
			logger.info("Validation errors while submitting form.");
			modelAndView.setViewName("riemansum");
			modelAndView.addObject("fonksiyonModel", fonksiyonModel);
			return modelAndView;
		}
		logger.info(fonksiyonModel.toString());
		double sonuc = integralService.calculateIntegral(fonksiyonModel);
		fonksiyonModel.setResult(sonuc);
		System.out.println("Sonuc :" + sonuc);
		modelAndView.setViewName("iresult");
		return modelAndView;
	}

	@GetMapping(value = "/trapezoid")
	public ModelAndView trapezoid() {
		ModelAndView modelAndView = new ModelAndView("trapezoid");
		modelAndView.addObject("fonksiyonModel", new FonksiyonModel());
		return modelAndView;
	}

	@PostMapping(value = "/trapezoid")
	public ModelAndView createTrapezoid(@Valid FonksiyonModel fonksiyonModel, BindingResult result) {
		System.err.println(fonksiyonModel.toString());
		ModelAndView modelAndView = new ModelAndView();
		if (result.hasErrors()) {
			logger.info("Validation errors while submitting form.");
			modelAndView.setViewName("trapezoid");
			modelAndView.addObject("fonksiyonModel", fonksiyonModel);
			return modelAndView;
		}
		logger.info(fonksiyonModel.toString());
		double sonuc = trapezoidService.calculateTrapezoid(fonksiyonModel);
		fonksiyonModel.setResult(sonuc);
		System.out.println("Sonuc :" + sonuc);
		modelAndView.setViewName("tresult");
		return modelAndView;
	}

	@GetMapping(value = "/simpson")
	public ModelAndView simpson() {
		ModelAndView modelAndView = new ModelAndView("simpson");
		modelAndView.addObject("fonksiyonModel", new FonksiyonModel());
		return modelAndView;
	}

	@PostMapping(value = "/simpson")
	public ModelAndView createSimpson(@Valid FonksiyonModel fonksiyonModel, BindingResult result) {
		System.err.println(fonksiyonModel.toString());
		ModelAndView modelAndView = new ModelAndView();
		if (result.hasErrors()) {
			logger.info("Validation errors while submitting form.");
			modelAndView.setViewName("simpson");
			modelAndView.addObject("fonksiyonModel", fonksiyonModel);
			return modelAndView;
		}
		logger.info(fonksiyonModel.toString());
		double sonuc = simpsonService.calculateSimpson(fonksiyonModel);
		fonksiyonModel.setResult(sonuc);
		System.out.println("Sonuc :" + sonuc);
		modelAndView.setViewName("sresult");
		return modelAndView;
	}

	@GetMapping(value = "/simpsonalt")
	public ModelAndView simpsonAlternative() {
		ModelAndView modelAndView = new ModelAndView("simpsonalternative");
		modelAndView.addObject("fonksiyonModel", new FonksiyonModel());
		return modelAndView;
	}

	@PostMapping(value = "/simpsonalt")
	public ModelAndView createSimpsonAlternative(@Valid FonksiyonModel fonksiyonModel, BindingResult result) {
		System.err.println(fonksiyonModel.toString());
		ModelAndView modelAndView = new ModelAndView();
		if (result.hasErrors()) {
			logger.info("Validation errors while submitting form.");
			modelAndView.setViewName("simpsonalternative");
			modelAndView.addObject("fonksiyonModel", fonksiyonModel);
			return modelAndView;
		}
		logger.info(fonksiyonModel.toString());
		double sonuc = simpsonAlternativeService.calculateSimpsonAlternative(fonksiyonModel);
		fonksiyonModel.setResult(sonuc);
		System.out.println("Sonuc :" + sonuc);
		modelAndView.setViewName("saresult");
		return modelAndView;
	}
}
