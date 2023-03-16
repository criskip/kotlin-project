fun main(args: Array<String>) {
    for (i in 1..50){
        print(i)
        if (i % 5 == 0){
            println(" is divisible")
        }
        else{
            println(" is not divisible")
        }
    }
}