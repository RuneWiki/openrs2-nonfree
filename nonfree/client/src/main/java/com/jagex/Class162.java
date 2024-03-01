package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ex")
public class Class162 {

	@OriginalMember(owner = "client!ex", name = "po", descriptor = "I")
	static int anInt3446;

	@OriginalMember(owner = "client!ex", name = "p", descriptor = "[I")
	final int[] anIntArray348;

	@OriginalMember(owner = "client!ex", name = "a", descriptor = "[I")
	final int[] anIntArray344;

	@OriginalMember(owner = "client!ex", name = "g", descriptor = "[I")
	final int[] anIntArray345;

	@OriginalMember(owner = "client!ex", name = "l", descriptor = "[I")
	final int[] anIntArray343;

	@OriginalMember(owner = "client!ex", name = "h", descriptor = "[I")
	final int[] anIntArray347;

	@OriginalMember(owner = "client!ex", name = "x", descriptor = "[I")
	final int[] anIntArray346;

	@OriginalMember(owner = "client!ex", name = "s", descriptor = "[I")
	final int[] anIntArray349;

	@OriginalMember(owner = "client!ex", name = "<init>", descriptor = "(Lclient!ahb;)V", line = 15)
	Class162(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(5) int local5 = arg0.method20334();
		this.anIntArray348 = new int[local5];
		this.anIntArray344 = new int[local5];
		this.anIntArray345 = new int[local5];
		this.anIntArray343 = new int[local5];
		this.anIntArray347 = new int[local5];
		this.anIntArray346 = new int[local5];
		this.anIntArray349 = new int[local5];
		for (@Pc(35) int local35 = 0; local35 < local5; local35++) {
			this.anIntArray348[local35] = arg0.method20271() - 5120;
			this.anIntArray345[local35] = arg0.method20271() - 5120;
			this.anIntArray344[local35] = arg0.method20272();
			this.anIntArray347[local35] = arg0.method20271() - 5120;
			this.anIntArray349[local35] = arg0.method20271() - 5120;
			this.anIntArray346[local35] = arg0.method20272();
			this.anIntArray343[local35] = arg0.method20272();
		}
	}

