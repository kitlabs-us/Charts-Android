package com.github.kitlabs.charting.interfaces.dataprovider;

import com.github.kitlabs.charting.components.YAxis.AxisDependency;
import com.github.kitlabs.charting.data.BarLineScatterCandleBubbleData;
import com.github.kitlabs.charting.utils.Transformer;

public interface BarLineScatterCandleBubbleDataProvider extends ChartInterface {

    Transformer getTransformer(AxisDependency axis);
    boolean isInverted(AxisDependency axis);
    
    float getLowestVisibleX();
    float getHighestVisibleX();

    BarLineScatterCandleBubbleData getData();
}
