package com.yash.streamin

import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.TvType

class StreamInProvider : MainAPI() {
    override var mainUrl = "https://streamed.su"
    override var name = "StreamIn"
    override val supportedTypes = setOf(TvType.Live)
}
