
# java数据结构
## 1.Collection
### 1.1 集合介绍
* 几个可以存储多个元素，但是对多个元素也有不通的需求
    * 多个元素，不能有相同的
    * 多个元素，能够按照某个规则进行排序
*  针对不同的需求：java提供了很多不同的集合类，多个集合的数据结构不同。但是，结构不重要
* 把集合的东西不断往上提取，最终形成集合的继承体系

集合按照其存储结构可以分为两类，分别是单列集合java.util.Collection和双列集合
java.util.Map

Collection：单列集合的根接口，用于存储一系列满足某种规则的元素，有两个子接口java.util.List和
java.util.Set。其中List中的元素是有序的，元素可以重复。Set的特点是元素无需，而且不可以重复。
List接口主要实现类有java.util.ArrayList和java.util.LinkedList，Set接口主要实现类有
java.util.HashSet和java.util.TreeSet

继承体系如下：
Collection
* **List(接口)**
    * ArrayList 用数组实现的集合类
    * LinkedList 用链表实现的集合类
    * Vector 用数组实现的集合类
* **Set(接口)**
    * HashSet
        * LinkedHashSet
    * TreeSet
## 2. Iterator 迭代器
### 2.1 迭代器介绍
Collection接口实现了Iterable接口，有Iterator这个方法

## HashSet集合介绍
与List接口不同的是，Set接口中的元素是无序的，并且都会以某种规则保证存入的元素怒不会重复出现
**HashSet是根据对象的哈希值来确定元素在集合中的存放位置，因此具有良好的存取和查找性能。保证元素的唯一性
的方式依赖于:hashCode和equals方法**
所以存储自定义类时，为了保证集合的唯一性，需要重写hashCode和equals方法，建立自己的比较方式，才能保证hashSet集合中的对象的唯一。

```java
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Student student = (Student) o;
        return age == student.age &&
               Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
```

```java
public class HashSetDemo2 {
    public static void main(String[] args) {
        //创建集合对象   该集合中存储 Student类型对象
        HashSet<Student> stuSet = new HashSet<Student>();
        //存储 
        Student stu = new Student("于谦", 43);
        stuSet.add(stu);
        stuSet.add(new Student("郭德纲", 44));
        stuSet.add(new Student("于谦", 43));
        stuSet.add(new Student("郭麒麟", 23));
        stuSet.add(stu);

        for (Student stu2 : stuSet) {
            System.out.println(stu2);
        }
    }
}
```




### TreeSet
后面再补上



## Map
Map类可以存储一个键和键值的组合，java提供了专门的集合来存放这种对象关系的，即java.util.Map
Map接口和Collection接口的区别：
* Collection集合中的元素时孤立存在的
* Map中的集合是成对存在的，每个元素都是键和键值成对的存储的
* Collection是单列集合，Map是双列集合
* Map的中元素的键不能重复，值可以重复

### Map常用的子类
* HashMap<K,V>:存储数据采用的哈希表结构，元素的顺序不能保证。由于要保证键的唯一，不重复，需要重写
hashCode()方法，equal方法
* LinkedHashMap<K,V>:HashMap有一个子类LinkedHashMap<K,V>，存储数据采用哈希表+链表的结构。
通过链表结构可以保证元素的存储顺序一致；通过哈希表可以保证键的唯一性，不重复，需要重写键的hashCode()和equals()方法
* TreeMap<K,V>:TreeMap集合和Map相比没有特有的功能，底层的数据结构是红黑树；可以对键值进行排序，排序方式有两种：自然排序和比较器排序




