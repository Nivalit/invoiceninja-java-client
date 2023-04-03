package com.nivalit.invoiceninja.sdk

import com.nivalit.invoiceninja.apis.ClientsApi
import com.nivalit.invoiceninja.models.Client

class ClientApi {
    data class ClientCreateParams(
        val name: String
    )

    companion object {
        private val clientApi = ClientsApi(basePath = InvoiceNinja.basePath)

        fun create(params: ClientCreateParams) = clientApi.storeClient(
            X_API_TOKEN = InvoiceNinja.apiToken,
            xRequestedWith = "XMLHttpRequest",
            client = Client(name = params.name)
        )


        fun listAll() = clientApi.getClients(X_API_TOKEN = InvoiceNinja.apiToken, xRequestedWith = "XMLHttpRequest")

    }
}