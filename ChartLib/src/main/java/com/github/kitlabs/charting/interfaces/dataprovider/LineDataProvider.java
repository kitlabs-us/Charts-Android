package com.github.kitlabs.charting.interfaces.dataprovider;

import com.github.kitlabs.charting.components.YAxis;
import com.github.kitlabs.charting.data.LineData;

public interface LineDataProvider extends BarLineScatterCandleBubbleDataProvider {

    LineData getLineData();

    YAxis getAxis(YAxis.AxisDependency dependency);
}
