import java.lang.Exception
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Exam
{
    var fio: String = " "
    var graet: Int = (1..5).random()
    var num_ex = 0
    var date_exm1 = " "
    fun Input() {
        while (true) {
            try {
                println("Введите ваше ФИО:")
                fio = readLine()!!.toString()
                println("Введите дату в формате dd.MM.yyyy")
                date_exm1 = readLine()!!.toString()
                while (true)
                    try {
                        var list = date_exm1.split('-')
                        val dateFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy")
                        val date: LocalDate = LocalDate.parse(list[0], dateFormat)
                        val data_string = date.toString().replace('-', '.')
                        date_exm1 = "$date"
                        break
                    } catch (e: Exception) {
                        println("Введите дату в правилином формате")
                        date_exm1 = readLine()!!.toString()
                    }
            } catch (e: Exception) {
                println("Возникла ошибка")
            }
            break
        }
    }
    fun A() {
        println("Введите номер экзамена:")
        var num_ex = readLine()!!.toInt()
        while (true)
        {
            if (num_ex >= 1 && num_ex <= 3)
            {
                if (num_ex == 1) {
                    println("$fio писал(ла) экзамен по Рпм оценка по которому $graet")
                } else if (num_ex == 2) {
                    println("$fio писал(ла) экзамен по Физ-ра оценка по которому $graet")
                } else if( num_ex ==3){
                    println("$fio писал(ла) экзамен по История оценка по которому $graet")
                }
                break
            }
            else
            {
                try {
                    println("Введите номер экзамена в диапозоне от 1 до 3:")
                    num_ex = readLine()!!.toInt()
                } catch (e: Exception) {
                    println("Возникла ошибка")

                }
            }
        }
    }
    fun B() {
        println("Экзамен писалися $date_exm1")
    }
}
