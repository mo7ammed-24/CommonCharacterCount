fun main() {
    println(commonCharacterCount("aabcc","adcaa"))
}

fun commonCharacterCount(s1: String, s2: String): Int {
    var count =0
    var charList=mutableListOf<Char>()
    var count1=0
    var count2=0
    for(i in 0 until s1.length){
        count1=0
        count2=0
        if(s1[i] in charList)
            continue
        else
        {var element=s1[i]
            for(j in 0 until s1.length)
                if(s1[j]==element)
                    count1+=1
            for(k in 0 until s2.length)
                if(s2[k]==element)
                    count2+=1
            if(count1>count2)
                count+=count2
            if(count2>=count1)
                count+=count1
            charList.add(element)}}
    return count
}