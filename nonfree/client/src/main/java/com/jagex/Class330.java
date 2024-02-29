package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!is")
public class Class330 {

	@OriginalMember(owner = "client!is", name = "r", descriptor = "J")
	static long aLong258;

	@OriginalMember(owner = "client!is", name = "af", descriptor = "I")
	public static int anInt4096;

	@OriginalMember(owner = "client!is", name = "p", descriptor = "Lclient!is;")
	static final Class330 aClass330_5 = new Class330(0, true);

	@OriginalMember(owner = "client!is", name = "c", descriptor = "Lclient!is;")
	static final Class330 aClass330_3 = new Class330(1, true);

	@OriginalMember(owner = "client!is", name = "v", descriptor = "Lclient!is;")
	static final Class330 aClass330_4 = new Class330(2, false);

	@OriginalMember(owner = "client!is", name = "l", descriptor = "I")
	int anInt4095;

	@OriginalMember(owner = "client!is", name = "y", descriptor = "Z")
	boolean aBoolean707;

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "(IZ)V", line = 10)
	Class330(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.anInt4095 = arg0 * -821778883;
		this.aBoolean707 = arg1;
	}

	@OriginalMember(owner = "client!is", name = "v", descriptor = "(I)Lclient!is;", line = 16)
	public static Class330 method27591(@OriginalArg(0) int arg0) {
		if (aClass330_5.anInt4095 * 1266327829 == arg0) {
			return aClass330_5;
		} else if (arg0 == aClass330_3.anInt4095 * 1266327829) {
			return aClass330_3;
		} else if (arg0 == aClass330_4.anInt4095 * 1266327829) {
			return aClass330_4;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!is", name = "c", descriptor = "(I)Lclient!is;", line = 16)
	public static Class330 method27592(@OriginalArg(0) int arg0) {
		if (aClass330_5.anInt4095 * 1266327829 == arg0) {
			return aClass330_5;
		} else if (arg0 == aClass330_3.anInt4095 * 1266327829) {
			return aClass330_3;
		} else if (arg0 == aClass330_4.anInt4095 * 1266327829) {
			return aClass330_4;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!is", name = "l", descriptor = "(CB)Z", line = 29)
	public static final boolean method27593(@OriginalArg(0) char arg0) {
		return arg0 >= '!' && arg0 < '0' || arg0 >= ':' && arg0 <= '@' && arg0 != '<' || arg0 >= '[' && arg0 <= '_' || arg0 >= '{';
	}

	@OriginalMember(owner = "client!is", name = "gt", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;S)V", line = 5595)
	static final void method27594(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg2.anInt5784 -= 926998689;
		@Pc(13) int local13 = arg2.anIntArray536[arg2.anInt5784 * 2088438307];
		@Pc(24) short local24 = (short) arg2.anIntArray536[arg2.anInt5784 * 2088438307 + 1];
		@Pc(35) short local35 = (short) arg2.anIntArray536[arg2.anInt5784 * 2088438307 + 2];
		if (local13 < 0 || local13 >= 5) {
			return;
		}
		arg0.method26655(local13, local24, local35);
		Class461.method29531(arg0);
		if (arg0.anInt3927 * 1365669833 == -1 && !arg1.aBoolean662) {
			Class243.method26074(arg0.anInt3863 * -1278450723, local13);
		}
	}

	@OriginalMember(owner = "client!is", name = "ov", descriptor = "(Lclient!yf;I)V", line = 7086)
	static final void method27595(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class110_Sub1.method9164(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!is", name = "apm", descriptor = "(Lclient!yf;I)V", line = 12187)
	static final void method27596(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub5_1, local12);
		Class667.method33150();
		client.aBoolean593 = false;
	}

	@OriginalMember(owner = "client!is", name = "avw", descriptor = "(Lclient!yf;I)V", line = 13184)
	static final void method27597(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub23_1.method15761() ? 1 : 0;
	}
}
