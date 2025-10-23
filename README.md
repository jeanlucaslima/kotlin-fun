# Kotlin Tag Demo

A simple Kotlin script that finds specific words or phrases in a text and replaces them with Markdown-style tags, while keeping the original capitalization.

Example:

```

Input:
I want to go to San Francisco and stay at an airbnb.

Output:
I want to go to [city](San Francisco) and stay at an [company](airbnb).

````

---

## 🧩 How it works

The `tagEntities()` function searches for each key in a `Map<String, String>` (case-insensitive) and replaces it with a formatted tag:
```kotlin
fun tagEntities(text: String, replacements: Map<String, String>): String
````

---

## ⚙️ Setup

This project uses [mise](https://mise.jdx.dev) to manage Kotlin versions.

### 1. Clone the repository

```bash
git clone https://github.com/yourusername/kotlin-tag-demo.git
cd kotlin-tag-demo
```

### 2. Activate Kotlin via mise

```bash
mise install
mise exec -- kotlin -version
```

### 3. Run the program

```bash
kotlinc src/Main.kt -include-runtime -d tagdemo.jar
java -jar tagdemo.jar
```

or run directly:

```bash
kotlinc src/Main.kt -d out && kotlin -classpath out MainKt
```

---

## 🧠 Example usage

You can modify the map of replacements inside `Main.kt`:

```kotlin
val replacements = mapOf(
    "san francisco" to "city",
    "airbnb" to "company",
    "brazil" to "country"
)
```

---

## 📄 License

MIT

```
