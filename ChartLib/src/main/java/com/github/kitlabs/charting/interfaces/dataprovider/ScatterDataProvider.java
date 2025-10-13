package com.github.kitlabs.charting.interfaces.dataprovider;

import com.github.kitlabs.charting.data.ScatterData;

public interface ScatterDataProvider extends BarLineScatterCandleBubbleDataProvider {

    ScatterData getScatterData();
}
