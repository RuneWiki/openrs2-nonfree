package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afl")
public class Class94_Sub3 extends Class94 {

	@OriginalMember(owner = "client!afl", name = "j", descriptor = "Lclient!aeq;")
	final Class86_Sub3 aClass86_Sub3_27;

	@OriginalMember(owner = "client!afl", name = "i", descriptor = "Lclient!aoa;")
	final Class78_Sub2_Sub1 aClass78_Sub2_Sub1_4;

	@OriginalMember(owner = "client!afl", name = "u", descriptor = "Z")
	final boolean aBoolean164;

	@OriginalMember(owner = "client!afl", name = "k", descriptor = "Lclient!bg;")
	final Class169 aClass169_6;

	@OriginalMember(owner = "client!afl", name = "<init>", descriptor = "(Lclient!aeq;Lclient!aar;[Lclient!dg;Z)V", line = 17)
	Class94_Sub3(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) Class89[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass86_Sub3_27 = arg0;
		@Pc(8) int local8 = 0;
		@Pc(10) int local10;
		for (local10 = 0; local10 < 256; local10++) {
			@Pc(17) Class89 local17 = arg2[local10];
			if (local17.method6683() > local8) {
				local8 = local17.method6683();
			}
			if (local17.method6682() > local8) {
				local8 = local17.method6682();
			}
		}
		local10 = local8 * 16;
		@Pc(46) int local46;
		@Pc(53) Class89 local53;
		@Pc(56) int local56;
		@Pc(59) int local59;
		@Pc(65) int local65;
		@Pc(71) int local71;
		@Pc(77) int local77;
		@Pc(79) int local79;
		@Pc(164) Class89_Sub1 local164;
		@Pc(168) int[] local168;
		@Pc(95) int local95;
		@Pc(100) int local100;
		@Pc(186) int local186;
		@Pc(87) Class89_Sub2 local87;
		if (arg3) {
			@Pc(44) byte[] local44 = new byte[local10 * local10];
			for (local46 = 0; local46 < 256; local46++) {
				local53 = arg2[local46];
				local56 = local53.method6683();
				local59 = local53.method6682();
				local65 = local46 % 16 * local8;
				local71 = local46 / 16 * local8;
				local77 = local71 * local10 + local65;
				local79 = 0;
				if (local53.method6680()) {
					local87 = (Class89_Sub2) arg2[local46];
					@Pc(93) byte[] local93;
					if (local87.method6693()) {
						local93 = local87.aByteArray15;
						for (local95 = 0; local95 < local56; local95++) {
							for (local100 = 0; local100 < local59; local100++) {
								local44[local77++] = local93[local79++];
							}
							local77 += local10 - local59;
						}
					} else {
						local93 = local87.aByteArray16;
						for (local95 = 0; local95 < local56; local95++) {
							for (local100 = 0; local100 < local59; local100++) {
								local44[local77++] = (byte) (local93[local79++] == 0 ? 0 : -1);
							}
							local77 += local10 - local59;
						}
					}
				} else {
					local164 = (Class89_Sub1) arg2[local46];
					local168 = local164.method6686(false);
					if (local164.method6693()) {
						for (local95 = 0; local95 < local56; local95++) {
							for (local100 = 0; local100 < local59; local100++) {
								local44[local77++] = (byte) (local168[local79++] >> 24 & 0xFF);
							}
							local77 += local10 - local59;
						}
					} else {
						for (local95 = 0; local95 < local56; local95++) {
							for (local100 = 0; local100 < local59; local100++) {
								local186 = local168[local79++];
								@Pc(209) byte local209 = (byte) ((local186 >> 16 & 0xFF) * 3 + (local186 >> 8 & 0xFF) * 4 + (local186 & 0xFF) >> 3);
								local44[local77++] = local209;
							}
							local77 += local10 - local59;
						}
					}
				}
			}
			this.aClass78_Sub2_Sub1_4 = Class78_Sub2_Sub1.method17527(arg0, Class212.aClass212_17, Class206.aClass206_23, local10, local10, false, local44, Class212.aClass212_17);
			this.aBoolean164 = true;
		} else {
			@Pc(280) int[] local280 = new int[local10 * local10];
			for (local46 = 0; local46 < 256; local46++) {
				local53 = arg2[local46];
				local56 = local53.method6683();
				local59 = local53.method6682();
				local65 = local46 % 16 * local8;
				local71 = local46 / 16 * local8;
				local77 = local71 * local10 + local65;
				local79 = 0;
				if (local53.method6680()) {
					local87 = (Class89_Sub2) arg2[local46];
					local168 = local87.anIntArray69;
					@Pc(329) byte[] local329 = local87.aByteArray15;
					@Pc(332) byte[] local332 = local87.aByteArray16;
					@Pc(341) int local341;
					if (local329 == null) {
						for (local186 = 0; local186 < local56; local186++) {
							for (local341 = 0; local341 < local59; local341++) {
								@Pc(389) byte local389;
								if ((local389 = local332[local79++]) == 0) {
									local77++;
								} else {
									local280[local77++] = local168[local389 & 0xFF] | 0xFF000000;
								}
							}
							local77 += local10 - local59;
						}
					} else {
						for (local186 = 0; local186 < local56; local186++) {
							for (local341 = 0; local341 < local59; local341++) {
								local280[local77++] = local329[local79] << 24 | local168[local332[local79] & 0xFF];
								local79++;
							}
							local77 += local10 - local59;
						}
					}
				} else {
					local164 = (Class89_Sub1) arg2[local46];
					local168 = local164.method6686(false);
					if (local164.method6693()) {
						for (local95 = 0; local95 < local56; local95++) {
							for (local100 = 0; local100 < local59; local100++) {
								local280[local77++] = local168[local79++];
							}
							local77 += local10 - local59;
						}
					} else {
						for (local95 = 0; local95 < local56; local95++) {
							for (local100 = 0; local100 < local59; local100++) {
								local186 = local168[local79] & 0xFFFFFF;
								local280[local77++] = (local186 == 0 ? 0 : 255) << 24 | local186;
								local79++;
							}
							local77 += local10 - local59;
						}
					}
				}
			}
			this.aClass78_Sub2_Sub1_4 = Class78_Sub2_Sub1.method17522(arg0, local10, local10, false, local280, 0, 0);
			this.aBoolean164 = false;
		}
		this.aClass78_Sub2_Sub1_4.method17453(false);
		this.aClass169_6 = new Class169(arg0, 256);
		@Pc(530) float local530 = this.aClass78_Sub2_Sub1_4.aFloat163 / (float) this.aClass78_Sub2_Sub1_4.anInt2414;
		@Pc(539) float local539 = this.aClass78_Sub2_Sub1_4.aFloat164 / (float) this.aClass78_Sub2_Sub1_4.anInt2415;
		for (@Pc(541) int local541 = 0; local541 < 256; local541++) {
			@Pc(548) Class89 local548 = arg2[local541];
			local59 = local548.method6683();
			local65 = local548.method6682();
			local71 = local548.method6701();
			local77 = local548.method6684();
			@Pc(567) float local567 = (float) (local541 % 16 * local8);
			@Pc(574) float local574 = (float) (local541 / 16 * local8);
			@Pc(578) float local578 = local567 * local530;
			@Pc(582) float local582 = local574 * local539;
			@Pc(589) float local589 = (local567 + (float) local65) * local530;
			@Pc(596) float local596 = (local574 + (float) local59) * local539;
			this.aClass169_6.method24412(local541);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local578, this.aClass78_Sub2_Sub1_4.aFloat164 - local582);
			OpenGL.glVertex2i(local77, local71);
			OpenGL.glTexCoord2f(local578, this.aClass78_Sub2_Sub1_4.aFloat164 - local596);
			OpenGL.glVertex2i(local77, local71 + local59);
			OpenGL.glTexCoord2f(local589, this.aClass78_Sub2_Sub1_4.aFloat164 - local596);
			OpenGL.glVertex2i(local77 + local65, local71 + local59);
			OpenGL.glTexCoord2f(local589, this.aClass78_Sub2_Sub1_4.aFloat164 - local582);
			OpenGL.glVertex2i(local77 + local65, local71);
			OpenGL.glEnd();
			this.aClass169_6.method24414();
		}
	}

	@OriginalMember(owner = "client!afl", name = "i", descriptor = "(CIIIZ)V", line = 176)
	@Override
	void method7660(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass86_Sub3_27.method6174();
		this.aClass86_Sub3_27.method6195(this.aClass78_Sub2_Sub1_4);
		if (this.aBoolean164 || arg4) {
			this.aClass86_Sub3_27.method6207(7681, 8448);
			this.aClass86_Sub3_27.method6213(0, 34168, 768);
		} else {
			this.aClass86_Sub3_27.method6207(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass169_6.method24416(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean164 || arg4) {
			this.aClass86_Sub3_27.method6213(0, 5890, 768);
		}
	}

	@OriginalMember(owner = "client!afl", name = "u", descriptor = "(CIIIZ)V", line = 176)
	@Override
	void method7656(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass86_Sub3_27.method6174();
		this.aClass86_Sub3_27.method6195(this.aClass78_Sub2_Sub1_4);
		if (this.aBoolean164 || arg4) {
			this.aClass86_Sub3_27.method6207(7681, 8448);
			this.aClass86_Sub3_27.method6213(0, 34168, 768);
		} else {
			this.aClass86_Sub3_27.method6207(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass169_6.method24416(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean164 || arg4) {
			this.aClass86_Sub3_27.method6213(0, 5890, 768);
		}
	}

	@OriginalMember(owner = "client!afl", name = "e", descriptor = "(CIIIZ)V", line = 176)
	@Override
	void method7657(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass86_Sub3_27.method6174();
		this.aClass86_Sub3_27.method6195(this.aClass78_Sub2_Sub1_4);
		if (this.aBoolean164 || arg4) {
			this.aClass86_Sub3_27.method6207(7681, 8448);
			this.aClass86_Sub3_27.method6213(0, 34168, 768);
		} else {
			this.aClass86_Sub3_27.method6207(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass169_6.method24416(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean164 || arg4) {
			this.aClass86_Sub3_27.method6213(0, 5890, 768);
		}
	}

	@OriginalMember(owner = "client!afl", name = "f", descriptor = "(CIIIZLclient!cd;II)V", line = 191)
	@Override
	void method7658(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class90 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class90_Sub3 local2 = (Class90_Sub3) arg5;
		@Pc(5) Class78_Sub2_Sub1 local5 = local2.aClass78_Sub2_Sub1_3;
		this.aClass86_Sub3_27.method6174();
		this.aClass86_Sub3_27.method6195(this.aClass78_Sub2_Sub1_4);
		if (this.aBoolean164 || arg4) {
			this.aClass86_Sub3_27.method6207(7681, 8448);
			this.aClass86_Sub3_27.method6213(0, 34168, 768);
		} else {
			this.aClass86_Sub3_27.method6207(7681, 7681);
		}
		this.aClass86_Sub3_27.method6190(1);
		this.aClass86_Sub3_27.method6195(local5);
		this.aClass86_Sub3_27.method6207(7681, 8448);
		this.aClass86_Sub3_27.method6213(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(69) float local69 = local5.aFloat163 / (float) local5.anInt2414;
		@Pc(76) float local76 = local5.aFloat164 / (float) local5.anInt2415;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local69, 0.0F, 0.0F, (float) -arg6 * local69 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local76, 0.0F, (float) -arg7 * local76 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass169_6.method24416(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass86_Sub3_27.method6213(0, 5890, 768);
		this.aClass86_Sub3_27.method6207(8448, 8448);
		this.aClass86_Sub3_27.method6195(null);
		this.aClass86_Sub3_27.method6190(0);
		if (this.aBoolean164 || arg4) {
			this.aClass86_Sub3_27.method6213(0, 5890, 768);
		}
	}

	@OriginalMember(owner = "client!afl", name = "k", descriptor = "(CIIIZLclient!cd;II)V", line = 191)
	@Override
	void method7661(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class90 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class90_Sub3 local2 = (Class90_Sub3) arg5;
		@Pc(5) Class78_Sub2_Sub1 local5 = local2.aClass78_Sub2_Sub1_3;
		this.aClass86_Sub3_27.method6174();
		this.aClass86_Sub3_27.method6195(this.aClass78_Sub2_Sub1_4);
		if (this.aBoolean164 || arg4) {
			this.aClass86_Sub3_27.method6207(7681, 8448);
			this.aClass86_Sub3_27.method6213(0, 34168, 768);
		} else {
			this.aClass86_Sub3_27.method6207(7681, 7681);
		}
		this.aClass86_Sub3_27.method6190(1);
		this.aClass86_Sub3_27.method6195(local5);
		this.aClass86_Sub3_27.method6207(7681, 8448);
		this.aClass86_Sub3_27.method6213(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(69) float local69 = local5.aFloat163 / (float) local5.anInt2414;
		@Pc(76) float local76 = local5.aFloat164 / (float) local5.anInt2415;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local69, 0.0F, 0.0F, (float) -arg6 * local69 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local76, 0.0F, (float) -arg7 * local76 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass169_6.method24416(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass86_Sub3_27.method6213(0, 5890, 768);
		this.aClass86_Sub3_27.method6207(8448, 8448);
		this.aClass86_Sub3_27.method6195(null);
		this.aClass86_Sub3_27.method6190(0);
		if (this.aBoolean164 || arg4) {
			this.aClass86_Sub3_27.method6213(0, 5890, 768);
		}
	}

	@OriginalMember(owner = "client!afl", name = "o", descriptor = "(CIIIZLclient!cd;II)V", line = 191)
	@Override
	void method7659(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class90 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class90_Sub3 local2 = (Class90_Sub3) arg5;
		@Pc(5) Class78_Sub2_Sub1 local5 = local2.aClass78_Sub2_Sub1_3;
		this.aClass86_Sub3_27.method6174();
		this.aClass86_Sub3_27.method6195(this.aClass78_Sub2_Sub1_4);
		if (this.aBoolean164 || arg4) {
			this.aClass86_Sub3_27.method6207(7681, 8448);
			this.aClass86_Sub3_27.method6213(0, 34168, 768);
		} else {
			this.aClass86_Sub3_27.method6207(7681, 7681);
		}
		this.aClass86_Sub3_27.method6190(1);
		this.aClass86_Sub3_27.method6195(local5);
		this.aClass86_Sub3_27.method6207(7681, 8448);
		this.aClass86_Sub3_27.method6213(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(69) float local69 = local5.aFloat163 / (float) local5.anInt2414;
		@Pc(76) float local76 = local5.aFloat164 / (float) local5.anInt2415;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local69, 0.0F, 0.0F, (float) -arg6 * local69 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local76, 0.0F, (float) -arg7 * local76 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass169_6.method24416(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass86_Sub3_27.method6213(0, 5890, 768);
		this.aClass86_Sub3_27.method6207(8448, 8448);
		this.aClass86_Sub3_27.method6195(null);
		this.aClass86_Sub3_27.method6190(0);
		if (this.aBoolean164 || arg4) {
			this.aClass86_Sub3_27.method6213(0, 5890, 768);
		}
	}
}
