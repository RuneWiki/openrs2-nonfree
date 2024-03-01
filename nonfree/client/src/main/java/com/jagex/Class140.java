package com.jagex;

import java.net.InetAddress;
import java.net.UnknownHostException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public class Class140 implements Runnable {

	@OriginalMember(owner = "client!e", name = "kd", descriptor = "I")
	static int anInt3424;

	@OriginalMember(owner = "client!e", name = "oh", descriptor = "I")
	public static int anInt3425;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "Ljava/lang/String;")
	volatile String aString162;

	@OriginalMember(owner = "client!e", name = "p", descriptor = "Ljava/net/InetAddress;")
	InetAddress anInetAddress1;

	@OriginalMember(owner = "client!e", name = "p", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;", line = 9)
	public static String method23023(@OriginalArg(0) String arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			@Pc(13) char local13 = arg0.charAt(local6);
			if (local13 == '<' || local13 == '>') {
				local4 += 3;
			}
		}
		@Pc(29) StringBuilder local29 = new StringBuilder(local2 + local4);
		for (@Pc(31) int local31 = 0; local31 < local2; local31++) {
			@Pc(38) char local38 = arg0.charAt(local31);
			if (local38 == '<') {
				local29.append("<lt>");
			} else if (local38 == '>') {
				local29.append("<gt>");
			} else {
				local29.append(local38);
			}
		}
		return local29.toString();
	}

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(I)V", line = 10)
	Class140(@OriginalArg(0) int arg0) throws UnknownHostException {
		this.anInetAddress1 = InetAddress.getByAddress(new byte[] { (byte) (arg0 >> 24 & 0xFF), (byte) (arg0 >> 16 & 0xFF), (byte) (arg0 >> 8 & 0xFF), (byte) (arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!e", name = "p", descriptor = "(I)Ljava/lang/String;", line = 15)
	public String method23015() {
		return this.aString162;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "()Ljava/lang/String;", line = 15)
	public String method23018() {
		return this.aString162;
	}

	@OriginalMember(owner = "client!e", name = "g", descriptor = "()Ljava/lang/String;", line = 15)
	public String method23019() {
		return this.aString162;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([SI)[S", line = 16)
	public static short[] method23022(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(7) short[] local7 = new short[arg0.length];
			System.arraycopy(arg0, 0, local7, 0, arg0.length);
			return local7;
		}
	}

	@OriginalMember(owner = "client!e", name = "j", descriptor = "()V", line = 19)
	public void method23016() {
		this.aString162 = this.anInetAddress1.getHostName();
	}

	@OriginalMember(owner = "client!e", name = "run", descriptor = "()V", line = 19)
	@Override
	public void run() {
		this.aString162 = this.anInetAddress1.getHostName();
	}

	@OriginalMember(owner = "client!e", name = "n", descriptor = "()V", line = 19)
	public void method23017() {
		this.aString162 = this.anInetAddress1.getHostName();
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II)Lclient!ga;", line = 24)
	public static Class191 method23020(@OriginalArg(0) int arg0) {
		@Pc(2) Class191[] local2 = Class414.method27751();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class191 local12 = local2[local4];
			if (arg0 == local12.anInt3679 * -356338717) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!e", name = "wr", descriptor = "(Lclient!vs;S)V", line = 8182)
	static final void method23021(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(26) String local26 = (String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		if (local12 == -1) {
			throw new RuntimeException();
		}
		@Pc(38) Class574 local38 = Class438.aClass589_1.method33297(local12);
		if (local38.aChar14 != 's') {
			throw new RuntimeException();
		}
		@Pc(51) int[] local51 = local38.method33085(local26);
		@Pc(53) int local53 = 0;
		if (local51 != null) {
			local53 = local51.length;
		}
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local53;
	}
}
