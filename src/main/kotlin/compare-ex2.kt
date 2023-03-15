fun main(args: Array<String>) {
    print("Enter number")
    var number:Int = readLine()!!.toInt()
    if (number == 0) {
        print("Sh20=1GB for one hour")
    }
    else if (number == 1) {
        print("Data deals")
    }
    else if (number == 2) {
        print("Daily bundles")
    }
    else if (number == 3) {
        print("Weekly bundles")
    }
    else if (number == 4) {
        print("GO MONTHLY")
    }
    else if (number == 5) {
        print("No expiry")
    }
    else if (number == 6) {
        print("Video bundles")
    }
    else if (number == 7) {
        print("Okoa data")
    }
    else if (number == 8) {
        print("Lipa mdogo")
    }
    else if (number == 9) {
        print("Data plus new")
            }
    else if (number == 10) {
        print("Hot minutes")
    }
    else {
        print("Choice is invalid")
    }
}