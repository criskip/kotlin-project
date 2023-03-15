fun main(args: Array<String>) {
    print("Enter marks")
    var marks:Int = readLine()!!.toInt()
    if (marks > 100) {
        print("Invalid entry")
    }
    else if (marks >= 80) {
        print("You have a mean grade A , congratulations")
    }
    else if (marks >= 70) {
        print("You have a mean grade A- , very good")
    }
    else if (marks >= 60) {
        print("You have a mean grade B , good job")
    }
    else if (marks >= 50) {
        print("You have a mean grade C , you can do better")
    }
    else if (marks >= 40) {
        print("You have a mean grade D , try harder next time")
    }
    else {
        print("You have a mean grade E , you have to repeat the unit")
    }
}