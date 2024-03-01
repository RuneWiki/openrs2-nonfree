package com.jagex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.ProxySelector;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajq")
public class Class72_Sub1 extends Class72 {

	@OriginalMember(owner = "client!ajq", name = "l", descriptor = "Ljava/lang/String;")
	static final String aString70 = "java.net.useSystemProxies";

	@OriginalMember(owner = "client!ajq", name = "r", descriptor = "[[Z")
	static boolean[][] aBooleanArrayArray11;

	@OriginalMember(owner = "client!ajq", name = "g", descriptor = "Ljava/net/ProxySelector;")
	final ProxySelector aProxySelector1 = ProxySelector.getDefault();

	@OriginalMember(owner = "client!ajq", name = "<init>", descriptor = "()V", line = 15)
	Class72_Sub1() {
	}

	@OriginalMember(owner = "client!ajq", name = "a", descriptor = "(B)Ljava/net/Socket;", line = 20)
	@Override
	public Socket method14636() throws IOException {
		@Pc(3) boolean local3 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local3) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(19) boolean local19 = this.anInt2085 * -1214188461 == 443;
		@Pc(41) List local41;
		@Pc(63) List local63;
		try {
			local41 = this.aProxySelector1.select(new URI((local19 ? "https" : "http") + "://" + this.aString69));
			local63 = this.aProxySelector1.select(new URI((local19 ? "http" : "https") + "://" + this.aString69));
		} catch (@Pc(65) URISyntaxException local65) {
			return this.method14638();
		}
		local41.addAll(local63);
		@Pc(76) Object[] local76 = local41.toArray();
		@Pc(78) IOException_Sub1 local78 = null;
		@Pc(80) Object[] local80 = local76;
		for (@Pc(82) int local82 = 0; local82 < local80.length; local82++) {
			@Pc(90) Object local90 = local80[local82];
			@Pc(93) Proxy local93 = (Proxy) local90;
			try {
				@Pc(98) Socket local98 = this.method14645(local93);
				if (local98 != null) {
					return local98;
				}
			} catch (@Pc(105) IOException_Sub1 local105) {
				local78 = local105;
			} catch (@Pc(109) IOException local109) {
			}
		}
		if (local78 != null) {
			throw local78;
		}
		return this.method14638();
	}

	@OriginalMember(owner = "client!ajq", name = "h", descriptor = "()Ljava/net/Socket;", line = 20)
	@Override
	public Socket method14643() throws IOException {
		@Pc(3) boolean local3 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local3) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(19) boolean local19 = this.anInt2085 * -1214188461 == 443;
		@Pc(41) List local41;
		@Pc(63) List local63;
		try {
			local41 = this.aProxySelector1.select(new URI((local19 ? "https" : "http") + "://" + this.aString69));
			local63 = this.aProxySelector1.select(new URI((local19 ? "http" : "https") + "://" + this.aString69));
		} catch (@Pc(65) URISyntaxException local65) {
			return this.method14638();
		}
		local41.addAll(local63);
		@Pc(76) Object[] local76 = local41.toArray();
		@Pc(78) IOException_Sub1 local78 = null;
		@Pc(80) Object[] local80 = local76;
		for (@Pc(82) int local82 = 0; local82 < local80.length; local82++) {
			@Pc(90) Object local90 = local80[local82];
			@Pc(93) Proxy local93 = (Proxy) local90;
			try {
				@Pc(98) Socket local98 = this.method14645(local93);
				if (local98 != null) {
					return local98;
				}
			} catch (@Pc(105) IOException_Sub1 local105) {
				local78 = local105;
			} catch (@Pc(109) IOException local109) {
			}
		}
		if (local78 != null) {
			throw local78;
		}
		return this.method14638();
	}

	@OriginalMember(owner = "client!ajq", name = "l", descriptor = "()Ljava/net/Socket;", line = 20)
	@Override
	public Socket method14641() throws IOException {
		@Pc(3) boolean local3 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local3) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(19) boolean local19 = this.anInt2085 * -1214188461 == 443;
		@Pc(41) List local41;
		@Pc(63) List local63;
		try {
			local41 = this.aProxySelector1.select(new URI((local19 ? "https" : "http") + "://" + this.aString69));
			local63 = this.aProxySelector1.select(new URI((local19 ? "http" : "https") + "://" + this.aString69));
		} catch (@Pc(65) URISyntaxException local65) {
			return this.method14638();
		}
		local41.addAll(local63);
		@Pc(76) Object[] local76 = local41.toArray();
		@Pc(78) IOException_Sub1 local78 = null;
		@Pc(80) Object[] local80 = local76;
		for (@Pc(82) int local82 = 0; local82 < local80.length; local82++) {
			@Pc(90) Object local90 = local80[local82];
			@Pc(93) Proxy local93 = (Proxy) local90;
			try {
				@Pc(98) Socket local98 = this.method14645(local93);
				if (local98 != null) {
					return local98;
				}
			} catch (@Pc(105) IOException_Sub1 local105) {
				local78 = local105;
			} catch (@Pc(109) IOException local109) {
			}
		}
		if (local78 != null) {
			throw local78;
		}
		return this.method14638();
	}

	@OriginalMember(owner = "client!ajq", name = "x", descriptor = "()Ljava/net/Socket;", line = 20)
	@Override
	public Socket method14640() throws IOException {
		@Pc(3) boolean local3 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local3) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(19) boolean local19 = this.anInt2085 * -1214188461 == 443;
		@Pc(41) List local41;
		@Pc(63) List local63;
		try {
			local41 = this.aProxySelector1.select(new URI((local19 ? "https" : "http") + "://" + this.aString69));
			local63 = this.aProxySelector1.select(new URI((local19 ? "http" : "https") + "://" + this.aString69));
		} catch (@Pc(65) URISyntaxException local65) {
			return this.method14638();
		}
		local41.addAll(local63);
		@Pc(76) Object[] local76 = local41.toArray();
		@Pc(78) IOException_Sub1 local78 = null;
		@Pc(80) Object[] local80 = local76;
		for (@Pc(82) int local82 = 0; local82 < local80.length; local82++) {
			@Pc(90) Object local90 = local80[local82];
			@Pc(93) Proxy local93 = (Proxy) local90;
			try {
				@Pc(98) Socket local98 = this.method14645(local93);
				if (local98 != null) {
					return local98;
				}
			} catch (@Pc(105) IOException_Sub1 local105) {
				local78 = local105;
			} catch (@Pc(109) IOException local109) {
			}
		}
		if (local78 != null) {
			throw local78;
		}
		return this.method14638();
	}

	@OriginalMember(owner = "client!ajq", name = "b", descriptor = "(Ljava/net/Proxy;I)Ljava/net/Socket;", line = 59)
	Socket method14645(@OriginalArg(0) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method14638();
		}
		@Pc(10) SocketAddress local10 = arg0.address();
		if (!(local10 instanceof InetSocketAddress)) {
			return null;
		}
		@Pc(18) InetSocketAddress local18 = (InetSocketAddress) local10;
		if (arg0.type() == Type.HTTP) {
			@Pc(24) String local24 = null;
			try {
				@Pc(27) Class local27 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
				@Pc(41) Method local41 = local27.getDeclaredMethod("getProxyAuth", String.class, Integer.TYPE);
				local41.setAccessible(true);
				@Pc(63) Object local63 = local41.invoke(null, local18.getHostName(), Integer.valueOf(local18.getPort()));
				if (local63 != null) {
					@Pc(71) Method local71 = local27.getDeclaredMethod("supportsPreemptiveAuthorization");
					local71.setAccessible(true);
					if ((Boolean) local71.invoke(local63)) {
						@Pc(88) Method local88 = local27.getDeclaredMethod("getHeaderName");
						local88.setAccessible(true);
						@Pc(105) Method local105 = local27.getDeclaredMethod("getHeaderValue", URL.class, String.class);
						local105.setAccessible(true);
						@Pc(115) String local115 = (String) local88.invoke(local63);
						@Pc(143) String local143 = (String) local105.invoke(local63, new URL("https://" + this.aString69 + "/"), "https");
						local24 = local115 + ": " + local143;
					}
				}
			} catch (@Pc(156) Exception local156) {
			}
			return this.method14646(local18.getHostName(), local18.getPort(), local24);
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(174) Socket local174 = new Socket(arg0);
			local174.connect(new InetSocketAddress(this.aString69, this.anInt2085 * -1214188461));
			return local174;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ajq", name = "z", descriptor = "(Ljava/net/Proxy;)Ljava/net/Socket;", line = 59)
	Socket method14647(@OriginalArg(0) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method14638();
		}
		@Pc(10) SocketAddress local10 = arg0.address();
		if (!(local10 instanceof InetSocketAddress)) {
			return null;
		}
		@Pc(18) InetSocketAddress local18 = (InetSocketAddress) local10;
		if (arg0.type() == Type.HTTP) {
			@Pc(24) String local24 = null;
			try {
				@Pc(27) Class local27 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
				@Pc(41) Method local41 = local27.getDeclaredMethod("getProxyAuth", String.class, Integer.TYPE);
				local41.setAccessible(true);
				@Pc(63) Object local63 = local41.invoke(null, local18.getHostName(), Integer.valueOf(local18.getPort()));
				if (local63 != null) {
					@Pc(71) Method local71 = local27.getDeclaredMethod("supportsPreemptiveAuthorization");
					local71.setAccessible(true);
					if ((Boolean) local71.invoke(local63)) {
						@Pc(88) Method local88 = local27.getDeclaredMethod("getHeaderName");
						local88.setAccessible(true);
						@Pc(105) Method local105 = local27.getDeclaredMethod("getHeaderValue", URL.class, String.class);
						local105.setAccessible(true);
						@Pc(115) String local115 = (String) local88.invoke(local63);
						@Pc(143) String local143 = (String) local105.invoke(local63, new URL("https://" + this.aString69 + "/"), "https");
						local24 = local115 + ": " + local143;
					}
				}
			} catch (@Pc(156) Exception local156) {
			}
			return this.method14646(local18.getHostName(), local18.getPort(), local24);
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(174) Socket local174 = new Socket(arg0);
			local174.connect(new InetSocketAddress(this.aString69, this.anInt2085 * -1214188461));
			return local174;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ajq", name = "c", descriptor = "(Ljava/lang/String;ILjava/lang/String;B)Ljava/net/Socket;", line = 97)
	Socket method14646(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString69 + ":" + this.anInt2085 * -1214188461 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString69 + ":" + this.anInt2085 * -1214188461 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
		}
		local11.flush();
		@Pc(75) BufferedReader local75 = new BufferedReader(new InputStreamReader(local5.getInputStream()));
		@Pc(78) String local78 = local75.readLine();
		if (local78 != null) {
			if (local78.startsWith("HTTP/1.0 200") || local78.startsWith("HTTP/1.1 200")) {
				return local5;
			}
			if (local78.startsWith("HTTP/1.0 407") || local78.startsWith("HTTP/1.1 407")) {
				@Pc(100) int local100 = 0;
				@Pc(102) String local102 = "proxy-authenticate: ";
				local78 = local75.readLine();
				while (local78 != null && local100 < 50) {
					if (local78.toLowerCase().startsWith(local102)) {
						local78 = local78.substring(local102.length()).trim();
						@Pc(126) int local126 = local78.indexOf(32);
						if (local126 != -1) {
							local78 = local78.substring(0, local126);
						}
						throw new IOException_Sub1(local78);
					}
					local78 = local75.readLine();
					local100++;
				}
				throw new IOException_Sub1("");
			}
		}
		local11.close();
		local75.close();
		local5.close();
		return null;
	}

	@OriginalMember(owner = "client!ajq", name = "j", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;", line = 97)
	Socket method14648(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString69 + ":" + this.anInt2085 * -1214188461 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString69 + ":" + this.anInt2085 * -1214188461 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
		}
		local11.flush();
		@Pc(75) BufferedReader local75 = new BufferedReader(new InputStreamReader(local5.getInputStream()));
		@Pc(78) String local78 = local75.readLine();
		if (local78 != null) {
			if (local78.startsWith("HTTP/1.0 200") || local78.startsWith("HTTP/1.1 200")) {
				return local5;
			}
			if (local78.startsWith("HTTP/1.0 407") || local78.startsWith("HTTP/1.1 407")) {
				@Pc(100) int local100 = 0;
				@Pc(102) String local102 = "proxy-authenticate: ";
				local78 = local75.readLine();
				while (local78 != null && local100 < 50) {
					if (local78.toLowerCase().startsWith(local102)) {
						local78 = local78.substring(local102.length()).trim();
						@Pc(126) int local126 = local78.indexOf(32);
						if (local126 != -1) {
							local78 = local78.substring(0, local126);
						}
						throw new IOException_Sub1(local78);
					}
					local78 = local75.readLine();
					local100++;
				}
				throw new IOException_Sub1("");
			}
		}
		local11.close();
		local75.close();
		local5.close();
		return null;
	}

	@OriginalMember(owner = "client!ajq", name = "fd", descriptor = "(Lclient!vs;I)V", line = 5018)
	static final void method14649(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class329.method26168(local11, local14, arg0);
	}
}
