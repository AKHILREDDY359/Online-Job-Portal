package klu.modal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.GsonBuilder;

import klu.repository.JobRepository;

@Service
public class JobManager {

	@Autowired
	JobRepository JR;
	
	//INSERT OPERATION
	public String insertData(Job J)
	{
		try
		{
			JR.save(J); // INSERT INTO DATABASE
			return "200::New job has been created";
		}catch (Exception e) 
		{
			return "404::" + e.getMessage();
		}
	}
	
	//Read All from database
	public String getAll()
	{
		try
		{
			List<Job> jobList = JR.findAll(); //READ ALL FROM DATABASE
			return new GsonBuilder().create().toJson(jobList);			
		}catch(Exception e)
		{
			return "404::" + e.getMessage();
		}
	}
	
	//READ Data based on Primary Key
	public String getData(Long id)
	{
		try
		{
			Job J = JR.findById(id).get();
			return new GsonBuilder().create().toJson(J);
		}catch(Exception e)
		{
			return "404::" + e.getMessage();
		}
	}
	
	//UPDATE OPERATION
	public String updateJob(Job J)
	{
		try
		{
			JR.save(J); //SAVE
			return "200::Job details has been updated";
		}catch(Exception e)
		{
			return "404::" + e.getMessage();
		}
	}
	
	//DELETE OPERATION
	public String deleteJob(Long id)
	{
		try
		{
			JR.deleteById(id); //DELETE
			return "200::Job details has been deleted";
		}catch(Exception e)
		{
			return "404::" + e.getMessage();
		}
	}
}
