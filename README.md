# Шпаргалка

Для того, что бы русский текст корректно отображался в консоли, программы необходимо компилировать с помощью специального ключа:
```sh
javac -encoding utf8 имя_класса.java
```

Для отображения байт-кода класса необходимо в консоли перейти в папку, в которой находится файл MyFirstApp.class, и написать:
```sh
javap -c -s -verbose MyFirstApp
```
При случайном добавлении  git add файла. Как сделать так что бы файл или папку git не видел и не индексировал?
```sh
Написать в консоли git rm -r --cached out, а после занести папку out в файл .gitignore
Пример:
git rm -r --cached "Lesson1" "Lesson2"
```


Как, используя класс Scanner получить тип данных char?
```sh
Например, так: char mathOperation = reader.next().charAt(0);
```

### Используем пакеты
В каталоге src создадим дополнительные каталоги, чтобы путь к файлу выглядел так: src/com/qwertovsky/helloworld/HelloWorld.java.

Поместим наш класс в пакет с именем com.qwertovsky.helloworld. Для этого добавим в начало файла строчку
```sh
package com.qwertovsky.helloworld;
```
```sh
    '---src
        '---com
            '---qwertovsky
                '---helloworld
                    '---HelloWorld.java 
```
Компилируем:
```sh
javac -d out src/com/qwertovsky/helloworld/HelloWorld.java
```
Запускаем:
```sh
java -classpath ./out com.qwertovsky.helloworld.HelloWorld
```
```sh
Пример:
    HelloWorld
    '---out
    '   '---com
    '       '---qwertovsky
    '          '---helloworld
    '             '---HelloWorld.class
    '---src
        '---com
            '---qwertovsky
                '---helloworld
                    '---HelloWorld.java 
```

При использовании нескольких файлов для запуска используем следующую команду:
Компилируем:
```sh
javac -sourcepath ./src -d out src/com/qwertovsky/helloworld/HelloWorld.java
```
Запускаем:
```sh
java -classpath ./out com.qwertovsky.helloworld.HelloWorld
```
### Пример для запуска игры через консоль StartJava
Компиляция:
```sh
javac -encoding utf-8 -sourcepath ./src -d out src/com/startjava/Lesson2_3/calculator/CalculatorTest.java
```
Запуск:
```sh
java -classpath ./out com/startjava/Lesson2_3/game/GuessNumberTest
```

### Просмотр структуры проекта
```sh
tree /F
```
