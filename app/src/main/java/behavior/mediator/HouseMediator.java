package behavior.mediator;

/**
 * Created by shixin-pc on 2018/6/9.
 * 具体中介类
 */

public class HouseMediator extends Mediator {
    private Landlord mLandlord;
    private Tenant mTenant;

    public void setmLandlord(Landlord mLandlord) {
        this.mLandlord = mLandlord;
    }

    public void setmTenant(Tenant mTenant) {
        this.mTenant = mTenant;
    }

    public Landlord getmLandlord() {
        return mLandlord;
    }

    public Tenant getmTenant() {
        return mTenant;
    }

    @Override
    void contact(People people, String msg) {
        if (people == mTenant) {
            mTenant.getMessage(msg);
        } else {
            mLandlord.getMessage(msg);
        }
    }
}
