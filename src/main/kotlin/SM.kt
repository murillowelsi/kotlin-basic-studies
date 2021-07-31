enum class SM(val brand: String, val appName: String) {
    UK("th", "tui-uk-th"),
    FC("fc","tui-uk-fc"),
    DE("mt", "tui-de-mt"),
    TC("tc","tui-de-tc"),
    FI("fi", "tui-no-fi"),
    NO("no","tui-no-no"),
    DK("dk", "tui-no-fk"),
    SV("sv","tui-no-sv"),
    NL("nl","tui-nl"),
    BE("ja","tui-be-ja"),
}

fun brandAppName(brand: String, appName: String) = "appName: $appName - brand: $brand"