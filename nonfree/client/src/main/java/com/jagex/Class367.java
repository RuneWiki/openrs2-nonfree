package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public class Class367 {

	@OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
	public int anInt4653;

	@OriginalMember(owner = "client!oj", name = "p", descriptor = "B")
	byte aByte154;

	@OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
	public int anInt4654;

	@OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
	public int anInt4655;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
	public int anInt4656;

	@OriginalMember(owner = "client!oj", name = "x", descriptor = "I")
	public int anInt4657;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "()V", line = 18)
	public Class367() {
	}

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lclient!ahb;Lclient!zf;)V", line = 20)
	public Class367(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) Class70_Sub1 arg1) {
		this.aByte154 = arg0.method20390();
		this.anInt4656 = arg0.method20271() * 885986641;
		this.anInt4653 = arg0.method20275() * 378197875;
		this.anInt4655 = arg0.method20275() * 1181477559;
		this.anInt4654 = arg0.method20275() * 436330811;
		this.anInt4657 = arg0.method20275() * 1432482001;
		if (arg1 != null) {
			Class552.method32699(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!oj", name = "l", descriptor = "(Lclient!ahb;Lclient!zf;)Lclient!xy;", line = 33)
	static Class591 method26910(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) Class70_Sub1 arg1) {
		@Pc(4) Class591 local4 = new Class591(arg1);
		while (true) {
			@Pc(8) int local8 = arg0.method20269();
			if (local8 == 255) {
				return local4;
			}
			@Pc(18) Class342 local18 = (Class342) Class371.method27203(Class342.class, local8);
			while (true) {
				@Pc(22) int local22 = arg0.method20269();
				if (local22 == 255) {
					break;
				}
				arg0.anInt2803 -= -918980331;
				@Pc(38) Class304 local38 = arg1.method14718(arg0, local18);
				if (local38 != null) {
					local4.method33310(local38.anInt4428 * 1628864065, local38.anObject17);
				}
			}
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)I", line = 52)
	public int method26908() {
		return this.aByte154 & 0x7;
	}

	@OriginalMember(owner = "client!oj", name = "h", descriptor = "()I", line = 52)
	public int method26911() {
		return this.aByte154 & 0x7;
	}

	@OriginalMember(owner = "client!oj", name = "x", descriptor = "()I", line = 52)
	public int method26912() {
		return this.aByte154 & 0x7;
	}

	@OriginalMember(owner = "client!oj", name = "s", descriptor = "()I", line = 56)
	public int method26907() {
		return (this.aByte154 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!oj", name = "g", descriptor = "(I)I", line = 56)
	public int method26909() {
		return (this.aByte154 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!oj", name = "u", descriptor = "()I", line = 56)
	public int method26913() {
		return (this.aByte154 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!oj", name = "af", descriptor = "(B)J", line = 667)
	static long method26918() {
		return Class265.aClass47_1.method9226();
	}

	@OriginalMember(owner = "client!oj", name = "oa", descriptor = "(Lclient!vs;S)V", line = 6665)
	static final void method26914(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class131.method22901(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!oj", name = "oq", descriptor = "(Lclient!vs;I)V", line = 6781)
	static final void method26917(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class364.method26785(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!oj", name = "wl", descriptor = "(Lclient!vs;I)V", line = 8130)
	static final void method26915(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 936373647;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(33) int local33 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2];
		if (local23 == -1) {
			throw new RuntimeException();
		}
		@Pc(45) Class574 local45 = Class438.aClass589_1.method33297(local23);
		if (local45.aChar14 != local13) {
			throw new RuntimeException();
		}
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local45.method33084(local33) ? 1 : 0;
	}

	@OriginalMember(owner = "client!oj", name = "atb", descriptor = "(Lclient!vs;B)V", line = 12394)
	static final void method26916(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub30_1.method13948() ? 1 : 0;
	}
}
