package com.lightricity.station.bluetooth

interface IRuuviGattListener {
    fun connected(state: Boolean)
    fun deviceInfo(model: String, fw: String, canReadLogs: Boolean)
    fun dataReady(data: List<LogReading>)
    fun heartbeat(raw: String)
    fun syncProgress(syncedPoints: Int)
}
