package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
final class Class201 implements Interface26 {

	@OriginalMember(owner = "client!d", name = "q", descriptor = "(III)V", line = 374)
	static void method25538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Class683.anInt5822 * -1488345619 == 1) {
			Class95.method7036(Class518.aClass77_Sub1_Sub7_5, arg0, arg1, false);
		} else if (Class683.anInt5822 * -1488345619 == 2) {
			Class355.method27961(arg0, arg1);
		}
		Class683.anInt5822 = 0;
		Class518.aClass77_Sub1_Sub7_5 = null;
	}

	@OriginalMember(owner = "client!d", name = "y", descriptor = "()Lclient!adw;", line = 612)
	@Override
	public Class80_Sub1 method25530() {
		return Class562.aClass80_Sub1_Sub1_2;
	}

	@OriginalMember(owner = "client!d", name = "p", descriptor = "(I)Lclient!adw;", line = 612)
	@Override
	public Class80_Sub1 method25537() {
		return Class562.aClass80_Sub1_Sub1_2;
	}

	@OriginalMember(owner = "client!d", name = "w", descriptor = "()Lclient!adw;", line = 616)
	@Override
	public Class80_Sub1 method25531() {
		return Class528.aClass80_Sub1_Sub2_5;
	}

	@OriginalMember(owner = "client!d", name = "t", descriptor = "()Lclient!adw;", line = 616)
	@Override
	public Class80_Sub1 method25529() {
		return Class528.aClass80_Sub1_Sub2_5;
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(I)Lclient!adw;", line = 616)
	@Override
	public Class80_Sub1 method25526() {
		return Class528.aClass80_Sub1_Sub2_5;
	}

	@OriginalMember(owner = "client!d", name = "q", descriptor = "()Lclient!ans;", line = 620)
	@Override
	public Class35_Sub11 method25533() {
		return Class61.aClass35_Sub11_1;
	}

	@OriginalMember(owner = "client!d", name = "v", descriptor = "(B)Lclient!ans;", line = 620)
	@Override
	public Class35_Sub11 method25532() {
		return Class61.aClass35_Sub11_1;
	}

	@OriginalMember(owner = "client!d", name = "d", descriptor = "()Lclient!ans;", line = 620)
	@Override
	public Class35_Sub11 method25535() {
		return Class61.aClass35_Sub11_1;
	}

	@OriginalMember(owner = "client!d", name = "x", descriptor = "()Lclient!ans;", line = 620)
	@Override
	public Class35_Sub11 method25534() {
		return Class61.aClass35_Sub11_1;
	}

	@OriginalMember(owner = "client!d", name = "l", descriptor = "(I)Lclient!wj;", line = 624)
	@Override
	public Class620 method25527() {
		return Class544.aClass620_1;
	}

	@OriginalMember(owner = "client!d", name = "s", descriptor = "()Lclient!wj;", line = 624)
	@Override
	public Class620 method25536() {
		return Class544.aClass620_1;
	}

	@OriginalMember(owner = "client!d", name = "r", descriptor = "()Lclient!wj;", line = 624)
	@Override
	public Class620 method25528() {
		return Class544.aClass620_1;
	}

	@OriginalMember(owner = "client!d", name = "asa", descriptor = "(Lclient!yf;I)V", line = 12623)
	static final void method25539(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(14) boolean local14 = true;
		if (local12 < 0) {
			local14 = (local12 + 1) % 4 == 0;
		} else if (local12 < 1582) {
			local14 = local12 % 4 == 0;
		} else if (local12 % 4 != 0) {
			local14 = false;
		} else if (local12 % 100 != 0) {
			local14 = true;
		} else if (local12 % 400 != 0) {
			local14 = false;
		}
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local14 ? 1 : 0;
	}
}
