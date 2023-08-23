package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Models;
import com.example.demo.service.BookService;

@RestController
public class ApiController {
	@Autowired
	BookService bser;
	@PostMapping("add")
	public Models add(@RequestBody Models ss)
	{
		return bser.saveinfo(ss);
	}
	@GetMapping("show")
	public List<Models>show()
	{
		return bser.showinfo();
	}
	@GetMapping("get/{id}")
	public Optional<Models>getinfo(@PathVariable int id)
	{
		return bser.gettinfo(id);
	}
	@PutMapping ("update")
	public Models modify(@RequestBody Models ss)
	{
		return bser.changeinfo(ss);
	}
	@DeleteMapping("del/{id}")
	public void deletemyid(@PathVariable int id)
	{
		bser.deletepid(id);
	}
	@PutMapping("upid/{id}")
	public String modifybyid(@PathVariable int id,@RequestBody Models ss)
	{
		return bser.updatebyid(id,ss);
	}
}
