package com.develhope.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Tester {

	public static void main(String[] args) {
		try {
			Stream<String> lines = Files.lines(Paths.get("C:\\Generation Eclipse\\EserciziDev\\src\\com\\develhope\\streams\\file.txt"));
			lines.forEach(line -> System.out.println(line));
			lines.close();
		} catch (IOException e) {
			System.err.println("Eccezione");
			e.printStackTrace();
		}
	}
}
