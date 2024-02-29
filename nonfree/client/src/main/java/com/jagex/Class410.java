package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!my")
public class Class410 {

	@OriginalMember(owner = "client!my", name = "p", descriptor = "Lclient!my;")
	static final Class410 aClass410_12 = new Class410();

	@OriginalMember(owner = "client!my", name = "c", descriptor = "Lclient!my;")
	static final Class410 aClass410_13 = new Class410();

	@OriginalMember(owner = "client!my", name = "v", descriptor = "Lclient!my;")
	static final Class410 aClass410_14 = new Class410();

	@OriginalMember(owner = "client!my", name = "v", descriptor = "()[Lclient!my;", line = 12)
	public static Class410[] method28568() {
		return new Class410[] { aClass410_12, aClass410_13, aClass410_14 };
	}

	@OriginalMember(owner = "client!my", name = "<init>", descriptor = "()V", line = 15)
	Class410() {
	}

	@OriginalMember(owner = "client!my", name = "c", descriptor = "(III)I", line = 18)
	public int method28569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = Class149_Sub4.anInt2368 * 1771907305 > arg1 ? Class149_Sub4.anInt2368 * 1771907305 : arg1;
		if (aClass410_12 == this) {
			return 0;
		} else if (aClass410_14 == this) {
			return local10 - arg0;
		} else if (aClass410_13 == this) {
			return (local10 - arg0) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!my", name = "w", descriptor = "(II)I", line = 18)
	public int method28570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = Class149_Sub4.anInt2368 * 1771907305 > arg1 ? Class149_Sub4.anInt2368 * 1771907305 : arg1;
		if (aClass410_12 == this) {
			return 0;
		} else if (aClass410_14 == this) {
			return local10 - arg0;
		} else if (aClass410_13 == this) {
			return (local10 - arg0) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!my", name = "l", descriptor = "(II)I", line = 18)
	public int method28571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = Class149_Sub4.anInt2368 * 1771907305 > arg1 ? Class149_Sub4.anInt2368 * 1771907305 : arg1;
		if (aClass410_12 == this) {
			return 0;
		} else if (aClass410_14 == this) {
			return local10 - arg0;
		} else if (aClass410_13 == this) {
			return (local10 - arg0) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!my", name = "y", descriptor = "(II)I", line = 18)
	public int method28572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = Class149_Sub4.anInt2368 * 1771907305 > arg1 ? Class149_Sub4.anInt2368 * 1771907305 : arg1;
		if (aClass410_12 == this) {
			return 0;
		} else if (aClass410_14 == this) {
			return local10 - arg0;
		} else if (aClass410_13 == this) {
			return (local10 - arg0) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!my", name = "mv", descriptor = "(Lclient!yf;I)V", line = 6831)
	static final void method28573(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class529.method30721(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!my", name = "abm", descriptor = "(Lclient!yf;I)V", line = 9468)
	static final void method28574(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local13 - local23;
	}
}
