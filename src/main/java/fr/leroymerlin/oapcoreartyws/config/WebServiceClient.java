package fr.leroymerlin.oapcoreartyws.config;

import com.adeo.diamant.arty.service.DomaineCompetenceLightDTO;
import com.adeo.diamant.arty.service.GetTypePrestationByMagasin;
import com.adeo.diamant.arty.service.GetTypePrestationByMagasinResponse;
import com.adeo.diamant.arty.service.ObjectFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import javax.xml.bind.JAXBElement;
import java.util.List;

/**
 * @author Farouk KABOUCHE
 *
 * Web Service Client
 */
public final class WebServiceClient extends WebServiceGatewaySupport {

    /**
     * Get Prestation Type By Store
     * @param id
     * @return {@link List < DomaineCompetenceLightDTO >}
     */
    public List<DomaineCompetenceLightDTO> getPrestationTypeByStore(final String id) {
        final GetTypePrestationByMagasin request = new GetTypePrestationByMagasin();
        request.setArg0(id);
        final JAXBElement<GetTypePrestationByMagasin> requestJaxb = new ObjectFactory().createGetTypePrestationByMagasin(request);

        final JAXBElement<GetTypePrestationByMagasinResponse> responseJaxb = (JAXBElement<GetTypePrestationByMagasinResponse>) getWebServiceTemplate().marshalSendAndReceive(requestJaxb);
        return responseJaxb.getValue().getReturn();

    }
}

