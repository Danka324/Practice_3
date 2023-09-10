import java.util.Random
import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
 //Задание 1
 /*используем булеву логику для
определения, находится ли возраст в промежутке от 13 до 19*/

 val myAge = 18
 val isTeenager: Boolean = myAge >= 13 && myAge <= 19
 println(isTeenager)

 //Задание 2
 /*используем
булеву логику, чтобы определить, являются ли оба человека
подростками*/

 val theirAge = 30
 val bothTeenagers = theirAge >= 13 && theirAge <= 19 && isTeenager
 println(bothTeenagers)

 //Задание 3
 /*используем равенство строк,
чтобы определить, равны ли reader и author*/

 val reader = "Dana"
 val author = "Richard Lucas"
 val authorIsReader = reader == author

 //Задание 4
 /*используем сравнение
строк, чтобы определить, следует ли reader перед author по алфавиту*/

 val readerBeforeAuthor = reader < author
 println(readerBeforeAuthor)

 //Задание 5
 /*Написали выражение if для вывода слова Подросток, если мне от 13 до
19 лет, и Не подросток, если это не так*/

 val myAge2 = 18
 if (myAge2 >= 13 && myAge2 <= 19)
  println("isTeenager")
 else
  println("not a teenager")

 //Задание 6
 /*сделали тоже самое с помощью однострочного выражения*/

 val answer = if (myAge2 >= 13 && myAge2 <= 19)
  println("isTeenager")
 else
  println("not a teenager")
 println(answer)

 //Задание 7
 /*создали
цикл while с условием counter < 10, который выводит counter равен X
(где Х заменяется значением counter) и затем увеличивает counter на 1*/

 var counter = 0
 while (counter < 10) {
  println(counter)
  counter += 1
 }

 //Задание 8
 /*создали
цикл do-while. Внутри цикла указали, что переменная roll равна
Random().nextInt(6), то есть выбор случайного числа между 0 и 5. Затем
увеличили counter на 1. Под конец вывели : После X бросков, roll равен
Y, где Х является значением counter, а Y — значением roll. Указали
условие цикла, при котором цикл будет заканчиваться при выпаде
первого 0*/

 counter = 0
 var roll = 0
 do {
  roll = Random().nextInt(6)
  counter += 1
  println("После $counter бросков, roll равен $roll")
 } while (roll != 0)

 //Задание 9
 /*создали константу range, ее интервал от 1 до 10 включительно.
Написали цикл for, который выполняет итерацию по этому интервалу и
выводит квадрат каждого числа*/

 val range = 1..10
 for (i in range) {
  println("${i.toDouble().pow(2.0)}")
 }

 //Задание 10
 /*сделали тоже самое , но вывели квадратный корень из каждого числа */

 val range1 = 1..10
 for (i in range1) {
  println("${sqrt(i.toDouble())}")
 }

 //Задание 11
 /*Изменили код с примера, чтобы он использовал шаг step с первым циклом for,
чтобы пропускать четные строки вместо использования continue.
Убедились, что сумма равна 448 */

 var sum = 0
 for (row in 1 until 8 step 2) {
  for (column in 0 until 8) {
   sum += row * column
  }
  println(sum)
 }
}