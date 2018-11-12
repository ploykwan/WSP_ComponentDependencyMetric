/**
 *
 * @author 5910545647 Kwankaew Uttama and 5910546686 Pimwalun Witchawanitchanun
 *
 */
public class PackageInfo {

    String packageName;
    double ca;
    double ce; //number of import

    double na; //number of abstact class in pagkage
    double nc; //number of class in pagkage

    public PackageInfo(double na, double nc,double ca ,double ce){
        this.ce = ce;
        this.ca = ca;
        this.na = na;
        this.nc = nc;
    }

    public double getInstability(){
        return ce/(ca+ce);
    }

    public double getAbstractness(){
        return na/nc;
    }

    public double getDistance(){
        return Math.abs(getAbstractness()-getInstability());
    }


}
