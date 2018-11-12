import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author 5910545647 Kwankaew Uttama and 5910546686 Pimwalun Witchawanitchanun
 *
 */

public class readFile{

    private int nc = 0 ;
    private int na = 0 ;
    private int ca = 0 ;
    private int ce = 0 ;

    public readFile()
    {

    }

    public  void readFile1(String direc,String name)
    {

        String jdkReleaseFile = direc + "/" + name;

        readTextFile(jdkReleaseFile);

    }

    public  void readTextFile(String fileToRead)
    {
        String eachLine = "";

        try
        {
            BufferedReader buffReader = new BufferedReader(new FileReader(fileToRead));

            while ((eachLine = buffReader.readLine()) != null)
            {

                if( !eachLine.contains(" * ")){

                    if( eachLine.contains(" class ")){
//                        System.out.println(eachLine);
                        nc++;
                    }
                    if(eachLine.contains(" abstract ")){
//                        System.out.println(eachLine);
                        na++;
                    }
                    if(eachLine.contains("import ")){
//                        System.out.println(eachLine);
                        ce++;
                    }
                    if(eachLine.contains(" extends ") || eachLine.contains(" implements ") ){
//                        System.out.println(eachLine);
                        ca++;
                    }
                }
            }

            //Close BufferedReader object
            buffReader.close();
        }
        catch(Exception ex)
        {
            //System.out.println("Exception: "+ex.toString());
        }
    }

    public int getNc(){
        return nc;
    }
    public int getNa(){
        return na;
    }
    public int getCa(){
        return ca;
    }
    public int getCe(){
        return ce;
    }

}