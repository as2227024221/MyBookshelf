package com.kunfei.bookshelf.presenter.contract;

import android.support.design.widget.Snackbar;

import com.kunfei.basemvplib.impl.IPresenter;
import com.kunfei.basemvplib.impl.IView;
import com.kunfei.bookshelf.bean.ReplaceRuleBean;

import java.util.List;

public interface ReplaceRuleContract {
    interface Presenter extends IPresenter {

        void saveData(List<ReplaceRuleBean> replaceRuleBeans);

        void delData(ReplaceRuleBean replaceRuleBean);

        void delData(List<ReplaceRuleBean> replaceRuleBeans);

        void importDataSLocal(String uri);

        void importDataS(String url);
    }

    interface View extends IView {

        void refresh();

        Snackbar getSnackBar(String msg, int length);

    }

}
