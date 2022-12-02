import java.util.ArrayList;

class Folder{
    private String name;
    private ArrayList<File> fileArray = new ArrayList<File>();

    public Folder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayContent(){
        System.out.println("Files in this folder:");
        for (File file : fileArray){
            System.out.println(file.getName());
        }
    }

    public void removeFile(String fileName){
        for (File file : fileArray){
            int index = 0;
            if (file.getName().equals(fileName)){
                fileArray.remove(index);
            }
            index ++;
        }
    }

    public void addFile(File fileName){
        fileArray.add(fileName);
    }

    public static void main(String[] args) {
        Folder folder = new Folder("Folder");
        File f1 = new File("file1");
        File f2 = new File("file2");

        folder.addFile(f1);
        folder.addFile(f2);
        
        folder.displayContent();
        folder.removeFile(f1.getName());
        folder.displayContent();

    }
}