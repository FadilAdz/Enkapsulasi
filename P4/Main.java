public class Main {
    public static void main(String[] args) {

        Person person = new Person("Anton", 'L', 32);

        System.out.println("Nama : " + person.getNama());
        System.out.println("Jenis Kelamin : " + person.getJenisKelamin());
        System.out.println("Umur : " + person.getUmur());

        person.setNama("Riko");
        person.setJenisKelamin('P');
        person.setUmur(21);

        System.out.println("Nama : " + person.getNama());
        System.out.println("Jenis Kelamin : " + person.getJenisKelamin());
        System.out.println("Umur : " + person.getUmur());
    }
}