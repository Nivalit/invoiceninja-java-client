package com.nivalit.invoiceninja.sdk

import com.nivalit.invoiceninja.apis.EmailsApiAdapter
import com.nivalit.invoiceninja.apis.InvoicesApiAdapter
import com.nivalit.invoiceninja.apis.TemplatesApiAdapter
import com.nivalit.invoiceninja.models.*

class InvoiceApi {
    companion object {
        private val client = InvoicesApiAdapter(InvoiceNinja.basePath)
        private val emailClient = EmailsApiAdapter(InvoiceNinja.basePath)
        private val templateClient = TemplatesApiAdapter(InvoiceNinja.basePath)

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

        fun markPaid(id: String) = client.bulkInvoices(
            X_API_TOKEN = InvoiceNinja.apiToken,
            xRequestedWith = InvoiceNinja.xRequestedWith,
            bulkInvoicesRequest = BulkInvoicesRequest("mark_paid", listOf(id))
        )

        fun send(id: String) =
            emailClient.sendEmailTemplate(
                X_API_TOKEN = InvoiceNinja.apiToken,
                xRequestedWith = InvoiceNinja.xRequestedWith,
                sendEmailTemplateRequest = SendEmailTemplateRequest(
                    entity = "invoice",
                    entityId = id,
                    template = "email_template_invoice"
                )
            )

        fun previewEmail(id: String) =
            templateClient.getShowTemplate(
                X_API_TOKEN = InvoiceNinja.apiToken,
                xRequestedWith = InvoiceNinja.xRequestedWith,
                getShowTemplateRequest = GetShowTemplateRequest(
                    entity = "invoice",
                    entityId = id,
                    template = "email_template_invoice"
                )
            )
    }
}