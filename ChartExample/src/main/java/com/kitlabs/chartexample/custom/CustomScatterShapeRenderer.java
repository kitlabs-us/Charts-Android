package com.kitlabs.chartexample.custom;

import android.graphics.Canvas;
import android.graphics.Paint;

import com.github.kitlabs.charting.interfaces.datasets.IScatterDataSet;
import com.github.kitlabs.charting.renderer.scatter.IShapeRenderer;
import com.github.kitlabs.charting.utils.ViewPortHandler;

/**
 * Custom shape renderer that draws a single line.
 * Created by philipp on 26/06/16.
 */
public class CustomScatterShapeRenderer implements IShapeRenderer
{

    @Override
    public void renderShape(Canvas c, IScatterDataSet dataSet, ViewPortHandler viewPortHandler,
                            float posX, float posY, Paint renderPaint) {

        final float shapeHalf = dataSet.getScatterShapeSize() / 2f;

        c.drawLine(
                posX - shapeHalf,
                posY - shapeHalf,
                posX + shapeHalf,
                posY + shapeHalf,
                renderPaint);
    }
}
