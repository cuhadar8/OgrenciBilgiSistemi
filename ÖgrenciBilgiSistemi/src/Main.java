
public class Main {

	public static void main(String[] args) {
		
		Teacher teacher = new Teacher("Erdem" ,"90050000", "MZK" );
		Teacher teacher2 = new Teacher("Graham Bell" , "1008002", "FZK");
		Teacher teacher3 = new Teacher("Külyutmaz", "0090055", "BIO");
		Course tarih = new Course( "tarih","101" , "MZK");
		tarih.addTeacher(teacher);
		
		
		Course fizik = new Course("fizik", "102", "FZK");
		fizik.addTeacher(teacher2);
		
		Course biyo = new Course("biyoloji", "103", "BIO");
		biyo.addTeacher(teacher3);
		
		Studen s1 = new Studen("ibrahim", "265","12.Sınıf",tarih,fizik,biyo,tarih,fizik,biyo);
		s1.addBulkExample(100, 100, 100);
		s1.sozlu(20, 40, 60);
		s1.isPass();
		
		
		
		Studen s2 = new Studen("Güdük Necmi", "988", "12.Sınıf",tarih,fizik,biyo,tarih,fizik,biyo);
		s2.addBulkExample(50, 40, 30);
		s1.sozlu(50, 60, 70);
		s2.isPass();

	}

}
