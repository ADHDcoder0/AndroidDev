package com.example.myapplication//package com.example.myapplication
//
//var itmes:MutableList<Pair<String, String>> = mutableListOf<Pair<String,String>>()
////creating list of pair SYNTAX-- Pair<String,String>
//fun main(){
//    //
//    //TAKING INPUT FROM THE USER
//    var item:String
//    var location:String
//
//    var switch = true;
//    while(switch) {
//        var obj: String
//        println("Choose Your Desired Option" +
//                "Press 1 to Add Lost Items" +
//                "Press 2 to Search Lost Item" +
//                "Press 3 top Search Items Lost at A Place" +
//                "Press 4 to Remove a certain Item" +
//                "Press 5 to Display The complete List" +
//                "Press X to Exit the program"
//        )
//        obj=readLine()!!.lowercase()
//
//        when(obj){
//            "1"->{
//                println("Enter the item to add")
//                item = readLine()!!.lowercase()
//                println("Enter the Location of $item" )
//                location = readLine()!!.lowercase()
//                addToList(item,location)
//            }
//            "2"->{
//                println("Enter the item to search")
//                item = readLine()!!.lowercase()
//                searchInList(item)
//            }
//            "3"->{ println("Enter the Location to search" )
//                location = readLine()!!.lowercase()
//                searchForLocation(location)
//            }
//            "4"->{
//                println("Enter the item to")
//                item = readLine()!!.lowercase()
//                removeFromList(item)
//            }
//            "5"->println(itmes)
//            "x"-> switch = false
//            else->println("invalid Input")
//        }
//
//
//    }
//}
//fun addToList(X:String,Y:String){
//    itmes.add(X to Y)
//}
//fun removeFromList(X:String) {
//    itmes.removeIf { it.first.equals(X, ignoreCase = true) }
//}
//
//fun searchInList(X:String){
//    val found = itmes.any { it.first.equals(X, ignoreCase = true) }
//    if(found) {
//        println("$X is in  the list")
//    }
//    else println("The list is empty")
//}
//fun searchForLocation(X:String){
//    val locations = itmes.find {it.second.equals(X, ignoreCase=true)}
//}
