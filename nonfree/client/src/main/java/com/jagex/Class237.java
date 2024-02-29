package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ex")
public class Class237 {

	@OriginalMember(owner = "client!ex", name = "c", descriptor = "I")
	static final int anInt3779 = 2;

	@OriginalMember(owner = "client!ex", name = "p", descriptor = "I")
	static final int anInt3780 = 0;

	@OriginalMember(owner = "client!ex", name = "v", descriptor = "[I")
	final int[] anIntArray381;

	@OriginalMember(owner = "client!ex", name = "l", descriptor = "[I")
	final int[] anIntArray382;

	@OriginalMember(owner = "client!ex", name = "<init>", descriptor = "(Lclient!akv;)V", line = 13)
	Class237(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(5) int local5 = arg0.method22537();
		this.anIntArray381 = new int[local5];
		this.anIntArray382 = new int[local5];
		for (@Pc(15) int local15 = 0; local15 < local5; local15++) {
			@Pc(22) int local22 = arg0.method22478();
			this.anIntArray381[local15] = local22;
			@Pc(31) int local31 = arg0.method22483();
			@Pc(35) int local35 = arg0.method22483();
			this.anIntArray382[local15] = (local31 << 16) + local35;
		}
	}

	@OriginalMember(owner = "client!ex", name = "p", descriptor = "(Lclient!ee;II)V", line = 27)
	void method25913(@OriginalArg(0) Class222 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = this.anIntArray382[0];
		arg0.method25752(arg1, local4 >>> 16, local4 & 0xFFFF);
		@Pc(18) Class104_Sub1_Sub1_Sub1 local18 = arg0.method25755();
		local18.anInt2900 = 0;
		for (@Pc(27) int local27 = this.anIntArray381.length - 1; local27 >= 0; local27--) {
			@Pc(34) int local34 = this.anIntArray381[local27];
			@Pc(39) int local39 = this.anIntArray382[local27];
			local18.anIntArray274[local18.anInt2900 * -1763707177] = local39 >> 16;
			local18.anIntArray275[local18.anInt2900 * -1763707177] = local39 & 0xFFFF;
			@Pc(62) byte local62 = Class671.aClass671_4.aByte175;
			if (local34 == 0) {
				local62 = Class671.aClass671_1.aByte175;
			} else if (local34 == 2) {
				local62 = Class671.aClass671_5.aByte175;
			}
			local18.aByteArray47[local18.anInt2900 * -1763707177] = local62;
			local18.anInt2900 += 990207207;
		}
	}

	@OriginalMember(owner = "client!ex", name = "c", descriptor = "(Lclient!ee;I)V", line = 27)
	void method25914(@OriginalArg(0) Class222 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = this.anIntArray382[0];
		arg0.method25752(arg1, local4 >>> 16, local4 & 0xFFFF);
		@Pc(18) Class104_Sub1_Sub1_Sub1 local18 = arg0.method25755();
		local18.anInt2900 = 0;
		for (@Pc(27) int local27 = this.anIntArray381.length - 1; local27 >= 0; local27--) {
			@Pc(34) int local34 = this.anIntArray381[local27];
			@Pc(39) int local39 = this.anIntArray382[local27];
			local18.anIntArray274[local18.anInt2900 * -1763707177] = local39 >> 16;
			local18.anIntArray275[local18.anInt2900 * -1763707177] = local39 & 0xFFFF;
			@Pc(62) byte local62 = Class671.aClass671_4.aByte175;
			if (local34 == 0) {
				local62 = Class671.aClass671_1.aByte175;
			} else if (local34 == 2) {
				local62 = Class671.aClass671_5.aByte175;
			}
			local18.aByteArray47[local18.anInt2900 * -1763707177] = local62;
			local18.anInt2900 += 990207207;
		}
	}

	@OriginalMember(owner = "client!ex", name = "v", descriptor = "(Lclient!ee;I)V", line = 27)
	void method25915(@OriginalArg(0) Class222 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = this.anIntArray382[0];
		arg0.method25752(arg1, local4 >>> 16, local4 & 0xFFFF);
		@Pc(18) Class104_Sub1_Sub1_Sub1 local18 = arg0.method25755();
		local18.anInt2900 = 0;
		for (@Pc(27) int local27 = this.anIntArray381.length - 1; local27 >= 0; local27--) {
			@Pc(34) int local34 = this.anIntArray381[local27];
			@Pc(39) int local39 = this.anIntArray382[local27];
			local18.anIntArray274[local18.anInt2900 * -1763707177] = local39 >> 16;
			local18.anIntArray275[local18.anInt2900 * -1763707177] = local39 & 0xFFFF;
			@Pc(62) byte local62 = Class671.aClass671_4.aByte175;
			if (local34 == 0) {
				local62 = Class671.aClass671_1.aByte175;
			} else if (local34 == 2) {
				local62 = Class671.aClass671_5.aByte175;
			}
			local18.aByteArray47[local18.anInt2900 * -1763707177] = local62;
			local18.anInt2900 += 990207207;
		}
	}

	@OriginalMember(owner = "client!ex", name = "l", descriptor = "(Lclient!ee;I)V", line = 27)
	void method25916(@OriginalArg(0) Class222 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = this.anIntArray382[0];
		arg0.method25752(arg1, local4 >>> 16, local4 & 0xFFFF);
		@Pc(18) Class104_Sub1_Sub1_Sub1 local18 = arg0.method25755();
		local18.anInt2900 = 0;
		for (@Pc(27) int local27 = this.anIntArray381.length - 1; local27 >= 0; local27--) {
			@Pc(34) int local34 = this.anIntArray381[local27];
			@Pc(39) int local39 = this.anIntArray382[local27];
			local18.anIntArray274[local18.anInt2900 * -1763707177] = local39 >> 16;
			local18.anIntArray275[local18.anInt2900 * -1763707177] = local39 & 0xFFFF;
			@Pc(62) byte local62 = Class671.aClass671_4.aByte175;
			if (local34 == 0) {
				local62 = Class671.aClass671_1.aByte175;
			} else if (local34 == 2) {
				local62 = Class671.aClass671_5.aByte175;
			}
			local18.aByteArray47[local18.anInt2900 * -1763707177] = local62;
			local18.anInt2900 += 990207207;
		}
	}

	@OriginalMember(owner = "client!ex", name = "gi", descriptor = "(Lclient!yf;I)V", line = 5588)
	static final void method25917(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class616.method32365(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!ex", name = "ary", descriptor = "(Lclient!yf;I)V", line = 12535)
	static final void method25918(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
	}
}
