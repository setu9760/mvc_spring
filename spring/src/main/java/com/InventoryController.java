package com;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import domain.Product;
import domain.Productmanager;

@Controller
@RequestMapping
public class InventoryController {

	protected final Log _log = LogFactory.getLog(getClass());
	//@Autowired
	//@Qualifier("productManager")
	private Productmanager productManager;

	@Autowired
	@Qualifier("product1")
	Product product1;

	@Autowired
	@Qualifier("product2")
	Product product2;

	@RequestMapping("/hello")
	public String hello(Model model) {
		String now = new Date().toString();
		model.addAttribute("msg", "hello spring");
		model.addAttribute("now", now);
		productManager.addproducts(new Product[] { product1, product2 });
		model.addAttribute("products", productManager.getproducts());
		return "result";
	}
	// public ModelAndView handleRequest(HttpServletRequest request,
	// HttpServletResponse response) throws Exception {
	//
	// String now = new Date().toString();
	// _log.info("returning hello view with: " + now);

	// Map<String, Object> myModel = new HashMap<String, Object>();
	// myModel.put("now", now);
	// myModel.put("products", this.productManager.getproducts());
	// return new ModelAndView("hello", "now", now);
	// }

	// public void setProductManager(Productmanager productManager) {
	// this.productManager = productManager;
	// }

}
