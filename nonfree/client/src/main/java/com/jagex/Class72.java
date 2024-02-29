package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acz")
public class Class72 {

	@OriginalMember(owner = "client!acz", name = "p", descriptor = "I")
	public final int anInt206;

	@OriginalMember(owner = "client!acz", name = "c", descriptor = "I")
	public final int anInt205;

	@OriginalMember(owner = "client!acz", name = "v", descriptor = "I")
	public final int anInt204;

	@OriginalMember(owner = "client!acz", name = "<init>", descriptor = "(III)V", line = 142)
	Class72(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt206 = arg0 * 1072993355;
		this.anInt205 = arg1 * 1862182055;
		this.anInt204 = arg2 * -594256357;
	}

	@OriginalMember(owner = "client!acz", name = "v", descriptor = "(Lclient!aky;I)V", line = 211)
	public static void method1019(@OriginalArg(0) Class77_Sub41 arg0) {
		Class143_Sub13.method15363(arg0, 500000);
	}

	@OriginalMember(owner = "client!acz", name = "ew", descriptor = "(IZB)Z", line = 971)
	public static boolean method1020(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == Class136_Sub1.anInt1706 * -363511917) {
			Class136_Sub1.aBoolean342 = arg1;
		} else if (arg0 == Class136_Sub1.anInt1698 * 1272099037) {
			Class136_Sub1.aBoolean340 = arg1;
		} else if (Class136_Sub1.anInt1709 * -1565977311 == arg0) {
			Class136_Sub1.aBoolean343 = arg1;
		} else {
			return false;
		}
		return true;
	}

	@OriginalMember(owner = "client!acz", name = "hu", descriptor = "(Lclient!yf;I)V", line = 5796)
	static final void method1021(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class77_Sub19.method13488(local16, local22, true, 2, arg0);
	}
}
