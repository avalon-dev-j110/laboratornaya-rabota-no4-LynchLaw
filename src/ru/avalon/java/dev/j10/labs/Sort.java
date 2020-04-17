package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;

/**
 * Абстрактное представление об объекте, отвечающем за
 * сортировку структурированных объектов.
 *
 * <p>Для сортировки структурированных объектов необходимо
 * иметь возможность сравнивать объекты.
 *
 * @see Comparable
 * @see Comparator
 */
public interface Sort {

    /**
     * Выполняет сортировку переданного массива объектов.
     *
     * @param array массив, подлежащий сортировке
     */
    void sort(Object[] array);

    /**
     * Выполняет сортировку массива сравниваемых объектов.
     *
     * @param array массив, подлежащий сортировке
     */
    void sort(Comparable[] array);

    /**
     * Выполняет сортировку массива объектов с
     * использованием переданного объекта типа
     * {@link Comparator}.
     *
     * @param array массив, подлежащий сортировке
     * @param comparator объект, используемый для сравнения
     *                   элементов массива {@code array}
     */
    void sort(Object[] array, Comparator comparator);
}
