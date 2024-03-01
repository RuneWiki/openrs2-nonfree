package com.jagex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahm")
public class Class62_Sub1 extends Class62 {

	@OriginalMember(owner = "client!ahm", name = "p", descriptor = "Ljava/net/Socket;")
	Socket aSocket1;

	@OriginalMember(owner = "client!ahm", name = "a", descriptor = "Lclient!qm;")
	Class411 aClass411_1;

	@OriginalMember(owner = "client!ahm", name = "g", descriptor = "Lclient!qr;")
	Class416 aClass416_1;

	@OriginalMember(owner = "client!ahm", name = "<init>", descriptor = "(Ljava/net/Socket;I)V", line = 12)
	Class62_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.aClass411_1 = new Class411(this.aSocket1.getInputStream(), arg1);
		this.aClass416_1 = new Class416(this.aSocket1.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!ahm", name = "a", descriptor = "(II)Z", line = 21)
	@Override
	public boolean method12856(@OriginalArg(0) int arg0) throws IOException {
		return this.aClass411_1.method27692(arg0);
	}

	@OriginalMember(owner = "client!ahm", name = "u", descriptor = "(I)Z", line = 21)
	@Override
	public boolean method12852(@OriginalArg(0) int arg0) throws IOException {
		return this.aClass411_1.method27692(arg0);
	}

	@OriginalMember(owner = "client!ahm", name = "b", descriptor = "()I", line = 25)
	@Override
	public int method12854() throws IOException {
		return this.aClass411_1.method27679();
	}

	@OriginalMember(owner = "client!ahm", name = "y", descriptor = "()I", line = 25)
	@Override
	public int method12851() throws IOException {
		return this.aClass411_1.method27679();
	}

	@OriginalMember(owner = "client!ahm", name = "g", descriptor = "(I)I", line = 25)
	@Override
	public int method12847() throws IOException {
		return this.aClass411_1.method27679();
	}

	@OriginalMember(owner = "client!ahm", name = "c", descriptor = "()I", line = 25)
	@Override
	public int method12855() throws IOException {
		return this.aClass411_1.method27679();
	}

	@OriginalMember(owner = "client!ahm", name = "z", descriptor = "()I", line = 25)
	@Override
	public int method12858() throws IOException {
		return this.aClass411_1.method27679();
	}

	@OriginalMember(owner = "client!ahm", name = "l", descriptor = "([BIII)I", line = 29)
	@Override
	public int method12848(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		return this.aClass411_1.method27690(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ahm", name = "j", descriptor = "([BII)I", line = 29)
	@Override
	public int method12853(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		return this.aClass411_1.method27690(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ahm", name = "h", descriptor = "([BIIB)V", line = 33)
	@Override
	public void method12846(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass416_1.method27774(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ahm", name = "r", descriptor = "([BII)V", line = 33)
	@Override
	public void method12860(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass416_1.method27774(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ahm", name = "n", descriptor = "([BII)V", line = 33)
	@Override
	public void method12849(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass416_1.method27774(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ahm", name = "e", descriptor = "([BII)V", line = 33)
	@Override
	public void method12859(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass416_1.method27774(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ahm", name = "x", descriptor = "(I)V", line = 37)
	@Override
	public void method12850() {
		this.aClass416_1.method27785();
		try {
			this.aSocket1.close();
		} catch (@Pc(8) IOException local8) {
		}
		this.aClass411_1.method27681();
	}

	@OriginalMember(owner = "client!ahm", name = "m", descriptor = "()V", line = 37)
	@Override
	public void method12863() {
		this.aClass416_1.method27785();
		try {
			this.aSocket1.close();
		} catch (@Pc(8) IOException local8) {
		}
		this.aClass411_1.method27681();
	}

	@OriginalMember(owner = "client!ahm", name = "d", descriptor = "()V", line = 37)
	@Override
	public void method12861() {
		this.aClass416_1.method27785();
		try {
			this.aSocket1.close();
		} catch (@Pc(8) IOException local8) {
		}
		this.aClass411_1.method27681();
	}

	@OriginalMember(owner = "client!ahm", name = "q", descriptor = "()V", line = 37)
	@Override
	public void method12862() {
		this.aClass416_1.method27785();
		try {
			this.aSocket1.close();
		} catch (@Pc(8) IOException local8) {
		}
		this.aClass411_1.method27681();
	}

	@OriginalMember(owner = "client!ahm", name = "v", descriptor = "()V", line = 46)
	@Override
	public void method12864() {
		this.aClass411_1.method27682();
		this.aClass416_1.method27775();
	}

	@OriginalMember(owner = "client!ahm", name = "s", descriptor = "(I)V", line = 46)
	@Override
	public void method12857() {
		this.aClass411_1.method27682();
		this.aClass416_1.method27775();
	}

	@OriginalMember(owner = "client!ahm", name = "finalize", descriptor = "()V", line = 51)
	@Override
	void finalize() {
		this.method12850();
	}

	@OriginalMember(owner = "client!ahm", name = "hh", descriptor = "()V", line = 51)
	void method12869() {
		this.method12850();
	}

	@OriginalMember(owner = "client!ahm", name = "g", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;", line = 77)
	static String method12871(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(15) String local15;
		if (arg0 instanceof RuntimeException_Sub3) {
			@Pc(5) RuntimeException_Sub3 local5 = (RuntimeException_Sub3) arg0;
			local15 = local5.aString122 + " | ";
			arg0 = local5.aThrowable1;
		} else {
			local15 = "";
		}
		@Pc(25) StringWriter local25 = new StringWriter();
		@Pc(30) PrintWriter local30 = new PrintWriter(local25);
		arg0.printStackTrace(local30);
		local30.close();
		@Pc(38) String local38 = local25.toString();
		@Pc(46) BufferedReader local46 = new BufferedReader(new StringReader(local38));
		@Pc(49) String local49 = local46.readLine();
		while (true) {
			@Pc(52) String local52 = local46.readLine();
			if (local52 == null) {
				return local15 + "| " + local49;
			}
			@Pc(60) int local60 = local52.indexOf(40);
			@Pc(67) int local67 = local52.indexOf(41, local60 + 1);
			@Pc(75) String local75;
			if (local60 == -1) {
				local75 = local52;
			} else {
				local75 = local52.substring(0, local60);
			}
			local75 = local75.trim();
			local75 = local75.substring(local75.lastIndexOf(32) + 1);
			local75 = local75.substring(local75.lastIndexOf(9) + 1);
			local15 = local15 + local75;
			if (local60 != -1 && local67 != -1) {
				@Pc(117) int local117 = local52.indexOf(".java:", local60);
				if (local117 >= 0) {
					local15 = local15 + local52.substring(local117 + 5, local67);
				}
			}
			local15 = local15 + ' ';
		}
	}

	@OriginalMember(owner = "client!ahm", name = "lh", descriptor = "(ZB)V", line = 11238)
	public static final void method12870(@OriginalArg(0) boolean arg0) {
		@Pc(5) Class3_Sub23 local5 = Class269.method25284(Class311.aClass311_76, client.aClass82_2.aClass577_2);
		client.aClass82_2.method21601(local5);
		for (@Pc(14) Class3_Sub42 local14 = (Class3_Sub42) client.aClass581_22.method33221(); local14 != null; local14 = (Class3_Sub42) client.aClass581_22.method33231()) {
			if (!local14.method33657()) {
				local14 = (Class3_Sub42) client.aClass581_22.method33221();
				if (local14 == null) {
					break;
				}
			}
			if (local14.anInt2797 * 961996397 == 0) {
				Class490.method29244(local14, true, arg0);
			}
		}
		if (client.aClass178_10 != null) {
			Class223.method24442(client.aClass178_10);
			client.aClass178_10 = null;
		}
	}
}
