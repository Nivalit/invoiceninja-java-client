package com.nivalit.invoiceninja.sdk

import com.nivalit.invoiceninja.apis.ClientsApiAdapter
import com.nivalit.invoiceninja.models.Client

class ClientApi {

    companion object {
        private val clientApi = ClientsApiAdapter(basePath = InvoiceNinja.basePath)

        fun create(client: Client) = clientApi.storeClient(
            X_API_TOKEN = InvoiceNinja.apiToken,
            xRequestedWith = "XMLHttpRequest",
            client = client
        ).data

        fun update(id: String, client: Client) = clientApi.updateClient(
            X_API_TOKEN = InvoiceNinja.apiToken,
            xRequestedWith = "XMLHttpRequest",
            id = id,
            client = client
        ).data


        fun retrieve(id: String) = clientApi.showClient(
            X_API_TOKEN = InvoiceNinja.apiToken,
            xRequestedWith = "XMLHttpRequest",
            id = id,
        ).data

        fun listAll(
            include: String? = null,
            index: String? = null,
            status: String? = null,
            createdAt: Int? = null,
            updatedAt: Int? = null,
            isDeleted: Boolean? = null,
            filterDeletedClients: String? = null,
            vendorId: String? = null,
            name: String? = null,
            balance: String? = null,
            betweenBalance: String? = null,
            email: String? = null,
            idNumber: String? = null,
            number: String? = null,
            filter: String? = null,
            sort: String? = null
        ) = clientApi.getClients(
            X_API_TOKEN = InvoiceNinja.apiToken,
            xRequestedWith = "XMLHttpRequest",
            include = include,
            index = index,
            status = status,
            createdAt = createdAt,
            updatedAt = updatedAt,
            isDeleted = isDeleted,
            filterDeletedClients = filterDeletedClients,
            vendorId = vendorId,
            name = name,
            balance = balance,
            betweenBalance = betweenBalance,
            email = email,
            idNumber = idNumber,
            number = number,
            filter = filter,
            sort = sort,
        ).data
    }
}