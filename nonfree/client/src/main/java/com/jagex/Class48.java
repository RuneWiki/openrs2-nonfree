package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aby")
public abstract class Class48 {

	@OriginalMember(owner = "client!aby", name = "p", descriptor = "I")
	protected final int anInt1627;

	@OriginalMember(owner = "client!aby", name = "c", descriptor = "I")
	protected final int anInt1625;

	@OriginalMember(owner = "client!aby", name = "v", descriptor = "I")
	protected final int anInt1626;

	@OriginalMember(owner = "client!aby", name = "l", descriptor = "I")
	protected final int anInt1624;

	@OriginalMember(owner = "client!aby", name = "y", descriptor = "I")
	protected final int anInt1629;

	@OriginalMember(owner = "client!aby", name = "w", descriptor = "I")
	protected final int anInt1628;

	@OriginalMember(owner = "client!aby", name = "t", descriptor = "Z")
	protected final boolean aBoolean334;

	@OriginalMember(owner = "client!aby", name = "q", descriptor = "Z")
	protected final boolean aBoolean333;

	@OriginalMember(owner = "client!aby", name = "x", descriptor = "I")
	protected final int anInt1630;

	@OriginalMember(owner = "client!aby", name = "<init>", descriptor = "(IIIIIIZZI)V", line = 14)
	Class48(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		this.anInt1627 = arg0 * 1513206777;
		this.anInt1625 = arg1 * 666889901;
		this.anInt1626 = (arg2 > 65535 ? 65535 : arg2) * -1968095099;
		this.anInt1624 = arg3 * -2065840169;
		this.anInt1629 = (arg4 > 255 ? 255 : arg4) * -105881611;
		this.anInt1628 = arg5 * -1344899373;
		this.aBoolean334 = arg6;
		this.aBoolean333 = arg7;
		this.anInt1630 = arg8 * -405560541;
	}

	@OriginalMember(owner = "client!aby", name = "j", descriptor = "(Lclient!yf;B)V", line = 75)
	static void method13746(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[arg0.anInt5784 * 2088438307 - 2] = ((Class303) Class252.aClass42_Sub2_1.method18319(arg0.anIntArray536[arg0.anInt5784 * 2088438307 - 2])).method27176(Class55.aClass124_1, arg0.anIntArray536[arg0.anInt5784 * 2088438307 - 1]) ? 1 : 0;
		arg0.anInt5784 -= 308999563;
	}

	@OriginalMember(owner = "client!aby", name = "by", descriptor = "(Lclient!yf;B)V", line = 4653)
	static final void method13747(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 926998689;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(33) int local33 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		Class155.method23628(local13);
		Class96_Sub3.method7108(Class35_Sub11.aClass273Array1[local13 >>> 16], local13 & 0xFFFF, local23, local33, arg0.aBoolean857, arg0);
	}
}
