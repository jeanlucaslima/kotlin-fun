fun main() {
    val text = "I want to go to San Francisco and stay at an airbnb."
    val replacements = mapOf(
        "san francisco" to "city",
        "airbnb" to "company",
        "Brazil" to "country"
    )

    val result = tagEntities(text, replacements)
    println(result)
}

fun tagEntities(text: String, replacements: Map<String, String>): String {
    val pattern = replacements.keys.joinToString("|") { Regex.escape(it) }
    val regex = Regex(pattern, RegexOption.IGNORE_CASE)

    return regex.replace(text) { match ->
        val original = match.value
        val tag = replacements.entries.find {
            it.key.equals(original, ignoreCase = true)
        }?.value ?: return@replace original

        "[$tag]($original)"
    }
}
