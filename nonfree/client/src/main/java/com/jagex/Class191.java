package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public class Class191 {

	@OriginalMember(owner = "client!ga", name = "n", descriptor = "S")
	static short aShort161;

	@OriginalMember(owner = "client!ga", name = "p", descriptor = "Lclient!ga;")
	public static final Class191 aClass191_2 = new Class191(0, 104);

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "Lclient!ga;")
	static final Class191 aClass191_5 = new Class191(1, 120);

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "Lclient!ga;")
	static final Class191 aClass191_3 = new Class191(2, 136);

	@OriginalMember(owner = "client!ga", name = "l", descriptor = "Lclient!ga;")
	static final Class191 aClass191_1 = new Class191(3, 168);

	@OriginalMember(owner = "client!ga", name = "h", descriptor = "Lclient!ga;")
	static final Class191 aClass191_4 = new Class191(4, 72);

	@OriginalMember(owner = "client!ga", name = "x", descriptor = "I")
	public final int anInt3679;

	@OriginalMember(owner = "client!ga", name = "s", descriptor = "I")
	public final int anInt3680;

	@OriginalMember(owner = "client!ga", name = "h", descriptor = "()[Lclient!ga;", line = 14)
	static Class191[] method24052() {
		return new Class191[] { aClass191_4, aClass191_2, aClass191_1, aClass191_5, aClass191_3 };
	}

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "()[Lclient!ga;", line = 14)
	static Class191[] method24053() {
		return new Class191[] { aClass191_4, aClass191_2, aClass191_1, aClass191_5, aClass191_3 };
	}

	@OriginalMember(owner = "client!ga", name = "l", descriptor = "()[Lclient!ga;", line = 14)
	static Class191[] method24054() {
		return new Class191[] { aClass191_4, aClass191_2, aClass191_1, aClass191_5, aClass191_3 };
	}

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(II)V", line = 17)
	Class191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3679 = arg0 * -2050741813;
		this.anInt3680 = arg1 * -1640225885;
	}

	@OriginalMember(owner = "client!ga", name = "p", descriptor = "(Lclient!ny;Ljava/lang/String;ZB)Lclient!qy;", line = 18)
	public static Class421 method24060(@OriginalArg(0) Class359 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		@Pc(4) int local4 = arg0.method26687(arg1);
		if (local4 == -1) {
			return new Class421(0);
		}
		@Pc(17) int[] local17 = arg0.method26680(local4);
		@Pc(23) Class421 local23 = new Class421(local17.length);
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		while (true) {
			while (local25 < local23.anInt4846 * 721471911) {
				@Pc(45) Class3_Sub41 local45 = new Class3_Sub41(arg0.method26713(local4, local17[local27++]));
				@Pc(49) int local49 = local45.method20275();
				@Pc(53) int local53 = local45.method20271();
				@Pc(57) int local57 = local45.method20269();
				if (!arg2 && local57 == 1) {
					local23.anInt4846 -= -1271181801;
				} else {
					local23.anIntArray435[local25] = local49;
					local23.anIntArray434[local25] = local53;
					local25++;
				}
			}
			return local23;
		}
	}

	@OriginalMember(owner = "client!ga", name = "x", descriptor = "(I)Lclient!ga;", line = 24)
	public static Class191 method24055(@OriginalArg(0) int arg0) {
		@Pc(2) Class191[] local2 = Class414.method27751();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class191 local12 = local2[local4];
			if (arg0 == local12.anInt3679 * -356338717) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ga", name = "s", descriptor = "(I)Lclient!ga;", line = 24)
	public static Class191 method24056(@OriginalArg(0) int arg0) {
		@Pc(2) Class191[] local2 = Class414.method27751();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class191 local12 = local2[local4];
			if (arg0 == local12.anInt3679 * -356338717) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ga", name = "l", descriptor = "(I)V", line = 80)
	public static void method24057() {
		Class2.anInt1 = -510043045;
	}

	@OriginalMember(owner = "client!ga", name = "s", descriptor = "(Lclient!de;II)Z", line = 97)
	static boolean method24062(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1) {
		arg0.method17028();
		Class176.method23413();
		if (!arg0.method17104()) {
			return false;
		}
		@Pc(14) int local14 = client.aClass370_1.method26943();
		@Pc(18) int local18 = client.aClass370_1.method27062();
		@Pc(22) Class346 local22 = client.aClass370_1.method27075();
		@Pc(26) Class438 local26 = client.aClass370_1.method26950();
		@Pc(28) int local28 = arg1;
		if (Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3 != null) {
			@Pc(38) int local38 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.anIntArray241[0] >> 3;
			@Pc(45) int local45 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.anIntArray239[0] >> 3;
			if (local38 >= 0 && local38 < Class72_Sub1.aBooleanArrayArray11.length && local45 >= 0 && local45 < Class72_Sub1.aBooleanArrayArray11[local38].length && Class72_Sub1.aBooleanArrayArray11[local38][local45]) {
				local28 = 0;
			}
		}
		@Pc(71) int local71 = local14 / 2;
		@Pc(73) byte local73 = 0;
		@Pc(75) byte local75 = 0;
		@Pc(77) boolean local77 = true;
		@Pc(79) int local79;
		@Pc(93) int local93;
		for (local79 = local73; local79 < local14 + local73; local79++) {
			for (@Pc(86) int local86 = local75; local86 < local18 + local75; local86++) {
				for (local93 = local28; local93 <= 3; local93++) {
					if (local93 < arg1 || local22.method26501(arg1, local93, local79, local86)) {
						@Pc(109) int local109 = local93;
						if (local22.method26504(local79, local86)) {
							local109 = local93 - 1;
						}
						if (local109 >= 0) {
							local77 &= Class421.method27853(local109, local79, local86);
						}
					}
				}
			}
		}
		if (!local77) {
			return false;
		}
		local79 = local14 * 4 + 48 + 48;
		@Pc(149) int[] local149 = new int[local79 * local79];
		for (local93 = 0; local93 < local149.length; local93++) {
			local149[local93] = 0;
		}
		@Pc(163) Class19_Sub1 local163 = null;
		@Pc(165) byte local165 = 0;
		@Pc(167) byte local167 = 0;
		if (Class2.aBoolean2) {
			Class602.aClass6_37 = arg0.method17086(local79, local79, false, true);
			local163 = arg0.method17047();
			local163.method20882(0, Class602.aClass6_37.method16835());
			@Pc(189) Interface13 local189 = arg0.method17049(local79, local79);
			local163.method20880(local189);
			arg0.method17044(local163);
			local71 = local14;
			local165 = 48;
			local167 = 48;
			arg0.method17061(1, 0);
		} else {
			Class602.aClass6_37 = arg0.method17113(local149, 0, local79, local79, local79);
		}
		client.aClass370_1.method26953().method28890();
		@Pc(254) int local254 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10) | 0xFF000000;
		@Pc(267) int local267 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(286) int local286 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
		@Pc(298) boolean[][] local298 = new boolean[local71 + 1 + 2][local71 + 1 + 2];
		@Pc(314) int local314;
		@Pc(316) int local316;
		@Pc(318) int local318;
		@Pc(324) int local324;
		for (@Pc(300) int local300 = local73; local300 < local73 + local14; local300 += local71) {
			for (@Pc(307) int local307 = local75; local307 < local75 + local18; local307 += local71) {
				local314 = local165;
				local316 = local167;
				local318 = local300;
				if (local300 > 0) {
					local318 = local300 - 1;
					local314 = local165 + 4;
				}
				local324 = local307;
				if (local307 > 0) {
					local324 = local307 - 1;
				}
				@Pc(331) int local331 = local71 + local300;
				if (local331 < local14) {
					local331++;
				}
				@Pc(339) int local339 = local71 + local307;
				if (local339 < local18) {
					local339++;
					local316 = local167 + 4;
				}
				if (Class2.aBoolean1) {
					arg0.method17056();
				} else {
					arg0.method17079(0, 0, local314 + local71 * 4, local71 * 4 + local316);
				}
				arg0.method17061(3, -16777216);
				@Pc(369) int local369 = local71;
				if (local71 > local14 - 1) {
					local369 = local14 - 1;
				}
				for (@Pc(380) int local380 = local28; local380 <= 3; local380++) {
					@Pc(385) int local385;
					@Pc(390) int local390;
					for (local385 = 0; local385 <= local369; local385++) {
						for (local390 = 0; local390 <= local369; local390++) {
							local298[local385][local390] = local380 < arg1 || local22.method26501(arg1, local380, local385 + local318, local324 + local390);
						}
					}
					local26.aClass17Array1[local380].method3545(local165, local167, 1024, local318, local324, local331, local339, local298);
					for (local385 = -4; local385 < local71; local385++) {
						for (local390 = -4; local390 < local71; local390++) {
							@Pc(447) int local447 = local385 + local300;
							@Pc(451) int local451 = local307 + local390;
							if (local447 >= local73 && local451 >= local75 && (local380 < arg1 || local22.method26501(arg1, local380, local447, local451))) {
								@Pc(470) int local470 = local380;
								if (local22.method26504(local447, local451)) {
									local470 = local380 - 1;
								}
								if (local470 >= 0) {
									Class531.method32491(arg0, local470, local447, local451, local314 + local385 * 4, local316 + (local71 - local390) * 4 - 4, local254, local267);
								}
							}
						}
					}
				}
				arg0.method17050(local314, local316, local71 * 4, local71 * 4, local286, 2);
				arg0.method17028();
				if (!Class2.aBoolean2) {
					Class602.aClass6_37.method16795((local300 - local73) * 4 + 48, local18 * 4 + 48 - (local307 - local75) * 4 - local71 * 4, local71 * 4, local71 * 4, local314, local316);
					if (Class2.aBoolean1) {
						Class602.aClass6_37.method16783(256, 0);
						try {
							arg0.method17017();
							Class60_Sub11.method13407(2000L);
						} catch (@Pc(568) Exception local568) {
						}
					}
				}
			}
		}
		if (Class2.aBoolean2) {
			arg0.method17263(local163);
			if (Class2.aBoolean1) {
				Class602.aClass6_37.method16783(256, 0);
				try {
					arg0.method17017();
					Class60_Sub11.method13407(2000L);
				} catch (@Pc(597) Exception local597) {
				}
			}
		}
		arg0.method17056();
		arg0.method17061(1, 1);
		Class401.method27608();
		Class2.anInt3 = 0;
		Class2.aClass553_1.method32701();
		if (!Class2.aBoolean3) {
			Class3_Sub10.method11192(arg1);
			@Pc(619) Class421 local619 = client.aClass370_1.method26945();
			if (local619 != null) {
				Class107.aClass454_3.method28439(1024, 64);
				@Pc(630) Class464 local630 = client.aClass370_1.method26942();
				for (local314 = 0; local314 < local619.anInt4846 * 721471911; local314++) {
					local316 = local619.anIntArray435[local314];
					if (local316 >> 28 == Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101) {
						local318 = (local316 >> 14 & 0x3FFF) - local630.anInt5071 * -1567811631;
						local324 = (local316 & 0x3FFF) - local630.anInt5073 * 1360175441;
						if (local318 >= 0 && local318 < local14 && local324 >= 0 && local324 < local18) {
							Class2.aClass553_1.method32702(new Class3_Sub21(local314));
						} else {
							@Pc(695) Class452 local695 = Class107.aClass454_3.method28448(local619.anIntArray434[local314]);
							if (local695.anIntArray458 != null && local318 + local695.anInt5029 * -1797323007 >= 0 && local695.anInt5044 * 931070665 + local318 < local14 && local695.anInt5037 * 294573617 + local324 >= 0 && local695.anInt5045 * -1023948257 + local324 < local18) {
								Class2.aClass553_1.method32702(new Class3_Sub21(local314));
							}
						}
					}
				}
				Class107.aClass454_3.method28439(128, 64);
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ga", name = "m", descriptor = "(Ljava/lang/String;S)V", line = 167)
	static void method24061(@OriginalArg(0) String arg0) {
		Class415.aClass547_1 = Class547.aClass547_4;
		Class603.aString246 = arg0;
	}

	@OriginalMember(owner = "client!ga", name = "sb", descriptor = "(Lclient!vs;B)V", line = 7412)
	static final void method24058(@OriginalArg(0) Class536 arg0) {
		@Pc(14) Class178 local14 = Class375.method27235(arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]);
		if (local14.aClass178Array5 == null) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
			return;
		}
		@Pc(38) int local38 = local14.aClass178Array5.length;
		for (@Pc(40) int local40 = 0; local40 < local14.aClass178Array5.length; local40++) {
			if (local14.aClass178Array5[local40] == null) {
				local38 = local40;
				break;
			}
		}
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local38;
	}

	@OriginalMember(owner = "client!ga", name = "ahs", descriptor = "(Lclient!vs;I)V", line = 10224)
	static final void method24059(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(28) boolean local28 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1] == 1;
		if (!Class44.method15137(local13, local28)) {
			throw new RuntimeException();
		}
	}
}
