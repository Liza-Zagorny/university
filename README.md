# university-homework
## Написать мини-приложение реализующее следующий функционал:
1. Сущности студент, университет, преподаватель;
2. Сущности являются полями друг друга в зависимости от логики (Например если бы у нас были сущности: "кот", "хозяйка кота", то кот мог бы быть полем "питомец" у человека, а человек полем "хозяин" у кота). В вашем же случае у нас 3 сущности;
3. Создать интерфейсы с действиями преподавателя, студента. (три интерфейса, один с общими действиями, и по 1 с уникальным поведением для этих 2 сущностей);
4. В классе _Main, методе main() вызвать сервис, запускающий методы студента и продемонстрировать часть методов поведения;
5. В классе _Main, методе main() вызвать сервис, запускающий методы преподавателя и продемонстрировать часть методов поведения;
6. Создаем несколько сущностей, инициализируем поля, и запускаем у сервисов методы демонстрации, передав туда объекты;
само поведение должно запускаться с использованием интерфейсов (методы сервисов должны принимать параметры типа интерфейса);
