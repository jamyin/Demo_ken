package com.jam.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
/**
 * @author by Jam 2015-2-10 上午11:28:18
 */
public class Test_File {

	public static void main(String[] args) throws Exception {
		FileManager a = new FileManager("D://javatest//a1.txt", new char[] { '\n' });
		FileManager b = new FileManager("d://javatest//b1.txt", new char[] { '\n', ' ' });
		FileWriter c = new FileWriter("D://javatest//c1.txt");
		String aWord = null;
		String bWord = null;
		while ((aWord = a.nextWord()) != null) {
			c.write(aWord + "\n");
			bWord = b.nextWord();
			if (bWord != null)
				c.write(bWord + "\n");
		}
		while ((bWord = b.nextWord()) != null) {
			c.write(bWord + "\n");
		}
		c.close();
	}

	static class FileManager {
		String[] words = null;
		int pos = 0;

		public FileManager(String filename, char[] seperators) throws Exception {
			File f = new File(filename);
			FileReader reader = new FileReader(f);
			char[] buf = new char[(int) f.length()];
			int len = reader.read(buf);
			String results = new String(buf, 0, len);
			String regex = null;
			if (seperators.length > 1) {
				regex = "" + seperators[0] + "|" + seperators[1];
			} else {
				regex = "" + seperators[0];
			}
			words = results.split(regex);
		}

		public String nextWord() {
			if (pos == words.length)
				return null;
			return words[pos++];
		}
	}
}
