package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ach")
public class Class13_Sub10 extends Class13 {

	@OriginalMember(owner = "client!ach", name = "a", descriptor = "I")
	final int anInt621;

	@OriginalMember(owner = "client!ach", name = "g", descriptor = "I")
	final int anInt618;

	@OriginalMember(owner = "client!ach", name = "l", descriptor = "I")
	final int anInt619;

	@OriginalMember(owner = "client!ach", name = "h", descriptor = "I")
	final int anInt620;

	@OriginalMember(owner = "client!ach", name = "x", descriptor = "I")
	final int anInt617;

	@OriginalMember(owner = "client!ach", name = "<init>", descriptor = "(Lclient!ahb;)V", line = 15)
	Class13_Sub10(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
		this.anInt621 = arg0.method20271() * -1980063613;
		@Pc(13) int local13 = arg0.method20269();
		if ((local13 & 0x1) == 0) {
			this.anInt618 = -321320691;
			this.anInt619 = -264921575;
		} else {
			this.anInt618 = arg0.method20271() * 321320691;
			this.anInt619 = arg0.method20271() * 264921575;
		}
		if ((local13 & 0x2) == 0) {
			this.anInt620 = 763167769;
			this.anInt617 = -2009451107;
		} else {
			this.anInt620 = arg0.method20271() * -763167769;
			this.anInt617 = arg0.method20271() * 2009451107;
		}
		if ((local13 & 0x4) != 0) {
			@Pc(72) int local72 = arg0.method20271();
			@Pc(76) int local76 = arg0.method20271();
			@Pc(82) int local82 = local72 * 255 / local76;
			if (local72 > 0 && local82 < 1) {
			}
		}
	}

	@OriginalMember(owner = "client!ach", name = "h", descriptor = "()V", line = 44)
	@Override
	public void method16896() {
		@Pc(8) Class26_Sub1_Sub1_Sub1 local8 = Class131.aClass163Array1[this.anInt621 * 2040180267].method23278();
		local8.method16632(this.anInt618 * -1095232965, this.anInt619 * 1261380055, this.anInt620 * -106436649, this.anInt617 * 1240926027, client.anInt3034, 0);
	}

	@OriginalMember(owner = "client!ach", name = "a", descriptor = "(I)V", line = 44)
	@Override
	public void method16888() {
		@Pc(8) Class26_Sub1_Sub1_Sub1 local8 = Class131.aClass163Array1[this.anInt621 * 2040180267].method23278();
		local8.method16632(this.anInt618 * -1095232965, this.anInt619 * 1261380055, this.anInt620 * -106436649, this.anInt617 * 1240926027, client.anInt3034, 0);
	}

	@OriginalMember(owner = "client!ach", name = "gc", descriptor = "(Lclient!vs;I)V", line = 5266)
	static final void method6266(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class224.method24455(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!ach", name = "aqr", descriptor = "(Lclient!vs;B)V", line = 11989)
	static final void method6265(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 936373647;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(33) int local33 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2];
		Class586.method33284(4, local13 << 16 | local23, local33, "");
	}
}
