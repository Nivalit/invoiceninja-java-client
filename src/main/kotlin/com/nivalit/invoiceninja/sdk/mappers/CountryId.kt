package com.nivalit.invoiceninja.sdk.mappers;

import com.fasterxml.jackson.annotation.JsonProperty
import com.nivalit.invoiceninja.infrastructure.Serializer
import java.math.BigDecimal


class CountryData(
    @JsonProperty("id") val id: BigDecimal,
    @JsonProperty("name") val name: String,
    @JsonProperty("iso_3166_2") val iso2: String,
    @JsonProperty("iso_3166_3") val iso3: String
) {
    companion object {
        private val countryMapping =
            Companion::class.java.getResourceAsStream("/country-mapping.json").use { inputStream ->
                inputStream?.reader().use { reader ->
                    reader?.readText() ?: ""
                }
            }
        private val type = Serializer.jacksonObjectMapper.typeFactory.constructCollectionType(
            List::class.java,
            CountryData::class.java
        )
        private val reader = Serializer.jacksonObjectMapper.readerFor(type)
        val mapping = reader.readValue<List<CountryData>>(countryMapping)

        fun fromISO2Code(code: String) = mapping.find { it.iso2.uppercase() == code.uppercase() }
        fun fromISO3Code(code: String) = mapping.find { it.iso3.uppercase() == code.uppercase() }
    }
}
