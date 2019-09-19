package org.japjot.client.service;

import java.util.List;

import org.japjot.client.*;
import org.japjot.client.url.EndPoints;
import org.japjot.client.repository.TopicRepositoriesClient;
import org.japjot.client.topic.TopicClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service 
public class TopicServiceClient {

	//@Autowired
	//private TopicRepositoriesClient repository;
	
	private RestTemplate restTemplate = new RestTemplate();
	public EndPoints endPoints = new EndPoints();
	
	
	
	public List<TopicClient> AllTopics()
	{
		ResponseEntity<List<TopicClient>> response = restTemplate.exchange("http://localhost:8081/topics",HttpMethod.GET, null, new ParameterizedTypeReference<List<TopicClient>>(){});
		List<TopicClient> getAllTopics = response.getBody();
		//List<TopicClient> AllTopic = (List<TopicClient>) restTemplate.getForObject("http://localhost:8081/topics", TopicClient.class, new ParameterizedTypeReference<List<TopicClient>>(){});
		//return AllTopic;
		return getAllTopics;
		//ResponseEntity < String > result = restTemplate.exchange(GET_EMPLOYEES_ENDPOINT_URL, HttpMethod.GET, entity,
	      //      String
		
	}
	
	
    public TopicClient getTopic(long id){
    	
    	String a = Long.toString(id);
    	TopicClient topicClient = restTemplate.getForObject("http://localhost:8081/topics/"+a, TopicClient.class);
    	
    
    	return topicClient;

    }
	
    public void AddTopicClient(TopicClient topicClient)
    {
    	restTemplate.postForObject("http://localhost:8081/topics",topicClient,TopicClient.class);
    }
	
    public void RemoveTopicClient(long id)
    {
    	String b = Long.toString(id);
    	restTemplate.delete("http://localhost:8081/topics/"+b);
    }
    
    public void UpdateTopicClient(TopicClient topicClient,long id)
    {
    	String c = Long.toString(id);
    	restTemplate.put("http://localhost:8081/topics/"+c,topicClient,TopicClient.class);
    }
    
}
