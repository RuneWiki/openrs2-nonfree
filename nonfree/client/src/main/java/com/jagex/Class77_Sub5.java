package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajd")
public class Class77_Sub5 extends Class77 {

	@OriginalMember(owner = "client!ajd", name = "s", descriptor = "I")
	int anInt1464;

	@OriginalMember(owner = "client!ajd", name = "l", descriptor = "Lclient!aeq;")
	final Class86_Sub3 aClass86_Sub3_28;

	@OriginalMember(owner = "client!ajd", name = "w", descriptor = "Lclient!ajv;")
	final Class77_Sub22 aClass77_Sub22_1;

	@OriginalMember(owner = "client!ajd", name = "y", descriptor = "Lclient!aeg;")
	final Class88_Sub1 aClass88_Sub1_1;

	@OriginalMember(owner = "client!ajd", name = "t", descriptor = "I")
	int anInt1460;

	@OriginalMember(owner = "client!ajd", name = "q", descriptor = "I")
	int anInt1461;

	@OriginalMember(owner = "client!ajd", name = "x", descriptor = "I")
	int anInt1465;

	@OriginalMember(owner = "client!ajd", name = "d", descriptor = "I")
	int anInt1462;

	@OriginalMember(owner = "client!ajd", name = "k", descriptor = "[[F")
	float[][] aFloatArrayArray14;

	@OriginalMember(owner = "client!ajd", name = "u", descriptor = "[[F")
	float[][] aFloatArrayArray13;

	@OriginalMember(owner = "client!ajd", name = "e", descriptor = "[[F")
	float[][] aFloatArrayArray15;

	@OriginalMember(owner = "client!ajd", name = "r", descriptor = "I")
	int anInt1463;

	@OriginalMember(owner = "client!ajd", name = "f", descriptor = "Lclient!akv;")
	Class77_Sub39 aClass77_Sub39_8;

	@OriginalMember(owner = "client!ajd", name = "o", descriptor = "Lclient!arl;")
	Class77_Sub39_Sub2 aClass77_Sub39_Sub2_2;

	@OriginalMember(owner = "client!ajd", name = "b", descriptor = "Lclient!aak;")
	Class12 aClass12_9;

	@OriginalMember(owner = "client!ajd", name = "g", descriptor = "Lclient!ca;")
	final Interface15 anInterface15_3;

	@OriginalMember(owner = "client!ajd", name = "z", descriptor = "Lclient!bn;")
	final Interface14 anInterface14_5;

	@OriginalMember(owner = "client!ajd", name = "j", descriptor = "Lclient!bk;")
	final Class172 aClass172_12;

	@OriginalMember(owner = "client!ajd", name = "i", descriptor = "Lclient!bk;")
	final Class172 aClass172_11;

