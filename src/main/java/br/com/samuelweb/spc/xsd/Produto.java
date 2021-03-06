package br.com.samuelweb.spc.xsd;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 01/09/2017 - 10:47
 */
public class Produto implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = Produto
           Namespace URI = http://webservice.consulta.spcjava.spcbrasil.org/
           Namespace Prefix = ns1
         */

    /**
     * field for Codigo
     */
    protected java.lang.String localCodigo;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCodigoTracker = false;

    /**
     * field for Nome
     */
    protected java.lang.String localNome;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNomeTracker = false;

    /**
     * field for Parametro
     * This was an Array!
     */
    protected ParametroProduto[] localParametro;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localParametroTracker = false;

    /**
     * field for InsumoOpcional
     * This was an Array!
     */
    protected InsumoProduto[] localInsumoOpcional;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localInsumoOpcionalTracker = false;

    /**
     * field for InsumoRetorno
     * This was an Array!
     */
    protected InsumoProduto[] localInsumoRetorno;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localInsumoRetornoTracker = false;

    public boolean isCodigoSpecified() {
        return localCodigoTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCodigo() {
        return localCodigo;
    }

    /**
     * Auto generated setter method
     * @param param Codigo
     */
    public void setCodigo(java.lang.String param) {
        localCodigoTracker = param != null;

        this.localCodigo = param;
    }

    public boolean isNomeSpecified() {
        return localNomeTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNome() {
        return localNome;
    }

    /**
     * Auto generated setter method
     * @param param Nome
     */
    public void setNome(java.lang.String param) {
        localNomeTracker = param != null;

        this.localNome = param;
    }

    public boolean isParametroSpecified() {
        return localParametroTracker;
    }

    /**
     * Auto generated getter method
     * @return ParametroProduto[]
     */
    public ParametroProduto[] getParametro() {
        return localParametro;
    }

    /**
     * validate the array for Parametro
     */
    protected void validateParametro(ParametroProduto[] param) {
    }

    /**
     * Auto generated setter method
     * @param param Parametro
     */
    public void setParametro(ParametroProduto[] param) {
        validateParametro(param);

        localParametroTracker = param != null;

        this.localParametro = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param ParametroProduto
     */
    public void addParametro(ParametroProduto param) {
        if (localParametro == null) {
            localParametro = new ParametroProduto[] {  };
        }

        //update the setting tracker
        localParametroTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localParametro);
        list.add(param);
        this.localParametro = (ParametroProduto[]) list.toArray(new ParametroProduto[list.size()]);
    }

    public boolean isInsumoOpcionalSpecified() {
        return localInsumoOpcionalTracker;
    }

    /**
     * Auto generated getter method
     * @return InsumoProduto[]
     */
    public InsumoProduto[] getInsumoOpcional() {
        return localInsumoOpcional;
    }

    /**
     * validate the array for InsumoOpcional
     */
    protected void validateInsumoOpcional(InsumoProduto[] param) {
    }

    /**
     * Auto generated setter method
     * @param param InsumoOpcional
     */
    public void setInsumoOpcional(InsumoProduto[] param) {
        validateInsumoOpcional(param);

        localInsumoOpcionalTracker = param != null;

        this.localInsumoOpcional = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param InsumoProduto
     */
    public void addInsumoOpcional(InsumoProduto param) {
        if (localInsumoOpcional == null) {
            localInsumoOpcional = new InsumoProduto[] {  };
        }

        //update the setting tracker
        localInsumoOpcionalTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localInsumoOpcional);
        list.add(param);
        this.localInsumoOpcional = (InsumoProduto[]) list.toArray(new InsumoProduto[list.size()]);
    }

    public boolean isInsumoRetornoSpecified() {
        return localInsumoRetornoTracker;
    }

    /**
     * Auto generated getter method
     * @return InsumoProduto[]
     */
    public InsumoProduto[] getInsumoRetorno() {
        return localInsumoRetorno;
    }

    /**
     * validate the array for InsumoRetorno
     */
    protected void validateInsumoRetorno(InsumoProduto[] param) {
    }

    /**
     * Auto generated setter method
     * @param param InsumoRetorno
     */
    public void setInsumoRetorno(InsumoProduto[] param) {
        validateInsumoRetorno(param);

        localInsumoRetornoTracker = param != null;

        this.localInsumoRetorno = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param InsumoProduto
     */
    public void addInsumoRetorno(InsumoProduto param) {
        if (localInsumoRetorno == null) {
            localInsumoRetorno = new InsumoProduto[] {  };
        }

        //update the setting tracker
        localInsumoRetornoTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localInsumoRetorno);
        list.add(param);
        this.localInsumoRetorno = (InsumoProduto[]) list.toArray(new InsumoProduto[list.size()]);
    }

    /**
     *
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
        return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                this, parentQName));
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
                          javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        serialize(parentQName, xmlWriter, false);
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
                          javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        java.lang.String prefix = null;
        java.lang.String namespace = null;

        prefix = parentQName.getPrefix();
        namespace = parentQName.getNamespaceURI();
        writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

        if (serializeType) {
            java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                    "http://webservice.consulta.spcjava.spcbrasil.org/");

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":Produto", xmlWriter);
            } else {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "Produto", xmlWriter);
            }
        }

        if (localCodigoTracker) {
            namespace = "";
            writeStartElement(null, namespace, "codigo", xmlWriter);

            if (localCodigo == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "codigo cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localCodigo);
            }

            xmlWriter.writeEndElement();
        }

        if (localNomeTracker) {
            namespace = "";
            writeStartElement(null, namespace, "nome", xmlWriter);

            if (localNome == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "nome cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localNome);
            }

            xmlWriter.writeEndElement();
        }

        if (localParametroTracker) {
            if (localParametro != null) {
                for (int i = 0; i < localParametro.length; i++) {
                    if (localParametro[i] != null) {
                        localParametro[i].serialize(new javax.xml.namespace.QName(
                                "", "parametro"), xmlWriter);
                    } else {
                        // we don't have to do any thing since minOccures is zero
                    }
                }
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                        "parametro cannot be null!!");
            }
        }

        if (localInsumoOpcionalTracker) {
            if (localInsumoOpcional != null) {
                for (int i = 0; i < localInsumoOpcional.length; i++) {
                    if (localInsumoOpcional[i] != null) {
                        localInsumoOpcional[i].serialize(new javax.xml.namespace.QName(
                                "", "insumo-opcional"), xmlWriter);
                    } else {
                        // we don't have to do any thing since minOccures is zero
                    }
                }
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                        "insumo-opcional cannot be null!!");
            }
        }

        if (localInsumoRetornoTracker) {
            if (localInsumoRetorno != null) {
                for (int i = 0; i < localInsumoRetorno.length; i++) {
                    if (localInsumoRetorno[i] != null) {
                        localInsumoRetorno[i].serialize(new javax.xml.namespace.QName(
                                "", "insumo-retorno"), xmlWriter);
                    } else {
                        // we don't have to do any thing since minOccures is zero
                    }
                }
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                        "insumo-retorno cannot be null!!");
            }
        }

        xmlWriter.writeEndElement();
    }

    private java.lang.String generatePrefix(
            java.lang.String namespace) {
        if (namespace.equals(
                "http://webservice.consulta.spcjava.spcbrasil.org/")) {
            return "ns1";
        }

        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(java.lang.String prefix,
                                   java.lang.String namespace, java.lang.String localPart,
                                   javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

        if (writerPrefix != null) {
            xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
        } else {
            if (namespace.length() == 0) {
                prefix = "";
            } else if (prefix == null) {
                prefix = generatePrefix(namespace);
            }

            xmlWriter.writeStartElement(prefix, localPart, namespace);
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(java.lang.String prefix,
                                java.lang.String namespace, java.lang.String attName,
                                java.lang.String attValue,
                                javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

        if (writerPrefix != null) {
            xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                    attValue);
        } else {
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
            xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(java.lang.String namespace,
                                java.lang.String attName, java.lang.String attValue,
                                javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attValue);
        } else {
            xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                    namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace,
                                     java.lang.String attName, javax.xml.namespace.QName qname,
                                     javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }

        java.lang.String attributeValue;

        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                    attributeValue);
        }
    }

    /**
     *  method to handle Qnames
     */
    private void writeQName(javax.xml.namespace.QName qname,
                            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
        java.lang.String namespaceURI = qname.getNamespaceURI();

        if (namespaceURI != null) {
            java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

            if (prefix == null) {
                prefix = generatePrefix(namespaceURI);
                xmlWriter.writeNamespace(prefix, namespaceURI);
                xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
                xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qname));
            } else {
                // i.e this is the default namespace
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    qname));
        }
    }

    private void writeQNames(javax.xml.namespace.QName[] qnames,
                             javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
        if (qnames != null) {
            // we have to store this data until last moment since it is not possible to write any
            // namespace data after writing the charactor data
            java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
            java.lang.String namespaceURI = null;
            java.lang.String prefix = null;

            for (int i = 0; i < qnames.length; i++) {
                if (i > 0) {
                    stringToWrite.append(" ");
                }

                namespaceURI = qnames[i].getNamespaceURI();

                if (namespaceURI != null) {
                    prefix = xmlWriter.getPrefix(namespaceURI);

                    if ((prefix == null) || (prefix.length() == 0)) {
                        prefix = generatePrefix(namespaceURI);
                        xmlWriter.writeNamespace(prefix, namespaceURI);
                        xmlWriter.setPrefix(prefix, namespaceURI);
                    }

                    if (prefix.trim().length() > 0) {
                        stringToWrite.append(prefix).append(":")
                                .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                        qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qnames[i]));
                }
            }

            xmlWriter.writeCharacters(stringToWrite.toString());
        }
    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
        java.lang.String prefix = xmlWriter.getPrefix(namespace);

        if (prefix == null) {
            prefix = generatePrefix(namespace);

            javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

            while (true) {
                java.lang.String uri = nsContext.getNamespaceURI(prefix);

                if ((uri == null) || (uri.length() == 0)) {
                    break;
                }

                prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
            }

            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }

        return prefix;
    }

    /**
     *  Factory class that keeps the parse method
     */
    public static class Factory {
        private org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

        /**
         * static method to create the object
         * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
         *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
         * Postcondition: If this object is an element, the reader is positioned at its end element
         *                If this object is a complex type, the reader is positioned at the end element of its outer element
         */
        public static Produto parse(javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
            Produto object = new Produto();

            int event;
            javax.xml.namespace.QName currentQName = null;
            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";

            try {
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                currentQName = reader.getName();

                if (reader.getAttributeValue(
                        "http://www.w3.org/2001/XMLSchema-instance",
                        "type") != null) {
                    java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "type");

                    if (fullTypeName != null) {
                        java.lang.String nsPrefix = null;

                        if (fullTypeName.indexOf(":") > -1) {
                            nsPrefix = fullTypeName.substring(0,
                                    fullTypeName.indexOf(":"));
                        }

                        nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                        java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                ":") + 1);

                        if (!"Produto".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                    .getNamespaceURI(nsPrefix);

                            return (Produto) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                java.util.ArrayList list3 = new java.util.ArrayList();

                java.util.ArrayList list4 = new java.util.ArrayList();

                java.util.ArrayList list5 = new java.util.ArrayList();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "codigo").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "codigo").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "codigo" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCodigo(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "nome").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "nome").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "nome" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setNome(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "parametro").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "parametro").equals(
                                reader.getName())) {
                    // Process the array and step past its final element's end.
                    list3.add(ParametroProduto.Factory.parse(reader));

                    //loop until we find a start element that is not part of this array
                    boolean loopDone3 = false;

                    while (!loopDone3) {
                        // We should be at the end element, but make sure
                        while (!reader.isEndElement())
                            reader.next();

                        // Step out of this element
                        reader.next();

                        // Step to next element event.
                        while (!reader.isStartElement() &&
                                !reader.isEndElement())
                            reader.next();

                        if (reader.isEndElement()) {
                            //two continuous end elements means we are exiting the xml structure
                            loopDone3 = true;
                        } else {
                            if (new javax.xml.namespace.QName("",
                                    "parametro").equals(
                                    reader.getName())) {
                                list3.add(ParametroProduto.Factory.parse(
                                        reader));
                            } else {
                                loopDone3 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setParametro((ParametroProduto[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                            ParametroProduto.class, list3));
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "insumo-opcional").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "insumo-opcional").equals(
                                reader.getName())) {
                    // Process the array and step past its final element's end.
                    list4.add(InsumoProduto.Factory.parse(reader));

                    //loop until we find a start element that is not part of this array
                    boolean loopDone4 = false;

                    while (!loopDone4) {
                        // We should be at the end element, but make sure
                        while (!reader.isEndElement())
                            reader.next();

                        // Step out of this element
                        reader.next();

                        // Step to next element event.
                        while (!reader.isStartElement() &&
                                !reader.isEndElement())
                            reader.next();

                        if (reader.isEndElement()) {
                            //two continuous end elements means we are exiting the xml structure
                            loopDone4 = true;
                        } else {
                            if (new javax.xml.namespace.QName("",
                                    "insumo-opcional").equals(
                                    reader.getName())) {
                                list4.add(InsumoProduto.Factory.parse(
                                        reader));
                            } else {
                                loopDone4 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setInsumoOpcional((InsumoProduto[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                            InsumoProduto.class, list4));
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "insumo-retorno").equals(
                                reader.getName())) ||
                        new javax.xml.namespace.QName("", "insumo-retorno").equals(
                                reader.getName())) {
                    // Process the array and step past its final element's end.
                    list5.add(InsumoProduto.Factory.parse(reader));

                    //loop until we find a start element that is not part of this array
                    boolean loopDone5 = false;

                    while (!loopDone5) {
                        // We should be at the end element, but make sure
                        while (!reader.isEndElement())
                            reader.next();

                        // Step out of this element
                        reader.next();

                        // Step to next element event.
                        while (!reader.isStartElement() &&
                                !reader.isEndElement())
                            reader.next();

                        if (reader.isEndElement()) {
                            //two continuous end elements means we are exiting the xml structure
                            loopDone5 = true;
                        } else {
                            if (new javax.xml.namespace.QName("",
                                    "insumo-retorno").equals(
                                    reader.getName())) {
                                list5.add(InsumoProduto.Factory.parse(
                                        reader));
                            } else {
                                loopDone5 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setInsumoRetorno((InsumoProduto[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                            InsumoProduto.class, list5));
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()) {
                    // 2 - A start element we are not expecting indicates a trailing invalid property
                    throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                }
            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }
    } //end of factory class
}

