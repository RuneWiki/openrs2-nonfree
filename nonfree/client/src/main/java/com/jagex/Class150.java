package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public class Class150 {

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
	static final int anInt3435 = 2;

	@OriginalMember(owner = "client!ej", name = "p", descriptor = "I")
	static final int anInt3436 = 0;

	@OriginalMember(owner = "client!ej", name = "kc", descriptor = "I")
	static int anInt3437;

	@OriginalMember(owner = "client!ej", name = "g", descriptor = "[I")
	final int[] anIntArray341;

	@OriginalMember(owner = "client!ej", name = "l", descriptor = "[I")
	final int[] anIntArray342;

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lclient!ahb;)V", line = 13)
	Class150(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(5) int local5 = arg0.method20334();
		this.anIntArray341 = new int[local5];
		this.anIntArray342 = new int[local5];
		for (@Pc(15) int local15 = 0; local15 < local5; local15++) {
			@Pc(22) int local22 = arg0.method20269();
			this.anIntArray341[local15] = local22;
			@Pc(31) int local31 = arg0.method20271();
			@Pc(35) int local35 = arg0.method20271();
			this.anIntArray342[local15] = (local31 << 16) + local35;
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!ey;I)V", line = 27)
	void method23130(@OriginalArg(0) Class163 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = this.anIntArray342[0];
		arg0.method23277(arg1, local4 >>> 16, local4 & 0xFFFF);
		@Pc(18) Class26_Sub1_Sub1_Sub1 local18 = arg0.method23278();
		local18.anInt2362 = 0;
		for (@Pc(27) int local27 = this.anIntArray341.length - 1; local27 >= 0; local27--) {
			@Pc(34) int local34 = this.anIntArray341[local27];
			@Pc(39) int local39 = this.anIntArray342[local27];
			local18.anIntArray241[local18.anInt2362 * -162520433] = local39 >> 16;
			local18.anIntArray239[local18.anInt2362 * -162520433] = local39 & 0xFFFF;
			@Pc(62) byte local62 = Class538.aClass538_3.aByte171;
			if (local34 == 0) {
				local62 = Class538.aClass538_1.aByte171;
			} else if (local34 == 2) {
				local62 = Class538.aClass538_2.aByte171;
			}
			local18.aByteArray41[local18.anInt2362 * -162520433] = local62;
			local18.anInt2362 += 2015411311;
		}
	}

	@OriginalMember(owner = "client!ej", name = "p", descriptor = "(Lclient!ey;IB)V", line = 27)
	void method23131(@OriginalArg(0) Class163 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = this.anIntArray342[0];
		arg0.method23277(arg1, local4 >>> 16, local4 & 0xFFFF);
		@Pc(18) Class26_Sub1_Sub1_Sub1 local18 = arg0.method23278();
		local18.anInt2362 = 0;
		for (@Pc(27) int local27 = this.anIntArray341.length - 1; local27 >= 0; local27--) {
			@Pc(34) int local34 = this.anIntArray341[local27];
			@Pc(39) int local39 = this.anIntArray342[local27];
			local18.anIntArray241[local18.anInt2362 * -162520433] = local39 >> 16;
			local18.anIntArray239[local18.anInt2362 * -162520433] = local39 & 0xFFFF;
			@Pc(62) byte local62 = Class538.aClass538_3.aByte171;
			if (local34 == 0) {
				local62 = Class538.aClass538_1.aByte171;
			} else if (local34 == 2) {
				local62 = Class538.aClass538_2.aByte171;
			}
			local18.aByteArray41[local18.anInt2362 * -162520433] = local62;
			local18.anInt2362 += 2015411311;
		}
	}

	@OriginalMember(owner = "client!ej", name = "g", descriptor = "(B)Z", line = 53)
	static boolean method23135() {
		return Class402.aBoolean754;
	}

	@OriginalMember(owner = "client!ej", name = "p", descriptor = "(I)Z", line = 110)
	static boolean method23132() {
		if (client.aByteArray57 == null) {
			return Class190.anInt3639 * 1219357829 == -1 ? Class585.method33281(Class190.aString178, Class190.aString179) : Class612.method33642();
		} else {
			return Class274.method25355();
		}
	}

	@OriginalMember(owner = "client!ej", name = "sg", descriptor = "(Lclient!vs;I)V", line = 7350)
	static final void method23133(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local16.anInt3509 * 1314053873;
	}

	@OriginalMember(owner = "client!ej", name = "adc", descriptor = "(Lclient!vs;I)V", line = 9263)
	static final void method23134(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(28) Class630 local28 = Class3_Sub20.aClass625_1.method33783(local23);
		if (local28.method33850()) {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = client.aClass370_1.method26954().method28510(local13).method28684(local23, local28.aString248);
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.aClass370_1.method26954().method28510(local13).method28683(local23, local28.anInt5585 * 100041865);
		}
	}
}
