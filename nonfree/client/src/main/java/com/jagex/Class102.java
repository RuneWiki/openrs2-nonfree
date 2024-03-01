package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bv")
public class Class102 {

	@OriginalMember(owner = "client!bv", name = "y", descriptor = "[[Lclient!bm;")
	Class95[][] aClass95ArrayArray1;

	@OriginalMember(owner = "client!bv", name = "p", descriptor = "Lclient!abt;")
	final Class21_Sub2 aClass21_Sub2_42;

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "Lclient!abh;")
	final Class17_Sub1 aClass17_Sub1_3;

	@OriginalMember(owner = "client!bv", name = "g", descriptor = "I")
	final int anInt2968;

	@OriginalMember(owner = "client!bv", name = "l", descriptor = "I")
	final int anInt2969;

	@OriginalMember(owner = "client!bv", name = "h", descriptor = "[B")
	final byte[] aByteArray56;

	@OriginalMember(owner = "client!bv", name = "u", descriptor = "I")
	final int anInt2971;

	@OriginalMember(owner = "client!bv", name = "x", descriptor = "I")
	final int anInt2967;

	@OriginalMember(owner = "client!bv", name = "s", descriptor = "I")
	final int anInt2970;

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(Lclient!abt;Lclient!abh;)V", line = 19)
	Class102(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) Class17_Sub1 arg1) {
		this.aClass21_Sub2_42 = arg0;
		this.aClass17_Sub1_3 = arg1;
		this.anInt2968 = (this.aClass17_Sub1_3.anInt339 * -1007974723 * this.aClass17_Sub1_3.anInt338 * 76934957 >> this.aClass21_Sub2_42.anInt408) + 2;
		this.anInt2969 = (this.aClass17_Sub1_3.anInt337 * -207323189 * this.aClass17_Sub1_3.anInt338 * 76934957 >> this.aClass21_Sub2_42.anInt408) + 2;
		this.aByteArray56 = new byte[this.anInt2968 * this.anInt2969];
		this.anInt2971 = this.aClass21_Sub2_42.anInt408 + 7 - this.aClass17_Sub1_3.anInt336 * 1371852633;
		this.anInt2967 = this.aClass17_Sub1_3.anInt339 * -1007974723 >> this.anInt2971;
		this.anInt2970 = this.aClass17_Sub1_3.anInt337 * -207323189 >> this.anInt2971;
	}

	@OriginalMember(owner = "client!bv", name = "p", descriptor = "()V", line = 31)
	void method21838() {
		this.aClass95ArrayArray1 = new Class95[this.anInt2967][this.anInt2970];
		for (@Pc(8) int local8 = 0; local8 < this.anInt2970; local8++) {
			for (@Pc(14) int local14 = 0; local14 < this.anInt2967; local14++) {
				this.aClass95ArrayArray1[local14][local8] = new Class95(this.aClass21_Sub2_42, this, this.aClass17_Sub1_3, local14, local8, this.anInt2971, local14 * 128 + 1, local8 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "()V", line = 31)
	void method21854() {
		this.aClass95ArrayArray1 = new Class95[this.anInt2967][this.anInt2970];
		for (@Pc(8) int local8 = 0; local8 < this.anInt2970; local8++) {
			for (@Pc(14) int local14 = 0; local14 < this.anInt2967; local14++) {
				this.aClass95ArrayArray1[local14][local8] = new Class95(this.aClass21_Sub2_42, this, this.aClass17_Sub1_3, local14, local8, this.anInt2971, local14 * 128 + 1, local8 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(III[[ZZ)V", line = 40)
	void method21843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.aClass21_Sub2_42.method4084(false);
		this.aClass21_Sub2_42.method4087(false);
		this.aClass21_Sub2_42.method4070(-2);
		this.aClass21_Sub2_42.method4115(1);
		this.aClass21_Sub2_42.method4089(1);
		@Pc(28) float local28 = 1.0F / (float) (this.aClass21_Sub2_42.anInt407 * 128);
		@Pc(32) int local32;
		@Pc(41) int local41;
		@Pc(48) int local48;
		@Pc(50) int local50;
		@Pc(59) int local59;
		@Pc(66) int local66;
		@Pc(68) int local68;
		if (arg4) {
			for (local32 = 0; local32 < this.anInt2970; local32++) {
				local41 = local32 << this.anInt2971;
				local48 = local32 + 1 << this.anInt2971;
				label128: for (local50 = 0; local50 < this.anInt2967; local50++) {
					local59 = local50 << this.anInt2971;
					local66 = local50 + 1 << this.anInt2971;
					for (local68 = local59; local68 < local66; local68++) {
						if (local68 - arg0 >= -arg2 && local68 - arg0 <= arg2) {
							for (@Pc(84) int local84 = local41; local84 < local48; local84++) {
								if (local84 - arg1 >= -arg2 && local84 - arg1 <= arg2 && arg3[local68 - arg0 + arg2][local84 - arg1 + arg2]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local28, local28, 1.0F);
									OpenGL.glTranslatef((float) -local50 / local28, (float) -local32 / local28, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass95ArrayArray1[local50][local32].method21791();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local32 = 0; local32 < this.anInt2970; local32++) {
				local41 = local32 << this.anInt2971;
				local48 = local32 + 1 << this.anInt2971;
				for (local50 = 0; local50 < this.anInt2967; local50++) {
					local59 = 0;
					local66 = local50 << this.anInt2971;
					local68 = local50 + 1 << this.anInt2971;
					@Pc(192) Class3_Sub41_Sub2 local192 = this.aClass21_Sub2_42.aClass3_Sub41_Sub2_1;
					local192.anInt2803 = 0;
					for (@Pc(197) int local197 = local41; local197 < local48; local197++) {
						if (local197 - arg1 >= -arg2 && local197 - arg1 <= arg2) {
							@Pc(221) int local221 = local197 * this.aClass17_Sub1_3.anInt339 * -1007974723 + local66;
							for (@Pc(223) int local223 = local66; local223 < local68; local223++) {
								if (local223 - arg0 >= -arg2 && local223 - arg0 <= arg2 && arg3[local223 - arg0 + arg2][local197 - arg1 + arg2]) {
									@Pc(257) short[] local257 = this.aClass17_Sub1_3.aShortArrayArray1[local221];
									if (local257 != null) {
										@Pc(265) int local265;
										if (this.aClass21_Sub2_42.aBoolean63) {
											for (local265 = 0; local265 < local257.length; local265++) {
												local192.method20251(local257[local265] & 0xFFFF);
												local59++;
											}
										} else {
											for (local265 = 0; local265 < local257.length; local265++) {
												local192.method20442(local257[local265] & 0xFFFF);
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
						this.aClass95ArrayArray1[local50][local32].method21792(local192.aByteArray51, local59);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!bv", name = "c", descriptor = "(III[[ZZ)V", line = 40)
	void method21847(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.aClass21_Sub2_42.method4084(false);
		this.aClass21_Sub2_42.method4087(false);
		this.aClass21_Sub2_42.method4070(-2);
		this.aClass21_Sub2_42.method4115(1);
		this.aClass21_Sub2_42.method4089(1);
		@Pc(28) float local28 = 1.0F / (float) (this.aClass21_Sub2_42.anInt407 * 128);
		@Pc(32) int local32;
		@Pc(41) int local41;
		@Pc(48) int local48;
		@Pc(50) int local50;
		@Pc(59) int local59;
		@Pc(66) int local66;
		@Pc(68) int local68;
		if (arg4) {
			for (local32 = 0; local32 < this.anInt2970; local32++) {
				local41 = local32 << this.anInt2971;
				local48 = local32 + 1 << this.anInt2971;
				label128: for (local50 = 0; local50 < this.anInt2967; local50++) {
					local59 = local50 << this.anInt2971;
					local66 = local50 + 1 << this.anInt2971;
					for (local68 = local59; local68 < local66; local68++) {
						if (local68 - arg0 >= -arg2 && local68 - arg0 <= arg2) {
							for (@Pc(84) int local84 = local41; local84 < local48; local84++) {
								if (local84 - arg1 >= -arg2 && local84 - arg1 <= arg2 && arg3[local68 - arg0 + arg2][local84 - arg1 + arg2]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local28, local28, 1.0F);
									OpenGL.glTranslatef((float) -local50 / local28, (float) -local32 / local28, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass95ArrayArray1[local50][local32].method21791();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local32 = 0; local32 < this.anInt2970; local32++) {
				local41 = local32 << this.anInt2971;
				local48 = local32 + 1 << this.anInt2971;
				for (local50 = 0; local50 < this.anInt2967; local50++) {
					local59 = 0;
					local66 = local50 << this.anInt2971;
					local68 = local50 + 1 << this.anInt2971;
					@Pc(192) Class3_Sub41_Sub2 local192 = this.aClass21_Sub2_42.aClass3_Sub41_Sub2_1;
					local192.anInt2803 = 0;
					for (@Pc(197) int local197 = local41; local197 < local48; local197++) {
						if (local197 - arg1 >= -arg2 && local197 - arg1 <= arg2) {
							@Pc(221) int local221 = local197 * this.aClass17_Sub1_3.anInt339 * -1007974723 + local66;
							for (@Pc(223) int local223 = local66; local223 < local68; local223++) {
								if (local223 - arg0 >= -arg2 && local223 - arg0 <= arg2 && arg3[local223 - arg0 + arg2][local197 - arg1 + arg2]) {
									@Pc(257) short[] local257 = this.aClass17_Sub1_3.aShortArrayArray1[local221];
									if (local257 != null) {
										@Pc(265) int local265;
										if (this.aClass21_Sub2_42.aBoolean63) {
											for (local265 = 0; local265 < local257.length; local265++) {
												local192.method20251(local257[local265] & 0xFFFF);
												local59++;
											}
										} else {
											for (local265 = 0; local265 < local257.length; local265++) {
												local192.method20442(local257[local265] & 0xFFFF);
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
						this.aClass95ArrayArray1[local50][local32].method21792(local192.aByteArray51, local59);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!bv", name = "z", descriptor = "(III[[ZZ)V", line = 40)
	void method21848(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.aClass21_Sub2_42.method4084(false);
		this.aClass21_Sub2_42.method4087(false);
		this.aClass21_Sub2_42.method4070(-2);
		this.aClass21_Sub2_42.method4115(1);
		this.aClass21_Sub2_42.method4089(1);
		@Pc(28) float local28 = 1.0F / (float) (this.aClass21_Sub2_42.anInt407 * 128);
		@Pc(32) int local32;
		@Pc(41) int local41;
		@Pc(48) int local48;
		@Pc(50) int local50;
		@Pc(59) int local59;
		@Pc(66) int local66;
		@Pc(68) int local68;
		if (arg4) {
			for (local32 = 0; local32 < this.anInt2970; local32++) {
				local41 = local32 << this.anInt2971;
				local48 = local32 + 1 << this.anInt2971;
				label128: for (local50 = 0; local50 < this.anInt2967; local50++) {
					local59 = local50 << this.anInt2971;
					local66 = local50 + 1 << this.anInt2971;
					for (local68 = local59; local68 < local66; local68++) {
						if (local68 - arg0 >= -arg2 && local68 - arg0 <= arg2) {
							for (@Pc(84) int local84 = local41; local84 < local48; local84++) {
								if (local84 - arg1 >= -arg2 && local84 - arg1 <= arg2 && arg3[local68 - arg0 + arg2][local84 - arg1 + arg2]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local28, local28, 1.0F);
									OpenGL.glTranslatef((float) -local50 / local28, (float) -local32 / local28, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass95ArrayArray1[local50][local32].method21791();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local32 = 0; local32 < this.anInt2970; local32++) {
				local41 = local32 << this.anInt2971;
				local48 = local32 + 1 << this.anInt2971;
				for (local50 = 0; local50 < this.anInt2967; local50++) {
					local59 = 0;
					local66 = local50 << this.anInt2971;
					local68 = local50 + 1 << this.anInt2971;
					@Pc(192) Class3_Sub41_Sub2 local192 = this.aClass21_Sub2_42.aClass3_Sub41_Sub2_1;
					local192.anInt2803 = 0;
					for (@Pc(197) int local197 = local41; local197 < local48; local197++) {
						if (local197 - arg1 >= -arg2 && local197 - arg1 <= arg2) {
							@Pc(221) int local221 = local197 * this.aClass17_Sub1_3.anInt339 * -1007974723 + local66;
							for (@Pc(223) int local223 = local66; local223 < local68; local223++) {
								if (local223 - arg0 >= -arg2 && local223 - arg0 <= arg2 && arg3[local223 - arg0 + arg2][local197 - arg1 + arg2]) {
									@Pc(257) short[] local257 = this.aClass17_Sub1_3.aShortArrayArray1[local221];
									if (local257 != null) {
										@Pc(265) int local265;
										if (this.aClass21_Sub2_42.aBoolean63) {
											for (local265 = 0; local265 < local257.length; local265++) {
												local192.method20251(local257[local265] & 0xFFFF);
												local59++;
											}
										} else {
											for (local265 = 0; local265 < local257.length; local265++) {
												local192.method20442(local257[local265] & 0xFFFF);
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
						this.aClass95ArrayArray1[local50][local32].method21792(local192.aByteArray51, local59);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!bv", name = "j", descriptor = "(III[[ZZ)V", line = 40)
	void method21849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.aClass21_Sub2_42.method4084(false);
		this.aClass21_Sub2_42.method4087(false);
		this.aClass21_Sub2_42.method4070(-2);
		this.aClass21_Sub2_42.method4115(1);
		this.aClass21_Sub2_42.method4089(1);
		@Pc(28) float local28 = 1.0F / (float) (this.aClass21_Sub2_42.anInt407 * 128);
		@Pc(32) int local32;
		@Pc(41) int local41;
		@Pc(48) int local48;
		@Pc(50) int local50;
		@Pc(59) int local59;
		@Pc(66) int local66;
		@Pc(68) int local68;
		if (arg4) {
			for (local32 = 0; local32 < this.anInt2970; local32++) {
				local41 = local32 << this.anInt2971;
				local48 = local32 + 1 << this.anInt2971;
				label128: for (local50 = 0; local50 < this.anInt2967; local50++) {
					local59 = local50 << this.anInt2971;
					local66 = local50 + 1 << this.anInt2971;
					for (local68 = local59; local68 < local66; local68++) {
						if (local68 - arg0 >= -arg2 && local68 - arg0 <= arg2) {
							for (@Pc(84) int local84 = local41; local84 < local48; local84++) {
								if (local84 - arg1 >= -arg2 && local84 - arg1 <= arg2 && arg3[local68 - arg0 + arg2][local84 - arg1 + arg2]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local28, local28, 1.0F);
									OpenGL.glTranslatef((float) -local50 / local28, (float) -local32 / local28, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass95ArrayArray1[local50][local32].method21791();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local32 = 0; local32 < this.anInt2970; local32++) {
				local41 = local32 << this.anInt2971;
				local48 = local32 + 1 << this.anInt2971;
				for (local50 = 0; local50 < this.anInt2967; local50++) {
					local59 = 0;
					local66 = local50 << this.anInt2971;
					local68 = local50 + 1 << this.anInt2971;
					@Pc(192) Class3_Sub41_Sub2 local192 = this.aClass21_Sub2_42.aClass3_Sub41_Sub2_1;
					local192.anInt2803 = 0;
					for (@Pc(197) int local197 = local41; local197 < local48; local197++) {
						if (local197 - arg1 >= -arg2 && local197 - arg1 <= arg2) {
							@Pc(221) int local221 = local197 * this.aClass17_Sub1_3.anInt339 * -1007974723 + local66;
							for (@Pc(223) int local223 = local66; local223 < local68; local223++) {
								if (local223 - arg0 >= -arg2 && local223 - arg0 <= arg2 && arg3[local223 - arg0 + arg2][local197 - arg1 + arg2]) {
									@Pc(257) short[] local257 = this.aClass17_Sub1_3.aShortArrayArray1[local221];
									if (local257 != null) {
										@Pc(265) int local265;
										if (this.aClass21_Sub2_42.aBoolean63) {
											for (local265 = 0; local265 < local257.length; local265++) {
												local192.method20251(local257[local265] & 0xFFFF);
												local59++;
											}
										} else {
											for (local265 = 0; local265 < local257.length; local265++) {
												local192.method20442(local257[local265] & 0xFFFF);
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
						this.aClass95ArrayArray1[local50][local32].method21792(local192.aByteArray51, local59);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!bv", name = "n", descriptor = "(Lclient!amd;II)V", line = 123)
	void method21850(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class3_Sub1_Sub3_Sub1 local2 = (Class3_Sub1_Sub3_Sub1) arg0;
		arg1 += local2.anInt2825 + 1;
		arg2 += local2.anInt2826 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt2968;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt2822;
		@Pc(31) int local31 = local2.anInt2823;
		@Pc(36) int local36 = this.anInt2968 - local31;
		@Pc(38) int local38 = 0;
		@Pc(44) int local44;
		if (arg2 <= 0) {
			local44 = 1 - arg2;
			local28 -= local44;
			local25 += local44 * local31;
			local23 += local44 * this.anInt2968;
			arg2 = 1;
		}
		if (arg2 + local28 >= this.anInt2969) {
			local44 = arg2 + local28 + 1 - this.anInt2969;
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
		if (arg1 + local31 >= this.anInt2968) {
			local44 = arg1 + local31 + 1 - this.anInt2968;
			local31 -= local44;
			local38 += local44;
			local36 += local44;
		}
		if (local31 > 0 && local28 > 0) {
			method21858(this.aByteArray56, local2.aByteArray52, local25, local23, local31, local28, local36, local38);
			this.method21837(arg1, arg2, local31, local28);
		}
	}

	@OriginalMember(owner = "client!bv", name = "e", descriptor = "(Lclient!amd;II)V", line = 123)
	void method21851(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class3_Sub1_Sub3_Sub1 local2 = (Class3_Sub1_Sub3_Sub1) arg0;
		arg1 += local2.anInt2825 + 1;
		arg2 += local2.anInt2826 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt2968;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt2822;
		@Pc(31) int local31 = local2.anInt2823;
		@Pc(36) int local36 = this.anInt2968 - local31;
		@Pc(38) int local38 = 0;
		@Pc(44) int local44;
		if (arg2 <= 0) {
			local44 = 1 - arg2;
			local28 -= local44;
			local25 += local44 * local31;
			local23 += local44 * this.anInt2968;
			arg2 = 1;
		}
		if (arg2 + local28 >= this.anInt2969) {
			local44 = arg2 + local28 + 1 - this.anInt2969;
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
		if (arg1 + local31 >= this.anInt2968) {
			local44 = arg1 + local31 + 1 - this.anInt2968;
			local31 -= local44;
			local38 += local44;
			local36 += local44;
		}
		if (local31 > 0 && local28 > 0) {
			method21858(this.aByteArray56, local2.aByteArray52, local25, local23, local31, local28, local36, local38);
			this.method21837(arg1, arg2, local31, local28);
		}
	}

	@OriginalMember(owner = "client!bv", name = "g", descriptor = "(Lclient!amd;II)V", line = 123)
	void method21852(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class3_Sub1_Sub3_Sub1 local2 = (Class3_Sub1_Sub3_Sub1) arg0;
		arg1 += local2.anInt2825 + 1;
		arg2 += local2.anInt2826 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt2968;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt2822;
		@Pc(31) int local31 = local2.anInt2823;
		@Pc(36) int local36 = this.anInt2968 - local31;
		@Pc(38) int local38 = 0;
		@Pc(44) int local44;
		if (arg2 <= 0) {
			local44 = 1 - arg2;
			local28 -= local44;
			local25 += local44 * local31;
			local23 += local44 * this.anInt2968;
			arg2 = 1;
		}
		if (arg2 + local28 >= this.anInt2969) {
			local44 = arg2 + local28 + 1 - this.anInt2969;
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
		if (arg1 + local31 >= this.anInt2968) {
			local44 = arg1 + local31 + 1 - this.anInt2968;
			local31 -= local44;
			local38 += local44;
			local36 += local44;
		}
		if (local31 > 0 && local28 > 0) {
			method21858(this.aByteArray56, local2.aByteArray52, local25, local23, local31, local28, local36, local38);
			this.method21837(arg1, arg2, local31, local28);
		}
	}

	@OriginalMember(owner = "client!bv", name = "l", descriptor = "(Lclient!amd;II)V", line = 164)
	void method21840(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class3_Sub1_Sub3_Sub1 local2 = (Class3_Sub1_Sub3_Sub1) arg0;
		arg1 += local2.anInt2825 + 1;
		arg2 += local2.anInt2826 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt2968;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt2822;
		@Pc(31) int local31 = local2.anInt2823;
		@Pc(36) int local36 = this.anInt2968 - local31;
		@Pc(38) int local38 = 0;
		@Pc(44) int local44;
		if (arg2 <= 0) {
			local44 = 1 - arg2;
			local28 -= local44;
			local25 += local44 * local31;
			local23 += local44 * this.anInt2968;
			arg2 = 1;
		}
		if (arg2 + local28 >= this.anInt2969) {
			local44 = arg2 + local28 + 1 - this.anInt2969;
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
		if (arg1 + local31 >= this.anInt2968) {
			local44 = arg1 + local31 + 1 - this.anInt2968;
			local31 -= local44;
			local38 += local44;
			local36 += local44;
		}
		if (local31 > 0 && local28 > 0) {
			method21844(this.aByteArray56, local2.aByteArray52, local25, local23, local31, local28, local36, local38);
			this.method21837(arg1, arg2, local31, local28);
		}
	}

	@OriginalMember(owner = "client!bv", name = "q", descriptor = "(Lclient!amd;II)V", line = 164)
	void method21842(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class3_Sub1_Sub3_Sub1 local2 = (Class3_Sub1_Sub3_Sub1) arg0;
		arg1 += local2.anInt2825 + 1;
		arg2 += local2.anInt2826 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt2968;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt2822;
		@Pc(31) int local31 = local2.anInt2823;
		@Pc(36) int local36 = this.anInt2968 - local31;
		@Pc(38) int local38 = 0;
		@Pc(44) int local44;
		if (arg2 <= 0) {
			local44 = 1 - arg2;
			local28 -= local44;
			local25 += local44 * local31;
			local23 += local44 * this.anInt2968;
			arg2 = 1;
		}
		if (arg2 + local28 >= this.anInt2969) {
			local44 = arg2 + local28 + 1 - this.anInt2969;
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
		if (arg1 + local31 >= this.anInt2968) {
			local44 = arg1 + local31 + 1 - this.anInt2968;
			local31 -= local44;
			local38 += local44;
			local36 += local44;
		}
		if (local31 > 0 && local28 > 0) {
			method21844(this.aByteArray56, local2.aByteArray52, local25, local23, local31, local28, local36, local38);
			this.method21837(arg1, arg2, local31, local28);
		}
	}

	@OriginalMember(owner = "client!bv", name = "d", descriptor = "(Lclient!amd;II)V", line = 164)
	void method21853(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class3_Sub1_Sub3_Sub1 local2 = (Class3_Sub1_Sub3_Sub1) arg0;
		arg1 += local2.anInt2825 + 1;
		arg2 += local2.anInt2826 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt2968;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt2822;
		@Pc(31) int local31 = local2.anInt2823;
		@Pc(36) int local36 = this.anInt2968 - local31;
		@Pc(38) int local38 = 0;
		@Pc(44) int local44;
		if (arg2 <= 0) {
			local44 = 1 - arg2;
			local28 -= local44;
			local25 += local44 * local31;
			local23 += local44 * this.anInt2968;
			arg2 = 1;
		}
		if (arg2 + local28 >= this.anInt2969) {
			local44 = arg2 + local28 + 1 - this.anInt2969;
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
		if (arg1 + local31 >= this.anInt2968) {
			local44 = arg1 + local31 + 1 - this.anInt2968;
			local31 -= local44;
			local38 += local44;
			local36 += local44;
		}
		if (local31 > 0 && local28 > 0) {
			method21844(this.aByteArray56, local2.aByteArray52, local25, local23, local31, local28, local36, local38);
			this.method21837(arg1, arg2, local31, local28);
		}
	}

	@OriginalMember(owner = "client!bv", name = "r", descriptor = "(Lclient!amd;II)V", line = 164)
	void method21861(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class3_Sub1_Sub3_Sub1 local2 = (Class3_Sub1_Sub3_Sub1) arg0;
		arg1 += local2.anInt2825 + 1;
		arg2 += local2.anInt2826 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt2968;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt2822;
		@Pc(31) int local31 = local2.anInt2823;
		@Pc(36) int local36 = this.anInt2968 - local31;
		@Pc(38) int local38 = 0;
		@Pc(44) int local44;
		if (arg2 <= 0) {
			local44 = 1 - arg2;
			local28 -= local44;
			local25 += local44 * local31;
			local23 += local44 * this.anInt2968;
			arg2 = 1;
		}
		if (arg2 + local28 >= this.anInt2969) {
			local44 = arg2 + local28 + 1 - this.anInt2969;
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
		if (arg1 + local31 >= this.anInt2968) {
			local44 = arg1 + local31 + 1 - this.anInt2968;
			local31 -= local44;
			local38 += local44;
			local36 += local44;
		}
		if (local31 > 0 && local28 > 0) {
			method21844(this.aByteArray56, local2.aByteArray52, local25, local23, local31, local28, local36, local38);
			this.method21837(arg1, arg2, local31, local28);
		}
	}

	@OriginalMember(owner = "client!bv", name = "h", descriptor = "(Lclient!amd;II)Z", line = 205)
	boolean method21841(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class3_Sub1_Sub3_Sub1 local2 = (Class3_Sub1_Sub3_Sub1) arg0;
		arg1 += local2.anInt2825 + 1;
		arg2 += local2.anInt2826 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt2968;
		@Pc(26) int local26 = local2.anInt2822;
		@Pc(29) int local29 = local2.anInt2823;
		@Pc(34) int local34 = this.anInt2968 - local29;
		@Pc(40) int local40;
		if (arg2 <= 0) {
			local40 = 1 - arg2;
			local26 -= local40;
			local23 += local40 * this.anInt2968;
			arg2 = 1;
		}
		if (arg2 + local26 >= this.anInt2969) {
			local40 = arg2 + local26 + 1 - this.anInt2969;
			local26 -= local40;
		}
		if (arg1 <= 0) {
			local40 = 1 - arg1;
			local29 -= local40;
			local23 += local40;
			local34 += local40;
			arg1 = 1;
		}
		if (arg1 + local29 >= this.anInt2968) {
			local40 = arg1 + local29 + 1 - this.anInt2968;
			local29 -= local40;
			local34 += local40;
		}
		if (local29 > 0 && local26 > 0) {
			@Pc(123) byte local123 = 8;
			local34 += (local123 - 1) * this.anInt2968;
			return method21839(this.aByteArray56, local23, local29, local26, local34, local123);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bv", name = "m", descriptor = "(Lclient!amd;II)Z", line = 205)
	boolean method21855(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class3_Sub1_Sub3_Sub1 local2 = (Class3_Sub1_Sub3_Sub1) arg0;
		arg1 += local2.anInt2825 + 1;
		arg2 += local2.anInt2826 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt2968;
		@Pc(26) int local26 = local2.anInt2822;
		@Pc(29) int local29 = local2.anInt2823;
		@Pc(34) int local34 = this.anInt2968 - local29;
		@Pc(40) int local40;
		if (arg2 <= 0) {
			local40 = 1 - arg2;
			local26 -= local40;
			local23 += local40 * this.anInt2968;
			arg2 = 1;
		}
		if (arg2 + local26 >= this.anInt2969) {
			local40 = arg2 + local26 + 1 - this.anInt2969;
			local26 -= local40;
		}
		if (arg1 <= 0) {
			local40 = 1 - arg1;
			local29 -= local40;
			local23 += local40;
			local34 += local40;
			arg1 = 1;
		}
		if (arg1 + local29 >= this.anInt2968) {
			local40 = arg1 + local29 + 1 - this.anInt2968;
			local29 -= local40;
			local34 += local40;
		}
		if (local29 > 0 && local26 > 0) {
			@Pc(123) byte local123 = 8;
			local34 += (local123 - 1) * this.anInt2968;
			return method21839(this.aByteArray56, local23, local29, local26, local34, local123);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bv", name = "v", descriptor = "(Lclient!amd;II)Z", line = 205)
	boolean method21856(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class3_Sub1_Sub3_Sub1 local2 = (Class3_Sub1_Sub3_Sub1) arg0;
		arg1 += local2.anInt2825 + 1;
		arg2 += local2.anInt2826 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt2968;
		@Pc(26) int local26 = local2.anInt2822;
		@Pc(29) int local29 = local2.anInt2823;
		@Pc(34) int local34 = this.anInt2968 - local29;
		@Pc(40) int local40;
		if (arg2 <= 0) {
			local40 = 1 - arg2;
			local26 -= local40;
			local23 += local40 * this.anInt2968;
			arg2 = 1;
		}
		if (arg2 + local26 >= this.anInt2969) {
			local40 = arg2 + local26 + 1 - this.anInt2969;
			local26 -= local40;
		}
		if (arg1 <= 0) {
			local40 = 1 - arg1;
			local29 -= local40;
			local23 += local40;
			local34 += local40;
			arg1 = 1;
		}
		if (arg1 + local29 >= this.anInt2968) {
			local40 = arg1 + local29 + 1 - this.anInt2968;
			local29 -= local40;
			local34 += local40;
		}
		if (local29 > 0 && local26 > 0) {
			@Pc(123) byte local123 = 8;
			local34 += (local123 - 1) * this.anInt2968;
			return method21839(this.aByteArray56, local23, local29, local26, local34, local123);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bv", name = "x", descriptor = "(IIII)V", line = 241)
	void method21837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass95ArrayArray1 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 - 1 >> 7;
		@Pc(19) int local19 = arg0 - 1 + arg2 - 1 >> 7;
		@Pc(25) int local25 = arg1 - 1 >> 7;
		@Pc(35) int local35 = arg1 - 1 + arg3 - 1 >> 7;
		for (@Pc(37) int local37 = local9; local37 <= local19; local37++) {
			@Pc(45) Class95[] local45 = this.aClass95ArrayArray1[local37];
			for (@Pc(47) int local47 = local25; local47 <= local35; local47++) {
				local45[local47].aBoolean536 = true;
			}
		}
	}

	@OriginalMember(owner = "client!bv", name = "t", descriptor = "(IIII)V", line = 241)
	void method21845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass95ArrayArray1 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 - 1 >> 7;
		@Pc(19) int local19 = arg0 - 1 + arg2 - 1 >> 7;
		@Pc(25) int local25 = arg1 - 1 >> 7;
		@Pc(35) int local35 = arg1 - 1 + arg3 - 1 >> 7;
		for (@Pc(37) int local37 = local9; local37 <= local19; local37++) {
			@Pc(45) Class95[] local45 = this.aClass95ArrayArray1[local37];
			for (@Pc(47) int local47 = local25; local47 <= local35; local47++) {
				local45[local47].aBoolean536 = true;
			}
		}
	}

	@OriginalMember(owner = "client!bv", name = "w", descriptor = "(IIII)V", line = 241)
	void method21857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass95ArrayArray1 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 - 1 >> 7;
		@Pc(19) int local19 = arg0 - 1 + arg2 - 1 >> 7;
		@Pc(25) int local25 = arg1 - 1 >> 7;
		@Pc(35) int local35 = arg1 - 1 + arg3 - 1 >> 7;
		for (@Pc(37) int local37 = local9; local37 <= local19; local37++) {
			@Pc(45) Class95[] local45 = this.aClass95ArrayArray1[local37];
			for (@Pc(47) int local47 = local25; local47 <= local35; local47++) {
				local45[local47].aBoolean536 = true;
			}
		}
	}

	@OriginalMember(owner = "client!bv", name = "s", descriptor = "([B[BIIIIII)V", line = 253)
	static final void method21858(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!bv", name = "u", descriptor = "([B[BIIIIII)V", line = 271)
	static final void method21844(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!bv", name = "o", descriptor = "([B[BIIIIII)V", line = 271)
	static final void method21846(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!bv", name = "f", descriptor = "([B[BIIIIII)V", line = 271)
	static final void method21859(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!bv", name = "i", descriptor = "([B[BIIIIII)V", line = 271)
	static final void method21860(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!bv", name = "y", descriptor = "([BIIIII)Z", line = 289)
	static final boolean method21839(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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
