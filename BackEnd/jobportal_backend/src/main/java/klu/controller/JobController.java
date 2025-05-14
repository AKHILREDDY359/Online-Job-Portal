package klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import klu.modal.Job;
import klu.modal.JobManager;

@RestController
@RequestMapping("/job")
@CrossOrigin(origins = "*")
public class JobController {
	
	@Autowired
	JobManager JM;
	
	@PostMapping("/save")
	public String save(@RequestBody Job J)
	{
		return JM.insertData(J);
	}
	
	@GetMapping("/read")
	public String read()
	{
		return JM.getAll();
	}
	
	@GetMapping("/getdata/{id}")
	public String getData(@PathVariable("id") Long ID)
	{
		return JM.getData(ID);
	}
	
	@PutMapping("/update")
	public String update(@RequestBody Job J)
	{
		return JM.updateJob(J);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long ID)
	{
		return JM.deleteJob(ID);
	}
}
