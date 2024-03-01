package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public class Class473 {

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
	int anInt5120;

	@OriginalMember(owner = "client!ta", name = "p", descriptor = "Ljava/lang/String;")
	String aString227;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V", line = 7)
	Class473() {
	}

	@OriginalMember(owner = "client!ta", name = "cf", descriptor = "(B)V", line = 251)
	static void method28782() {
		Class269.aClass553_55 = null;
		Class58_Sub1.anInt1434 = 0;
		Class58_Sub1.anInt1419 = 0;
		Class19_Sub1.aClass178_8 = null;
		Class58_Sub1.method12386();
		Class58_Sub1.aClass553_23.method32701();
		Class58_Sub1.aClass421_2 = null;
		Class58_Sub1.aClass161_8.method23224();
		Class58_Sub1.aClass161_7.method23224();
		Class381.aClass6_28 = null;
		Class58_Sub1.anInt1437 = -481951965;
		Class58_Sub1.anInt1435 = 1239823265;
		if (Class58_Sub1.aClass454_2 != null) {
			Class58_Sub1.aClass454_2.method28449();
			Class58_Sub1.aClass454_2.method28439(128, 64);
		}
		if (Class58_Sub1.aClass629_2 != null) {
			Class58_Sub1.aClass629_2.method33839(64, 64);
		}
		if (Class58_Sub1.aClass457_7 != null) {
			Class58_Sub1.aClass457_7.method28492(256);
		}
		Class308.aClass70_Sub2_3.method33887(64);
	}

	@OriginalMember(owner = "client!ta", name = "bn", descriptor = "(Lclient!vs;I)V", line = 4311)
	static final void method28781(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		if (Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aClass488_1 != null) {
			Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aClass488_1.method29198(local13, local23, Class44_Sub3.aClass596_1);
		}
	}

	@OriginalMember(owner = "client!ta", name = "ty", descriptor = "(Lclient!vs;I)V", line = 7577)
	static final void method28783(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= -861597257;
		@Pc(8) Class277[] local8 = Class3_Sub30.method11638();
		@Pc(11) Class276[] local11 = Class400.method27575();
		Class201.method24155(local8[arg0.anIntArray496[arg0.anInt5319 * 960738381]], local11[arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1]], arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2], arg0.anIntArray496[arg0.anInt5319 * 960738381 + 3], arg0.anIntArray496[arg0.anInt5319 * 960738381 + 4], arg0.anIntArray496[arg0.anInt5319 * 960738381 + 5], arg0.anIntArray496[arg0.anInt5319 * 960738381 + 6], arg0.anIntArray496[arg0.anInt5319 * 960738381 + 7], arg0.anIntArray496[arg0.anInt5319 * 960738381 + 8], arg0.anIntArray496[arg0.anInt5319 * 960738381 + 9], arg0.anIntArray496[arg0.anInt5319 * 960738381 + 10]);
	}

	@OriginalMember(owner = "client!ta", name = "aav", descriptor = "(Lclient!vs;B)V", line = 8759)
	static final void method28780(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local13 + local23;
	}

	@OriginalMember(owner = "client!ta", name = "mp", descriptor = "(B)V", line = 11652)
	static void method28779() {
		@Pc(2) Class82 local2 = Class406.method27657();
		@Pc(8) Class3_Sub23 local8 = Class269.method25284(Class311.aClass311_8, local2.aClass577_2);
		local8.aClass3_Sub41_Sub1_1.method20254(client.anInt3060 * 369203209);
		local2.method21601(local8);
	}
}
