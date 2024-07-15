package faca.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping(value= {"/","/trang-chu"})
	public String Index() {
		
		return "/Home";
	}
	@RequestMapping(value= {"/addmay"})
	public String addMay() {
		return "/addmay";
	}
	@RequestMapping(value= {"/addkhach"})
	public String addKhach() {
		return "/addkhach";
	}
	@RequestMapping(value= {"/adddichvu"})
	public String addDichVu() {
		return "/adddichvu";
	}
	@RequestMapping(value= {"/addsdmay"})
	public String addSuDungMay() {
		return "/addsdmay";
	}
	@RequestMapping(value= {"/addsddv"})
	public String addSuDungDichVu() {
		return "/addsddv";
	}
	
}
