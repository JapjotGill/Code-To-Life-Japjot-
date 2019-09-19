package org.japjot.client.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.Produces;

import org.japjot.client.service.*;
import org.japjot.client.topic.TopicClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TopicControllerClient {

	@Autowired
	private TopicServiceClient topicService;
	
	@RequestMapping("/service/{id}")
	public TopicClient getTopic(@PathVariable long id)
	{
		return topicService.getTopic(id);
	}
	
	@RequestMapping("/service")
	@Produces(MediaType.TEXT_XML_VALUE)
	public List<TopicClient> getAll(){
		return topicService.AllTopics();
	}
	
	
	@PostMapping("/service")
	@Consumes(MediaType.MULTIPART_FORM_DATA_VALUE)
	public void AddTopicClient(@FormParam(value ="topicClient") TopicClient topicClient)
	{
		topicService.AddTopicClient(topicClient);
	}
	
	@DeleteMapping("/service/{id}")
	public void RemoveTopicClient(@PathVariable long id)
	{
		topicService.RemoveTopicClient(id);
	}
	
	@PutMapping("/service/{id}")
	public void UpdateTopicClient(@RequestBody TopicClient topicClient,@PathVariable long id)
	{
		topicService.UpdateTopicClient(topicClient,id);
	}
	@RequestMapping("/CreateTopic")
	public ModelAndView CreateTopic() {

		return new ModelAndView("CreateTopic");
	}
	@RequestMapping("/DeleteTopic")
	public ModelAndView DeleteTopic() {

		return new ModelAndView("DeleteTopic");
	}
	@RequestMapping("/UpdateTopic")
	public ModelAndView UpdateTopic() {

		return new ModelAndView("UpdateTopic");
	}
}
