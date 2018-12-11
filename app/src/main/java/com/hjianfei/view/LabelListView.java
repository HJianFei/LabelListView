package com.hjianfei.view;

import android.content.Context;
import android.util.AttributeSet;

import com.hjianfei.entity.GameLabel;
import com.hjianfei.view.base.BaseLabelListView;

public class LabelListView extends BaseLabelListView<GameLabel> {

    public LabelListView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public LabelListView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public LabelListView(Context context) {
        this(context, null);
    }

    @Override
    public String getLabelName(GameLabel object) {
        return object.name;
    }

    @Override
    public String getTextColor(GameLabel object) {
        return object.textColor;
    }

    @Override
    public String getBackgroundColor(GameLabel object) {
        return object.backgroudColor;
    }

    @Override
    public String getStrokeColor(GameLabel object) {
        return object.strokeColor;
    }

}
