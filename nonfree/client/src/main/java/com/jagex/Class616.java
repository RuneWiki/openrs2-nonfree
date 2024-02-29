package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public class Class616 {

	@OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
	static final int anInt5590 = 2;

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
	static final int anInt5591 = 1;

	@OriginalMember(owner = "client!wf", name = "v", descriptor = "I")
	static final int anInt5592 = -1;

	@OriginalMember(owner = "client!wf", name = "y", descriptor = "[Lclient!alh;")
	static Class145_Sub1[] aClass145_Sub1Array2;

	@OriginalMember(owner = "client!wf", name = "w", descriptor = "I")
	public static int anInt5593;

	@OriginalMember(owner = "client!wf", name = "t", descriptor = "I")
	public static int anInt5594;

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
	public static int anInt5595;

	@OriginalMember(owner = "client!wf", name = "l", descriptor = "Z")
	static boolean aBoolean839 = false;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V", line = 17)
	Class616() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!wf", name = "y", descriptor = "(I)Lclient!alh;", line = 22)
	public static Class145_Sub1 method32356(@OriginalArg(0) int arg0) {
		return aBoolean839 && arg0 >= anInt5593 * 206492647 && arg0 <= anInt5594 * -1664594981 ? aClass145_Sub1Array2[arg0 - anInt5593 * 206492647] : null;
	}

	@OriginalMember(owner = "client!wf", name = "w", descriptor = "(I)Lclient!alh;", line = 22)
	public static Class145_Sub1 method32357(@OriginalArg(0) int arg0) {
		return aBoolean839 && arg0 >= anInt5593 * 206492647 && arg0 <= anInt5594 * -1664594981 ? aClass145_Sub1Array2[arg0 - anInt5593 * 206492647] : null;
	}

	@OriginalMember(owner = "client!wf", name = "t", descriptor = "([B)Z", line = 27)
	public static boolean method32358(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class77_Sub39 local4 = new Class77_Sub39(arg0);
		@Pc(8) int local8 = local4.method22478();
		if (local8 != 2) {
			return false;
		}
		@Pc(22) boolean local22 = local4.method22478() == 1;
		if (local22) {
			Class683.method36095(local4);
		}
		Class680.method36067(local4);
		return true;
	}

	@OriginalMember(owner = "client!wf", name = "q", descriptor = "([B)Z", line = 27)
	public static boolean method32359(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class77_Sub39 local4 = new Class77_Sub39(arg0);
		@Pc(8) int local8 = local4.method22478();
		if (local8 != 2) {
			return false;
		}
		@Pc(22) boolean local22 = local4.method22478() == 1;
		if (local22) {
			Class683.method36095(local4);
		}
		Class680.method36067(local4);
		return true;
	}

	@OriginalMember(owner = "client!wf", name = "x", descriptor = "([B)Z", line = 27)
	public static boolean method32360(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class77_Sub39 local4 = new Class77_Sub39(arg0);
		@Pc(8) int local8 = local4.method22478();
		if (local8 != 2) {
			return false;
		}
		@Pc(22) boolean local22 = local4.method22478() == 1;
		if (local22) {
			Class683.method36095(local4);
		}
		Class680.method36067(local4);
		return true;
	}

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "(Lclient!akv;)V", line = 37)
	static void method32361(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(3) int local3 = arg0.method22537();
		Class338.aClass606Array1 = new Class606[local3];
		@Pc(8) int local8;
		for (local8 = 0; local8 < local3; local8++) {
			Class338.aClass606Array1[local8] = new Class606();
			Class338.aClass606Array1[local8].anInt5563 = arg0.method22537() * -1175230789;
			Class338.aClass606Array1[local8].aString237 = arg0.method22526();
		}
		anInt5593 = arg0.method22537() * 90345431;
		anInt5594 = arg0.method22537() * 952023123;
		Class544.anInt5212 = arg0.method22537() * -377175777;
		aClass145_Sub1Array2 = new Class145_Sub1[anInt5594 * -1664594981 - anInt5593 * 206492647 + 1];
		for (local8 = 0; local8 < Class544.anInt5212 * 1699576543; local8++) {
			@Pc(75) int local75 = arg0.method22537();
			@Pc(83) Class145_Sub1 local83 = aClass145_Sub1Array2[local75] = new Class145_Sub1();
			local83.anInt2064 = arg0.method22478() * -1901546263;
			local83.anInt2063 = arg0.method22500() * -410670017;
			local83.anInt2067 = arg0.method22537() * 75958393;
			if (local83.anInt2067 * 231268809 != 0) {
				local83.aString62 = arg0.method22526();
			}
			local83.anInt2068 = (local75 + anInt5593 * 206492647) * -446830881;
			local83.aString61 = arg0.method22526();
			local83.aString60 = arg0.method22526();
		}
		anInt5595 = arg0.method22500() * 482540011;
		aBoolean839 = true;
	}

	@OriginalMember(owner = "client!wf", name = "s", descriptor = "(Lclient!akv;)V", line = 66)
	static void method32362(@OriginalArg(0) Class77_Sub39 arg0) {
		for (@Pc(1) int local1 = 0; local1 < Class544.anInt5212 * 1699576543; local1++) {
			@Pc(10) int local10 = arg0.method22537();
			@Pc(14) int local14 = arg0.method22483();
			if (local14 == 65535) {
				local14 = -1;
			}
			if (aClass145_Sub1Array2[local10] != null) {
				aClass145_Sub1Array2[local10].anInt2059 = local14 * 734920847;
			}
		}
	}

	@OriginalMember(owner = "client!wf", name = "v", descriptor = "(B)I", line = 74)
	public static int method32363() {
		@Pc(2) Class39_Sub1 local2 = Class605.method32076();
		Class547.method30971(local2);
		return local2.method14282();
	}

	@OriginalMember(owner = "client!wf", name = "ak", descriptor = "(B)V", line = 462)
	static void method32364() {
		if (Class574.aClass83_36 != null && Class574.aClass83_36.method18169() == Class574.aTwitchWebcamFrameData1.width && Class574.aClass83_36.method18171() == Class574.aTwitchWebcamFrameData1.height) {
			Class574.aClass83_36.method18174(0, 0, Class574.aTwitchWebcamFrameData1.width, Class574.aTwitchWebcamFrameData1.height, Class574.aTwitchWebcamFrameData1.buffer, 0, Class574.aTwitchWebcamFrameData1.width);
		} else {
			Class574.aClass83_36 = Class284.aClass86_9.method20103(Class574.aTwitchWebcamFrameData1.buffer, 0, Class574.aTwitchWebcamFrameData1.width, Class574.aTwitchWebcamFrameData1.width, Class574.aTwitchWebcamFrameData1.height, false);
		}
	}

	@OriginalMember(owner = "client!wf", name = "gr", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 5573)
	static final void method32365(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		@Pc(12) int local12 = arg2.anIntArray536[(arg2.anInt5784 -= 308999563) * 2088438307];
		@Pc(26) String local26 = (String) arg2.anObjectArray45[(arg2.anInt5781 -= 1460193483) * 1485266147];
		@Pc(32) Class67 local32 = (Class67) Class77_Sub13_Sub12.aClass35_Sub22_1.method18319(local12);
		if (local32.aString13.equals(local26)) {
			arg0.method26650(local12);
		} else {
			arg0.method26647(local12, local26);
		}
	}

	@OriginalMember(owner = "client!wf", name = "tq", descriptor = "(Lclient!yf;I)V", line = 8100)
	static final void method32366(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(18) Class77_Sub20 local18 = Class365.method28132(Class414.aClass414_62, client.aClass82_2.aClass16_1);
		local18.aClass77_Sub39_Sub1_2.method22408(local12);
		client.aClass82_2.method2004(local18);
	}

	@OriginalMember(owner = "client!wf", name = "afn", descriptor = "(Lclient!yf;B)V", line = 10392)
	static final void method32367(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 308999563;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class67.method970(local13);
	}

	@OriginalMember(owner = "client!wf", name = "apx", descriptor = "(Lclient!yf;S)V", line = 12278)
	static final void method32368(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		if (local12 > 255 || local12 < 0) {
			local12 = 0;
		}
		if (local12 != Class35_Sub6.aClass77_Sub35_45.aClass143_Sub43_1.method16275()) {
			Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub43_1, local12);
			Class667.method33150();
			client.aBoolean593 = false;
		}
	}
}
