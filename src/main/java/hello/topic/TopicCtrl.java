package hello.topic;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicCtrl {
		
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> AllTopics() {
		
		return topicService.getAllTopics();
	}

	@RequestMapping(value="/topics/{id}")
	public Topic getById(@PathVariable int id) {
		
		return topicService.getTopicById(id);
	}
	@RequestMapping(value="/topics",method=RequestMethod.POST)
	public String addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
		return "Success";
	}
	
	@RequestMapping(value="/topics/{id}",method=RequestMethod.PUT)
	public String updateTopic(@RequestBody Topic topic, @PathVariable int id) {
		topicService.updateTopic(topic,id);
		return "Topic Updated Successfully";
	}
	
	@RequestMapping(value="/topics/{id}",method=RequestMethod.DELETE)
	public String deleteTopic(@PathVariable int id) {
		topicService.deleteTopic(id);
		return "Topic Deleted Successfully";
	}
}
