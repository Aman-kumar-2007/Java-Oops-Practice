package QuestionForExamPrep;

    public class TicketBooking {

        public static void main(String[] args) {

            int age = -5;
            int seatNo = 0;

            try {

                if (age < 0)
                    throw new Exception("Invalid Age");

                if (seatNo <= 0)
                    throw new Exception("Invalid Seat Number");

                System.out.println("Booking Successful");

            } catch (Exception e) {

                System.out.println(e.getMessage());

            } finally {

                System.out.println("Booking Process Completed");
            }
        }
    }