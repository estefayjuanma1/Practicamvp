
import com.google.gson.annotations.SerializedName
import java.io.Serializable
data class cupones(
    @SerializedName("offers")
    val offers: List<Offer>,
    @SerializedName("result")
    val result: Boolean
): Serializable