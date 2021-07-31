fun getMneumonic(cor: Cor): String =
    when(cor) {
        Cor.VERMELHO -> "Ver"
        Cor.AMARELO -> "Alguém"
        Cor.VERDE -> "Viver"
        Cor.AZUL -> "Além é"
        Cor.LARANJA -> "Legal"
    }

fun getTemperature(cor: Cor): String {
    return when(cor) {
        Cor.VERMELHO, Cor.LARANJA, Cor.AMARELO -> "Hot"
        Cor.VERDE -> "more or less"
        Cor.AZUL -> "Cold"
    }
}

fun getSourceMarket(sm: SM): String =
    when(sm) {
        SM.DE -> "Germany DE-MT - ${brandAppName(sm.appName, sm.brand)}"
        SM.TC -> "Germany DE-TC - ${brandAppName(sm.appName, sm.brand)}"
        SM.DK -> "Denmark - appName: ${brandAppName(sm.appName, sm.brand)}"
        SM.SV -> "Sweden - appName: ${brandAppName(sm.appName, sm.brand)}"
        SM.NO -> "Norway - appName: ${brandAppName(sm.appName, sm.brand)}"
        SM.FI -> "Finland - appName: ${brandAppName(sm.appName, sm.brand)}"
        SM.NL -> "Netherlands - appName: ${brandAppName(sm.appName, sm.brand)}"
        SM.UK -> "United Kingdom UK-TH - ${brandAppName(sm.appName, sm.brand)}"
        SM.FC -> "United Kingdom UK-FC - ${brandAppName(sm.appName, sm.brand)}"
        SM.BE -> "Belgium - appName: ${brandAppName(sm.appName, sm.brand)}"
    }

fun main() {
    val sourceMarket = getSourceMarket(SM.BE)
    println(sourceMarket)
}