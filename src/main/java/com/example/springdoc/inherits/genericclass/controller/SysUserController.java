package com.example.springdoc.inherits.genericclass.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdoc.inherits.genericclass.model.SysUser;

@RestController
@RequestMapping("/api/sysUser")
public class SysUserController extends SuperController<SysUser> {

	
}
