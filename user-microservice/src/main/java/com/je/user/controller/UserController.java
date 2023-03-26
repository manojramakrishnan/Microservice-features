package com.je.user.controller;

import com.je.user.entity.User;
import com.je.user.service.UserService;
import com.je.user.vo.Department;
import com.je.user.vo.ResponseTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @Autowired
    private RestTemplate template;
@PostMapping("/")
    public User saveUser(@RequestBody User user){
        return service.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId){
    ResponseTemplateVO vo = new ResponseTemplateVO();
    User user = service.findByUserId(userId);
    System.out.println(user.getDepartmentId());
        Department department = template.getForObject("http://DEPARTMENT-SERVICE/departments/"+user.getDepartmentId(), Department.class);
        vo.setUser(user);
        vo.setDepartment(department);
        return vo;
    }


}
