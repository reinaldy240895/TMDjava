/*----------------------------------------------------------------------------------
Filename			: Main.java
Programer			: Reinaldy Rahmadian
Date    			: 2016/05/29
Email				: Reinaldy.Rahmadian@gmail.com
Deskripsi			: program utama
----------------------------------------------------------------------------------*/

/*import library*/
import javafx.application.Application;
import javafx.stage.Stage;
import view.*;

/*Saya Reinaldy Rahmadian tidak melakukan kecurangan seperti yang telah dispesifikasikan pada mata kuliah Pemrograman Berorientasi Objek dalam mengerjakan Tugas Masa Depan PBO jika saya melakukan kecurangan maka Allah/Tuhan adalah saksi saya, dan saya, bersedia menerima hukumanNya. Aamiin.*/

public class Main extends Application{
	public static void main (String[] args){
		launch(args);
	}

	@Override
	public void start(Stage stage){
		VUser akun = new VUser(); //instansiasi untuk tampilan awal adalah VUser
		akun.tampil(stage); //tampilkan tampilan awal
	}
}
