package hello.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	List<Topic> topicList = new ArrayList<>(Arrays.asList(new Topic(12, "Java Stream"), new Topic(24, "Java Lambda"),
			new Topic(36,"Java Method Reference")));
	
	
	public List<Topic> getAllTopics(){
	return topicList;	
	}

	public Topic getTopicById(int id) {
		
	/*	List<Topic> list = getAllTopics();
		
		for(Topic t : list) {
			if(t.getTopicId()==id) {
				System.out.println(t.getTopicName());
				return t;
			}
		}
		return null;*/
		
		return getAllTopics().stream().filter(t->t.getTopicId()==id).findFirst().get();
		
	}

	public void addTopic(Topic topic) {
		topicList.add(topic);
	}

	public void updateTopic(Topic topic, int id) {
		List<Topic> list = getAllTopics();
		
		for(Topic t:list) {
			
			if(t.getTopicId()==id)
			{
				t.setTopicId(topic.getTopicId());
				t.setTopicName(topic.getTopicName());
				
			}
		}
		
	}

	public void deleteTopic(int id) {
		/*List<Topic> list = getAllTopics();
		int index=-1;
		for(Topic t:list) {
			
			if(t.getTopicId()==id)
			{
			index=list.indexOf(t);
				
			}	
		}
		
		if(index>=0)
			list.remove(index);*/
		
		topicList.removeIf(t->t.getTopicId()==id);
		
	}
	

}
