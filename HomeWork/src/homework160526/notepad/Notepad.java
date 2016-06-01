package homework160526.notepad;

/**
 * This class collects records into an array, 
 * allows you to delete and edit records.
 */
import java.util.ArrayList;

import homework160526.notepad.Record;

public class Notepad {

	private ArrayList<Record> records = new ArrayList<Record>();
	
	/**
	 * adding records in notepad.
	 * @param record
	 */
	void add(Record record){
		records.add(record);
	}
	/**
	 * removing a record.
	 * @param number
	 */
	void remove(int number){
		records.remove(number);
	}
	/**
	 * editing a record.
	 * @param number
	 * @param text
	 */
	void edit(int number, Record record){
		records.set(number, record);
	}
	/**
	 * view all records.
	 */
	public String toString(){
		String result = "";
		for (int i = 0; i < records.size(); i++) {
			result+=records.get(i).getText() +"\n";
		}
		return result;
		
	}
	

}
