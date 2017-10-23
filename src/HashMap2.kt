fun main(args: Array<String>) {
    var map=HashMap<String,String>()
    map.put("nama depan","Akhmad")
    map.put("nama tengah","Khanif")
    map.put("nama belakang","Zyen")
    println(map.get("nama depan"))

    map.put("nama tengah","Unisnu Jepara")
    //println(map.keys)
    for(k in map.keys){
        println(k +" "+map.get(k))
    }
}