import java.util.Scanner;
public class FileNamesExtensions
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String drive, path, fileName, extension;
        System.out.print("Enter the Drive Letter: ");
        drive = in.next();
        System.out.print("Enter the Path: ");
        path = in.next();
        System.out.print("Enter the File Name: ");
        fileName = in.next();
        System.out.print("Enter the Extension: ");
        extension = in.next();
        in.close();
        System.out.println(drive + ":\\\\" + path + "\\" + fileName + "\\" + extension + ".");

    }
}