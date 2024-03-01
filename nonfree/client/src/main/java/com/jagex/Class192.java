package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public class Class192 {

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "Lclient!gb;")
	static final Class192 aClass192_4 = new Class192(0);

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "Lclient!gb;")
	public static final Class192 aClass192_3 = new Class192(1);

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
	public int anInt3681;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(I)V", line = 8)
	Class192(@OriginalArg(0) int arg0) {
		this.anInt3681 = arg0 * -17652103;
	}

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "(I)Lclient!gb;", line = 13)
	static Class192 method24063(@OriginalArg(0) int arg0) {
		if (aClass192_4.anInt3681 * 961471433 == arg0) {
			return aClass192_4;
		} else if (aClass192_3.anInt3681 * 961471433 == arg0) {
			return aClass192_3;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)Lclient!gb;", line = 13)
	static Class192 method24064(@OriginalArg(0) int arg0) {
		if (aClass192_4.anInt3681 * 961471433 == arg0) {
			return aClass192_4;
		} else if (aClass192_3.anInt3681 * 961471433 == arg0) {
			return aClass192_3;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gb", name = "z", descriptor = "(II)V", line = 123)
	public static void method24067(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(8, (long) arg0);
		local4.method19145();
	}

	@OriginalMember(owner = "client!gb", name = "u", descriptor = "(Lclient!akp;I)V", line = 280)
	public static void method24066(@OriginalArg(0) Class26_Sub1_Sub1_Sub1_Sub2 arg0) {
		@Pc(8) Class3_Sub20 local8 = (Class3_Sub20) Class3_Sub20.aClass581_9.method33217((long) (arg0.anInt2355 * 144783765));
		if (local8 == null) {
			Class148.method23119(arg0.aByte101, arg0.anIntArray241[0], arg0.anIntArray239[0], 0, null, null, arg0);
		} else {
			local8.method11391();
		}
	}

	@OriginalMember(owner = "client!gb", name = "yr", descriptor = "(Lclient!vs;I)V", line = 8513)
	static final void method24065(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		if (client.anInt3194 * 963130851 == 0 || local12 >= client.anInt3174 * 918731051) {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = "";
		} else {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = client.aClass123Array1[local12].aString161;
		}
	}
}
