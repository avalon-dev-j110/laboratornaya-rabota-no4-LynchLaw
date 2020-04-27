package ru.avalon.java.dev.j10.labs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class Application {

    public static void main(String[] args) throws ParseException {
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

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");

		PersonInfo[] persons = new PersonInfo[]{
				new PersonInfo("name12", dateFormat.parse("01 03 1985")),
				new PersonInfo("name2", dateFormat.parse("02 03 1985")),
				new PersonInfo("name32", dateFormat.parse("03 03 1985")),
				new PersonInfo("name14", dateFormat.parse("04 03 1985")),
				new PersonInfo("name", dateFormat.parse("05 03 1985")),
				new PersonInfo("name", dateFormat.parse("04 03 1985")),
				new PersonInfo("name5", dateFormat.parse("07 03 1985")),
				new PersonInfo("name16", dateFormat.parse("08 03 1985")),
				new PersonInfo("name6", dateFormat.parse("09 03 1985")),
				new PersonInfo("name66", dateFormat.parse("10 03 1985")),
				new PersonInfo("name0", dateFormat.parse("11 03 1985")),
				new PersonInfo("nam", dateFormat.parse("12 03 1985")),
				new PersonInfo("na", dateFormat.parse("13 03 1985")),
				new PersonInfo("name11", dateFormat.parse("14 03 1985")),
				new PersonInfo("name101", dateFormat.parse("15 03 1985")),
				new PersonInfo("name21", dateFormat.parse("16 03 1985")),
				new PersonInfo("name4", dateFormat.parse("17 03 1985")),
				new PersonInfo("test", dateFormat.parse("18 03 1985")),
				new PersonInfo("ivanov", dateFormat.parse("19 03 1985")),
				new PersonInfo("petrov", dateFormat.parse("20 03 1985")),
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
		for(int i = 1; i < persons.length; i++){
			System.out.println(persons[i].getName() + "\t\t" + persons[i].getBirthDate());
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
		System.out.println(Arrays.toString(strings));

        /*
         * TODO(Студент): Отсортируйте массив strings по убыванию
         *
         * 1. Подумайте о том, какой Comparator следует
         *    передать, чтобы массив сортировался по убыванию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по убыванию.
         */
		sort.sort(strings, comparator);
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
