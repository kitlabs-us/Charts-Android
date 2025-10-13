package com.github.kitlabs.charting.interfaces.dataprovider;

import com.github.kitlabs.charting.data.BubbleData;

public interface BubbleDataProvider extends BarLineScatterCandleBubbleDataProvider {

    BubbleData getBubbleData();
}
