package com.example.expensetrackerapp.ui.util

data class TabsItem(
    val title:String
)

val TabsList = listOf<TabsItem>(
    TabsItem("Hôm nay"),
    TabsItem("Tháng này"),
    TabsItem("Năm nay")
)

val TabsMap = mapOf<Int,String>(
    0 to  "hôm nay",
    1 to "tháng này",
    2 to "năm nay"
)

val TabSummaryList = listOf<TabsItem>(
    TabsItem("Tháng"),
    TabsItem("Năm")
)