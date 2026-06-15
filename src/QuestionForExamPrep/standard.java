package QuestionForExamPrep;

class foodDelivery{
    int calculateCharge(int foodCharge){
        return foodCharge + 0;
    }
}

class Express extends foodDelivery{
    @Override
    int calculateCharge(int foodCharge){
        return foodCharge + 65;
    }
}

public class standard extends foodDelivery {
    @Override
    int calculateCharge(int foodCharge){
        return foodCharge + 50;
    }
    public static void main(String[] args){
        foodDelivery a;
        a = new standard();
        System.out.println(a.calculateCharge(50));
        a = new Express();
        System.out.println(a.calculateCharge(35));
    }
}
