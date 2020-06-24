package fr.leroymerlin.oapcoreartyws.converter;

import java.util.List;

/**
 * @author Farouk KABOUCHE
 *
 * Soap Converter
 */
public interface SoapConverter<T, K> {

    T convert(K response);

    List<T> convertList(List<K> response);
}
