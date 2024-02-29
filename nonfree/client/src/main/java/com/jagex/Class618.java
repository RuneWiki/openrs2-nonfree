package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public class Class618 {

	@OriginalMember(owner = "client!wh", name = "qg", descriptor = "I")
	static int anInt5608;

	@OriginalMember(owner = "client!wh", name = "p", descriptor = "I")
	int anInt5596;

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
	int anInt5597;

	@OriginalMember(owner = "client!wh", name = "w", descriptor = "I")
	int anInt5598;

	@OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
	int anInt5599;

	@OriginalMember(owner = "client!wh", name = "y", descriptor = "I")
	int anInt5600;

	@OriginalMember(owner = "client!wh", name = "v", descriptor = "I")
	int anInt5601;

	@OriginalMember(owner = "client!wh", name = "t", descriptor = "I")
	int anInt5602;

	@OriginalMember(owner = "client!wh", name = "r", descriptor = "I")
	int anInt5603;

	@OriginalMember(owner = "client!wh", name = "x", descriptor = "I")
	int anInt5604;

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
	int anInt5605;

	@OriginalMember(owner = "client!wh", name = "q", descriptor = "I")
	int anInt5606;

	@OriginalMember(owner = "client!wh", name = "s", descriptor = "I")
	int anInt5607;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V", line = 246)
	Class618() {
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(Lclient!wh;)Z", line = 249)
	boolean method32383(@OriginalArg(0) Class618 arg0) {
		return arg0.anInt5605 * -1481682457 == this.anInt5605 * -1481682457 && arg0.anInt5607 * 379767745 == this.anInt5607 * 379767745 && arg0.anInt5603 * 702655677 == this.anInt5603 * 702655677;
	}

	@OriginalMember(owner = "client!wh", name = "p", descriptor = "(Lclient!wh;B)Z", line = 249)
	boolean method32384(@OriginalArg(0) Class618 arg0) {
		return arg0.anInt5605 * -1481682457 == this.anInt5605 * -1481682457 && arg0.anInt5607 * 379767745 == this.anInt5607 * 379767745 && arg0.anInt5603 * 702655677 == this.anInt5603 * 702655677;
	}

	@OriginalMember(owner = "client!wh", name = "v", descriptor = "(Lclient!wh;)Z", line = 249)
	boolean method32385(@OriginalArg(0) Class618 arg0) {
		return arg0.anInt5605 * -1481682457 == this.anInt5605 * -1481682457 && arg0.anInt5607 * 379767745 == this.anInt5607 * 379767745 && arg0.anInt5603 * 702655677 == this.anInt5603 * 702655677;
	}

	@OriginalMember(owner = "client!wh", name = "pa", descriptor = "(Lclient!yf;B)V", line = 7342)
	static final void method32386(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class307.method27256(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!wh", name = "yy", descriptor = "(Lclient!yf;S)V", line = 8984)
	static final void method32387(@OriginalArg(0) Class665 arg0) {
		Class162.method24346();
	}

	@OriginalMember(owner = "client!wh", name = "abx", descriptor = "(Lclient!yf;I)V", line = 9370)
	static final void method32388(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		Class609.method32146(arg0.aClass77_Sub25_3 == Class574.aClass77_Sub25_2, local12);
	}

	@OriginalMember(owner = "client!wh", name = "kb", descriptor = "(Lclient!aku;IIIIIIIIIB)V", line = 10966)
	static final void method32389(@OriginalArg(0) Class77_Sub38 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (!Class211.method25607(arg1, null)) {
			return;
		}
		if (arg0 == null || arg0.method22851()) {
			@Pc(21) Class273 local21 = Class35_Sub11.aClass273Array1[arg1];
			client.method25301(local21, local21.method26533(), -1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
		} else {
			Class77_Sub41.method14838(arg0, true, false);
		}
	}

	@OriginalMember(owner = "client!wh", name = "ajk", descriptor = "(Lclient!yf;I)V", line = 11192)
	static final void method32390(@OriginalArg(0) Class665 arg0) {
		Class296.method27050();
		Class683.aBoolean863 = false;
	}
}
