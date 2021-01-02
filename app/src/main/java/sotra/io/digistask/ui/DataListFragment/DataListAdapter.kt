package sotra.io.digistask.ui.DataListFragment

import android.annotation.SuppressLint
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import sotra.i.chachingdemo.Constants
import sotra.io.digistask.DataModels.DataModel
import sotra.io.digistask.DataModels.Legend
import sotra.io.digistask.DataModels.LegendData
import sotra.io.digistask.R
import java.text.SimpleDateFormat

class DataListAdapter :
        RecyclerView.Adapter<DataListAdapter.ViewHolder>() {
    private val dataSet: MutableList<DataModel> = mutableListOf()

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val RSRP: TextView = view.findViewById(R.id.RSRP)
        val RSRQ: TextView = view.findViewById(R.id.RSRQ)
        val SINR: TextView = view.findViewById(R.id.SINR)
        val time: TextView = view.findViewById(R.id.time_text)
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.list_item, viewGroup, false)

        return ViewHolder(view)
    }

    @SuppressLint("SimpleDateFormat")
    private val df = SimpleDateFormat("mm:ss.SSS") //Set the date format

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        viewHolder.RSRQ.text = dataSet[position].RSRQ.toString()
        viewHolder.RSRP.text = dataSet[position].RSRP.toString()
        viewHolder.SINR.text = dataSet[position].SINR.toString()
        viewHolder.time.text = df.format(System.currentTimeMillis())
        viewHolder.RSRQ.setTextColor(Color.parseColor(getColor(dataSet[position].RSRQ, "RSRQ")))
        viewHolder.RSRP.setTextColor(Color.parseColor(getColor(dataSet[position].RSRP, "RSRP")))
        viewHolder.SINR.setTextColor(Color.parseColor(getColor(dataSet[position].SINR, "SINR")))

    }

    private fun getColor(v: Float, type: String): String {
        val legend: Legend = Gson().fromJson(Constants.LEGEND, Legend::class.java)

        lateinit var list: List<LegendData>
        when {
            type.equals("RSRQ") -> {
                list = legend.rsrqv
            }
            type.equals("RSRP") -> {
                list = legend.rsrpv
            }
            type.equals("SINR") -> {
                list = legend.sinrv
            }
        }
        for (item in list) {
            val from: Float = if (item.From == "Min") -1 * Float.MAX_VALUE else if (item.From == "Max") Float.MAX_VALUE else item.From.toFloat()
            val tov: Float = if (item.To == "Min") -1 * Float.MAX_VALUE else if (item.To == "Max") Float.MAX_VALUE else item.To.toFloat()
            if (from <= v && v <= tov) {
                return item.Color
            }
        }
        return "#212121"
    }


    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataSet.size

    internal fun setData(item: DataModel) {
        this.dataSet.add(0, item)
        notifyItemInserted(0)
        recyclerView.scrollToPosition(0)
    }

    lateinit var recyclerView: RecyclerView
    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        super.onAttachedToRecyclerView(recyclerView)
        this.recyclerView = recyclerView
    }
}
