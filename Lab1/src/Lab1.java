import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;


/* класс элемент */
class MyStructure{
	int number;
	float value;
	String name;
	
	/* класс элемент */
	public MyStructure(int number, float value, String name){
		this.number = number;
		this.value = value;
		this.name = name;
	}
	
	void printToFile(PrintStream stream) {
		stream.printf("%2d %4.2f %5s %n", number, value, name);
	}
}


public class Lab1 {

	public static void main(String[] args) {
		
		MyStructure MyArray[] = new MyStructure[16];
		
		MyArray[0] = new MyStructure(0, 90, "ppp");
		MyArray[1] = new MyStructure(1, 80, "ooo");
		MyArray[2] = new MyStructure(2, 150, "nnn");
		MyArray[3] = new MyStructure(3, 30, "mmm");
		MyArray[4] = new MyStructure(4, 120, "lll");
		MyArray[5] = new MyStructure(5, 70, "kkk");
		MyArray[6] = new MyStructure(6, 100, "jjj");
		MyArray[7] = new MyStructure(7, 20, "iii");
		MyArray[8] = new MyStructure(8, 110, "hhh");
		MyArray[9] = new MyStructure(9, 50, "ggg");
		MyArray[10] = new MyStructure(10, 170, "fff");
		MyArray[11] = new MyStructure(11, 40, "eee");
		MyArray[12] = new MyStructure(12, 60, "ddd");
		MyArray[13] = new MyStructure(13, 160, "ccc");
		MyArray[14] = new MyStructure(14, 130, "bbb");
		MyArray[15] = new MyStructure(15, 140, "aaa");
		
		/*сортировка по убыванию number*/
		for (int i = 0; i < MyArray.length; i++ ) {
			int j_max = i;
			for(int j=i+1; j<MyArray.length; j++) {
				if(MyArray[j_max].number<MyArray[j].number) {
					j_max=j;
				}
			}
			MyStructure temp = MyArray[i];
			MyArray[i] = MyArray[j_max];
			MyArray[j_max] = temp;
		}
		
		try {
			PrintStream out = new PrintStream(new File("E:\\EG\\Lab1\\src\\data1.txt"));
			for (MyStructure struct : MyArray) {
				struct.printToFile(out);
			}
		}catch(FileNotFoundException e) {
			System.err.println(e.getMessage());
		}
		
		/*сортировка по убыванию value*/
		for (int i = 0; i < MyArray.length; i++ ) {
			int j_max = i;
			for(int j=i+1; j<MyArray.length; j++) {
				if(MyArray[j_max].value<MyArray[j].value) {
					j_max=j;
				}
			}
			MyStructure temp = MyArray[i];
			MyArray[i] = MyArray[j_max];
			MyArray[j_max] = temp;
		}
		
		try {
			PrintStream out = new PrintStream(new File("E:\\EG\\Lab1\\src\\data2.txt"));
			for (MyStructure struct : MyArray) {
				struct.printToFile(out);
			}
		}catch(FileNotFoundException e) {
			System.err.println(e.getMessage());
		}
		
		/*сортировка по возрастанию name*/
		for (int i = 0; i < MyArray.length; i++ ) {
			int j_max = i;
			for(int j=i+1; j<MyArray.length; j++) {
				if(MyArray[j_max].name.compareTo(MyArray[j].name)<0) {
					j_max=j;
				}
			}
			MyStructure temp = MyArray[i];
			MyArray[i] = MyArray[j_max];
			MyArray[j_max] = temp;
		}
		
		try {
			PrintStream out = new PrintStream(new File("E:\\EG\\Lab1\\src\\data3.txt"));
			for (MyStructure struct : MyArray) {
				struct.printToFile(out);
			}
		}catch(FileNotFoundException e) {
			System.err.println(e.getMessage());
		}
		
	}
}
