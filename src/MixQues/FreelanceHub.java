package MixQues;


import java.util.ArrayList;
import java.util.HashMap;

class Freelancer{
    private int freelancerId;
    private String freelancerName;
    private String skillCategory;
    private int availableCredits;
    private double totalEarnings;

    Freelancer(String freelancerName){
                this.freelancerName = freelancerName;
                this.skillCategory = "General";
                this.availableCredits = 0;
                this.totalEarnings = 0;
    }

    Freelancer(String freelancerName, String skillCategory){
        this.freelancerName = freelancerName;
        this.skillCategory = skillCategory;
        this.availableCredits = 20;
        this.totalEarnings = 0;
    }

    Freelancer(String freelancerName, String skillCategory, double totalEarnings){
        this.freelancerName = freelancerName;
        this.skillCategory = skillCategory;
        this.availableCredits = 20;
        this.totalEarnings = totalEarnings;
    }

    public void setFreelancerId(int freelancerId) {
        this.freelancerId = freelancerId;
    }

    public void setFreelancerName(String freelancerName) {
        if(freelancerName != null && !freelancerName.isEmpty()) this.freelancerName = freelancerName;
    }

    public void setAvailableCredits(int availableCredits) {
        if(availableCredits >= 0) this.availableCredits = availableCredits;
    }

    public void setSkillCategory(String skillCategory) {
        this.skillCategory = skillCategory;
    }

    public void setTotalEarnings(double totalEarnings) {
        if(totalEarnings >= 0) this.totalEarnings = totalEarnings;
    }

    public int getFreelancerId() {
        return freelancerId;
    }

    public double getTotalEarnings() {
        return totalEarnings;
    }

    public int getAvailableCredits() {
        return availableCredits;
    }

    public String getFreelancerName() {
        return freelancerName;
    }

    public String getSkillCategory() {
        return skillCategory;
    }

}

interface PaymentService{
    double calculatePayment();
}

abstract  class Project implements PaymentService{
    String projectTitle;
    String clientName;

    Project(String title,String clientName){
        this.projectTitle = title;
        this.clientName = clientName;
    }

    public void displayProjectDetails(){
        System.out.println(this.projectTitle);
        System.out.println(this.clientName);
    }

    public abstract void executeProject();
    public abstract int getRequiredCredits();
    public abstract double calculatePayment();
}

class WebDevelopment extends Project{

    WebDevelopment(String title, String clientName) {
        super(title, clientName);
    }

    @Override
    public double calculatePayment(){
        return 10000;
    }

    @Override
    public void executeProject(){
        System.out.println("webDevelopment");
    }

    @Override
    public int getRequiredCredits(){
        return 5;
    }
}

class GraphicDesign extends Project{

    GraphicDesign(String title, String clientName) {
        super(title, clientName);
    }

    @Override
    public double calculatePayment(){
        return 6000;
    }

    @Override
    public void executeProject(){
        System.out.println("GraphicDesign");
    }

    @Override
    public int getRequiredCredits(){
        return 3;
    }
}

class ContentWriting extends Project{

    ContentWriting(String title, String clientName) {
        super(title, clientName);
    }

    @Override
    public double calculatePayment(){
        return 4000;
    }

    @Override
    public void executeProject(){
        System.out.println("ContentWriting");
    }

    @Override
    public int getRequiredCredits(){
        return 2;
    }
}

class InsufficientCreditsException extends Exception{
    InsufficientCreditsException(String msg){
        super(msg);
    }
}

public class FreelanceHub {

    HashMap<Integer, Freelancer> registeredFreelancers = new HashMap<>();
    ArrayList<String> completedProjects = new ArrayList<>();
    HashMap<Integer, Double> earningsRecord = new HashMap<>();

    public void assignProject(int freelancerId, Project project
    ) throws InsufficientCreditsException {

        Freelancer f = registeredFreelancers.get(freelancerId);

        project.executeProject();

        double cost = project.calculatePayment();

        int credit = project.getRequiredCredits();

        if(f.getAvailableCredits() < credit){
            throw new InsufficientCreditsException("Insufficient Credit");
        }

        f.setAvailableCredits(f.getAvailableCredits() - credit);

        double current = earningsRecord.getOrDefault(f.getFreelancerId(), 0.0);

        earningsRecord.put(f.getFreelancerId(), current + cost);
        completedProjects.add(project.projectTitle);

        f.setTotalEarnings( f.getTotalEarnings() + cost);
    }

    public static void main(String[] args){
//        ??
    }

}
