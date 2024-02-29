package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!adb")
public class Class75_Sub1 extends Class75 {

	@OriginalMember(owner = "client!adb", name = "gm", descriptor = "Lclient!abk;")
	public static Class35 aClass35_1;

	@OriginalMember(owner = "client!adb", name = "<init>", descriptor = "(Lclient!pd;I)V", line = 9)
	Class75_Sub1(@OriginalArg(0) Class127 arg0, @OriginalArg(1) int arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!adb", name = "q", descriptor = "(Lclient!akv;IB)V", line = 12)
	@Override
	void method1152(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!adb", name = "r", descriptor = "(Lclient!akv;I)V", line = 12)
	@Override
	void method1151(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!adb", name = "s", descriptor = "(Lclient!akv;I)V", line = 12)
	@Override
	void method1150(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!adb", name = "c", descriptor = "(I)V", line = 13)
	@Override
	public void method36034() {
	}

	@OriginalMember(owner = "client!adb", name = "w", descriptor = "()V", line = 13)
	@Override
	public void method36035() {
	}

	@OriginalMember(owner = "client!adb", name = "t", descriptor = "()V", line = 13)
	@Override
	public void method36036() {
	}

	@OriginalMember(owner = "client!adb", name = "bf", descriptor = "(IIB)B", line = 43)
	static byte method1128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == Class593.aClass593_6.anInt5501 * 847393323) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!adb", name = "c", descriptor = "(Lclient!ws;B)V", line = 51)
	public static void method1129(@OriginalArg(0) Class629 arg0) {
		Class231.anInt3762 = arg0.anInt5677 * -103344533;
		Class611.anInt5572 = arg0.anInt5688 * 1731883691;
		Class49.anInt178 = arg0.anInt5679 * -2011868781;
		Class620.anInt5628 = arg0.anInt5690 * 1072432179;
		Class149.anInt3139 = arg0.anInt5691 * -593735475;
		Class529.anInt5171 = arg0.anInt5665 * -2033390451;
		Class245.anInt3798 = arg0.anInt5672 * -687787901;
		Class611.anInt5573 = arg0.anInt5693 * -561352305;
		Class536.anInt5190 = arg0.anInt5694 * -1866109191;
		Class244.anInt3797 = arg0.anInt5695 * 488161695;
		Class606.anInt5564 = arg0.anInt5664 * -1447697231;
		Class415.anInt4719 = arg0.anInt5697 * 1286636607;
	}

	@OriginalMember(owner = "client!adb", name = "p", descriptor = "(Lclient!pw;Lclient!pw;Lclient!pw;Lclient!pw;I)V", line = 261)
	public static void method1130(@OriginalArg(0) Class478 arg0, @OriginalArg(1) Class478 arg1, @OriginalArg(2) Class478 arg2, @OriginalArg(3) Class478 arg3) {
		Class277.aClass478_93 = arg0;
		Class342.aClass478_100 = arg1;
		Class415.aClass478_118 = arg2;
		Class35_Sub11.aClass273Array1 = new Class273[Class277.aClass478_93.method29753()];
		Class280.aBooleanArray22 = new boolean[Class277.aClass478_93.method29753()];
	}
}
