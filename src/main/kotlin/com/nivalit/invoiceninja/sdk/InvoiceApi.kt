package com.nivalit.invoiceninja.sdk

import com.nivalit.invoiceninja.apis.InvoicesApiAdapter
import com.nivalit.invoiceninja.models.FillableInvoice
import com.nivalit.invoiceninja.models.Invoice

class InvoiceApi {
    companion object {
        private val client = InvoicesApiAdapter(InvoiceNinja.basePath)

        fun create(invoice: FillableInvoice) = client.storeInvoice(
            X_API_TOKEN = InvoiceNinja.apiToken,
            xRequestedWith = InvoiceNinja.xRequestedWith,
            fillableInvoice = invoice
        ).data

        fun update(id: String, invoice: Invoice) = client.updateInvoice(
            X_API_TOKEN = InvoiceNinja.apiToken,
            xRequestedWith = InvoiceNinja.xRequestedWith,
            id = id,
            invoice = invoice
        ).data

        fun retrieve(id: String) = client.showInvoice(
            X_API_TOKEN = InvoiceNinja.apiToken,
            xRequestedWith = InvoiceNinja.xRequestedWith,
            id = id
        ).data
    }
}