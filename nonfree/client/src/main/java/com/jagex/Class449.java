package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public class Class449 implements Interface56 {

	@OriginalMember(owner = "client!sb", name = "tj", descriptor = "I")
	public static int anInt5013;

	@OriginalMember(owner = "client!sb", name = "p", descriptor = "Lclient!sb;")
	static final Class449 aClass449_1 = new Class449(0);

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "Lclient!sb;")
	static final Class449 aClass449_2 = new Class449(1);

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "Lclient!sb;")
	public static final Class449 aClass449_3 = new Class449(2);

	@OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
	final int anInt5012;

	@OriginalMember(owner = "client!sb", name = "u", descriptor = "()[Lclient!sb;", line = 14)
	static Class449[] method28373() {
		return new Class449[] { aClass449_1, aClass449_3, aClass449_2 };
	}

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "()[Lclient!sb;", line = 14)
	static Class449[] method28374() {
		return new Class449[] { aClass449_1, aClass449_3, aClass449_2 };
	}

	@OriginalMember(owner = "client!sb", name = "s", descriptor = "()[Lclient!sb;", line = 14)
	static Class449[] method28375() {
		return new Class449[] { aClass449_1, aClass449_3, aClass449_2 };
	}

	@OriginalMember(owner = "client!sb", name = "y", descriptor = "()[Lclient!sb;", line = 14)
	static Class449[] method28376() {
		return new Class449[] { aClass449_1, aClass449_3, aClass449_2 };
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "()[Lclient!sb;", line = 14)
	static Class449[] method28377() {
		return new Class449[] { aClass449_1, aClass449_3, aClass449_2 };
	}

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(I)V", line = 17)
	Class449(@OriginalArg(0) int arg0) {
		this.anInt5012 = arg0 * -1969499501;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)I", line = 22)
	@Override
	public int method33765() {
		return this.anInt5012 * -1761207397;
	}

	@OriginalMember(owner = "client!sb", name = "l", descriptor = "()I", line = 22)
	@Override
	public int method33767() {
		return this.anInt5012 * -1761207397;
	}

	@OriginalMember(owner = "client!sb", name = "x", descriptor = "()I", line = 22)
	@Override
	public int method33764() {
		return this.anInt5012 * -1761207397;
	}

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "()I", line = 22)
	@Override
	public int method33766() {
		return this.anInt5012 * -1761207397;
	}

	@OriginalMember(owner = "client!sb", name = "l", descriptor = "(II)Z", line = 48)
	public static boolean method28381(@OriginalArg(0) int arg0) {
		return (arg0 & -arg0) == arg0;
	}

	@OriginalMember(owner = "client!sb", name = "s", descriptor = "(Lclient!zz;IILclient!act;II)V", line = 261)
	public static void method28378(@OriginalArg(0) Class634 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class26_Sub1_Sub1_Sub1 arg3, @OriginalArg(4) int arg4) {
		@Pc(2) Class536 local2 = Class27.method15271();
		local2.aClass26_Sub1_Sub1_Sub1_4 = arg3;
		local2.anInt5314 = arg4 * -456946049;
		Class316.method25839(arg0, arg1, arg2, local2);
		local2.aClass26_Sub1_Sub1_Sub1_4 = null;
		local2.anInt5314 = 456946049;
	}

	@OriginalMember(owner = "client!sb", name = "lb", descriptor = "(Lclient!vs;I)V", line = 6218)
	static final void method28379(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class456.method28483(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!sb", name = "aox", descriptor = "(Lclient!vs;B)V", line = 11531)
	static final void method28380(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub4_1.method12894() == 1 ? 1 : 0;
	}
}
