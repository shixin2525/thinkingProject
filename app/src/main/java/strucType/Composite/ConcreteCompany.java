package strucType.Composite;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shixin-pc on 2018/4/21.
 * 具体的公司类
 */

public class ConcreteCompany extends Company {
    private List<Company> mCompany = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {
        mCompany.add(c);
    }

    @Override
    public void remote(Company c) {
        mCompany.remove(c);
    }

    @Override
    public void show() {
        for (int i = 0; i < mCompany.size(); i++) {
            mCompany.get(i).show();
        }
    }

    @Override
    public  void responsibility() {
        for (int i = 0; i < mCompany.size(); i++) {
            mCompany.get(i).responsibility();
        }

    }
}
