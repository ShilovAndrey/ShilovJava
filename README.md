
В основном классе Main создается экземпляр
класса Tasks и поочередно вызываются его методы:

task.solveTask1() - через консоль принимает пользовательский ввод, проверяет тип введеных
данных, если число больше 7 возвращает "Привет".

task.solveTask2() - через консоль принимает пользовательский ввод, проверяет тип введеных
данных. Если введено слово "Вячеслав"(вне зависимости от регистра), то программа выводит в консоль
выражение "Привет, Вячеслав". Если введено другое слово, то выводится выражение "Нет такого имени".

task.solveTask3() - пользователь через консоль указывает размер массива. Числовой массив
наполняется рандомными значениями. Значения, кратные 3 выводятся в консоль.

task.solveTask4() - в консоль выводится ответ на Задание №4 в текстовом виде.
После этого создается экземпляр класса BracketChecker и вызывается метод check(). Программа
обрабатывает заданное значение строки "[((())()(())]]" и выводит символ, который содержит
в себе ошибку и индекс, по которому располагается этот символ в строке.