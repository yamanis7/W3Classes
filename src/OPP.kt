// Kotlin Classes/Object
class Mobil {
    var merk = ""
    var model = ""
    var tahun = 0
}
// Kotlin Constructors
class Buku(var judul: String, var rilis: Int) {

}
// Kotlin Class Functions
class Invoker(var dialogue: String, var type: String) {
    fun pilih() {
        println("You choose Invoker!")
    }
    fun ult(damage: Int) {
        println("Sun Strik! Dealing Damage " + damage)
    }
}
// Kotlin Inheritance
open class damageType { //Superclass
    val dmg = 750
}
class artsDamage: damageType() { //Subclass
    fun output() {
        println("Total damage = " + dmg)
    }
}
fun main() {
    val c1 = Mobil()

    c1.merk = "Honda"
    c1.model = "Rocky"
    c1.tahun = 2019

    println("Merk = " + c1.merk)
    println("Model = " + c1.model)
    println("Tahun = " + c1.tahun)
    println()

    val book = Buku("Duniawi Perkodingan", 2022)

    println("Judul = " + book.judul)
    println("Rilis = " + book.rilis)
    println()

    val doto = Invoker("Quas Wex Exort!", "Intelligence")

    println(doto.dialogue + " Hero type : " + doto.type)
    doto.pilih()
    doto.ult(1500)
    println()

    val numberDmg = artsDamage()
    numberDmg.output()
}

