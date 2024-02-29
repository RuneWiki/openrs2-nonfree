package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public class Class185 {

	@OriginalMember(owner = "client!cc", name = "x", descriptor = "[[Lclient!by;")
	Class182[][] aClass182ArrayArray1;

	@OriginalMember(owner = "client!cc", name = "p", descriptor = "Lclient!aeq;")
	final Class86_Sub3 aClass86_Sub3_44;

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "Lclient!aeg;")
	final Class88_Sub1 aClass88_Sub1_3;

	@OriginalMember(owner = "client!cc", name = "v", descriptor = "I")
	final int anInt3328;

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
	final int anInt3327;

	@OriginalMember(owner = "client!cc", name = "y", descriptor = "[B")
	final byte[] aByteArray58;

	@OriginalMember(owner = "client!cc", name = "q", descriptor = "I")
	final int anInt3330;

	@OriginalMember(owner = "client!cc", name = "w", descriptor = "I")
	final int anInt3329;

	@OriginalMember(owner = "client!cc", name = "t", descriptor = "I")
	final int anInt3326;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lclient!aeq;Lclient!aeg;)V", line = 19)
	Class185(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) Class88_Sub1 arg1) {
		this.aClass86_Sub3_44 = arg0;
		this.aClass88_Sub1_3 = arg1;
		this.anInt3328 = (this.aClass88_Sub1_3.anInt607 * -1924295585 * this.aClass88_Sub1_3.anInt608 * 127780559 >> this.aClass86_Sub3_44.anInt677) + 2;
		this.anInt3327 = (this.aClass88_Sub1_3.anInt606 * -1466328823 * this.aClass88_Sub1_3.anInt608 * 127780559 >> this.aClass86_Sub3_44.anInt677) + 2;
		this.aByteArray58 = new byte[this.anInt3328 * this.anInt3327];
		this.anInt3330 = this.aClass86_Sub3_44.anInt677 + 7 - this.aClass88_Sub1_3.anInt609 * -1495101509;
		this.anInt3329 = this.aClass88_Sub1_3.anInt607 * -1924295585 >> this.anInt3330;
		this.anInt3326 = this.aClass88_Sub1_3.anInt606 * -1466328823 >> this.anInt3330;
	}

	@OriginalMember(owner = "client!cc", name = "p", descriptor = "()V", line = 31)
	void method24601() {
		this.aClass182ArrayArray1 = new Class182[this.anInt3329][this.anInt3326];
		for (@Pc(8) int local8 = 0; local8 < this.anInt3326; local8++) {
			for (@Pc(14) int local14 = 0; local14 < this.anInt3329; local14++) {
				this.aClass182ArrayArray1[local14][local8] = new Class182(this.aClass86_Sub3_44, this, this.aClass88_Sub1_3, local14, local8, this.anInt3330, local14 * 128 + 1, local8 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "()V", line = 31)
	void method24602() {
		this.aClass182ArrayArray1 = new Class182[this.anInt3329][this.anInt3326];
		for (@Pc(8) int local8 = 0; local8 < this.anInt3326; local8++) {
			for (@Pc(14) int local14 = 0; local14 < this.anInt3329; local14++) {
				this.aClass182ArrayArray1[local14][local8] = new Class182(this.aClass86_Sub3_44, this, this.aClass88_Sub1_3, local14, local8, this.anInt3330, local14 * 128 + 1, local8 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "s", descriptor = "()V", line = 31)
	void method24603() {
		this.aClass182ArrayArray1 = new Class182[this.anInt3329][this.anInt3326];
		for (@Pc(8) int local8 = 0; local8 < this.anInt3326; local8++) {
			for (@Pc(14) int local14 = 0; local14 < this.anInt3329; local14++) {
				this.aClass182ArrayArray1[local14][local8] = new Class182(this.aClass86_Sub3_44, this, this.aClass88_Sub1_3, local14, local8, this.anInt3330, local14 * 128 + 1, local8 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "r", descriptor = "()V", line = 31)
	void method24604() {
		this.aClass182ArrayArray1 = new Class182[this.anInt3329][this.anInt3326];
		for (@Pc(8) int local8 = 0; local8 < this.anInt3326; local8++) {
			for (@Pc(14) int local14 = 0; local14 < this.anInt3329; local14++) {
				this.aClass182ArrayArray1[local14][local8] = new Class182(this.aClass86_Sub3_44, this, this.aClass88_Sub1_3, local14, local8, this.anInt3330, local14 * 128 + 1, local8 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "z", descriptor = "()V", line = 31)
	void method24605() {
		this.aClass182ArrayArray1 = new Class182[this.anInt3329][this.anInt3326];
		for (@Pc(8) int local8 = 0; local8 < this.anInt3326; local8++) {
			for (@Pc(14) int local14 = 0; local14 < this.anInt3329; local14++) {
				this.aClass182ArrayArray1[local14][local8] = new Class182(this.aClass86_Sub3_44, this, this.aClass88_Sub1_3, local14, local8, this.anInt3330, local14 * 128 + 1, local8 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "()V", line = 31)
	void method24606() {
		this.aClass182ArrayArray1 = new Class182[this.anInt3329][this.anInt3326];
		for (@Pc(8) int local8 = 0; local8 < this.anInt3326; local8++) {
			for (@Pc(14) int local14 = 0; local14 < this.anInt3329; local14++) {
				this.aClass182ArrayArray1[local14][local8] = new Class182(this.aClass86_Sub3_44, this, this.aClass88_Sub1_3, local14, local8, this.anInt3330, local14 * 128 + 1, local8 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "()V", line = 31)
	void method24607() {
		this.aClass182ArrayArray1 = new Class182[this.anInt3329][this.anInt3326];
		for (@Pc(8) int local8 = 0; local8 < this.anInt3326; local8++) {
			for (@Pc(14) int local14 = 0; local14 < this.anInt3329; local14++) {
				this.aClass182ArrayArray1[local14][local8] = new Class182(this.aClass86_Sub3_44, this, this.aClass88_Sub1_3, local14, local8, this.anInt3330, local14 * 128 + 1, local8 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "(III[[ZZ)V", line = 40)
	void method24608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.aClass86_Sub3_44.method6233(false);
		this.aClass86_Sub3_44.method6241(false);
		this.aClass86_Sub3_44.method6180(-2);
		this.aClass86_Sub3_44.method6198(1);
		this.aClass86_Sub3_44.method6250(1);
		@Pc(28) float local28 = 1.0F / (float) (this.aClass86_Sub3_44.anInt699 * 128);
		@Pc(32) int local32;
		@Pc(41) int local41;
		@Pc(48) int local48;
		@Pc(50) int local50;
		@Pc(59) int local59;
		@Pc(66) int local66;
		@Pc(68) int local68;
		if (arg4) {
			for (local32 = 0; local32 < this.anInt3326; local32++) {
				local41 = local32 << this.anInt3330;
				local48 = local32 + 1 << this.anInt3330;
				label128: for (local50 = 0; local50 < this.anInt3329; local50++) {
					local59 = local50 << this.anInt3330;
					local66 = local50 + 1 << this.anInt3330;
					for (local68 = local59; local68 < local66; local68++) {
						if (local68 - arg0 >= -arg2 && local68 - arg0 <= arg2) {
							for (@Pc(84) int local84 = local41; local84 < local48; local84++) {
								if (local84 - arg1 >= -arg2 && local84 - arg1 <= arg2 && arg3[local68 - arg0 + arg2][local84 - arg1 + arg2]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local28, local28, 1.0F);
									OpenGL.glTranslatef((float) -local50 / local28, (float) -local32 / local28, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass182ArrayArray1[local50][local32].method24572();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local32 = 0; local32 < this.anInt3326; local32++) {
				local41 = local32 << this.anInt3330;
				local48 = local32 + 1 << this.anInt3330;
				for (local50 = 0; local50 < this.anInt3329; local50++) {
					local59 = 0;
					local66 = local50 << this.anInt3330;
					local68 = local50 + 1 << this.anInt3330;
					@Pc(192) Class77_Sub39_Sub2 local192 = this.aClass86_Sub3_44.aClass77_Sub39_Sub2_1;
					local192.anInt3089 = 0;
					for (@Pc(197) int local197 = local41; local197 < local48; local197++) {
						if (local197 - arg1 >= -arg2 && local197 - arg1 <= arg2) {
							@Pc(221) int local221 = local197 * this.aClass88_Sub1_3.anInt607 * -1924295585 + local66;
							for (@Pc(223) int local223 = local66; local223 < local68; local223++) {
								if (local223 - arg0 >= -arg2 && local223 - arg0 <= arg2 && arg3[local223 - arg0 + arg2][local197 - arg1 + arg2]) {
									@Pc(257) short[] local257 = this.aClass88_Sub1_3.aShortArrayArray1[local221];
									if (local257 != null) {
										@Pc(265) int local265;
										if (this.aClass86_Sub3_44.aBoolean116) {
											for (local265 = 0; local265 < local257.length; local265++) {
												local192.method22408(local257[local265] & 0xFFFF);
												local59++;
											}
										} else {
											for (local265 = 0; local265 < local257.length; local265++) {
												local192.method22412(local257[local265] & 0xFFFF);
												local59++;
											}
										}
									}
								}
								local221++;
							}
						}
					}
					if (local59 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local28, local28, 1.0F);
						OpenGL.glTranslatef((float) -local50 / local28, (float) -local32 / local28, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass182ArrayArray1[local50][local32].method24576(local192.aByteArray53, local59);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(III[[ZZ)V", line = 40)
	void method24609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.aClass86_Sub3_44.method6233(false);
		this.aClass86_Sub3_44.method6241(false);
		this.aClass86_Sub3_44.method6180(-2);
		this.aClass86_Sub3_44.method6198(1);
		this.aClass86_Sub3_44.method6250(1);
		@Pc(28) float local28 = 1.0F / (float) (this.aClass86_Sub3_44.anInt699 * 128);
		@Pc(32) int local32;
		@Pc(41) int local41;
		@Pc(48) int local48;
		@Pc(50) int local50;
		@Pc(59) int local59;
		@Pc(66) int local66;
		@Pc(68) int local68;
		if (arg4) {
			for (local32 = 0; local32 < this.anInt3326; local32++) {
				local41 = local32 << this.anInt3330;
				local48 = local32 + 1 << this.anInt3330;
				label128: for (local50 = 0; local50 < this.anInt3329; local50++) {
					local59 = local50 << this.anInt3330;
					local66 = local50 + 1 << this.anInt3330;
					for (local68 = local59; local68 < local66; local68++) {
						if (local68 - arg0 >= -arg2 && local68 - arg0 <= arg2) {
							for (@Pc(84) int local84 = local41; local84 < local48; local84++) {
								if (local84 - arg1 >= -arg2 && local84 - arg1 <= arg2 && arg3[local68 - arg0 + arg2][local84 - arg1 + arg2]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local28, local28, 1.0F);
									OpenGL.glTranslatef((float) -local50 / local28, (float) -local32 / local28, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass182ArrayArray1[local50][local32].method24572();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local32 = 0; local32 < this.anInt3326; local32++) {
				local41 = local32 << this.anInt3330;
				local48 = local32 + 1 << this.anInt3330;
				for (local50 = 0; local50 < this.anInt3329; local50++) {
					local59 = 0;
					local66 = local50 << this.anInt3330;
					local68 = local50 + 1 << this.anInt3330;
					@Pc(192) Class77_Sub39_Sub2 local192 = this.aClass86_Sub3_44.aClass77_Sub39_Sub2_1;
					local192.anInt3089 = 0;
					for (@Pc(197) int local197 = local41; local197 < local48; local197++) {
						if (local197 - arg1 >= -arg2 && local197 - arg1 <= arg2) {
							@Pc(221) int local221 = local197 * this.aClass88_Sub1_3.anInt607 * -1924295585 + local66;
							for (@Pc(223) int local223 = local66; local223 < local68; local223++) {
								if (local223 - arg0 >= -arg2 && local223 - arg0 <= arg2 && arg3[local223 - arg0 + arg2][local197 - arg1 + arg2]) {
									@Pc(257) short[] local257 = this.aClass88_Sub1_3.aShortArrayArray1[local221];
									if (local257 != null) {
										@Pc(265) int local265;
										if (this.aClass86_Sub3_44.aBoolean116) {
											for (local265 = 0; local265 < local257.length; local265++) {
												local192.method22408(local257[local265] & 0xFFFF);
												local59++;
											}
										} else {
											for (local265 = 0; local265 < local257.length; local265++) {
												local192.method22412(local257[local265] & 0xFFFF);
												local59++;
											}
										}
									}
								}
								local221++;
							}
						}
					}
					if (local59 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local28, local28, 1.0F);
						OpenGL.glTranslatef((float) -local50 / local28, (float) -local32 / local28, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass182ArrayArray1[local50][local32].method24576(local192.aByteArray53, local59);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!cc", name = "k", descriptor = "(III[[ZZ)V", line = 40)
	void method24610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.aClass86_Sub3_44.method6233(false);
		this.aClass86_Sub3_44.method6241(false);
		this.aClass86_Sub3_44.method6180(-2);
		this.aClass86_Sub3_44.method6198(1);
		this.aClass86_Sub3_44.method6250(1);
		@Pc(28) float local28 = 1.0F / (float) (this.aClass86_Sub3_44.anInt699 * 128);
		@Pc(32) int local32;
		@Pc(41) int local41;
		@Pc(48) int local48;
		@Pc(50) int local50;
		@Pc(59) int local59;
		@Pc(66) int local66;
		@Pc(68) int local68;
		if (arg4) {
			for (local32 = 0; local32 < this.anInt3326; local32++) {
				local41 = local32 << this.anInt3330;
				local48 = local32 + 1 << this.anInt3330;
				label128: for (local50 = 0; local50 < this.anInt3329; local50++) {
					local59 = local50 << this.anInt3330;
					local66 = local50 + 1 << this.anInt3330;
					for (local68 = local59; local68 < local66; local68++) {
						if (local68 - arg0 >= -arg2 && local68 - arg0 <= arg2) {
							for (@Pc(84) int local84 = local41; local84 < local48; local84++) {
								if (local84 - arg1 >= -arg2 && local84 - arg1 <= arg2 && arg3[local68 - arg0 + arg2][local84 - arg1 + arg2]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local28, local28, 1.0F);
									OpenGL.glTranslatef((float) -local50 / local28, (float) -local32 / local28, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass182ArrayArray1[local50][local32].method24572();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local32 = 0; local32 < this.anInt3326; local32++) {
				local41 = local32 << this.anInt3330;
				local48 = local32 + 1 << this.anInt3330;
				for (local50 = 0; local50 < this.anInt3329; local50++) {
					local59 = 0;
					local66 = local50 << this.anInt3330;
					local68 = local50 + 1 << this.anInt3330;
					@Pc(192) Class77_Sub39_Sub2 local192 = this.aClass86_Sub3_44.aClass77_Sub39_Sub2_1;
					local192.anInt3089 = 0;
					for (@Pc(197) int local197 = local41; local197 < local48; local197++) {
						if (local197 - arg1 >= -arg2 && local197 - arg1 <= arg2) {
							@Pc(221) int local221 = local197 * this.aClass88_Sub1_3.anInt607 * -1924295585 + local66;
							for (@Pc(223) int local223 = local66; local223 < local68; local223++) {
								if (local223 - arg0 >= -arg2 && local223 - arg0 <= arg2 && arg3[local223 - arg0 + arg2][local197 - arg1 + arg2]) {
									@Pc(257) short[] local257 = this.aClass88_Sub1_3.aShortArrayArray1[local221];
									if (local257 != null) {
										@Pc(265) int local265;
										if (this.aClass86_Sub3_44.aBoolean116) {
											for (local265 = 0; local265 < local257.length; local265++) {
												local192.method22408(local257[local265] & 0xFFFF);
												local59++;
											}
										} else {
											for (local265 = 0; local265 < local257.length; local265++) {
												local192.method22412(local257[local265] & 0xFFFF);
												local59++;
											}
										}
									}
								}
								local221++;
							}
						}
					}
					if (local59 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local28, local28, 1.0F);
						OpenGL.glTranslatef((float) -local50 / local28, (float) -local32 / local28, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass182ArrayArray1[local50][local32].method24576(local192.aByteArray53, local59);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!cc", name = "v", descriptor = "(Lclient!arp;II)V", line = 123)
	void method24611(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class77_Sub1_Sub16_Sub1 local2 = (Class77_Sub1_Sub16_Sub1) arg0;
		arg1 += local2.anInt3123 + 1;
		arg2 += local2.anInt3122 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt3328;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt3124;
		@Pc(31) int local31 = local2.anInt3120;
		@Pc(36) int local36 = this.anInt3328 - local31;
		@Pc(38) int local38 = 0;
		@Pc(44) int local44;
		if (arg2 <= 0) {
			local44 = 1 - arg2;
			local28 -= local44;
			local25 += local44 * local31;
			local23 += local44 * this.anInt3328;
			arg2 = 1;
		}
		if (arg2 + local28 >= this.anInt3327) {
			local44 = arg2 + local28 + 1 - this.anInt3327;
			local28 -= local44;
		}
		if (arg1 <= 0) {
			local44 = 1 - arg1;
			local31 -= local44;
			local25 += local44;
			local23 += local44;
			local38 += local44;
			local36 += local44;
			arg1 = 1;
		}
		if (arg1 + local31 >= this.anInt3328) {
			local44 = arg1 + local31 + 1 - this.anInt3328;
			local31 -= local44;
			local38 += local44;
			local36 += local44;
		}
		if (local31 > 0 && local28 > 0) {
			method24619(this.aByteArray58, local2.aByteArray54, local25, local23, local31, local28, local36, local38);
			this.method24616(arg1, arg2, local31, local28);
		}
	}

	@OriginalMember(owner = "client!cc", name = "u", descriptor = "(Lclient!arp;II)V", line = 123)
	void method24612(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class77_Sub1_Sub16_Sub1 local2 = (Class77_Sub1_Sub16_Sub1) arg0;
		arg1 += local2.anInt3123 + 1;
		arg2 += local2.anInt3122 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt3328;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt3124;
		@Pc(31) int local31 = local2.anInt3120;
		@Pc(36) int local36 = this.anInt3328 - local31;
		@Pc(38) int local38 = 0;
		@Pc(44) int local44;
		if (arg2 <= 0) {
			local44 = 1 - arg2;
			local28 -= local44;
			local25 += local44 * local31;
			local23 += local44 * this.anInt3328;
			arg2 = 1;
		}
		if (arg2 + local28 >= this.anInt3327) {
			local44 = arg2 + local28 + 1 - this.anInt3327;
			local28 -= local44;
		}
		if (arg1 <= 0) {
			local44 = 1 - arg1;
			local31 -= local44;
			local25 += local44;
			local23 += local44;
			local38 += local44;
			local36 += local44;
			arg1 = 1;
		}
		if (arg1 + local31 >= this.anInt3328) {
			local44 = arg1 + local31 + 1 - this.anInt3328;
			local31 -= local44;
			local38 += local44;
			local36 += local44;
		}
		if (local31 > 0 && local28 > 0) {
			method24619(this.aByteArray58, local2.aByteArray54, local25, local23, local31, local28, local36, local38);
			this.method24616(arg1, arg2, local31, local28);
		}
	}

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "(Lclient!arp;II)V", line = 164)
	void method24613(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class77_Sub1_Sub16_Sub1 local2 = (Class77_Sub1_Sub16_Sub1) arg0;
		arg1 += local2.anInt3123 + 1;
		arg2 += local2.anInt3122 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt3328;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt3124;
		@Pc(31) int local31 = local2.anInt3120;
		@Pc(36) int local36 = this.anInt3328 - local31;
		@Pc(38) int local38 = 0;
		@Pc(44) int local44;
		if (arg2 <= 0) {
			local44 = 1 - arg2;
			local28 -= local44;
			local25 += local44 * local31;
			local23 += local44 * this.anInt3328;
			arg2 = 1;
		}
		if (arg2 + local28 >= this.anInt3327) {
			local44 = arg2 + local28 + 1 - this.anInt3327;
			local28 -= local44;
		}
		if (arg1 <= 0) {
			local44 = 1 - arg1;
			local31 -= local44;
			local25 += local44;
			local23 += local44;
			local38 += local44;
			local36 += local44;
			arg1 = 1;
		}
		if (arg1 + local31 >= this.anInt3328) {
			local44 = arg1 + local31 + 1 - this.anInt3328;
			local31 -= local44;
			local38 += local44;
			local36 += local44;
		}
		if (local31 > 0 && local28 > 0) {
			method24620(this.aByteArray58, local2.aByteArray54, local25, local23, local31, local28, local36, local38);
			this.method24616(arg1, arg2, local31, local28);
		}
	}

	@OriginalMember(owner = "client!cc", name = "y", descriptor = "(Lclient!arp;II)Z", line = 205)
	boolean method24614(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class77_Sub1_Sub16_Sub1 local2 = (Class77_Sub1_Sub16_Sub1) arg0;
		arg1 += local2.anInt3123 + 1;
		arg2 += local2.anInt3122 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt3328;
		@Pc(26) int local26 = local2.anInt3124;
		@Pc(29) int local29 = local2.anInt3120;
		@Pc(34) int local34 = this.anInt3328 - local29;
		@Pc(40) int local40;
		if (arg2 <= 0) {
			local40 = 1 - arg2;
			local26 -= local40;
			local23 += local40 * this.anInt3328;
			arg2 = 1;
		}
		if (arg2 + local26 >= this.anInt3327) {
			local40 = arg2 + local26 + 1 - this.anInt3327;
			local26 -= local40;
		}
		if (arg1 <= 0) {
			local40 = 1 - arg1;
			local29 -= local40;
			local23 += local40;
			local34 += local40;
			arg1 = 1;
		}
		if (arg1 + local29 >= this.anInt3328) {
			local40 = arg1 + local29 + 1 - this.anInt3328;
			local29 -= local40;
			local34 += local40;
		}
		if (local29 > 0 && local26 > 0) {
			@Pc(123) byte local123 = 8;
			local34 += (local123 - 1) * this.anInt3328;
			return method24623(this.aByteArray58, local23, local29, local26, local34, local123);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "(IIII)V", line = 241)
	void method24615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass182ArrayArray1 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 - 1 >> 7;
		@Pc(19) int local19 = arg0 - 1 + arg2 - 1 >> 7;
		@Pc(25) int local25 = arg1 - 1 >> 7;
		@Pc(35) int local35 = arg1 - 1 + arg3 - 1 >> 7;
		for (@Pc(37) int local37 = local9; local37 <= local19; local37++) {
			@Pc(45) Class182[] local45 = this.aClass182ArrayArray1[local37];
			for (@Pc(47) int local47 = local25; local47 <= local35; local47++) {
				local45[local47].aBoolean565 = true;
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "w", descriptor = "(IIII)V", line = 241)
	void method24616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass182ArrayArray1 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 - 1 >> 7;
		@Pc(19) int local19 = arg0 - 1 + arg2 - 1 >> 7;
		@Pc(25) int local25 = arg1 - 1 >> 7;
		@Pc(35) int local35 = arg1 - 1 + arg3 - 1 >> 7;
		for (@Pc(37) int local37 = local9; local37 <= local19; local37++) {
			@Pc(45) Class182[] local45 = this.aClass182ArrayArray1[local37];
			for (@Pc(47) int local47 = local25; local47 <= local35; local47++) {
				local45[local47].aBoolean565 = true;
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "(IIII)V", line = 241)
	void method24617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass182ArrayArray1 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 - 1 >> 7;
		@Pc(19) int local19 = arg0 - 1 + arg2 - 1 >> 7;
		@Pc(25) int local25 = arg1 - 1 >> 7;
		@Pc(35) int local35 = arg1 - 1 + arg3 - 1 >> 7;
		for (@Pc(37) int local37 = local9; local37 <= local19; local37++) {
			@Pc(45) Class182[] local45 = this.aClass182ArrayArray1[local37];
			for (@Pc(47) int local47 = local25; local47 <= local35; local47++) {
				local45[local47].aBoolean565 = true;
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "o", descriptor = "(IIII)V", line = 241)
	void method24618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass182ArrayArray1 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 - 1 >> 7;
		@Pc(19) int local19 = arg0 - 1 + arg2 - 1 >> 7;
		@Pc(25) int local25 = arg1 - 1 >> 7;
		@Pc(35) int local35 = arg1 - 1 + arg3 - 1 >> 7;
		for (@Pc(37) int local37 = local9; local37 <= local19; local37++) {
			@Pc(45) Class182[] local45 = this.aClass182ArrayArray1[local37];
			for (@Pc(47) int local47 = local25; local47 <= local35; local47++) {
				local45[local47].aBoolean565 = true;
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "t", descriptor = "([B[BIIIIII)V", line = 253)
	static final void method24619(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int local4 = -(arg4 >> 2);
		@Pc(9) int local9 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			@Pc(16) int local16;
			@Pc(20) int local20;
			for (local16 = local4; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] += arg1[arg2++];
				@Pc(32) int local32 = arg3++;
				arg0[local32] += arg1[arg2++];
				@Pc(44) int local44 = arg3++;
				arg0[local44] += arg1[arg2++];
				@Pc(56) int local56 = arg3++;
				arg0[local56] += arg1[arg2++];
			}
			for (local16 = local9; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] += arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!cc", name = "q", descriptor = "([B[BIIIIII)V", line = 271)
	static final void method24620(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int local4 = -(arg4 >> 2);
		@Pc(9) int local9 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			@Pc(16) int local16;
			@Pc(20) int local20;
			for (local16 = local4; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] -= arg1[arg2++];
				@Pc(32) int local32 = arg3++;
				arg0[local32] -= arg1[arg2++];
				@Pc(44) int local44 = arg3++;
				arg0[local44] -= arg1[arg2++];
				@Pc(56) int local56 = arg3++;
				arg0[local56] -= arg1[arg2++];
			}
			for (local16 = local9; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] -= arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "([B[BIIIIII)V", line = 271)
	static final void method24621(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int local4 = -(arg4 >> 2);
		@Pc(9) int local9 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			@Pc(16) int local16;
			@Pc(20) int local20;
			for (local16 = local4; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] -= arg1[arg2++];
				@Pc(32) int local32 = arg3++;
				arg0[local32] -= arg1[arg2++];
				@Pc(44) int local44 = arg3++;
				arg0[local44] -= arg1[arg2++];
				@Pc(56) int local56 = arg3++;
				arg0[local56] -= arg1[arg2++];
			}
			for (local16 = local9; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] -= arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!cc", name = "n", descriptor = "([B[BIIIIII)V", line = 271)
	static final void method24622(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int local4 = -(arg4 >> 2);
		@Pc(9) int local9 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			@Pc(16) int local16;
			@Pc(20) int local20;
			for (local16 = local4; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] -= arg1[arg2++];
				@Pc(32) int local32 = arg3++;
				arg0[local32] -= arg1[arg2++];
				@Pc(44) int local44 = arg3++;
				arg0[local44] -= arg1[arg2++];
				@Pc(56) int local56 = arg3++;
				arg0[local56] -= arg1[arg2++];
			}
			for (local16 = local9; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] -= arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!cc", name = "x", descriptor = "([BIIIII)Z", line = 289)
	static final boolean method24623(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg2 % arg5;
		@Pc(9) int local9;
		if (local3 == 0) {
			local9 = 0;
		} else {
			local9 = arg5 - local3;
		}
		@Pc(21) int local21 = -((arg3 + arg5 - 1) / arg5);
		@Pc(30) int local30 = -((arg2 + arg5 - 1) / arg5);
		for (@Pc(32) int local32 = local21; local32 < 0; local32++) {
			for (@Pc(36) int local36 = local30; local36 < 0; local36++) {
				if (arg0[arg1] == 0) {
					return true;
				}
				arg1 += arg5;
			}
			arg1 -= local9;
			if (arg0[arg1 - 1] == 0) {
				return true;
			}
			arg1 += arg4;
		}
		return false;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "([BIIIII)Z", line = 289)
	static final boolean method24624(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg2 % arg5;
		@Pc(9) int local9;
		if (local3 == 0) {
			local9 = 0;
		} else {
			local9 = arg5 - local3;
		}
		@Pc(21) int local21 = -((arg3 + arg5 - 1) / arg5);
		@Pc(30) int local30 = -((arg2 + arg5 - 1) / arg5);
		for (@Pc(32) int local32 = local21; local32 < 0; local32++) {
			for (@Pc(36) int local36 = local30; local36 < 0; local36++) {
				if (arg0[arg1] == 0) {
					return true;
				}
				arg1 += arg5;
			}
			arg1 -= local9;
			if (arg0[arg1 - 1] == 0) {
				return true;
			}
			arg1 += arg4;
		}
		return false;
	}

	@OriginalMember(owner = "client!cc", name = "m", descriptor = "([BIIIII)Z", line = 289)
	static final boolean method24625(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg2 % arg5;
		@Pc(9) int local9;
		if (local3 == 0) {
			local9 = 0;
		} else {
			local9 = arg5 - local3;
		}
		@Pc(21) int local21 = -((arg3 + arg5 - 1) / arg5);
		@Pc(30) int local30 = -((arg2 + arg5 - 1) / arg5);
		for (@Pc(32) int local32 = local21; local32 < 0; local32++) {
			for (@Pc(36) int local36 = local30; local36 < 0; local36++) {
				if (arg0[arg1] == 0) {
					return true;
				}
				arg1 += arg5;
			}
			arg1 -= local9;
			if (arg0[arg1 - 1] == 0) {
				return true;
			}
			arg1 += arg4;
		}
		return false;
	}
}
