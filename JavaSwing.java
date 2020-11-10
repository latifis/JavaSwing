import javax.swing.*;
import java.awt.event.KeyEvent;

class ObjekGUI {
   public static void main(String[] args) {
	GUI g = new GUI();
   }
}

class GUI extends JFrame {
    
   final JTextField fnama = new JTextField(10);
   final JTextField falamat = new JTextField(20);
   
   final JTextField fperusahaan = new JTextField(15);
   final JTextField flembar = new JTextField(10);
   final JTextField fcatatan = new JTextField(30);

   
   
   //ISI DATA
   
   JLabel ldata = new JLabel(" A. Isi Data Diri ");
   
   JLabel lnama = new JLabel(" Nama Lengkap ");
   JLabel ljeniskelamin = new JLabel(" Jenis Kelamin ");

   JRadioButton rbPria = new JRadioButton(" Laki-Laki ");
   JRadioButton rbWanita = new JRadioButton("perempuan ");

   JLabel lagama = new JLabel(" Agama ");
   String[] namaAgama =
            {"Islam","Kristen","Katolik","Hindu","Budha","Konghuchu"};
   JComboBox cmbAgama = new JComboBox(namaAgama);

   JLabel lalamat = new JLabel(" Alamat ");
   

   //ISI SAHAM
   
   JLabel lsaham = new JLabel(" B. Beli Saham ");
   JLabel lperusahaan = new JLabel(" Nama Perusahaan ");
   JLabel llembar = new JLabel(" Banyak Lembar ");
   JLabel ltanggal = new JLabel(" Tanggal Pembelian ");
   String[] hari =
            {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
   JComboBox cmbHari = new JComboBox(hari);
   String[] bulan =
            {"Januari","Februari","Maret","April","Mei","Juni","Juli","Agustus","September","Oktober","Novenber","Desember"};
   JComboBox cmbBulan = new JComboBox(bulan);
   String[] tahun =
            {"2018","2019","2020","2021","2022","2023","2024","2025"};
   JComboBox cmbTahun = new JComboBox(tahun);
   JLabel lcatatan = new JLabel(" Catatan ");
   
   
   //Akhir
   
   JLabel lakhir = new JLabel(" C. Pengesahan ");
   JRadioButton rbakhir = new JRadioButton(" Dengan ini saya menyetujui tentang pembelian saham dan saya sudah membaca dan mengerti hal-hal yang ");
   JLabel lakhirTambah = new JLabel(" boleh saya lakukan maupun tidak boleh saya lakukan ");
   
   JButton btnSave = new JButton("Submit");

   public GUI() {
	setTitle("  MIFX Corp   ");
	setDefaultCloseOperation(3);
	setSize(720,350);
//        setsize(kanankiri, atasbawah)

	ButtonGroup group = new ButtonGroup();
	group.add(rbPria);
	group.add(rbWanita);

	setLayout(null);
        
        add(ldata);
        
	add(lnama);
	add(fnama);
	add(ljeniskelamin);
	add(rbPria);
	add(rbWanita);
	add(lagama);
	add(cmbAgama);
        add(lalamat);
        add(falamat);
        
        add(lsaham);
        add(lperusahaan);
        add(fperusahaan);
        add(llembar);
        add(flembar);
        add(ltanggal);
        add(cmbHari);
        add(cmbBulan);
        add(cmbTahun);
        add(lcatatan);
        add(fcatatan);
        
        add(lakhir);
        add(rbakhir);
        add(lakhirTambah);
        
	add(btnSave);

	// setBounds(m,n,o,p)
	// m = posisi x; n = posisi n
	// o = panjang komponen; p = tinggi komponen
        
        
	//ISI DATA
        ldata.setBounds(10,10,120,20);
        
        lnama.setBounds(25,35,120,20);
	fnama.setBounds(145,35,178,20);
	ljeniskelamin.setBounds(25,60,120,20);
	rbPria.setBounds(145,60,100,20);
	rbWanita.setBounds(235,60,100,20);
	lagama.setBounds(25,85,140,20);
	cmbAgama.setBounds(145,85,150,20);
        lalamat.setBounds(25,110,120,20);
        falamat.setBounds(145,110,178,70);
        

        //ISI SAHAM
        lsaham.setBounds(365,10,150,20);
        lperusahaan.setBounds(380,35,150,20);
        fperusahaan.setBounds(500,35,182,20);
        llembar.setBounds(380,60,150,20);
        flembar.setBounds(500,60,25,20);
        ltanggal.setBounds(380,85,150,20);
        cmbHari.setBounds(500,85,40,20);
        cmbBulan.setBounds(550,85,70,20);
        cmbTahun.setBounds(630,85,50,20);
        lcatatan.setBounds(380,110,150,20);
        fcatatan.setBounds(500,110,182,70);
        
        //Akhir
        lakhir.setBounds(10,190,150,20);
        rbakhir.setBounds(25,220,720,20);
        lakhirTambah.setBounds(46,240,720,20);
        
	btnSave.setBounds(550,270,120,20);
        
//        aku(darikiri(x),dariatas(y),width,high)
        
	setVisible(true);
   }
}
