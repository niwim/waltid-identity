import kotlinx.coroutines.test.runTest
import kotlin.test.Test

class OCISdkKeyTest {

    @Test
    fun test() = runTest {
//        val compartmentId = "ocid1.compartment.oc1..aaaaaaaawirugoz35riiybcxsvf7bmelqsxo3sajaav5w3i2vqowcwqrllxa"
//        val vaultId = "ocid1.vault.oc1.eu-frankfurt-1.entbf645aabf2.abtheljshkb6dsuldqf324kitneb63vkz3dfd74dtqvkd5j2l2cxwyvmefeq"
//
//
//        val config = OCIsdkMetadata(vaultId, compartmentId)
//
//        val testkey = OCIKey(
//            "ocid1.key.oc1.eu-frankfurt-1.entbf645aabf2.abtheljrk2redsqsmbln4e6z543bmv4emabdmtveh3owzglt6ovo6dpnd6fa",
//            config,
//            _keyType = KeyType.secp256r1
//        )
//
//        val plaintext = """{"abc": "xyz"}""".encodeToByteArray()
//
//        val signed: String = testkey.signJws(plaintext) // should already be IEEE P1363
//        val publicKey = testkey.getPublicKey() // probably a JWKKey in the background
//
//        val result = publicKey.verifyJws(signed)
//        println(result)
//
//        check(result.isSuccess)
//
//        val plaintext2 = """{"abc": "eyJhbGciOiJFUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6ImRpZDpqd2s6ZXlKcmRIa2lPaUpGUXlJc0ltTnlkaUk2SWxBdE1qVTJJaXdpYTJsa0lqb2lVMmt3TjJwSldIRk1jMDFMU0hrd2RtZDVkbEJpWTBsMlNWQjRaSEZNTjFGek5sTlVjWEo0TVZWRE9DSXNJbmdpT2lKeExVeGFSRXN0VkZwUlUxVmplbmxmTVVzMlZFSkdaVlp1TmpCeVRYWTBTMnBaZGxSbFVIa3lWRWR6SWl3aWVTSTZJbkZVWW1sVFVrVm1WMUphZEVGTFduTlhMV3N0TUVKSVNVbFpjRUZPTUdab2JtcGhjV1ZOU1ZVMVQxa2lmUSJ9.eyJpc3MiOiJkaWQ6andrOmV5SnJkSGtpT2lKRlF5SXNJbU55ZGlJNklsQXRNalUySWl3aWEybGtJam9pVTJrd04ycEpXSEZNYzAxTFNIa3dkbWQ1ZGxCaVkwbDJTVkI0WkhGTU4xRnpObE5VY1hKNE1WVkRPQ0lzSW5naU9pSnhMVXhhUkVzdFZGcFJVMVZqZW5sZk1VczJWRUpHWlZadU5qQnlUWFkwUzJwWmRsUmxVSGt5VkVkeklpd2llU0k2SW5GVVltbFRVa1ZtVjFKYWRFRkxXbk5YTFdzdE1FSklTVWxaY0VGT01HWm9ibXBoY1dWTlNWVTFUMWtpZlEiLCJzdWIiOiJkaWQ6andrOmV5SnJkSGtpT2lKRlF5SXNJbU55ZGlJNklsQXRNalUySWl3aWVDSTZJbmhSVTIxUVpHeHhhMmczT0c1c1NrODJNMGRNYjFZelZrdHBlR1U1VkhKSGJtbHpTekpSZERWWmRIY2lMQ0o1SWpvaWR6WjJPRGRVUkZoRGRWOUtRVm94ZDFoa1drVjFPREYyYTBFMGNtaG1OMGhGT0ZrNU5WZ3pORlZ6U1NKOSIsInZjIjp7IkBjb250ZXh0IjpbImh0dHBzOi8vd3d3LnczLm9yZy8yMDE4L2NyZWRlbnRpYWxzL3YxIiwiaHR0cHM6Ly9wdXJsLmltc2dsb2JhbC5vcmcvc3BlYy9vYi92M3AwL2NvbnRleHQuanNvbiJdLCJpZCI6InVybjp1dWlkOjNjOTViNTc1LTI4NTEtNGZmOS05M2UzLTUyNzk2YmU3MDA2ZiIsInR5cGUiOlsiVmVyaWZpYWJsZUNyZWRlbnRpYWwiLCJPcGVuQmFkZ2VDcmVkZW50aWFsIl0sIm5hbWUiOiJKRkYgeCB2Yy1lZHUgUGx1Z0Zlc3QgMyBJbnRlcm9wZXJhYmlsaXR5IiwiaXNzdWVyIjp7InR5cGUiOlsiUHJvZmlsZSJdLCJpZCI6ImRpZDpqd2s6ZXlKcmRIa2lPaUpGUXlJc0ltTnlkaUk2SWxBdE1qVTJJaXdpYTJsa0lqb2lVMmt3TjJwSldIRk1jMDFMU0hrd2RtZDVkbEJpWTBsMlNWQjRaSEZNTjFGek5sTlVjWEo0TVZWRE9DSXNJbmdpT2lKeExVeGFSRXN0VkZwUlUxVmplbmxmTVVzMlZFSkdaVlp1TmpCeVRYWTBTMnBaZGxSbFVIa3lWRWR6SWl3aWVTSTZJbkZVWW1sVFVrVm1WMUphZEVGTFduTlhMV3N0TUVKSVNVbFpjRUZPTUdab2JtcGhjV1ZOU1ZVMVQxa2lmUSIsIm5hbWUiOiJKb2JzIGZvciB0aGUgRnV0dXJlIChKRkYpIiwidXJsIjoiaHR0cHM6Ly93d3cuamZmLm9yZy8iLCJpbWFnZSI6Imh0dHBzOi8vdzNjLWNjZy5naXRodWIuaW8vdmMtZWQvcGx1Z2Zlc3QtMS0yMDIyL2ltYWdlcy9KRkZfTG9nb0xvY2t1cC5wbmcifSwiaXNzdWFuY2VEYXRlIjoiMjAyNC0wNC0yNFQxMjoxMjozOC45NjYyNzg0OTJaIiwiZXhwaXJhdGlvbkRhdGUiOiIyMDI1LTA0LTI0VDEyOjEyOjM4Ljk2NjQ3MDU5MVoiLCJjcmVkZW50aWFsU3ViamVjdCI6eyJpZCI6ImRpZDpqd2s6ZXlKcmRIa2lPaUpGUXlJc0ltTnlkaUk2SWxBdE1qVTJJaXdpZUNJNkluaFJVMjFRWkd4eGEyZzNPRzVzU2s4Mk0wZE1iMVl6Vmt0cGVHVTVWSEpIYm1selN6SlJkRFZaZEhjaUxDSjVJam9pZHpaMk9EZFVSRmhEZFY5S1FWb3hkMWhrV2tWMU9ERjJhMEUwY21obU4waEZPRms1TlZnek5GVnpTU0o5IiwidHlwZSI6WyJBY2hpZXZlbWVudFN1YmplY3QiXSwiYWNoaWV2ZW1lbnQiOnsiaWQiOiJ1cm46dXVpZDphYzI1NGJkNS04ZmFkLTRiYjEtOWQyOS1lZmQ5Mzg1MzY5MjYiLCJ0eXBlIjpbIkFjaGlldmVtZW50Il0sIm5hbWUiOiJUSGUgbmV3IEpGRiB4IHZjLWVkdSBQbHVnRmVzdCAzIEludGVyb3BlcmFiaWxpdHkiLCJkZXNjcmlwdGlvbiI6IlRoaXMgd2FsbGV0IHN1cHBvcnRzIHRoZSB1c2Ugb2YgVzNDIFZlcmlmaWFibGUgQ3JlZGVudGlhbHMgYW5kIGhhcyBkZW1vbnN0cmF0ZWQgaW50ZXJvcGVyYWJpbGl0eSBkdXJpbmcgdGhlIHByZXNlbnRhdGlvbiByZXF1ZXN0IHdvcmtmbG93IGR1cmluZyBKRkYgeCBWQy1FRFUgUGx1Z0Zlc3QgMy4iLCJjcml0ZXJpYSI6eyJ0eXBlIjoiQ3JpdGVyaWEiLCJuYXJyYXRpdmUiOiJXYWxsZXQgc29sdXRpb25zIHByb3ZpZGVycyBlYXJuZWQgdGhpcyBiYWRnZSBieSBkZW1vbnN0cmF0aW5nIGludGVyb3BlcmFiaWxpdHkgZHVyaW5nIHRoZSBwcmVzZW50YXRpb24gcmVxdWVzdCB3b3JrZmxvdy4gVGhpcyBpbmNsdWRlcyBzdWNjZXNzZnVsbHkgcmVjZWl2aW5nIGEgcHJlc2VudGF0aW9uIHJlcXVlc3QsIGFsbG93aW5nIHRoZSBob2xkZXIgdG8gc2VsZWN0IGF0IGxlYXN0IHR3byB0eXBlcyBvZiB2ZXJpZmlhYmxlIGNyZWRlbnRpYWxzIHRvIGNyZWF0ZSBhIHZlcmlmaWFibGUgcHJlc2VudGF0aW9uLCByZXR1cm5pbmcgdGhlIHByZXNlbnRhdGlvbiB0byB0aGUgcmVxdWVzdG9yLCBhbmQgcGFzc2luZyB2ZXJpZmljYXRpb24gb2YgdGhlIHByZXNlbnRhdGlvbiBhbmQgdGhlIGluY2x1ZGVkIGNyZWRlbnRpYWxzLiJ9LCJpbWFnZSI6eyJpZCI6Imh0dHBzOi8vdzNjLWNjZy5naXRodWIuaW8vdmMtZWQvcGx1Z2Zlc3QtMy0yMDIzL2ltYWdlcy9KRkYtVkMtRURVLVBMVUdGRVNUMy1iYWRnZS1pbWFnZS5wbmciLCJ0eXBlIjoiSW1hZ2UifX19fSwianRpIjoidXJuOnV1aWQ6M2M5NWI1NzUtMjg1MS00ZmY5LTkzZTMtNTI3OTZiZTcwMDZmIiwiZXhwIjoxNzQ1NDk2NzU4LCJpYXQiOjE3MTM5NjA3NTgsIm5iZiI6MTcxMzk2MDc1OH0.SE5LZFXMu928HMoRNnad1rN8qGeO16hqNXt7GDAHly0MmhYvHJFgUBfvHaKYwikwim9SBbOZ76EJHjLfHAe97g"}""".encodeToByteArray()
//
//        val signed2: String = testkey.signJws(plaintext2) // should already be IEEE P1363
//        val publicKey2 = testkey.getPublicKey() // probably a JWKKey in the background
//
//        val result2 = publicKey2.verifyJws(signed2)
//        println(result2)
//
//        check(result2.isSuccess)
    }

}
