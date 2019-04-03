package com.example.whowantstobeamillionaire;

public class QuestionLibrary {

    public int[] money = {
            100,
            200,
            300,
            500,
            1000,
            2000,
            4000,
            8000,
            16000,
            32000,
            64000,
            125000,
            250000,
            500000,
            1000000
    };
    public String questions[] = {
            "What continent did all humans originate from?",
            "How many days are in December?",
            "How many days are in February?",
            "How many legs do humans have?",
            "What is the name of this course?",
            "What is the current minimum wage in New Jersey?",
            "What is the most famous sport in America?",
            "What is the most popular sport in the world?",
            "How is the instructor for this course?",
            "How many bits in one byte?",
            "How many bases make up DNA?",
            "What is the best time complexity for algorithms?",
            "Who is the first programmer?",
            "Who is the fastest person in the world?",
            "What do you call a group of crows"

    };

    public String answers[] = {
            "Africa",
            "31",
            "28",
            "2",
            "CSIT451_01SP19 MOBILE COMPUTING",
            "8.85",
            "Football",
            "Soccer",
            "Dr. Hongbo Zhou",
            "8",
            "4",
            "O(1)",
            "Ada Lovelace",
            "Usain Bolt",
            "Murder"
    };

    public String [][] possibleAnswers = {
            {"Antarctica", "Africa", "North America", "South America"},
            {"31", "30", "29", "28"},
            {"31", "30", "29", "28"},
            {"1", "2", "3", "4"},
            {"CSIT451_01SP19 MOBILE COMPUTING", "CSIT451_01SP19 ANDROID DEVELOPMENT", "CSIT212_03FA18 DATA STRUCTURES AND ALGORITHMS", "CSIT104_01SP19 INTRO TO COMPUTER CONCEPTS"},
            {"8.35", "8.45", "8.65", "8.85"},
            {"Football", "Soccer", "Basketball", "Baseball"},
            {"Running", "Swimming", "Soccer", "ESports"},
            {"Dr. Hongbo Zhou", "Dr, Dawei Li", "Dr. Boxiang Dong", "Dr. Katherine Herbert"},
            {"6", "7", "8", "9"},
            {"4", "5", "6", "7"},
            {"O(n)", "O(2)", "O(1)", "O(n!)"},
            {"Alan Turing", "Steve Jobs", "Bill Gates", "Ada Lovelace"},
            {"Usain Bolt", "Asafa Powell", "LeBron James", "Micheal Jordan"},
            {"Ravens", "Flock", "Murder", "Caravan"}
    };

    public String getCorrectAnswer(int currentQuestion) {
        return answers[currentQuestion];
    }

    public String getChoiceOne(int currentQuestion) {
        return possibleAnswers[currentQuestion][0];
    }

    public String getChoiceTwo(int currentQuestion) {
        return possibleAnswers[currentQuestion][1];
    }

    public String getChoiceThree(int currentQuestion) {
        return possibleAnswers[currentQuestion][2];
    }

    public String getChoiceFour(int currentQuestion) {
        return possibleAnswers[currentQuestion][3];
    }

    public String getQuestion(int currentQuestion) {
        return questions[currentQuestion];
    }
    public int getMoney(int currentQuestion) {
        return money[currentQuestion];
    }
}
