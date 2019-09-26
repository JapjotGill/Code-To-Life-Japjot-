package org.japjot.client.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.Produces;

import org.japjot.client.model.TopicClient;
import org.japjot.client.model.TopicForm;
import org.japjot.client.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TopicControllerClient {

	@Autowired
	private TopicServiceClient topicService;
	
	@RequestMapping("index1")
	public String indexForm() {
		return "index1";
	}
	@RequestMapping("/create-topic")
	public String createTopic(Map<String, Object> model, @ModelAttribute TopicForm topicForm) {
		
		 TopicClient topicClient = new TopicClient();
		 topicClient.setDescription(topicForm.getDescription());
		 topicClient.setName(topicForm.getName());
		 topicService.AddTopicClient(topicClient);
		 topicForm= new TopicForm();
		 model.put("topicForm", topicForm);
		 return "createTopic";
	}
	@RequestMapping("get-topic")
	public String getTopic(Map<String, Object> model, @ModelAttribute TopicForm topicForm) {
		
		List<TopicClient> client = topicService.AllTopics();
		model.put("topicForm", topicForm);
		model.put("client", client);
		return "getTopic";
	}
	
	@RequestMapping("/select-To-Update-Topic")
	public String UpdateTopic(Map<String, Object> model,@ModelAttribute TopicClient topicClient) {
			
		List<TopicClient> client = topicService.AllTopics();
		model.put("topicClient", topicClient);
		model.put("client", client);
		return "selectToUpdateTopic";
	}
	@RequestMapping("/update-topic-{id}")
	public String updatedTopic(Map<String, Object> model,@ModelAttribute TopicForm topicForm,@PathVariable long id) {
		
		TopicClient topicClient = new TopicClient();
		topicClient.setId(id);
		topicClient.setDescription(topicForm.getDescription());
		topicClient.setName(topicForm.getName());
		topicService.UpdateTopicClient(topicClient,id);
		topicForm= new TopicForm();
		model.put("topicForm", topicForm);
		return "updateTopic";
	}
	
	@RequestMapping("/topic/{id}")
	public String getTopicInfo(Map<String, Object> model, @ModelAttribute TopicForm topicForm, @PathVariable(value = "id")long id) {

		System.out.println(id);
		model.put("topicForm", topicForm);
		return "get-topic-info";
	}
	
	@RequestMapping("delete-topic")
	public String DeleteTopic(Map<String, Object> model,@ModelAttribute TopicForm topicForm) {
		
		TopicClient topicClient = new TopicClient();
		topicClient.setId(topicForm.getId());
		topicForm= new TopicForm();
		model.put("topicForm",topicForm);
		return "deleteTopic";
	}
	
	@RequestMapping("/delete-topic-{id}")
	public String DeleteTopicId(Map<String, Object> model,@ModelAttribute TopicForm topicForm,@FormParam(value = "id") long id) {
		
		TopicClient topicClient = new TopicClient();
		topicClient.setId(topicForm.getId());
	    topicService.RemoveTopicClient(id);
		topicForm= new TopicForm();
		model.put("topicForm",topicForm);
		model.put("id",id);
		return "deleteTopic";
	    
	}
	
	
	/*@RequestMapping("/DeleteTopic")
	public ModelAndView DeleteTopic() {

		return new ModelAndView("DeleteTopic");
	}
	*/
	/*
	 * @RequestMapping("/service/{id}") public TopicClient getTopic(@PathVariable
	 * long id) { return topicService.getTopic(id); }
	 * 
	 * @RequestMapping("/service")
	 * 
	 * @Produces(MediaType.TEXT_XML_VALUE) public List<TopicClient> getAll(){ return
	 * topicService.AllTopics(); }
	 * 
	 * 
	 * @PostMapping("/service")
	 * 
	 * @Consumes(MediaType.MULTIPART_FORM_DATA_VALUE) public void
	 * AddTopicClient(@FormParam(value ="topicClient") TopicClient topicClient) {
	 * topicService.AddTopicClient(topicClient); }
	 * 
	 * @DeleteMapping("/service/{id}") public void RemoveTopicClient(@PathVariable
	 * long id) { topicService.RemoveTopicClient(id); }
	 * 
	 * @PutMapping("/service/{id}") public void UpdateTopicClient(@RequestBody
	 * TopicClient topicClient,@PathVariable long id) {
	 * topicService.UpdateTopicClient(topicClient,id); }
	 */
	
	
	
	
}
