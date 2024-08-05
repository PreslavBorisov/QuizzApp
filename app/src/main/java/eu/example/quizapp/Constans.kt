package eu.example.quizapp

object Constants {

    const val User_name: String = "user_name"
    const val Total_Questions: String = "total_questions"
    const val Correct_Answers: String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionsList =ArrayList<Question>()

        val que1  =Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina","Australia",
            "Arminia","Austria",1
        )
        questionsList.add(que1)


        val que2  =Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Bulgaria","Belarus",
            "Belgium","Bolivia",3
        )
        questionsList.add(que2)


        val que3  =Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Brazil","Germany",
            "France","Portugal",1
        )
        questionsList.add(que3)


        val que4  =Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Argentina","Australia",
            "New Zealand","Afghanistan",2
        )
        questionsList.add(que4)


        val que5  =Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Norway","Denmark",
            "Arminia","Estonia",2
        )
        questionsList.add(que5)

        val que6  =Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Philippines","Fiji",
            "China","Thailand",2
        )
        questionsList.add(que6)

        val que7 =Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Uzbekistan","Afghanistan",
            "Kazakhstan","India",4
        )
        questionsList.add(que7)

        val que8  =Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait","Monaco",
            "Yemen","USA",1
        )
        questionsList.add(que8)

        val que9  =Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Austria","Australia",
            "New Zealand","Fiji",3
        )
        questionsList.add(que9)

        return questionsList
    }


}