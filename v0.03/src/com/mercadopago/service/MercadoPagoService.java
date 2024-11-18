package com.mercadopago.service;

import com.mercadopago.resources.preference.Preference;
import com.mercadopago.MercadoPagoConfig;
import com.mercadopago.client.preference.PreferenceBackUrlsRequest;
import com.mercadopago.client.preference.PreferenceClient;
import com.mercadopago.client.preference.PreferenceItemRequest;
import com.mercadopago.client.preference.PreferenceRequest;
import com.mercadopago.exceptions.MPApiException;
import com.mercadopago.exceptions.MPException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MercadoPagoService {
    private static final String ACCESS_TOKEN = "APP_USR-7212836823831462-111514-73f1dc599ab85b134cd69f9b1a2f8776-2100204072";

    public MercadoPagoService() {
        // Configurar el Access Token
        MercadoPagoConfig.setAccessToken(ACCESS_TOKEN);
    }

    public String generarEnlacePago(String id, String titulo, String descripcion, String imagenUrl, String categoria,
                                    int cantidad, String moneda, BigDecimal precio, String urlExito,
                                    String urlFallo, String urlPendiente) throws MPException, MPApiException {

        PreferenceClient client = new PreferenceClient();

        // Crear el ítem
        PreferenceItemRequest itemRequest = PreferenceItemRequest.builder()
            .id(id)
            .title(titulo)
            .description(descripcion)
            .pictureUrl(imagenUrl)
            .categoryId(categoria)
            .quantity(cantidad)
            .currencyId(moneda)
            .unitPrice(precio)
            .build();

        List<PreferenceItemRequest> items = new ArrayList<>();
        items.add(itemRequest);

        // Crear URLs de redirección
        PreferenceBackUrlsRequest backUrls = PreferenceBackUrlsRequest.builder()
            .success(urlExito)
            .failure(urlFallo)
            .pending(urlPendiente)
            .build();

        // Crear la preferencia
        PreferenceRequest preferenceRequest = PreferenceRequest.builder()
            .backUrls(backUrls)
            .items(items)
            .autoReturn("approved")
            .build();

        Preference preference = client.create(preferenceRequest);

        return "https://www.mercadopago.com.pe/checkout/v1/redirect?pref_id=" + preference.getId();
    }
}
