package com.ray.controller;

import com.ray.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/testString")
    public String testString(Model model) {
        System.out.println("testString执行了");
        //模拟从数据库中查询user对象
        User user=new User();
        user.setUsername("哈哈");
        user.setPassword("123");
        user.setAge(20);
        model.addAttribute("user",user);
        return "success";
    }
    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("testVoid执行了");
        //request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);
        /*response.sendRedirect(request.getContextPath()+"/index.jsp");*/
        response.setCharacterEncoding("UTF-8");
        response.setContentType("test/html;charset=UTF-8");
        response.getWriter().print("您好");
        return;
    }
    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView() {
        ModelAndView mv=new ModelAndView();
        System.out.println("testModelAndView执行了");
        User user=new User();
        user.setUsername("哈哈");
        user.setPassword("123");
        user.setAge(20);
        mv.addObject("user",user);
        mv.setViewName("success");
        return mv;
    }
    @RequestMapping("/testForward")
    public String  testForward() {
        System.out.println("testForward执行了");
        //return "forward:/WEB-INF/pages/success.jsp";
        return "redirect:/index.jsp";
    }
}
