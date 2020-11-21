/**
 * Copyright 2016-2020 The Reaktivity Project
 *
 * The Reaktivity Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package org.reaktivity.specification.nukleus.proxy.streams;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.junit.rules.RuleChain.outerRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.DisableOnDebug;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;
import org.kaazing.k3po.junit.annotation.Specification;
import org.kaazing.k3po.junit.rules.K3poRule;

public class ApplicationIT
{
    private final K3poRule k3po = new K3poRule()
        .addScriptRoot("scripts", "org/reaktivity/specification/nukleus/proxy/streams/application");

    private final TestRule timeout = new DisableOnDebug(new Timeout(5, SECONDS));

    @Rule
    public final TestRule chain = outerRule(k3po).around(timeout);

    @Test
    @Specification({
        "${scripts}/connected.local/client",
        "${scripts}/connected.local/server"})
    public void shouldConnectLocal() throws Exception
    {
        k3po.start();
        k3po.notifyBarrier("ROUTED_SERVER");
        k3po.finish();
    }

    @Test
    @Specification({
        "${scripts}/connected.local.client.sent.data/client",
        "${scripts}/connected.local.client.sent.data/server"})
    public void shouldConnectLocalClientSendsData() throws Exception
    {
        k3po.start();
        k3po.notifyBarrier("ROUTED_SERVER");
        k3po.finish();
    }

    @Test
    @Specification({
        "${scripts}/connected.local.client.sent.flush/client",
        "${scripts}/connected.local.client.sent.flush/server"})
    public void shouldConnectLocalClientSendsFlush() throws Exception
    {
        k3po.start();
        k3po.notifyBarrier("ROUTED_SERVER");
        k3po.finish();
    }

    @Test
    @Specification({
        "${scripts}/connected.local.client.sent.challenge/client",
        "${scripts}/connected.local.client.sent.challenge/server"})
    public void shouldConnectLocalClientSendshallenge() throws Exception
    {
        k3po.start();
        k3po.notifyBarrier("ROUTED_SERVER");
        k3po.finish();
    }

    @Test
    @Specification({
        "${scripts}/connected.local.server.sent.data/client",
        "${scripts}/connected.local.server.sent.data/server"})
    public void shouldConnectLocalServerSendsData() throws Exception
    {
        k3po.start();
        k3po.notifyBarrier("ROUTED_SERVER");
        k3po.finish();
    }

    @Test
    @Specification({
        "${scripts}/connected.local.server.sent.flush/client",
        "${scripts}/connected.local.server.sent.flush/server"})
    public void shouldConnectLocalServerSendsFlush() throws Exception
    {
        k3po.start();
        k3po.notifyBarrier("ROUTED_SERVER");
        k3po.finish();
    }

    @Test
    @Specification({
        "${scripts}/connected.local.server.sent.challenge/client",
        "${scripts}/connected.local.server.sent.challenge/server"})
    public void shouldConnectLocalServerSendsChallenge() throws Exception
    {
        k3po.start();
        k3po.notifyBarrier("ROUTED_SERVER");
        k3po.finish();
    }

    @Test
    @Specification({
        "${scripts}/connected.tcp4/client",
        "${scripts}/connected.tcp4/server"})
    public void shouldConnectTcp4() throws Exception
    {
        k3po.start();
        k3po.notifyBarrier("ROUTED_SERVER");
        k3po.finish();
    }

    @Test
    @Specification({
        "${scripts}/connected.udp4/client",
        "${scripts}/connected.udp4/server"})
    public void shouldConnectUdp4() throws Exception
    {
        k3po.start();
        k3po.notifyBarrier("ROUTED_SERVER");
        k3po.finish();
    }

    @Test
    @Specification({
        "${scripts}/connected.tcp6/client",
        "${scripts}/connected.tcp6/server"})
    public void shouldConnectTcp6() throws Exception
    {
        k3po.start();
        k3po.notifyBarrier("ROUTED_SERVER");
        k3po.finish();
    }

    @Test
    @Specification({
        "${scripts}/connected.udp6/client",
        "${scripts}/connected.udp6/server"})
    public void shouldConnectUdp6() throws Exception
    {
        k3po.start();
        k3po.notifyBarrier("ROUTED_SERVER");
        k3po.finish();
    }

    @Test
    @Specification({
        "${scripts}/connected.sock.stream/client",
        "${scripts}/connected.sock.stream/server"})
    public void shouldConnectSockStream() throws Exception
    {
        k3po.start();
        k3po.notifyBarrier("ROUTED_SERVER");
        k3po.finish();
    }

    @Test
    @Specification({
        "${scripts}/connected.sock.datagram/client",
        "${scripts}/connected.sock.datagram/server"})
    public void shouldConnectSockDatagram() throws Exception
    {
        k3po.start();
        k3po.notifyBarrier("ROUTED_SERVER");
        k3po.finish();
    }
}
