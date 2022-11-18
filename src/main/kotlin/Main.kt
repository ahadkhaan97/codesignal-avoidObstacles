fun main() {
    print(solution(mutableListOf(1000, 999)))
}

fun solution(inputArray: MutableList<Int>): Int {
    val tempList = ArrayList<Int>()
    for (i in 0 until inputArray.maxOrNull()!! + 1) {
        if (inputArray.contains(i))
            tempList.add(i)
        else
            tempList.add(0)
    }
    tempList.add(0)

    var distance = 1

    outerLoop@ while (true) {
        for (i in 0 until (tempList.size / distance) + 1) {
            if ((tempList.size / distance) > tempList.size) {
                break
            }
            try {
                if (tempList[i * (distance)] != 0) {
                    distance++
                    continue@outerLoop
                }
            } catch (e: Exception) {
                return distance
            }
        }

        return distance
    }
}
