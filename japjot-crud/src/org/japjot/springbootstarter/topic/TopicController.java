package org.japjot.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;
	
	/*public String getAllTopics() {
		return "AllTopics";
	}*/
	@RequestMapping("/topics")
	  public List<Topic> getAllTopics(){ 
		return topicService.getAllTopics(); 
		}
	 
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable long id) {
	return topicService.getTopic(id);
	}
	
	
	  @RequestMapping(method=RequestMethod.POST , value="/topics") 
	  public void addTopic(@RequestBody Topic topic) {
	  topicService.addTopic(topic);
	  }
	 	
	  @RequestMapping(method=RequestMethod.PUT , value="/topics/{id}") 
	  public void updateTopic(@RequestBody Topic topic,@PathVariable long id) {
	  topicService.updateTopic(id,topic);
	  }
	
	  @RequestMapping(method=RequestMethod.DELETE , value="/topics/{id}")
	  public void deleteTopic(@PathVariable long id) {
			 topicService.deleteTopic(id);
			}

	@GetMapping("/topics/name/{abs}")
	public List<Topic> getByName(@PathVariable String abs) {
		return topicService.getByName(abs);
	}

	@PutMapping("/topics/name/{abs}")
	public List<Topic> getByNamePut(@PathVariable String abs) {
		return topicService.getByName(abs);
	}
}
