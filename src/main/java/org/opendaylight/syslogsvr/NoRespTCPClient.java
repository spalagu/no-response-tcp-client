package org.opendaylight.syslogsvr;

import org.apache.jmeter.protocol.tcp.sampler.ReadException;
import org.apache.jmeter.protocol.tcp.sampler.TCPClientImpl;
import org.apache.jmeter.samplers.SampleResult;

import java.io.InputStream;

public class NoRespTCPClient extends TCPClientImpl {
    public String read(InputStream is, SampleResult sampleResult) throws ReadException{
        sampleResult.latencyEnd();
        return "";
    }
}
