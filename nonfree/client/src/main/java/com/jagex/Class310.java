package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hv")
public class Class310 {

	@OriginalMember(owner = "client!hv", name = "p", descriptor = "Lclient!hg;")
	static Class298 aClass298_1;

	@OriginalMember(owner = "client!hv", name = "ip", descriptor = "Lclient!cn;")
	public static Interface17 anInterface17_4;

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "()V", line = 9)
	Class310() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!hv", name = "p", descriptor = "(ILclient!hk;Lclient!akv;I)Lclient!arg;", line = 13)
	public static Class77_Sub1_Sub12 method27277(@OriginalArg(0) int arg0, @OriginalArg(1) Class301 arg1, @OriginalArg(2) Class77_Sub39 arg2) {
		if (Class301.aClass301_2 == arg1) {
			return new Class77_Sub1_Sub12_Sub2(arg0, arg2);
		} else if (Class301.aClass301_1 == arg1) {
			return new Class77_Sub1_Sub12_Sub1(arg0, arg2);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hv", name = "y", descriptor = "(Lclient!hg;)V", line = 14)
	public static void method27278(@OriginalArg(0) Class298 arg0) {
		aClass298_1 = arg0;
	}

	@OriginalMember(owner = "client!hv", name = "w", descriptor = "(Lclient!hg;)V", line = 14)
	public static void method27279(@OriginalArg(0) Class298 arg0) {
		aClass298_1 = arg0;
	}

	@OriginalMember(owner = "client!hv", name = "t", descriptor = "(Lclient!akv;Ljava/lang/String;)I", line = 18)
	public static int method27280(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) String arg1) {
		@Pc(4) int local4 = arg0.anInt3089 * 31645619;
		@Pc(8) byte[] local8 = Class398.method28451(arg1);
		arg0.method22471(local8.length);
		arg0.anInt3089 += aClass298_1.method27057(local8, 0, local8.length, arg0.aByteArray53, arg0.anInt3089 * 31645619) * -1387468933;
		return arg0.anInt3089 * 31645619 - local4;
	}

	@OriginalMember(owner = "client!hv", name = "q", descriptor = "(Lclient!akv;Ljava/lang/String;)I", line = 18)
	public static int method27281(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) String arg1) {
		@Pc(4) int local4 = arg0.anInt3089 * 31645619;
		@Pc(8) byte[] local8 = Class398.method28451(arg1);
		arg0.method22471(local8.length);
		arg0.anInt3089 += aClass298_1.method27057(local8, 0, local8.length, arg0.aByteArray53, arg0.anInt3089 * 31645619) * -1387468933;
		return arg0.anInt3089 * 31645619 - local4;
	}

	@OriginalMember(owner = "client!hv", name = "d", descriptor = "(Lclient!akv;)Ljava/lang/String;", line = 26)
	public static String method27282(@OriginalArg(0) Class77_Sub39 arg0) {
		return Class118_Sub2.method10265(arg0, 32767);
	}

	@OriginalMember(owner = "client!hv", name = "x", descriptor = "(Lclient!akv;)Ljava/lang/String;", line = 26)
	public static String method27283(@OriginalArg(0) Class77_Sub39 arg0) {
		return Class118_Sub2.method10265(arg0, 32767);
	}

	@OriginalMember(owner = "client!hv", name = "r", descriptor = "(Lclient!akv;I)Ljava/lang/String;", line = 31)
	static String method27284(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) int local3 = arg0.method22537();
			if (local3 > arg1) {
				local3 = arg1;
			}
			@Pc(11) byte[] local11 = new byte[local3];
			arg0.anInt3089 += aClass298_1.method27060(arg0.aByteArray53, arg0.anInt3089 * 31645619, local11, 0, local3) * -1387468933;
			return Class386.method28347(local11, 0, local3);
		} catch (@Pc(39) Exception local39) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!hv", name = "s", descriptor = "(Lclient!akv;I)Ljava/lang/String;", line = 31)
	static String method27285(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) int local3 = arg0.method22537();
			if (local3 > arg1) {
				local3 = arg1;
			}
			@Pc(11) byte[] local11 = new byte[local3];
			arg0.anInt3089 += aClass298_1.method27060(arg0.aByteArray53, arg0.anInt3089 * 31645619, local11, 0, local3) * -1387468933;
			return Class386.method28347(local11, 0, local3);
		} catch (@Pc(39) Exception local39) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!hv", name = "ns", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;B)V", line = 6933)
	static final void method27286(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5781 -= 1460193483) * 1485266147];
		if (Class139.method14334(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray32 = Class73.method1040(local13, arg2);
		arg0.aBoolean681 = true;
	}

	@OriginalMember(owner = "client!hv", name = "adq", descriptor = "(Lclient!yf;B)V", line = 9708)
	static final void method27287(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = Integer.toString(local12);
	}

	@OriginalMember(owner = "client!hv", name = "anc", descriptor = "(Lclient!yf;I)V", line = 11928)
	static final void method27288(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class589.anInt5457 * -1802869663;
	}
}
