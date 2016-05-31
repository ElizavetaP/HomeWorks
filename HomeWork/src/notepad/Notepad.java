package notepad;

import homework160526.Record;

/**
 * This class collects records into an array, 
 * allows you to delete and edit records.
 */
import java.util.ArrayList;

public class Notepad {

	private ArrayList<Record> records;
	
	/**
	 * adding records in notepad.
	 * @param record
	 */
	void add(Record record){
		records.add(record.getText());
	}
	/**
	 * removing a record.
	 * @param number
	 */
	void remove(int number){
		records.remove(number);
	}
	/**
	 * 
	 * @param number
	 * @param text
	 */
	void edit(int number, String text){
		records.set(number, text);
	}
	/**
	 * view all records.
	 */
	void view(){
		for (int i = 0; i < records.size(); i++) {
			System.out.println(records.get(i));
		}
	}
	

}
