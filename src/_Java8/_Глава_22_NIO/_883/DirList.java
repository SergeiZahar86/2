package _Java8._Глава_22_NIO._883;
// Display a directory. Requires JDK 7 or later.
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
class DirList {
    public static void main (String args[]) {
        String dirname = "C://Users/serge/" +
                "IdeaProjects/На ноуте учёба";
        // Obtain and manage a directory stream within an ARM Block
        // .получить и обработать поток ввода каталога
        // в блоке оператора try
        try (DirectoryStream <Path> dirstrm =
                     Files.newDirectoryStream(Paths.
                             get(dirname))) {
            System.out.println("Directory of " + dirname);
            // Because DirectoryStream implements Iterable, we
            // can use a "foreach" loop to display the directory.
            for (Path entry : dirstrm) {
                BasicFileAttributes attribs =
                        Files.readAttributes(entry,
                                BasicFileAttributes.class);
                if (attribs.isDirectory())
                    System.out.print("<DIR> ");
                else
                    System.out.print("      ");
                System.out.println(entry.getName(1));
            }
        } catch (InvalidPathException e) {
            System.out.println("Path Error " + e);
        } catch (NotDirectoryException e) {
            System.out.println(dirname + " is not a directory.");
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
