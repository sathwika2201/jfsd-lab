package com.klef.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class controller {

    @RequestMapping("/greet")
    public String greet(@RequestParam("username") String username, Model model) {
        model.addAttribute("username", username);
        return "greet";  // Return the "greet.jsp" view
    }

    @RequestMapping("/about")
    public String about() {
        return "about";  // Return the "about.jsp" view
    }

    @RequestMapping("/demo1")
    public String demo1(@RequestParam("age") int age, @RequestParam("country") String country, Model model) {
        model.addAttribute("age", age);
        model.addAttribute("country", country);
        return "demo1";  // Return the "demo1.jsp" view
    }

    @RequestMapping("/demo2/{num1}/{num2}")
    public String demo2(@PathVariable int num1, @PathVariable int num2, Model model) {
        int subtraction = num1 - num2;
        int division = num1 / num2;
        model.addAttribute("subtraction", subtraction);
        model.addAttribute("division", division);
        return "demo2";  // Return the "demo2.jsp" view
    }

    @RequestMapping("/productform")
    public String productForm() {
        return "productform";  // Return the "productform.jsp" view
    }

    @RequestMapping("/multiplyNumbers")
    public String multiplyNumbers(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        int result = num1 * num2;
        model.addAttribute("result", result);
        return "multiplyNumbers";  // Return the "multiplyNumbers.jsp" view
    }

    @RequestMapping("/reverse")
    public String reverse(@RequestParam("str1") String str1, @RequestParam("str2") String str2, Model model) {
        String reversedStr1 = new StringBuilder(str1).reverse().toString();
        String reversedStr2 = new StringBuilder(str2).reverse().toString();
        model.addAttribute("reversedStr1", reversedStr1);
        model.addAttribute("reversedStr2", reversedStr2);
        return "reverse";  // Return the "reverse.jsp" view
    }

    @RequestMapping("/calculate")
    public String calculate(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        int addition = num1 + num2;
        int subtraction = num1 - num2;
        model.addAttribute("addition", addition);
        model.addAttribute("subtraction", subtraction);
        return "calculate";  // Return the "calculate.jsp" view
    }
}
