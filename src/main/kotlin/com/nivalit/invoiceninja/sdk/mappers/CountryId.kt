package com.nivalit.invoiceninja.sdk.mappers;

import com.nivalit.invoiceninja.infrastructure.Serializer
import com.squareup.moshi.Json
import com.squareup.moshi.Types
import java.io.File
import java.lang.reflect.Type
import java.math.BigDecimal

class CountryData(
    @Json(name = "id") val id: BigDecimal,
    @Json(name = "name") val name: String,
    @Json(name = "iso_3166_2") val iso2: String,
    @Json(name = "iso_3166_3") val iso3: String
) {
    companion object {
        private val countryMapping =
            Companion::class.java.getResourceAsStream("/country-mapping.json").use { inputStream ->
                inputStream?.reader().use { reader ->
                    reader?.readText() ?: ""
                }
            }
        private val type: Type = Types.newParameterizedType(
            List::class.java,
            CountryData::class.java
        )
        private val adapter = Serializer.moshi.adapter<List<CountryData>>(type)
        val mapping =
            adapter.fromJson(countryMapping) ?: throw RuntimeException("Something went wrong while mapping countries")

        fun fromISO2Code(code: String) = mapping.find { it.iso2.uppercase() == code.uppercase() }
        fun fromISO3Code(code: String) = mapping.find { it.iso3.uppercase() == code.uppercase() }
    }
}
