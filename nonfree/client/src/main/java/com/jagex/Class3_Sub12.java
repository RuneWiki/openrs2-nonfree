package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afv")
public class Class3_Sub12 extends Class3 {

	@OriginalMember(owner = "client!afv", name = "c", descriptor = "I")
	int anInt1224;

	@OriginalMember(owner = "client!afv", name = "l", descriptor = "Lclient!abt;")
	final Class21_Sub2 aClass21_Sub2_29;

	@OriginalMember(owner = "client!afv", name = "x", descriptor = "Lclient!afz;")
	final Class3_Sub15 aClass3_Sub15_1;

	@OriginalMember(owner = "client!afv", name = "h", descriptor = "Lclient!abh;")
	final Class17_Sub1 aClass17_Sub1_2;

	@OriginalMember(owner = "client!afv", name = "s", descriptor = "I")
	int anInt1222;

	@OriginalMember(owner = "client!afv", name = "u", descriptor = "I")
	int anInt1221;

	@OriginalMember(owner = "client!afv", name = "y", descriptor = "I")
	int anInt1223;

	@OriginalMember(owner = "client!afv", name = "b", descriptor = "I")
	int anInt1226;

	@OriginalMember(owner = "client!afv", name = "d", descriptor = "[[F")
	float[][] aFloatArrayArray15;

	@OriginalMember(owner = "client!afv", name = "q", descriptor = "[[F")
	float[][] aFloatArrayArray13;

	@OriginalMember(owner = "client!afv", name = "m", descriptor = "[[F")
	float[][] aFloatArrayArray14;

	@OriginalMember(owner = "client!afv", name = "z", descriptor = "I")
	int anInt1225;

	@OriginalMember(owner = "client!afv", name = "v", descriptor = "Lclient!ahb;")
	Class3_Sub41 aClass3_Sub41_7;

	@OriginalMember(owner = "client!afv", name = "t", descriptor = "Lclient!anx;")
	Class3_Sub41_Sub2 aClass3_Sub41_Sub2_2;

	@OriginalMember(owner = "client!afv", name = "w", descriptor = "Lclient!xn;")
	Class581 aClass581_7;

	@OriginalMember(owner = "client!afv", name = "j", descriptor = "Lclient!cq;")
	final Interface7 anInterface7_3;

	@OriginalMember(owner = "client!afv", name = "n", descriptor = "Lclient!bu;")
	final Interface5 anInterface5_5;

	@OriginalMember(owner = "client!afv", name = "e", descriptor = "Lclient!bc;")
	final Class88 aClass88_12;

	@OriginalMember(owner = "client!afv", name = "r", descriptor = "Lclient!bc;")
	final Class88 aClass88_13;

