# Traffic Blocks
Данное упражнение взял из [статьи](https://habr.com/ru/articles/440436/#100) на Хабр.
## Задача
Требуется определить, сколько дорожных ограничений действовало в городе на определенную дату.
Программа в качестве аргумент получает два параметра:
- Путь к файлу с данными
- Дата
## Подготовка данных
С портала открытых данных Санкт-Петербурга загружаем [данные об ограничении движения транспорта на период производства работ](https://data.gov.spb.ru/irsi/7803032323-Dannye-ob-ogranichenii-dvizheniya-transporta-na-period-proizvodstva-rabot/structure_version/409/?search_all=%D0%BE%D0%B3%D1%80%D0%B0%D0%BD%D0%B8%D1%87%D0%B5) в формате csv.
## Технологии/классы
- [Lombok](https://www.google.com/url?sa=t&source=web&rct=j&opi=89978449&url=https://projectlombok.org/&ved=2ahUKEwjbmeiC0pOLAxVbFxAIHW8mKHkQFnoECAgQAQ&usg=AOvVaw2I1yZsNyZNywgaVKV4kHG0)
- [OpenCSV](https://opencsv.sourceforge.net/#quick_start)
- [SimpleDateFormat](https://docs.oracle.com/javase/10/docs/api/java/text/SimpleDateFormat.html)
- [Date](https://docs.oracle.com/javase/10/docs/api/java/util/Date.html)