	@OriginalMember(owner = "client!ex", name = "p", descriptor = "(II)V", line = 36)
	void method23268(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = new int[this.anIntArray348.length << 1][4];
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray348.length; local9++) {
			local7[local9 * 2][0] = this.anIntArray348[local9];
			local7[local9 * 2][1] = this.anIntArray344[local9];
			local7[local9 * 2][2] = this.anIntArray345[local9];
			local7[local9 * 2][3] = this.anIntArray343[local9];
			local7[local9 * 2 + 1][0] = this.anIntArray347[local9];
			local7[local9 * 2 + 1][1] = this.anIntArray346[local9];
			local7[local9 * 2 + 1][2] = this.anIntArray349[local9];
			local7[local9 * 2 + 1][3] = this.anIntArray343[local9];
		}
		client.anIntArrayArrayArray15[arg0] = local7;
	}

	@OriginalMember(owner = "client!ex", name = "a", descriptor = "(I)V", line = 36)
	void method23269(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = new int[this.anIntArray348.length << 1][4];
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray348.length; local9++) {
			local7[local9 * 2][0] = this.anIntArray348[local9];
			local7[local9 * 2][1] = this.anIntArray344[local9];
			local7[local9 * 2][2] = this.anIntArray345[local9];
			local7[local9 * 2][3] = this.anIntArray343[local9];
			local7[local9 * 2 + 1][0] = this.anIntArray347[local9];
			local7[local9 * 2 + 1][1] = this.anIntArray346[local9];
			local7[local9 * 2 + 1][2] = this.anIntArray349[local9];
			local7[local9 * 2 + 1][3] = this.anIntArray343[local9];
		}
		client.anIntArrayArrayArray15[arg0] = local7;
	}

	@OriginalMember(owner = "client!ex", name = "g", descriptor = "(I)V", line = 36)
	void method23270(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = new int[this.anIntArray348.length << 1][4];
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray348.length; local9++) {
			local7[local9 * 2][0] = this.anIntArray348[local9];
			local7[local9 * 2][1] = this.anIntArray344[local9];
			local7[local9 * 2][2] = this.anIntArray345[local9];
			local7[local9 * 2][3] = this.anIntArray343[local9];
			local7[local9 * 2 + 1][0] = this.anIntArray347[local9];
			local7[local9 * 2 + 1][1] = this.anIntArray346[local9];
			local7[local9 * 2 + 1][2] = this.anIntArray349[local9];
			local7[local9 * 2 + 1][3] = this.anIntArray343[local9];
		}
		client.anIntArrayArrayArray15[arg0] = local7;
	}

	@OriginalMember(owner = "client!ex", name = "bi", descriptor = "(Lclient!akp;ZB)V", line = 1518)
	static void method23273(@OriginalArg(0) Class26_Sub1_Sub1_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		if (Class250.anInt3811 * -1176041819 >= 405) {
			return;
		}
		if (arg0 != Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3) {
			@Pc(177) String local177;
			@Pc(66) boolean local66;
			@Pc(97) int local97;
			if (arg0.anInt2394 * 892718935 == 0) {
				local66 = true;
				if (Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.anInt2393 * 584311273 != -1 && arg0.anInt2393 * 584311273 != -1) {
					local97 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.anInt2393 * 584311273 < arg0.anInt2393 * 584311273 ? Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.anInt2393 * 584311273 : arg0.anInt2393 * 584311273;
					@Pc(107) int local107 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.anInt2391 * -841431615 - arg0.anInt2391 * -841431615;
					if (local107 < 0) {
						local107 = -local107;
					}
					if (local107 > local97) {
						local66 = false;
					}
				}
				@Pc(130) String local130 = client.aClass543_2 == Class543.aClass543_5 ? Class601.aClass601_53.method33512(Class469.aClass530_2) : Class601.aClass601_138.method33512(Class469.aClass530_2);
				if (arg0.anInt2391 * -841431615 >= arg0.anInt2390 * -745534159) {
					local177 = arg0.method16735(true) + (local66 ? Class340.method26440(arg0.anInt2391 * -841431615, Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.anInt2391 * -841431615) : Class271.method25310(16777215)) + Class1.aString1 + local130 + arg0.anInt2391 * -841431615 + Class1.aString7;
				} else {
					local177 = arg0.method16735(true) + (local66 ? Class340.method26440(arg0.anInt2391 * -841431615, Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.anInt2391 * -841431615) : Class271.method25310(16777215)) + Class1.aString1 + local130 + arg0.anInt2391 * -841431615 + "+" + (arg0.anInt2390 * -745534159 - arg0.anInt2391 * -841431615) + Class1.aString7;
				}
			} else if (arg0.anInt2394 * 892718935 == -1) {
				local177 = arg0.method16735(true);
			} else {
				local177 = arg0.method16735(true) + Class1.aString1 + Class601.aClass601_139.method33512(Class469.aClass530_2) + arg0.anInt2394 * 892718935 + Class1.aString7;
			}
			local66 = false;
			if (arg0.aClass488_1.anInt5185 * -945292479 != -1) {
				@Pc(283) Class571 local283 = Class498.aClass579_1.method33185(arg0.aClass488_1.anInt5185 * -945292479);
				if (local283.aBoolean837) {
					local66 = true;
					local177 = Class498.aClass579_1.method33185(arg0.aClass488_1.anInt5185 * -945292479).aString239;
					if (local283.anInt5396 * -2086699445 != 0) {
						@Pc(317) String local317 = Class543.aClass543_5 == client.aClass543_2 ? Class601.aClass601_53.method33512(Class469.aClass530_2) : Class601.aClass601_138.method33512(Class469.aClass530_2);
						local177 = local177 + Class340.method26440(local283.anInt5396 * -2086699445, Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.anInt2391 * -841431615) + Class1.aString1 + local317 + local283.anInt5396 * -2086699445 + Class1.aString7;
					}
				}
			}
			if (client.aBoolean596 && !arg1 && (anInt3446 * -1948586859 & 0x8) != 0) {
				Class531.method32488(client.aString153, client.aString152 + " " + Class1.aString2 + " " + Class271.method25310(16777215) + local177, Class484.anInt5179 * -823340541, 15, -1, (long) (arg0.anInt2355 * 144783765), 0, 0, true, false, (long) (arg0.anInt2355 * 144783765), false);
			}
			if (!arg1) {
				for (local97 = 7; local97 >= 0; local97--) {
					if (client.aStringArray9[local97] != null) {
						@Pc(409) short local409 = 0;
						if (client.aClass543_2 == Class543.aClass543_4 && client.aStringArray9[local97].equalsIgnoreCase(Class601.aClass601_113.method33512(Class469.aClass530_2))) {
							if (client.aBoolean597 && arg0.anInt2391 * -841431615 > Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.anInt2391 * -841431615) {
								local409 = 2000;
							}
							if (Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.anInt2392 * -1526069177 == 0 || arg0.anInt2392 * -1526069177 == 0) {
								if (arg0.aBoolean419) {
									local409 = 2000;
								}
							} else if (arg0.anInt2392 * -1526069177 == Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.anInt2392 * -1526069177) {
								local409 = 2000;
							} else {
								local409 = 0;
							}
						} else if (client.aBooleanArray20[local97]) {
							local409 = 2000;
						}
						@Pc(479) short local479 = (short) (local409 + client.aShortArray72[local97]);
						@Pc(492) int local492 = client.anIntArray310[local97] == -1 ? client.anInt3145 * 687914897 : client.anIntArray310[local97];
						@Pc(498) int local498 = local66 ? 16776960 : 16777215;
						Class531.method32488(client.aStringArray9[local97], Class271.method25310(local498) + local177, local492, local479, -1, (long) (arg0.anInt2355 * 144783765), 0, 0, true, false, (long) (arg0.anInt2355 * 144783765), false);
					}
				}
			} else if (!local66) {
				Class531.method32488(Class271.method25310(13421772) + local177, "", -1, -1, 0, 0L, 0, 0, false, true, (long) (arg0.anInt2355 * 144783765), false);
			}
			if (!arg1 && !local66) {
				for (@Pc(572) Class3_Sub1_Sub7 local572 = (Class3_Sub1_Sub7) Class250.aClass553_52.method32768(); local572 != null; local572 = (Class3_Sub1_Sub7) Class250.aClass553_52.method32709()) {
					if (local572.anInt2664 * 296027207 == 23) {
						local572.aString111 = Class271.method25310(16777215) + local177;
						break;
					}
				}
			}
		} else if (client.aBoolean596 && (anInt3446 * -1948586859 & 0x10) != 0) {
			Class531.method32488(client.aString153, client.aString152 + " " + Class1.aString2 + " " + Class271.method25310(16777215) + Class601.aClass601_149.method33512(Class469.aClass530_2), Class484.anInt5179 * -823340541, 16, -1, 0L, 0, 0, true, false, (long) (arg0.anInt2355 * 144783765), false);
		}
	}

	@OriginalMember(owner = "client!ex", name = "cs", descriptor = "(Lclient!vs;I)V", line = 4467)
	static final void method23271(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class464.method28626(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!ex", name = "abr", descriptor = "(Lclient!vs;B)V", line = 9015)
	static final void method23272(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class144.method23067((char) local12) ? 1 : 0;
	}
}
