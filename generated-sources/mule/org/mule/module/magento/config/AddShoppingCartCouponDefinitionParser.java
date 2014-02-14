
package org.mule.module.magento.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.mule.module.magento.processors.AddShoppingCartCouponMessageProcessor;
import org.mule.security.oauth.config.AbstractDevkitBasedDefinitionParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.parsing.BeanDefinitionParsingException;
import org.springframework.beans.factory.parsing.Location;
import org.springframework.beans.factory.parsing.Problem;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

@Generated(value = "Mule DevKit Version 3.5.0-SNAPSHOT", date = "2014-02-14T12:22:33-06:00", comments = "Build UNKNOWN_BUILDNUMBER")
public class AddShoppingCartCouponDefinitionParser
    extends AbstractDevkitBasedDefinitionParser
{

    private static Logger logger = LoggerFactory.getLogger(AddShoppingCartCouponDefinitionParser.class);

    private BeanDefinitionBuilder getBeanDefinitionBuilder(ParserContext parserContext) {
        try {
            return BeanDefinitionBuilder.rootBeanDefinition(AddShoppingCartCouponMessageProcessor.class.getName());
        } catch (NoClassDefFoundError noClassDefFoundError) {
            String muleVersion = "";
            try {
                muleVersion = MuleManifest.getProductVersion();
            } catch (Exception _x) {
                logger.error("Problem while reading mule version");
            }
            logger.error(("Cannot launch the mule app, the @Processor [add-shopping-cart-coupon] within the connector [magento] is not supported in mule "+ muleVersion));
            throw new BeanDefinitionParsingException(new Problem(("Cannot launch the mule app, the @Processor [add-shopping-cart-coupon] within the connector [magento] is not supported in mule "+ muleVersion), new Location(parserContext.getReaderContext().getResource()), null, noClassDefFoundError));
        }
    }

    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = getBeanDefinitionBuilder(parserContext);
        builder.addConstructorArgValue("addShoppingCartCoupon");
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        parseConfigRef(element, builder);
        parseProperty(builder, element, "quoteId", "quoteId");
        parseProperty(builder, element, "couponCode", "couponCode");
        parseProperty(builder, element, "storeId", "storeId");
        parseProperty(builder, element, "username", "username");
        parseProperty(builder, element, "password", "password");
        parseProperty(builder, element, "address", "address");
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        attachProcessorDefinition(parserContext, definition);
        return definition;
    }

}