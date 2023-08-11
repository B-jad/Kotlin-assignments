//fun main()
//{
//    var studentList = mutableListOf<Student>()
//    studentList.add(Student(1,"Allen", 21, 76.00))
//    studentList.add(Student(2,"Annie", 25, 25.25))
//    studentList.add(Student(3,"Bill" , 18, 12.35))
//    studentList.add(Student(4,"Cory" , 17, 34.10))
//    studentList.add(Student(5,"Toby" , 25, 37.10))
//    studentList.add(Student(6,"Jim"  , 29, 84.50))
//
//    println( filterPassedStudents(studentList))
//    println("Average age is ${findAverageAge(studentList)}")
//    println("Details of top scoring student are: ${findTopScorer(studentList)}")
//
//}
//data class Student(val id: Int, val name: String, var age: Int, var marks: Double)
//
//fun filterPassedStudents(studentList: List<Student>) :List<Student>
//{
//    return studentList.filter{ it.marks >=40.00 }
//}
//
//fun findAverageAge(studentList: List<Student>) :Double
//{
//    return studentList.map{it.age}.average()
//}
//
//fun findTopScorer(studentList: List<Student>) :Student
//{
//    return studentList.maxBy { it.marks }
//}