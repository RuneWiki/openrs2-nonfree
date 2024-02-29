package com.jagex;

import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akp")
public class Class139_Sub1 extends Class139 {

	@OriginalMember(owner = "client!akp", name = "p", descriptor = "Ljava/net/Socket;")
	Socket aSocket1;

	@OriginalMember(owner = "client!akp", name = "c", descriptor = "Lclient!ts;")
	Class562 aClass562_1;

	@OriginalMember(owner = "client!akp", name = "v", descriptor = "Lclient!tw;")
	Class565 aClass565_1;

	@OriginalMember(owner = "client!akp", name = "<init>", descriptor = "(Ljava/net/Socket;I)V", line = 12)
	Class139_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.aSocket1.setReceiveBufferSize(65536);
		this.aSocket1.setSendBufferSize(65536);
		this.aClass562_1 = new Class562(this.aSocket1.getInputStream(), arg1);
		this.aClass565_1 = new Class565(this.aSocket1.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!akp", name = "c", descriptor = "(IB)Z", line = 23)
	@Override
	public boolean method14347(@OriginalArg(0) int arg0) throws IOException {
		return this.aClass562_1.method31309(arg0);
	}

	@OriginalMember(owner = "client!akp", name = "q", descriptor = "(I)Z", line = 23)
	@Override
	public boolean method14355(@OriginalArg(0) int arg0) throws IOException {
		return this.aClass562_1.method31309(arg0);
	}

	@OriginalMember(owner = "client!akp", name = "v", descriptor = "(I)I", line = 27)
	@Override
	public int method14340() throws IOException {
		return this.aClass562_1.method31310();
	}

	@OriginalMember(owner = "client!akp", name = "b", descriptor = "()I", line = 27)
	@Override
	public int method14356() throws IOException {
		return this.aClass562_1.method31310();
	}

	@OriginalMember(owner = "client!akp", name = "s", descriptor = "([BII)I", line = 31)
	@Override
	public int method14354(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		return this.aClass562_1.method31313(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!akp", name = "d", descriptor = "([BII)I", line = 31)
	@Override
	public int method14346(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		return this.aClass562_1.method31313(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!akp", name = "l", descriptor = "([BIIB)I", line = 31)
	@Override
	public int method14339(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		return this.aClass562_1.method31313(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!akp", name = "x", descriptor = "([BII)I", line = 31)
	@Override
	public int method14338(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		return this.aClass562_1.method31313(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!akp", name = "y", descriptor = "([BIII)V", line = 35)
	@Override
	public void method14341(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass565_1.method31347(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!akp", name = "r", descriptor = "([BII)V", line = 35)
	@Override
	public void method14348(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass565_1.method31347(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!akp", name = "w", descriptor = "(I)V", line = 39)
	@Override
	public void method14345() {
		this.aClass565_1.method31351();
		try {
			this.aSocket1.close();
		} catch (@Pc(8) IOException local8) {
		}
		this.aClass562_1.method31317();
	}

	@OriginalMember(owner = "client!akp", name = "z", descriptor = "()V", line = 39)
	@Override
	public void method14350() {
		this.aClass565_1.method31351();
		try {
			this.aSocket1.close();
		} catch (@Pc(8) IOException local8) {
		}
		this.aClass562_1.method31317();
	}

	@OriginalMember(owner = "client!akp", name = "j", descriptor = "()V", line = 39)
	@Override
	public void method14351() {
		this.aClass565_1.method31351();
		try {
			this.aSocket1.close();
		} catch (@Pc(8) IOException local8) {
		}
		this.aClass562_1.method31317();
	}

	@OriginalMember(owner = "client!akp", name = "i", descriptor = "()V", line = 39)
	@Override
	public void method14352() {
		this.aClass565_1.method31351();
		try {
			this.aSocket1.close();
		} catch (@Pc(8) IOException local8) {
		}
		this.aClass562_1.method31317();
	}

	@OriginalMember(owner = "client!akp", name = "g", descriptor = "()V", line = 39)
	@Override
	public void method14349() {
		this.aClass565_1.method31351();
		try {
			this.aSocket1.close();
		} catch (@Pc(8) IOException local8) {
		}
		this.aClass562_1.method31317();
	}

	@OriginalMember(owner = "client!akp", name = "t", descriptor = "(B)V", line = 48)
	@Override
	public void method14343() {
		this.aClass562_1.method31321();
		this.aClass565_1.method31352();
	}

	@OriginalMember(owner = "client!akp", name = "e", descriptor = "()V", line = 48)
	@Override
	public void method14344() {
		this.aClass562_1.method31321();
		this.aClass565_1.method31352();
	}

	@OriginalMember(owner = "client!akp", name = "k", descriptor = "()V", line = 48)
	@Override
	public void method14353() {
		this.aClass562_1.method31321();
		this.aClass565_1.method31352();
	}

	@OriginalMember(owner = "client!akp", name = "u", descriptor = "()V", line = 48)
	@Override
	public void method14342() {
		this.aClass562_1.method31321();
		this.aClass565_1.method31352();
	}

	@OriginalMember(owner = "client!akp", name = "hd", descriptor = "()V", line = 53)
	void method14357() {
		this.method14345();
	}

	@OriginalMember(owner = "client!akp", name = "hc", descriptor = "()V", line = 53)
	void method14358() {
		this.method14345();
	}

	@OriginalMember(owner = "client!akp", name = "hp", descriptor = "()V", line = 53)
	void method14359() {
		this.method14345();
	}

	@OriginalMember(owner = "client!akp", name = "finalize", descriptor = "()V", line = 53)
	@Override
	void finalize() {
		this.method14345();
	}
}
