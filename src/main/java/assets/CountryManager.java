package assets;

public class CountryManager {
    private static final CountryManager instance = new CountryManager();

    public static CountryManager getInstance() {
        return instance;
    }

    public Object getId() {
        return null;
    }

    public int getMultiplier(UserManager.UserInfo userInfo) {
        return 0;
    }
}
