package homework160526.notepad;

public class Main {

	public static void main(String[] args) {
		Notepad notepad = new Notepad();
		
		Record record = new Record();
		record.setText("text");
		
		Record record1 = new Record();
		record1.setText("text1");
		
		notepad.add(record);
		notepad.add(record1);
		notepad.add(record1);
		System.out.println(notepad);
		
		notepad.remove(2);
		System.out.println(notepad);
		
		notepad.edit(1, record);
		System.out.println(notepad);



	}

}
