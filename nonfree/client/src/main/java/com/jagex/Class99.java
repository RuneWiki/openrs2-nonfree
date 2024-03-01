package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bq")
public class Class99 {

	@OriginalMember(owner = "client!bq", name = "q", descriptor = "F")
	static float aFloat227;

	@OriginalMember(owner = "client!bq", name = "l", descriptor = "Lclient!bc;")
	Class88 aClass88_14;

	@OriginalMember(owner = "client!bq", name = "h", descriptor = "Lclient!bc;")
	Class88 aClass88_15;

	@OriginalMember(owner = "client!bq", name = "x", descriptor = "Lclient!bc;")
	Class88 aClass88_16;

	@OriginalMember(owner = "client!bq", name = "g", descriptor = "Lclient!bu;")
	Interface5 anInterface5_7;

	@OriginalMember(owner = "client!bq", name = "p", descriptor = "[F")
	float[] aFloatArray92 = new float[16];

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "Lclient!anx;")
	Class3_Sub41_Sub2 aClass3_Sub41_Sub2_3 = new Class3_Sub41_Sub2(786336);

	@OriginalMember(owner = "client!bq", name = "s", descriptor = "I")
	final int anInt2959 = 64;

	@OriginalMember(owner = "client!bq", name = "u", descriptor = "I")
	final int anInt2960 = 768;

	@OriginalMember(owner = "client!bq", name = "y", descriptor = "I")
	final int anInt2962 = 1600;

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "I")
	final int anInt2961 = Class356.method26652(1600);

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "I")
	final int anInt2957 = 64;

	@OriginalMember(owner = "client!bq", name = "z", descriptor = "[I")
	int[] anIntArray281 = new int[8191];

	@OriginalMember(owner = "client!bq", name = "j", descriptor = "[I")
	int[] anIntArray282 = new int[1600];

	@OriginalMember(owner = "client!bq", name = "n", descriptor = "[I")
	int[] anIntArray283 = new int[64];

	@OriginalMember(owner = "client!bq", name = "e", descriptor = "[[Lclient!alj;")
	Class53_Sub1_Sub1[][] aClass53_Sub1_Sub1ArrayArray2 = new Class53_Sub1_Sub1[1600][64];

	@OriginalMember(owner = "client!bq", name = "r", descriptor = "[[Lclient!alj;")
	Class53_Sub1_Sub1[][] aClass53_Sub1_Sub1ArrayArray1 = new Class53_Sub1_Sub1[64][768];

	@OriginalMember(owner = "client!bq", name = "d", descriptor = "I")
	int anInt2958 = 0;

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "()V", line = 29)
	Class99() {
	}

	@OriginalMember(owner = "client!bq", name = "p", descriptor = "(Lclient!abt;)V", line = 32)
	void method21819(@OriginalArg(0) Class21_Sub2 arg0) {
		this.anInterface5_7 = arg0.method4027(24, null, 196584, true);
		this.aClass88_16 = new Class88(this.anInterface5_7, 5126, 2, 0);
		this.aClass88_14 = new Class88(this.anInterface5_7, 5126, 3, 8);
		this.aClass88_15 = new Class88(this.anInterface5_7, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!abt;Lclient!dk;)V", line = 39)
	void method21820(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) Class128 arg1) {
		if (arg0.aClass328_11 == null) {
			return;
		}
		this.method21832(arg0);
		@Pc(12) float local12 = arg0.aClass328_11.aFloatArray106[2];
		@Pc(18) float local18 = arg0.aClass328_11.aFloatArray106[6];
		@Pc(24) float local24 = arg0.aClass328_11.aFloatArray106[10];
		@Pc(30) float local30 = arg0.aClass328_11.aFloatArray106[14];
		try {
			@Pc(32) int local32 = 0;
			@Pc(34) int local34 = Integer.MAX_VALUE;
			@Pc(36) int local36 = 0;
			@Pc(40) Class53_Sub1 local40 = arg1.aClass551_1.aClass53_Sub1_8;
			@Pc(43) Class53_Sub1 local43;
			@Pc(76) int local76;
			for (local43 = local40.aClass53_Sub1_6; local43 != local40; local43 = local43.aClass53_Sub1_6) {
				@Pc(49) Class53_Sub1_Sub1 local49 = (Class53_Sub1_Sub1) local43;
				local76 = (int) (local12 * (float) (local49.anInt2819 >> 12) + local18 * (float) (local49.anInt2814 >> 12) + local24 * (float) (local49.anInt2816 >> 12) + local30);
				if (local76 > local36) {
					local36 = local76;
				}
				if (local76 < local34) {
					local34 = local76;
				}
				this.anIntArray281[local32++] = local76;
			}
			@Pc(100) int local100 = local36 - local34;
			if (local100 + 2 > 1600) {
				local76 = Class356.method26652(local100) + 1 - this.anInt2961;
				local100 = (local100 >> local76) + 2;
			} else {
				local76 = 0;
				local100 += 2;
			}
			local43 = local40.aClass53_Sub1_6;
			local32 = 0;
			@Pc(131) int local131 = -2;
			@Pc(133) boolean local133 = true;
			@Pc(135) boolean local135 = true;
			while (local43 != local40) {
				this.anInt2958 = 0;
				@Pc(143) int local143;
				for (local143 = 0; local143 < local100; local143++) {
					this.anIntArray282[local143] = 0;
				}
				for (local143 = 0; local143 < 64; local143++) {
					this.anIntArray283[local143] = 0;
				}
				while (local43 != local40) {
					@Pc(171) Class53_Sub1_Sub1 local171 = (Class53_Sub1_Sub1) local43;
					if (local135) {
						local131 = local171.anInt2818;
						local133 = local171.aBoolean497;
						local135 = false;
					}
					if (local32 > 0 && (local131 != local171.anInt2818 || local133 != local171.aBoolean497)) {
						local135 = true;
						break;
					}
					@Pc(204) int local204 = this.anIntArray281[local32++] - local34 >> local76;
					if (local204 < 1600) {
						if (this.anIntArray282[local204] < 64) {
							this.aClass53_Sub1_Sub1ArrayArray2[local204][this.anIntArray282[local204]++] = local171;
						} else {
							label91: {
								if (this.anIntArray282[local204] == 64) {
									if (this.anInt2958 == 64) {
										break label91;
									}
									this.anIntArray282[local204] += this.anInt2958++ + 1;
								}
								this.aClass53_Sub1_Sub1ArrayArray1[this.anIntArray282[local204] - 64 - 1][this.anIntArray283[this.anIntArray282[local204] - 64 - 1]++] = local171;
							}
						}
					}
					local43 = local43.aClass53_Sub1_6;
				}
				if (local131 >= 0) {
					arg0.method4070(local131);
				} else {
					arg0.method4070(-1);
				}
				if (local133 && arg0.aFloat44 != aFloat227) {
					arg0.method17111(aFloat227);
				} else if (arg0.aFloat44 != 1.0F) {
					arg0.method17111(1.0F);
				}
				this.method21821(arg0, local100);
			}
		} catch (@Pc(324) Exception local324) {
		}
		this.method21823(arg0);
	}

	@OriginalMember(owner = "client!bq", name = "x", descriptor = "(Lclient!abt;Lclient!dk;)V", line = 39)
	void method21822(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) Class128 arg1) {
		if (arg0.aClass328_11 == null) {
			return;
		}
		this.method21832(arg0);
		@Pc(12) float local12 = arg0.aClass328_11.aFloatArray106[2];
		@Pc(18) float local18 = arg0.aClass328_11.aFloatArray106[6];
		@Pc(24) float local24 = arg0.aClass328_11.aFloatArray106[10];
		@Pc(30) float local30 = arg0.aClass328_11.aFloatArray106[14];
		try {
			@Pc(32) int local32 = 0;
			@Pc(34) int local34 = Integer.MAX_VALUE;
			@Pc(36) int local36 = 0;
			@Pc(40) Class53_Sub1 local40 = arg1.aClass551_1.aClass53_Sub1_8;
			@Pc(43) Class53_Sub1 local43;
			@Pc(76) int local76;
			for (local43 = local40.aClass53_Sub1_6; local43 != local40; local43 = local43.aClass53_Sub1_6) {
				@Pc(49) Class53_Sub1_Sub1 local49 = (Class53_Sub1_Sub1) local43;
				local76 = (int) (local12 * (float) (local49.anInt2819 >> 12) + local18 * (float) (local49.anInt2814 >> 12) + local24 * (float) (local49.anInt2816 >> 12) + local30);
				if (local76 > local36) {
					local36 = local76;
				}
				if (local76 < local34) {
					local34 = local76;
				}
				this.anIntArray281[local32++] = local76;
			}
			@Pc(100) int local100 = local36 - local34;
			if (local100 + 2 > 1600) {
				local76 = Class356.method26652(local100) + 1 - this.anInt2961;
				local100 = (local100 >> local76) + 2;
			} else {
				local76 = 0;
				local100 += 2;
			}
			local43 = local40.aClass53_Sub1_6;
			local32 = 0;
			@Pc(131) int local131 = -2;
			@Pc(133) boolean local133 = true;
			@Pc(135) boolean local135 = true;
			while (local43 != local40) {
				this.anInt2958 = 0;
				@Pc(143) int local143;
				for (local143 = 0; local143 < local100; local143++) {
					this.anIntArray282[local143] = 0;
				}
				for (local143 = 0; local143 < 64; local143++) {
					this.anIntArray283[local143] = 0;
				}
				while (local43 != local40) {
					@Pc(171) Class53_Sub1_Sub1 local171 = (Class53_Sub1_Sub1) local43;
					if (local135) {
						local131 = local171.anInt2818;
						local133 = local171.aBoolean497;
						local135 = false;
					}
					if (local32 > 0 && (local131 != local171.anInt2818 || local133 != local171.aBoolean497)) {
						local135 = true;
						break;
					}
					@Pc(204) int local204 = this.anIntArray281[local32++] - local34 >> local76;
					if (local204 < 1600) {
						if (this.anIntArray282[local204] < 64) {
							this.aClass53_Sub1_Sub1ArrayArray2[local204][this.anIntArray282[local204]++] = local171;
						} else {
							label91: {
								if (this.anIntArray282[local204] == 64) {
									if (this.anInt2958 == 64) {
										break label91;
									}
									this.anIntArray282[local204] += this.anInt2958++ + 1;
								}
								this.aClass53_Sub1_Sub1ArrayArray1[this.anIntArray282[local204] - 64 - 1][this.anIntArray283[this.anIntArray282[local204] - 64 - 1]++] = local171;
							}
						}
					}
					local43 = local43.aClass53_Sub1_6;
				}
				if (local131 >= 0) {
					arg0.method4070(local131);
				} else {
					arg0.method4070(-1);
				}
				if (local133 && arg0.aFloat44 != aFloat227) {
					arg0.method17111(aFloat227);
				} else if (arg0.aFloat44 != 1.0F) {
					arg0.method17111(1.0F);
				}
				this.method21821(arg0, local100);
			}
		} catch (@Pc(324) Exception local324) {
		}
		this.method21823(arg0);
	}

	@OriginalMember(owner = "client!bq", name = "s", descriptor = "(Lclient!abt;I)V", line = 114)
	void method21818(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray92, 0);
		@Pc(9) float local9 = this.aFloatArray92[0];
		@Pc(14) float local14 = this.aFloatArray92[4];
		@Pc(19) float local19 = this.aFloatArray92[8];
		@Pc(24) float local24 = this.aFloatArray92[1];
		@Pc(29) float local29 = this.aFloatArray92[5];
		@Pc(34) float local34 = this.aFloatArray92[9];
		@Pc(38) float local38 = local9 + local24;
		@Pc(42) float local42 = local14 + local29;
		@Pc(46) float local46 = local19 + local34;
		@Pc(50) float local50 = local9 - local24;
		@Pc(54) float local54 = local14 - local29;
		@Pc(58) float local58 = local19 - local34;
		@Pc(62) float local62 = local24 - local9;
		@Pc(66) float local66 = local29 - local14;
		@Pc(70) float local70 = local34 - local19;
		@Pc(73) float[] local73 = new float[3];
		@Pc(76) float[] local76 = new float[3];
		arg0.aClass328_14.method26044(arg0.aClass328_12);
		this.aClass3_Sub41_Sub2_3.anInt2803 = 0;
		@Pc(92) int local92;
		@Pc(107) int local107;
		@Pc(113) int local113;
		@Pc(122) Class53_Sub1_Sub1 local122;
		@Pc(125) int local125;
		@Pc(130) byte local130;
		@Pc(135) byte local135;
		@Pc(138) byte local138;
		@Pc(143) byte local143;
		@Pc(149) float local149;
		@Pc(155) float local155;
		@Pc(161) float local161;
		@Pc(166) int local166;
		@Pc(755) int local755;
		@Pc(702) int local702;
		@Pc(711) Class53_Sub1_Sub1 local711;
		@Pc(714) int local714;
		@Pc(732) byte local732;
		@Pc(750) float local750;
		if (arg0.aBoolean63) {
			for (local92 = arg1 - 1; local92 >= 0; local92--) {
				local107 = this.anIntArray282[local92] > 64 ? 64 : this.anIntArray282[local92];
				if (local107 > 0) {
					for (local113 = local107 - 1; local113 >= 0; local113--) {
						local122 = this.aClass53_Sub1_Sub1ArrayArray2[local92][local113];
						local125 = local122.anInt2815;
						local130 = (byte) (local125 >> 16);
						local135 = (byte) (local125 >> 8);
						local138 = (byte) local125;
						local143 = (byte) (local125 >>> 24);
						local149 = local122.anInt2819 >> 12;
						local155 = local122.anInt2814 >> 12;
						local161 = local122.anInt2816 >> 12;
						local166 = local122.anInt2817 >> 12;
						if (local122.aShort79 == 0) {
							this.aClass3_Sub41_Sub2_3.method20474(0.0F);
							this.aClass3_Sub41_Sub2_3.method20474(0.0F);
							this.aClass3_Sub41_Sub2_3.method20474(local149 + local38 * (float) -local166);
							this.aClass3_Sub41_Sub2_3.method20474(local155 + local42 * (float) -local166);
							this.aClass3_Sub41_Sub2_3.method20474(local161 + local46 * (float) -local166);
							this.aClass3_Sub41_Sub2_3.method20250(local130);
							this.aClass3_Sub41_Sub2_3.method20250(local135);
							this.aClass3_Sub41_Sub2_3.method20250(local138);
							this.aClass3_Sub41_Sub2_3.method20250(local143);
							this.aClass3_Sub41_Sub2_3.method20474(0.0F);
							this.aClass3_Sub41_Sub2_3.method20474(1.0F);
							this.aClass3_Sub41_Sub2_3.method20474(local149 + local62 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20474(local155 + local66 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20474(local161 + local70 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20250(local130);
							this.aClass3_Sub41_Sub2_3.method20250(local135);
							this.aClass3_Sub41_Sub2_3.method20250(local138);
							this.aClass3_Sub41_Sub2_3.method20250(local143);
							this.aClass3_Sub41_Sub2_3.method20474(1.0F);
							this.aClass3_Sub41_Sub2_3.method20474(1.0F);
							this.aClass3_Sub41_Sub2_3.method20474(local149 + local38 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20474(local155 + local42 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20474(local161 + local46 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20250(local130);
							this.aClass3_Sub41_Sub2_3.method20250(local135);
							this.aClass3_Sub41_Sub2_3.method20250(local138);
							this.aClass3_Sub41_Sub2_3.method20250(local143);
							this.aClass3_Sub41_Sub2_3.method20474(1.0F);
							this.aClass3_Sub41_Sub2_3.method20474(0.0F);
							this.aClass3_Sub41_Sub2_3.method20474(local149 + local50 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20474(local155 + local54 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20474(local161 + local58 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20250(local130);
							this.aClass3_Sub41_Sub2_3.method20250(local135);
							this.aClass3_Sub41_Sub2_3.method20250(local138);
							this.aClass3_Sub41_Sub2_3.method20250(local143);
						} else {
							arg0.aClass328_7.method26075(local122.aShort79, local166, local166, 0.0F, 0.0F, 0.0F);
							arg0.aClass328_7.method26046(arg0.aClass328_14);
							arg0.aClass328_7.method26052(1.0F, 0.0F, 0.0F, local73);
							arg0.aClass328_7.method26052(0.0F, 1.0F, 0.0F, local76);
							this.aClass3_Sub41_Sub2_3.method20474(0.0F);
							this.aClass3_Sub41_Sub2_3.method20474(0.0F);
							this.aClass3_Sub41_Sub2_3.method20474(local149 - local73[0] - local76[0]);
							this.aClass3_Sub41_Sub2_3.method20474(local155 - local73[1] - local76[1]);
							this.aClass3_Sub41_Sub2_3.method20474(local161 - local73[2] - local76[2]);
							this.aClass3_Sub41_Sub2_3.method20250(local130);
							this.aClass3_Sub41_Sub2_3.method20250(local135);
							this.aClass3_Sub41_Sub2_3.method20250(local138);
							this.aClass3_Sub41_Sub2_3.method20250(local143);
							this.aClass3_Sub41_Sub2_3.method20474(0.0F);
							this.aClass3_Sub41_Sub2_3.method20474(1.0F);
							this.aClass3_Sub41_Sub2_3.method20474(local149 - local73[0] + local76[0]);
							this.aClass3_Sub41_Sub2_3.method20474(local155 - local73[1] + local76[1]);
							this.aClass3_Sub41_Sub2_3.method20474(local161 - local73[2] + local76[2]);
							this.aClass3_Sub41_Sub2_3.method20250(local130);
							this.aClass3_Sub41_Sub2_3.method20250(local135);
							this.aClass3_Sub41_Sub2_3.method20250(local138);
							this.aClass3_Sub41_Sub2_3.method20250(local143);
							this.aClass3_Sub41_Sub2_3.method20474(1.0F);
							this.aClass3_Sub41_Sub2_3.method20474(1.0F);
							this.aClass3_Sub41_Sub2_3.method20474(local149 + local73[0] + local76[0]);
							this.aClass3_Sub41_Sub2_3.method20474(local155 + local73[1] + local76[1]);
							this.aClass3_Sub41_Sub2_3.method20474(local161 + local73[2] + local76[2]);
							this.aClass3_Sub41_Sub2_3.method20250(local130);
							this.aClass3_Sub41_Sub2_3.method20250(local135);
							this.aClass3_Sub41_Sub2_3.method20250(local138);
							this.aClass3_Sub41_Sub2_3.method20250(local143);
							this.aClass3_Sub41_Sub2_3.method20474(1.0F);
							this.aClass3_Sub41_Sub2_3.method20474(0.0F);
							this.aClass3_Sub41_Sub2_3.method20474(local149 + local73[0] - local76[0]);
							this.aClass3_Sub41_Sub2_3.method20474(local155 + local73[1] - local76[1]);
							this.aClass3_Sub41_Sub2_3.method20474(local161 + local73[2] - local76[2]);
							this.aClass3_Sub41_Sub2_3.method20250(local130);
							this.aClass3_Sub41_Sub2_3.method20250(local135);
							this.aClass3_Sub41_Sub2_3.method20250(local138);
							this.aClass3_Sub41_Sub2_3.method20250(local143);
						}
					}
					if (this.anIntArray282[local92] > 64) {
						local113 = this.anIntArray282[local92] - 64 - 1;
						for (local702 = this.anIntArray283[local113] - 1; local702 >= 0; local702--) {
							local711 = this.aClass53_Sub1_Sub1ArrayArray1[local113][local702];
							local714 = local711.anInt2815;
							local135 = (byte) (local714 >> 16);
							local138 = (byte) (local714 >> 8);
							local143 = (byte) local714;
							local732 = (byte) (local714 >>> 24);
							local155 = local711.anInt2819 >> 12;
							local161 = local711.anInt2814 >> 12;
							local750 = local711.anInt2816 >> 12;
							local755 = local711.anInt2817 >> 12;
							if (local711.aShort79 == 0) {
								this.aClass3_Sub41_Sub2_3.method20474(0.0F);
								this.aClass3_Sub41_Sub2_3.method20474(0.0F);
								this.aClass3_Sub41_Sub2_3.method20474(local155 + local38 * (float) -local755);
								this.aClass3_Sub41_Sub2_3.method20474(local161 + local42 * (float) -local755);
								this.aClass3_Sub41_Sub2_3.method20474(local750 + local46 * (float) -local755);
								this.aClass3_Sub41_Sub2_3.method20250(local135);
								this.aClass3_Sub41_Sub2_3.method20250(local138);
								this.aClass3_Sub41_Sub2_3.method20250(local143);
								this.aClass3_Sub41_Sub2_3.method20250(local732);
								this.aClass3_Sub41_Sub2_3.method20474(0.0F);
								this.aClass3_Sub41_Sub2_3.method20474(1.0F);
								this.aClass3_Sub41_Sub2_3.method20474(local155 + local62 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20474(local161 + local66 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20474(local750 + local70 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20250(local135);
								this.aClass3_Sub41_Sub2_3.method20250(local138);
								this.aClass3_Sub41_Sub2_3.method20250(local143);
								this.aClass3_Sub41_Sub2_3.method20250(local732);
								this.aClass3_Sub41_Sub2_3.method20474(1.0F);
								this.aClass3_Sub41_Sub2_3.method20474(1.0F);
								this.aClass3_Sub41_Sub2_3.method20474(local155 + local38 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20474(local161 + local42 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20474(local750 + local46 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20250(local135);
								this.aClass3_Sub41_Sub2_3.method20250(local138);
								this.aClass3_Sub41_Sub2_3.method20250(local143);
								this.aClass3_Sub41_Sub2_3.method20250(local732);
								this.aClass3_Sub41_Sub2_3.method20474(1.0F);
								this.aClass3_Sub41_Sub2_3.method20474(0.0F);
								this.aClass3_Sub41_Sub2_3.method20474(local155 + local50 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20474(local161 + local54 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20474(local750 + local58 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20250(local135);
								this.aClass3_Sub41_Sub2_3.method20250(local138);
								this.aClass3_Sub41_Sub2_3.method20250(local143);
								this.aClass3_Sub41_Sub2_3.method20250(local732);
							} else {
								arg0.aClass328_7.method26075(local711.aShort79, local755, local755, 0.0F, 0.0F, 0.0F);
								arg0.aClass328_7.method26046(arg0.aClass328_14);
								arg0.aClass328_7.method26052(1.0F, 0.0F, 0.0F, local73);
								arg0.aClass328_7.method26052(0.0F, 1.0F, 0.0F, local76);
								this.aClass3_Sub41_Sub2_3.method20474(0.0F);
								this.aClass3_Sub41_Sub2_3.method20474(0.0F);
								this.aClass3_Sub41_Sub2_3.method20474(local155 - local73[0] - local76[0]);
								this.aClass3_Sub41_Sub2_3.method20474(local161 - local73[1] - local76[1]);
								this.aClass3_Sub41_Sub2_3.method20474(local750 - local73[2] - local76[2]);
								this.aClass3_Sub41_Sub2_3.method20250(local135);
								this.aClass3_Sub41_Sub2_3.method20250(local138);
								this.aClass3_Sub41_Sub2_3.method20250(local143);
								this.aClass3_Sub41_Sub2_3.method20250(local732);
								this.aClass3_Sub41_Sub2_3.method20474(0.0F);
								this.aClass3_Sub41_Sub2_3.method20474(1.0F);
								this.aClass3_Sub41_Sub2_3.method20474(local155 - local73[0] + local76[0]);
								this.aClass3_Sub41_Sub2_3.method20474(local161 - local73[1] + local76[1]);
								this.aClass3_Sub41_Sub2_3.method20474(local750 - local73[2] + local76[2]);
								this.aClass3_Sub41_Sub2_3.method20250(local135);
								this.aClass3_Sub41_Sub2_3.method20250(local138);
								this.aClass3_Sub41_Sub2_3.method20250(local143);
								this.aClass3_Sub41_Sub2_3.method20250(local732);
								this.aClass3_Sub41_Sub2_3.method20474(1.0F);
								this.aClass3_Sub41_Sub2_3.method20474(1.0F);
								this.aClass3_Sub41_Sub2_3.method20474(local155 + local73[0] + local76[0]);
								this.aClass3_Sub41_Sub2_3.method20474(local161 + local73[1] + local76[1]);
								this.aClass3_Sub41_Sub2_3.method20474(local750 + local73[2] + local76[2]);
								this.aClass3_Sub41_Sub2_3.method20250(local135);
								this.aClass3_Sub41_Sub2_3.method20250(local138);
								this.aClass3_Sub41_Sub2_3.method20250(local143);
								this.aClass3_Sub41_Sub2_3.method20250(local732);
								this.aClass3_Sub41_Sub2_3.method20474(1.0F);
								this.aClass3_Sub41_Sub2_3.method20474(0.0F);
								this.aClass3_Sub41_Sub2_3.method20474(local155 + local73[0] - local76[0]);
								this.aClass3_Sub41_Sub2_3.method20474(local161 + local73[1] - local76[1]);
								this.aClass3_Sub41_Sub2_3.method20474(local750 + local73[2] - local76[2]);
								this.aClass3_Sub41_Sub2_3.method20250(local135);
								this.aClass3_Sub41_Sub2_3.method20250(local138);
								this.aClass3_Sub41_Sub2_3.method20250(local143);
								this.aClass3_Sub41_Sub2_3.method20250(local732);
							}
						}
					}
				}
			}
		} else {
			for (local92 = arg1 - 1; local92 >= 0; local92--) {
				local107 = this.anIntArray282[local92] > 64 ? 64 : this.anIntArray282[local92];
				if (local107 > 0) {
					for (local113 = local107 - 1; local113 >= 0; local113--) {
						local122 = this.aClass53_Sub1_Sub1ArrayArray2[local92][local113];
						local125 = local122.anInt2815;
						local130 = (byte) (local125 >> 16);
						local135 = (byte) (local125 >> 8);
						local138 = (byte) local125;
						local143 = (byte) (local125 >>> 24);
						local149 = local122.anInt2819 >> 12;
						local155 = local122.anInt2814 >> 12;
						local161 = local122.anInt2816 >> 12;
						local166 = local122.anInt2817 >> 12;
						if (local122.aShort79 == 0) {
							this.aClass3_Sub41_Sub2_3.method20475(0.0F);
							this.aClass3_Sub41_Sub2_3.method20475(0.0F);
							this.aClass3_Sub41_Sub2_3.method20475(local149 + local38 * (float) -local166);
							this.aClass3_Sub41_Sub2_3.method20475(local155 + local42 * (float) -local166);
							this.aClass3_Sub41_Sub2_3.method20475(local161 + local46 * (float) -local166);
							this.aClass3_Sub41_Sub2_3.method20250(local130);
							this.aClass3_Sub41_Sub2_3.method20250(local135);
							this.aClass3_Sub41_Sub2_3.method20250(local138);
							this.aClass3_Sub41_Sub2_3.method20250(local143);
							this.aClass3_Sub41_Sub2_3.method20475(0.0F);
							this.aClass3_Sub41_Sub2_3.method20475(1.0F);
							this.aClass3_Sub41_Sub2_3.method20475(local149 + local62 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20475(local155 + local66 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20475(local161 + local70 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20250(local130);
							this.aClass3_Sub41_Sub2_3.method20250(local135);
							this.aClass3_Sub41_Sub2_3.method20250(local138);
							this.aClass3_Sub41_Sub2_3.method20250(local143);
							this.aClass3_Sub41_Sub2_3.method20475(1.0F);
							this.aClass3_Sub41_Sub2_3.method20475(1.0F);
							this.aClass3_Sub41_Sub2_3.method20475(local149 + local38 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20475(local155 + local42 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20475(local161 + local46 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20250(local130);
							this.aClass3_Sub41_Sub2_3.method20250(local135);
							this.aClass3_Sub41_Sub2_3.method20250(local138);
							this.aClass3_Sub41_Sub2_3.method20250(local143);
							this.aClass3_Sub41_Sub2_3.method20475(1.0F);
							this.aClass3_Sub41_Sub2_3.method20475(0.0F);
							this.aClass3_Sub41_Sub2_3.method20475(local149 + local50 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20475(local155 + local54 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20475(local161 + local58 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20250(local130);
							this.aClass3_Sub41_Sub2_3.method20250(local135);
							this.aClass3_Sub41_Sub2_3.method20250(local138);
							this.aClass3_Sub41_Sub2_3.method20250(local143);
						} else {
							arg0.aClass328_7.method26075(local122.aShort79, local166, local166, 0.0F, 0.0F, 0.0F);
							arg0.aClass328_7.method26046(arg0.aClass328_14);
							arg0.aClass328_7.method26052(1.0F, 0.0F, 0.0F, local73);
							arg0.aClass328_7.method26052(0.0F, 1.0F, 0.0F, local76);
							this.aClass3_Sub41_Sub2_3.method20475(0.0F);
							this.aClass3_Sub41_Sub2_3.method20475(0.0F);
							this.aClass3_Sub41_Sub2_3.method20475(local149 - local73[0] - local76[0]);
							this.aClass3_Sub41_Sub2_3.method20475(local155 - local73[1] - local76[1]);
							this.aClass3_Sub41_Sub2_3.method20475(local161 - local73[2] - local76[2]);
							this.aClass3_Sub41_Sub2_3.method20250(local130);
							this.aClass3_Sub41_Sub2_3.method20250(local135);
							this.aClass3_Sub41_Sub2_3.method20250(local138);
							this.aClass3_Sub41_Sub2_3.method20250(local143);
							this.aClass3_Sub41_Sub2_3.method20475(0.0F);
							this.aClass3_Sub41_Sub2_3.method20475(1.0F);
							this.aClass3_Sub41_Sub2_3.method20475(local149 - local73[0] + local76[0]);
							this.aClass3_Sub41_Sub2_3.method20475(local155 - local73[1] + local76[1]);
							this.aClass3_Sub41_Sub2_3.method20475(local161 - local73[2] + local76[2]);
							this.aClass3_Sub41_Sub2_3.method20250(local130);
							this.aClass3_Sub41_Sub2_3.method20250(local135);
							this.aClass3_Sub41_Sub2_3.method20250(local138);
							this.aClass3_Sub41_Sub2_3.method20250(local143);
							this.aClass3_Sub41_Sub2_3.method20475(1.0F);
							this.aClass3_Sub41_Sub2_3.method20475(1.0F);
							this.aClass3_Sub41_Sub2_3.method20475(local149 + local73[0] + local76[0]);
							this.aClass3_Sub41_Sub2_3.method20475(local155 + local73[1] + local76[1]);
							this.aClass3_Sub41_Sub2_3.method20475(local161 + local73[2] + local76[2]);
							this.aClass3_Sub41_Sub2_3.method20250(local130);
							this.aClass3_Sub41_Sub2_3.method20250(local135);
							this.aClass3_Sub41_Sub2_3.method20250(local138);
							this.aClass3_Sub41_Sub2_3.method20250(local143);
							this.aClass3_Sub41_Sub2_3.method20475(1.0F);
							this.aClass3_Sub41_Sub2_3.method20475(0.0F);
							this.aClass3_Sub41_Sub2_3.method20475(local149 + local73[0] - local76[0]);
							this.aClass3_Sub41_Sub2_3.method20475(local155 + local73[1] - local76[1]);
							this.aClass3_Sub41_Sub2_3.method20475(local161 + local73[2] - local76[2]);
							this.aClass3_Sub41_Sub2_3.method20250(local130);
							this.aClass3_Sub41_Sub2_3.method20250(local135);
							this.aClass3_Sub41_Sub2_3.method20250(local138);
							this.aClass3_Sub41_Sub2_3.method20250(local143);
						}
					}
					if (this.anIntArray282[local92] > 64) {
						local113 = this.anIntArray282[local92] - 64 - 1;
						for (local702 = this.anIntArray283[local113] - 1; local702 >= 0; local702--) {
							local711 = this.aClass53_Sub1_Sub1ArrayArray1[local113][local702];
							local714 = local711.anInt2815;
							local135 = (byte) (local714 >> 16);
							local138 = (byte) (local714 >> 8);
							local143 = (byte) local714;
							local732 = (byte) (local714 >>> 24);
							local155 = local711.anInt2819 >> 12;
							local161 = local711.anInt2814 >> 12;
							local750 = local711.anInt2816 >> 12;
							local755 = local711.anInt2817 >> 12;
							if (local711.aShort79 == 0) {
								this.aClass3_Sub41_Sub2_3.method20475(0.0F);
								this.aClass3_Sub41_Sub2_3.method20475(0.0F);
								this.aClass3_Sub41_Sub2_3.method20475(local155 + local38 * (float) -local755);
								this.aClass3_Sub41_Sub2_3.method20475(local161 + local42 * (float) -local755);
								this.aClass3_Sub41_Sub2_3.method20475(local750 + local46 * (float) -local755);
								this.aClass3_Sub41_Sub2_3.method20250(local135);
								this.aClass3_Sub41_Sub2_3.method20250(local138);
								this.aClass3_Sub41_Sub2_3.method20250(local143);
								this.aClass3_Sub41_Sub2_3.method20250(local732);
								this.aClass3_Sub41_Sub2_3.method20475(0.0F);
								this.aClass3_Sub41_Sub2_3.method20475(1.0F);
								this.aClass3_Sub41_Sub2_3.method20475(local155 + local62 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20475(local161 + local66 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20475(local750 + local70 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20250(local135);
								this.aClass3_Sub41_Sub2_3.method20250(local138);
								this.aClass3_Sub41_Sub2_3.method20250(local143);
								this.aClass3_Sub41_Sub2_3.method20250(local732);
								this.aClass3_Sub41_Sub2_3.method20475(1.0F);
								this.aClass3_Sub41_Sub2_3.method20475(1.0F);
								this.aClass3_Sub41_Sub2_3.method20475(local155 + local38 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20475(local161 + local42 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20475(local750 + local46 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20250(local135);
								this.aClass3_Sub41_Sub2_3.method20250(local138);
								this.aClass3_Sub41_Sub2_3.method20250(local143);
								this.aClass3_Sub41_Sub2_3.method20250(local732);
								this.aClass3_Sub41_Sub2_3.method20475(1.0F);
								this.aClass3_Sub41_Sub2_3.method20475(0.0F);
								this.aClass3_Sub41_Sub2_3.method20475(local155 + local50 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20475(local161 + local54 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20475(local750 + local58 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20250(local135);
								this.aClass3_Sub41_Sub2_3.method20250(local138);
								this.aClass3_Sub41_Sub2_3.method20250(local143);
								this.aClass3_Sub41_Sub2_3.method20250(local732);
							} else {
								arg0.aClass328_7.method26075(local711.aShort79, local755, local755, 0.0F, 0.0F, 0.0F);
								arg0.aClass328_7.method26046(arg0.aClass328_14);
								arg0.aClass328_7.method26052(1.0F, 0.0F, 0.0F, local73);
								arg0.aClass328_7.method26052(0.0F, 1.0F, 0.0F, local76);
								this.aClass3_Sub41_Sub2_3.method20475(0.0F);
								this.aClass3_Sub41_Sub2_3.method20475(0.0F);
								this.aClass3_Sub41_Sub2_3.method20475(local155 - local73[0] - local76[0]);
								this.aClass3_Sub41_Sub2_3.method20475(local161 - local73[1] - local76[1]);
								this.aClass3_Sub41_Sub2_3.method20475(local750 - local73[2] - local76[2]);
								this.aClass3_Sub41_Sub2_3.method20250(local135);
								this.aClass3_Sub41_Sub2_3.method20250(local138);
								this.aClass3_Sub41_Sub2_3.method20250(local143);
								this.aClass3_Sub41_Sub2_3.method20250(local732);
								this.aClass3_Sub41_Sub2_3.method20475(0.0F);
								this.aClass3_Sub41_Sub2_3.method20475(1.0F);
								this.aClass3_Sub41_Sub2_3.method20475(local155 - local73[0] + local76[0]);
								this.aClass3_Sub41_Sub2_3.method20475(local161 - local73[1] + local76[1]);
								this.aClass3_Sub41_Sub2_3.method20475(local750 - local73[2] + local76[2]);
								this.aClass3_Sub41_Sub2_3.method20250(local135);
								this.aClass3_Sub41_Sub2_3.method20250(local138);
								this.aClass3_Sub41_Sub2_3.method20250(local143);
								this.aClass3_Sub41_Sub2_3.method20250(local732);
								this.aClass3_Sub41_Sub2_3.method20475(1.0F);
								this.aClass3_Sub41_Sub2_3.method20475(1.0F);
								this.aClass3_Sub41_Sub2_3.method20475(local155 + local73[0] + local76[0]);
								this.aClass3_Sub41_Sub2_3.method20475(local161 + local73[1] + local76[1]);
								this.aClass3_Sub41_Sub2_3.method20475(local750 + local73[2] + local76[2]);
								this.aClass3_Sub41_Sub2_3.method20250(local135);
								this.aClass3_Sub41_Sub2_3.method20250(local138);
								this.aClass3_Sub41_Sub2_3.method20250(local143);
								this.aClass3_Sub41_Sub2_3.method20250(local732);
								this.aClass3_Sub41_Sub2_3.method20475(1.0F);
								this.aClass3_Sub41_Sub2_3.method20475(0.0F);
								this.aClass3_Sub41_Sub2_3.method20475(local155 + local73[0] - local76[0]);
								this.aClass3_Sub41_Sub2_3.method20475(local161 + local73[1] - local76[1]);
								this.aClass3_Sub41_Sub2_3.method20475(local750 + local73[2] - local76[2]);
								this.aClass3_Sub41_Sub2_3.method20250(local135);
								this.aClass3_Sub41_Sub2_3.method20250(local138);
								this.aClass3_Sub41_Sub2_3.method20250(local143);
								this.aClass3_Sub41_Sub2_3.method20250(local732);
							}
						}
					}
				}
			}
		}
		if (this.aClass3_Sub41_Sub2_3.anInt2803 * 62066237 != 0) {
			this.anInterface5_7.method977(24, this.aClass3_Sub41_Sub2_3.aByteArray51, this.aClass3_Sub41_Sub2_3.anInt2803 * 62066237);
			arg0.method4064(this.aClass88_14, null, this.aClass88_15, this.aClass88_16);
			arg0.method4128(7, 0, this.aClass3_Sub41_Sub2_3.anInt2803 * 62066237 / 24);
		}
	}

	@OriginalMember(owner = "client!bq", name = "g", descriptor = "(Lclient!abt;I)V", line = 114)
	void method21821(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray92, 0);
		@Pc(9) float local9 = this.aFloatArray92[0];
		@Pc(14) float local14 = this.aFloatArray92[4];
		@Pc(19) float local19 = this.aFloatArray92[8];
		@Pc(24) float local24 = this.aFloatArray92[1];
		@Pc(29) float local29 = this.aFloatArray92[5];
		@Pc(34) float local34 = this.aFloatArray92[9];
		@Pc(38) float local38 = local9 + local24;
		@Pc(42) float local42 = local14 + local29;
		@Pc(46) float local46 = local19 + local34;
		@Pc(50) float local50 = local9 - local24;
		@Pc(54) float local54 = local14 - local29;
		@Pc(58) float local58 = local19 - local34;
		@Pc(62) float local62 = local24 - local9;
		@Pc(66) float local66 = local29 - local14;
		@Pc(70) float local70 = local34 - local19;
		@Pc(73) float[] local73 = new float[3];
		@Pc(76) float[] local76 = new float[3];
		arg0.aClass328_14.method26044(arg0.aClass328_12);
		this.aClass3_Sub41_Sub2_3.anInt2803 = 0;
		@Pc(92) int local92;
		@Pc(107) int local107;
		@Pc(113) int local113;
		@Pc(122) Class53_Sub1_Sub1 local122;
		@Pc(125) int local125;
		@Pc(130) byte local130;
		@Pc(135) byte local135;
		@Pc(138) byte local138;
		@Pc(143) byte local143;
		@Pc(149) float local149;
		@Pc(155) float local155;
		@Pc(161) float local161;
		@Pc(166) int local166;
		@Pc(755) int local755;
		@Pc(702) int local702;
		@Pc(711) Class53_Sub1_Sub1 local711;
		@Pc(714) int local714;
		@Pc(732) byte local732;
		@Pc(750) float local750;
		if (arg0.aBoolean63) {
			for (local92 = arg1 - 1; local92 >= 0; local92--) {
				local107 = this.anIntArray282[local92] > 64 ? 64 : this.anIntArray282[local92];
				if (local107 > 0) {
					for (local113 = local107 - 1; local113 >= 0; local113--) {
						local122 = this.aClass53_Sub1_Sub1ArrayArray2[local92][local113];
						local125 = local122.anInt2815;
						local130 = (byte) (local125 >> 16);
						local135 = (byte) (local125 >> 8);
						local138 = (byte) local125;
						local143 = (byte) (local125 >>> 24);
						local149 = local122.anInt2819 >> 12;
						local155 = local122.anInt2814 >> 12;
						local161 = local122.anInt2816 >> 12;
						local166 = local122.anInt2817 >> 12;
						if (local122.aShort79 == 0) {
							this.aClass3_Sub41_Sub2_3.method20474(0.0F);
							this.aClass3_Sub41_Sub2_3.method20474(0.0F);
							this.aClass3_Sub41_Sub2_3.method20474(local149 + local38 * (float) -local166);
							this.aClass3_Sub41_Sub2_3.method20474(local155 + local42 * (float) -local166);
							this.aClass3_Sub41_Sub2_3.method20474(local161 + local46 * (float) -local166);
							this.aClass3_Sub41_Sub2_3.method20250(local130);
							this.aClass3_Sub41_Sub2_3.method20250(local135);
							this.aClass3_Sub41_Sub2_3.method20250(local138);
							this.aClass3_Sub41_Sub2_3.method20250(local143);
							this.aClass3_Sub41_Sub2_3.method20474(0.0F);
							this.aClass3_Sub41_Sub2_3.method20474(1.0F);
							this.aClass3_Sub41_Sub2_3.method20474(local149 + local62 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20474(local155 + local66 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20474(local161 + local70 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20250(local130);
							this.aClass3_Sub41_Sub2_3.method20250(local135);
							this.aClass3_Sub41_Sub2_3.method20250(local138);
							this.aClass3_Sub41_Sub2_3.method20250(local143);
							this.aClass3_Sub41_Sub2_3.method20474(1.0F);
							this.aClass3_Sub41_Sub2_3.method20474(1.0F);
							this.aClass3_Sub41_Sub2_3.method20474(local149 + local38 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20474(local155 + local42 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20474(local161 + local46 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20250(local130);
							this.aClass3_Sub41_Sub2_3.method20250(local135);
							this.aClass3_Sub41_Sub2_3.method20250(local138);
							this.aClass3_Sub41_Sub2_3.method20250(local143);
							this.aClass3_Sub41_Sub2_3.method20474(1.0F);
							this.aClass3_Sub41_Sub2_3.method20474(0.0F);
							this.aClass3_Sub41_Sub2_3.method20474(local149 + local50 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20474(local155 + local54 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20474(local161 + local58 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20250(local130);
							this.aClass3_Sub41_Sub2_3.method20250(local135);
							this.aClass3_Sub41_Sub2_3.method20250(local138);
							this.aClass3_Sub41_Sub2_3.method20250(local143);
						} else {
							arg0.aClass328_7.method26075(local122.aShort79, local166, local166, 0.0F, 0.0F, 0.0F);
							arg0.aClass328_7.method26046(arg0.aClass328_14);
							arg0.aClass328_7.method26052(1.0F, 0.0F, 0.0F, local73);
							arg0.aClass328_7.method26052(0.0F, 1.0F, 0.0F, local76);
							this.aClass3_Sub41_Sub2_3.method20474(0.0F);
							this.aClass3_Sub41_Sub2_3.method20474(0.0F);
							this.aClass3_Sub41_Sub2_3.method20474(local149 - local73[0] - local76[0]);
							this.aClass3_Sub41_Sub2_3.method20474(local155 - local73[1] - local76[1]);
							this.aClass3_Sub41_Sub2_3.method20474(local161 - local73[2] - local76[2]);
							this.aClass3_Sub41_Sub2_3.method20250(local130);
							this.aClass3_Sub41_Sub2_3.method20250(local135);
							this.aClass3_Sub41_Sub2_3.method20250(local138);
							this.aClass3_Sub41_Sub2_3.method20250(local143);
							this.aClass3_Sub41_Sub2_3.method20474(0.0F);
							this.aClass3_Sub41_Sub2_3.method20474(1.0F);
							this.aClass3_Sub41_Sub2_3.method20474(local149 - local73[0] + local76[0]);
							this.aClass3_Sub41_Sub2_3.method20474(local155 - local73[1] + local76[1]);
							this.aClass3_Sub41_Sub2_3.method20474(local161 - local73[2] + local76[2]);
							this.aClass3_Sub41_Sub2_3.method20250(local130);
							this.aClass3_Sub41_Sub2_3.method20250(local135);
							this.aClass3_Sub41_Sub2_3.method20250(local138);
							this.aClass3_Sub41_Sub2_3.method20250(local143);
							this.aClass3_Sub41_Sub2_3.method20474(1.0F);
							this.aClass3_Sub41_Sub2_3.method20474(1.0F);
							this.aClass3_Sub41_Sub2_3.method20474(local149 + local73[0] + local76[0]);
							this.aClass3_Sub41_Sub2_3.method20474(local155 + local73[1] + local76[1]);
							this.aClass3_Sub41_Sub2_3.method20474(local161 + local73[2] + local76[2]);
							this.aClass3_Sub41_Sub2_3.method20250(local130);
							this.aClass3_Sub41_Sub2_3.method20250(local135);
							this.aClass3_Sub41_Sub2_3.method20250(local138);
							this.aClass3_Sub41_Sub2_3.method20250(local143);
							this.aClass3_Sub41_Sub2_3.method20474(1.0F);
							this.aClass3_Sub41_Sub2_3.method20474(0.0F);
							this.aClass3_Sub41_Sub2_3.method20474(local149 + local73[0] - local76[0]);
							this.aClass3_Sub41_Sub2_3.method20474(local155 + local73[1] - local76[1]);
							this.aClass3_Sub41_Sub2_3.method20474(local161 + local73[2] - local76[2]);
							this.aClass3_Sub41_Sub2_3.method20250(local130);
							this.aClass3_Sub41_Sub2_3.method20250(local135);
							this.aClass3_Sub41_Sub2_3.method20250(local138);
							this.aClass3_Sub41_Sub2_3.method20250(local143);
						}
					}
					if (this.anIntArray282[local92] > 64) {
						local113 = this.anIntArray282[local92] - 64 - 1;
						for (local702 = this.anIntArray283[local113] - 1; local702 >= 0; local702--) {
							local711 = this.aClass53_Sub1_Sub1ArrayArray1[local113][local702];
							local714 = local711.anInt2815;
							local135 = (byte) (local714 >> 16);
							local138 = (byte) (local714 >> 8);
							local143 = (byte) local714;
							local732 = (byte) (local714 >>> 24);
							local155 = local711.anInt2819 >> 12;
							local161 = local711.anInt2814 >> 12;
							local750 = local711.anInt2816 >> 12;
							local755 = local711.anInt2817 >> 12;
							if (local711.aShort79 == 0) {
								this.aClass3_Sub41_Sub2_3.method20474(0.0F);
								this.aClass3_Sub41_Sub2_3.method20474(0.0F);
								this.aClass3_Sub41_Sub2_3.method20474(local155 + local38 * (float) -local755);
								this.aClass3_Sub41_Sub2_3.method20474(local161 + local42 * (float) -local755);
								this.aClass3_Sub41_Sub2_3.method20474(local750 + local46 * (float) -local755);
								this.aClass3_Sub41_Sub2_3.method20250(local135);
								this.aClass3_Sub41_Sub2_3.method20250(local138);
								this.aClass3_Sub41_Sub2_3.method20250(local143);
								this.aClass3_Sub41_Sub2_3.method20250(local732);
								this.aClass3_Sub41_Sub2_3.method20474(0.0F);
								this.aClass3_Sub41_Sub2_3.method20474(1.0F);
								this.aClass3_Sub41_Sub2_3.method20474(local155 + local62 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20474(local161 + local66 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20474(local750 + local70 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20250(local135);
								this.aClass3_Sub41_Sub2_3.method20250(local138);
								this.aClass3_Sub41_Sub2_3.method20250(local143);
								this.aClass3_Sub41_Sub2_3.method20250(local732);
								this.aClass3_Sub41_Sub2_3.method20474(1.0F);
								this.aClass3_Sub41_Sub2_3.method20474(1.0F);
								this.aClass3_Sub41_Sub2_3.method20474(local155 + local38 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20474(local161 + local42 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20474(local750 + local46 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20250(local135);
								this.aClass3_Sub41_Sub2_3.method20250(local138);
								this.aClass3_Sub41_Sub2_3.method20250(local143);
								this.aClass3_Sub41_Sub2_3.method20250(local732);
								this.aClass3_Sub41_Sub2_3.method20474(1.0F);
								this.aClass3_Sub41_Sub2_3.method20474(0.0F);
								this.aClass3_Sub41_Sub2_3.method20474(local155 + local50 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20474(local161 + local54 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20474(local750 + local58 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20250(local135);
								this.aClass3_Sub41_Sub2_3.method20250(local138);
								this.aClass3_Sub41_Sub2_3.method20250(local143);
								this.aClass3_Sub41_Sub2_3.method20250(local732);
							} else {
								arg0.aClass328_7.method26075(local711.aShort79, local755, local755, 0.0F, 0.0F, 0.0F);
								arg0.aClass328_7.method26046(arg0.aClass328_14);
								arg0.aClass328_7.method26052(1.0F, 0.0F, 0.0F, local73);
								arg0.aClass328_7.method26052(0.0F, 1.0F, 0.0F, local76);
								this.aClass3_Sub41_Sub2_3.method20474(0.0F);
								this.aClass3_Sub41_Sub2_3.method20474(0.0F);
								this.aClass3_Sub41_Sub2_3.method20474(local155 - local73[0] - local76[0]);
								this.aClass3_Sub41_Sub2_3.method20474(local161 - local73[1] - local76[1]);
								this.aClass3_Sub41_Sub2_3.method20474(local750 - local73[2] - local76[2]);
								this.aClass3_Sub41_Sub2_3.method20250(local135);
								this.aClass3_Sub41_Sub2_3.method20250(local138);
								this.aClass3_Sub41_Sub2_3.method20250(local143);
								this.aClass3_Sub41_Sub2_3.method20250(local732);
								this.aClass3_Sub41_Sub2_3.method20474(0.0F);
								this.aClass3_Sub41_Sub2_3.method20474(1.0F);
								this.aClass3_Sub41_Sub2_3.method20474(local155 - local73[0] + local76[0]);
								this.aClass3_Sub41_Sub2_3.method20474(local161 - local73[1] + local76[1]);
								this.aClass3_Sub41_Sub2_3.method20474(local750 - local73[2] + local76[2]);
								this.aClass3_Sub41_Sub2_3.method20250(local135);
								this.aClass3_Sub41_Sub2_3.method20250(local138);
								this.aClass3_Sub41_Sub2_3.method20250(local143);
								this.aClass3_Sub41_Sub2_3.method20250(local732);
								this.aClass3_Sub41_Sub2_3.method20474(1.0F);
								this.aClass3_Sub41_Sub2_3.method20474(1.0F);
								this.aClass3_Sub41_Sub2_3.method20474(local155 + local73[0] + local76[0]);
								this.aClass3_Sub41_Sub2_3.method20474(local161 + local73[1] + local76[1]);
								this.aClass3_Sub41_Sub2_3.method20474(local750 + local73[2] + local76[2]);
								this.aClass3_Sub41_Sub2_3.method20250(local135);
								this.aClass3_Sub41_Sub2_3.method20250(local138);
								this.aClass3_Sub41_Sub2_3.method20250(local143);
								this.aClass3_Sub41_Sub2_3.method20250(local732);
								this.aClass3_Sub41_Sub2_3.method20474(1.0F);
								this.aClass3_Sub41_Sub2_3.method20474(0.0F);
								this.aClass3_Sub41_Sub2_3.method20474(local155 + local73[0] - local76[0]);
								this.aClass3_Sub41_Sub2_3.method20474(local161 + local73[1] - local76[1]);
								this.aClass3_Sub41_Sub2_3.method20474(local750 + local73[2] - local76[2]);
								this.aClass3_Sub41_Sub2_3.method20250(local135);
								this.aClass3_Sub41_Sub2_3.method20250(local138);
								this.aClass3_Sub41_Sub2_3.method20250(local143);
								this.aClass3_Sub41_Sub2_3.method20250(local732);
							}
						}
					}
				}
			}
		} else {
			for (local92 = arg1 - 1; local92 >= 0; local92--) {
				local107 = this.anIntArray282[local92] > 64 ? 64 : this.anIntArray282[local92];
				if (local107 > 0) {
					for (local113 = local107 - 1; local113 >= 0; local113--) {
						local122 = this.aClass53_Sub1_Sub1ArrayArray2[local92][local113];
						local125 = local122.anInt2815;
						local130 = (byte) (local125 >> 16);
						local135 = (byte) (local125 >> 8);
						local138 = (byte) local125;
						local143 = (byte) (local125 >>> 24);
						local149 = local122.anInt2819 >> 12;
						local155 = local122.anInt2814 >> 12;
						local161 = local122.anInt2816 >> 12;
						local166 = local122.anInt2817 >> 12;
						if (local122.aShort79 == 0) {
							this.aClass3_Sub41_Sub2_3.method20475(0.0F);
							this.aClass3_Sub41_Sub2_3.method20475(0.0F);
							this.aClass3_Sub41_Sub2_3.method20475(local149 + local38 * (float) -local166);
							this.aClass3_Sub41_Sub2_3.method20475(local155 + local42 * (float) -local166);
							this.aClass3_Sub41_Sub2_3.method20475(local161 + local46 * (float) -local166);
							this.aClass3_Sub41_Sub2_3.method20250(local130);
							this.aClass3_Sub41_Sub2_3.method20250(local135);
							this.aClass3_Sub41_Sub2_3.method20250(local138);
							this.aClass3_Sub41_Sub2_3.method20250(local143);
							this.aClass3_Sub41_Sub2_3.method20475(0.0F);
							this.aClass3_Sub41_Sub2_3.method20475(1.0F);
							this.aClass3_Sub41_Sub2_3.method20475(local149 + local62 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20475(local155 + local66 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20475(local161 + local70 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20250(local130);
							this.aClass3_Sub41_Sub2_3.method20250(local135);
							this.aClass3_Sub41_Sub2_3.method20250(local138);
							this.aClass3_Sub41_Sub2_3.method20250(local143);
							this.aClass3_Sub41_Sub2_3.method20475(1.0F);
							this.aClass3_Sub41_Sub2_3.method20475(1.0F);
							this.aClass3_Sub41_Sub2_3.method20475(local149 + local38 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20475(local155 + local42 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20475(local161 + local46 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20250(local130);
							this.aClass3_Sub41_Sub2_3.method20250(local135);
							this.aClass3_Sub41_Sub2_3.method20250(local138);
							this.aClass3_Sub41_Sub2_3.method20250(local143);
							this.aClass3_Sub41_Sub2_3.method20475(1.0F);
							this.aClass3_Sub41_Sub2_3.method20475(0.0F);
							this.aClass3_Sub41_Sub2_3.method20475(local149 + local50 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20475(local155 + local54 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20475(local161 + local58 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20250(local130);
							this.aClass3_Sub41_Sub2_3.method20250(local135);
							this.aClass3_Sub41_Sub2_3.method20250(local138);
							this.aClass3_Sub41_Sub2_3.method20250(local143);
						} else {
							arg0.aClass328_7.method26075(local122.aShort79, local166, local166, 0.0F, 0.0F, 0.0F);
							arg0.aClass328_7.method26046(arg0.aClass328_14);
							arg0.aClass328_7.method26052(1.0F, 0.0F, 0.0F, local73);
							arg0.aClass328_7.method26052(0.0F, 1.0F, 0.0F, local76);
							this.aClass3_Sub41_Sub2_3.method20475(0.0F);
							this.aClass3_Sub41_Sub2_3.method20475(0.0F);
							this.aClass3_Sub41_Sub2_3.method20475(local149 - local73[0] - local76[0]);
							this.aClass3_Sub41_Sub2_3.method20475(local155 - local73[1] - local76[1]);
							this.aClass3_Sub41_Sub2_3.method20475(local161 - local73[2] - local76[2]);
							this.aClass3_Sub41_Sub2_3.method20250(local130);
							this.aClass3_Sub41_Sub2_3.method20250(local135);
							this.aClass3_Sub41_Sub2_3.method20250(local138);
							this.aClass3_Sub41_Sub2_3.method20250(local143);
							this.aClass3_Sub41_Sub2_3.method20475(0.0F);
							this.aClass3_Sub41_Sub2_3.method20475(1.0F);
							this.aClass3_Sub41_Sub2_3.method20475(local149 - local73[0] + local76[0]);
							this.aClass3_Sub41_Sub2_3.method20475(local155 - local73[1] + local76[1]);
							this.aClass3_Sub41_Sub2_3.method20475(local161 - local73[2] + local76[2]);
							this.aClass3_Sub41_Sub2_3.method20250(local130);
							this.aClass3_Sub41_Sub2_3.method20250(local135);
							this.aClass3_Sub41_Sub2_3.method20250(local138);
							this.aClass3_Sub41_Sub2_3.method20250(local143);
							this.aClass3_Sub41_Sub2_3.method20475(1.0F);
							this.aClass3_Sub41_Sub2_3.method20475(1.0F);
							this.aClass3_Sub41_Sub2_3.method20475(local149 + local73[0] + local76[0]);
							this.aClass3_Sub41_Sub2_3.method20475(local155 + local73[1] + local76[1]);
							this.aClass3_Sub41_Sub2_3.method20475(local161 + local73[2] + local76[2]);
							this.aClass3_Sub41_Sub2_3.method20250(local130);
							this.aClass3_Sub41_Sub2_3.method20250(local135);
							this.aClass3_Sub41_Sub2_3.method20250(local138);
							this.aClass3_Sub41_Sub2_3.method20250(local143);
							this.aClass3_Sub41_Sub2_3.method20475(1.0F);
							this.aClass3_Sub41_Sub2_3.method20475(0.0F);
							this.aClass3_Sub41_Sub2_3.method20475(local149 + local73[0] - local76[0]);
							this.aClass3_Sub41_Sub2_3.method20475(local155 + local73[1] - local76[1]);
							this.aClass3_Sub41_Sub2_3.method20475(local161 + local73[2] - local76[2]);
							this.aClass3_Sub41_Sub2_3.method20250(local130);
							this.aClass3_Sub41_Sub2_3.method20250(local135);
							this.aClass3_Sub41_Sub2_3.method20250(local138);
							this.aClass3_Sub41_Sub2_3.method20250(local143);
						}
					}
					if (this.anIntArray282[local92] > 64) {
						local113 = this.anIntArray282[local92] - 64 - 1;
						for (local702 = this.anIntArray283[local113] - 1; local702 >= 0; local702--) {
							local711 = this.aClass53_Sub1_Sub1ArrayArray1[local113][local702];
							local714 = local711.anInt2815;
							local135 = (byte) (local714 >> 16);
							local138 = (byte) (local714 >> 8);
							local143 = (byte) local714;
							local732 = (byte) (local714 >>> 24);
							local155 = local711.anInt2819 >> 12;
							local161 = local711.anInt2814 >> 12;
							local750 = local711.anInt2816 >> 12;
							local755 = local711.anInt2817 >> 12;
							if (local711.aShort79 == 0) {
								this.aClass3_Sub41_Sub2_3.method20475(0.0F);
								this.aClass3_Sub41_Sub2_3.method20475(0.0F);
								this.aClass3_Sub41_Sub2_3.method20475(local155 + local38 * (float) -local755);
								this.aClass3_Sub41_Sub2_3.method20475(local161 + local42 * (float) -local755);
								this.aClass3_Sub41_Sub2_3.method20475(local750 + local46 * (float) -local755);
								this.aClass3_Sub41_Sub2_3.method20250(local135);
								this.aClass3_Sub41_Sub2_3.method20250(local138);
								this.aClass3_Sub41_Sub2_3.method20250(local143);
								this.aClass3_Sub41_Sub2_3.method20250(local732);
								this.aClass3_Sub41_Sub2_3.method20475(0.0F);
								this.aClass3_Sub41_Sub2_3.method20475(1.0F);
								this.aClass3_Sub41_Sub2_3.method20475(local155 + local62 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20475(local161 + local66 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20475(local750 + local70 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20250(local135);
								this.aClass3_Sub41_Sub2_3.method20250(local138);
								this.aClass3_Sub41_Sub2_3.method20250(local143);
								this.aClass3_Sub41_Sub2_3.method20250(local732);
								this.aClass3_Sub41_Sub2_3.method20475(1.0F);
								this.aClass3_Sub41_Sub2_3.method20475(1.0F);
								this.aClass3_Sub41_Sub2_3.method20475(local155 + local38 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20475(local161 + local42 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20475(local750 + local46 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20250(local135);
								this.aClass3_Sub41_Sub2_3.method20250(local138);
								this.aClass3_Sub41_Sub2_3.method20250(local143);
								this.aClass3_Sub41_Sub2_3.method20250(local732);
								this.aClass3_Sub41_Sub2_3.method20475(1.0F);
								this.aClass3_Sub41_Sub2_3.method20475(0.0F);
								this.aClass3_Sub41_Sub2_3.method20475(local155 + local50 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20475(local161 + local54 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20475(local750 + local58 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20250(local135);
								this.aClass3_Sub41_Sub2_3.method20250(local138);
								this.aClass3_Sub41_Sub2_3.method20250(local143);
								this.aClass3_Sub41_Sub2_3.method20250(local732);
							} else {
								arg0.aClass328_7.method26075(local711.aShort79, local755, local755, 0.0F, 0.0F, 0.0F);
								arg0.aClass328_7.method26046(arg0.aClass328_14);
								arg0.aClass328_7.method26052(1.0F, 0.0F, 0.0F, local73);
								arg0.aClass328_7.method26052(0.0F, 1.0F, 0.0F, local76);
								this.aClass3_Sub41_Sub2_3.method20475(0.0F);
								this.aClass3_Sub41_Sub2_3.method20475(0.0F);
								this.aClass3_Sub41_Sub2_3.method20475(local155 - local73[0] - local76[0]);
								this.aClass3_Sub41_Sub2_3.method20475(local161 - local73[1] - local76[1]);
								this.aClass3_Sub41_Sub2_3.method20475(local750 - local73[2] - local76[2]);
								this.aClass3_Sub41_Sub2_3.method20250(local135);
								this.aClass3_Sub41_Sub2_3.method20250(local138);
								this.aClass3_Sub41_Sub2_3.method20250(local143);
								this.aClass3_Sub41_Sub2_3.method20250(local732);
								this.aClass3_Sub41_Sub2_3.method20475(0.0F);
								this.aClass3_Sub41_Sub2_3.method20475(1.0F);
								this.aClass3_Sub41_Sub2_3.method20475(local155 - local73[0] + local76[0]);
								this.aClass3_Sub41_Sub2_3.method20475(local161 - local73[1] + local76[1]);
								this.aClass3_Sub41_Sub2_3.method20475(local750 - local73[2] + local76[2]);
								this.aClass3_Sub41_Sub2_3.method20250(local135);
								this.aClass3_Sub41_Sub2_3.method20250(local138);
								this.aClass3_Sub41_Sub2_3.method20250(local143);
								this.aClass3_Sub41_Sub2_3.method20250(local732);
								this.aClass3_Sub41_Sub2_3.method20475(1.0F);
								this.aClass3_Sub41_Sub2_3.method20475(1.0F);
								this.aClass3_Sub41_Sub2_3.method20475(local155 + local73[0] + local76[0]);
								this.aClass3_Sub41_Sub2_3.method20475(local161 + local73[1] + local76[1]);
								this.aClass3_Sub41_Sub2_3.method20475(local750 + local73[2] + local76[2]);
								this.aClass3_Sub41_Sub2_3.method20250(local135);
								this.aClass3_Sub41_Sub2_3.method20250(local138);
								this.aClass3_Sub41_Sub2_3.method20250(local143);
								this.aClass3_Sub41_Sub2_3.method20250(local732);
								this.aClass3_Sub41_Sub2_3.method20475(1.0F);
								this.aClass3_Sub41_Sub2_3.method20475(0.0F);
								this.aClass3_Sub41_Sub2_3.method20475(local155 + local73[0] - local76[0]);
								this.aClass3_Sub41_Sub2_3.method20475(local161 + local73[1] - local76[1]);
								this.aClass3_Sub41_Sub2_3.method20475(local750 + local73[2] - local76[2]);
								this.aClass3_Sub41_Sub2_3.method20250(local135);
								this.aClass3_Sub41_Sub2_3.method20250(local138);
								this.aClass3_Sub41_Sub2_3.method20250(local143);
								this.aClass3_Sub41_Sub2_3.method20250(local732);
							}
						}
					}
				}
			}
		}
		if (this.aClass3_Sub41_Sub2_3.anInt2803 * 62066237 != 0) {
			this.anInterface5_7.method977(24, this.aClass3_Sub41_Sub2_3.aByteArray51, this.aClass3_Sub41_Sub2_3.anInt2803 * 62066237);
			arg0.method4064(this.aClass88_14, null, this.aClass88_15, this.aClass88_16);
			arg0.method4128(7, 0, this.aClass3_Sub41_Sub2_3.anInt2803 * 62066237 / 24);
		}
	}

	@OriginalMember(owner = "client!bq", name = "u", descriptor = "(Lclient!abt;I)V", line = 114)
	void method21825(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray92, 0);
		@Pc(9) float local9 = this.aFloatArray92[0];
		@Pc(14) float local14 = this.aFloatArray92[4];
		@Pc(19) float local19 = this.aFloatArray92[8];
		@Pc(24) float local24 = this.aFloatArray92[1];
		@Pc(29) float local29 = this.aFloatArray92[5];
		@Pc(34) float local34 = this.aFloatArray92[9];
		@Pc(38) float local38 = local9 + local24;
		@Pc(42) float local42 = local14 + local29;
		@Pc(46) float local46 = local19 + local34;
		@Pc(50) float local50 = local9 - local24;
		@Pc(54) float local54 = local14 - local29;
		@Pc(58) float local58 = local19 - local34;
		@Pc(62) float local62 = local24 - local9;
		@Pc(66) float local66 = local29 - local14;
		@Pc(70) float local70 = local34 - local19;
		@Pc(73) float[] local73 = new float[3];
		@Pc(76) float[] local76 = new float[3];
		arg0.aClass328_14.method26044(arg0.aClass328_12);
		this.aClass3_Sub41_Sub2_3.anInt2803 = 0;
		@Pc(92) int local92;
		@Pc(107) int local107;
		@Pc(113) int local113;
		@Pc(122) Class53_Sub1_Sub1 local122;
		@Pc(125) int local125;
		@Pc(130) byte local130;
		@Pc(135) byte local135;
		@Pc(138) byte local138;
		@Pc(143) byte local143;
		@Pc(149) float local149;
		@Pc(155) float local155;
		@Pc(161) float local161;
		@Pc(166) int local166;
		@Pc(755) int local755;
		@Pc(702) int local702;
		@Pc(711) Class53_Sub1_Sub1 local711;
		@Pc(714) int local714;
		@Pc(732) byte local732;
		@Pc(750) float local750;
		if (arg0.aBoolean63) {
			for (local92 = arg1 - 1; local92 >= 0; local92--) {
				local107 = this.anIntArray282[local92] > 64 ? 64 : this.anIntArray282[local92];
				if (local107 > 0) {
					for (local113 = local107 - 1; local113 >= 0; local113--) {
						local122 = this.aClass53_Sub1_Sub1ArrayArray2[local92][local113];
						local125 = local122.anInt2815;
						local130 = (byte) (local125 >> 16);
						local135 = (byte) (local125 >> 8);
						local138 = (byte) local125;
						local143 = (byte) (local125 >>> 24);
						local149 = local122.anInt2819 >> 12;
						local155 = local122.anInt2814 >> 12;
						local161 = local122.anInt2816 >> 12;
						local166 = local122.anInt2817 >> 12;
						if (local122.aShort79 == 0) {
							this.aClass3_Sub41_Sub2_3.method20474(0.0F);
							this.aClass3_Sub41_Sub2_3.method20474(0.0F);
							this.aClass3_Sub41_Sub2_3.method20474(local149 + local38 * (float) -local166);
							this.aClass3_Sub41_Sub2_3.method20474(local155 + local42 * (float) -local166);
							this.aClass3_Sub41_Sub2_3.method20474(local161 + local46 * (float) -local166);
							this.aClass3_Sub41_Sub2_3.method20250(local130);
							this.aClass3_Sub41_Sub2_3.method20250(local135);
							this.aClass3_Sub41_Sub2_3.method20250(local138);
							this.aClass3_Sub41_Sub2_3.method20250(local143);
							this.aClass3_Sub41_Sub2_3.method20474(0.0F);
							this.aClass3_Sub41_Sub2_3.method20474(1.0F);
							this.aClass3_Sub41_Sub2_3.method20474(local149 + local62 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20474(local155 + local66 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20474(local161 + local70 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20250(local130);
							this.aClass3_Sub41_Sub2_3.method20250(local135);
							this.aClass3_Sub41_Sub2_3.method20250(local138);
							this.aClass3_Sub41_Sub2_3.method20250(local143);
							this.aClass3_Sub41_Sub2_3.method20474(1.0F);
							this.aClass3_Sub41_Sub2_3.method20474(1.0F);
							this.aClass3_Sub41_Sub2_3.method20474(local149 + local38 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20474(local155 + local42 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20474(local161 + local46 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20250(local130);
							this.aClass3_Sub41_Sub2_3.method20250(local135);
							this.aClass3_Sub41_Sub2_3.method20250(local138);
							this.aClass3_Sub41_Sub2_3.method20250(local143);
							this.aClass3_Sub41_Sub2_3.method20474(1.0F);
							this.aClass3_Sub41_Sub2_3.method20474(0.0F);
							this.aClass3_Sub41_Sub2_3.method20474(local149 + local50 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20474(local155 + local54 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20474(local161 + local58 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20250(local130);
							this.aClass3_Sub41_Sub2_3.method20250(local135);
							this.aClass3_Sub41_Sub2_3.method20250(local138);
							this.aClass3_Sub41_Sub2_3.method20250(local143);
						} else {
							arg0.aClass328_7.method26075(local122.aShort79, local166, local166, 0.0F, 0.0F, 0.0F);
							arg0.aClass328_7.method26046(arg0.aClass328_14);
							arg0.aClass328_7.method26052(1.0F, 0.0F, 0.0F, local73);
							arg0.aClass328_7.method26052(0.0F, 1.0F, 0.0F, local76);
							this.aClass3_Sub41_Sub2_3.method20474(0.0F);
							this.aClass3_Sub41_Sub2_3.method20474(0.0F);
							this.aClass3_Sub41_Sub2_3.method20474(local149 - local73[0] - local76[0]);
							this.aClass3_Sub41_Sub2_3.method20474(local155 - local73[1] - local76[1]);
							this.aClass3_Sub41_Sub2_3.method20474(local161 - local73[2] - local76[2]);
							this.aClass3_Sub41_Sub2_3.method20250(local130);
							this.aClass3_Sub41_Sub2_3.method20250(local135);
							this.aClass3_Sub41_Sub2_3.method20250(local138);
							this.aClass3_Sub41_Sub2_3.method20250(local143);
							this.aClass3_Sub41_Sub2_3.method20474(0.0F);
							this.aClass3_Sub41_Sub2_3.method20474(1.0F);
							this.aClass3_Sub41_Sub2_3.method20474(local149 - local73[0] + local76[0]);
							this.aClass3_Sub41_Sub2_3.method20474(local155 - local73[1] + local76[1]);
							this.aClass3_Sub41_Sub2_3.method20474(local161 - local73[2] + local76[2]);
							this.aClass3_Sub41_Sub2_3.method20250(local130);
							this.aClass3_Sub41_Sub2_3.method20250(local135);
							this.aClass3_Sub41_Sub2_3.method20250(local138);
							this.aClass3_Sub41_Sub2_3.method20250(local143);
							this.aClass3_Sub41_Sub2_3.method20474(1.0F);
							this.aClass3_Sub41_Sub2_3.method20474(1.0F);
							this.aClass3_Sub41_Sub2_3.method20474(local149 + local73[0] + local76[0]);
							this.aClass3_Sub41_Sub2_3.method20474(local155 + local73[1] + local76[1]);
							this.aClass3_Sub41_Sub2_3.method20474(local161 + local73[2] + local76[2]);
							this.aClass3_Sub41_Sub2_3.method20250(local130);
							this.aClass3_Sub41_Sub2_3.method20250(local135);
							this.aClass3_Sub41_Sub2_3.method20250(local138);
							this.aClass3_Sub41_Sub2_3.method20250(local143);
							this.aClass3_Sub41_Sub2_3.method20474(1.0F);
							this.aClass3_Sub41_Sub2_3.method20474(0.0F);
							this.aClass3_Sub41_Sub2_3.method20474(local149 + local73[0] - local76[0]);
							this.aClass3_Sub41_Sub2_3.method20474(local155 + local73[1] - local76[1]);
							this.aClass3_Sub41_Sub2_3.method20474(local161 + local73[2] - local76[2]);
							this.aClass3_Sub41_Sub2_3.method20250(local130);
							this.aClass3_Sub41_Sub2_3.method20250(local135);
							this.aClass3_Sub41_Sub2_3.method20250(local138);
							this.aClass3_Sub41_Sub2_3.method20250(local143);
						}
					}
					if (this.anIntArray282[local92] > 64) {
						local113 = this.anIntArray282[local92] - 64 - 1;
						for (local702 = this.anIntArray283[local113] - 1; local702 >= 0; local702--) {
							local711 = this.aClass53_Sub1_Sub1ArrayArray1[local113][local702];
							local714 = local711.anInt2815;
							local135 = (byte) (local714 >> 16);
							local138 = (byte) (local714 >> 8);
							local143 = (byte) local714;
							local732 = (byte) (local714 >>> 24);
							local155 = local711.anInt2819 >> 12;
							local161 = local711.anInt2814 >> 12;
							local750 = local711.anInt2816 >> 12;
							local755 = local711.anInt2817 >> 12;
							if (local711.aShort79 == 0) {
								this.aClass3_Sub41_Sub2_3.method20474(0.0F);
								this.aClass3_Sub41_Sub2_3.method20474(0.0F);
								this.aClass3_Sub41_Sub2_3.method20474(local155 + local38 * (float) -local755);
								this.aClass3_Sub41_Sub2_3.method20474(local161 + local42 * (float) -local755);
								this.aClass3_Sub41_Sub2_3.method20474(local750 + local46 * (float) -local755);
								this.aClass3_Sub41_Sub2_3.method20250(local135);
								this.aClass3_Sub41_Sub2_3.method20250(local138);
								this.aClass3_Sub41_Sub2_3.method20250(local143);
								this.aClass3_Sub41_Sub2_3.method20250(local732);
								this.aClass3_Sub41_Sub2_3.method20474(0.0F);
								this.aClass3_Sub41_Sub2_3.method20474(1.0F);
								this.aClass3_Sub41_Sub2_3.method20474(local155 + local62 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20474(local161 + local66 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20474(local750 + local70 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20250(local135);
								this.aClass3_Sub41_Sub2_3.method20250(local138);
								this.aClass3_Sub41_Sub2_3.method20250(local143);
								this.aClass3_Sub41_Sub2_3.method20250(local732);
								this.aClass3_Sub41_Sub2_3.method20474(1.0F);
								this.aClass3_Sub41_Sub2_3.method20474(1.0F);
								this.aClass3_Sub41_Sub2_3.method20474(local155 + local38 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20474(local161 + local42 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20474(local750 + local46 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20250(local135);
								this.aClass3_Sub41_Sub2_3.method20250(local138);
								this.aClass3_Sub41_Sub2_3.method20250(local143);
								this.aClass3_Sub41_Sub2_3.method20250(local732);
								this.aClass3_Sub41_Sub2_3.method20474(1.0F);
								this.aClass3_Sub41_Sub2_3.method20474(0.0F);
								this.aClass3_Sub41_Sub2_3.method20474(local155 + local50 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20474(local161 + local54 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20474(local750 + local58 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20250(local135);
								this.aClass3_Sub41_Sub2_3.method20250(local138);
								this.aClass3_Sub41_Sub2_3.method20250(local143);
								this.aClass3_Sub41_Sub2_3.method20250(local732);
							} else {
								arg0.aClass328_7.method26075(local711.aShort79, local755, local755, 0.0F, 0.0F, 0.0F);
								arg0.aClass328_7.method26046(arg0.aClass328_14);
								arg0.aClass328_7.method26052(1.0F, 0.0F, 0.0F, local73);
								arg0.aClass328_7.method26052(0.0F, 1.0F, 0.0F, local76);
								this.aClass3_Sub41_Sub2_3.method20474(0.0F);
								this.aClass3_Sub41_Sub2_3.method20474(0.0F);
								this.aClass3_Sub41_Sub2_3.method20474(local155 - local73[0] - local76[0]);
								this.aClass3_Sub41_Sub2_3.method20474(local161 - local73[1] - local76[1]);
								this.aClass3_Sub41_Sub2_3.method20474(local750 - local73[2] - local76[2]);
								this.aClass3_Sub41_Sub2_3.method20250(local135);
								this.aClass3_Sub41_Sub2_3.method20250(local138);
								this.aClass3_Sub41_Sub2_3.method20250(local143);
								this.aClass3_Sub41_Sub2_3.method20250(local732);
								this.aClass3_Sub41_Sub2_3.method20474(0.0F);
								this.aClass3_Sub41_Sub2_3.method20474(1.0F);
								this.aClass3_Sub41_Sub2_3.method20474(local155 - local73[0] + local76[0]);
								this.aClass3_Sub41_Sub2_3.method20474(local161 - local73[1] + local76[1]);
								this.aClass3_Sub41_Sub2_3.method20474(local750 - local73[2] + local76[2]);
								this.aClass3_Sub41_Sub2_3.method20250(local135);
								this.aClass3_Sub41_Sub2_3.method20250(local138);
								this.aClass3_Sub41_Sub2_3.method20250(local143);
								this.aClass3_Sub41_Sub2_3.method20250(local732);
								this.aClass3_Sub41_Sub2_3.method20474(1.0F);
								this.aClass3_Sub41_Sub2_3.method20474(1.0F);
								this.aClass3_Sub41_Sub2_3.method20474(local155 + local73[0] + local76[0]);
								this.aClass3_Sub41_Sub2_3.method20474(local161 + local73[1] + local76[1]);
								this.aClass3_Sub41_Sub2_3.method20474(local750 + local73[2] + local76[2]);
								this.aClass3_Sub41_Sub2_3.method20250(local135);
								this.aClass3_Sub41_Sub2_3.method20250(local138);
								this.aClass3_Sub41_Sub2_3.method20250(local143);
								this.aClass3_Sub41_Sub2_3.method20250(local732);
								this.aClass3_Sub41_Sub2_3.method20474(1.0F);
								this.aClass3_Sub41_Sub2_3.method20474(0.0F);
								this.aClass3_Sub41_Sub2_3.method20474(local155 + local73[0] - local76[0]);
								this.aClass3_Sub41_Sub2_3.method20474(local161 + local73[1] - local76[1]);
								this.aClass3_Sub41_Sub2_3.method20474(local750 + local73[2] - local76[2]);
								this.aClass3_Sub41_Sub2_3.method20250(local135);
								this.aClass3_Sub41_Sub2_3.method20250(local138);
								this.aClass3_Sub41_Sub2_3.method20250(local143);
								this.aClass3_Sub41_Sub2_3.method20250(local732);
							}
						}
					}
				}
			}
		} else {
			for (local92 = arg1 - 1; local92 >= 0; local92--) {
				local107 = this.anIntArray282[local92] > 64 ? 64 : this.anIntArray282[local92];
				if (local107 > 0) {
					for (local113 = local107 - 1; local113 >= 0; local113--) {
						local122 = this.aClass53_Sub1_Sub1ArrayArray2[local92][local113];
						local125 = local122.anInt2815;
						local130 = (byte) (local125 >> 16);
						local135 = (byte) (local125 >> 8);
						local138 = (byte) local125;
						local143 = (byte) (local125 >>> 24);
						local149 = local122.anInt2819 >> 12;
						local155 = local122.anInt2814 >> 12;
						local161 = local122.anInt2816 >> 12;
						local166 = local122.anInt2817 >> 12;
						if (local122.aShort79 == 0) {
							this.aClass3_Sub41_Sub2_3.method20475(0.0F);
							this.aClass3_Sub41_Sub2_3.method20475(0.0F);
							this.aClass3_Sub41_Sub2_3.method20475(local149 + local38 * (float) -local166);
							this.aClass3_Sub41_Sub2_3.method20475(local155 + local42 * (float) -local166);
							this.aClass3_Sub41_Sub2_3.method20475(local161 + local46 * (float) -local166);
							this.aClass3_Sub41_Sub2_3.method20250(local130);
							this.aClass3_Sub41_Sub2_3.method20250(local135);
							this.aClass3_Sub41_Sub2_3.method20250(local138);
							this.aClass3_Sub41_Sub2_3.method20250(local143);
							this.aClass3_Sub41_Sub2_3.method20475(0.0F);
							this.aClass3_Sub41_Sub2_3.method20475(1.0F);
							this.aClass3_Sub41_Sub2_3.method20475(local149 + local62 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20475(local155 + local66 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20475(local161 + local70 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20250(local130);
							this.aClass3_Sub41_Sub2_3.method20250(local135);
							this.aClass3_Sub41_Sub2_3.method20250(local138);
							this.aClass3_Sub41_Sub2_3.method20250(local143);
							this.aClass3_Sub41_Sub2_3.method20475(1.0F);
							this.aClass3_Sub41_Sub2_3.method20475(1.0F);
							this.aClass3_Sub41_Sub2_3.method20475(local149 + local38 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20475(local155 + local42 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20475(local161 + local46 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20250(local130);
							this.aClass3_Sub41_Sub2_3.method20250(local135);
							this.aClass3_Sub41_Sub2_3.method20250(local138);
							this.aClass3_Sub41_Sub2_3.method20250(local143);
							this.aClass3_Sub41_Sub2_3.method20475(1.0F);
							this.aClass3_Sub41_Sub2_3.method20475(0.0F);
							this.aClass3_Sub41_Sub2_3.method20475(local149 + local50 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20475(local155 + local54 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20475(local161 + local58 * (float) local166);
							this.aClass3_Sub41_Sub2_3.method20250(local130);
							this.aClass3_Sub41_Sub2_3.method20250(local135);
							this.aClass3_Sub41_Sub2_3.method20250(local138);
							this.aClass3_Sub41_Sub2_3.method20250(local143);
						} else {
							arg0.aClass328_7.method26075(local122.aShort79, local166, local166, 0.0F, 0.0F, 0.0F);
							arg0.aClass328_7.method26046(arg0.aClass328_14);
							arg0.aClass328_7.method26052(1.0F, 0.0F, 0.0F, local73);
							arg0.aClass328_7.method26052(0.0F, 1.0F, 0.0F, local76);
							this.aClass3_Sub41_Sub2_3.method20475(0.0F);
							this.aClass3_Sub41_Sub2_3.method20475(0.0F);
							this.aClass3_Sub41_Sub2_3.method20475(local149 - local73[0] - local76[0]);
							this.aClass3_Sub41_Sub2_3.method20475(local155 - local73[1] - local76[1]);
							this.aClass3_Sub41_Sub2_3.method20475(local161 - local73[2] - local76[2]);
							this.aClass3_Sub41_Sub2_3.method20250(local130);
							this.aClass3_Sub41_Sub2_3.method20250(local135);
							this.aClass3_Sub41_Sub2_3.method20250(local138);
							this.aClass3_Sub41_Sub2_3.method20250(local143);
							this.aClass3_Sub41_Sub2_3.method20475(0.0F);
							this.aClass3_Sub41_Sub2_3.method20475(1.0F);
							this.aClass3_Sub41_Sub2_3.method20475(local149 - local73[0] + local76[0]);
							this.aClass3_Sub41_Sub2_3.method20475(local155 - local73[1] + local76[1]);
							this.aClass3_Sub41_Sub2_3.method20475(local161 - local73[2] + local76[2]);
							this.aClass3_Sub41_Sub2_3.method20250(local130);
							this.aClass3_Sub41_Sub2_3.method20250(local135);
							this.aClass3_Sub41_Sub2_3.method20250(local138);
							this.aClass3_Sub41_Sub2_3.method20250(local143);
							this.aClass3_Sub41_Sub2_3.method20475(1.0F);
							this.aClass3_Sub41_Sub2_3.method20475(1.0F);
							this.aClass3_Sub41_Sub2_3.method20475(local149 + local73[0] + local76[0]);
							this.aClass3_Sub41_Sub2_3.method20475(local155 + local73[1] + local76[1]);
							this.aClass3_Sub41_Sub2_3.method20475(local161 + local73[2] + local76[2]);
							this.aClass3_Sub41_Sub2_3.method20250(local130);
							this.aClass3_Sub41_Sub2_3.method20250(local135);
							this.aClass3_Sub41_Sub2_3.method20250(local138);
							this.aClass3_Sub41_Sub2_3.method20250(local143);
							this.aClass3_Sub41_Sub2_3.method20475(1.0F);
							this.aClass3_Sub41_Sub2_3.method20475(0.0F);
							this.aClass3_Sub41_Sub2_3.method20475(local149 + local73[0] - local76[0]);
							this.aClass3_Sub41_Sub2_3.method20475(local155 + local73[1] - local76[1]);
							this.aClass3_Sub41_Sub2_3.method20475(local161 + local73[2] - local76[2]);
							this.aClass3_Sub41_Sub2_3.method20250(local130);
							this.aClass3_Sub41_Sub2_3.method20250(local135);
							this.aClass3_Sub41_Sub2_3.method20250(local138);
							this.aClass3_Sub41_Sub2_3.method20250(local143);
						}
					}
					if (this.anIntArray282[local92] > 64) {
						local113 = this.anIntArray282[local92] - 64 - 1;
						for (local702 = this.anIntArray283[local113] - 1; local702 >= 0; local702--) {
							local711 = this.aClass53_Sub1_Sub1ArrayArray1[local113][local702];
							local714 = local711.anInt2815;
							local135 = (byte) (local714 >> 16);
							local138 = (byte) (local714 >> 8);
							local143 = (byte) local714;
							local732 = (byte) (local714 >>> 24);
							local155 = local711.anInt2819 >> 12;
							local161 = local711.anInt2814 >> 12;
							local750 = local711.anInt2816 >> 12;
							local755 = local711.anInt2817 >> 12;
							if (local711.aShort79 == 0) {
								this.aClass3_Sub41_Sub2_3.method20475(0.0F);
								this.aClass3_Sub41_Sub2_3.method20475(0.0F);
								this.aClass3_Sub41_Sub2_3.method20475(local155 + local38 * (float) -local755);
								this.aClass3_Sub41_Sub2_3.method20475(local161 + local42 * (float) -local755);
								this.aClass3_Sub41_Sub2_3.method20475(local750 + local46 * (float) -local755);
								this.aClass3_Sub41_Sub2_3.method20250(local135);
								this.aClass3_Sub41_Sub2_3.method20250(local138);
								this.aClass3_Sub41_Sub2_3.method20250(local143);
								this.aClass3_Sub41_Sub2_3.method20250(local732);
								this.aClass3_Sub41_Sub2_3.method20475(0.0F);
								this.aClass3_Sub41_Sub2_3.method20475(1.0F);
								this.aClass3_Sub41_Sub2_3.method20475(local155 + local62 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20475(local161 + local66 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20475(local750 + local70 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20250(local135);
								this.aClass3_Sub41_Sub2_3.method20250(local138);
								this.aClass3_Sub41_Sub2_3.method20250(local143);
								this.aClass3_Sub41_Sub2_3.method20250(local732);
								this.aClass3_Sub41_Sub2_3.method20475(1.0F);
								this.aClass3_Sub41_Sub2_3.method20475(1.0F);
								this.aClass3_Sub41_Sub2_3.method20475(local155 + local38 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20475(local161 + local42 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20475(local750 + local46 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20250(local135);
								this.aClass3_Sub41_Sub2_3.method20250(local138);
								this.aClass3_Sub41_Sub2_3.method20250(local143);
								this.aClass3_Sub41_Sub2_3.method20250(local732);
								this.aClass3_Sub41_Sub2_3.method20475(1.0F);
								this.aClass3_Sub41_Sub2_3.method20475(0.0F);
								this.aClass3_Sub41_Sub2_3.method20475(local155 + local50 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20475(local161 + local54 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20475(local750 + local58 * (float) local755);
								this.aClass3_Sub41_Sub2_3.method20250(local135);
								this.aClass3_Sub41_Sub2_3.method20250(local138);
								this.aClass3_Sub41_Sub2_3.method20250(local143);
								this.aClass3_Sub41_Sub2_3.method20250(local732);
							} else {
								arg0.aClass328_7.method26075(local711.aShort79, local755, local755, 0.0F, 0.0F, 0.0F);
								arg0.aClass328_7.method26046(arg0.aClass328_14);
								arg0.aClass328_7.method26052(1.0F, 0.0F, 0.0F, local73);
								arg0.aClass328_7.method26052(0.0F, 1.0F, 0.0F, local76);
								this.aClass3_Sub41_Sub2_3.method20475(0.0F);
								this.aClass3_Sub41_Sub2_3.method20475(0.0F);
								this.aClass3_Sub41_Sub2_3.method20475(local155 - local73[0] - local76[0]);
								this.aClass3_Sub41_Sub2_3.method20475(local161 - local73[1] - local76[1]);
								this.aClass3_Sub41_Sub2_3.method20475(local750 - local73[2] - local76[2]);
								this.aClass3_Sub41_Sub2_3.method20250(local135);
								this.aClass3_Sub41_Sub2_3.method20250(local138);
								this.aClass3_Sub41_Sub2_3.method20250(local143);
								this.aClass3_Sub41_Sub2_3.method20250(local732);
								this.aClass3_Sub41_Sub2_3.method20475(0.0F);
								this.aClass3_Sub41_Sub2_3.method20475(1.0F);
								this.aClass3_Sub41_Sub2_3.method20475(local155 - local73[0] + local76[0]);
								this.aClass3_Sub41_Sub2_3.method20475(local161 - local73[1] + local76[1]);
								this.aClass3_Sub41_Sub2_3.method20475(local750 - local73[2] + local76[2]);
								this.aClass3_Sub41_Sub2_3.method20250(local135);
								this.aClass3_Sub41_Sub2_3.method20250(local138);
								this.aClass3_Sub41_Sub2_3.method20250(local143);
								this.aClass3_Sub41_Sub2_3.method20250(local732);
								this.aClass3_Sub41_Sub2_3.method20475(1.0F);
								this.aClass3_Sub41_Sub2_3.method20475(1.0F);
								this.aClass3_Sub41_Sub2_3.method20475(local155 + local73[0] + local76[0]);
								this.aClass3_Sub41_Sub2_3.method20475(local161 + local73[1] + local76[1]);
								this.aClass3_Sub41_Sub2_3.method20475(local750 + local73[2] + local76[2]);
								this.aClass3_Sub41_Sub2_3.method20250(local135);
								this.aClass3_Sub41_Sub2_3.method20250(local138);
								this.aClass3_Sub41_Sub2_3.method20250(local143);
								this.aClass3_Sub41_Sub2_3.method20250(local732);
								this.aClass3_Sub41_Sub2_3.method20475(1.0F);
								this.aClass3_Sub41_Sub2_3.method20475(0.0F);
								this.aClass3_Sub41_Sub2_3.method20475(local155 + local73[0] - local76[0]);
								this.aClass3_Sub41_Sub2_3.method20475(local161 + local73[1] - local76[1]);
								this.aClass3_Sub41_Sub2_3.method20475(local750 + local73[2] - local76[2]);
								this.aClass3_Sub41_Sub2_3.method20250(local135);
								this.aClass3_Sub41_Sub2_3.method20250(local138);
								this.aClass3_Sub41_Sub2_3.method20250(local143);
								this.aClass3_Sub41_Sub2_3.method20250(local732);
							}
						}
					}
				}
			}
		}
		if (this.aClass3_Sub41_Sub2_3.anInt2803 * 62066237 != 0) {
			this.anInterface5_7.method977(24, this.aClass3_Sub41_Sub2_3.aByteArray51, this.aClass3_Sub41_Sub2_3.anInt2803 * 62066237);
			arg0.method4064(this.aClass88_14, null, this.aClass88_15, this.aClass88_16);
			arg0.method4128(7, 0, this.aClass3_Sub41_Sub2_3.anInt2803 * 62066237 / 24);
		}
	}

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "(Lclient!abt;)V", line = 530)
	void method21824(@OriginalArg(0) Class21_Sub2 arg0) {
		aFloat227 = arg0.aFloat44;
		arg0.method4119();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method4087(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!bq", name = "y", descriptor = "(Lclient!abt;)V", line = 530)
	void method21827(@OriginalArg(0) Class21_Sub2 arg0) {
		aFloat227 = arg0.aFloat44;
		arg0.method4119();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method4087(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "(Lclient!abt;)V", line = 530)
	void method21828(@OriginalArg(0) Class21_Sub2 arg0) {
		aFloat227 = arg0.aFloat44;
		arg0.method4119();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method4087(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!bq", name = "l", descriptor = "(Lclient!abt;)V", line = 530)
	void method21832(@OriginalArg(0) Class21_Sub2 arg0) {
		aFloat227 = arg0.aFloat44;
		arg0.method4119();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method4087(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!bq", name = "h", descriptor = "(Lclient!abt;)V", line = 539)
	void method21823(@OriginalArg(0) Class21_Sub2 arg0) {
		arg0.method4087(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat44 != aFloat227) {
			arg0.method17111(aFloat227);
		}
	}

	@OriginalMember(owner = "client!bq", name = "e", descriptor = "(Lclient!abt;)V", line = 539)
	void method21826(@OriginalArg(0) Class21_Sub2 arg0) {
		arg0.method4087(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat44 != aFloat227) {
			arg0.method17111(aFloat227);
		}
	}

	@OriginalMember(owner = "client!bq", name = "j", descriptor = "(Lclient!abt;)V", line = 539)
	void method21829(@OriginalArg(0) Class21_Sub2 arg0) {
		arg0.method4087(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat44 != aFloat227) {
			arg0.method17111(aFloat227);
		}
	}

	@OriginalMember(owner = "client!bq", name = "z", descriptor = "(Lclient!abt;)V", line = 539)
	void method21830(@OriginalArg(0) Class21_Sub2 arg0) {
		arg0.method4087(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat44 != aFloat227) {
			arg0.method17111(aFloat227);
		}
	}

	@OriginalMember(owner = "client!bq", name = "n", descriptor = "(Lclient!abt;)V", line = 539)
	void method21831(@OriginalArg(0) Class21_Sub2 arg0) {
		arg0.method4087(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat44 != aFloat227) {
			arg0.method17111(aFloat227);
		}
	}
}
