import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ans1




  {
    //creating an object of class Prob1
    static ans1 obj = new ans1();


    /** This Method checks whether file in the parameter is already present n if so it is not a txt document and then creates a text file n prints its details */
    public void CreateFile(String name) {
        System.out.println(name);
        File newfile = new File("c:\\java\\"+name);
        //checking if the file already exists with this name (EXISTS , isFile , isDirectory METHOD )
        boolean check = newfile.exists() && (!newfile.isDirectory()) && newfile.isFile();
        if(check==false) {
            try {
                newfile.createNewFile();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("THE FILE "+name+".txt AS BEEN CREATED \n");
            obj.DetailsOfFile(newfile ,name);
        }
        else {
            System.out.println("The abc.txt file already exists in \\\"c:\\\\\\\\java\\\\\\\\");
        }
    }


    public void DetailsOfFile(File newfile ,String name) {
        System.out.println("The name of the file is          :"+newfile.getName());
        System.out.println("The relative path of the file is :"+newfile.getPath());
        System.out.println("The absolute path of the file is :"+newfile.getAbsolutePath());
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The text file will be created in the path of \"c:\\\\java\\\\ \nPlease enter the text file name without extension");
        //taking input of filename
        while(true) {
            String fname= sc.nextLine();
            if(fname.contains(".")) {
                System.out.println("Please enter the name without extension");
            }
            else {
                obj.CreateFile(fname);
                break;
            }
        }
    }
}
