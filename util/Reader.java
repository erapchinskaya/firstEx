package main.java.com.it.app.util;

import java.util.Collection;

public interface Reader<T> {
	Collection<Object> read(T source);
}