	@OriginalMember(owner = "client!ajd", name = "<init>", descriptor = "(Lclient!aeq;Lclient!aeg;Lclient!ajv;[I)V", line = 31)
	Class77_Sub5(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) Class88_Sub1 arg1, @OriginalArg(2) Class77_Sub22 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass86_Sub3_28 = arg0;
		this.aClass77_Sub22_1 = arg2;
		this.aClass88_Sub1_1 = arg1;
		@Pc(22) int local22 = this.aClass77_Sub22_1.method13555() - (arg1.anInt608 * 127780559 >> 1);
		this.anInt1460 = this.aClass77_Sub22_1.method13544() - local22 >> arg1.anInt609 * -1495101509;
		this.anInt1461 = this.aClass77_Sub22_1.method13544() + local22 >> arg1.anInt609 * -1495101509;
		this.anInt1465 = this.aClass77_Sub22_1.method13552() - local22 >> arg1.anInt609 * -1495101509;
		this.anInt1462 = this.aClass77_Sub22_1.method13552() + local22 >> arg1.anInt609 * -1495101509;
		@Pc(82) int local82 = this.anInt1461 - this.anInt1460 + 1;
		@Pc(90) int local90 = this.anInt1462 - this.anInt1465 + 1;
		this.aFloatArrayArray14 = new float[local82 + 1][local90 + 1];
		this.aFloatArrayArray13 = new float[local82 + 1][local90 + 1];
		this.aFloatArrayArray15 = new float[local82 + 1][local90 + 1];
		@Pc(119) int local119;
		@Pc(127) int local127;
		@Pc(140) int local140;
		@Pc(148) int local148;
		@Pc(175) int local175;
		@Pc(191) int local191;
		for (local119 = 0; local119 <= local90; local119++) {
			local127 = local119 + this.anInt1465;
			if (local127 > 0 && local127 < this.aClass88_Sub1_1.anInt606 * -1466328823 - 1) {
				for (local140 = 0; local140 <= local82; local140++) {
					local148 = local140 + this.anInt1460;
					if (local148 > 0 && local148 < this.aClass88_Sub1_1.anInt607 * -1924295585 - 1) {
						local175 = arg1.method5500(local148 + 1, local127) - arg1.method5500(local148 - 1, local127);
						local191 = arg1.method5500(local148, local127 + 1) - arg1.method5500(local148, local127 - 1);
						@Pc(206) float local206 = (float) (1.0D / Math.sqrt((double) (local175 * local175 + 65536 + local191 * local191)));
						this.aFloatArrayArray14[local140][local119] = (float) local175 * local206;
						this.aFloatArrayArray13[local140][local119] = -256.0F * local206;
						this.aFloatArrayArray15[local140][local119] = (float) local191 * local206;
					}
				}
			}
		}
		local119 = 0;
		for (local127 = this.anInt1465; local127 <= this.anInt1462; local127++) {
			if (local127 >= 0 && local127 < arg1.anInt606 * -1466328823) {
				for (local140 = this.anInt1460; local140 <= this.anInt1461; local140++) {
					if (local140 >= 0 && local140 < arg1.anInt607 * -1924295585) {
						local148 = arg3[local119];
						@Pc(282) int[] local282 = arg1.anIntArrayArrayArray1[local140][local127];
						if (local282 != null && local148 != 0) {
							if (local148 == 1) {
								for (local191 = 0; local191 < local282.length; local191 += 3) {
									if (local282[local191] != -1 && local282[local191 + 1] != -1 && local282[local191 + 2] != -1) {
										this.anInt1463 += 3;
									}
								}
							} else {
								this.anInt1463 += 3;
							}
						}
					}
					local119++;
				}
			} else {
				local119 += this.anInt1461 - this.anInt1460;
			}
		}
		if (this.anInt1463 > 0) {
			this.aClass77_Sub39_8 = new Class77_Sub39(this.anInt1463 * 2);
			this.aClass77_Sub39_Sub2_2 = new Class77_Sub39_Sub2(this.anInt1463 * 16);
			this.aClass12_9 = new Class12(Class199.method25492(this.anInt1463));
			local127 = 0;
			local119 = 0;
			for (local140 = this.anInt1465; local140 <= this.anInt1462; local140++) {
				if (local140 >= 0 && local140 < arg1.anInt606 * -1466328823) {
					local148 = 0;
					for (local175 = this.anInt1460; local175 <= this.anInt1461; local175++) {
						if (local175 >= 0 && local175 < arg1.anInt607 * -1924295585) {
							local191 = arg3[local119];
							@Pc(420) int[] local420 = arg1.anIntArrayArrayArray1[local175][local140];
							if (local420 != null && local191 != 0) {
								if (local191 == 1) {
									@Pc(434) int[] local434 = arg1.anIntArrayArrayArray2[local175][local140];
									@Pc(441) int[] local441 = arg1.anIntArrayArrayArray3[local175][local140];
									@Pc(443) int local443 = 0;
									label110: while (true) {
										while (true) {
											if (local443 >= local420.length) {
												break label110;
											}
											if (local420[local443] == -1 || local420[local443 + 1] == -1 || local420[local443 + 2] == -1) {
												local443 += 3;
											} else {
												this.method13230(local148, local127, local175, local140, local434[local443], local441[local443]);
												local443++;
												this.method13230(local148, local127, local175, local140, local434[local443], local441[local443]);
												local443++;
												this.method13230(local148, local127, local175, local140, local434[local443], local441[local443]);
												local443++;
											}
										}
									}
								} else if (local191 == 3) {
									this.method13230(local148, local127, local175, local140, 0, 0);
									this.method13230(local148, local127, local175, local140, arg1.anInt608 * 127780559, 0);
									this.method13230(local148, local127, local175, local140, 0, arg1.anInt608 * 127780559);
								} else if (local191 == 2) {
									this.method13230(local148, local127, local175, local140, arg1.anInt608 * 127780559, 0);
									this.method13230(local148, local127, local175, local140, arg1.anInt608 * 127780559, arg1.anInt608 * 127780559);
									this.method13230(local148, local127, local175, local140, 0, 0);
								} else if (local191 == 5) {
									this.method13230(local148, local127, local175, local140, arg1.anInt608 * 127780559, arg1.anInt608 * 127780559);
									this.method13230(local148, local127, local175, local140, 0, arg1.anInt608 * 127780559);
									this.method13230(local148, local127, local175, local140, arg1.anInt608 * 127780559, 0);
								} else if (local191 == 4) {
									this.method13230(local148, local127, local175, local140, 0, arg1.anInt608 * 127780559);
									this.method13230(local148, local127, local175, local140, 0, 0);
									this.method13230(local148, local127, local175, local140, arg1.anInt608 * 127780559, arg1.anInt608 * 127780559);
								}
							}
						}
						local119++;
						local148++;
					}
				} else {
					local119 += this.anInt1461 - this.anInt1460;
				}
				local127++;
			}
			this.anInterface15_3 = this.aClass86_Sub3_28.method6138(5123, this.aClass77_Sub39_8.aByteArray53, this.aClass77_Sub39_8.anInt3089 * 31645619, false);
			this.anInterface14_5 = this.aClass86_Sub3_28.method6141(16, this.aClass77_Sub39_Sub2_2.aByteArray53, this.aClass77_Sub39_Sub2_2.anInt3089 * 31645619, false);
			this.aClass172_12 = new Class172(this.anInterface14_5, 5126, 3, 0);
			this.aClass172_11 = new Class172(this.anInterface14_5, 5121, 4, 12);
		} else {
			this.anInterface15_3 = null;
			this.anInterface14_5 = null;
			this.aClass172_12 = null;
			this.aClass172_11 = null;
		}
		this.aClass77_Sub39_Sub2_2 = null;
		this.aClass77_Sub39_8 = null;
		this.aClass12_9 = null;
		this.aFloatArrayArray15 = null;
		this.aFloatArrayArray13 = null;
		this.aFloatArrayArray14 = null;
	}

	@OriginalMember(owner = "client!ajd", name = "y", descriptor = "(S)V", line = 162)
	void method13227(@OriginalArg(0) short arg0) {
		if (this.aClass86_Sub3_28.aBoolean116) {
			this.aClass77_Sub39_8.method22408(arg0);
		} else {
			this.aClass77_Sub39_8.method22412(arg0);
		}
	}

	@OriginalMember(owner = "client!ajd", name = "l", descriptor = "(S)V", line = 162)
	void method13228(@OriginalArg(0) short arg0) {
		if (this.aClass86_Sub3_28.aBoolean116) {
			this.aClass77_Sub39_8.method22408(arg0);
		} else {
			this.aClass77_Sub39_8.method22412(arg0);
		}
	}

	@OriginalMember(owner = "client!ajd", name = "p", descriptor = "(S)V", line = 162)
	void method13229(@OriginalArg(0) short arg0) {
		if (this.aClass86_Sub3_28.aBoolean116) {
			this.aClass77_Sub39_8.method22408(arg0);
		} else {
			this.aClass77_Sub39_8.method22412(arg0);
		}
	}

	@OriginalMember(owner = "client!ajd", name = "c", descriptor = "(IIIIII)V", line = 167)
	void method13230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) long local1 = -1L;
		@Pc(11) int local11 = arg4 + (arg2 << this.aClass88_Sub1_1.anInt609 * -1495101509);
		@Pc(21) int local21 = arg5 + (arg3 << this.aClass88_Sub1_1.anInt609 * -1495101509);
		@Pc(28) int local28 = this.aClass88_Sub1_1.method5493(local11, local21);
		if ((arg4 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local1 = ((long) local21 & 0xFFFFL) << 16 | (long) local11 & 0xFFFFL;
			@Pc(54) Class77_Sub17 local54 = (Class77_Sub17) this.aClass12_9.method173(local1);
			if (local54 != null) {
				this.method13229(local54.aShort101);
				return;
			}
		}
		@Pc(70) short local70 = (short) this.anInt1464++;
		if (local1 != -1L) {
			this.aClass12_9.method184(new Class77_Sub17(local70), local1);
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
			local93 = this.aFloatArrayArray14[arg0][arg1];
			local100 = this.aFloatArrayArray13[arg0][arg1];
			local107 = this.aFloatArrayArray15[arg0][arg1];
		} else if (arg4 == this.aClass88_Sub1_1.anInt608 * 127780559 && arg5 == 0) {
			local93 = this.aFloatArrayArray14[arg0 + 1][arg1];
			local100 = this.aFloatArrayArray13[arg0 + 1][arg1];
			local107 = this.aFloatArrayArray15[arg0 + 1][arg1];
		} else if (arg4 == this.aClass88_Sub1_1.anInt608 * 127780559 && arg5 == this.aClass88_Sub1_1.anInt608 * 127780559) {
			local93 = this.aFloatArrayArray14[arg0 + 1][arg1 + 1];
			local100 = this.aFloatArrayArray13[arg0 + 1][arg1 + 1];
			local107 = this.aFloatArrayArray15[arg0 + 1][arg1 + 1];
		} else if (arg4 == 0 && arg5 == this.aClass88_Sub1_1.anInt608 * 127780559) {
			local93 = this.aFloatArrayArray14[arg0][arg1 + 1];
			local100 = this.aFloatArrayArray13[arg0][arg1 + 1];
			local107 = this.aFloatArrayArray15[arg0][arg1 + 1];
		} else {
			local240 = (float) arg4 / (float) (this.aClass88_Sub1_1.anInt608 * 127780559);
			local250 = (float) arg5 / (float) (this.aClass88_Sub1_1.anInt608 * 127780559);
			local257 = this.aFloatArrayArray14[arg0][arg1];
			local264 = this.aFloatArrayArray13[arg0][arg1];
			local271 = this.aFloatArrayArray15[arg0][arg1];
			local280 = this.aFloatArrayArray14[arg0 + 1][arg1];
			local289 = this.aFloatArrayArray13[arg0 + 1][arg1];
			local298 = this.aFloatArrayArray15[arg0 + 1][arg1];
			@Pc(313) float local313 = local257 + (this.aFloatArrayArray14[arg0][arg1 + 1] - local257) * local240;
			@Pc(328) float local328 = local264 + (this.aFloatArrayArray13[arg0][arg1 + 1] - local264) * local240;
			@Pc(343) float local343 = local271 + (this.aFloatArrayArray15[arg0][arg1 + 1] - local271) * local240;
			@Pc(360) float local360 = local280 + (this.aFloatArrayArray14[arg0 + 1][arg1 + 1] - local280) * local240;
			@Pc(377) float local377 = local289 + (this.aFloatArrayArray13[arg0 + 1][arg1 + 1] - local289) * local240;
			@Pc(394) float local394 = local298 + (this.aFloatArrayArray15[arg0 + 1][arg1 + 1] - local298) * local240;
			local93 = local313 + (local360 - local313) * local250;
			local100 = local328 + (local377 - local328) * local250;
			local107 = local343 + (local394 - local343) * local250;
		}
		local240 = this.aClass77_Sub22_1.method13544() - local11;
		local250 = this.aClass77_Sub22_1.method13550() - local28;
		local257 = this.aClass77_Sub22_1.method13552() - local21;
		local264 = (float) Math.sqrt((double) (local240 * local240 + local250 * local250 + local257 * local257));
		local271 = 1.0F / local264;
		local240 *= local271;
		local250 *= local271;
		local257 *= local271;
		local280 = local264 / (float) this.aClass77_Sub22_1.method13555();
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
		@Pc(528) int local528 = this.aClass77_Sub22_1.method13557();
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
		if (this.aClass86_Sub3_28.aBoolean116) {
			this.aClass77_Sub39_Sub2_2.method22659((float) local11);
			this.aClass77_Sub39_Sub2_2.method22659((float) local28);
			this.aClass77_Sub39_Sub2_2.method22659((float) local21);
		} else {
			this.aClass77_Sub39_Sub2_2.method22663((float) local11);
			this.aClass77_Sub39_Sub2_2.method22663((float) local28);
			this.aClass77_Sub39_Sub2_2.method22663((float) local21);
		}
		this.aClass77_Sub39_Sub2_2.method22403(local538);
		this.aClass77_Sub39_Sub2_2.method22403(local553);
		this.aClass77_Sub39_Sub2_2.method22403(local566);
		this.aClass77_Sub39_Sub2_2.method22403(255);
		this.method13229(local70);
	}

	@OriginalMember(owner = "client!ajd", name = "w", descriptor = "(IIIIII)V", line = 167)
	void method13231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) long local1 = -1L;
		@Pc(11) int local11 = arg4 + (arg2 << this.aClass88_Sub1_1.anInt609 * -1495101509);
		@Pc(21) int local21 = arg5 + (arg3 << this.aClass88_Sub1_1.anInt609 * -1495101509);
		@Pc(28) int local28 = this.aClass88_Sub1_1.method5493(local11, local21);
		if ((arg4 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local1 = ((long) local21 & 0xFFFFL) << 16 | (long) local11 & 0xFFFFL;
			@Pc(54) Class77_Sub17 local54 = (Class77_Sub17) this.aClass12_9.method173(local1);
			if (local54 != null) {
				this.method13229(local54.aShort101);
				return;
			}
		}
		@Pc(70) short local70 = (short) this.anInt1464++;
		if (local1 != -1L) {
			this.aClass12_9.method184(new Class77_Sub17(local70), local1);
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
			local93 = this.aFloatArrayArray14[arg0][arg1];
			local100 = this.aFloatArrayArray13[arg0][arg1];
			local107 = this.aFloatArrayArray15[arg0][arg1];
		} else if (arg4 == this.aClass88_Sub1_1.anInt608 * 127780559 && arg5 == 0) {
			local93 = this.aFloatArrayArray14[arg0 + 1][arg1];
			local100 = this.aFloatArrayArray13[arg0 + 1][arg1];
			local107 = this.aFloatArrayArray15[arg0 + 1][arg1];
		} else if (arg4 == this.aClass88_Sub1_1.anInt608 * 127780559 && arg5 == this.aClass88_Sub1_1.anInt608 * 127780559) {
			local93 = this.aFloatArrayArray14[arg0 + 1][arg1 + 1];
			local100 = this.aFloatArrayArray13[arg0 + 1][arg1 + 1];
			local107 = this.aFloatArrayArray15[arg0 + 1][arg1 + 1];
		} else if (arg4 == 0 && arg5 == this.aClass88_Sub1_1.anInt608 * 127780559) {
			local93 = this.aFloatArrayArray14[arg0][arg1 + 1];
			local100 = this.aFloatArrayArray13[arg0][arg1 + 1];
			local107 = this.aFloatArrayArray15[arg0][arg1 + 1];
		} else {
			local240 = (float) arg4 / (float) (this.aClass88_Sub1_1.anInt608 * 127780559);
			local250 = (float) arg5 / (float) (this.aClass88_Sub1_1.anInt608 * 127780559);
			local257 = this.aFloatArrayArray14[arg0][arg1];
			local264 = this.aFloatArrayArray13[arg0][arg1];
			local271 = this.aFloatArrayArray15[arg0][arg1];
			local280 = this.aFloatArrayArray14[arg0 + 1][arg1];
			local289 = this.aFloatArrayArray13[arg0 + 1][arg1];
			local298 = this.aFloatArrayArray15[arg0 + 1][arg1];
			@Pc(313) float local313 = local257 + (this.aFloatArrayArray14[arg0][arg1 + 1] - local257) * local240;
			@Pc(328) float local328 = local264 + (this.aFloatArrayArray13[arg0][arg1 + 1] - local264) * local240;
			@Pc(343) float local343 = local271 + (this.aFloatArrayArray15[arg0][arg1 + 1] - local271) * local240;
			@Pc(360) float local360 = local280 + (this.aFloatArrayArray14[arg0 + 1][arg1 + 1] - local280) * local240;
			@Pc(377) float local377 = local289 + (this.aFloatArrayArray13[arg0 + 1][arg1 + 1] - local289) * local240;
			@Pc(394) float local394 = local298 + (this.aFloatArrayArray15[arg0 + 1][arg1 + 1] - local298) * local240;
			local93 = local313 + (local360 - local313) * local250;
			local100 = local328 + (local377 - local328) * local250;
			local107 = local343 + (local394 - local343) * local250;
		}
		local240 = this.aClass77_Sub22_1.method13544() - local11;
		local250 = this.aClass77_Sub22_1.method13550() - local28;
		local257 = this.aClass77_Sub22_1.method13552() - local21;
		local264 = (float) Math.sqrt((double) (local240 * local240 + local250 * local250 + local257 * local257));
		local271 = 1.0F / local264;
		local240 *= local271;
		local250 *= local271;
		local257 *= local271;
		local280 = local264 / (float) this.aClass77_Sub22_1.method13555();
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
		@Pc(528) int local528 = this.aClass77_Sub22_1.method13557();
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
		if (this.aClass86_Sub3_28.aBoolean116) {
			this.aClass77_Sub39_Sub2_2.method22659((float) local11);
			this.aClass77_Sub39_Sub2_2.method22659((float) local28);
			this.aClass77_Sub39_Sub2_2.method22659((float) local21);
		} else {
			this.aClass77_Sub39_Sub2_2.method22663((float) local11);
			this.aClass77_Sub39_Sub2_2.method22663((float) local28);
			this.aClass77_Sub39_Sub2_2.method22663((float) local21);
		}
		this.aClass77_Sub39_Sub2_2.method22403(local538);
		this.aClass77_Sub39_Sub2_2.method22403(local553);
		this.aClass77_Sub39_Sub2_2.method22403(local566);
		this.aClass77_Sub39_Sub2_2.method22403(255);
		this.method13229(local70);
	}

	@OriginalMember(owner = "client!ajd", name = "t", descriptor = "(IIIIII)V", line = 167)
	void method13232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) long local1 = -1L;
		@Pc(11) int local11 = arg4 + (arg2 << this.aClass88_Sub1_1.anInt609 * -1495101509);
		@Pc(21) int local21 = arg5 + (arg3 << this.aClass88_Sub1_1.anInt609 * -1495101509);
		@Pc(28) int local28 = this.aClass88_Sub1_1.method5493(local11, local21);
		if ((arg4 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local1 = ((long) local21 & 0xFFFFL) << 16 | (long) local11 & 0xFFFFL;
			@Pc(54) Class77_Sub17 local54 = (Class77_Sub17) this.aClass12_9.method173(local1);
			if (local54 != null) {
				this.method13229(local54.aShort101);
				return;
			}
		}
		@Pc(70) short local70 = (short) this.anInt1464++;
		if (local1 != -1L) {
			this.aClass12_9.method184(new Class77_Sub17(local70), local1);
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
			local93 = this.aFloatArrayArray14[arg0][arg1];
			local100 = this.aFloatArrayArray13[arg0][arg1];
			local107 = this.aFloatArrayArray15[arg0][arg1];
		} else if (arg4 == this.aClass88_Sub1_1.anInt608 * 127780559 && arg5 == 0) {
			local93 = this.aFloatArrayArray14[arg0 + 1][arg1];
			local100 = this.aFloatArrayArray13[arg0 + 1][arg1];
			local107 = this.aFloatArrayArray15[arg0 + 1][arg1];
		} else if (arg4 == this.aClass88_Sub1_1.anInt608 * 127780559 && arg5 == this.aClass88_Sub1_1.anInt608 * 127780559) {
			local93 = this.aFloatArrayArray14[arg0 + 1][arg1 + 1];
			local100 = this.aFloatArrayArray13[arg0 + 1][arg1 + 1];
			local107 = this.aFloatArrayArray15[arg0 + 1][arg1 + 1];
		} else if (arg4 == 0 && arg5 == this.aClass88_Sub1_1.anInt608 * 127780559) {
			local93 = this.aFloatArrayArray14[arg0][arg1 + 1];
			local100 = this.aFloatArrayArray13[arg0][arg1 + 1];
			local107 = this.aFloatArrayArray15[arg0][arg1 + 1];
		} else {
			local240 = (float) arg4 / (float) (this.aClass88_Sub1_1.anInt608 * 127780559);
			local250 = (float) arg5 / (float) (this.aClass88_Sub1_1.anInt608 * 127780559);
			local257 = this.aFloatArrayArray14[arg0][arg1];
			local264 = this.aFloatArrayArray13[arg0][arg1];
			local271 = this.aFloatArrayArray15[arg0][arg1];
			local280 = this.aFloatArrayArray14[arg0 + 1][arg1];
			local289 = this.aFloatArrayArray13[arg0 + 1][arg1];
			local298 = this.aFloatArrayArray15[arg0 + 1][arg1];
			@Pc(313) float local313 = local257 + (this.aFloatArrayArray14[arg0][arg1 + 1] - local257) * local240;
			@Pc(328) float local328 = local264 + (this.aFloatArrayArray13[arg0][arg1 + 1] - local264) * local240;
			@Pc(343) float local343 = local271 + (this.aFloatArrayArray15[arg0][arg1 + 1] - local271) * local240;
			@Pc(360) float local360 = local280 + (this.aFloatArrayArray14[arg0 + 1][arg1 + 1] - local280) * local240;
			@Pc(377) float local377 = local289 + (this.aFloatArrayArray13[arg0 + 1][arg1 + 1] - local289) * local240;
			@Pc(394) float local394 = local298 + (this.aFloatArrayArray15[arg0 + 1][arg1 + 1] - local298) * local240;
			local93 = local313 + (local360 - local313) * local250;
			local100 = local328 + (local377 - local328) * local250;
			local107 = local343 + (local394 - local343) * local250;
		}
		local240 = this.aClass77_Sub22_1.method13544() - local11;
		local250 = this.aClass77_Sub22_1.method13550() - local28;
		local257 = this.aClass77_Sub22_1.method13552() - local21;
		local264 = (float) Math.sqrt((double) (local240 * local240 + local250 * local250 + local257 * local257));
		local271 = 1.0F / local264;
		local240 *= local271;
		local250 *= local271;
		local257 *= local271;
		local280 = local264 / (float) this.aClass77_Sub22_1.method13555();
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
		@Pc(528) int local528 = this.aClass77_Sub22_1.method13557();
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
		if (this.aClass86_Sub3_28.aBoolean116) {
			this.aClass77_Sub39_Sub2_2.method22659((float) local11);
			this.aClass77_Sub39_Sub2_2.method22659((float) local28);
			this.aClass77_Sub39_Sub2_2.method22659((float) local21);
		} else {
			this.aClass77_Sub39_Sub2_2.method22663((float) local11);
			this.aClass77_Sub39_Sub2_2.method22663((float) local28);
			this.aClass77_Sub39_Sub2_2.method22663((float) local21);
		}
		this.aClass77_Sub39_Sub2_2.method22403(local538);
		this.aClass77_Sub39_Sub2_2.method22403(local553);
		this.aClass77_Sub39_Sub2_2.method22403(local566);
		this.aClass77_Sub39_Sub2_2.method22403(255);
		this.method13229(local70);
	}

	@OriginalMember(owner = "client!ajd", name = "v", descriptor = "(III[[Z)V", line = 263)
	void method13233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3) {
		if (this.anInterface15_3 == null || (this.anInt1460 > arg0 + arg2 || (this.anInt1461 < arg0 - arg2 || (this.anInt1465 > arg1 + arg2 || this.anInt1462 < arg1 - arg2)))) {
			return;
		}
		for (@Pc(34) int local34 = this.anInt1465; local34 <= this.anInt1462; local34++) {
			for (@Pc(41) int local41 = this.anInt1460; local41 <= this.anInt1461; local41++) {
				@Pc(49) int local49 = local41 - arg0;
				@Pc(53) int local53 = local34 - arg1;
				if (local49 > -arg2 && local49 < arg2 && local53 > -arg2 && local53 < arg2 && arg3[local49 + arg2][local53 + arg2]) {
					this.aClass86_Sub3_28.method6216((int) (this.aClass77_Sub22_1.method13561() * 255.0F) << 24);
					this.aClass86_Sub3_28.method6155(this.aClass172_12, null, this.aClass172_11, null);
					this.aClass86_Sub3_28.method6163(this.anInterface15_3, 4, 0, this.anInt1463);
					return;
				}
			}
		}
	}
}
