package com.sagar.quizz

object Constants {
    fun getQuestion() : ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val ques1 = Question(
            1,"What country does this flag belongs to?",
                R.drawable.ic_flag_of_argentina,
            "Argentina", "fiji",
            "denmark", "India",
            1
        )
        questionList.add(ques1)

        val ques2 = Question(
            2, "what country does this flag belongs to?",
            R.drawable.ic_flag_of_australia,
            "denmark","USA",
            "germany", "Australia",
            4
        )
        questionList.add(ques2)

        val ques3 = Question(
            3, "what country does this flag belongs to?",
            R.drawable.ic_flag_of_belgium,
            "denmark","belgium",
            "ukraine", "Australia",
            2
        )
        questionList.add(ques3)

        val ques4 = Question(
            4, "what country does this flag belongs to?",
            R.drawable.ic_flag_of_brazil,
            "denmark","USA",
            "brazil", "Australia",
            3
        )
        questionList.add(ques4)

        val ques5 = Question(
            5, "what country does this flag belongs to?",
            R.drawable.ic_flag_of_denmark  ,
            "denmark","USA",
            "germany", "India",
            1
        )
        questionList.add(ques5)

        val ques6 = Question(
            6, "what country does this flag belongs to?",
            R.drawable.ic_flag_of_fiji,
            "denmark","fiji",
            "germany", "Australia",
            2
        )
        questionList.add(ques6)

        val ques7 = Question(
            7, "what country does this flag belongs to?",
            R.drawable.ic_flag_of_germany,
            "denmark","USA",
            "germany", "Australia",
            3
        )
        questionList.add(ques7)

        val ques8 = Question(
            8, "what country does this flag belongs to?",
            R.drawable.ic_flag_of_india,
            "India","USA",
            "germany", "Australia",
            1
        )
        questionList.add(ques8)

        val ques9 = Question(
            9, "what country does this flag belongs to?",
            R.drawable.ic_flag_of_kuwait,
            "kuwait","New Zealand",
            "germany", "Australia",
            1
        )
        questionList.add(ques9)

//        val ques10 = Question(
//            10, "what country does this flag belongs to?",
//            R.drawable.ic_flag_of_new_zealand,
//            "denmark","New zealand",
//            "germany", "Australia",
//            2
//        )
//        questionList.add(ques10)

        return questionList
    }
}