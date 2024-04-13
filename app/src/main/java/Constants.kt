package com.example.lpu_quiz_application

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "Which university is this ?",
            R.drawable.img_4,
            "Lovely Professional University", "Punjab University",
            "Chandigarh University", "CT University", 1
        )
        questionsList.add(que1)

        val que2 = Question(
            2, "Who is the  chancellor of Lovely Professional University?",
            R.drawable.img_2,
            "Sanjay Modi", "Dr. Ashok Mittal",
            "Sudha Shankar", "Reshmi mittal", 2
        )
        questionsList.add(que2)

        val que3 = Question(
            3, "Who is the Pro Vice-chancellor of Lovely Professional University?",
            R.drawable.img_3,
            "Dr. Preeti Bajaj", "Reshmi Mittal",
            "Sanjay Modi", "Lovi Raj", 2
        )
        questionsList.add(que3)

        val que4 = Question(
            4, "Which state is Lovely Professional University located in?",
            R.drawable.img,
            "Mumbai", "Banglore",
            "Delhi", "Punjab", 4
        )
        questionsList.add(que4)

        val que5 = Question(
            5, "Which NAAC-accredited grade has been achieved by Lovely Professional University?",
            R.drawable.img_5,
            "NAAC A++", "NAAC A+",
            "NAAC A", "UGC", 1
        )
        questionsList.add(que5)

        val que6 = Question(
            6, "Who are the Lovely Professional University alumni?",
            R.drawable.img_1,
            "Bujrang Punia", "Akshay Kumar",
            "Neeraj Chopra", "Anurag Thakur", 3
        )
        questionsList.add(que6)

        return questionsList
    }
}