import java.lang.Exception

class Magazin
{
    var name: String = ""
    var num = 0
    var release = 0
    var year = 2023
    fun Input()
    {
        try {
            println("Введите название газеты:")
            name = readLine()!!.toString()
            println("введите номер газеты:")
            num = readLine()!!.toInt()
            while (num < 0 || num > 1000)
            {
                println("введите номер газеты в диапозоне от 0 до 1000:")
                num = readLine()!!.toInt()
            }
            println("Введите год выпуска газеты:")
            release = readLine()!!.toInt()
            if(release < 0 || release > year)
            {
                println("Введите год выпуска газеты:")
                release = readLine()!!.toInt()
            }
        }
        catch (e: Exception)
        {
            println("Возникла ошибка")
        }
    }
    fun Imafine()
    {
        println("У этой газеты название $name")
    }
    fun ReleaseDate()
    {
        var a = year - release
        when(a)
        {
            1 -> println("Газета $name была выпущенна $a год назад")
            2, 3, 4 ->  println("Газета $name была выпущенна $a года назад")
            5, 6, 7, 8, 9, 10, 11, 12, 13 ,14 ,0  -> println("Газета $name была выпущенна $a лет назад")
        }
    }
    fun Performance()
    {
        println("Название газеты: $name. Номер: $num")
    }
}