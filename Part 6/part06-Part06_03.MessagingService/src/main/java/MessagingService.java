import java.util.ArrayList;

public class MessagingService {
    public ArrayList<Message> service = new ArrayList<>();
    
    public void add(Message message){
        String content = message.getContent();
        if (content.length() <= 280){
            this.service.add(message);
        }
    }
    
    public ArrayList<Message> getMessages(){
        return service;
    }
}
