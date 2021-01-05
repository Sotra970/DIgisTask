package sotra.io.digistask.util;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class DynamicLineChartManager {

    private final LineChart lineChart;
    private final YAxis leftAxis;
    private final YAxis rightAxis;
    private final XAxis xAxis;
    private final List<ILineDataSet> lineDataSets = new ArrayList<>();
    private final SimpleDateFormat df = new SimpleDateFormat("mm:ss");//Set the date format
    private final List<String> timeList = new ArrayList<>(); //Store the time of the x axis
    private LineData lineData;
    private LineDataSet lineDataSet;


    //Multiple curves
    public DynamicLineChartManager(LineChart mLineChart, List<String> names, List<Integer> colors) {
        this.lineChart = mLineChart;
        lineChart.setDragXEnabled(false);
        lineChart.setDragYEnabled(false);
        lineChart.setPinchZoom(false);
        lineChart.setTouchEnabled(false);
        leftAxis = lineChart.getAxisLeft();
        rightAxis = lineChart.getAxisRight();
        rightAxis.setDrawLabels(false);
        xAxis = lineChart.getXAxis();
        initLineChart();
        initLineDataSet(names, colors);
        setDescription("");
    }

    /**
     * Initialize LineChar
     */
    private void initLineChart() {

        lineChart.setDrawGridBackground(false);
        //Show border
        lineChart.setDrawBorders(true);
        //Polyline legend label setting
        Legend legend = lineChart.getLegend();
        legend.setForm(Legend.LegendForm.LINE);
        legend.setTextSize(11f);
        //Display position
        legend.setVerticalAlignment(Legend.LegendVerticalAlignment.BOTTOM);
        legend.setHorizontalAlignment(Legend.LegendHorizontalAlignment.LEFT);
        legend.setOrientation(Legend.LegendOrientation.HORIZONTAL);
        legend.setDrawInside(false);

        //The X axis sets the display position at the bottom
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setGranularity(1f);
//        xAxis.setLabelCount(10);

        xAxis.setValueFormatter(new ValueFormatter() {
            @Override
            public String getFormattedValue(float value) {
                return timeList.get((int) value % timeList.size());
            }
        });

        //Ensure that the Y axis starts from 0, otherwise it will move up a bit
        leftAxis.setAxisMinimum(0f);
//        rightAxis.setAxisMinimum(0f);
    }


    /**
     * Initialize polyline (multiple lines)
     *
     * @param names
     * @param colors
     */
    private void initLineDataSet(List<String> names, List<Integer> colors) {

        for (int i = 0; i < names.size(); i++) {
            lineDataSet = new LineDataSet(null, names.get(i));
            lineDataSet.setColor(colors.get(i));
            lineDataSet.setLineWidth(1.5f);
            lineDataSet.setCircleRadius(3f);
            lineDataSet.setColor(colors.get(i));
            lineDataSet.setDrawFilled(true);
            lineDataSet.setCircleColor(colors.get(i));
            lineDataSet.setHighLightColor(colors.get(i));
            lineDataSet.setMode(LineDataSet.Mode.CUBIC_BEZIER);
            lineDataSet.setAxisDependency(YAxis.AxisDependency.LEFT);
            lineDataSet.setValueTextSize(10f);
            lineDataSets.add(lineDataSet);
        }
        //Add an empty LineData
        lineData = new LineData();
        lineChart.setData(lineData);
        lineChart.invalidate();
    }

    /**
     * Add data dynamically (a line chart)
     *
     * @param number
     */
    public void addEntry(Float number) {
        //The lineDataSet is added at the beginning (a lineDataSet represents a line)
        if (lineDataSet.getEntryCount() == 0) {
            lineData.addDataSet(lineDataSet);
        }
        lineChart.setData(lineData);
        //Avoid excessive collection of data and clear it in time
        if (timeList.size() > 11) {
            timeList.clear();
        }

        timeList.add(df.format(System.currentTimeMillis()));

        Entry entry = new Entry(lineDataSet.getEntryCount(), number);
        lineData.addEntry(entry, 0);
        //Notification data has changed
        lineData.notifyDataChanged();
        lineChart.notifyDataSetChanged();
        //Set the maximum number displayed in the graph
        lineChart.setVisibleXRangeMaximum(6);
        //Move to a certain position
        lineChart.post(new Runnable() {
            @Override
            public void run() {
                lineChart.moveViewToAnimated(entry.getX(), entry.getY(), YAxis.AxisDependency.RIGHT, 1500);
            }
        });
    }

    /**
     * Add data dynamically (multiple line charts)
     *
     * @param numbers
     */
    public void addEntry(List<Float> numbers) {

        if (lineDataSets.get(0).getEntryCount() == 0) {
            lineData = new LineData(lineDataSets);
            lineChart.setData(lineData);
        }
        if (timeList.size() > 11) {
            timeList.clear();
        }
        timeList.add(df.format(System.currentTimeMillis()));
        for (int i = 0; i < numbers.size(); i++) {
            Entry entry = new Entry(lineDataSet.getEntryCount(), numbers.get(i));
            lineData.addEntry(entry, i);
            lineData.notifyDataChanged();
            lineChart.notifyDataSetChanged();
            lineChart.setVisibleXRangeMaximum(6);
            lineChart.post(new Runnable() {
                @Override
                public void run() {
                    lineChart.moveViewToAnimated(entry.getX(), entry.getY(), YAxis.AxisDependency.RIGHT, 1500);
                }
            });
        }
    }

    /**
     * Set Y axis value
     *
     * @param max
     * @param min
     * @param labelCount
     */
    public void setYAxis(float max, float min, int labelCount) {
        if (max < min) {
            return;
        }
        leftAxis.setAxisMaximum(max);
        leftAxis.setAxisMinimum(min);
        leftAxis.setLabelCount(labelCount, true);
//        rightAxis.setAxisMaximum(max);
//        rightAxis.setAxisMinimum(min);
//        rightAxis.setLabelCount(labelCount, false);
        lineChart.invalidate();
    }


    public void setDescription(String str) {
        Description description = new Description();
        description.setText(str);
        lineChart.setDescription(description);
        lineChart.invalidate();
    }
}