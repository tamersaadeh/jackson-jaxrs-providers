// Generated 02-Apr-2019 using Moditect maven plugin
module com.fasterxml.jackson.jaxrs.smile {
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;
    requires com.fasterxml.jackson.dataformat.smile;
    requires com.fasterxml.jackson.module.jaxb;

    requires com.fasterxml.jackson.jaxrs.base;

    requires jakarta.ws.rs.api;

    exports com.fasterxml.jackson.jaxrs.smile;

    provides jakarta.ws.rs.ext.MessageBodyReader with
        com.fasterxml.jackson.jaxrs.smile.JacksonSmileProvider;
    provides jakarta.ws.rs.ext.MessageBodyWriter with
        com.fasterxml.jackson.jaxrs.smile.JacksonSmileProvider;
}
