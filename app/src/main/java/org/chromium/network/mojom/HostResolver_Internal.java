
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/host_resolver.mojom
//

package org.chromium.network.mojom;

import org.chromium.mojo.bindings.DeserializationException;


class HostResolver_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<HostResolver, HostResolver.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<HostResolver, HostResolver.Proxy>() {

        @Override
        public String getName() {
            return "network.mojom.HostResolver";
        }

        @Override
        public int getVersion() {
          return 0;
        }

        @Override
        public Proxy buildProxy(org.chromium.mojo.system.Core core,
                                org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override
        public Stub buildStub(org.chromium.mojo.system.Core core, HostResolver impl) {
            return new Stub(core, impl);
        }

        @Override
        public HostResolver[] buildArray(int size) {
          return new HostResolver[size];
        }
    };


    private static final int RESOLVE_HOST_ORDINAL = 0;

    private static final int MDNS_LISTEN_ORDINAL = 1;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements HostResolver.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void resolveHost(
HostPortPair host, ResolveHostParameters optionalParameters, ResolveHostClient responseClient) {

            HostResolverResolveHostParams _message = new HostResolverResolveHostParams();

            _message.host = host;

            _message.optionalParameters = optionalParameters;

            _message.responseClient = responseClient;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(RESOLVE_HOST_ORDINAL)));

        }


        @Override
        public void mdnsListen(
HostPortPair host, int queryType, MdnsListenClient responseClient, 
MdnsListenResponse callback) {

            HostResolverMdnsListenParams _message = new HostResolverMdnsListenParams();

            _message.host = host;

            _message.queryType = queryType;

            _message.responseClient = responseClient;


            getProxyHandler().getMessageReceiver().acceptWithResponder(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(
                                    MDNS_LISTEN_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG,
                                    0)),
                    new HostResolverMdnsListenResponseParamsForwardToCallback(callback));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<HostResolver> {

        Stub(org.chromium.mojo.system.Core core, HostResolver impl) {
            super(core, impl);
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(org.chromium.mojo.bindings.MessageHeader.NO_FLAG)) {
                    return false;
                }
                switch(header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_OR_CLOSE_PIPE_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRunOrClosePipe(
                                HostResolver_Internal.MANAGER, messageWithHeader);





                    case RESOLVE_HOST_ORDINAL: {

                        HostResolverResolveHostParams data =
                                HostResolverResolveHostParams.deserialize(messageWithHeader.getPayload());

                        getImpl().resolveHost(data.host, data.optionalParameters, data.responseClient);
                        return true;
                    }




                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }

        @Override
        public boolean acceptWithResponder(org.chromium.mojo.bindings.Message message, org.chromium.mojo.bindings.MessageReceiver receiver) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG)) {
                    return false;
                }
                switch(header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRun(
                                getCore(), HostResolver_Internal.MANAGER, messageWithHeader, receiver);









                    case MDNS_LISTEN_ORDINAL: {

                        HostResolverMdnsListenParams data =
                                HostResolverMdnsListenParams.deserialize(messageWithHeader.getPayload());

                        getImpl().mdnsListen(data.host, data.queryType, data.responseClient, new HostResolverMdnsListenResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    }


                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }


    
    static final class HostResolverResolveHostParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 32;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(32, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public HostPortPair host;
        public ResolveHostParameters optionalParameters;
        public ResolveHostClient responseClient;

        private HostResolverResolveHostParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public HostResolverResolveHostParams() {
            this(0);
        }

        public static HostResolverResolveHostParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static HostResolverResolveHostParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static HostResolverResolveHostParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            HostResolverResolveHostParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new HostResolverResolveHostParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.host = HostPortPair.decode(decoder1);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, true);
                    result.optionalParameters = ResolveHostParameters.decode(decoder1);
                    }
                    {
                        
                    result.responseClient = decoder0.readServiceInterface(24, false, ResolveHostClient.MANAGER);
                    }

            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            
            encoder0.encode(this.host, 8, false);
            
            encoder0.encode(this.optionalParameters, 16, true);
            
            encoder0.encode(this.responseClient, 24, false, ResolveHostClient.MANAGER);
        }
    }



    
    static final class HostResolverMdnsListenParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 32;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(32, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public HostPortPair host;
        public int queryType;
        public MdnsListenClient responseClient;

        private HostResolverMdnsListenParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public HostResolverMdnsListenParams() {
            this(0);
        }

        public static HostResolverMdnsListenParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static HostResolverMdnsListenParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static HostResolverMdnsListenParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            HostResolverMdnsListenParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new HostResolverMdnsListenParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.host = HostPortPair.decode(decoder1);
                    }
                    {
                        
                    result.queryType = decoder0.readInt(16);
                        DnsQueryType.validate(result.queryType);
                    }
                    {
                        
                    result.responseClient = decoder0.readServiceInterface(20, false, MdnsListenClient.MANAGER);
                    }

            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            
            encoder0.encode(this.host, 8, false);
            
            encoder0.encode(this.queryType, 16);
            
            encoder0.encode(this.responseClient, 20, false, MdnsListenClient.MANAGER);
        }
    }



    
    static final class HostResolverMdnsListenResponseParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int result;

        private HostResolverMdnsListenResponseParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public HostResolverMdnsListenResponseParams() {
            this(0);
        }

        public static HostResolverMdnsListenResponseParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static HostResolverMdnsListenResponseParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static HostResolverMdnsListenResponseParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            HostResolverMdnsListenResponseParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new HostResolverMdnsListenResponseParams(elementsOrVersion);
                    {
                        
                    result.result = decoder0.readInt(8);
                    }

            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            
            encoder0.encode(this.result, 8);
        }
    }

    static class HostResolverMdnsListenResponseParamsForwardToCallback extends org.chromium.mojo.bindings.SideEffectFreeCloseable
            implements org.chromium.mojo.bindings.MessageReceiver {
        private final HostResolver.MdnsListenResponse mCallback;

        HostResolverMdnsListenResponseParamsForwardToCallback(HostResolver.MdnsListenResponse callback) {
            this.mCallback = callback;
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(MDNS_LISTEN_ORDINAL,
                                           org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG)) {
                    return false;
                }

                HostResolverMdnsListenResponseParams response = HostResolverMdnsListenResponseParams.deserialize(messageWithHeader.getPayload());

                mCallback.call(response.result);
                return true;
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                return false;
            }
        }
    }

    static class HostResolverMdnsListenResponseParamsProxyToResponder implements HostResolver.MdnsListenResponse {

        private final org.chromium.mojo.system.Core mCore;
        private final org.chromium.mojo.bindings.MessageReceiver mMessageReceiver;
        private final long mRequestId;

        HostResolverMdnsListenResponseParamsProxyToResponder(
                org.chromium.mojo.system.Core core,
                org.chromium.mojo.bindings.MessageReceiver messageReceiver,
                long requestId) {
            mCore = core;
            mMessageReceiver = messageReceiver;
            mRequestId = requestId;
        }

        @Override
        public void call(Integer result) {
            HostResolverMdnsListenResponseParams _response = new HostResolverMdnsListenResponseParams();

            _response.result = result;

            org.chromium.mojo.bindings.ServiceMessage _message =
                    _response.serializeWithHeader(
                            mCore,
                            new org.chromium.mojo.bindings.MessageHeader(
                                    MDNS_LISTEN_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG,
                                    mRequestId));
            mMessageReceiver.accept(_message);
        }
    }



}