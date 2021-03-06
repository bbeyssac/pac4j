package org.pac4j.oidc.profile.azuread;

import org.pac4j.core.profile.converter.Converters;
import org.pac4j.oidc.profile.OidcAttributesDefinition;

import java.util.Arrays;

/**
 * This class defines the attributes of the Azure AD OpenID Connect profile.
 *
 * @author Jerome Leleu
 * @since 1.9.0
 */
public class AzureAdAttributesDefinition extends OidcAttributesDefinition {

    public static final String IDP = "idp";
    public static final String OID = "oid";
    public static final String TID = "tid";
    public static final String VER = "ver";
    public static final String UNQIUE_NAME = "unique_name";
    public static final String IPADDR = "ipaddr";

    public AzureAdAttributesDefinition() {
        super();
        Arrays.stream(new String[] {IDP, OID, TID, VER, UNQIUE_NAME, IPADDR}).forEach(a -> primary(a, Converters.STRING));
    }
}
