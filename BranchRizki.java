public class Branch_Rizki_Rianto {
	public static void main (String[] args) {
		
		System.out.println("===== EKSPRESI =====");
		//INI ADALAH CONTOH EKSPRESI ARITMATIKA
		System.out.println("> Ekspresi Aritmatika");
		int angka1 = 20;
		int angka2 = 50;
		int angka3 = 2;	
		int angka4 = 4;
		int hasil = (angka2 * angka3 + angka1)/angka4;
		System.out.println("(" + angka2 + " x " + angka3 + " + " + angka1 + ")" + ":" + angka4 + " = " + hasil);
		
		//INI ADALAH CONTOH EKSPRESI RELASIONAL
		System.out.println("\n> Ekspresi Relasional");
		boolean UmurSaya18 = true;
		boolean UmurSaya20 = false;
		
		System.out.println("* Ekspresi Relasi --Disjungsi/atau (||)--");
		System.out.print("Umur saya 18 atau 20 : ");
		System.out.println(UmurSaya18 || UmurSaya20);
		System.out.print("Umur saya 18 atau 18 : ");
		System.out.println(UmurSaya18 || UmurSaya18);
		System.out.print("Umur saya 20 atau 20 : ");
		System.out.println(UmurSaya20 || UmurSaya20);
		
		System.out.println("\n* Ekspresi Relasi --Konjungsi/dan (&&)--");
		System.out.print("Umur saya 18 dan umur saya 20 : ");
		System.out.println(UmurSaya18 && UmurSaya20);
		System.out.print("Umur saya 18 dan umur saya 18 : ");
		System.out.println(UmurSaya18 && UmurSaya18);
		System.out.print("Umur saya 20 dan umur saya 20 : ");
		System.out.println(UmurSaya20 && UmurSaya20);
		System.out.print("\n");
		
		//INI ADALAH CONTOH EKSPRESI STRING
		System.out.println("> Ekspresi String");
		System.out.println("Nama saya adalah " + "M." + "Rizki " + "Rianto\n");
		
		
		System.out.println("===== OPERATOR =====");
		//INI ADALAH CONTOH OPERATOR ARITMATIKA
		System.out.println("> Operator Aritmatika");
		int nilai1 = 6;
		int nilai2 = 2;
		int nilai3 = 3;
		
		System.out.println("Value nilai1 = " + nilai1 + 
						 "\nValue nilai2 = " + nilai2 +
						 "\nnilai3mod = " + nilai3);
		System.out.println(nilai1 + "+" + nilai2 +" = "+ (nilai1 + nilai2)); //operator penjumlahan 	(+)
		System.out.println(nilai1 + "-" + nilai2 +" = "+ (nilai1 - nilai2)); //operator pengurangan 	(-)
		System.out.println(nilai1 + ":" + nilai2 +" = "+ (nilai1 / nilai2)); //operator pembagian   	(/)
		System.out.println(nilai1 + "x" + nilai2 +" = "+ (nilai1 * nilai2)); //operator perkalian   	(*)
		System.out.println(nilai1 + "%" + nilai3 +" = "+ (nilai1 % nilai3)); //operator modulus   		(%)
		
		
		System.out.println("\n> Operator Unary");
		//INI ADALAH CONTOH OPERATOR UNARY
		System.out.println("Value nilai1 = " + nilai1 + 
				 			"\nValue nilai2 = " + nilai2);
		
		System.out.println("-" + nilai1 + "+" + nilai3 + " = " +
						  (-nilai1 + nilai3));
		System.out.println(nilai3 + "-" + nilai2 + " = " +
						  (nilai3 - nilai2));
		
		System.out.println("\n*Increment Unary");
		nilai1 = ++nilai1;
		System.out.println("Increment nilai1 = " + nilai1);
		
		System.out.println("\n*Decrement Unary");
		nilai1 = --nilai1;
		System.out.println("Decrement nilai1 = " + nilai1);
		
		
		System.out.println("\n> Operator Assignment");
		int z = 4;
		System.out.println("Nilai z = " + z);
		
		z += 2;
		System.out.println("z += 2 sama dengan z = z + 2 --> " + z);
		
		z -= 2;
		System.out.println("z -= 2 sama dengan z = z - 2 --> " + z);
		
		z /= 2;
		System.out.println("z /= 2 sama dengan z = z / 2 --> " + z);
		
		z *= 2;
		System.out.println("z *= 2 sama dengan z = z * 2 --> " + z);
		
		z %= 2;
		System.out.println("z %= 2 sama dengan z = z % 2 --> " + z);
		
		
		System.out.println("\n> Operator Relasional");
		System.out.println("20 < 9 : " + (20 < 9));
		System.out.println("20 > 9 : " + (20 > 9));
		System.out.println("2 <= 3 : " + (2 <= 3));
		System.out.println("2 >= 3 : " + (2 >= 3));
		System.out.println("3 <= 3 : " + (3 >= 3));
		System.out.println("6 != 5 : " + (6 != 5));
		System.out.println("2 == 3 : " + (6 == 5));
		System.out.println("8 != 8 : " + (8 != 8));
		System.out.println("8 == 8 : " + (8 == 8));
		
		System.out.println("\n> Operator Logika");
		int x = 5;
		
		System.out.print("x > 0 && x < 10   : ");
		System.out.println(x > 0 && x < 10);
		
		System.out.print("x > 0 || x < 4    : ");
		System.out.println(x > 0 || x < 4);
		
		System.out.print("!(x > 1 && x < 10 : ");
		System.out.println(!(x > 1 && x < 10));
		
		System.out.print("!(x > 0 || x < 4) : ");
		System.out.println(!(x > 0 || x < 4 ));
		
		
		System.out.println("\n> Operator Ternary");
		int umur1 = 18 ;
		int umur2 = 10 ;
		String dummy_message;
		
		System.out.print(umur1 + " --{");
		dummy_message = (umur1 >= 18) ? "You're old enough to pass the test... " : "Sorry you're too young";
		System.out.println(dummy_message);
		
		System.out.print(umur2 + " --{");
		System.out.println((umur2 >= 18) ? "You're old enough to pass the test... " : "Sorry you're too young");
		
		System.out.println("\n------{THANK YOU !}------");
	}
}
