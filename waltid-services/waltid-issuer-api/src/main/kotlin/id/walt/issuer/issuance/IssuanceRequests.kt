package id.walt.issuer.issuance

import id.walt.credentials.vc.vcs.W3CVC
import id.walt.sdjwt.SDMap
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject

@Serializable
data class IssuanceRequest(
    val issuerKey: JsonObject,
    val issuerDid: String,

    val credentialConfigurationId: String,
    val credentialData: W3CVC?,
    val mdocData: Map<String, JsonObject>?,
    val mapping: JsonObject? = null,
    val selectiveDisclosure: SDMap? = null,

)

@Serializable
data class IssuerOnboardingResponse(
    val issuerKey: JsonElement, val issuerDid: String,
)
