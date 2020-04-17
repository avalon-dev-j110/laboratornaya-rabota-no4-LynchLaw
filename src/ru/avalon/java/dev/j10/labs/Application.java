package ru.avalon.java.dev.j10.labs;

import java.util.Arrays;
import java.util.Comparator;

public class Application {

    public static void main(String[] args) {
        /*
         * TODO(Студент): Проинициализируйте массив strings
         *
         * Массив слелдует проинициализировать таким образом,
         * чтобы он содержал 20 строк, расположенных не
         * по порядку.
         */
	    String[] strings = null;
	    int l = Math.min(args.length, 20);

	    strings = new String[l];
	    for(int i = 0; i < l; i++){
	    	int elIndex = (int)(Math.random() * args.length);
	    	String elem = args[elIndex];
	    	strings[i] = elem;
	    	args = removeElement(elem, args);
		}

		System.out.println(Arrays.toString(strings));

	    /*
	     * TODO(Студент): Проинициализируйте массив persons
	     *
	     * 1. Создайте класс, реализующий интерфейс Person.
	     *
	     * 2. Проинициализируйте массив persons 20
	     *    экземплярыми созданного класса.
	     */
		PersonInfo[] persons = new PersonInfo[]{
				new PersonInfo("name12", "01.12.1990"),
				new PersonInfo("name2", "02.12.1990"),
				new PersonInfo("name32", "03.12.1990"),
				new PersonInfo("name14", "04.12.1990"),
				new PersonInfo("name", "05.12.1990"),
				new PersonInfo("name", "04.12.1990"),
				new PersonInfo("name5", "07.12.1990"),
				new PersonInfo("name16", "08.12.1990"),
				new PersonInfo("name6", "09.12.1990"),
				new PersonInfo("name66", "10.12.1990"),
				new PersonInfo("name0", "11.12.1990"),
				new PersonInfo("nam", "12.12.1990"),
				new PersonInfo("na", "13.12.1990"),
				new PersonInfo("name11", "14.12.1990"),
				new PersonInfo("name101", "15.12.1990"),
				new PersonInfo("name21", "16.12.1990"),
				new PersonInfo("name4", "17.12.1990"),
				new PersonInfo("test", "18.12.1990"),
				new PersonInfo("ivanov", "19.12.1990"),
				new PersonInfo("petrov", "10.12.1990"),
		};

        /*
         * TODO(Студент): Проинициализируйте переменную sort
         *
         * 1. Создайте класс, реализующий интерфейс Sort
         *
         * 2. Проинициализируйте переменную sort экземпляром
         *    созданного класса.
         */
		SortPersons sort = new SortPersons();

        /*
         * TODO(Студент): Проинициализируйте переменную comparator
         *
         * 1. Создайте класс, реализующий интерфейс Comparator.
         *    Подумайте о контексте, в котором будет
         *    использоваться экземпляр.
         *
         * 2. Проинициализируйте переменную comparator
         *    экземпляром созданного класса.
         */
        Comparator comparator = new MyComparator();

        /*
         * TODO(Студент): Отсортируйте массив persons по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        sort.sort(persons, 0, persons.length - 1);
		PersonInfo[] newPersons = sort.getPersonInfoArray();
		for(int i = 1; i < newPersons.length; i++){
			System.out.println(newPersons[i].getName() + "\t\t" + newPersons[i].getBirthDate());
		}

        /*
         * TODO(Студент): Отсортируйте массив strings по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        sort.sort(strings);
		System.out.println(Arrays.toString(sort.getComparable()));

        /*
         * TODO(Студент): Отсортируйте массив strings по убыванию
         *
         * 1. Подумайте о том, какой Comparator следует
         *    передать, чтобы массив сортировался по убыванию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по убыванию.
         */
		Comparator<String> comp = (String::compareTo);
		sort.sort(strings, comp.reversed());
		System.out.println(Arrays.toString(strings));
    }

    private static String[] removeElement(String del, String[] strings){
    	int l = strings.length;
    	String[] newStrings = new String[l - 1];
    	int j = 0;
    	try{
			for(int i = 0; i < l; i++){
				if (strings[i].equals(del)) continue;
				newStrings[j] = strings[i];
				j++;
			}
		}
    	catch (ArrayIndexOutOfBoundsException ex){
			newStrings = strings;
		}
    	return newStrings;
	}
}