	@OriginalMember(owner = "client!afv", name = "<init>", descriptor = "(Lclient!abt;Lclient!abh;Lclient!afz;[I)V", line = 31)
	Class3_Sub12(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) Class17_Sub1 arg1, @OriginalArg(2) Class3_Sub15 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass21_Sub2_29 = arg0;
		this.aClass3_Sub15_1 = arg2;
		this.aClass17_Sub1_2 = arg1;
		@Pc(22) int local22 = this.aClass3_Sub15_1.method11291() - (arg1.anInt338 * 76934957 >> 1);
		this.anInt1222 = this.aClass3_Sub15_1.method11280() - local22 >> arg1.anInt336 * 1371852633;
		this.anInt1221 = this.aClass3_Sub15_1.method11280() + local22 >> arg1.anInt336 * 1371852633;
		this.anInt1223 = this.aClass3_Sub15_1.method11282() - local22 >> arg1.anInt336 * 1371852633;
		this.anInt1226 = this.aClass3_Sub15_1.method11282() + local22 >> arg1.anInt336 * 1371852633;
		@Pc(82) int local82 = this.anInt1221 - this.anInt1222 + 1;
		@Pc(90) int local90 = this.anInt1226 - this.anInt1223 + 1;
		this.aFloatArrayArray15 = new float[local82 + 1][local90 + 1];
		this.aFloatArrayArray13 = new float[local82 + 1][local90 + 1];
		this.aFloatArrayArray14 = new float[local82 + 1][local90 + 1];
		@Pc(119) int local119;
		@Pc(127) int local127;
		@Pc(140) int local140;
		@Pc(148) int local148;
		@Pc(175) int local175;
		@Pc(191) int local191;
		for (local119 = 0; local119 <= local90; local119++) {
			local127 = local119 + this.anInt1223;
			if (local127 > 0 && local127 < this.aClass17_Sub1_2.anInt337 * -207323189 - 1) {
				for (local140 = 0; local140 <= local82; local140++) {
					local148 = local140 + this.anInt1222;
					if (local148 > 0 && local148 < this.aClass17_Sub1_2.anInt339 * -1007974723 - 1) {
						local175 = arg1.method3548(local148 + 1, local127) - arg1.method3548(local148 - 1, local127);
						local191 = arg1.method3548(local148, local127 + 1) - arg1.method3548(local148, local127 - 1);
						@Pc(206) float local206 = (float) (1.0D / Math.sqrt((double) (local175 * local175 + 65536 + local191 * local191)));
						this.aFloatArrayArray15[local140][local119] = (float) local175 * local206;
						this.aFloatArrayArray13[local140][local119] = -256.0F * local206;
						this.aFloatArrayArray14[local140][local119] = (float) local191 * local206;
					}
				}
			}
		}
		local119 = 0;
		for (local127 = this.anInt1223; local127 <= this.anInt1226; local127++) {
			if (local127 >= 0 && local127 < arg1.anInt337 * -207323189) {
				for (local140 = this.anInt1222; local140 <= this.anInt1221; local140++) {
					if (local140 >= 0 && local140 < arg1.anInt339 * -1007974723) {
						local148 = arg3[local119];
						@Pc(282) int[] local282 = arg1.anIntArrayArrayArray3[local140][local127];
						if (local282 != null && local148 != 0) {
							if (local148 == 1) {
								for (local191 = 0; local191 < local282.length; local191 += 3) {
									if (local282[local191] != -1 && local282[local191 + 1] != -1 && local282[local191 + 2] != -1) {
										this.anInt1225 += 3;
									}
								}
							} else {
								this.anInt1225 += 3;
							}
						}
					}
					local119++;
				}
			} else {
				local119 += this.anInt1221 - this.anInt1222;
			}
		}
		if (this.anInt1225 > 0) {
			this.aClass3_Sub41_7 = new Class3_Sub41(this.anInt1225 * 2);
			this.aClass3_Sub41_Sub2_2 = new Class3_Sub41_Sub2(this.anInt1225 * 16);
			this.aClass581_7 = new Class581(Class302.method25670(this.anInt1225));
			local127 = 0;
			local119 = 0;
			for (local140 = this.anInt1223; local140 <= this.anInt1226; local140++) {
				if (local140 >= 0 && local140 < arg1.anInt337 * -207323189) {
					local148 = 0;
					for (local175 = this.anInt1222; local175 <= this.anInt1221; local175++) {
						if (local175 >= 0 && local175 < arg1.anInt339 * -1007974723) {
							local191 = arg3[local119];
							@Pc(420) int[] local420 = arg1.anIntArrayArrayArray3[local175][local140];
							if (local420 != null && local191 != 0) {
								if (local191 == 1) {
									@Pc(434) int[] local434 = arg1.anIntArrayArrayArray6[local175][local140];
									@Pc(441) int[] local441 = arg1.anIntArrayArrayArray4[local175][local140];
									@Pc(443) int local443 = 0;
									label110: while (true) {
										while (true) {
											if (local443 >= local420.length) {
												break label110;
											}
											if (local420[local443] == -1 || local420[local443 + 1] == -1 || local420[local443 + 2] == -1) {
												local443 += 3;
											} else {
												this.method11220(local148, local127, local175, local140, local434[local443], local441[local443]);
												local443++;
												this.method11220(local148, local127, local175, local140, local434[local443], local441[local443]);
												local443++;
												this.method11220(local148, local127, local175, local140, local434[local443], local441[local443]);
												local443++;
											}
										}
									}
								} else if (local191 == 3) {
									this.method11220(local148, local127, local175, local140, 0, 0);
									this.method11220(local148, local127, local175, local140, arg1.anInt338 * 76934957, 0);
									this.method11220(local148, local127, local175, local140, 0, arg1.anInt338 * 76934957);
								} else if (local191 == 2) {
									this.method11220(local148, local127, local175, local140, arg1.anInt338 * 76934957, 0);
									this.method11220(local148, local127, local175, local140, arg1.anInt338 * 76934957, arg1.anInt338 * 76934957);
									this.method11220(local148, local127, local175, local140, 0, 0);
								} else if (local191 == 5) {
									this.method11220(local148, local127, local175, local140, arg1.anInt338 * 76934957, arg1.anInt338 * 76934957);
									this.method11220(local148, local127, local175, local140, 0, arg1.anInt338 * 76934957);
									this.method11220(local148, local127, local175, local140, arg1.anInt338 * 76934957, 0);
								} else if (local191 == 4) {
									this.method11220(local148, local127, local175, local140, 0, arg1.anInt338 * 76934957);
									this.method11220(local148, local127, local175, local140, 0, 0);
									this.method11220(local148, local127, local175, local140, arg1.anInt338 * 76934957, arg1.anInt338 * 76934957);
								}
							}
						}
						local119++;
						local148++;
					}
				} else {
					local119 += this.anInt1221 - this.anInt1222;
				}
				local127++;
			}
			this.anInterface7_3 = this.aClass21_Sub2_29.method4060(5123, this.aClass3_Sub41_7.aByteArray51, this.aClass3_Sub41_7.anInt2803 * 62066237, false);
			this.anInterface5_5 = this.aClass21_Sub2_29.method4027(16, this.aClass3_Sub41_Sub2_2.aByteArray51, this.aClass3_Sub41_Sub2_2.anInt2803 * 62066237, false);
			this.aClass88_12 = new Class88(this.anInterface5_5, 5126, 3, 0);
			this.aClass88_13 = new Class88(this.anInterface5_5, 5121, 4, 12);
		} else {
			this.anInterface7_3 = null;
			this.anInterface5_5 = null;
			this.aClass88_12 = null;
			this.aClass88_13 = null;
		}
		this.aClass3_Sub41_Sub2_2 = null;
		this.aClass3_Sub41_7 = null;
		this.aClass581_7 = null;
		this.aFloatArrayArray14 = null;
		this.aFloatArrayArray13 = null;
		this.aFloatArrayArray15 = null;
	}

	@OriginalMember(owner = "client!afv", name = "p", descriptor = "(S)V", line = 162)
	void method11219(@OriginalArg(0) short arg0) {
		if (this.aClass21_Sub2_29.aBoolean63) {
			this.aClass3_Sub41_7.method20251(arg0);
		} else {
			this.aClass3_Sub41_7.method20442(arg0);
		}
	}

	@OriginalMember(owner = "client!afv", name = "l", descriptor = "(S)V", line = 162)
	void method11224(@OriginalArg(0) short arg0) {
		if (this.aClass21_Sub2_29.aBoolean63) {
			this.aClass3_Sub41_7.method20251(arg0);
		} else {
			this.aClass3_Sub41_7.method20442(arg0);
		}
	}

	@OriginalMember(owner = "client!afv", name = "s", descriptor = "(IIIIII)V", line = 167)
	void method11218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) long local1 = -1L;
		@Pc(11) int local11 = arg4 + (arg2 << this.aClass17_Sub1_2.anInt336 * 1371852633);
		@Pc(21) int local21 = arg5 + (arg3 << this.aClass17_Sub1_2.anInt336 * 1371852633);
		@Pc(28) int local28 = this.aClass17_Sub1_2.method3583(local11, local21);
		if ((arg4 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local1 = ((long) local21 & 0xFFFFL) << 16 | (long) local11 & 0xFFFFL;
			@Pc(54) Class3_Sub34 local54 = (Class3_Sub34) this.aClass581_7.method33217(local1);
			if (local54 != null) {
				this.method11219(local54.aShort63);
				return;
			}
		}
		@Pc(70) short local70 = (short) this.anInt1224++;
		if (local1 != -1L) {
			this.aClass581_7.method33241(new Class3_Sub34(local70), local1);
		}
		@Pc(93) float local93;
		@Pc(100) float local100;
		@Pc(107) float local107;
		@Pc(240) float local240;
		@Pc(250) float local250;
		@Pc(257) float local257;
		@Pc(264) float local264;
		@Pc(271) float local271;
		@Pc(280) float local280;
		@Pc(289) float local289;
		@Pc(298) float local298;
		if (arg4 == 0 && arg5 == 0) {
			local93 = this.aFloatArrayArray15[arg0][arg1];
			local100 = this.aFloatArrayArray13[arg0][arg1];
			local107 = this.aFloatArrayArray14[arg0][arg1];
		} else if (arg4 == this.aClass17_Sub1_2.anInt338 * 76934957 && arg5 == 0) {
			local93 = this.aFloatArrayArray15[arg0 + 1][arg1];
			local100 = this.aFloatArrayArray13[arg0 + 1][arg1];
			local107 = this.aFloatArrayArray14[arg0 + 1][arg1];
		} else if (arg4 == this.aClass17_Sub1_2.anInt338 * 76934957 && arg5 == this.aClass17_Sub1_2.anInt338 * 76934957) {
			local93 = this.aFloatArrayArray15[arg0 + 1][arg1 + 1];
			local100 = this.aFloatArrayArray13[arg0 + 1][arg1 + 1];
			local107 = this.aFloatArrayArray14[arg0 + 1][arg1 + 1];
		} else if (arg4 == 0 && arg5 == this.aClass17_Sub1_2.anInt338 * 76934957) {
			local93 = this.aFloatArrayArray15[arg0][arg1 + 1];
			local100 = this.aFloatArrayArray13[arg0][arg1 + 1];
			local107 = this.aFloatArrayArray14[arg0][arg1 + 1];
		} else {
			local240 = (float) arg4 / (float) (this.aClass17_Sub1_2.anInt338 * 76934957);
			local250 = (float) arg5 / (float) (this.aClass17_Sub1_2.anInt338 * 76934957);
			local257 = this.aFloatArrayArray15[arg0][arg1];
			local264 = this.aFloatArrayArray13[arg0][arg1];
			local271 = this.aFloatArrayArray14[arg0][arg1];
			local280 = this.aFloatArrayArray15[arg0 + 1][arg1];
			local289 = this.aFloatArrayArray13[arg0 + 1][arg1];
			local298 = this.aFloatArrayArray14[arg0 + 1][arg1];
			@Pc(313) float local313 = local257 + (this.aFloatArrayArray15[arg0][arg1 + 1] - local257) * local240;
			@Pc(328) float local328 = local264 + (this.aFloatArrayArray13[arg0][arg1 + 1] - local264) * local240;
			@Pc(343) float local343 = local271 + (this.aFloatArrayArray14[arg0][arg1 + 1] - local271) * local240;
			@Pc(360) float local360 = local280 + (this.aFloatArrayArray15[arg0 + 1][arg1 + 1] - local280) * local240;
			@Pc(377) float local377 = local289 + (this.aFloatArrayArray13[arg0 + 1][arg1 + 1] - local289) * local240;
			@Pc(394) float local394 = local298 + (this.aFloatArrayArray14[arg0 + 1][arg1 + 1] - local298) * local240;
			local93 = local313 + (local360 - local313) * local250;
			local100 = local328 + (local377 - local328) * local250;
			local107 = local343 + (local394 - local343) * local250;
		}
		local240 = this.aClass3_Sub15_1.method11280() - local11;
		local250 = this.aClass3_Sub15_1.method11281() - local28;
		local257 = this.aClass3_Sub15_1.method11282() - local21;
		local264 = (float) Math.sqrt((double) (local240 * local240 + local250 * local250 + local257 * local257));
		local271 = 1.0F / local264;
		local240 *= local271;
		local250 *= local271;
		local257 *= local271;
		local280 = local264 / (float) this.aClass3_Sub15_1.method11291();
		local289 = 1.0F - local280 * local280;
		if (local289 < 0.0F) {
			local289 = 0.0F;
		}
		local298 = local240 * local93 + local250 * local100 + local257 * local107;
		if (local298 < 0.0F) {
			local298 = 0.0F;
		}
		@Pc(517) float local517 = local298 * local289 * 2.0F;
		if (local517 > 1.0F) {
			local517 = 1.0F;
		}
		@Pc(528) int local528 = this.aClass3_Sub15_1.method11279();
		@Pc(538) int local538 = (int) (local517 * (float) (local528 >> 16 & 0xFF));
		if (local538 > 255) {
			local538 = 255;
		}
		@Pc(553) int local553 = (int) (local517 * (float) (local528 >> 8 & 0xFF));
		if (local553 > 255) {
			local553 = 255;
		}
		@Pc(566) int local566 = (int) (local517 * (float) (local528 & 0xFF));
		if (local566 > 255) {
			local566 = 255;
		}
		if (this.aClass21_Sub2_29.aBoolean63) {
			this.aClass3_Sub41_Sub2_2.method20474((float) local11);
			this.aClass3_Sub41_Sub2_2.method20474((float) local28);
			this.aClass3_Sub41_Sub2_2.method20474((float) local21);
		} else {
			this.aClass3_Sub41_Sub2_2.method20475((float) local11);
			this.aClass3_Sub41_Sub2_2.method20475((float) local28);
			this.aClass3_Sub41_Sub2_2.method20475((float) local21);
		}
		this.aClass3_Sub41_Sub2_2.method20250(local538);
		this.aClass3_Sub41_Sub2_2.method20250(local553);
		this.aClass3_Sub41_Sub2_2.method20250(local566);
		this.aClass3_Sub41_Sub2_2.method20250(255);
		this.method11219(local70);
	}

	@OriginalMember(owner = "client!afv", name = "a", descriptor = "(IIIIII)V", line = 167)
	void method11220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) long local1 = -1L;
		@Pc(11) int local11 = arg4 + (arg2 << this.aClass17_Sub1_2.anInt336 * 1371852633);
		@Pc(21) int local21 = arg5 + (arg3 << this.aClass17_Sub1_2.anInt336 * 1371852633);
		@Pc(28) int local28 = this.aClass17_Sub1_2.method3583(local11, local21);
		if ((arg4 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local1 = ((long) local21 & 0xFFFFL) << 16 | (long) local11 & 0xFFFFL;
			@Pc(54) Class3_Sub34 local54 = (Class3_Sub34) this.aClass581_7.method33217(local1);
			if (local54 != null) {
				this.method11219(local54.aShort63);
				return;
			}
		}
		@Pc(70) short local70 = (short) this.anInt1224++;
		if (local1 != -1L) {
			this.aClass581_7.method33241(new Class3_Sub34(local70), local1);
		}
		@Pc(93) float local93;
		@Pc(100) float local100;
		@Pc(107) float local107;
		@Pc(240) float local240;
		@Pc(250) float local250;
		@Pc(257) float local257;
		@Pc(264) float local264;
		@Pc(271) float local271;
		@Pc(280) float local280;
		@Pc(289) float local289;
		@Pc(298) float local298;
		if (arg4 == 0 && arg5 == 0) {
			local93 = this.aFloatArrayArray15[arg0][arg1];
			local100 = this.aFloatArrayArray13[arg0][arg1];
			local107 = this.aFloatArrayArray14[arg0][arg1];
		} else if (arg4 == this.aClass17_Sub1_2.anInt338 * 76934957 && arg5 == 0) {
			local93 = this.aFloatArrayArray15[arg0 + 1][arg1];
			local100 = this.aFloatArrayArray13[arg0 + 1][arg1];
			local107 = this.aFloatArrayArray14[arg0 + 1][arg1];
		} else if (arg4 == this.aClass17_Sub1_2.anInt338 * 76934957 && arg5 == this.aClass17_Sub1_2.anInt338 * 76934957) {
			local93 = this.aFloatArrayArray15[arg0 + 1][arg1 + 1];
			local100 = this.aFloatArrayArray13[arg0 + 1][arg1 + 1];
			local107 = this.aFloatArrayArray14[arg0 + 1][arg1 + 1];
		} else if (arg4 == 0 && arg5 == this.aClass17_Sub1_2.anInt338 * 76934957) {
			local93 = this.aFloatArrayArray15[arg0][arg1 + 1];
			local100 = this.aFloatArrayArray13[arg0][arg1 + 1];
			local107 = this.aFloatArrayArray14[arg0][arg1 + 1];
		} else {
			local240 = (float) arg4 / (float) (this.aClass17_Sub1_2.anInt338 * 76934957);
			local250 = (float) arg5 / (float) (this.aClass17_Sub1_2.anInt338 * 76934957);
			local257 = this.aFloatArrayArray15[arg0][arg1];
			local264 = this.aFloatArrayArray13[arg0][arg1];
			local271 = this.aFloatArrayArray14[arg0][arg1];
			local280 = this.aFloatArrayArray15[arg0 + 1][arg1];
			local289 = this.aFloatArrayArray13[arg0 + 1][arg1];
			local298 = this.aFloatArrayArray14[arg0 + 1][arg1];
			@Pc(313) float local313 = local257 + (this.aFloatArrayArray15[arg0][arg1 + 1] - local257) * local240;
			@Pc(328) float local328 = local264 + (this.aFloatArrayArray13[arg0][arg1 + 1] - local264) * local240;
			@Pc(343) float local343 = local271 + (this.aFloatArrayArray14[arg0][arg1 + 1] - local271) * local240;
			@Pc(360) float local360 = local280 + (this.aFloatArrayArray15[arg0 + 1][arg1 + 1] - local280) * local240;
			@Pc(377) float local377 = local289 + (this.aFloatArrayArray13[arg0 + 1][arg1 + 1] - local289) * local240;
			@Pc(394) float local394 = local298 + (this.aFloatArrayArray14[arg0 + 1][arg1 + 1] - local298) * local240;
			local93 = local313 + (local360 - local313) * local250;
			local100 = local328 + (local377 - local328) * local250;
			local107 = local343 + (local394 - local343) * local250;
		}
		local240 = this.aClass3_Sub15_1.method11280() - local11;
		local250 = this.aClass3_Sub15_1.method11281() - local28;
		local257 = this.aClass3_Sub15_1.method11282() - local21;
		local264 = (float) Math.sqrt((double) (local240 * local240 + local250 * local250 + local257 * local257));
		local271 = 1.0F / local264;
		local240 *= local271;
		local250 *= local271;
		local257 *= local271;
		local280 = local264 / (float) this.aClass3_Sub15_1.method11291();
		local289 = 1.0F - local280 * local280;
		if (local289 < 0.0F) {
			local289 = 0.0F;
		}
		local298 = local240 * local93 + local250 * local100 + local257 * local107;
		if (local298 < 0.0F) {
			local298 = 0.0F;
		}
		@Pc(517) float local517 = local298 * local289 * 2.0F;
		if (local517 > 1.0F) {
			local517 = 1.0F;
		}
		@Pc(528) int local528 = this.aClass3_Sub15_1.method11279();
		@Pc(538) int local538 = (int) (local517 * (float) (local528 >> 16 & 0xFF));
		if (local538 > 255) {
			local538 = 255;
		}
		@Pc(553) int local553 = (int) (local517 * (float) (local528 >> 8 & 0xFF));
		if (local553 > 255) {
			local553 = 255;
		}
		@Pc(566) int local566 = (int) (local517 * (float) (local528 & 0xFF));
		if (local566 > 255) {
			local566 = 255;
		}
		if (this.aClass21_Sub2_29.aBoolean63) {
			this.aClass3_Sub41_Sub2_2.method20474((float) local11);
			this.aClass3_Sub41_Sub2_2.method20474((float) local28);
			this.aClass3_Sub41_Sub2_2.method20474((float) local21);
		} else {
			this.aClass3_Sub41_Sub2_2.method20475((float) local11);
			this.aClass3_Sub41_Sub2_2.method20475((float) local28);
			this.aClass3_Sub41_Sub2_2.method20475((float) local21);
		}
		this.aClass3_Sub41_Sub2_2.method20250(local538);
		this.aClass3_Sub41_Sub2_2.method20250(local553);
		this.aClass3_Sub41_Sub2_2.method20250(local566);
		this.aClass3_Sub41_Sub2_2.method20250(255);
		this.method11219(local70);
	}

	@OriginalMember(owner = "client!afv", name = "h", descriptor = "(IIIIII)V", line = 167)
	void method11221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) long local1 = -1L;
		@Pc(11) int local11 = arg4 + (arg2 << this.aClass17_Sub1_2.anInt336 * 1371852633);
		@Pc(21) int local21 = arg5 + (arg3 << this.aClass17_Sub1_2.anInt336 * 1371852633);
		@Pc(28) int local28 = this.aClass17_Sub1_2.method3583(local11, local21);
		if ((arg4 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local1 = ((long) local21 & 0xFFFFL) << 16 | (long) local11 & 0xFFFFL;
			@Pc(54) Class3_Sub34 local54 = (Class3_Sub34) this.aClass581_7.method33217(local1);
			if (local54 != null) {
				this.method11219(local54.aShort63);
				return;
			}
		}
		@Pc(70) short local70 = (short) this.anInt1224++;
		if (local1 != -1L) {
			this.aClass581_7.method33241(new Class3_Sub34(local70), local1);
		}
		@Pc(93) float local93;
		@Pc(100) float local100;
		@Pc(107) float local107;
		@Pc(240) float local240;
		@Pc(250) float local250;
		@Pc(257) float local257;
		@Pc(264) float local264;
		@Pc(271) float local271;
		@Pc(280) float local280;
		@Pc(289) float local289;
		@Pc(298) float local298;
		if (arg4 == 0 && arg5 == 0) {
			local93 = this.aFloatArrayArray15[arg0][arg1];
			local100 = this.aFloatArrayArray13[arg0][arg1];
			local107 = this.aFloatArrayArray14[arg0][arg1];
		} else if (arg4 == this.aClass17_Sub1_2.anInt338 * 76934957 && arg5 == 0) {
			local93 = this.aFloatArrayArray15[arg0 + 1][arg1];
			local100 = this.aFloatArrayArray13[arg0 + 1][arg1];
			local107 = this.aFloatArrayArray14[arg0 + 1][arg1];
		} else if (arg4 == this.aClass17_Sub1_2.anInt338 * 76934957 && arg5 == this.aClass17_Sub1_2.anInt338 * 76934957) {
			local93 = this.aFloatArrayArray15[arg0 + 1][arg1 + 1];
			local100 = this.aFloatArrayArray13[arg0 + 1][arg1 + 1];
			local107 = this.aFloatArrayArray14[arg0 + 1][arg1 + 1];
		} else if (arg4 == 0 && arg5 == this.aClass17_Sub1_2.anInt338 * 76934957) {
			local93 = this.aFloatArrayArray15[arg0][arg1 + 1];
			local100 = this.aFloatArrayArray13[arg0][arg1 + 1];
			local107 = this.aFloatArrayArray14[arg0][arg1 + 1];
		} else {
			local240 = (float) arg4 / (float) (this.aClass17_Sub1_2.anInt338 * 76934957);
			local250 = (float) arg5 / (float) (this.aClass17_Sub1_2.anInt338 * 76934957);
			local257 = this.aFloatArrayArray15[arg0][arg1];
			local264 = this.aFloatArrayArray13[arg0][arg1];
			local271 = this.aFloatArrayArray14[arg0][arg1];
			local280 = this.aFloatArrayArray15[arg0 + 1][arg1];
			local289 = this.aFloatArrayArray13[arg0 + 1][arg1];
			local298 = this.aFloatArrayArray14[arg0 + 1][arg1];
			@Pc(313) float local313 = local257 + (this.aFloatArrayArray15[arg0][arg1 + 1] - local257) * local240;
			@Pc(328) float local328 = local264 + (this.aFloatArrayArray13[arg0][arg1 + 1] - local264) * local240;
			@Pc(343) float local343 = local271 + (this.aFloatArrayArray14[arg0][arg1 + 1] - local271) * local240;
			@Pc(360) float local360 = local280 + (this.aFloatArrayArray15[arg0 + 1][arg1 + 1] - local280) * local240;
			@Pc(377) float local377 = local289 + (this.aFloatArrayArray13[arg0 + 1][arg1 + 1] - local289) * local240;
			@Pc(394) float local394 = local298 + (this.aFloatArrayArray14[arg0 + 1][arg1 + 1] - local298) * local240;
			local93 = local313 + (local360 - local313) * local250;
			local100 = local328 + (local377 - local328) * local250;
			local107 = local343 + (local394 - local343) * local250;
		}
		local240 = this.aClass3_Sub15_1.method11280() - local11;
		local250 = this.aClass3_Sub15_1.method11281() - local28;
		local257 = this.aClass3_Sub15_1.method11282() - local21;
		local264 = (float) Math.sqrt((double) (local240 * local240 + local250 * local250 + local257 * local257));
		local271 = 1.0F / local264;
		local240 *= local271;
		local250 *= local271;
		local257 *= local271;
		local280 = local264 / (float) this.aClass3_Sub15_1.method11291();
		local289 = 1.0F - local280 * local280;
		if (local289 < 0.0F) {
			local289 = 0.0F;
		}
		local298 = local240 * local93 + local250 * local100 + local257 * local107;
		if (local298 < 0.0F) {
			local298 = 0.0F;
		}
		@Pc(517) float local517 = local298 * local289 * 2.0F;
		if (local517 > 1.0F) {
			local517 = 1.0F;
		}
		@Pc(528) int local528 = this.aClass3_Sub15_1.method11279();
		@Pc(538) int local538 = (int) (local517 * (float) (local528 >> 16 & 0xFF));
		if (local538 > 255) {
			local538 = 255;
		}
		@Pc(553) int local553 = (int) (local517 * (float) (local528 >> 8 & 0xFF));
		if (local553 > 255) {
			local553 = 255;
		}
		@Pc(566) int local566 = (int) (local517 * (float) (local528 & 0xFF));
		if (local566 > 255) {
			local566 = 255;
		}
		if (this.aClass21_Sub2_29.aBoolean63) {
			this.aClass3_Sub41_Sub2_2.method20474((float) local11);
			this.aClass3_Sub41_Sub2_2.method20474((float) local28);
			this.aClass3_Sub41_Sub2_2.method20474((float) local21);
		} else {
			this.aClass3_Sub41_Sub2_2.method20475((float) local11);
			this.aClass3_Sub41_Sub2_2.method20475((float) local28);
			this.aClass3_Sub41_Sub2_2.method20475((float) local21);
		}
		this.aClass3_Sub41_Sub2_2.method20250(local538);
		this.aClass3_Sub41_Sub2_2.method20250(local553);
		this.aClass3_Sub41_Sub2_2.method20250(local566);
		this.aClass3_Sub41_Sub2_2.method20250(255);
		this.method11219(local70);
	}

	@OriginalMember(owner = "client!afv", name = "u", descriptor = "(IIIIII)V", line = 167)
	void method11222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) long local1 = -1L;
		@Pc(11) int local11 = arg4 + (arg2 << this.aClass17_Sub1_2.anInt336 * 1371852633);
		@Pc(21) int local21 = arg5 + (arg3 << this.aClass17_Sub1_2.anInt336 * 1371852633);
		@Pc(28) int local28 = this.aClass17_Sub1_2.method3583(local11, local21);
		if ((arg4 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local1 = ((long) local21 & 0xFFFFL) << 16 | (long) local11 & 0xFFFFL;
			@Pc(54) Class3_Sub34 local54 = (Class3_Sub34) this.aClass581_7.method33217(local1);
			if (local54 != null) {
				this.method11219(local54.aShort63);
				return;
			}
		}
		@Pc(70) short local70 = (short) this.anInt1224++;
		if (local1 != -1L) {
			this.aClass581_7.method33241(new Class3_Sub34(local70), local1);
		}
		@Pc(93) float local93;
		@Pc(100) float local100;
		@Pc(107) float local107;
		@Pc(240) float local240;
		@Pc(250) float local250;
		@Pc(257) float local257;
		@Pc(264) float local264;
		@Pc(271) float local271;
		@Pc(280) float local280;
		@Pc(289) float local289;
		@Pc(298) float local298;
		if (arg4 == 0 && arg5 == 0) {
			local93 = this.aFloatArrayArray15[arg0][arg1];
			local100 = this.aFloatArrayArray13[arg0][arg1];
			local107 = this.aFloatArrayArray14[arg0][arg1];
		} else if (arg4 == this.aClass17_Sub1_2.anInt338 * 76934957 && arg5 == 0) {
			local93 = this.aFloatArrayArray15[arg0 + 1][arg1];
			local100 = this.aFloatArrayArray13[arg0 + 1][arg1];
			local107 = this.aFloatArrayArray14[arg0 + 1][arg1];
		} else if (arg4 == this.aClass17_Sub1_2.anInt338 * 76934957 && arg5 == this.aClass17_Sub1_2.anInt338 * 76934957) {
			local93 = this.aFloatArrayArray15[arg0 + 1][arg1 + 1];
			local100 = this.aFloatArrayArray13[arg0 + 1][arg1 + 1];
			local107 = this.aFloatArrayArray14[arg0 + 1][arg1 + 1];
		} else if (arg4 == 0 && arg5 == this.aClass17_Sub1_2.anInt338 * 76934957) {
			local93 = this.aFloatArrayArray15[arg0][arg1 + 1];
			local100 = this.aFloatArrayArray13[arg0][arg1 + 1];
			local107 = this.aFloatArrayArray14[arg0][arg1 + 1];
		} else {
			local240 = (float) arg4 / (float) (this.aClass17_Sub1_2.anInt338 * 76934957);
			local250 = (float) arg5 / (float) (this.aClass17_Sub1_2.anInt338 * 76934957);
			local257 = this.aFloatArrayArray15[arg0][arg1];
			local264 = this.aFloatArrayArray13[arg0][arg1];
			local271 = this.aFloatArrayArray14[arg0][arg1];
			local280 = this.aFloatArrayArray15[arg0 + 1][arg1];
			local289 = this.aFloatArrayArray13[arg0 + 1][arg1];
			local298 = this.aFloatArrayArray14[arg0 + 1][arg1];
			@Pc(313) float local313 = local257 + (this.aFloatArrayArray15[arg0][arg1 + 1] - local257) * local240;
			@Pc(328) float local328 = local264 + (this.aFloatArrayArray13[arg0][arg1 + 1] - local264) * local240;
			@Pc(343) float local343 = local271 + (this.aFloatArrayArray14[arg0][arg1 + 1] - local271) * local240;
			@Pc(360) float local360 = local280 + (this.aFloatArrayArray15[arg0 + 1][arg1 + 1] - local280) * local240;
			@Pc(377) float local377 = local289 + (this.aFloatArrayArray13[arg0 + 1][arg1 + 1] - local289) * local240;
			@Pc(394) float local394 = local298 + (this.aFloatArrayArray14[arg0 + 1][arg1 + 1] - local298) * local240;
			local93 = local313 + (local360 - local313) * local250;
			local100 = local328 + (local377 - local328) * local250;
			local107 = local343 + (local394 - local343) * local250;
		}
		local240 = this.aClass3_Sub15_1.method11280() - local11;
		local250 = this.aClass3_Sub15_1.method11281() - local28;
		local257 = this.aClass3_Sub15_1.method11282() - local21;
		local264 = (float) Math.sqrt((double) (local240 * local240 + local250 * local250 + local257 * local257));
		local271 = 1.0F / local264;
		local240 *= local271;
		local250 *= local271;
		local257 *= local271;
		local280 = local264 / (float) this.aClass3_Sub15_1.method11291();
		local289 = 1.0F - local280 * local280;
		if (local289 < 0.0F) {
			local289 = 0.0F;
		}
		local298 = local240 * local93 + local250 * local100 + local257 * local107;
		if (local298 < 0.0F) {
			local298 = 0.0F;
		}
		@Pc(517) float local517 = local298 * local289 * 2.0F;
		if (local517 > 1.0F) {
			local517 = 1.0F;
		}
		@Pc(528) int local528 = this.aClass3_Sub15_1.method11279();
		@Pc(538) int local538 = (int) (local517 * (float) (local528 >> 16 & 0xFF));
		if (local538 > 255) {
			local538 = 255;
		}
		@Pc(553) int local553 = (int) (local517 * (float) (local528 >> 8 & 0xFF));
		if (local553 > 255) {
			local553 = 255;
		}
		@Pc(566) int local566 = (int) (local517 * (float) (local528 & 0xFF));
		if (local566 > 255) {
			local566 = 255;
		}
		if (this.aClass21_Sub2_29.aBoolean63) {
			this.aClass3_Sub41_Sub2_2.method20474((float) local11);
			this.aClass3_Sub41_Sub2_2.method20474((float) local28);
			this.aClass3_Sub41_Sub2_2.method20474((float) local21);
		} else {
			this.aClass3_Sub41_Sub2_2.method20475((float) local11);
			this.aClass3_Sub41_Sub2_2.method20475((float) local28);
			this.aClass3_Sub41_Sub2_2.method20475((float) local21);
		}
		this.aClass3_Sub41_Sub2_2.method20250(local538);
		this.aClass3_Sub41_Sub2_2.method20250(local553);
		this.aClass3_Sub41_Sub2_2.method20250(local566);
		this.aClass3_Sub41_Sub2_2.method20250(255);
		this.method11219(local70);
	}

	@OriginalMember(owner = "client!afv", name = "x", descriptor = "(IIIIII)V", line = 167)
	void method11223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) long local1 = -1L;
		@Pc(11) int local11 = arg4 + (arg2 << this.aClass17_Sub1_2.anInt336 * 1371852633);
		@Pc(21) int local21 = arg5 + (arg3 << this.aClass17_Sub1_2.anInt336 * 1371852633);
		@Pc(28) int local28 = this.aClass17_Sub1_2.method3583(local11, local21);
		if ((arg4 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local1 = ((long) local21 & 0xFFFFL) << 16 | (long) local11 & 0xFFFFL;
			@Pc(54) Class3_Sub34 local54 = (Class3_Sub34) this.aClass581_7.method33217(local1);
			if (local54 != null) {
				this.method11219(local54.aShort63);
				return;
			}
		}
		@Pc(70) short local70 = (short) this.anInt1224++;
		if (local1 != -1L) {
			this.aClass581_7.method33241(new Class3_Sub34(local70), local1);
		}
		@Pc(93) float local93;
		@Pc(100) float local100;
		@Pc(107) float local107;
		@Pc(240) float local240;
		@Pc(250) float local250;
		@Pc(257) float local257;
		@Pc(264) float local264;
		@Pc(271) float local271;
		@Pc(280) float local280;
		@Pc(289) float local289;
		@Pc(298) float local298;
		if (arg4 == 0 && arg5 == 0) {
			local93 = this.aFloatArrayArray15[arg0][arg1];
			local100 = this.aFloatArrayArray13[arg0][arg1];
			local107 = this.aFloatArrayArray14[arg0][arg1];
		} else if (arg4 == this.aClass17_Sub1_2.anInt338 * 76934957 && arg5 == 0) {
			local93 = this.aFloatArrayArray15[arg0 + 1][arg1];
			local100 = this.aFloatArrayArray13[arg0 + 1][arg1];
			local107 = this.aFloatArrayArray14[arg0 + 1][arg1];
		} else if (arg4 == this.aClass17_Sub1_2.anInt338 * 76934957 && arg5 == this.aClass17_Sub1_2.anInt338 * 76934957) {
			local93 = this.aFloatArrayArray15[arg0 + 1][arg1 + 1];
			local100 = this.aFloatArrayArray13[arg0 + 1][arg1 + 1];
			local107 = this.aFloatArrayArray14[arg0 + 1][arg1 + 1];
		} else if (arg4 == 0 && arg5 == this.aClass17_Sub1_2.anInt338 * 76934957) {
			local93 = this.aFloatArrayArray15[arg0][arg1 + 1];
			local100 = this.aFloatArrayArray13[arg0][arg1 + 1];
			local107 = this.aFloatArrayArray14[arg0][arg1 + 1];
		} else {
			local240 = (float) arg4 / (float) (this.aClass17_Sub1_2.anInt338 * 76934957);
			local250 = (float) arg5 / (float) (this.aClass17_Sub1_2.anInt338 * 76934957);
			local257 = this.aFloatArrayArray15[arg0][arg1];
			local264 = this.aFloatArrayArray13[arg0][arg1];
			local271 = this.aFloatArrayArray14[arg0][arg1];
			local280 = this.aFloatArrayArray15[arg0 + 1][arg1];
			local289 = this.aFloatArrayArray13[arg0 + 1][arg1];
			local298 = this.aFloatArrayArray14[arg0 + 1][arg1];
			@Pc(313) float local313 = local257 + (this.aFloatArrayArray15[arg0][arg1 + 1] - local257) * local240;
			@Pc(328) float local328 = local264 + (this.aFloatArrayArray13[arg0][arg1 + 1] - local264) * local240;
			@Pc(343) float local343 = local271 + (this.aFloatArrayArray14[arg0][arg1 + 1] - local271) * local240;
			@Pc(360) float local360 = local280 + (this.aFloatArrayArray15[arg0 + 1][arg1 + 1] - local280) * local240;
			@Pc(377) float local377 = local289 + (this.aFloatArrayArray13[arg0 + 1][arg1 + 1] - local289) * local240;
			@Pc(394) float local394 = local298 + (this.aFloatArrayArray14[arg0 + 1][arg1 + 1] - local298) * local240;
			local93 = local313 + (local360 - local313) * local250;
			local100 = local328 + (local377 - local328) * local250;
			local107 = local343 + (local394 - local343) * local250;
		}
		local240 = this.aClass3_Sub15_1.method11280() - local11;
		local250 = this.aClass3_Sub15_1.method11281() - local28;
		local257 = this.aClass3_Sub15_1.method11282() - local21;
		local264 = (float) Math.sqrt((double) (local240 * local240 + local250 * local250 + local257 * local257));
		local271 = 1.0F / local264;
		local240 *= local271;
		local250 *= local271;
		local257 *= local271;
		local280 = local264 / (float) this.aClass3_Sub15_1.method11291();
		local289 = 1.0F - local280 * local280;
		if (local289 < 0.0F) {
			local289 = 0.0F;
		}
		local298 = local240 * local93 + local250 * local100 + local257 * local107;
		if (local298 < 0.0F) {
			local298 = 0.0F;
		}
		@Pc(517) float local517 = local298 * local289 * 2.0F;
		if (local517 > 1.0F) {
			local517 = 1.0F;
		}
		@Pc(528) int local528 = this.aClass3_Sub15_1.method11279();
		@Pc(538) int local538 = (int) (local517 * (float) (local528 >> 16 & 0xFF));
		if (local538 > 255) {
			local538 = 255;
		}
		@Pc(553) int local553 = (int) (local517 * (float) (local528 >> 8 & 0xFF));
		if (local553 > 255) {
			local553 = 255;
		}
		@Pc(566) int local566 = (int) (local517 * (float) (local528 & 0xFF));
		if (local566 > 255) {
			local566 = 255;
		}
		if (this.aClass21_Sub2_29.aBoolean63) {
			this.aClass3_Sub41_Sub2_2.method20474((float) local11);
			this.aClass3_Sub41_Sub2_2.method20474((float) local28);
			this.aClass3_Sub41_Sub2_2.method20474((float) local21);
		} else {
			this.aClass3_Sub41_Sub2_2.method20475((float) local11);
			this.aClass3_Sub41_Sub2_2.method20475((float) local28);
			this.aClass3_Sub41_Sub2_2.method20475((float) local21);
		}
		this.aClass3_Sub41_Sub2_2.method20250(local538);
		this.aClass3_Sub41_Sub2_2.method20250(local553);
		this.aClass3_Sub41_Sub2_2.method20250(local566);
		this.aClass3_Sub41_Sub2_2.method20250(255);
		this.method11219(local70);
	}

	@OriginalMember(owner = "client!afv", name = "g", descriptor = "(III[[Z)V", line = 263)
	void method11225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3) {
		if (this.anInterface7_3 == null || (this.anInt1222 > arg0 + arg2 || (this.anInt1221 < arg0 - arg2 || (this.anInt1223 > arg1 + arg2 || this.anInt1226 < arg1 - arg2)))) {
			return;
		}
		for (@Pc(34) int local34 = this.anInt1223; local34 <= this.anInt1226; local34++) {
			for (@Pc(41) int local41 = this.anInt1222; local41 <= this.anInt1221; local41++) {
				@Pc(49) int local49 = local41 - arg0;
				@Pc(53) int local53 = local34 - arg1;
				if (local49 > -arg2 && local49 < arg2 && local53 > -arg2 && local53 < arg2 && arg3[local49 + arg2][local53 + arg2]) {
					this.aClass21_Sub2_29.method4195((int) (this.aClass3_Sub15_1.method11300() * 255.0F) << 24);
					this.aClass21_Sub2_29.method4064(this.aClass88_12, null, this.aClass88_13, null);
					this.aClass21_Sub2_29.method4066(this.anInterface7_3, 4, 0, this.anInt1225);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!afv", name = "y", descriptor = "(III[[Z)V", line = 263)
	void method11226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3) {
		if (this.anInterface7_3 == null || (this.anInt1222 > arg0 + arg2 || (this.anInt1221 < arg0 - arg2 || (this.anInt1223 > arg1 + arg2 || this.anInt1226 < arg1 - arg2)))) {
			return;
		}
		for (@Pc(34) int local34 = this.anInt1223; local34 <= this.anInt1226; local34++) {
			for (@Pc(41) int local41 = this.anInt1222; local41 <= this.anInt1221; local41++) {
				@Pc(49) int local49 = local41 - arg0;
				@Pc(53) int local53 = local34 - arg1;
				if (local49 > -arg2 && local49 < arg2 && local53 > -arg2 && local53 < arg2 && arg3[local49 + arg2][local53 + arg2]) {
					this.aClass21_Sub2_29.method4195((int) (this.aClass3_Sub15_1.method11300() * 255.0F) << 24);
					this.aClass21_Sub2_29.method4064(this.aClass88_12, null, this.aClass88_13, null);
					this.aClass21_Sub2_29.method4066(this.anInterface7_3, 4, 0, this.anInt1225);
					return;
				}
			}
		}
	}
}
