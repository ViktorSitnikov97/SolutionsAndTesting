## Уникальные элементы_task1 ##

В классе ListUtils создать обобщенный статический метод uniq, который удаляет все дубликаты из списка. Метод принимает  
список элементов и возвращает новый список, в котором отсутствуют дубликаты. Элементы в итоговом списке должны идти в  
порядке их появления в исходном списке.
~~~Java
var fruits = new ArrayList<>(List.of("mango", "apple", "lemon", "apple", "pear", "mango"));
var result = ListUtils.uniq(fruits);
System.out.println(result); // => [mango, apple, lemon, pear]
~~~

## Стек_task2 ##   

В файле создать обобщенный класс Stack, который будет представлять собой стек. Для работы со стеком реализовать следующие методы:
   * push() — добавляет элемент в стек. Принимает в качестве параметра элемент и кладет его на вершину стека. Метод должен вернуть
сам этот элемент;
   * pop() — забирает элемент из стека. Удаляет элемент с вершины стека и возвращает этот элемент. Если стек пуст, метод должен
выбросить исключение java.util.EmptyStackException;
   * peek() — возвращает элемент с вершины стека без его удаления;
   * isEmpty() — Проверяет стек на пустоту. Возвращает true, если стек пуст и false в ином случае.

~~~Java
var stack = new Stack<String>();

stack.isEmpty(); // true

stack.push("a"); // a
stack.isEmpty(); // false

stack.push("b"); // b
stack.peek(); // b

stack.pop(); // b
stack.pop(); // a
stack.isEmpty(); // true

// Стек уже пуст
stack.pop(); // Exception
~~~

## Поиск максимального_task3 ##

В классе App создать обобщенный статический метод findMax(), который принимает список объектов, реализующих интерфейс Comparable   
и возвращает максимальное значение из списка.

~~~Java
var coll1 = List.of("a", "b", "x", "h", "o");
App.findMax(coll1); // x

var coll2 = List.of(1, 2, 3, 10, 4, 5, 6);
App.findMax(coll2); // 10
~~~

## Конвертер_task4 ##  

В файле создать обобщенный класс FunctionConverter<T, U>, который реализует интерфейс Converter<T, U>. Добавить в класс конструктор  
и необходимые методы. Конструктор класса должен принимать в качестве параметра лямбда-функцию Function<T, U>. Это функция определяет  
правила конвертации одного значения в другое.  
Вот как мы можем использовать наш конвертер. Предположим, у нас есть Map, который представляет собой пост в блоге, и нам нужно  
преобразовывать такие мапы в объекты класса Post:

~~~Java
var postData = Map.of(
        "name", "test post",
        "body", "test body"
);

// Функция, которая определяет правила конвертации Map в объект класса Post
Function<Map<String, String>, Post> func = data -> {
    return new Post(
            data.get("name"),
            data.get("body")
    );
};

// Создаем конвертер для конвертации Map в объект класса Post
var converter = new FunctionConverter<Map<String, String>, Post>(func);

// Теперь мы можем преобразовывть Map в объекты класса Post
var post = converter.convert(postData);
~~~

## Пары_task5 ##

В классе PairUtils создать два метода для работы с парами:

- Обобщенный статический метод fromPairs(), который принимает список List пар Pair ключ-значение и возвращает составленный из этих пар Map

~~~Java
List<Pair<String, Integer>> coll = List.of(
        new SimplePair("a", 1),
        new SimplePair("b", 2)
);

var result = PairUtils.fromPairs(coll);
System.out.println(result); // => {a=1, b=2}
~~~

- Обобщенный статический метод toPairs(), который выполняет обратное действие. Принимает Map и возвращает список List пар Pair, составленных
з пар ключ-значение мапы

~~~Java
Map<String, Integer> data = new LinkedHashMap();
data.put("a", 1);
data.put("b", 2);

var result = PairUtils.toPairs(data);
System.out.println(result); // => [SimplePair(left=a, right=1), SimplePair(left=b, right=2)]
~~~