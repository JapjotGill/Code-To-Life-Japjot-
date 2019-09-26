package org.japjot.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	//private static Logger logger = LoggerFactory.getLogger(TopicService.class);
	
	@Autowired
    private Repositories repositories;
	
	/*
	 * private List<Topic> topics = new ArrayList<>(Arrays.asList( new
	 * Topic("Spring","Spring Framework","Spring Framework Description"), new
	 * Topic("Java","Core Java","Core Java Description"), new
	 * Topic("javascript","Javascript","Javascript Description") ));
	 */
	
	
	
	public List<Topic> getAllTopics(){
		//return topics;
		//logger.info("Getting Messages");
		//logger.debug("DEbug default");
		//logger.error("Error Message");
		List <Topic> topics = new ArrayList<>();
		repositories.findAll().forEach(topics::add);
		return topics;

	}
	
	public Topic getTopic(long id) {
    // return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
     return repositories.findById(id).get();
	}

     public void addTopic(Topic topic) {
	//topics.add(topic);
    	 repositories.save(topic);
	}

	public void updateTopic(long id, Topic topic) {
		/*
		 * for(int i =0; i<topics.size();i++) { Topic t = topics.get(i);
		 * if(t.getId().equals(id)) { topics.set(i,topic); return;
		 */
			
		repositories.save(topic);
		
	}

	public void deleteTopic(long id) {
		//topics.removeIf(t ->t.getId().equals(id));
		repositories.deleteById(id);
	}
	public List<Topic> getByName( String name){

		return repositories.findByName( name);
	}
	

	
}
