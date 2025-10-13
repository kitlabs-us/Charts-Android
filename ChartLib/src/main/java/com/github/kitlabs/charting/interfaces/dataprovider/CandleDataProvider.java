package com.github.kitlabs.charting.interfaces.dataprovider;

import com.github.kitlabs.charting.data.CandleData;

public interface CandleDataProvider extends BarLineScatterCandleBubbleDataProvider {

    CandleData getCandleData();
}
