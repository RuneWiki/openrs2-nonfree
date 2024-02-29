package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public class Class188 {

	@OriginalMember(owner = "client!cg", name = "u", descriptor = "F")
	static float aFloat246;

	@OriginalMember(owner = "client!cg", name = "l", descriptor = "Lclient!bk;")
	Class172 aClass172_14;

	@OriginalMember(owner = "client!cg", name = "y", descriptor = "Lclient!bk;")
	Class172 aClass172_15;

	@OriginalMember(owner = "client!cg", name = "w", descriptor = "Lclient!bk;")
	Class172 aClass172_16;

	@OriginalMember(owner = "client!cg", name = "v", descriptor = "Lclient!bn;")
	Interface14 anInterface14_7;

	@OriginalMember(owner = "client!cg", name = "p", descriptor = "[F")
	float[] aFloatArray95 = new float[16];

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "Lclient!arl;")
	Class77_Sub39_Sub2 aClass77_Sub39_Sub2_3 = new Class77_Sub39_Sub2(786336);

	@OriginalMember(owner = "client!cg", name = "t", descriptor = "I")
	final int anInt3332 = 64;

	@OriginalMember(owner = "client!cg", name = "q", descriptor = "I")
	final int anInt3335 = 768;

	@OriginalMember(owner = "client!cg", name = "x", descriptor = "I")
	final int anInt3333 = 1600;

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
	final int anInt3334 = Class690.method36319(1600);

	@OriginalMember(owner = "client!cg", name = "s", descriptor = "I")
	final int anInt3331 = 64;

	@OriginalMember(owner = "client!cg", name = "r", descriptor = "[I")
	int[] anIntArray314 = new int[8191];

	@OriginalMember(owner = "client!cg", name = "g", descriptor = "[I")
	int[] anIntArray313 = new int[1600];

	@OriginalMember(owner = "client!cg", name = "z", descriptor = "[I")
	int[] anIntArray315 = new int[64];

	@OriginalMember(owner = "client!cg", name = "j", descriptor = "[[Lclient!apl;")
	Class131_Sub2_Sub1[][] aClass131_Sub2_Sub1ArrayArray1 = new Class131_Sub2_Sub1[1600][64];

	@OriginalMember(owner = "client!cg", name = "i", descriptor = "[[Lclient!apl;")
	Class131_Sub2_Sub1[][] aClass131_Sub2_Sub1ArrayArray2 = new Class131_Sub2_Sub1[64][768];

	@OriginalMember(owner = "client!cg", name = "k", descriptor = "I")
	int anInt3336 = 0;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "()V", line = 29)
	Class188() {
	}

	@OriginalMember(owner = "client!cg", name = "p", descriptor = "(Lclient!aeq;)V", line = 32)
	void method24632(@OriginalArg(0) Class86_Sub3 arg0) {
		this.anInterface14_7 = arg0.method6141(24, null, 196584, true);
		this.aClass172_16 = new Class172(this.anInterface14_7, 5126, 2, 0);
		this.aClass172_14 = new Class172(this.anInterface14_7, 5126, 3, 8);
		this.aClass172_15 = new Class172(this.anInterface14_7, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!cg", name = "w", descriptor = "(Lclient!aeq;)V", line = 32)
	void method24633(@OriginalArg(0) Class86_Sub3 arg0) {
		this.anInterface14_7 = arg0.method6141(24, null, 196584, true);
		this.aClass172_16 = new Class172(this.anInterface14_7, 5126, 2, 0);
		this.aClass172_14 = new Class172(this.anInterface14_7, 5126, 3, 8);
		this.aClass172_15 = new Class172(this.anInterface14_7, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!cg", name = "t", descriptor = "(Lclient!aeq;)V", line = 32)
	void method24634(@OriginalArg(0) Class86_Sub3 arg0) {
		this.anInterface14_7 = arg0.method6141(24, null, 196584, true);
		this.aClass172_16 = new Class172(this.anInterface14_7, 5126, 2, 0);
		this.aClass172_14 = new Class172(this.anInterface14_7, 5126, 3, 8);
		this.aClass172_15 = new Class172(this.anInterface14_7, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(Lclient!aeq;Lclient!dm;)V", line = 39)
	void method24635(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) Class207 arg1) {
		if (arg0.aClass442_22 == null) {
			return;
		}
		this.method24645(arg0);
		@Pc(12) float local12 = arg0.aClass442_22.aFloatArray109[2];
		@Pc(18) float local18 = arg0.aClass442_22.aFloatArray109[6];
		@Pc(24) float local24 = arg0.aClass442_22.aFloatArray109[10];
		@Pc(30) float local30 = arg0.aClass442_22.aFloatArray109[14];
		try {
			@Pc(32) int local32 = 0;
			@Pc(34) int local34 = Integer.MAX_VALUE;
			@Pc(36) int local36 = 0;
			@Pc(40) Class131_Sub2 local40 = arg1.aClass696_1.aClass131_Sub2_8;
			@Pc(43) Class131_Sub2 local43;
			@Pc(76) int local76;
			for (local43 = local40.aClass131_Sub2_6; local43 != local40; local43 = local43.aClass131_Sub2_6) {
				@Pc(49) Class131_Sub2_Sub1 local49 = (Class131_Sub2_Sub1) local43;
				local76 = (int) (local12 * (float) (local49.anInt3125 >> 12) + local18 * (float) (local49.anInt3128 >> 12) + local24 * (float) (local49.anInt3129 >> 12) + local30);
				if (local76 > local36) {
					local36 = local76;
				}
				if (local76 < local34) {
					local34 = local76;
				}
				this.anIntArray314[local32++] = local76;
			}
			@Pc(100) int local100 = local36 - local34;
			if (local100 + 2 > 1600) {
				local76 = Class690.method36319(local100) + 1 - this.anInt3334;
				local100 = (local100 >> local76) + 2;
			} else {
				local76 = 0;
				local100 += 2;
			}
			local43 = local40.aClass131_Sub2_6;
			local32 = 0;
			@Pc(131) int local131 = -2;
			@Pc(133) boolean local133 = true;
			@Pc(135) boolean local135 = true;
			while (local43 != local40) {
				this.anInt3336 = 0;
				@Pc(143) int local143;
				for (local143 = 0; local143 < local100; local143++) {
					this.anIntArray313[local143] = 0;
				}
				for (local143 = 0; local143 < 64; local143++) {
					this.anIntArray315[local143] = 0;
				}
				while (local43 != local40) {
					@Pc(171) Class131_Sub2_Sub1 local171 = (Class131_Sub2_Sub1) local43;
					if (local135) {
						local131 = local171.anInt3131;
						local133 = local171.aBoolean506;
						local135 = false;
					}
					if (local32 > 0 && (local131 != local171.anInt3131 || local133 != local171.aBoolean506)) {
						local135 = true;
						break;
					}
					@Pc(204) int local204 = this.anIntArray314[local32++] - local34 >> local76;
					if (local204 < 1600) {
						if (this.anIntArray313[local204] < 64) {
							this.aClass131_Sub2_Sub1ArrayArray1[local204][this.anIntArray313[local204]++] = local171;
						} else {
							label91: {
								if (this.anIntArray313[local204] == 64) {
									if (this.anInt3336 == 64) {
										break label91;
									}
									this.anIntArray313[local204] += this.anInt3336++ + 1;
								}
								this.aClass131_Sub2_Sub1ArrayArray2[this.anIntArray313[local204] - 64 - 1][this.anIntArray315[this.anIntArray313[local204] - 64 - 1]++] = local171;
							}
						}
					}
					local43 = local43.aClass131_Sub2_6;
				}
				if (local131 >= 0) {
					arg0.method6180(local131);
				} else {
					arg0.method6180(-1);
				}
				if (local133 && arg0.aFloat68 != aFloat246) {
					arg0.method20255(aFloat246);
				} else if (arg0.aFloat68 != 1.0F) {
					arg0.method20255(1.0F);
				}
				this.method24639(arg0, local100);
			}
		} catch (@Pc(324) Exception local324) {
		}
		this.method24651(arg0);
	}

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "(Lclient!aeq;Lclient!dm;)V", line = 39)
	void method24636(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) Class207 arg1) {
		if (arg0.aClass442_22 == null) {
			return;
		}
		this.method24645(arg0);
		@Pc(12) float local12 = arg0.aClass442_22.aFloatArray109[2];
		@Pc(18) float local18 = arg0.aClass442_22.aFloatArray109[6];
		@Pc(24) float local24 = arg0.aClass442_22.aFloatArray109[10];
		@Pc(30) float local30 = arg0.aClass442_22.aFloatArray109[14];
		try {
			@Pc(32) int local32 = 0;
			@Pc(34) int local34 = Integer.MAX_VALUE;
			@Pc(36) int local36 = 0;
			@Pc(40) Class131_Sub2 local40 = arg1.aClass696_1.aClass131_Sub2_8;
			@Pc(43) Class131_Sub2 local43;
			@Pc(76) int local76;
			for (local43 = local40.aClass131_Sub2_6; local43 != local40; local43 = local43.aClass131_Sub2_6) {
				@Pc(49) Class131_Sub2_Sub1 local49 = (Class131_Sub2_Sub1) local43;
				local76 = (int) (local12 * (float) (local49.anInt3125 >> 12) + local18 * (float) (local49.anInt3128 >> 12) + local24 * (float) (local49.anInt3129 >> 12) + local30);
				if (local76 > local36) {
					local36 = local76;
				}
				if (local76 < local34) {
					local34 = local76;
				}
				this.anIntArray314[local32++] = local76;
			}
			@Pc(100) int local100 = local36 - local34;
			if (local100 + 2 > 1600) {
				local76 = Class690.method36319(local100) + 1 - this.anInt3334;
				local100 = (local100 >> local76) + 2;
			} else {
				local76 = 0;
				local100 += 2;
			}
			local43 = local40.aClass131_Sub2_6;
			local32 = 0;
			@Pc(131) int local131 = -2;
			@Pc(133) boolean local133 = true;
			@Pc(135) boolean local135 = true;
			while (local43 != local40) {
				this.anInt3336 = 0;
				@Pc(143) int local143;
				for (local143 = 0; local143 < local100; local143++) {
					this.anIntArray313[local143] = 0;
				}
				for (local143 = 0; local143 < 64; local143++) {
					this.anIntArray315[local143] = 0;
				}
				while (local43 != local40) {
					@Pc(171) Class131_Sub2_Sub1 local171 = (Class131_Sub2_Sub1) local43;
					if (local135) {
						local131 = local171.anInt3131;
						local133 = local171.aBoolean506;
						local135 = false;
					}
					if (local32 > 0 && (local131 != local171.anInt3131 || local133 != local171.aBoolean506)) {
						local135 = true;
						break;
					}
					@Pc(204) int local204 = this.anIntArray314[local32++] - local34 >> local76;
					if (local204 < 1600) {
						if (this.anIntArray313[local204] < 64) {
							this.aClass131_Sub2_Sub1ArrayArray1[local204][this.anIntArray313[local204]++] = local171;
						} else {
							label91: {
								if (this.anIntArray313[local204] == 64) {
									if (this.anInt3336 == 64) {
										break label91;
									}
									this.anIntArray313[local204] += this.anInt3336++ + 1;
								}
								this.aClass131_Sub2_Sub1ArrayArray2[this.anIntArray313[local204] - 64 - 1][this.anIntArray315[this.anIntArray313[local204] - 64 - 1]++] = local171;
							}
						}
					}
					local43 = local43.aClass131_Sub2_6;
				}
				if (local131 >= 0) {
					arg0.method6180(local131);
				} else {
					arg0.method6180(-1);
				}
				if (local133 && arg0.aFloat68 != aFloat246) {
					arg0.method20255(aFloat246);
				} else if (arg0.aFloat68 != 1.0F) {
					arg0.method20255(1.0F);
				}
				this.method24639(arg0, local100);
			}
		} catch (@Pc(324) Exception local324) {
		}
		this.method24651(arg0);
	}

	@OriginalMember(owner = "client!cg", name = "q", descriptor = "(Lclient!aeq;Lclient!dm;)V", line = 39)
	void method24637(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) Class207 arg1) {
		if (arg0.aClass442_22 == null) {
			return;
		}
		this.method24645(arg0);
		@Pc(12) float local12 = arg0.aClass442_22.aFloatArray109[2];
		@Pc(18) float local18 = arg0.aClass442_22.aFloatArray109[6];
		@Pc(24) float local24 = arg0.aClass442_22.aFloatArray109[10];
		@Pc(30) float local30 = arg0.aClass442_22.aFloatArray109[14];
		try {
			@Pc(32) int local32 = 0;
			@Pc(34) int local34 = Integer.MAX_VALUE;
			@Pc(36) int local36 = 0;
			@Pc(40) Class131_Sub2 local40 = arg1.aClass696_1.aClass131_Sub2_8;
			@Pc(43) Class131_Sub2 local43;
			@Pc(76) int local76;
			for (local43 = local40.aClass131_Sub2_6; local43 != local40; local43 = local43.aClass131_Sub2_6) {
				@Pc(49) Class131_Sub2_Sub1 local49 = (Class131_Sub2_Sub1) local43;
				local76 = (int) (local12 * (float) (local49.anInt3125 >> 12) + local18 * (float) (local49.anInt3128 >> 12) + local24 * (float) (local49.anInt3129 >> 12) + local30);
				if (local76 > local36) {
					local36 = local76;
				}
				if (local76 < local34) {
					local34 = local76;
				}
				this.anIntArray314[local32++] = local76;
			}
			@Pc(100) int local100 = local36 - local34;
			if (local100 + 2 > 1600) {
				local76 = Class690.method36319(local100) + 1 - this.anInt3334;
				local100 = (local100 >> local76) + 2;
			} else {
				local76 = 0;
				local100 += 2;
			}
			local43 = local40.aClass131_Sub2_6;
			local32 = 0;
			@Pc(131) int local131 = -2;
			@Pc(133) boolean local133 = true;
			@Pc(135) boolean local135 = true;
			while (local43 != local40) {
				this.anInt3336 = 0;
				@Pc(143) int local143;
				for (local143 = 0; local143 < local100; local143++) {
					this.anIntArray313[local143] = 0;
				}
				for (local143 = 0; local143 < 64; local143++) {
					this.anIntArray315[local143] = 0;
				}
				while (local43 != local40) {
					@Pc(171) Class131_Sub2_Sub1 local171 = (Class131_Sub2_Sub1) local43;
					if (local135) {
						local131 = local171.anInt3131;
						local133 = local171.aBoolean506;
						local135 = false;
					}
					if (local32 > 0 && (local131 != local171.anInt3131 || local133 != local171.aBoolean506)) {
						local135 = true;
						break;
					}
					@Pc(204) int local204 = this.anIntArray314[local32++] - local34 >> local76;
					if (local204 < 1600) {
						if (this.anIntArray313[local204] < 64) {
							this.aClass131_Sub2_Sub1ArrayArray1[local204][this.anIntArray313[local204]++] = local171;
						} else {
							label91: {
								if (this.anIntArray313[local204] == 64) {
									if (this.anInt3336 == 64) {
										break label91;
									}
									this.anIntArray313[local204] += this.anInt3336++ + 1;
								}
								this.aClass131_Sub2_Sub1ArrayArray2[this.anIntArray313[local204] - 64 - 1][this.anIntArray315[this.anIntArray313[local204] - 64 - 1]++] = local171;
							}
						}
					}
					local43 = local43.aClass131_Sub2_6;
				}
				if (local131 >= 0) {
					arg0.method6180(local131);
				} else {
					arg0.method6180(-1);
				}
				if (local133 && arg0.aFloat68 != aFloat246) {
					arg0.method20255(aFloat246);
				} else if (arg0.aFloat68 != 1.0F) {
					arg0.method20255(1.0F);
				}
				this.method24639(arg0, local100);
			}
		} catch (@Pc(324) Exception local324) {
		}
		this.method24651(arg0);
	}

	@OriginalMember(owner = "client!cg", name = "x", descriptor = "(Lclient!aeq;Lclient!dm;)V", line = 39)
	void method24638(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) Class207 arg1) {
		if (arg0.aClass442_22 == null) {
			return;
		}
		this.method24645(arg0);
		@Pc(12) float local12 = arg0.aClass442_22.aFloatArray109[2];
		@Pc(18) float local18 = arg0.aClass442_22.aFloatArray109[6];
		@Pc(24) float local24 = arg0.aClass442_22.aFloatArray109[10];
		@Pc(30) float local30 = arg0.aClass442_22.aFloatArray109[14];
		try {
			@Pc(32) int local32 = 0;
			@Pc(34) int local34 = Integer.MAX_VALUE;
			@Pc(36) int local36 = 0;
			@Pc(40) Class131_Sub2 local40 = arg1.aClass696_1.aClass131_Sub2_8;
			@Pc(43) Class131_Sub2 local43;
			@Pc(76) int local76;
			for (local43 = local40.aClass131_Sub2_6; local43 != local40; local43 = local43.aClass131_Sub2_6) {
				@Pc(49) Class131_Sub2_Sub1 local49 = (Class131_Sub2_Sub1) local43;
				local76 = (int) (local12 * (float) (local49.anInt3125 >> 12) + local18 * (float) (local49.anInt3128 >> 12) + local24 * (float) (local49.anInt3129 >> 12) + local30);
				if (local76 > local36) {
					local36 = local76;
				}
				if (local76 < local34) {
					local34 = local76;
				}
				this.anIntArray314[local32++] = local76;
			}
			@Pc(100) int local100 = local36 - local34;
			if (local100 + 2 > 1600) {
				local76 = Class690.method36319(local100) + 1 - this.anInt3334;
				local100 = (local100 >> local76) + 2;
			} else {
				local76 = 0;
				local100 += 2;
			}
			local43 = local40.aClass131_Sub2_6;
			local32 = 0;
			@Pc(131) int local131 = -2;
			@Pc(133) boolean local133 = true;
			@Pc(135) boolean local135 = true;
			while (local43 != local40) {
				this.anInt3336 = 0;
				@Pc(143) int local143;
				for (local143 = 0; local143 < local100; local143++) {
					this.anIntArray313[local143] = 0;
				}
				for (local143 = 0; local143 < 64; local143++) {
					this.anIntArray315[local143] = 0;
				}
				while (local43 != local40) {
					@Pc(171) Class131_Sub2_Sub1 local171 = (Class131_Sub2_Sub1) local43;
					if (local135) {
						local131 = local171.anInt3131;
						local133 = local171.aBoolean506;
						local135 = false;
					}
					if (local32 > 0 && (local131 != local171.anInt3131 || local133 != local171.aBoolean506)) {
						local135 = true;
						break;
					}
					@Pc(204) int local204 = this.anIntArray314[local32++] - local34 >> local76;
					if (local204 < 1600) {
						if (this.anIntArray313[local204] < 64) {
							this.aClass131_Sub2_Sub1ArrayArray1[local204][this.anIntArray313[local204]++] = local171;
						} else {
							label91: {
								if (this.anIntArray313[local204] == 64) {
									if (this.anInt3336 == 64) {
										break label91;
									}
									this.anIntArray313[local204] += this.anInt3336++ + 1;
								}
								this.aClass131_Sub2_Sub1ArrayArray2[this.anIntArray313[local204] - 64 - 1][this.anIntArray315[this.anIntArray313[local204] - 64 - 1]++] = local171;
							}
						}
					}
					local43 = local43.aClass131_Sub2_6;
				}
				if (local131 >= 0) {
					arg0.method6180(local131);
				} else {
					arg0.method6180(-1);
				}
				if (local133 && arg0.aFloat68 != aFloat246) {
					arg0.method20255(aFloat246);
				} else if (arg0.aFloat68 != 1.0F) {
					arg0.method20255(1.0F);
				}
				this.method24639(arg0, local100);
			}
		} catch (@Pc(324) Exception local324) {
		}
		this.method24651(arg0);
	}

	@OriginalMember(owner = "client!cg", name = "v", descriptor = "(Lclient!aeq;I)V", line = 114)
	void method24639(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray95, 0);
		@Pc(9) float local9 = this.aFloatArray95[0];
		@Pc(14) float local14 = this.aFloatArray95[4];
		@Pc(19) float local19 = this.aFloatArray95[8];
		@Pc(24) float local24 = this.aFloatArray95[1];
		@Pc(29) float local29 = this.aFloatArray95[5];
		@Pc(34) float local34 = this.aFloatArray95[9];
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
		arg0.aClass442_21.method28956(arg0.aClass442_25);
		this.aClass77_Sub39_Sub2_3.anInt3089 = 0;
		@Pc(92) int local92;
		@Pc(107) int local107;
		@Pc(113) int local113;
		@Pc(122) Class131_Sub2_Sub1 local122;
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
		@Pc(711) Class131_Sub2_Sub1 local711;
		@Pc(714) int local714;
		@Pc(732) byte local732;
		@Pc(750) float local750;
		if (arg0.aBoolean116) {
			for (local92 = arg1 - 1; local92 >= 0; local92--) {
				local107 = this.anIntArray313[local92] > 64 ? 64 : this.anIntArray313[local92];
				if (local107 > 0) {
					for (local113 = local107 - 1; local113 >= 0; local113--) {
						local122 = this.aClass131_Sub2_Sub1ArrayArray1[local92][local113];
						local125 = local122.anInt3126;
						local130 = (byte) (local125 >> 16);
						local135 = (byte) (local125 >> 8);
						local138 = (byte) local125;
						local143 = (byte) (local125 >>> 24);
						local149 = local122.anInt3125 >> 12;
						local155 = local122.anInt3128 >> 12;
						local161 = local122.anInt3129 >> 12;
						local166 = local122.anInt3130 >> 12;
						if (local122.aShort113 == 0) {
							this.aClass77_Sub39_Sub2_3.method22659(0.0F);
							this.aClass77_Sub39_Sub2_3.method22659(0.0F);
							this.aClass77_Sub39_Sub2_3.method22659(local149 + local38 * (float) -local166);
							this.aClass77_Sub39_Sub2_3.method22659(local155 + local42 * (float) -local166);
							this.aClass77_Sub39_Sub2_3.method22659(local161 + local46 * (float) -local166);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22659(0.0F);
							this.aClass77_Sub39_Sub2_3.method22659(1.0F);
							this.aClass77_Sub39_Sub2_3.method22659(local149 + local62 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22659(local155 + local66 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22659(local161 + local70 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22659(1.0F);
							this.aClass77_Sub39_Sub2_3.method22659(1.0F);
							this.aClass77_Sub39_Sub2_3.method22659(local149 + local38 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22659(local155 + local42 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22659(local161 + local46 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22659(1.0F);
							this.aClass77_Sub39_Sub2_3.method22659(0.0F);
							this.aClass77_Sub39_Sub2_3.method22659(local149 + local50 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22659(local155 + local54 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22659(local161 + local58 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
						} else {
							arg0.aClass442_23.method29058(local122.aShort113, local166, local166, 0.0F, 0.0F, 0.0F);
							arg0.aClass442_23.method28965(arg0.aClass442_21);
							arg0.aClass442_23.method28984(1.0F, 0.0F, 0.0F, local73);
							arg0.aClass442_23.method28984(0.0F, 1.0F, 0.0F, local76);
							this.aClass77_Sub39_Sub2_3.method22659(0.0F);
							this.aClass77_Sub39_Sub2_3.method22659(0.0F);
							this.aClass77_Sub39_Sub2_3.method22659(local149 - local73[0] - local76[0]);
							this.aClass77_Sub39_Sub2_3.method22659(local155 - local73[1] - local76[1]);
							this.aClass77_Sub39_Sub2_3.method22659(local161 - local73[2] - local76[2]);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22659(0.0F);
							this.aClass77_Sub39_Sub2_3.method22659(1.0F);
							this.aClass77_Sub39_Sub2_3.method22659(local149 - local73[0] + local76[0]);
							this.aClass77_Sub39_Sub2_3.method22659(local155 - local73[1] + local76[1]);
							this.aClass77_Sub39_Sub2_3.method22659(local161 - local73[2] + local76[2]);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22659(1.0F);
							this.aClass77_Sub39_Sub2_3.method22659(1.0F);
							this.aClass77_Sub39_Sub2_3.method22659(local149 + local73[0] + local76[0]);
							this.aClass77_Sub39_Sub2_3.method22659(local155 + local73[1] + local76[1]);
							this.aClass77_Sub39_Sub2_3.method22659(local161 + local73[2] + local76[2]);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22659(1.0F);
							this.aClass77_Sub39_Sub2_3.method22659(0.0F);
							this.aClass77_Sub39_Sub2_3.method22659(local149 + local73[0] - local76[0]);
							this.aClass77_Sub39_Sub2_3.method22659(local155 + local73[1] - local76[1]);
							this.aClass77_Sub39_Sub2_3.method22659(local161 + local73[2] - local76[2]);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
						}
					}
					if (this.anIntArray313[local92] > 64) {
						local113 = this.anIntArray313[local92] - 64 - 1;
						for (local702 = this.anIntArray315[local113] - 1; local702 >= 0; local702--) {
							local711 = this.aClass131_Sub2_Sub1ArrayArray2[local113][local702];
							local714 = local711.anInt3126;
							local135 = (byte) (local714 >> 16);
							local138 = (byte) (local714 >> 8);
							local143 = (byte) local714;
							local732 = (byte) (local714 >>> 24);
							local155 = local711.anInt3125 >> 12;
							local161 = local711.anInt3128 >> 12;
							local750 = local711.anInt3129 >> 12;
							local755 = local711.anInt3130 >> 12;
							if (local711.aShort113 == 0) {
								this.aClass77_Sub39_Sub2_3.method22659(0.0F);
								this.aClass77_Sub39_Sub2_3.method22659(0.0F);
								this.aClass77_Sub39_Sub2_3.method22659(local155 + local38 * (float) -local755);
								this.aClass77_Sub39_Sub2_3.method22659(local161 + local42 * (float) -local755);
								this.aClass77_Sub39_Sub2_3.method22659(local750 + local46 * (float) -local755);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22659(0.0F);
								this.aClass77_Sub39_Sub2_3.method22659(1.0F);
								this.aClass77_Sub39_Sub2_3.method22659(local155 + local62 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22659(local161 + local66 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22659(local750 + local70 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22659(1.0F);
								this.aClass77_Sub39_Sub2_3.method22659(1.0F);
								this.aClass77_Sub39_Sub2_3.method22659(local155 + local38 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22659(local161 + local42 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22659(local750 + local46 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22659(1.0F);
								this.aClass77_Sub39_Sub2_3.method22659(0.0F);
								this.aClass77_Sub39_Sub2_3.method22659(local155 + local50 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22659(local161 + local54 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22659(local750 + local58 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
							} else {
								arg0.aClass442_23.method29058(local711.aShort113, local755, local755, 0.0F, 0.0F, 0.0F);
								arg0.aClass442_23.method28965(arg0.aClass442_21);
								arg0.aClass442_23.method28984(1.0F, 0.0F, 0.0F, local73);
								arg0.aClass442_23.method28984(0.0F, 1.0F, 0.0F, local76);
								this.aClass77_Sub39_Sub2_3.method22659(0.0F);
								this.aClass77_Sub39_Sub2_3.method22659(0.0F);
								this.aClass77_Sub39_Sub2_3.method22659(local155 - local73[0] - local76[0]);
								this.aClass77_Sub39_Sub2_3.method22659(local161 - local73[1] - local76[1]);
								this.aClass77_Sub39_Sub2_3.method22659(local750 - local73[2] - local76[2]);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22659(0.0F);
								this.aClass77_Sub39_Sub2_3.method22659(1.0F);
								this.aClass77_Sub39_Sub2_3.method22659(local155 - local73[0] + local76[0]);
								this.aClass77_Sub39_Sub2_3.method22659(local161 - local73[1] + local76[1]);
								this.aClass77_Sub39_Sub2_3.method22659(local750 - local73[2] + local76[2]);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22659(1.0F);
								this.aClass77_Sub39_Sub2_3.method22659(1.0F);
								this.aClass77_Sub39_Sub2_3.method22659(local155 + local73[0] + local76[0]);
								this.aClass77_Sub39_Sub2_3.method22659(local161 + local73[1] + local76[1]);
								this.aClass77_Sub39_Sub2_3.method22659(local750 + local73[2] + local76[2]);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22659(1.0F);
								this.aClass77_Sub39_Sub2_3.method22659(0.0F);
								this.aClass77_Sub39_Sub2_3.method22659(local155 + local73[0] - local76[0]);
								this.aClass77_Sub39_Sub2_3.method22659(local161 + local73[1] - local76[1]);
								this.aClass77_Sub39_Sub2_3.method22659(local750 + local73[2] - local76[2]);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
							}
						}
					}
				}
			}
		} else {
			for (local92 = arg1 - 1; local92 >= 0; local92--) {
				local107 = this.anIntArray313[local92] > 64 ? 64 : this.anIntArray313[local92];
				if (local107 > 0) {
					for (local113 = local107 - 1; local113 >= 0; local113--) {
						local122 = this.aClass131_Sub2_Sub1ArrayArray1[local92][local113];
						local125 = local122.anInt3126;
						local130 = (byte) (local125 >> 16);
						local135 = (byte) (local125 >> 8);
						local138 = (byte) local125;
						local143 = (byte) (local125 >>> 24);
						local149 = local122.anInt3125 >> 12;
						local155 = local122.anInt3128 >> 12;
						local161 = local122.anInt3129 >> 12;
						local166 = local122.anInt3130 >> 12;
						if (local122.aShort113 == 0) {
							this.aClass77_Sub39_Sub2_3.method22663(0.0F);
							this.aClass77_Sub39_Sub2_3.method22663(0.0F);
							this.aClass77_Sub39_Sub2_3.method22663(local149 + local38 * (float) -local166);
							this.aClass77_Sub39_Sub2_3.method22663(local155 + local42 * (float) -local166);
							this.aClass77_Sub39_Sub2_3.method22663(local161 + local46 * (float) -local166);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22663(0.0F);
							this.aClass77_Sub39_Sub2_3.method22663(1.0F);
							this.aClass77_Sub39_Sub2_3.method22663(local149 + local62 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22663(local155 + local66 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22663(local161 + local70 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22663(1.0F);
							this.aClass77_Sub39_Sub2_3.method22663(1.0F);
							this.aClass77_Sub39_Sub2_3.method22663(local149 + local38 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22663(local155 + local42 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22663(local161 + local46 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22663(1.0F);
							this.aClass77_Sub39_Sub2_3.method22663(0.0F);
							this.aClass77_Sub39_Sub2_3.method22663(local149 + local50 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22663(local155 + local54 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22663(local161 + local58 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
						} else {
							arg0.aClass442_23.method29058(local122.aShort113, local166, local166, 0.0F, 0.0F, 0.0F);
							arg0.aClass442_23.method28965(arg0.aClass442_21);
							arg0.aClass442_23.method28984(1.0F, 0.0F, 0.0F, local73);
							arg0.aClass442_23.method28984(0.0F, 1.0F, 0.0F, local76);
							this.aClass77_Sub39_Sub2_3.method22663(0.0F);
							this.aClass77_Sub39_Sub2_3.method22663(0.0F);
							this.aClass77_Sub39_Sub2_3.method22663(local149 - local73[0] - local76[0]);
							this.aClass77_Sub39_Sub2_3.method22663(local155 - local73[1] - local76[1]);
							this.aClass77_Sub39_Sub2_3.method22663(local161 - local73[2] - local76[2]);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22663(0.0F);
							this.aClass77_Sub39_Sub2_3.method22663(1.0F);
							this.aClass77_Sub39_Sub2_3.method22663(local149 - local73[0] + local76[0]);
							this.aClass77_Sub39_Sub2_3.method22663(local155 - local73[1] + local76[1]);
							this.aClass77_Sub39_Sub2_3.method22663(local161 - local73[2] + local76[2]);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22663(1.0F);
							this.aClass77_Sub39_Sub2_3.method22663(1.0F);
							this.aClass77_Sub39_Sub2_3.method22663(local149 + local73[0] + local76[0]);
							this.aClass77_Sub39_Sub2_3.method22663(local155 + local73[1] + local76[1]);
							this.aClass77_Sub39_Sub2_3.method22663(local161 + local73[2] + local76[2]);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22663(1.0F);
							this.aClass77_Sub39_Sub2_3.method22663(0.0F);
							this.aClass77_Sub39_Sub2_3.method22663(local149 + local73[0] - local76[0]);
							this.aClass77_Sub39_Sub2_3.method22663(local155 + local73[1] - local76[1]);
							this.aClass77_Sub39_Sub2_3.method22663(local161 + local73[2] - local76[2]);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
						}
					}
					if (this.anIntArray313[local92] > 64) {
						local113 = this.anIntArray313[local92] - 64 - 1;
						for (local702 = this.anIntArray315[local113] - 1; local702 >= 0; local702--) {
							local711 = this.aClass131_Sub2_Sub1ArrayArray2[local113][local702];
							local714 = local711.anInt3126;
							local135 = (byte) (local714 >> 16);
							local138 = (byte) (local714 >> 8);
							local143 = (byte) local714;
							local732 = (byte) (local714 >>> 24);
							local155 = local711.anInt3125 >> 12;
							local161 = local711.anInt3128 >> 12;
							local750 = local711.anInt3129 >> 12;
							local755 = local711.anInt3130 >> 12;
							if (local711.aShort113 == 0) {
								this.aClass77_Sub39_Sub2_3.method22663(0.0F);
								this.aClass77_Sub39_Sub2_3.method22663(0.0F);
								this.aClass77_Sub39_Sub2_3.method22663(local155 + local38 * (float) -local755);
								this.aClass77_Sub39_Sub2_3.method22663(local161 + local42 * (float) -local755);
								this.aClass77_Sub39_Sub2_3.method22663(local750 + local46 * (float) -local755);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22663(0.0F);
								this.aClass77_Sub39_Sub2_3.method22663(1.0F);
								this.aClass77_Sub39_Sub2_3.method22663(local155 + local62 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22663(local161 + local66 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22663(local750 + local70 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22663(1.0F);
								this.aClass77_Sub39_Sub2_3.method22663(1.0F);
								this.aClass77_Sub39_Sub2_3.method22663(local155 + local38 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22663(local161 + local42 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22663(local750 + local46 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22663(1.0F);
								this.aClass77_Sub39_Sub2_3.method22663(0.0F);
								this.aClass77_Sub39_Sub2_3.method22663(local155 + local50 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22663(local161 + local54 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22663(local750 + local58 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
							} else {
								arg0.aClass442_23.method29058(local711.aShort113, local755, local755, 0.0F, 0.0F, 0.0F);
								arg0.aClass442_23.method28965(arg0.aClass442_21);
								arg0.aClass442_23.method28984(1.0F, 0.0F, 0.0F, local73);
								arg0.aClass442_23.method28984(0.0F, 1.0F, 0.0F, local76);
								this.aClass77_Sub39_Sub2_3.method22663(0.0F);
								this.aClass77_Sub39_Sub2_3.method22663(0.0F);
								this.aClass77_Sub39_Sub2_3.method22663(local155 - local73[0] - local76[0]);
								this.aClass77_Sub39_Sub2_3.method22663(local161 - local73[1] - local76[1]);
								this.aClass77_Sub39_Sub2_3.method22663(local750 - local73[2] - local76[2]);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22663(0.0F);
								this.aClass77_Sub39_Sub2_3.method22663(1.0F);
								this.aClass77_Sub39_Sub2_3.method22663(local155 - local73[0] + local76[0]);
								this.aClass77_Sub39_Sub2_3.method22663(local161 - local73[1] + local76[1]);
								this.aClass77_Sub39_Sub2_3.method22663(local750 - local73[2] + local76[2]);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22663(1.0F);
								this.aClass77_Sub39_Sub2_3.method22663(1.0F);
								this.aClass77_Sub39_Sub2_3.method22663(local155 + local73[0] + local76[0]);
								this.aClass77_Sub39_Sub2_3.method22663(local161 + local73[1] + local76[1]);
								this.aClass77_Sub39_Sub2_3.method22663(local750 + local73[2] + local76[2]);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22663(1.0F);
								this.aClass77_Sub39_Sub2_3.method22663(0.0F);
								this.aClass77_Sub39_Sub2_3.method22663(local155 + local73[0] - local76[0]);
								this.aClass77_Sub39_Sub2_3.method22663(local161 + local73[1] - local76[1]);
								this.aClass77_Sub39_Sub2_3.method22663(local750 + local73[2] - local76[2]);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
							}
						}
					}
				}
			}
		}
		if (this.aClass77_Sub39_Sub2_3.anInt3089 * 31645619 != 0) {
			this.anInterface14_7.method1785(24, this.aClass77_Sub39_Sub2_3.aByteArray53, this.aClass77_Sub39_Sub2_3.anInt3089 * 31645619);
			arg0.method6155(this.aClass172_14, null, this.aClass172_15, this.aClass172_16);
			arg0.method6159(7, 0, this.aClass77_Sub39_Sub2_3.anInt3089 * 31645619 / 24);
		}
	}

	@OriginalMember(owner = "client!cg", name = "g", descriptor = "(Lclient!aeq;I)V", line = 114)
	void method24640(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray95, 0);
		@Pc(9) float local9 = this.aFloatArray95[0];
		@Pc(14) float local14 = this.aFloatArray95[4];
		@Pc(19) float local19 = this.aFloatArray95[8];
		@Pc(24) float local24 = this.aFloatArray95[1];
		@Pc(29) float local29 = this.aFloatArray95[5];
		@Pc(34) float local34 = this.aFloatArray95[9];
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
		arg0.aClass442_21.method28956(arg0.aClass442_25);
		this.aClass77_Sub39_Sub2_3.anInt3089 = 0;
		@Pc(92) int local92;
		@Pc(107) int local107;
		@Pc(113) int local113;
		@Pc(122) Class131_Sub2_Sub1 local122;
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
		@Pc(711) Class131_Sub2_Sub1 local711;
		@Pc(714) int local714;
		@Pc(732) byte local732;
		@Pc(750) float local750;
		if (arg0.aBoolean116) {
			for (local92 = arg1 - 1; local92 >= 0; local92--) {
				local107 = this.anIntArray313[local92] > 64 ? 64 : this.anIntArray313[local92];
				if (local107 > 0) {
					for (local113 = local107 - 1; local113 >= 0; local113--) {
						local122 = this.aClass131_Sub2_Sub1ArrayArray1[local92][local113];
						local125 = local122.anInt3126;
						local130 = (byte) (local125 >> 16);
						local135 = (byte) (local125 >> 8);
						local138 = (byte) local125;
						local143 = (byte) (local125 >>> 24);
						local149 = local122.anInt3125 >> 12;
						local155 = local122.anInt3128 >> 12;
						local161 = local122.anInt3129 >> 12;
						local166 = local122.anInt3130 >> 12;
						if (local122.aShort113 == 0) {
							this.aClass77_Sub39_Sub2_3.method22659(0.0F);
							this.aClass77_Sub39_Sub2_3.method22659(0.0F);
							this.aClass77_Sub39_Sub2_3.method22659(local149 + local38 * (float) -local166);
							this.aClass77_Sub39_Sub2_3.method22659(local155 + local42 * (float) -local166);
							this.aClass77_Sub39_Sub2_3.method22659(local161 + local46 * (float) -local166);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22659(0.0F);
							this.aClass77_Sub39_Sub2_3.method22659(1.0F);
							this.aClass77_Sub39_Sub2_3.method22659(local149 + local62 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22659(local155 + local66 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22659(local161 + local70 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22659(1.0F);
							this.aClass77_Sub39_Sub2_3.method22659(1.0F);
							this.aClass77_Sub39_Sub2_3.method22659(local149 + local38 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22659(local155 + local42 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22659(local161 + local46 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22659(1.0F);
							this.aClass77_Sub39_Sub2_3.method22659(0.0F);
							this.aClass77_Sub39_Sub2_3.method22659(local149 + local50 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22659(local155 + local54 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22659(local161 + local58 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
						} else {
							arg0.aClass442_23.method29058(local122.aShort113, local166, local166, 0.0F, 0.0F, 0.0F);
							arg0.aClass442_23.method28965(arg0.aClass442_21);
							arg0.aClass442_23.method28984(1.0F, 0.0F, 0.0F, local73);
							arg0.aClass442_23.method28984(0.0F, 1.0F, 0.0F, local76);
							this.aClass77_Sub39_Sub2_3.method22659(0.0F);
							this.aClass77_Sub39_Sub2_3.method22659(0.0F);
							this.aClass77_Sub39_Sub2_3.method22659(local149 - local73[0] - local76[0]);
							this.aClass77_Sub39_Sub2_3.method22659(local155 - local73[1] - local76[1]);
							this.aClass77_Sub39_Sub2_3.method22659(local161 - local73[2] - local76[2]);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22659(0.0F);
							this.aClass77_Sub39_Sub2_3.method22659(1.0F);
							this.aClass77_Sub39_Sub2_3.method22659(local149 - local73[0] + local76[0]);
							this.aClass77_Sub39_Sub2_3.method22659(local155 - local73[1] + local76[1]);
							this.aClass77_Sub39_Sub2_3.method22659(local161 - local73[2] + local76[2]);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22659(1.0F);
							this.aClass77_Sub39_Sub2_3.method22659(1.0F);
							this.aClass77_Sub39_Sub2_3.method22659(local149 + local73[0] + local76[0]);
							this.aClass77_Sub39_Sub2_3.method22659(local155 + local73[1] + local76[1]);
							this.aClass77_Sub39_Sub2_3.method22659(local161 + local73[2] + local76[2]);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22659(1.0F);
							this.aClass77_Sub39_Sub2_3.method22659(0.0F);
							this.aClass77_Sub39_Sub2_3.method22659(local149 + local73[0] - local76[0]);
							this.aClass77_Sub39_Sub2_3.method22659(local155 + local73[1] - local76[1]);
							this.aClass77_Sub39_Sub2_3.method22659(local161 + local73[2] - local76[2]);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
						}
					}
					if (this.anIntArray313[local92] > 64) {
						local113 = this.anIntArray313[local92] - 64 - 1;
						for (local702 = this.anIntArray315[local113] - 1; local702 >= 0; local702--) {
							local711 = this.aClass131_Sub2_Sub1ArrayArray2[local113][local702];
							local714 = local711.anInt3126;
							local135 = (byte) (local714 >> 16);
							local138 = (byte) (local714 >> 8);
							local143 = (byte) local714;
							local732 = (byte) (local714 >>> 24);
							local155 = local711.anInt3125 >> 12;
							local161 = local711.anInt3128 >> 12;
							local750 = local711.anInt3129 >> 12;
							local755 = local711.anInt3130 >> 12;
							if (local711.aShort113 == 0) {
								this.aClass77_Sub39_Sub2_3.method22659(0.0F);
								this.aClass77_Sub39_Sub2_3.method22659(0.0F);
								this.aClass77_Sub39_Sub2_3.method22659(local155 + local38 * (float) -local755);
								this.aClass77_Sub39_Sub2_3.method22659(local161 + local42 * (float) -local755);
								this.aClass77_Sub39_Sub2_3.method22659(local750 + local46 * (float) -local755);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22659(0.0F);
								this.aClass77_Sub39_Sub2_3.method22659(1.0F);
								this.aClass77_Sub39_Sub2_3.method22659(local155 + local62 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22659(local161 + local66 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22659(local750 + local70 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22659(1.0F);
								this.aClass77_Sub39_Sub2_3.method22659(1.0F);
								this.aClass77_Sub39_Sub2_3.method22659(local155 + local38 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22659(local161 + local42 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22659(local750 + local46 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22659(1.0F);
								this.aClass77_Sub39_Sub2_3.method22659(0.0F);
								this.aClass77_Sub39_Sub2_3.method22659(local155 + local50 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22659(local161 + local54 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22659(local750 + local58 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
							} else {
								arg0.aClass442_23.method29058(local711.aShort113, local755, local755, 0.0F, 0.0F, 0.0F);
								arg0.aClass442_23.method28965(arg0.aClass442_21);
								arg0.aClass442_23.method28984(1.0F, 0.0F, 0.0F, local73);
								arg0.aClass442_23.method28984(0.0F, 1.0F, 0.0F, local76);
								this.aClass77_Sub39_Sub2_3.method22659(0.0F);
								this.aClass77_Sub39_Sub2_3.method22659(0.0F);
								this.aClass77_Sub39_Sub2_3.method22659(local155 - local73[0] - local76[0]);
								this.aClass77_Sub39_Sub2_3.method22659(local161 - local73[1] - local76[1]);
								this.aClass77_Sub39_Sub2_3.method22659(local750 - local73[2] - local76[2]);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22659(0.0F);
								this.aClass77_Sub39_Sub2_3.method22659(1.0F);
								this.aClass77_Sub39_Sub2_3.method22659(local155 - local73[0] + local76[0]);
								this.aClass77_Sub39_Sub2_3.method22659(local161 - local73[1] + local76[1]);
								this.aClass77_Sub39_Sub2_3.method22659(local750 - local73[2] + local76[2]);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22659(1.0F);
								this.aClass77_Sub39_Sub2_3.method22659(1.0F);
								this.aClass77_Sub39_Sub2_3.method22659(local155 + local73[0] + local76[0]);
								this.aClass77_Sub39_Sub2_3.method22659(local161 + local73[1] + local76[1]);
								this.aClass77_Sub39_Sub2_3.method22659(local750 + local73[2] + local76[2]);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22659(1.0F);
								this.aClass77_Sub39_Sub2_3.method22659(0.0F);
								this.aClass77_Sub39_Sub2_3.method22659(local155 + local73[0] - local76[0]);
								this.aClass77_Sub39_Sub2_3.method22659(local161 + local73[1] - local76[1]);
								this.aClass77_Sub39_Sub2_3.method22659(local750 + local73[2] - local76[2]);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
							}
						}
					}
				}
			}
		} else {
			for (local92 = arg1 - 1; local92 >= 0; local92--) {
				local107 = this.anIntArray313[local92] > 64 ? 64 : this.anIntArray313[local92];
				if (local107 > 0) {
					for (local113 = local107 - 1; local113 >= 0; local113--) {
						local122 = this.aClass131_Sub2_Sub1ArrayArray1[local92][local113];
						local125 = local122.anInt3126;
						local130 = (byte) (local125 >> 16);
						local135 = (byte) (local125 >> 8);
						local138 = (byte) local125;
						local143 = (byte) (local125 >>> 24);
						local149 = local122.anInt3125 >> 12;
						local155 = local122.anInt3128 >> 12;
						local161 = local122.anInt3129 >> 12;
						local166 = local122.anInt3130 >> 12;
						if (local122.aShort113 == 0) {
							this.aClass77_Sub39_Sub2_3.method22663(0.0F);
							this.aClass77_Sub39_Sub2_3.method22663(0.0F);
							this.aClass77_Sub39_Sub2_3.method22663(local149 + local38 * (float) -local166);
							this.aClass77_Sub39_Sub2_3.method22663(local155 + local42 * (float) -local166);
							this.aClass77_Sub39_Sub2_3.method22663(local161 + local46 * (float) -local166);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22663(0.0F);
							this.aClass77_Sub39_Sub2_3.method22663(1.0F);
							this.aClass77_Sub39_Sub2_3.method22663(local149 + local62 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22663(local155 + local66 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22663(local161 + local70 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22663(1.0F);
							this.aClass77_Sub39_Sub2_3.method22663(1.0F);
							this.aClass77_Sub39_Sub2_3.method22663(local149 + local38 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22663(local155 + local42 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22663(local161 + local46 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22663(1.0F);
							this.aClass77_Sub39_Sub2_3.method22663(0.0F);
							this.aClass77_Sub39_Sub2_3.method22663(local149 + local50 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22663(local155 + local54 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22663(local161 + local58 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
						} else {
							arg0.aClass442_23.method29058(local122.aShort113, local166, local166, 0.0F, 0.0F, 0.0F);
							arg0.aClass442_23.method28965(arg0.aClass442_21);
							arg0.aClass442_23.method28984(1.0F, 0.0F, 0.0F, local73);
							arg0.aClass442_23.method28984(0.0F, 1.0F, 0.0F, local76);
							this.aClass77_Sub39_Sub2_3.method22663(0.0F);
							this.aClass77_Sub39_Sub2_3.method22663(0.0F);
							this.aClass77_Sub39_Sub2_3.method22663(local149 - local73[0] - local76[0]);
							this.aClass77_Sub39_Sub2_3.method22663(local155 - local73[1] - local76[1]);
							this.aClass77_Sub39_Sub2_3.method22663(local161 - local73[2] - local76[2]);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22663(0.0F);
							this.aClass77_Sub39_Sub2_3.method22663(1.0F);
							this.aClass77_Sub39_Sub2_3.method22663(local149 - local73[0] + local76[0]);
							this.aClass77_Sub39_Sub2_3.method22663(local155 - local73[1] + local76[1]);
							this.aClass77_Sub39_Sub2_3.method22663(local161 - local73[2] + local76[2]);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22663(1.0F);
							this.aClass77_Sub39_Sub2_3.method22663(1.0F);
							this.aClass77_Sub39_Sub2_3.method22663(local149 + local73[0] + local76[0]);
							this.aClass77_Sub39_Sub2_3.method22663(local155 + local73[1] + local76[1]);
							this.aClass77_Sub39_Sub2_3.method22663(local161 + local73[2] + local76[2]);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22663(1.0F);
							this.aClass77_Sub39_Sub2_3.method22663(0.0F);
							this.aClass77_Sub39_Sub2_3.method22663(local149 + local73[0] - local76[0]);
							this.aClass77_Sub39_Sub2_3.method22663(local155 + local73[1] - local76[1]);
							this.aClass77_Sub39_Sub2_3.method22663(local161 + local73[2] - local76[2]);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
						}
					}
					if (this.anIntArray313[local92] > 64) {
						local113 = this.anIntArray313[local92] - 64 - 1;
						for (local702 = this.anIntArray315[local113] - 1; local702 >= 0; local702--) {
							local711 = this.aClass131_Sub2_Sub1ArrayArray2[local113][local702];
							local714 = local711.anInt3126;
							local135 = (byte) (local714 >> 16);
							local138 = (byte) (local714 >> 8);
							local143 = (byte) local714;
							local732 = (byte) (local714 >>> 24);
							local155 = local711.anInt3125 >> 12;
							local161 = local711.anInt3128 >> 12;
							local750 = local711.anInt3129 >> 12;
							local755 = local711.anInt3130 >> 12;
							if (local711.aShort113 == 0) {
								this.aClass77_Sub39_Sub2_3.method22663(0.0F);
								this.aClass77_Sub39_Sub2_3.method22663(0.0F);
								this.aClass77_Sub39_Sub2_3.method22663(local155 + local38 * (float) -local755);
								this.aClass77_Sub39_Sub2_3.method22663(local161 + local42 * (float) -local755);
								this.aClass77_Sub39_Sub2_3.method22663(local750 + local46 * (float) -local755);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22663(0.0F);
								this.aClass77_Sub39_Sub2_3.method22663(1.0F);
								this.aClass77_Sub39_Sub2_3.method22663(local155 + local62 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22663(local161 + local66 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22663(local750 + local70 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22663(1.0F);
								this.aClass77_Sub39_Sub2_3.method22663(1.0F);
								this.aClass77_Sub39_Sub2_3.method22663(local155 + local38 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22663(local161 + local42 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22663(local750 + local46 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22663(1.0F);
								this.aClass77_Sub39_Sub2_3.method22663(0.0F);
								this.aClass77_Sub39_Sub2_3.method22663(local155 + local50 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22663(local161 + local54 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22663(local750 + local58 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
							} else {
								arg0.aClass442_23.method29058(local711.aShort113, local755, local755, 0.0F, 0.0F, 0.0F);
								arg0.aClass442_23.method28965(arg0.aClass442_21);
								arg0.aClass442_23.method28984(1.0F, 0.0F, 0.0F, local73);
								arg0.aClass442_23.method28984(0.0F, 1.0F, 0.0F, local76);
								this.aClass77_Sub39_Sub2_3.method22663(0.0F);
								this.aClass77_Sub39_Sub2_3.method22663(0.0F);
								this.aClass77_Sub39_Sub2_3.method22663(local155 - local73[0] - local76[0]);
								this.aClass77_Sub39_Sub2_3.method22663(local161 - local73[1] - local76[1]);
								this.aClass77_Sub39_Sub2_3.method22663(local750 - local73[2] - local76[2]);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22663(0.0F);
								this.aClass77_Sub39_Sub2_3.method22663(1.0F);
								this.aClass77_Sub39_Sub2_3.method22663(local155 - local73[0] + local76[0]);
								this.aClass77_Sub39_Sub2_3.method22663(local161 - local73[1] + local76[1]);
								this.aClass77_Sub39_Sub2_3.method22663(local750 - local73[2] + local76[2]);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22663(1.0F);
								this.aClass77_Sub39_Sub2_3.method22663(1.0F);
								this.aClass77_Sub39_Sub2_3.method22663(local155 + local73[0] + local76[0]);
								this.aClass77_Sub39_Sub2_3.method22663(local161 + local73[1] + local76[1]);
								this.aClass77_Sub39_Sub2_3.method22663(local750 + local73[2] + local76[2]);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22663(1.0F);
								this.aClass77_Sub39_Sub2_3.method22663(0.0F);
								this.aClass77_Sub39_Sub2_3.method22663(local155 + local73[0] - local76[0]);
								this.aClass77_Sub39_Sub2_3.method22663(local161 + local73[1] - local76[1]);
								this.aClass77_Sub39_Sub2_3.method22663(local750 + local73[2] - local76[2]);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
							}
						}
					}
				}
			}
		}
		if (this.aClass77_Sub39_Sub2_3.anInt3089 * 31645619 != 0) {
			this.anInterface14_7.method1785(24, this.aClass77_Sub39_Sub2_3.aByteArray53, this.aClass77_Sub39_Sub2_3.anInt3089 * 31645619);
			arg0.method6155(this.aClass172_14, null, this.aClass172_15, this.aClass172_16);
			arg0.method6159(7, 0, this.aClass77_Sub39_Sub2_3.anInt3089 * 31645619 / 24);
		}
	}

	@OriginalMember(owner = "client!cg", name = "s", descriptor = "(Lclient!aeq;I)V", line = 114)
	void method24641(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray95, 0);
		@Pc(9) float local9 = this.aFloatArray95[0];
		@Pc(14) float local14 = this.aFloatArray95[4];
		@Pc(19) float local19 = this.aFloatArray95[8];
		@Pc(24) float local24 = this.aFloatArray95[1];
		@Pc(29) float local29 = this.aFloatArray95[5];
		@Pc(34) float local34 = this.aFloatArray95[9];
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
		arg0.aClass442_21.method28956(arg0.aClass442_25);
		this.aClass77_Sub39_Sub2_3.anInt3089 = 0;
		@Pc(92) int local92;
		@Pc(107) int local107;
		@Pc(113) int local113;
		@Pc(122) Class131_Sub2_Sub1 local122;
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
		@Pc(711) Class131_Sub2_Sub1 local711;
		@Pc(714) int local714;
		@Pc(732) byte local732;
		@Pc(750) float local750;
		if (arg0.aBoolean116) {
			for (local92 = arg1 - 1; local92 >= 0; local92--) {
				local107 = this.anIntArray313[local92] > 64 ? 64 : this.anIntArray313[local92];
				if (local107 > 0) {
					for (local113 = local107 - 1; local113 >= 0; local113--) {
						local122 = this.aClass131_Sub2_Sub1ArrayArray1[local92][local113];
						local125 = local122.anInt3126;
						local130 = (byte) (local125 >> 16);
						local135 = (byte) (local125 >> 8);
						local138 = (byte) local125;
						local143 = (byte) (local125 >>> 24);
						local149 = local122.anInt3125 >> 12;
						local155 = local122.anInt3128 >> 12;
						local161 = local122.anInt3129 >> 12;
						local166 = local122.anInt3130 >> 12;
						if (local122.aShort113 == 0) {
							this.aClass77_Sub39_Sub2_3.method22659(0.0F);
							this.aClass77_Sub39_Sub2_3.method22659(0.0F);
							this.aClass77_Sub39_Sub2_3.method22659(local149 + local38 * (float) -local166);
							this.aClass77_Sub39_Sub2_3.method22659(local155 + local42 * (float) -local166);
							this.aClass77_Sub39_Sub2_3.method22659(local161 + local46 * (float) -local166);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22659(0.0F);
							this.aClass77_Sub39_Sub2_3.method22659(1.0F);
							this.aClass77_Sub39_Sub2_3.method22659(local149 + local62 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22659(local155 + local66 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22659(local161 + local70 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22659(1.0F);
							this.aClass77_Sub39_Sub2_3.method22659(1.0F);
							this.aClass77_Sub39_Sub2_3.method22659(local149 + local38 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22659(local155 + local42 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22659(local161 + local46 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22659(1.0F);
							this.aClass77_Sub39_Sub2_3.method22659(0.0F);
							this.aClass77_Sub39_Sub2_3.method22659(local149 + local50 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22659(local155 + local54 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22659(local161 + local58 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
						} else {
							arg0.aClass442_23.method29058(local122.aShort113, local166, local166, 0.0F, 0.0F, 0.0F);
							arg0.aClass442_23.method28965(arg0.aClass442_21);
							arg0.aClass442_23.method28984(1.0F, 0.0F, 0.0F, local73);
							arg0.aClass442_23.method28984(0.0F, 1.0F, 0.0F, local76);
							this.aClass77_Sub39_Sub2_3.method22659(0.0F);
							this.aClass77_Sub39_Sub2_3.method22659(0.0F);
							this.aClass77_Sub39_Sub2_3.method22659(local149 - local73[0] - local76[0]);
							this.aClass77_Sub39_Sub2_3.method22659(local155 - local73[1] - local76[1]);
							this.aClass77_Sub39_Sub2_3.method22659(local161 - local73[2] - local76[2]);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22659(0.0F);
							this.aClass77_Sub39_Sub2_3.method22659(1.0F);
							this.aClass77_Sub39_Sub2_3.method22659(local149 - local73[0] + local76[0]);
							this.aClass77_Sub39_Sub2_3.method22659(local155 - local73[1] + local76[1]);
							this.aClass77_Sub39_Sub2_3.method22659(local161 - local73[2] + local76[2]);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22659(1.0F);
							this.aClass77_Sub39_Sub2_3.method22659(1.0F);
							this.aClass77_Sub39_Sub2_3.method22659(local149 + local73[0] + local76[0]);
							this.aClass77_Sub39_Sub2_3.method22659(local155 + local73[1] + local76[1]);
							this.aClass77_Sub39_Sub2_3.method22659(local161 + local73[2] + local76[2]);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22659(1.0F);
							this.aClass77_Sub39_Sub2_3.method22659(0.0F);
							this.aClass77_Sub39_Sub2_3.method22659(local149 + local73[0] - local76[0]);
							this.aClass77_Sub39_Sub2_3.method22659(local155 + local73[1] - local76[1]);
							this.aClass77_Sub39_Sub2_3.method22659(local161 + local73[2] - local76[2]);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
						}
					}
					if (this.anIntArray313[local92] > 64) {
						local113 = this.anIntArray313[local92] - 64 - 1;
						for (local702 = this.anIntArray315[local113] - 1; local702 >= 0; local702--) {
							local711 = this.aClass131_Sub2_Sub1ArrayArray2[local113][local702];
							local714 = local711.anInt3126;
							local135 = (byte) (local714 >> 16);
							local138 = (byte) (local714 >> 8);
							local143 = (byte) local714;
							local732 = (byte) (local714 >>> 24);
							local155 = local711.anInt3125 >> 12;
							local161 = local711.anInt3128 >> 12;
							local750 = local711.anInt3129 >> 12;
							local755 = local711.anInt3130 >> 12;
							if (local711.aShort113 == 0) {
								this.aClass77_Sub39_Sub2_3.method22659(0.0F);
								this.aClass77_Sub39_Sub2_3.method22659(0.0F);
								this.aClass77_Sub39_Sub2_3.method22659(local155 + local38 * (float) -local755);
								this.aClass77_Sub39_Sub2_3.method22659(local161 + local42 * (float) -local755);
								this.aClass77_Sub39_Sub2_3.method22659(local750 + local46 * (float) -local755);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22659(0.0F);
								this.aClass77_Sub39_Sub2_3.method22659(1.0F);
								this.aClass77_Sub39_Sub2_3.method22659(local155 + local62 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22659(local161 + local66 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22659(local750 + local70 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22659(1.0F);
								this.aClass77_Sub39_Sub2_3.method22659(1.0F);
								this.aClass77_Sub39_Sub2_3.method22659(local155 + local38 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22659(local161 + local42 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22659(local750 + local46 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22659(1.0F);
								this.aClass77_Sub39_Sub2_3.method22659(0.0F);
								this.aClass77_Sub39_Sub2_3.method22659(local155 + local50 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22659(local161 + local54 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22659(local750 + local58 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
							} else {
								arg0.aClass442_23.method29058(local711.aShort113, local755, local755, 0.0F, 0.0F, 0.0F);
								arg0.aClass442_23.method28965(arg0.aClass442_21);
								arg0.aClass442_23.method28984(1.0F, 0.0F, 0.0F, local73);
								arg0.aClass442_23.method28984(0.0F, 1.0F, 0.0F, local76);
								this.aClass77_Sub39_Sub2_3.method22659(0.0F);
								this.aClass77_Sub39_Sub2_3.method22659(0.0F);
								this.aClass77_Sub39_Sub2_3.method22659(local155 - local73[0] - local76[0]);
								this.aClass77_Sub39_Sub2_3.method22659(local161 - local73[1] - local76[1]);
								this.aClass77_Sub39_Sub2_3.method22659(local750 - local73[2] - local76[2]);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22659(0.0F);
								this.aClass77_Sub39_Sub2_3.method22659(1.0F);
								this.aClass77_Sub39_Sub2_3.method22659(local155 - local73[0] + local76[0]);
								this.aClass77_Sub39_Sub2_3.method22659(local161 - local73[1] + local76[1]);
								this.aClass77_Sub39_Sub2_3.method22659(local750 - local73[2] + local76[2]);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22659(1.0F);
								this.aClass77_Sub39_Sub2_3.method22659(1.0F);
								this.aClass77_Sub39_Sub2_3.method22659(local155 + local73[0] + local76[0]);
								this.aClass77_Sub39_Sub2_3.method22659(local161 + local73[1] + local76[1]);
								this.aClass77_Sub39_Sub2_3.method22659(local750 + local73[2] + local76[2]);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22659(1.0F);
								this.aClass77_Sub39_Sub2_3.method22659(0.0F);
								this.aClass77_Sub39_Sub2_3.method22659(local155 + local73[0] - local76[0]);
								this.aClass77_Sub39_Sub2_3.method22659(local161 + local73[1] - local76[1]);
								this.aClass77_Sub39_Sub2_3.method22659(local750 + local73[2] - local76[2]);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
							}
						}
					}
				}
			}
		} else {
			for (local92 = arg1 - 1; local92 >= 0; local92--) {
				local107 = this.anIntArray313[local92] > 64 ? 64 : this.anIntArray313[local92];
				if (local107 > 0) {
					for (local113 = local107 - 1; local113 >= 0; local113--) {
						local122 = this.aClass131_Sub2_Sub1ArrayArray1[local92][local113];
						local125 = local122.anInt3126;
						local130 = (byte) (local125 >> 16);
						local135 = (byte) (local125 >> 8);
						local138 = (byte) local125;
						local143 = (byte) (local125 >>> 24);
						local149 = local122.anInt3125 >> 12;
						local155 = local122.anInt3128 >> 12;
						local161 = local122.anInt3129 >> 12;
						local166 = local122.anInt3130 >> 12;
						if (local122.aShort113 == 0) {
							this.aClass77_Sub39_Sub2_3.method22663(0.0F);
							this.aClass77_Sub39_Sub2_3.method22663(0.0F);
							this.aClass77_Sub39_Sub2_3.method22663(local149 + local38 * (float) -local166);
							this.aClass77_Sub39_Sub2_3.method22663(local155 + local42 * (float) -local166);
							this.aClass77_Sub39_Sub2_3.method22663(local161 + local46 * (float) -local166);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22663(0.0F);
							this.aClass77_Sub39_Sub2_3.method22663(1.0F);
							this.aClass77_Sub39_Sub2_3.method22663(local149 + local62 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22663(local155 + local66 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22663(local161 + local70 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22663(1.0F);
							this.aClass77_Sub39_Sub2_3.method22663(1.0F);
							this.aClass77_Sub39_Sub2_3.method22663(local149 + local38 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22663(local155 + local42 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22663(local161 + local46 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22663(1.0F);
							this.aClass77_Sub39_Sub2_3.method22663(0.0F);
							this.aClass77_Sub39_Sub2_3.method22663(local149 + local50 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22663(local155 + local54 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22663(local161 + local58 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
						} else {
							arg0.aClass442_23.method29058(local122.aShort113, local166, local166, 0.0F, 0.0F, 0.0F);
							arg0.aClass442_23.method28965(arg0.aClass442_21);
							arg0.aClass442_23.method28984(1.0F, 0.0F, 0.0F, local73);
							arg0.aClass442_23.method28984(0.0F, 1.0F, 0.0F, local76);
							this.aClass77_Sub39_Sub2_3.method22663(0.0F);
							this.aClass77_Sub39_Sub2_3.method22663(0.0F);
							this.aClass77_Sub39_Sub2_3.method22663(local149 - local73[0] - local76[0]);
							this.aClass77_Sub39_Sub2_3.method22663(local155 - local73[1] - local76[1]);
							this.aClass77_Sub39_Sub2_3.method22663(local161 - local73[2] - local76[2]);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22663(0.0F);
							this.aClass77_Sub39_Sub2_3.method22663(1.0F);
							this.aClass77_Sub39_Sub2_3.method22663(local149 - local73[0] + local76[0]);
							this.aClass77_Sub39_Sub2_3.method22663(local155 - local73[1] + local76[1]);
							this.aClass77_Sub39_Sub2_3.method22663(local161 - local73[2] + local76[2]);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22663(1.0F);
							this.aClass77_Sub39_Sub2_3.method22663(1.0F);
							this.aClass77_Sub39_Sub2_3.method22663(local149 + local73[0] + local76[0]);
							this.aClass77_Sub39_Sub2_3.method22663(local155 + local73[1] + local76[1]);
							this.aClass77_Sub39_Sub2_3.method22663(local161 + local73[2] + local76[2]);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22663(1.0F);
							this.aClass77_Sub39_Sub2_3.method22663(0.0F);
							this.aClass77_Sub39_Sub2_3.method22663(local149 + local73[0] - local76[0]);
							this.aClass77_Sub39_Sub2_3.method22663(local155 + local73[1] - local76[1]);
							this.aClass77_Sub39_Sub2_3.method22663(local161 + local73[2] - local76[2]);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
						}
					}
					if (this.anIntArray313[local92] > 64) {
						local113 = this.anIntArray313[local92] - 64 - 1;
						for (local702 = this.anIntArray315[local113] - 1; local702 >= 0; local702--) {
							local711 = this.aClass131_Sub2_Sub1ArrayArray2[local113][local702];
							local714 = local711.anInt3126;
							local135 = (byte) (local714 >> 16);
							local138 = (byte) (local714 >> 8);
							local143 = (byte) local714;
							local732 = (byte) (local714 >>> 24);
							local155 = local711.anInt3125 >> 12;
							local161 = local711.anInt3128 >> 12;
							local750 = local711.anInt3129 >> 12;
							local755 = local711.anInt3130 >> 12;
							if (local711.aShort113 == 0) {
								this.aClass77_Sub39_Sub2_3.method22663(0.0F);
								this.aClass77_Sub39_Sub2_3.method22663(0.0F);
								this.aClass77_Sub39_Sub2_3.method22663(local155 + local38 * (float) -local755);
								this.aClass77_Sub39_Sub2_3.method22663(local161 + local42 * (float) -local755);
								this.aClass77_Sub39_Sub2_3.method22663(local750 + local46 * (float) -local755);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22663(0.0F);
								this.aClass77_Sub39_Sub2_3.method22663(1.0F);
								this.aClass77_Sub39_Sub2_3.method22663(local155 + local62 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22663(local161 + local66 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22663(local750 + local70 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22663(1.0F);
								this.aClass77_Sub39_Sub2_3.method22663(1.0F);
								this.aClass77_Sub39_Sub2_3.method22663(local155 + local38 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22663(local161 + local42 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22663(local750 + local46 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22663(1.0F);
								this.aClass77_Sub39_Sub2_3.method22663(0.0F);
								this.aClass77_Sub39_Sub2_3.method22663(local155 + local50 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22663(local161 + local54 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22663(local750 + local58 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
							} else {
								arg0.aClass442_23.method29058(local711.aShort113, local755, local755, 0.0F, 0.0F, 0.0F);
								arg0.aClass442_23.method28965(arg0.aClass442_21);
								arg0.aClass442_23.method28984(1.0F, 0.0F, 0.0F, local73);
								arg0.aClass442_23.method28984(0.0F, 1.0F, 0.0F, local76);
								this.aClass77_Sub39_Sub2_3.method22663(0.0F);
								this.aClass77_Sub39_Sub2_3.method22663(0.0F);
								this.aClass77_Sub39_Sub2_3.method22663(local155 - local73[0] - local76[0]);
								this.aClass77_Sub39_Sub2_3.method22663(local161 - local73[1] - local76[1]);
								this.aClass77_Sub39_Sub2_3.method22663(local750 - local73[2] - local76[2]);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22663(0.0F);
								this.aClass77_Sub39_Sub2_3.method22663(1.0F);
								this.aClass77_Sub39_Sub2_3.method22663(local155 - local73[0] + local76[0]);
								this.aClass77_Sub39_Sub2_3.method22663(local161 - local73[1] + local76[1]);
								this.aClass77_Sub39_Sub2_3.method22663(local750 - local73[2] + local76[2]);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22663(1.0F);
								this.aClass77_Sub39_Sub2_3.method22663(1.0F);
								this.aClass77_Sub39_Sub2_3.method22663(local155 + local73[0] + local76[0]);
								this.aClass77_Sub39_Sub2_3.method22663(local161 + local73[1] + local76[1]);
								this.aClass77_Sub39_Sub2_3.method22663(local750 + local73[2] + local76[2]);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22663(1.0F);
								this.aClass77_Sub39_Sub2_3.method22663(0.0F);
								this.aClass77_Sub39_Sub2_3.method22663(local155 + local73[0] - local76[0]);
								this.aClass77_Sub39_Sub2_3.method22663(local161 + local73[1] - local76[1]);
								this.aClass77_Sub39_Sub2_3.method22663(local750 + local73[2] - local76[2]);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
							}
						}
					}
				}
			}
		}
		if (this.aClass77_Sub39_Sub2_3.anInt3089 * 31645619 != 0) {
			this.anInterface14_7.method1785(24, this.aClass77_Sub39_Sub2_3.aByteArray53, this.aClass77_Sub39_Sub2_3.anInt3089 * 31645619);
			arg0.method6155(this.aClass172_14, null, this.aClass172_15, this.aClass172_16);
			arg0.method6159(7, 0, this.aClass77_Sub39_Sub2_3.anInt3089 * 31645619 / 24);
		}
	}

	@OriginalMember(owner = "client!cg", name = "r", descriptor = "(Lclient!aeq;I)V", line = 114)
	void method24642(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray95, 0);
		@Pc(9) float local9 = this.aFloatArray95[0];
		@Pc(14) float local14 = this.aFloatArray95[4];
		@Pc(19) float local19 = this.aFloatArray95[8];
		@Pc(24) float local24 = this.aFloatArray95[1];
		@Pc(29) float local29 = this.aFloatArray95[5];
		@Pc(34) float local34 = this.aFloatArray95[9];
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
		arg0.aClass442_21.method28956(arg0.aClass442_25);
		this.aClass77_Sub39_Sub2_3.anInt3089 = 0;
		@Pc(92) int local92;
		@Pc(107) int local107;
		@Pc(113) int local113;
		@Pc(122) Class131_Sub2_Sub1 local122;
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
		@Pc(711) Class131_Sub2_Sub1 local711;
		@Pc(714) int local714;
		@Pc(732) byte local732;
		@Pc(750) float local750;
		if (arg0.aBoolean116) {
			for (local92 = arg1 - 1; local92 >= 0; local92--) {
				local107 = this.anIntArray313[local92] > 64 ? 64 : this.anIntArray313[local92];
				if (local107 > 0) {
					for (local113 = local107 - 1; local113 >= 0; local113--) {
						local122 = this.aClass131_Sub2_Sub1ArrayArray1[local92][local113];
						local125 = local122.anInt3126;
						local130 = (byte) (local125 >> 16);
						local135 = (byte) (local125 >> 8);
						local138 = (byte) local125;
						local143 = (byte) (local125 >>> 24);
						local149 = local122.anInt3125 >> 12;
						local155 = local122.anInt3128 >> 12;
						local161 = local122.anInt3129 >> 12;
						local166 = local122.anInt3130 >> 12;
						if (local122.aShort113 == 0) {
							this.aClass77_Sub39_Sub2_3.method22659(0.0F);
							this.aClass77_Sub39_Sub2_3.method22659(0.0F);
							this.aClass77_Sub39_Sub2_3.method22659(local149 + local38 * (float) -local166);
							this.aClass77_Sub39_Sub2_3.method22659(local155 + local42 * (float) -local166);
							this.aClass77_Sub39_Sub2_3.method22659(local161 + local46 * (float) -local166);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22659(0.0F);
							this.aClass77_Sub39_Sub2_3.method22659(1.0F);
							this.aClass77_Sub39_Sub2_3.method22659(local149 + local62 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22659(local155 + local66 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22659(local161 + local70 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22659(1.0F);
							this.aClass77_Sub39_Sub2_3.method22659(1.0F);
							this.aClass77_Sub39_Sub2_3.method22659(local149 + local38 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22659(local155 + local42 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22659(local161 + local46 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22659(1.0F);
							this.aClass77_Sub39_Sub2_3.method22659(0.0F);
							this.aClass77_Sub39_Sub2_3.method22659(local149 + local50 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22659(local155 + local54 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22659(local161 + local58 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
						} else {
							arg0.aClass442_23.method29058(local122.aShort113, local166, local166, 0.0F, 0.0F, 0.0F);
							arg0.aClass442_23.method28965(arg0.aClass442_21);
							arg0.aClass442_23.method28984(1.0F, 0.0F, 0.0F, local73);
							arg0.aClass442_23.method28984(0.0F, 1.0F, 0.0F, local76);
							this.aClass77_Sub39_Sub2_3.method22659(0.0F);
							this.aClass77_Sub39_Sub2_3.method22659(0.0F);
							this.aClass77_Sub39_Sub2_3.method22659(local149 - local73[0] - local76[0]);
							this.aClass77_Sub39_Sub2_3.method22659(local155 - local73[1] - local76[1]);
							this.aClass77_Sub39_Sub2_3.method22659(local161 - local73[2] - local76[2]);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22659(0.0F);
							this.aClass77_Sub39_Sub2_3.method22659(1.0F);
							this.aClass77_Sub39_Sub2_3.method22659(local149 - local73[0] + local76[0]);
							this.aClass77_Sub39_Sub2_3.method22659(local155 - local73[1] + local76[1]);
							this.aClass77_Sub39_Sub2_3.method22659(local161 - local73[2] + local76[2]);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22659(1.0F);
							this.aClass77_Sub39_Sub2_3.method22659(1.0F);
							this.aClass77_Sub39_Sub2_3.method22659(local149 + local73[0] + local76[0]);
							this.aClass77_Sub39_Sub2_3.method22659(local155 + local73[1] + local76[1]);
							this.aClass77_Sub39_Sub2_3.method22659(local161 + local73[2] + local76[2]);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22659(1.0F);
							this.aClass77_Sub39_Sub2_3.method22659(0.0F);
							this.aClass77_Sub39_Sub2_3.method22659(local149 + local73[0] - local76[0]);
							this.aClass77_Sub39_Sub2_3.method22659(local155 + local73[1] - local76[1]);
							this.aClass77_Sub39_Sub2_3.method22659(local161 + local73[2] - local76[2]);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
						}
					}
					if (this.anIntArray313[local92] > 64) {
						local113 = this.anIntArray313[local92] - 64 - 1;
						for (local702 = this.anIntArray315[local113] - 1; local702 >= 0; local702--) {
							local711 = this.aClass131_Sub2_Sub1ArrayArray2[local113][local702];
							local714 = local711.anInt3126;
							local135 = (byte) (local714 >> 16);
							local138 = (byte) (local714 >> 8);
							local143 = (byte) local714;
							local732 = (byte) (local714 >>> 24);
							local155 = local711.anInt3125 >> 12;
							local161 = local711.anInt3128 >> 12;
							local750 = local711.anInt3129 >> 12;
							local755 = local711.anInt3130 >> 12;
							if (local711.aShort113 == 0) {
								this.aClass77_Sub39_Sub2_3.method22659(0.0F);
								this.aClass77_Sub39_Sub2_3.method22659(0.0F);
								this.aClass77_Sub39_Sub2_3.method22659(local155 + local38 * (float) -local755);
								this.aClass77_Sub39_Sub2_3.method22659(local161 + local42 * (float) -local755);
								this.aClass77_Sub39_Sub2_3.method22659(local750 + local46 * (float) -local755);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22659(0.0F);
								this.aClass77_Sub39_Sub2_3.method22659(1.0F);
								this.aClass77_Sub39_Sub2_3.method22659(local155 + local62 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22659(local161 + local66 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22659(local750 + local70 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22659(1.0F);
								this.aClass77_Sub39_Sub2_3.method22659(1.0F);
								this.aClass77_Sub39_Sub2_3.method22659(local155 + local38 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22659(local161 + local42 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22659(local750 + local46 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22659(1.0F);
								this.aClass77_Sub39_Sub2_3.method22659(0.0F);
								this.aClass77_Sub39_Sub2_3.method22659(local155 + local50 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22659(local161 + local54 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22659(local750 + local58 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
							} else {
								arg0.aClass442_23.method29058(local711.aShort113, local755, local755, 0.0F, 0.0F, 0.0F);
								arg0.aClass442_23.method28965(arg0.aClass442_21);
								arg0.aClass442_23.method28984(1.0F, 0.0F, 0.0F, local73);
								arg0.aClass442_23.method28984(0.0F, 1.0F, 0.0F, local76);
								this.aClass77_Sub39_Sub2_3.method22659(0.0F);
								this.aClass77_Sub39_Sub2_3.method22659(0.0F);
								this.aClass77_Sub39_Sub2_3.method22659(local155 - local73[0] - local76[0]);
								this.aClass77_Sub39_Sub2_3.method22659(local161 - local73[1] - local76[1]);
								this.aClass77_Sub39_Sub2_3.method22659(local750 - local73[2] - local76[2]);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22659(0.0F);
								this.aClass77_Sub39_Sub2_3.method22659(1.0F);
								this.aClass77_Sub39_Sub2_3.method22659(local155 - local73[0] + local76[0]);
								this.aClass77_Sub39_Sub2_3.method22659(local161 - local73[1] + local76[1]);
								this.aClass77_Sub39_Sub2_3.method22659(local750 - local73[2] + local76[2]);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22659(1.0F);
								this.aClass77_Sub39_Sub2_3.method22659(1.0F);
								this.aClass77_Sub39_Sub2_3.method22659(local155 + local73[0] + local76[0]);
								this.aClass77_Sub39_Sub2_3.method22659(local161 + local73[1] + local76[1]);
								this.aClass77_Sub39_Sub2_3.method22659(local750 + local73[2] + local76[2]);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22659(1.0F);
								this.aClass77_Sub39_Sub2_3.method22659(0.0F);
								this.aClass77_Sub39_Sub2_3.method22659(local155 + local73[0] - local76[0]);
								this.aClass77_Sub39_Sub2_3.method22659(local161 + local73[1] - local76[1]);
								this.aClass77_Sub39_Sub2_3.method22659(local750 + local73[2] - local76[2]);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
							}
						}
					}
				}
			}
		} else {
			for (local92 = arg1 - 1; local92 >= 0; local92--) {
				local107 = this.anIntArray313[local92] > 64 ? 64 : this.anIntArray313[local92];
				if (local107 > 0) {
					for (local113 = local107 - 1; local113 >= 0; local113--) {
						local122 = this.aClass131_Sub2_Sub1ArrayArray1[local92][local113];
						local125 = local122.anInt3126;
						local130 = (byte) (local125 >> 16);
						local135 = (byte) (local125 >> 8);
						local138 = (byte) local125;
						local143 = (byte) (local125 >>> 24);
						local149 = local122.anInt3125 >> 12;
						local155 = local122.anInt3128 >> 12;
						local161 = local122.anInt3129 >> 12;
						local166 = local122.anInt3130 >> 12;
						if (local122.aShort113 == 0) {
							this.aClass77_Sub39_Sub2_3.method22663(0.0F);
							this.aClass77_Sub39_Sub2_3.method22663(0.0F);
							this.aClass77_Sub39_Sub2_3.method22663(local149 + local38 * (float) -local166);
							this.aClass77_Sub39_Sub2_3.method22663(local155 + local42 * (float) -local166);
							this.aClass77_Sub39_Sub2_3.method22663(local161 + local46 * (float) -local166);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22663(0.0F);
							this.aClass77_Sub39_Sub2_3.method22663(1.0F);
							this.aClass77_Sub39_Sub2_3.method22663(local149 + local62 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22663(local155 + local66 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22663(local161 + local70 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22663(1.0F);
							this.aClass77_Sub39_Sub2_3.method22663(1.0F);
							this.aClass77_Sub39_Sub2_3.method22663(local149 + local38 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22663(local155 + local42 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22663(local161 + local46 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22663(1.0F);
							this.aClass77_Sub39_Sub2_3.method22663(0.0F);
							this.aClass77_Sub39_Sub2_3.method22663(local149 + local50 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22663(local155 + local54 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22663(local161 + local58 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
						} else {
							arg0.aClass442_23.method29058(local122.aShort113, local166, local166, 0.0F, 0.0F, 0.0F);
							arg0.aClass442_23.method28965(arg0.aClass442_21);
							arg0.aClass442_23.method28984(1.0F, 0.0F, 0.0F, local73);
							arg0.aClass442_23.method28984(0.0F, 1.0F, 0.0F, local76);
							this.aClass77_Sub39_Sub2_3.method22663(0.0F);
							this.aClass77_Sub39_Sub2_3.method22663(0.0F);
							this.aClass77_Sub39_Sub2_3.method22663(local149 - local73[0] - local76[0]);
							this.aClass77_Sub39_Sub2_3.method22663(local155 - local73[1] - local76[1]);
							this.aClass77_Sub39_Sub2_3.method22663(local161 - local73[2] - local76[2]);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22663(0.0F);
							this.aClass77_Sub39_Sub2_3.method22663(1.0F);
							this.aClass77_Sub39_Sub2_3.method22663(local149 - local73[0] + local76[0]);
							this.aClass77_Sub39_Sub2_3.method22663(local155 - local73[1] + local76[1]);
							this.aClass77_Sub39_Sub2_3.method22663(local161 - local73[2] + local76[2]);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22663(1.0F);
							this.aClass77_Sub39_Sub2_3.method22663(1.0F);
							this.aClass77_Sub39_Sub2_3.method22663(local149 + local73[0] + local76[0]);
							this.aClass77_Sub39_Sub2_3.method22663(local155 + local73[1] + local76[1]);
							this.aClass77_Sub39_Sub2_3.method22663(local161 + local73[2] + local76[2]);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22663(1.0F);
							this.aClass77_Sub39_Sub2_3.method22663(0.0F);
							this.aClass77_Sub39_Sub2_3.method22663(local149 + local73[0] - local76[0]);
							this.aClass77_Sub39_Sub2_3.method22663(local155 + local73[1] - local76[1]);
							this.aClass77_Sub39_Sub2_3.method22663(local161 + local73[2] - local76[2]);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
						}
					}
					if (this.anIntArray313[local92] > 64) {
						local113 = this.anIntArray313[local92] - 64 - 1;
						for (local702 = this.anIntArray315[local113] - 1; local702 >= 0; local702--) {
							local711 = this.aClass131_Sub2_Sub1ArrayArray2[local113][local702];
							local714 = local711.anInt3126;
							local135 = (byte) (local714 >> 16);
							local138 = (byte) (local714 >> 8);
							local143 = (byte) local714;
							local732 = (byte) (local714 >>> 24);
							local155 = local711.anInt3125 >> 12;
							local161 = local711.anInt3128 >> 12;
							local750 = local711.anInt3129 >> 12;
							local755 = local711.anInt3130 >> 12;
							if (local711.aShort113 == 0) {
								this.aClass77_Sub39_Sub2_3.method22663(0.0F);
								this.aClass77_Sub39_Sub2_3.method22663(0.0F);
								this.aClass77_Sub39_Sub2_3.method22663(local155 + local38 * (float) -local755);
								this.aClass77_Sub39_Sub2_3.method22663(local161 + local42 * (float) -local755);
								this.aClass77_Sub39_Sub2_3.method22663(local750 + local46 * (float) -local755);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22663(0.0F);
								this.aClass77_Sub39_Sub2_3.method22663(1.0F);
								this.aClass77_Sub39_Sub2_3.method22663(local155 + local62 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22663(local161 + local66 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22663(local750 + local70 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22663(1.0F);
								this.aClass77_Sub39_Sub2_3.method22663(1.0F);
								this.aClass77_Sub39_Sub2_3.method22663(local155 + local38 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22663(local161 + local42 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22663(local750 + local46 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22663(1.0F);
								this.aClass77_Sub39_Sub2_3.method22663(0.0F);
								this.aClass77_Sub39_Sub2_3.method22663(local155 + local50 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22663(local161 + local54 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22663(local750 + local58 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
							} else {
								arg0.aClass442_23.method29058(local711.aShort113, local755, local755, 0.0F, 0.0F, 0.0F);
								arg0.aClass442_23.method28965(arg0.aClass442_21);
								arg0.aClass442_23.method28984(1.0F, 0.0F, 0.0F, local73);
								arg0.aClass442_23.method28984(0.0F, 1.0F, 0.0F, local76);
								this.aClass77_Sub39_Sub2_3.method22663(0.0F);
								this.aClass77_Sub39_Sub2_3.method22663(0.0F);
								this.aClass77_Sub39_Sub2_3.method22663(local155 - local73[0] - local76[0]);
								this.aClass77_Sub39_Sub2_3.method22663(local161 - local73[1] - local76[1]);
								this.aClass77_Sub39_Sub2_3.method22663(local750 - local73[2] - local76[2]);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22663(0.0F);
								this.aClass77_Sub39_Sub2_3.method22663(1.0F);
								this.aClass77_Sub39_Sub2_3.method22663(local155 - local73[0] + local76[0]);
								this.aClass77_Sub39_Sub2_3.method22663(local161 - local73[1] + local76[1]);
								this.aClass77_Sub39_Sub2_3.method22663(local750 - local73[2] + local76[2]);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22663(1.0F);
								this.aClass77_Sub39_Sub2_3.method22663(1.0F);
								this.aClass77_Sub39_Sub2_3.method22663(local155 + local73[0] + local76[0]);
								this.aClass77_Sub39_Sub2_3.method22663(local161 + local73[1] + local76[1]);
								this.aClass77_Sub39_Sub2_3.method22663(local750 + local73[2] + local76[2]);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22663(1.0F);
								this.aClass77_Sub39_Sub2_3.method22663(0.0F);
								this.aClass77_Sub39_Sub2_3.method22663(local155 + local73[0] - local76[0]);
								this.aClass77_Sub39_Sub2_3.method22663(local161 + local73[1] - local76[1]);
								this.aClass77_Sub39_Sub2_3.method22663(local750 + local73[2] - local76[2]);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
							}
						}
					}
				}
			}
		}
		if (this.aClass77_Sub39_Sub2_3.anInt3089 * 31645619 != 0) {
			this.anInterface14_7.method1785(24, this.aClass77_Sub39_Sub2_3.aByteArray53, this.aClass77_Sub39_Sub2_3.anInt3089 * 31645619);
			arg0.method6155(this.aClass172_14, null, this.aClass172_15, this.aClass172_16);
			arg0.method6159(7, 0, this.aClass77_Sub39_Sub2_3.anInt3089 * 31645619 / 24);
		}
	}

	@OriginalMember(owner = "client!cg", name = "z", descriptor = "(Lclient!aeq;I)V", line = 114)
	void method24643(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray95, 0);
		@Pc(9) float local9 = this.aFloatArray95[0];
		@Pc(14) float local14 = this.aFloatArray95[4];
		@Pc(19) float local19 = this.aFloatArray95[8];
		@Pc(24) float local24 = this.aFloatArray95[1];
		@Pc(29) float local29 = this.aFloatArray95[5];
		@Pc(34) float local34 = this.aFloatArray95[9];
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
		arg0.aClass442_21.method28956(arg0.aClass442_25);
		this.aClass77_Sub39_Sub2_3.anInt3089 = 0;
		@Pc(92) int local92;
		@Pc(107) int local107;
		@Pc(113) int local113;
		@Pc(122) Class131_Sub2_Sub1 local122;
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
		@Pc(711) Class131_Sub2_Sub1 local711;
		@Pc(714) int local714;
		@Pc(732) byte local732;
		@Pc(750) float local750;
		if (arg0.aBoolean116) {
			for (local92 = arg1 - 1; local92 >= 0; local92--) {
				local107 = this.anIntArray313[local92] > 64 ? 64 : this.anIntArray313[local92];
				if (local107 > 0) {
					for (local113 = local107 - 1; local113 >= 0; local113--) {
						local122 = this.aClass131_Sub2_Sub1ArrayArray1[local92][local113];
						local125 = local122.anInt3126;
						local130 = (byte) (local125 >> 16);
						local135 = (byte) (local125 >> 8);
						local138 = (byte) local125;
						local143 = (byte) (local125 >>> 24);
						local149 = local122.anInt3125 >> 12;
						local155 = local122.anInt3128 >> 12;
						local161 = local122.anInt3129 >> 12;
						local166 = local122.anInt3130 >> 12;
						if (local122.aShort113 == 0) {
							this.aClass77_Sub39_Sub2_3.method22659(0.0F);
							this.aClass77_Sub39_Sub2_3.method22659(0.0F);
							this.aClass77_Sub39_Sub2_3.method22659(local149 + local38 * (float) -local166);
							this.aClass77_Sub39_Sub2_3.method22659(local155 + local42 * (float) -local166);
							this.aClass77_Sub39_Sub2_3.method22659(local161 + local46 * (float) -local166);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22659(0.0F);
							this.aClass77_Sub39_Sub2_3.method22659(1.0F);
							this.aClass77_Sub39_Sub2_3.method22659(local149 + local62 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22659(local155 + local66 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22659(local161 + local70 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22659(1.0F);
							this.aClass77_Sub39_Sub2_3.method22659(1.0F);
							this.aClass77_Sub39_Sub2_3.method22659(local149 + local38 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22659(local155 + local42 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22659(local161 + local46 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22659(1.0F);
							this.aClass77_Sub39_Sub2_3.method22659(0.0F);
							this.aClass77_Sub39_Sub2_3.method22659(local149 + local50 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22659(local155 + local54 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22659(local161 + local58 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
						} else {
							arg0.aClass442_23.method29058(local122.aShort113, local166, local166, 0.0F, 0.0F, 0.0F);
							arg0.aClass442_23.method28965(arg0.aClass442_21);
							arg0.aClass442_23.method28984(1.0F, 0.0F, 0.0F, local73);
							arg0.aClass442_23.method28984(0.0F, 1.0F, 0.0F, local76);
							this.aClass77_Sub39_Sub2_3.method22659(0.0F);
							this.aClass77_Sub39_Sub2_3.method22659(0.0F);
							this.aClass77_Sub39_Sub2_3.method22659(local149 - local73[0] - local76[0]);
							this.aClass77_Sub39_Sub2_3.method22659(local155 - local73[1] - local76[1]);
							this.aClass77_Sub39_Sub2_3.method22659(local161 - local73[2] - local76[2]);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22659(0.0F);
							this.aClass77_Sub39_Sub2_3.method22659(1.0F);
							this.aClass77_Sub39_Sub2_3.method22659(local149 - local73[0] + local76[0]);
							this.aClass77_Sub39_Sub2_3.method22659(local155 - local73[1] + local76[1]);
							this.aClass77_Sub39_Sub2_3.method22659(local161 - local73[2] + local76[2]);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22659(1.0F);
							this.aClass77_Sub39_Sub2_3.method22659(1.0F);
							this.aClass77_Sub39_Sub2_3.method22659(local149 + local73[0] + local76[0]);
							this.aClass77_Sub39_Sub2_3.method22659(local155 + local73[1] + local76[1]);
							this.aClass77_Sub39_Sub2_3.method22659(local161 + local73[2] + local76[2]);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22659(1.0F);
							this.aClass77_Sub39_Sub2_3.method22659(0.0F);
							this.aClass77_Sub39_Sub2_3.method22659(local149 + local73[0] - local76[0]);
							this.aClass77_Sub39_Sub2_3.method22659(local155 + local73[1] - local76[1]);
							this.aClass77_Sub39_Sub2_3.method22659(local161 + local73[2] - local76[2]);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
						}
					}
					if (this.anIntArray313[local92] > 64) {
						local113 = this.anIntArray313[local92] - 64 - 1;
						for (local702 = this.anIntArray315[local113] - 1; local702 >= 0; local702--) {
							local711 = this.aClass131_Sub2_Sub1ArrayArray2[local113][local702];
							local714 = local711.anInt3126;
							local135 = (byte) (local714 >> 16);
							local138 = (byte) (local714 >> 8);
							local143 = (byte) local714;
							local732 = (byte) (local714 >>> 24);
							local155 = local711.anInt3125 >> 12;
							local161 = local711.anInt3128 >> 12;
							local750 = local711.anInt3129 >> 12;
							local755 = local711.anInt3130 >> 12;
							if (local711.aShort113 == 0) {
								this.aClass77_Sub39_Sub2_3.method22659(0.0F);
								this.aClass77_Sub39_Sub2_3.method22659(0.0F);
								this.aClass77_Sub39_Sub2_3.method22659(local155 + local38 * (float) -local755);
								this.aClass77_Sub39_Sub2_3.method22659(local161 + local42 * (float) -local755);
								this.aClass77_Sub39_Sub2_3.method22659(local750 + local46 * (float) -local755);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22659(0.0F);
								this.aClass77_Sub39_Sub2_3.method22659(1.0F);
								this.aClass77_Sub39_Sub2_3.method22659(local155 + local62 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22659(local161 + local66 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22659(local750 + local70 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22659(1.0F);
								this.aClass77_Sub39_Sub2_3.method22659(1.0F);
								this.aClass77_Sub39_Sub2_3.method22659(local155 + local38 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22659(local161 + local42 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22659(local750 + local46 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22659(1.0F);
								this.aClass77_Sub39_Sub2_3.method22659(0.0F);
								this.aClass77_Sub39_Sub2_3.method22659(local155 + local50 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22659(local161 + local54 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22659(local750 + local58 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
							} else {
								arg0.aClass442_23.method29058(local711.aShort113, local755, local755, 0.0F, 0.0F, 0.0F);
								arg0.aClass442_23.method28965(arg0.aClass442_21);
								arg0.aClass442_23.method28984(1.0F, 0.0F, 0.0F, local73);
								arg0.aClass442_23.method28984(0.0F, 1.0F, 0.0F, local76);
								this.aClass77_Sub39_Sub2_3.method22659(0.0F);
								this.aClass77_Sub39_Sub2_3.method22659(0.0F);
								this.aClass77_Sub39_Sub2_3.method22659(local155 - local73[0] - local76[0]);
								this.aClass77_Sub39_Sub2_3.method22659(local161 - local73[1] - local76[1]);
								this.aClass77_Sub39_Sub2_3.method22659(local750 - local73[2] - local76[2]);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22659(0.0F);
								this.aClass77_Sub39_Sub2_3.method22659(1.0F);
								this.aClass77_Sub39_Sub2_3.method22659(local155 - local73[0] + local76[0]);
								this.aClass77_Sub39_Sub2_3.method22659(local161 - local73[1] + local76[1]);
								this.aClass77_Sub39_Sub2_3.method22659(local750 - local73[2] + local76[2]);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22659(1.0F);
								this.aClass77_Sub39_Sub2_3.method22659(1.0F);
								this.aClass77_Sub39_Sub2_3.method22659(local155 + local73[0] + local76[0]);
								this.aClass77_Sub39_Sub2_3.method22659(local161 + local73[1] + local76[1]);
								this.aClass77_Sub39_Sub2_3.method22659(local750 + local73[2] + local76[2]);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22659(1.0F);
								this.aClass77_Sub39_Sub2_3.method22659(0.0F);
								this.aClass77_Sub39_Sub2_3.method22659(local155 + local73[0] - local76[0]);
								this.aClass77_Sub39_Sub2_3.method22659(local161 + local73[1] - local76[1]);
								this.aClass77_Sub39_Sub2_3.method22659(local750 + local73[2] - local76[2]);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
							}
						}
					}
				}
			}
		} else {
			for (local92 = arg1 - 1; local92 >= 0; local92--) {
				local107 = this.anIntArray313[local92] > 64 ? 64 : this.anIntArray313[local92];
				if (local107 > 0) {
					for (local113 = local107 - 1; local113 >= 0; local113--) {
						local122 = this.aClass131_Sub2_Sub1ArrayArray1[local92][local113];
						local125 = local122.anInt3126;
						local130 = (byte) (local125 >> 16);
						local135 = (byte) (local125 >> 8);
						local138 = (byte) local125;
						local143 = (byte) (local125 >>> 24);
						local149 = local122.anInt3125 >> 12;
						local155 = local122.anInt3128 >> 12;
						local161 = local122.anInt3129 >> 12;
						local166 = local122.anInt3130 >> 12;
						if (local122.aShort113 == 0) {
							this.aClass77_Sub39_Sub2_3.method22663(0.0F);
							this.aClass77_Sub39_Sub2_3.method22663(0.0F);
							this.aClass77_Sub39_Sub2_3.method22663(local149 + local38 * (float) -local166);
							this.aClass77_Sub39_Sub2_3.method22663(local155 + local42 * (float) -local166);
							this.aClass77_Sub39_Sub2_3.method22663(local161 + local46 * (float) -local166);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22663(0.0F);
							this.aClass77_Sub39_Sub2_3.method22663(1.0F);
							this.aClass77_Sub39_Sub2_3.method22663(local149 + local62 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22663(local155 + local66 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22663(local161 + local70 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22663(1.0F);
							this.aClass77_Sub39_Sub2_3.method22663(1.0F);
							this.aClass77_Sub39_Sub2_3.method22663(local149 + local38 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22663(local155 + local42 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22663(local161 + local46 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22663(1.0F);
							this.aClass77_Sub39_Sub2_3.method22663(0.0F);
							this.aClass77_Sub39_Sub2_3.method22663(local149 + local50 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22663(local155 + local54 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22663(local161 + local58 * (float) local166);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
						} else {
							arg0.aClass442_23.method29058(local122.aShort113, local166, local166, 0.0F, 0.0F, 0.0F);
							arg0.aClass442_23.method28965(arg0.aClass442_21);
							arg0.aClass442_23.method28984(1.0F, 0.0F, 0.0F, local73);
							arg0.aClass442_23.method28984(0.0F, 1.0F, 0.0F, local76);
							this.aClass77_Sub39_Sub2_3.method22663(0.0F);
							this.aClass77_Sub39_Sub2_3.method22663(0.0F);
							this.aClass77_Sub39_Sub2_3.method22663(local149 - local73[0] - local76[0]);
							this.aClass77_Sub39_Sub2_3.method22663(local155 - local73[1] - local76[1]);
							this.aClass77_Sub39_Sub2_3.method22663(local161 - local73[2] - local76[2]);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22663(0.0F);
							this.aClass77_Sub39_Sub2_3.method22663(1.0F);
							this.aClass77_Sub39_Sub2_3.method22663(local149 - local73[0] + local76[0]);
							this.aClass77_Sub39_Sub2_3.method22663(local155 - local73[1] + local76[1]);
							this.aClass77_Sub39_Sub2_3.method22663(local161 - local73[2] + local76[2]);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22663(1.0F);
							this.aClass77_Sub39_Sub2_3.method22663(1.0F);
							this.aClass77_Sub39_Sub2_3.method22663(local149 + local73[0] + local76[0]);
							this.aClass77_Sub39_Sub2_3.method22663(local155 + local73[1] + local76[1]);
							this.aClass77_Sub39_Sub2_3.method22663(local161 + local73[2] + local76[2]);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
							this.aClass77_Sub39_Sub2_3.method22663(1.0F);
							this.aClass77_Sub39_Sub2_3.method22663(0.0F);
							this.aClass77_Sub39_Sub2_3.method22663(local149 + local73[0] - local76[0]);
							this.aClass77_Sub39_Sub2_3.method22663(local155 + local73[1] - local76[1]);
							this.aClass77_Sub39_Sub2_3.method22663(local161 + local73[2] - local76[2]);
							this.aClass77_Sub39_Sub2_3.method22403(local130);
							this.aClass77_Sub39_Sub2_3.method22403(local135);
							this.aClass77_Sub39_Sub2_3.method22403(local138);
							this.aClass77_Sub39_Sub2_3.method22403(local143);
						}
					}
					if (this.anIntArray313[local92] > 64) {
						local113 = this.anIntArray313[local92] - 64 - 1;
						for (local702 = this.anIntArray315[local113] - 1; local702 >= 0; local702--) {
							local711 = this.aClass131_Sub2_Sub1ArrayArray2[local113][local702];
							local714 = local711.anInt3126;
							local135 = (byte) (local714 >> 16);
							local138 = (byte) (local714 >> 8);
							local143 = (byte) local714;
							local732 = (byte) (local714 >>> 24);
							local155 = local711.anInt3125 >> 12;
							local161 = local711.anInt3128 >> 12;
							local750 = local711.anInt3129 >> 12;
							local755 = local711.anInt3130 >> 12;
							if (local711.aShort113 == 0) {
								this.aClass77_Sub39_Sub2_3.method22663(0.0F);
								this.aClass77_Sub39_Sub2_3.method22663(0.0F);
								this.aClass77_Sub39_Sub2_3.method22663(local155 + local38 * (float) -local755);
								this.aClass77_Sub39_Sub2_3.method22663(local161 + local42 * (float) -local755);
								this.aClass77_Sub39_Sub2_3.method22663(local750 + local46 * (float) -local755);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22663(0.0F);
								this.aClass77_Sub39_Sub2_3.method22663(1.0F);
								this.aClass77_Sub39_Sub2_3.method22663(local155 + local62 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22663(local161 + local66 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22663(local750 + local70 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22663(1.0F);
								this.aClass77_Sub39_Sub2_3.method22663(1.0F);
								this.aClass77_Sub39_Sub2_3.method22663(local155 + local38 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22663(local161 + local42 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22663(local750 + local46 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22663(1.0F);
								this.aClass77_Sub39_Sub2_3.method22663(0.0F);
								this.aClass77_Sub39_Sub2_3.method22663(local155 + local50 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22663(local161 + local54 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22663(local750 + local58 * (float) local755);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
							} else {
								arg0.aClass442_23.method29058(local711.aShort113, local755, local755, 0.0F, 0.0F, 0.0F);
								arg0.aClass442_23.method28965(arg0.aClass442_21);
								arg0.aClass442_23.method28984(1.0F, 0.0F, 0.0F, local73);
								arg0.aClass442_23.method28984(0.0F, 1.0F, 0.0F, local76);
								this.aClass77_Sub39_Sub2_3.method22663(0.0F);
								this.aClass77_Sub39_Sub2_3.method22663(0.0F);
								this.aClass77_Sub39_Sub2_3.method22663(local155 - local73[0] - local76[0]);
								this.aClass77_Sub39_Sub2_3.method22663(local161 - local73[1] - local76[1]);
								this.aClass77_Sub39_Sub2_3.method22663(local750 - local73[2] - local76[2]);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22663(0.0F);
								this.aClass77_Sub39_Sub2_3.method22663(1.0F);
								this.aClass77_Sub39_Sub2_3.method22663(local155 - local73[0] + local76[0]);
								this.aClass77_Sub39_Sub2_3.method22663(local161 - local73[1] + local76[1]);
								this.aClass77_Sub39_Sub2_3.method22663(local750 - local73[2] + local76[2]);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22663(1.0F);
								this.aClass77_Sub39_Sub2_3.method22663(1.0F);
								this.aClass77_Sub39_Sub2_3.method22663(local155 + local73[0] + local76[0]);
								this.aClass77_Sub39_Sub2_3.method22663(local161 + local73[1] + local76[1]);
								this.aClass77_Sub39_Sub2_3.method22663(local750 + local73[2] + local76[2]);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
								this.aClass77_Sub39_Sub2_3.method22663(1.0F);
								this.aClass77_Sub39_Sub2_3.method22663(0.0F);
								this.aClass77_Sub39_Sub2_3.method22663(local155 + local73[0] - local76[0]);
								this.aClass77_Sub39_Sub2_3.method22663(local161 + local73[1] - local76[1]);
								this.aClass77_Sub39_Sub2_3.method22663(local750 + local73[2] - local76[2]);
								this.aClass77_Sub39_Sub2_3.method22403(local135);
								this.aClass77_Sub39_Sub2_3.method22403(local138);
								this.aClass77_Sub39_Sub2_3.method22403(local143);
								this.aClass77_Sub39_Sub2_3.method22403(local732);
							}
						}
					}
				}
			}
		}
		if (this.aClass77_Sub39_Sub2_3.anInt3089 * 31645619 != 0) {
			this.anInterface14_7.method1785(24, this.aClass77_Sub39_Sub2_3.aByteArray53, this.aClass77_Sub39_Sub2_3.anInt3089 * 31645619);
			arg0.method6155(this.aClass172_14, null, this.aClass172_15, this.aClass172_16);
			arg0.method6159(7, 0, this.aClass77_Sub39_Sub2_3.anInt3089 * 31645619 / 24);
		}
	}

	@OriginalMember(owner = "client!cg", name = "i", descriptor = "(Lclient!aeq;)V", line = 530)
	void method24644(@OriginalArg(0) Class86_Sub3 arg0) {
		aFloat246 = arg0.aFloat68;
		arg0.method6178();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method6241(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!cg", name = "l", descriptor = "(Lclient!aeq;)V", line = 530)
	void method24645(@OriginalArg(0) Class86_Sub3 arg0) {
		aFloat246 = arg0.aFloat68;
		arg0.method6178();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method6241(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!cg", name = "j", descriptor = "(Lclient!aeq;)V", line = 530)
	void method24646(@OriginalArg(0) Class86_Sub3 arg0) {
		aFloat246 = arg0.aFloat68;
		arg0.method6178();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method6241(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "(Lclient!aeq;)V", line = 539)
	void method24647(@OriginalArg(0) Class86_Sub3 arg0) {
		arg0.method6241(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat68 != aFloat246) {
			arg0.method20255(aFloat246);
		}
	}

	@OriginalMember(owner = "client!cg", name = "k", descriptor = "(Lclient!aeq;)V", line = 539)
	void method24648(@OriginalArg(0) Class86_Sub3 arg0) {
		arg0.method6241(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat68 != aFloat246) {
			arg0.method20255(aFloat246);
		}
	}

	@OriginalMember(owner = "client!cg", name = "u", descriptor = "(Lclient!aeq;)V", line = 539)
	void method24649(@OriginalArg(0) Class86_Sub3 arg0) {
		arg0.method6241(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat68 != aFloat246) {
			arg0.method20255(aFloat246);
		}
	}

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "(Lclient!aeq;)V", line = 539)
	void method24650(@OriginalArg(0) Class86_Sub3 arg0) {
		arg0.method6241(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat68 != aFloat246) {
			arg0.method20255(aFloat246);
		}
	}

	@OriginalMember(owner = "client!cg", name = "y", descriptor = "(Lclient!aeq;)V", line = 539)
	void method24651(@OriginalArg(0) Class86_Sub3 arg0) {
		arg0.method6241(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat68 != aFloat246) {
			arg0.method20255(aFloat246);
		}
	}
}
