package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abm")
public class Class14_Sub4 extends Class14 {

	@OriginalMember(owner = "client!abm", name = "e", descriptor = "Lclient!abt;")
	final Class21_Sub2 aClass21_Sub2_26;

	@OriginalMember(owner = "client!abm", name = "r", descriptor = "Lclient!aja;")
	final Class4_Sub1_Sub1 aClass4_Sub1_Sub1_4;

	@OriginalMember(owner = "client!abm", name = "q", descriptor = "Z")
	final boolean aBoolean54;

	@OriginalMember(owner = "client!abm", name = "d", descriptor = "Lclient!bg;")
	final Class90 aClass90_6;

	@OriginalMember(owner = "client!abm", name = "<init>", descriptor = "(Lclient!abt;Lclient!yx;[Lclient!abc;Z)V", line = 17)
	Class14_Sub4(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) Class611 arg1, @OriginalArg(2) Class15_Sub1[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass21_Sub2_26 = arg0;
		@Pc(8) int local8 = 0;
		@Pc(10) int local10;
		for (local10 = 0; local10 < 256; local10++) {
			@Pc(17) Class15_Sub1 local17 = arg2[local10];
			if (local17.anInt165 > local8) {
				local8 = local17.anInt165;
			}
			if (local17.anInt169 > local8) {
				local8 = local17.anInt169;
			}
		}
		local10 = local8 * 16;
		@Pc(46) int local46;
		@Pc(53) Class15_Sub1 local53;
		@Pc(59) int local59;
		@Pc(65) int local65;
		@Pc(71) int local71;
		@Pc(77) int local77;
		@Pc(79) int local79;
		@Pc(87) int local87;
		@Pc(92) int local92;
		if (arg3) {
			@Pc(44) byte[] local44 = new byte[local10 * local10];
			for (local46 = 0; local46 < 256; local46++) {
				local53 = arg2[local46];
				@Pc(56) int local56 = local53.anInt165;
				local59 = local53.anInt169;
				local65 = local46 % 16 * local8;
				local71 = local46 / 16 * local8;
				local77 = local71 * local10 + local65;
				local79 = 0;
				@Pc(85) byte[] local85;
				if (local53.aByteArray2 == null) {
					local85 = local53.aByteArray1;
					for (local87 = 0; local87 < local56; local87++) {
						for (local92 = 0; local92 < local59; local92++) {
							local44[local77++] = (byte) (local85[local79++] == 0 ? 0 : -1);
						}
						local77 += local10 - local59;
					}
				} else {
					local85 = local53.aByteArray2;
					for (local87 = 0; local87 < local56; local87++) {
						for (local92 = 0; local92 < local59; local92++) {
							local44[local77++] = local85[local79++];
						}
						local77 += local10 - local59;
					}
				}
			}
			this.aClass4_Sub1_Sub1_4 = Class4_Sub1_Sub1.method14102(arg0, Class121.aClass121_23, Class127.aClass127_23, local10, local10, false, local44, Class121.aClass121_23);
			this.aBoolean54 = true;
		} else {
			@Pc(172) int[] local172 = new int[local10 * local10];
			for (local46 = 0; local46 < 256; local46++) {
				local53 = arg2[local46];
				@Pc(184) int[] local184 = local53.anIntArray26;
				@Pc(187) byte[] local187 = local53.aByteArray2;
				@Pc(190) byte[] local190 = local53.aByteArray1;
				local71 = local53.anInt165;
				local77 = local53.anInt169;
				local79 = local46 % 16 * local8;
				@Pc(208) int local208 = local46 / 16 * local8;
				local87 = local208 * local10 + local79;
				local92 = 0;
				@Pc(220) int local220;
				@Pc(225) int local225;
				if (local187 == null) {
					for (local220 = 0; local220 < local71; local220++) {
						for (local225 = 0; local225 < local77; local225++) {
							@Pc(273) byte local273;
							if ((local273 = local190[local92++]) == 0) {
								local87++;
							} else {
								local172[local87++] = local184[local273 & 0xFF] | 0xFF000000;
							}
						}
						local87 += local10 - local77;
					}
				} else {
					for (local220 = 0; local220 < local71; local220++) {
						for (local225 = 0; local225 < local77; local225++) {
							local172[local87++] = local187[local92] << 24 | local184[local190[local92] & 0xFF];
							local92++;
						}
						local87 += local10 - local77;
					}
				}
			}
			this.aClass4_Sub1_Sub1_4 = Class4_Sub1_Sub1.method14098(arg0, local10, local10, false, local172, 0, 0);
			this.aBoolean54 = false;
		}
		this.aClass4_Sub1_Sub1_4.method33712(false);
		this.aClass90_6 = new Class90(arg0, 256);
		@Pc(332) float local332 = this.aClass4_Sub1_Sub1_4.aFloat152 / (float) this.aClass4_Sub1_Sub1_4.anInt2031;
		@Pc(341) float local341 = this.aClass4_Sub1_Sub1_4.aFloat151 / (float) this.aClass4_Sub1_Sub1_4.anInt2030;
		for (@Pc(343) int local343 = 0; local343 < 256; local343++) {
			@Pc(350) Class15_Sub1 local350 = arg2[local343];
			local59 = local350.anInt165;
			local65 = local350.anInt169;
			local71 = local350.anInt167;
			local77 = local350.anInt166;
			@Pc(369) float local369 = (float) (local343 % 16 * local8);
			@Pc(376) float local376 = (float) (local343 / 16 * local8);
			@Pc(380) float local380 = local369 * local332;
			@Pc(384) float local384 = local376 * local341;
			@Pc(391) float local391 = (local369 + (float) local65) * local332;
			@Pc(398) float local398 = (local376 + (float) local59) * local341;
			this.aClass90_6.method21660(local343);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local380, this.aClass4_Sub1_Sub1_4.aFloat151 - local384);
			OpenGL.glVertex2i(local77, local71);
			OpenGL.glTexCoord2f(local380, this.aClass4_Sub1_Sub1_4.aFloat151 - local398);
			OpenGL.glVertex2i(local77, local71 + local59);
			OpenGL.glTexCoord2f(local391, this.aClass4_Sub1_Sub1_4.aFloat151 - local398);
			OpenGL.glVertex2i(local77 + local65, local71 + local59);
			OpenGL.glTexCoord2f(local391, this.aClass4_Sub1_Sub1_4.aFloat151 - local384);
			OpenGL.glVertex2i(local77 + local65, local71);
			OpenGL.glEnd();
			this.aClass90_6.method21649();
		}
	}

	@OriginalMember(owner = "client!abm", name = "r", descriptor = "(CIIIZ)V", line = 126)
	@Override
	void method3295(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass21_Sub2_26.method4069();
		this.aClass21_Sub2_26.method4074(this.aClass4_Sub1_Sub1_4);
		if (this.aBoolean54 || arg4) {
			this.aClass21_Sub2_26.method4114(7681, 8448);
			this.aClass21_Sub2_26.method4077(0, 34168, 768);
		} else {
			this.aClass21_Sub2_26.method4114(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass90_6.method21650(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean54 || arg4) {
			this.aClass21_Sub2_26.method4077(0, 5890, 768);
		}
	}

	@OriginalMember(owner = "client!abm", name = "q", descriptor = "(CIIIZ)V", line = 126)
	@Override
	void method3306(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass21_Sub2_26.method4069();
		this.aClass21_Sub2_26.method4074(this.aClass4_Sub1_Sub1_4);
		if (this.aBoolean54 || arg4) {
			this.aClass21_Sub2_26.method4114(7681, 8448);
			this.aClass21_Sub2_26.method4077(0, 34168, 768);
		} else {
			this.aClass21_Sub2_26.method4114(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass90_6.method21650(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean54 || arg4) {
			this.aClass21_Sub2_26.method4077(0, 5890, 768);
		}
	}

	@OriginalMember(owner = "client!abm", name = "m", descriptor = "(CIIIZ)V", line = 126)
	@Override
	void method3298(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass21_Sub2_26.method4069();
		this.aClass21_Sub2_26.method4074(this.aClass4_Sub1_Sub1_4);
		if (this.aBoolean54 || arg4) {
			this.aClass21_Sub2_26.method4114(7681, 8448);
			this.aClass21_Sub2_26.method4077(0, 34168, 768);
		} else {
			this.aClass21_Sub2_26.method4114(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass90_6.method21650(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean54 || arg4) {
			this.aClass21_Sub2_26.method4077(0, 5890, 768);
		}
	}

	@OriginalMember(owner = "client!abm", name = "t", descriptor = "(CIIIZLclient!ch;II)V", line = 141)
	@Override
	void method3300(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class5_Sub2 local2 = (Class5_Sub2) arg5;
		@Pc(5) Class4_Sub1_Sub1 local5 = local2.aClass4_Sub1_Sub1_1;
		this.aClass21_Sub2_26.method4069();
		this.aClass21_Sub2_26.method4074(this.aClass4_Sub1_Sub1_4);
		if (this.aBoolean54 || arg4) {
			this.aClass21_Sub2_26.method4114(7681, 8448);
			this.aClass21_Sub2_26.method4077(0, 34168, 768);
		} else {
			this.aClass21_Sub2_26.method4114(7681, 7681);
		}
		this.aClass21_Sub2_26.method4073(1);
		this.aClass21_Sub2_26.method4074(local5);
		this.aClass21_Sub2_26.method4114(7681, 8448);
		this.aClass21_Sub2_26.method4077(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(69) float local69 = local5.aFloat152 / (float) local5.anInt2031;
		@Pc(76) float local76 = local5.aFloat151 / (float) local5.anInt2030;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local69, 0.0F, 0.0F, (float) -arg6 * local69 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local76, 0.0F, (float) -arg7 * local76 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass90_6.method21650(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass21_Sub2_26.method4077(0, 5890, 768);
		this.aClass21_Sub2_26.method4114(8448, 8448);
		this.aClass21_Sub2_26.method4074(null);
		this.aClass21_Sub2_26.method4073(0);
		if (this.aBoolean54 || arg4) {
			this.aClass21_Sub2_26.method4077(0, 5890, 768);
		}
	}

	@OriginalMember(owner = "client!abm", name = "d", descriptor = "(CIIIZLclient!ch;II)V", line = 141)
	@Override
	void method3328(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class5_Sub2 local2 = (Class5_Sub2) arg5;
		@Pc(5) Class4_Sub1_Sub1 local5 = local2.aClass4_Sub1_Sub1_1;
		this.aClass21_Sub2_26.method4069();
		this.aClass21_Sub2_26.method4074(this.aClass4_Sub1_Sub1_4);
		if (this.aBoolean54 || arg4) {
			this.aClass21_Sub2_26.method4114(7681, 8448);
			this.aClass21_Sub2_26.method4077(0, 34168, 768);
		} else {
			this.aClass21_Sub2_26.method4114(7681, 7681);
		}
		this.aClass21_Sub2_26.method4073(1);
		this.aClass21_Sub2_26.method4074(local5);
		this.aClass21_Sub2_26.method4114(7681, 8448);
		this.aClass21_Sub2_26.method4077(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(69) float local69 = local5.aFloat152 / (float) local5.anInt2031;
		@Pc(76) float local76 = local5.aFloat151 / (float) local5.anInt2030;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local69, 0.0F, 0.0F, (float) -arg6 * local69 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local76, 0.0F, (float) -arg7 * local76 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass90_6.method21650(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass21_Sub2_26.method4077(0, 5890, 768);
		this.aClass21_Sub2_26.method4114(8448, 8448);
		this.aClass21_Sub2_26.method4074(null);
		this.aClass21_Sub2_26.method4073(0);
		if (this.aBoolean54 || arg4) {
			this.aClass21_Sub2_26.method4077(0, 5890, 768);
		}
	}

	@OriginalMember(owner = "client!abm", name = "v", descriptor = "(CIIIZLclient!ch;II)V", line = 141)
	@Override
	void method3299(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class5_Sub2 local2 = (Class5_Sub2) arg5;
		@Pc(5) Class4_Sub1_Sub1 local5 = local2.aClass4_Sub1_Sub1_1;
		this.aClass21_Sub2_26.method4069();
		this.aClass21_Sub2_26.method4074(this.aClass4_Sub1_Sub1_4);
		if (this.aBoolean54 || arg4) {
			this.aClass21_Sub2_26.method4114(7681, 8448);
			this.aClass21_Sub2_26.method4077(0, 34168, 768);
		} else {
			this.aClass21_Sub2_26.method4114(7681, 7681);
		}
		this.aClass21_Sub2_26.method4073(1);
		this.aClass21_Sub2_26.method4074(local5);
		this.aClass21_Sub2_26.method4114(7681, 8448);
		this.aClass21_Sub2_26.method4077(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(69) float local69 = local5.aFloat152 / (float) local5.anInt2031;
		@Pc(76) float local76 = local5.aFloat151 / (float) local5.anInt2030;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local69, 0.0F, 0.0F, (float) -arg6 * local69 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local76, 0.0F, (float) -arg7 * local76 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass90_6.method21650(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass21_Sub2_26.method4077(0, 5890, 768);
		this.aClass21_Sub2_26.method4114(8448, 8448);
		this.aClass21_Sub2_26.method4074(null);
		this.aClass21_Sub2_26.method4073(0);
		if (this.aBoolean54 || arg4) {
			this.aClass21_Sub2_26.method4077(0, 5890, 768);
		}
	}

	@OriginalMember(owner = "client!abm", name = "w", descriptor = "(CIIIZLclient!ch;II)V", line = 141)
	@Override
	void method3289(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class5_Sub2 local2 = (Class5_Sub2) arg5;
		@Pc(5) Class4_Sub1_Sub1 local5 = local2.aClass4_Sub1_Sub1_1;
		this.aClass21_Sub2_26.method4069();
		this.aClass21_Sub2_26.method4074(this.aClass4_Sub1_Sub1_4);
		if (this.aBoolean54 || arg4) {
			this.aClass21_Sub2_26.method4114(7681, 8448);
			this.aClass21_Sub2_26.method4077(0, 34168, 768);
		} else {
			this.aClass21_Sub2_26.method4114(7681, 7681);
		}
		this.aClass21_Sub2_26.method4073(1);
		this.aClass21_Sub2_26.method4074(local5);
		this.aClass21_Sub2_26.method4114(7681, 8448);
		this.aClass21_Sub2_26.method4077(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(69) float local69 = local5.aFloat152 / (float) local5.anInt2031;
		@Pc(76) float local76 = local5.aFloat151 / (float) local5.anInt2030;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local69, 0.0F, 0.0F, (float) -arg6 * local69 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local76, 0.0F, (float) -arg7 * local76 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass90_6.method21650(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass21_Sub2_26.method4077(0, 5890, 768);
		this.aClass21_Sub2_26.method4114(8448, 8448);
		this.aClass21_Sub2_26.method4074(null);
		this.aClass21_Sub2_26.method4073(0);
		if (this.aBoolean54 || arg4) {
			this.aClass21_Sub2_26.method4077(0, 5890, 768);
		}
	}

	@OriginalMember(owner = "client!abm", name = "o", descriptor = "(CIIIZLclient!ch;II)V", line = 141)
	@Override
	void method3302(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class5_Sub2 local2 = (Class5_Sub2) arg5;
		@Pc(5) Class4_Sub1_Sub1 local5 = local2.aClass4_Sub1_Sub1_1;
		this.aClass21_Sub2_26.method4069();
		this.aClass21_Sub2_26.method4074(this.aClass4_Sub1_Sub1_4);
		if (this.aBoolean54 || arg4) {
			this.aClass21_Sub2_26.method4114(7681, 8448);
			this.aClass21_Sub2_26.method4077(0, 34168, 768);
		} else {
			this.aClass21_Sub2_26.method4114(7681, 7681);
		}
		this.aClass21_Sub2_26.method4073(1);
		this.aClass21_Sub2_26.method4074(local5);
		this.aClass21_Sub2_26.method4114(7681, 8448);
		this.aClass21_Sub2_26.method4077(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(69) float local69 = local5.aFloat152 / (float) local5.anInt2031;
		@Pc(76) float local76 = local5.aFloat151 / (float) local5.anInt2030;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local69, 0.0F, 0.0F, (float) -arg6 * local69 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local76, 0.0F, (float) -arg7 * local76 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass90_6.method21650(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass21_Sub2_26.method4077(0, 5890, 768);
		this.aClass21_Sub2_26.method4114(8448, 8448);
		this.aClass21_Sub2_26.method4074(null);
		this.aClass21_Sub2_26.method4073(0);
		if (this.aBoolean54 || arg4) {
			this.aClass21_Sub2_26.method4077(0, 5890, 768);
		}
	}
}
