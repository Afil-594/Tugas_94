public class LCD {
    //isi bagian ini
    private String status;
    private String cable;
    private int volume;
    private int brightness;

    LCD(){
    this.status = "mati";
    this.volume = 0;
    this.brightness = 0;
    this.cable = "Kabel tidak terhubung";
    }
    
    //buat method yang ada pada soal 
    public String turnOff(){
    return this.status = "mati";
    }

    public String turnOn(){
    return this.status = "Menyala";
    }

    public String Freeze(){
    return this.status = "Freeze";
    }

    public int volumeUp(){
    return this.volume++;
    }

    public int volumeDown(){
    return this.volume--;
    }

    public void setVolume(int volume){
    this.volume = volume;
    }

    public int brightnessUp(){
    return  this.brightness++;
    }
    
    public int brightnessDown(){
    return this.brightness--;
    }
    
    public void setBrightness(int brightness){
    this.brightness= brightness;
    }

    public void setCable(int option) {
    //lengkapi method ini dengan mennggunakan array
    String[] jenisKabel  = {"VGA", "VDI", "HDMI", "DisplayPort"};
        if (option >= 0 && option < jenisKabel.length) {
            this.cable = jenisKabel[option];
        }
    }
    
    public void displayMessage() {
    //lengkapi method ini
    System.out.println("LCD Status\t: " + this.status);
    System.out.println("Volume\t\t: " + this.volume);
    System.out.println("Brightness\t: " + this.brightness);
    System.out.println("Cable\t\t: " + this.cable);
    }
        
     
}