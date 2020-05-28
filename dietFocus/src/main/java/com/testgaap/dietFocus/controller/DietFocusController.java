package com.testgaap.dietFocus.controller;

import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.testgaap.dietFocus.model.ContactUs;

@RestController
@RequestMapping("/")
public class DietFocusController {
	
	@Autowired
	public RestTemplate restTemplate;
	
	@GetMapping("/contactus")
	public ModelAndView getContactUs()
	{
		return new ModelAndView("contactus");
		
	}
	
	@GetMapping("/")
	public ModelAndView home1()
	{
		return new ModelAndView("home");
	}
	
	@GetMapping("/home")
	public ModelAndView home()
	{
		return new ModelAndView("home");
	}
	
	@GetMapping("/foodKnowledge")
	public ModelAndView foodKnowledge()
	{
		return new ModelAndView("foodknowledge");
	}
	
	@GetMapping("/foodknowledgepath")
	public ModelAndView foodDetail(@RequestParam ("foodknowledge") String foodknowledge)
	{
		String foodKnowledge = foodknowledge;
		ModelAndView mv = new ModelAndView("foodknowledge_detail");
		mv.addObject("foodknowledge", foodKnowledge);
		return mv;
	}
	
	@GetMapping("/foodrecipe")
	public ModelAndView foodRecipe()
	{
		return new ModelAndView("FoodRecipe");
	}
	
	
	@GetMapping("/foodrecipedetail")
	public ModelAndView foodRecipeDeatil(@RequestParam ("food_recipe") String food_recipe)
	{
		String foodrecipe_detail = food_recipe;
		ModelAndView mv=new ModelAndView("FoodRecipeDetail");
		mv.addObject("foodrecipe_detail", foodrecipe_detail);
		return mv;
	}
	
	@GetMapping("/videolinks")
	public ModelAndView videoLinks()
	{
		return new ModelAndView("VideoLinks");
	}
			
			
}
