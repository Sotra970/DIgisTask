package sotra.io.digistask.DataModels

import com.google.gson.annotations.SerializedName

data class Legend(
        @SerializedName("RSRP")
        val rsrpv: List<LegendData>,
        @SerializedName("RSRQ")
        val rsrqv: List<LegendData>,
        @SerializedName("SINR")
        val sinrv: List<LegendData>
)