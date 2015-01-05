package com.trendmicro.ets.weixin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping(value = "/*")
	public String index(HttpServletRequest request, Model model, HttpServletResponse response) {
		return "index";
	}
}
