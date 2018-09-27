import java.io.File

val dir = if (args.isNotEmpty()) args[0] else "/"
val folders = File(dir).listFiles { file -> file.isDirectory() }
folders?.forEach { folder -> println(folder) }