package beyond.sessionThirteen

import java.io.IOException
import kotlin.random.Random

object FakeApi {

    val operatingSystemsList = mutableListOf(
        OperatingSystem(
            "Android",
            "google",
            OperatingSystemCategory.Mobile
        ),
        OperatingSystem(
            "iOS",
            "Apple",
            OperatingSystemCategory.Mobile
        ),
        OperatingSystem(
            "Linux",
            "Linux",
            OperatingSystemCategory.Desktop
        ),
        OperatingSystem(
            "Mac",
            "Apple",
            OperatingSystemCategory.Desktop
        ),
        OperatingSystem(
            "Windows",
            "Microsoft",
            OperatingSystemCategory.Desktop
        ),
    )

    fun getOperatingSystemList(): MutableList<OperatingSystem> {

        if ((1..100).random() <= 20) {
            throw IOException("Failed to fetch weather data")
        }

        return operatingSystemsList

    }

}