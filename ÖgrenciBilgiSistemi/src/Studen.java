
public class Studen {

	Course c1;
	Course c2;
	Course c3;
	Course s1;
	Course s2;
	Course s3;
	String name;
	String stdNo;
	String classes;
	double avarage;
	boolean isPass;
	double m,f,b;   //müzik, fizik ve biyoloji dersleri için ortalamalar bu değerlere atanacak

	public Studen(String name, String stdNo, String classes, Course c1, Course c2, Course c3, Course s1, Course s2,
			Course s3) {
		super();
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.name = name;
		this.stdNo = stdNo;
		this.classes = classes;
		this.avarage = 0;
		this.isPass = false;
		this.m = m;
		this.f = f;
		this.b = b;
	}

	void addBulkExample(int note1, int note2, int note3) {
		if (note1 >= 0 && note1 <= 100) {
			this.c1.note = note1;
		}

		if (note2 >= 0 && note2 <= 100) {
			this.c2.note = note2;
		}
		if (note3 >= 0 && note3 <= 100) {
			this.c3.note = note3;
		}

	}

	void sozlu(int sozlu1, int sozlu2, int sozlu3) {
		if (sozlu1 >= 0 && sozlu1 <= 100) {
			this.s1.sozlu = sozlu1;
		}

		if (sozlu2 >= 0 && sozlu2 <= 100) {
			this.s2.sozlu = sozlu2;
		}
		if (sozlu3 >= 0 && sozlu3 <= 100) {
			this.s3.sozlu = sozlu3;
		}

	}

	void isPass() {
		System.out.println("**************************");
		
		m = (this.c1.note * 0.80) + (this.s1.sozlu * 0.20);
		f = (this.c2.note * 0.80) + (this.s2.sozlu * 0.20);
		b = (this.c3.note * 0.80) + (this.s3.sozlu * 0.20);

		this.avarage = (m+f+b) / 3.0;
		
		if (this.avarage > 55) {
			System.out.println("Hababam sınıfı uyanıyor");
			this.isPass = true;
		} else {
			System.out.println("Hababam sınıfı sınıfta kaldı.");
			this.isPass = false;
		}
		printNote();

	}

	void printNote() {

		System.out.println(c1.name + " Notu : " + c1.note);
		System.out.println(c2.name + " Notu : " + c2.note);
		System.out.println(c3.name + " Notu : " + c3.note);
		System.out.println("Ortalama : " + this.avarage);
	}

}
