package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qu")
public abstract class Class61 {

	@OriginalMember(owner = "client!qu", name = "hm", descriptor = "Lclient!tz;")
	public static Class495 aClass495_2;

	@OriginalMember(owner = "client!qu", name = "<init>", descriptor = "()V", line = 9)
	Class61() {
	}

	@OriginalMember(owner = "client!qu", name = "j", descriptor = "(I)V", line = 16)
	public static void method12745(@OriginalArg(0) int arg0) {
		Class80.method21597(arg0);
	}

	@OriginalMember(owner = "client!qu", name = "n", descriptor = "(I)V", line = 16)
	public static void method12746(@OriginalArg(0) int arg0) {
		Class80.method21597(arg0);
	}

	@OriginalMember(owner = "client!qu", name = "z", descriptor = "(I)V", line = 16)
	public static void method12747(@OriginalArg(0) int arg0) {
		Class80.method21597(arg0);
	}

	@OriginalMember(owner = "client!qu", name = "e", descriptor = "(I)V", line = 16)
	public static void method12749(@OriginalArg(0) int arg0) {
		Class80.method21597(arg0);
	}

	@OriginalMember(owner = "client!qu", name = "t", descriptor = "()Z", line = 25)
	public boolean method12744() {
		return this.method12736() || this.method12737() || this.method12738();
	}

	@OriginalMember(owner = "client!qu", name = "s", descriptor = "(I)Z", line = 25)
	public boolean method12753() {
		return this.method12736() || this.method12737() || this.method12738();
	}

	@OriginalMember(owner = "client!qu", name = "h", descriptor = "(II)S", line = 147)
	public static short method12768(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = arg0 >> 10 & 0x3F;
		@Pc(11) int local11 = arg0 >> 3 & 0x70;
		@Pc(15) int local15 = arg0 & 0x7F;
		@Pc(32) int local32 = local15 <= 64 ? local11 * local15 >> 7 : local11 * (127 - local15) >> 7;
		@Pc(36) int local36 = local32 + local15;
		@Pc(44) int local44;
		if (local36 == 0) {
			local44 = local32 << 1;
		} else {
			local44 = (local32 << 8) / local36;
		}
		return (short) (local5 << 10 | local44 >> 4 << 7 | local36);
	}

	@OriginalMember(owner = "client!qu", name = "ak", descriptor = "(Lclient!vs;B)V", line = 4004)
	static final void method12763(@OriginalArg(0) Class536 arg0) {
		if (arg0.anInt5317 * 434769019 == 0) {
			return;
		}
		@Pc(18) Class509 local18 = arg0.aClass509Array1[(arg0.anInt5317 -= 1066922675) * 434769019];
		arg0.aClass3_Sub1_Sub6_2 = local18.aClass3_Sub1_Sub6_1;
		arg0.aClass385Array2 = arg0.aClass3_Sub1_Sub6_2.aClass385Array1;
		arg0.anIntArray497 = arg0.aClass3_Sub1_Sub6_2.anIntArray260;
		arg0.anInt5318 = local18.anInt5257 * 1416267263;
		arg0.anIntArray494 = local18.anIntArray489;
		arg0.anObjectArray41 = local18.anObjectArray40;
		arg0.aLongArray17 = local18.aLongArray16;
	}

	@OriginalMember(owner = "client!qu", name = "aq", descriptor = "(Lclient!vs;I)V", line = 4046)
	static final void method12764(@OriginalArg(0) Class536 arg0) {
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = arg0.anObjectArray41[arg0.anIntArray497[arg0.anInt5318 * -2140198955]];
	}

	@OriginalMember(owner = "client!qu", name = "cc", descriptor = "(Lclient!vs;I)V", line = 4460)
	static final void method12769(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class464.method28626(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!qu", name = "gt", descriptor = "(Lclient!vs;B)V", line = 5222)
	static final void method12765(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class359.method26757(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!qu", name = "ajp", descriptor = "(Lclient!vs;B)V", line = 10628)
	static final void method12766(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.anInt3089 * 1439269037 - client.anInt3088 * 873705613;
	}

	@OriginalMember(owner = "client!qu", name = "amu", descriptor = "(Lclient!vs;I)V", line = 11305)
	static final void method12767(@OriginalArg(0) Class536 arg0) {
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub3_1, arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381] == 1 ? 1 : 0);
		Class26_Sub1_Sub1_Sub1.method16728();
		client.aBoolean573 = false;
	}

	@OriginalMember(owner = "client!qu", name = "m", descriptor = "()Z")
	public abstract boolean method12734();

	@OriginalMember(owner = "client!qu", name = "g", descriptor = "(B)V")
	public abstract void method12735();

	@OriginalMember(owner = "client!qu", name = "l", descriptor = "(I)Z")
	public abstract boolean method12736();

	@OriginalMember(owner = "client!qu", name = "h", descriptor = "(I)Z")
	public abstract boolean method12737();

	@OriginalMember(owner = "client!qu", name = "x", descriptor = "(I)Z")
	public abstract boolean method12738();

	@OriginalMember(owner = "client!qu", name = "ah", descriptor = "()V")
	public abstract void method12739();

	@OriginalMember(owner = "client!qu", name = "u", descriptor = "(B)I")
	public abstract int method12740();

	@OriginalMember(owner = "client!qu", name = "y", descriptor = "(B)I")
	public abstract int method12741();

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "(I)Lclient!agg;")
	public abstract Class3_Sub22 method12742();

	@OriginalMember(owner = "client!qu", name = "c", descriptor = "(I)V")
	public abstract void method12743();

	@OriginalMember(owner = "client!qu", name = "r", descriptor = "()V")
	public abstract void method12748();

	@OriginalMember(owner = "client!qu", name = "q", descriptor = "()Z")
	public abstract boolean method12750();

	@OriginalMember(owner = "client!qu", name = "d", descriptor = "()Z")
	public abstract boolean method12751();

	@OriginalMember(owner = "client!qu", name = "v", descriptor = "()Z")
	public abstract boolean method12752();

	@OriginalMember(owner = "client!qu", name = "w", descriptor = "()I")
	public abstract int method12754();

	@OriginalMember(owner = "client!qu", name = "o", descriptor = "()I")
	public abstract int method12755();

	@OriginalMember(owner = "client!qu", name = "i", descriptor = "()I")
	public abstract int method12756();

	@OriginalMember(owner = "client!qu", name = "f", descriptor = "()I")
	public abstract int method12757();

	@OriginalMember(owner = "client!qu", name = "k", descriptor = "()I")
	public abstract int method12758();

	@OriginalMember(owner = "client!qu", name = "at", descriptor = "()Lclient!agg;")
	public abstract Class3_Sub22 method12759();

	@OriginalMember(owner = "client!qu", name = "af", descriptor = "()Lclient!agg;")
	public abstract Class3_Sub22 method12760();

	@OriginalMember(owner = "client!qu", name = "ak", descriptor = "()V")
	public abstract void method12761();

	@OriginalMember(owner = "client!qu", name = "aa", descriptor = "()V")
	public abstract void method12762();
}
