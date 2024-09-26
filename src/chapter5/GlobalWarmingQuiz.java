package chapter5;

    import java.util.Scanner;

    public class GlobalWarmingQuiz {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int score = 0;

            String[] questions = {
                    "1. What is the primary greenhouse gas responsible for global warming?\n1) Oxygen\n2) Nitrogen\n3) Carbon Dioxide\n4) Methane",
                    "2. Which of the following is a potential effect of global warming?\n1) Decreased sea levels\n2) Increased sea levels\n3) More stable weather patterns\n4) Decreased temperatures",
                    "3. What is the main source of human-caused greenhouse gas emissions?\n1) Agriculture\n2) Transportation\n3) Industrial processes\n4) Fossil fuel combustion",
                    "4. Which organization shared the 2007 Nobel Peace Prize with Al Gore for their work on climate change?\n1) NASA\n2) Intergovernmental Panel on Climate Change (IPCC)\n3) World Health Organization (WHO)\n4) Greenpeace",
                    "5. What is a common argument against the severity of global warming?\n1) It is a natural cycle\n2) It is caused by solar activity\n3) It is not happening\n4) All of the above"
            };

            int[] correctAnswers = {3, 2, 4, 2, 4};
            for (int i = 0; i < questions.length; i++) {
                System.out.println(questions[i]);
                System.out.print("Your answer: ");
                int answer = scanner.nextInt();
                if (answer == correctAnswers[i]) {
                    score++;
                }
            }

            System.out.println("\nYour score: " + score + "/5");

            switch (score) {
                case 5:
                    System.out.println("Excellent");
                    break;
                case 4:
                    System.out.println("Very good");
                    break;
                default:
                    System.out.println("Time to brush up on your knowledge of global warming.");
                    System.out.println("Here are some resources to learn more:");
                    System.out.println("1. https://www.britannica.com/science/global-warming");
                    System.out.println("2. https://www.nrdc.org/stories/global-warming-101");
                    System.out.println("3. https://climate.nasa.gov/what-is-climate-change/");
                    break;
            }


        }
    }


