package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public class Class165 implements Interface8, Interface9, Interface53 {

	@OriginalMember(owner = "client!f", name = "l", descriptor = "[Lclient!te;")
	final Class477[] aClass477Array1;

	@OriginalMember(owner = "client!f", name = "p", descriptor = "Lclient!sn;")
	public final Class460 aClass460_1;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "Lclient!ajd;")
	final Class70_Sub1_Sub1 aClass70_Sub1_Sub1_1;

	@OriginalMember(owner = "client!f", name = "g", descriptor = "Lclient!zy;")
	final Class70_Sub2 aClass70_Sub2_1;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lclient!ajd;Lclient!zy;I)V", line = 21)
	public Class165(@OriginalArg(0) Class70_Sub1_Sub1 arg0, @OriginalArg(1) Class70_Sub2 arg1, @OriginalArg(2) int arg2) {
		this.aClass477Array1 = new Class477[arg2];
		this.aClass460_1 = new Class460();
		this.aClass70_Sub1_Sub1_1 = arg0;
		this.aClass70_Sub2_1 = arg1;
	}

	@OriginalMember(owner = "client!f", name = "p", descriptor = "(II)I", line = 29)
	public int method23323(@OriginalArg(0) int arg0) {
		return this.aClass477Array1[arg0].method28800(client.aBoolean590 ? Class531.aClass531_2 : Class531.aClass531_1);
	}

	@OriginalMember(owner = "client!f", name = "j", descriptor = "(I)I", line = 29)
	public int method23326(@OriginalArg(0) int arg0) {
		return this.aClass477Array1[arg0].method28800(client.aBoolean590 ? Class531.aClass531_2 : Class531.aClass531_1);
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(I)I", line = 29)
	public int method23328(@OriginalArg(0) int arg0) {
		return this.aClass477Array1[arg0].method28800(client.aBoolean590 ? Class531.aClass531_2 : Class531.aClass531_1);
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(I)I", line = 29)
	public int method23329(@OriginalArg(0) int arg0) {
		return this.aClass477Array1[arg0].method28800(client.aBoolean590 ? Class531.aClass531_2 : Class531.aClass531_1);
	}

	@OriginalMember(owner = "client!f", name = "n", descriptor = "(I)I", line = 29)
	public int method23330(@OriginalArg(0) int arg0) {
		return this.aClass477Array1[arg0].method28800(client.aBoolean590 ? Class531.aClass531_2 : Class531.aClass531_1);
	}

	@OriginalMember(owner = "client!f", name = "z", descriptor = "(I)I", line = 29)
	public int method23334(@OriginalArg(0) int arg0) {
		return this.aClass477Array1[arg0].method28800(client.aBoolean590 ? Class531.aClass531_2 : Class531.aClass531_1);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II)I", line = 33)
	public int method23327(@OriginalArg(0) int arg0) {
		return this.aClass477Array1[arg0].method28812();
	}

	@OriginalMember(owner = "client!f", name = "e", descriptor = "(I)I", line = 33)
	public int method23331(@OriginalArg(0) int arg0) {
		return this.aClass477Array1[arg0].method28812();
	}

	@OriginalMember(owner = "client!f", name = "g", descriptor = "(IB)I", line = 37)
	@Override
	public int method23321(@OriginalArg(0) int arg0) {
		return this.aClass477Array1[arg0].method28811(client.aBoolean590 ? Class531.aClass531_2 : Class531.aClass531_1);
	}

	@OriginalMember(owner = "client!f", name = "r", descriptor = "(I)I", line = 37)
	@Override
	public int method23320(@OriginalArg(0) int arg0) {
		return this.aClass477Array1[arg0].method28811(client.aBoolean590 ? Class531.aClass531_2 : Class531.aClass531_1);
	}

	@OriginalMember(owner = "client!f", name = "d", descriptor = "(I)I", line = 37)
	@Override
	public int method23322(@OriginalArg(0) int arg0) {
		return this.aClass477Array1[arg0].method28811(client.aBoolean590 ? Class531.aClass531_2 : Class531.aClass531_1);
	}

	@OriginalMember(owner = "client!f", name = "l", descriptor = "(II)I", line = 41)
	public int method23324(@OriginalArg(0) int arg0) {
		return this.aClass477Array1[arg0].method28799();
	}

	@OriginalMember(owner = "client!f", name = "q", descriptor = "(I)I", line = 41)
	public int method23332(@OriginalArg(0) int arg0) {
		return this.aClass477Array1[arg0].method28799();
	}

	@OriginalMember(owner = "client!f", name = "h", descriptor = "(II)I", line = 45)
	public int method23325(@OriginalArg(0) int arg0) {
		return this.aClass477Array1[arg0].method28802();
	}

	@OriginalMember(owner = "client!f", name = "m", descriptor = "(I)I", line = 45)
	public int method23333(@OriginalArg(0) int arg0) {
		return this.aClass477Array1[arg0].method28802();
	}

	@OriginalMember(owner = "client!f", name = "x", descriptor = "(Lclient!nw;IB)Lclient!cy;", line = 49)
	@Override
	public Class11 method24295(@OriginalArg(0) Class43 arg0, @OriginalArg(1) int arg1) {
		return Class43.aClass43_68 == arg0 ? this.aClass70_Sub1_Sub1_1.method14717(arg1) : null;
	}

	@OriginalMember(owner = "client!f", name = "v", descriptor = "(Lclient!nw;I)Lclient!cy;", line = 49)
	@Override
	public Class11 method24297(@OriginalArg(0) Class43 arg0, @OriginalArg(1) int arg1) {
		return Class43.aClass43_68 == arg0 ? this.aClass70_Sub1_Sub1_1.method14717(arg1) : null;
	}

	@OriginalMember(owner = "client!f", name = "s", descriptor = "(II)Lclient!ky;", line = 54)
	@Override
	public Class290 method24296(@OriginalArg(0) int arg0) {
		@Pc(5) Class290 local5 = this.aClass70_Sub2_1.method33886(arg0);
		return local5.aClass11_1.aClass43_3 == Class43.aClass43_68 ? local5 : null;
	}

	@OriginalMember(owner = "client!f", name = "t", descriptor = "(I)Lclient!ky;", line = 54)
	@Override
	public Class290 method24298(@OriginalArg(0) int arg0) {
		@Pc(5) Class290 local5 = this.aClass70_Sub2_1.method33886(arg0);
		return local5.aClass11_1.aClass43_3 == Class43.aClass43_68 ? local5 : null;
	}

	@OriginalMember(owner = "client!f", name = "w", descriptor = "(Lclient!cy;)I", line = 60)
	@Override
	public int method32388(@OriginalArg(0) Class11 arg0) {
		return this.aClass460_1.method32385(arg0);
	}

	@OriginalMember(owner = "client!f", name = "o", descriptor = "(Lclient!cy;)I", line = 60)
	@Override
	public int method32386(@OriginalArg(0) Class11 arg0) {
		return this.aClass460_1.method32385(arg0);
	}

	@OriginalMember(owner = "client!f", name = "u", descriptor = "(Lclient!cy;B)I", line = 60)
	@Override
	public int method32385(@OriginalArg(0) Class11 arg0) {
		return this.aClass460_1.method32385(arg0);
	}

	@OriginalMember(owner = "client!f", name = "i", descriptor = "(Lclient!cy;)I", line = 60)
	@Override
	public int method32387(@OriginalArg(0) Class11 arg0) {
		return this.aClass460_1.method32385(arg0);
	}

	@OriginalMember(owner = "client!f", name = "y", descriptor = "(Lclient!ky;I)I", line = 64)
	@Override
	public int method32384(@OriginalArg(0) Class290 arg0) {
		return this.aClass460_1.method32384(arg0);
	}

	@OriginalMember(owner = "client!f", name = "f", descriptor = "(Lclient!ky;)I", line = 64)
	@Override
	public int method32383(@OriginalArg(0) Class290 arg0) {
		return this.aClass460_1.method32384(arg0);
	}

	@OriginalMember(owner = "client!f", name = "s", descriptor = "(Ljava/lang/CharSequence;IZB)I", line = 84)
	static int method23339(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (arg1 < 2 || arg1 > 36) {
			throw new IllegalArgumentException("" + arg1);
		}
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) int local23 = 0;
		@Pc(26) int local26 = arg0.length();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(35) char local35 = arg0.charAt(local28);
			if (local28 == 0) {
				if (local35 == '-') {
					local19 = true;
					continue;
				}
				if (local35 == '+' && arg2) {
					continue;
				}
			}
			@Pc(57) int local57;
			if (local35 >= '0' && local35 <= '9') {
				local57 = local35 - '0';
			} else if (local35 >= 'A' && local35 <= 'Z') {
				local57 = local35 - '7';
			} else if (local35 >= 'a' && local35 <= 'z') {
				local57 = local35 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local57 >= arg1) {
				throw new NumberFormatException();
			}
			if (local19) {
				local57 = -local57;
			}
			@Pc(96) int local96 = local57 + arg1 * local23;
			if (local23 != local96 / arg1) {
				throw new NumberFormatException();
			}
			local23 = local96;
			local21 = true;
		}
		if (!local21) {
			throw new NumberFormatException();
		}
		return local23;
	}

	@OriginalMember(owner = "client!f", name = "ka", descriptor = "(Lclient!vs;B)V", line = 6070)
	static final void method23335(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class245.method24868(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!f", name = "rn", descriptor = "(Lclient!vs;I)V", line = 7296)
	static final void method23336(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local16.anInt3554 * -1920517457;
	}

	@OriginalMember(owner = "client!f", name = "wi", descriptor = "(Lclient!vs;B)V", line = 8164)
	static final void method23337(@OriginalArg(0) Class536 arg0) {
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
		@Pc(59) int[] local59 = local45.method33085(local33);
		@Pc(61) int local61 = 0;
		if (local59 != null) {
			local61 = local59.length;
		}
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local61;
	}

	@OriginalMember(owner = "client!f", name = "auh", descriptor = "(Lclient!vs;I)V", line = 12492)
	static final void method23338(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub14_1.method14599(local12);
	}
}
