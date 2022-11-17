fun main(args: Array<String>) {
    print(solution(mutableListOf(5, 3, 6, 7, 9)))
}

fun solution(inputArray: MutableList<Int>): Int {
    val tempList = ArrayList<Int>()
    for (i in 0 until inputArray.maxOrNull()!! + 1) {
        if (inputArray.contains(i))
            tempList.add(i)
        else
            tempList.add(0)
    }

    var distance = 1

    outerLoop@ while (true) {
        for (i in 0 until tempList.size / distance) {
            if (i * (distance) >= tempList.size) {
                break
            }
            if (tempList[i * (distance)] != 0) {
                distance++
                continue@outerLoop
            }
        }

        return distance + 1
    }

    return 1
}
