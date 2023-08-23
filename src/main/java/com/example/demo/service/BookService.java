package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Models;
import com.example.demo.repository.BookRepo;

@Service
public class BookService 
{
	@Autowired
	BookRepo sr;
	public Models saveinfo(Models ss)
	{
		return sr.save(ss);
	}
	public Optional<Models> gettinfo(int id)
	{
		return sr.findById(id);
	}
	public List<Models>showinfo()
	{
		return sr.findAll();
	}
	public Models changeinfo(Models ss)
	{ 
		return sr.saveAndFlush(ss);
	}
	public void deletepid(int id)
	{
		sr.deleteById(id);
	}
	public String updatebyid(int id,Models ss)
	{
		sr.saveAndFlush(ss);
		if(sr.existsById(id))
		{
			return "Updated";
		}
		else
		{
			return "Enter valid Id";
		}
	}
		
}
