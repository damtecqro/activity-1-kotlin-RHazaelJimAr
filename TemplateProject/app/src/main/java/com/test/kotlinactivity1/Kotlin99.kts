package com.test.kotlinactivity1

import kotlin.*
//Randy Hazael Jiménez Arriaga - A01251333

@Suppress("UNCHECKED_CAST")

    //Solution P07
    /*Algorithm:
    * function flatten (List list)
    *   flat = new List[]
    *   for(i in list){
    *       if(i.typeOf == List)
    *           flatten (i)
    *       else
    *           flat.append(i)
    *   return flat
    *            */
    fun P07(list:List<Any>) : List<Any> =
        list.flatMap{
            if(it is List<*>) P07(it as List<Any>) else listOf(it)
        }
    var flat = P07(listOf(listOf(1, 1), 2, listOf(3, listOf(5, 8))))
    println(flat)
    flat = P07(listOf(1,2,3,4))
    println(flat)
    flat = P07(listOf(2, listOf(listOf(1,2,3,listOf(2,4))), listOf(1,2), 4))
    println(flat)

    //Solution P33
    /*Algorithm:
    * public bool coprime(int n, int m)
    *   int gcd = 1
    *   int i = 1
    *   while (i <= n && i <= m) {
    *       if (n % i == 0 && m % i == 0)
    *           gcd = i
    *       ++i
    *   }
    *   return gcd == 1*/
    fun P33(n:Int, m:Int) : Boolean {
        var gcd = 1
        var i = 1
        while (i <= n && i <= m){
            if(n % i == 0 && m % i == 0)
                gcd = i
            ++i
        }
        return gcd == 1
    }
    var cop = P33(35, 64)
    println(cop)
    cop = P33(2, 4)
    println(cop)
    cop = P33(6, 7)
    println(cop)