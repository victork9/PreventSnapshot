import br.com.preventsnapshoot.flagsecure.FlagSecurePackage;
import br.com.preventsnapshoot.flagsecure.FlagSecure;
import java.util.Arrays;
import java.util.List;


public class MainApplication extends MultiDexApplication implements ReactApplication, ShareApplication {
  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
       @Override
    protected List<ReactPackage> getPackages() {
      List<ReactPackage> packages = new PackageList(this).getPackages();
      packages.addAll(Arrays.<ReactPackage>asList(
        new FlagSecurePackage()
      
      ));
      return packages;
    }


}
}
