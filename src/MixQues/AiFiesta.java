package MixQues;

import java.util.ArrayList;
import java.util.HashMap;

class AiUser{
    private  String userName;
    private  String emailId;
    private  String subsPlan;
    private int availableTokens;

    AiUser(String name){
        this.userName = name;
        this.emailId = "Not Provided";
        this.subsPlan = "Free";
        setTokens();

    }

    AiUser(String name,String email){
        this.userName = name;
        this.emailId = email;
        this.subsPlan = "Free";
        setTokens();

    }

    AiUser(String name,String email,String plan){
        this.userName = name;
        this.emailId = email;
        this.subsPlan = plan;

        setTokens();

    }

    private void setTokens() {

        if(subsPlan.equals("Free"))
            availableTokens = 100;

        else if(subsPlan.equals("Pro"))
            availableTokens = 1000;

        else if(subsPlan.equals("Enterprise"))
            availableTokens = 5000;
    }

    void setUserName(String userName) {
        if(userName != null && !userName.trim().isEmpty())
            this.userName = userName;
    }

    void setEmailId(String emailId) {
        if(emailId != null && !emailId.trim().isEmpty())
            this.emailId = emailId;
    }

    void setSubsPlan(String subscriptionPlan) {
        this.subsPlan = subscriptionPlan;
        setTokens();
    }

    void setAvailableTokens(int tokens){
        this.availableTokens = tokens;
    }

    String getUserName(){
        return this.userName;
    }

    String getEmailId(){
        return this.emailId;
    }

    String getSubsPlan(){
        return this.subsPlan;
    }

    int getAvailableTokens(){
        return this.availableTokens;
    }

}

interface AiServices{
    void generateResponse(String prompt);
}

abstract class AiModel implements AiServices{
    String modelName;
    String provider;

    AiModel(String modelName,String provider){
        this.modelName = modelName;
        this.provider = provider;
    }

    void displayModelDetails(){
        System.out.println("Model Name : " + this.modelName);
        System.out.println(("Provider : " + this.provider));
    }

    public abstract void generateResponse(String prompt);
    public abstract int getTokenCost();

}

class Chatgpt extends AiModel{

    Chatgpt(String modelName,String provider){
        super(modelName,provider);
    }

  @Override
  public int getTokenCost(){
      return 20;
  }

  @Override
  public void generateResponse(String prompt){
      System.out.println("Chat GPT Response for: " + prompt);
  }
}

class Gemini extends AiModel{

    Gemini(String modelName,String provider){
        super(modelName,provider);
    }

    @Override
    public int getTokenCost(){
        return 15;
    }

    @Override
    public void generateResponse(String prompt){
        System.out.println("Gemini Response for: " + prompt);
    }
}


class Claude extends AiModel{

    Claude(String modelName,String provider){
        super(modelName,provider);
    }

    @Override
    public int getTokenCost(){
        return 25;
    }

    @Override
    public void generateResponse(String prompt){
        System.out.println("Claude Response for: " + prompt);
    }
}


class InsufficientTokensException extends Exception {

    InsufficientTokensException(String message) {
        super(message);
    }
}



public class AiFiesta {
    HashMap<String ,AiUser> registeredUsers = new HashMap<>();
    ArrayList<String> promptHistory = new ArrayList<>();

    public void processPrompt(String userName, AiModel model, String prompt){
        try {
            AiUser user = registeredUsers.get(userName);
            if(user == null) {
             throw new Exception("User not Found");
            }

            int tokenCost = model.getTokenCost();

            if(user.getAvailableTokens() < tokenCost){
                throw new InsufficientTokensException("Insufficient Tokens");
            }

            model.generateResponse(prompt);

            user.setAvailableTokens(user.getAvailableTokens() - tokenCost);

            promptHistory.add(prompt);

        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    void displayPromptHistory(){

        System.out.println("\nPrompt History");

        for(String p : promptHistory){
            System.out.println(p);
        }
    }


    public static void main(String[] args) {

        AiFiesta app = new AiFiesta();

        // Register Users
        AiUser u1 = new AiUser("Aman");
        AiUser u2 = new AiUser("Rahul", "rahul@gmail.com");
        AiUser u3 = new AiUser("Priya", "priya@gmail.com", "Pro");

        app.registeredUsers.put(u1.getUserName(), u1);

        app.registeredUsers.put(u2.getUserName(), u2);

        app.registeredUsers.put(u3.getUserName(), u3);


        // Create AI Models
        AiModel chatgpt = new Chatgpt("GPT-4", "OpenAI");

        AiModel gemini = new Gemini("Gemini 2.0", "Google");

        AiModel claude = new Claude("Claude 3", "Anthropic");


        // Display Model Details
        chatgpt.displayModelDetails();
        gemini.displayModelDetails();
        claude.displayModelDetails();


        // Process Prompts
        app.processPrompt("Aman", chatgpt, "What is Java?");

        app.processPrompt("Priya", gemini, "Explain OOP");

        app.processPrompt("Rahul", claude, "What is AI?");


        // Remaining Tokens
        System.out.println("\nAman Tokens : " + u1.getAvailableTokens());

        System.out.println("Rahul Tokens : " + u2.getAvailableTokens());

        System.out.println("Priya Tokens : " + u3.getAvailableTokens());


        // Display Prompt History
        app.displayPromptHistory();
    }

}
