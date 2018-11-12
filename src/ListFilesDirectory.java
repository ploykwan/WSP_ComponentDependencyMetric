import java.io.File;

/**
 *
 * @author 5910545647 Kwankaew Uttama and 5910546686 Pimwalun Witchawanitchanun
 *
 */

public class ListFilesDirectory
{

    public static void main(String[] args)
    {

        File jcdFile = new File("/Users/kwankaew/Downloads/apache-maven-3.5.4/maven-core/src/main/java/org/apache/maven/artifact/resolver/filter");

        String[] jcdFiles = jcdFile.list();
        readFile read = new readFile();

        System.out.println("Files Found: "+jcdFiles.length);

        System.out.println("");

        for(String myFile : jcdFiles)
        {

            read.readFile1(jcdFile.toString(),myFile);

        }


        PackageInfo pack = new PackageInfo(read.getNa(),read.getNc(),read.getCa(),read.getCe());

        System.out.println("nc: "+read.getNc());
        System.out.println("na: "+read.getNa());
        System.out.println("Abstractness: "+pack.getAbstractness());
        System.out.println("ca: "+read.getCa());
        System.out.println("ce: "+read.getCe());
        System.out.println("Instability: "+pack.getInstability());
        System.out.println("Distance: "+pack.getDistance());


//        System.out.println("File: "+jcdFiles.length);

    }

}