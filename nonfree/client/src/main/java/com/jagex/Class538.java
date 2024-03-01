package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vu")
public class Class538 implements Interface56 {

	@OriginalMember(owner = "client!vu", name = "s", descriptor = "I")
	public static final int anInt5323 = 4;

	@OriginalMember(owner = "client!vu", name = "p", descriptor = "Lclient!vu;")
	public static final Class538 aClass538_4 = new Class538(0, (byte) -1);

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "Lclient!vu;")
	public static final Class538 aClass538_1 = new Class538(1, (byte) 0);

	@OriginalMember(owner = "client!vu", name = "g", descriptor = "Lclient!vu;")
	public static final Class538 aClass538_3 = new Class538(2, (byte) 1);

	@OriginalMember(owner = "client!vu", name = "l", descriptor = "Lclient!vu;")
	public static final Class538 aClass538_2 = new Class538(3, (byte) 2);

	@OriginalMember(owner = "client!vu", name = "h", descriptor = "Lclient!vu;")
	public static final Class538 aClass538_5 = new Class538(4, (byte) 3);

	@OriginalMember(owner = "client!vu", name = "x", descriptor = "I")
	public final int anInt5322;

	@OriginalMember(owner = "client!vu", name = "u", descriptor = "B")
	public byte aByte171;

	@OriginalMember(owner = "client!vu", name = "y", descriptor = "()[Lclient!vu;", line = 18)
	public static Class538[] method32556() {
		return new Class538[] { aClass538_4, aClass538_1, aClass538_3, aClass538_2, aClass538_5 };
	}

	@OriginalMember(owner = "client!vu", name = "s", descriptor = "()[Lclient!vu;", line = 18)
	public static Class538[] method32558() {
		return new Class538[] { aClass538_4, aClass538_1, aClass538_3, aClass538_2, aClass538_5 };
	}

	@OriginalMember(owner = "client!vu", name = "u", descriptor = "()[Lclient!vu;", line = 18)
	public static Class538[] method32559() {
		return new Class538[] { aClass538_4, aClass538_1, aClass538_3, aClass538_2, aClass538_5 };
	}

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(IB)V", line = 21)
	Class538(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.anInt5322 = arg0 * 551074761;
		this.aByte171 = arg1;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)I", line = 27)
	@Override
	public int method33765() {
		return this.aByte171;
	}

	@OriginalMember(owner = "client!vu", name = "l", descriptor = "()I", line = 27)
	@Override
	public int method33767() {
		return this.aByte171;
	}

	@OriginalMember(owner = "client!vu", name = "h", descriptor = "()I", line = 27)
	@Override
	public int method33766() {
		return this.aByte171;
	}

	@OriginalMember(owner = "client!vu", name = "x", descriptor = "()I", line = 27)
	@Override
	public int method33764() {
		return this.aByte171;
	}

	@OriginalMember(owner = "client!vu", name = "g", descriptor = "(I)I", line = 31)
	public int method32557() {
		return this.aByte171 + 1;
	}

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "()I", line = 31)
	public int method32560() {
		return this.aByte171 + 1;
	}

	@OriginalMember(owner = "client!vu", name = "p", descriptor = "(B)[Lclient!fy;", line = 47)
	static Class188[] method32562() {
		return new Class188[] { Class188.aClass188_11, Class188.aClass188_33, Class188.aClass188_23, Class188.aClass188_25, Class188.aClass188_18, Class188.aClass188_10, Class188.aClass188_37, Class188.aClass188_6, Class188.aClass188_20, Class188.aClass188_13, Class188.aClass188_9, Class188.aClass188_5, Class188.aClass188_14, Class188.aClass188_34, Class188.aClass188_2, Class188.aClass188_22, Class188.aClass188_15, Class188.aClass188_27, Class188.aClass188_30, Class188.aClass188_3, Class188.aClass188_29, Class188.aClass188_31, Class188.aClass188_35, Class188.aClass188_12, Class188.aClass188_32, Class188.aClass188_26, Class188.aClass188_24, Class188.aClass188_28, Class188.aClass188_21, Class188.aClass188_19, Class188.aClass188_36, Class188.aClass188_1, Class188.aClass188_17, Class188.aClass188_16, Class188.aClass188_7, Class188.aClass188_4, Class188.aClass188_8 };
	}

	@OriginalMember(owner = "client!vu", name = "l", descriptor = "(IIZB)I", line = 51)
	public static int method32565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) int local1 = 0;
		@Pc(6) Class3_Sub8 local6 = Class14.method3338(arg0, arg2);
		if (local6 == null) {
			return 0;
		}
		for (@Pc(12) int local12 = 0; local12 < local6.anIntArray178.length; local12++) {
			if (local6.anIntArray178[local12] >= 0 && Class44_Sub3.aClass596_1.method33435(local6.anIntArray178[local12]).anInt5466 * 2120045409 == arg1) {
				local1 += Class440.method28240(arg0, local12, arg2);
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!vu", name = "cw", descriptor = "(I)V", line = 228)
	static void method32566() {
		if (Class485.anInt5182 * 826696483 < 0) {
			Class485.anInt5182 = 0;
			Class58_Sub1.anInt1437 = -481951965;
			Class58_Sub1.anInt1435 = 1239823265;
		}
		if (Class485.anInt5182 * 826696483 > Class58_Sub1.anInt1407) {
			Class485.anInt5182 = Class58_Sub1.anInt1407 * -1310727029;
			Class58_Sub1.anInt1437 = -481951965;
			Class58_Sub1.anInt1435 = 1239823265;
		}
		if (Class161.anInt3445 * 2105263663 < 0) {
			Class161.anInt3445 = 0;
			Class58_Sub1.anInt1437 = -481951965;
			Class58_Sub1.anInt1435 = 1239823265;
		}
		if (Class161.anInt3445 * 2105263663 > Class58_Sub1.anInt1408) {
			Class161.anInt3445 = Class58_Sub1.anInt1408 * 634470607;
			Class58_Sub1.anInt1437 = -481951965;
			Class58_Sub1.anInt1435 = 1239823265;
		}
	}

	@OriginalMember(owner = "client!vu", name = "f", descriptor = "(III)I", line = 1612)
	static final int method32561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(35) int local35 = Class574.method33109(arg0 - 1, arg1 - 1) + Class574.method33109(arg0 + 1, arg1 - 1) + Class574.method33109(arg0 - 1, arg1 + 1) + Class574.method33109(arg0 + 1, arg1 + 1);
		@Pc(63) int local63 = Class574.method33109(arg0 - 1, arg1) + Class574.method33109(arg0 + 1, arg1) + Class574.method33109(arg0, arg1 - 1) + Class574.method33109(arg0, arg1 + 1);
		@Pc(68) int local68 = Class574.method33109(arg0, arg1);
		return local68 / 4 + local35 / 16 + local63 / 8;
	}

	@OriginalMember(owner = "client!vu", name = "fz", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 5025)
	static final void method32563(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		@Pc(12) int local12 = arg2.anIntArray496[(arg2.anInt5319 -= 312124549) * 960738381];
		arg0.aBoolean631 = local12 == 1;
		Class223.method24442(arg0);
	}

	@OriginalMember(owner = "client!vu", name = "fv", descriptor = "(Lclient!vs;I)V", line = 5031)
	static final void method32567(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		method32563(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!vu", name = "zr", descriptor = "(Lclient!vs;I)V", line = 8582)
	static final void method32564(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = arg0.aClass245_4.aByteArray75[local12];
	}
}
