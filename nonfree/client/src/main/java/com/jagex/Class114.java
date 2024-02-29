package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public abstract class Class114 implements Interface42 {

	@OriginalMember(owner = "client!qm", name = "v", descriptor = "I")
	static final int anInt1217 = 34067;

	@OriginalMember(owner = "client!qm", name = "l", descriptor = "I")
	static final int anInt1218 = 32879;

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
	static final int anInt1220 = 3553;

	@OriginalMember(owner = "client!qm", name = "p", descriptor = "I")
	static final int anInt1221 = 0;

	@OriginalMember(owner = "client!qm", name = "g", descriptor = "[I")
	static final int[] anIntArray126 = new int[1];

	@OriginalMember(owner = "client!qm", name = "s", descriptor = "Lclient!lo;")
	Class382 aClass382_4 = Class382.aClass382_5;

	@OriginalMember(owner = "client!qm", name = "y", descriptor = "Lclient!apr;")
	final Class86_Sub1_Sub2 aClass86_Sub1_Sub2_6;

	@OriginalMember(owner = "client!qm", name = "t", descriptor = "I")
	final int anInt1223;

	@OriginalMember(owner = "client!qm", name = "q", descriptor = "Lclient!dt;")
	final Class212 aClass212_13;

	@OriginalMember(owner = "client!qm", name = "x", descriptor = "Lclient!dl;")
	final Class206 aClass206_13;

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "Z")
	boolean aBoolean214;

	@OriginalMember(owner = "client!qm", name = "r", descriptor = "I")
	final int anInt1222;

	@OriginalMember(owner = "client!qm", name = "w", descriptor = "I")
	int anInt1219;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lclient!apr;ILclient!dt;Lclient!dl;IZ)V", line = 25)
	Class114(@OriginalArg(0) Class86_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class212 arg2, @OriginalArg(3) Class206 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aClass86_Sub1_Sub2_6 = arg0;
		this.anInt1223 = arg1;
		this.aClass212_13 = arg2;
		this.aClass206_13 = arg3;
		this.aBoolean214 = arg5;
		this.anInt1222 = arg4;
		OpenGL.glGenTextures(1, anIntArray126, 0);
		this.anInt1219 = anIntArray126[0];
		this.method10568();
		this.method10585(0);
	}

	@OriginalMember(owner = "client!qm", name = "aa", descriptor = "()V", line = 39)
	@Override
	public void method10868() {
		if (this.anInt1219 == 0) {
			throw new IllegalStateException("");
		}
		@Pc(11) int local11 = this.aClass86_Sub1_Sub2_6.method20539();
		@Pc(17) int local17 = this.aClass86_Sub1_Sub2_6.anIntArray264[local11];
		if (local17 != this.anInt1223) {
			if (local17 != 0) {
				OpenGL.glBindTexture(local17, 0);
				OpenGL.glDisable(local17);
			}
			OpenGL.glEnable(this.anInt1223);
			this.aClass86_Sub1_Sub2_6.anIntArray264[local11] = this.anInt1223;
		}
		OpenGL.glBindTexture(this.anInt1223, this.anInt1219);
	}

	@OriginalMember(owner = "client!qm", name = "an", descriptor = "()V", line = 39)
	@Override
	public void method10867() {
		if (this.anInt1219 == 0) {
			throw new IllegalStateException("");
		}
		@Pc(11) int local11 = this.aClass86_Sub1_Sub2_6.method20539();
		@Pc(17) int local17 = this.aClass86_Sub1_Sub2_6.anIntArray264[local11];
		if (local17 != this.anInt1223) {
			if (local17 != 0) {
				OpenGL.glBindTexture(local17, 0);
				OpenGL.glDisable(local17);
			}
			OpenGL.glEnable(this.anInt1223);
			this.aClass86_Sub1_Sub2_6.anIntArray264[local11] = this.anInt1223;
		}
		OpenGL.glBindTexture(this.anInt1223, this.anInt1219);
	}

	@OriginalMember(owner = "client!qm", name = "ab", descriptor = "()V", line = 39)
	@Override
	public void method10864() {
		if (this.anInt1219 == 0) {
			throw new IllegalStateException("");
		}
		@Pc(11) int local11 = this.aClass86_Sub1_Sub2_6.method20539();
		@Pc(17) int local17 = this.aClass86_Sub1_Sub2_6.anIntArray264[local11];
		if (local17 != this.anInt1223) {
			if (local17 != 0) {
				OpenGL.glBindTexture(local17, 0);
				OpenGL.glDisable(local17);
			}
			OpenGL.glEnable(this.anInt1223);
			this.aClass86_Sub1_Sub2_6.anIntArray264[local11] = this.anInt1223;
		}
		OpenGL.glBindTexture(this.anInt1223, this.anInt1219);
	}

	@OriginalMember(owner = "client!qm", name = "ap", descriptor = "()V", line = 39)
	@Override
	public void method10866() {
		if (this.anInt1219 == 0) {
			throw new IllegalStateException("");
		}
		@Pc(11) int local11 = this.aClass86_Sub1_Sub2_6.method20539();
		@Pc(17) int local17 = this.aClass86_Sub1_Sub2_6.anIntArray264[local11];
		if (local17 != this.anInt1223) {
			if (local17 != 0) {
				OpenGL.glBindTexture(local17, 0);
				OpenGL.glDisable(local17);
			}
			OpenGL.glEnable(this.anInt1223);
			this.aClass86_Sub1_Sub2_6.anIntArray264[local11] = this.anInt1223;
		}
		OpenGL.glBindTexture(this.anInt1223, this.anInt1219);
	}

	@OriginalMember(owner = "client!qm", name = "ay", descriptor = "()V", line = 39)
	@Override
	public void method10865() {
		if (this.anInt1219 == 0) {
			throw new IllegalStateException("");
		}
		@Pc(11) int local11 = this.aClass86_Sub1_Sub2_6.method20539();
		@Pc(17) int local17 = this.aClass86_Sub1_Sub2_6.anIntArray264[local11];
		if (local17 != this.anInt1223) {
			if (local17 != 0) {
				OpenGL.glBindTexture(local17, 0);
				OpenGL.glDisable(local17);
			}
			OpenGL.glEnable(this.anInt1223);
			this.aClass86_Sub1_Sub2_6.anIntArray264[local11] = this.anInt1223;
		}
		OpenGL.glBindTexture(this.anInt1223, this.anInt1219);
	}

	@OriginalMember(owner = "client!qm", name = "af", descriptor = "(Lclient!lo;)V", line = 54)
	@Override
	public void method10856(@OriginalArg(0) Class382 arg0) {
		if (this.aClass382_4 != arg0) {
			this.aClass382_4 = arg0;
			this.method10568();
		}
	}

	@OriginalMember(owner = "client!qm", name = "az", descriptor = "(Lclient!lo;)V", line = 54)
	@Override
	public void method10855(@OriginalArg(0) Class382 arg0) {
		if (this.aClass382_4 != arg0) {
			this.aClass382_4 = arg0;
			this.method10568();
		}
	}

	@OriginalMember(owner = "client!qm", name = "aw", descriptor = "(Lclient!lo;)V", line = 54)
	@Override
	public void method10854(@OriginalArg(0) Class382 arg0) {
		if (this.aClass382_4 != arg0) {
			this.aClass382_4 = arg0;
			this.method10568();
		}
	}

	@OriginalMember(owner = "client!qm", name = "ba", descriptor = "()V", line = 61)
	void method10568() {
		if (this.anInt1219 == 0) {
			throw new IllegalStateException("");
		}
		this.aClass86_Sub1_Sub2_6.method20542(this);
		if (this.aClass382_4 == Class382.aClass382_5) {
			OpenGL.glTexParameteri(this.anInt1223, 10241, this.aBoolean214 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt1223, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt1223, 10241, this.aBoolean214 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt1223, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!qm", name = "bi", descriptor = "()V", line = 61)
	void method10569() {
		if (this.anInt1219 == 0) {
			throw new IllegalStateException("");
		}
		this.aClass86_Sub1_Sub2_6.method20542(this);
		if (this.aClass382_4 == Class382.aClass382_5) {
			OpenGL.glTexParameteri(this.anInt1223, 10241, this.aBoolean214 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt1223, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt1223, 10241, this.aBoolean214 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt1223, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!qm", name = "bg", descriptor = "()V", line = 61)
	void method10570() {
		if (this.anInt1219 == 0) {
			throw new IllegalStateException("");
		}
		this.aClass86_Sub1_Sub2_6.method20542(this);
		if (this.aClass382_4 == Class382.aClass382_5) {
			OpenGL.glTexParameteri(this.anInt1223, 10241, this.aBoolean214 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt1223, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt1223, 10241, this.aBoolean214 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt1223, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!qm", name = "am", descriptor = "()Z", line = 74)
	boolean method10571() {
		if (this.anInt1219 == 0) {
			throw new IllegalStateException("");
		}
		@Pc(10) int local10 = this.method10588();
		this.aClass86_Sub1_Sub2_6.method20542(this);
		if (this.aClass86_Sub1_Sub2_6.aBoolean465) {
			OpenGL.glEnable(this.anInt1223);
		}
		OpenGL.glGenerateMipmapEXT(this.anInt1223);
		if (this.aClass86_Sub1_Sub2_6.aBoolean465) {
			OpenGL.glDisable(this.anInt1223);
		}
		this.aBoolean214 = true;
		this.method10568();
		this.method10585(local10);
		return true;
	}

	@OriginalMember(owner = "client!qm", name = "u", descriptor = "()Z", line = 74)
	boolean method10572() {
		if (this.anInt1219 == 0) {
			throw new IllegalStateException("");
		}
		@Pc(10) int local10 = this.method10588();
		this.aClass86_Sub1_Sub2_6.method20542(this);
		if (this.aClass86_Sub1_Sub2_6.aBoolean465) {
			OpenGL.glEnable(this.anInt1223);
		}
		OpenGL.glGenerateMipmapEXT(this.anInt1223);
		if (this.aClass86_Sub1_Sub2_6.aBoolean465) {
			OpenGL.glDisable(this.anInt1223);
		}
		this.aBoolean214 = true;
		this.method10568();
		this.method10585(local10);
		return true;
	}

	@OriginalMember(owner = "client!qm", name = "as", descriptor = "()Z", line = 74)
	boolean method10573() {
		if (this.anInt1219 == 0) {
			throw new IllegalStateException("");
		}
		@Pc(10) int local10 = this.method10588();
		this.aClass86_Sub1_Sub2_6.method20542(this);
		if (this.aClass86_Sub1_Sub2_6.aBoolean465) {
			OpenGL.glEnable(this.anInt1223);
		}
		OpenGL.glGenerateMipmapEXT(this.anInt1223);
		if (this.aClass86_Sub1_Sub2_6.aBoolean465) {
			OpenGL.glDisable(this.anInt1223);
		}
		this.aBoolean214 = true;
		this.method10568();
		this.method10585(local10);
		return true;
	}

	@OriginalMember(owner = "client!qm", name = "aq", descriptor = "()Z", line = 74)
	boolean method10574() {
		if (this.anInt1219 == 0) {
			throw new IllegalStateException("");
		}
		@Pc(10) int local10 = this.method10588();
		this.aClass86_Sub1_Sub2_6.method20542(this);
		if (this.aClass86_Sub1_Sub2_6.aBoolean465) {
			OpenGL.glEnable(this.anInt1223);
		}
		OpenGL.glGenerateMipmapEXT(this.anInt1223);
		if (this.aClass86_Sub1_Sub2_6.aBoolean465) {
			OpenGL.glDisable(this.anInt1223);
		}
		this.aBoolean214 = true;
		this.method10568();
		this.method10585(local10);
		return true;
	}

	@OriginalMember(owner = "client!qm", name = "bl", descriptor = "(III[I)V", line = 87)
	void method10575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		if (this.anInt1219 == 0) {
			throw new IllegalStateException("");
		} else if (arg1 > 0 && !Class562.method31306(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg2 > 0 && !Class562.method31306(arg2)) {
			throw new IllegalArgumentException("");
		} else if (this.aClass212_13 == Class212.aClass212_18) {
			@Pc(40) int local40 = 0;
			@Pc(47) int local47 = arg1 < arg2 ? arg1 : arg2;
			@Pc(51) int local51 = arg1 >> 1;
			@Pc(55) int local55 = arg2 >> 1;
			@Pc(57) int[] local57 = arg3;
			@Pc(62) int[] local62 = new int[local51 * local55];
			while (true) {
				OpenGL.glTexImage2Di(arg0, local40, Class86_Sub1_Sub2.method20812(this.aClass212_13, this.aClass206_13), arg1, arg2, 0, 32993, this.aClass86_Sub1_Sub2_6.anInt2854, local57, 0);
				if (local47 <= 1) {
					return;
				}
				@Pc(84) int local84 = 0;
				@Pc(86) int local86 = 0;
				@Pc(90) int local90 = local86 + arg1;
				for (@Pc(92) int local92 = 0; local92 < local55; local92++) {
					for (@Pc(97) int local97 = 0; local97 < local51; local97++) {
						@Pc(105) int local105 = local57[local86++];
						@Pc(110) int local110 = local57[local86++];
						@Pc(115) int local115 = local57[local90++];
						@Pc(120) int local120 = local57[local90++];
						@Pc(126) int local126 = local105 >> 24 & 0xFF;
						@Pc(132) int local132 = local105 >> 16 & 0xFF;
						@Pc(138) int local138 = local105 >> 8 & 0xFF;
						@Pc(142) int local142 = local105 & 0xFF;
						@Pc(150) int local150 = local126 + (local110 >> 24 & 0xFF);
						@Pc(158) int local158 = local132 + (local110 >> 16 & 0xFF);
						@Pc(166) int local166 = local138 + (local110 >> 8 & 0xFF);
						@Pc(172) int local172 = local142 + (local110 & 0xFF);
						@Pc(180) int local180 = local150 + (local115 >> 24 & 0xFF);
						@Pc(188) int local188 = local158 + (local115 >> 16 & 0xFF);
						@Pc(196) int local196 = local166 + (local115 >> 8 & 0xFF);
						@Pc(202) int local202 = local172 + (local115 & 0xFF);
						@Pc(210) int local210 = local180 + (local120 >> 24 & 0xFF);
						@Pc(218) int local218 = local188 + (local120 >> 16 & 0xFF);
						@Pc(226) int local226 = local196 + (local120 >> 8 & 0xFF);
						@Pc(232) int local232 = local202 + (local120 & 0xFF);
						local62[local84++] = (local210 & 0x3FC) << 22 | (local218 & 0x3FC) << 14 | (local226 & 0x3FC) << 6 | local232 >> 2 & 0xFF;
					}
					local86 += arg1;
					local90 += arg1;
				}
				@Pc(273) int[] local273 = local62;
				local62 = local57;
				local57 = local273;
				arg1 = local51;
				arg2 = local55;
				local51 >>= 0x1;
				local55 >>= 0x1;
				local47 >>= 0x1;
				local40++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!qm", name = "bt", descriptor = "(III[I)V", line = 87)
	void method10576(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		if (this.anInt1219 == 0) {
			throw new IllegalStateException("");
		} else if (arg1 > 0 && !Class562.method31306(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg2 > 0 && !Class562.method31306(arg2)) {
			throw new IllegalArgumentException("");
		} else if (this.aClass212_13 == Class212.aClass212_18) {
			@Pc(40) int local40 = 0;
			@Pc(47) int local47 = arg1 < arg2 ? arg1 : arg2;
			@Pc(51) int local51 = arg1 >> 1;
			@Pc(55) int local55 = arg2 >> 1;
			@Pc(57) int[] local57 = arg3;
			@Pc(62) int[] local62 = new int[local51 * local55];
			while (true) {
				OpenGL.glTexImage2Di(arg0, local40, Class86_Sub1_Sub2.method20812(this.aClass212_13, this.aClass206_13), arg1, arg2, 0, 32993, this.aClass86_Sub1_Sub2_6.anInt2854, local57, 0);
				if (local47 <= 1) {
					return;
				}
				@Pc(84) int local84 = 0;
				@Pc(86) int local86 = 0;
				@Pc(90) int local90 = local86 + arg1;
				for (@Pc(92) int local92 = 0; local92 < local55; local92++) {
					for (@Pc(97) int local97 = 0; local97 < local51; local97++) {
						@Pc(105) int local105 = local57[local86++];
						@Pc(110) int local110 = local57[local86++];
						@Pc(115) int local115 = local57[local90++];
						@Pc(120) int local120 = local57[local90++];
						@Pc(126) int local126 = local105 >> 24 & 0xFF;
						@Pc(132) int local132 = local105 >> 16 & 0xFF;
						@Pc(138) int local138 = local105 >> 8 & 0xFF;
						@Pc(142) int local142 = local105 & 0xFF;
						@Pc(150) int local150 = local126 + (local110 >> 24 & 0xFF);
						@Pc(158) int local158 = local132 + (local110 >> 16 & 0xFF);
						@Pc(166) int local166 = local138 + (local110 >> 8 & 0xFF);
						@Pc(172) int local172 = local142 + (local110 & 0xFF);
						@Pc(180) int local180 = local150 + (local115 >> 24 & 0xFF);
						@Pc(188) int local188 = local158 + (local115 >> 16 & 0xFF);
						@Pc(196) int local196 = local166 + (local115 >> 8 & 0xFF);
						@Pc(202) int local202 = local172 + (local115 & 0xFF);
						@Pc(210) int local210 = local180 + (local120 >> 24 & 0xFF);
						@Pc(218) int local218 = local188 + (local120 >> 16 & 0xFF);
						@Pc(226) int local226 = local196 + (local120 >> 8 & 0xFF);
						@Pc(232) int local232 = local202 + (local120 & 0xFF);
						local62[local84++] = (local210 & 0x3FC) << 22 | (local218 & 0x3FC) << 14 | (local226 & 0x3FC) << 6 | local232 >> 2 & 0xFF;
					}
					local86 += arg1;
					local90 += arg1;
				}
				@Pc(273) int[] local273 = local62;
				local62 = local57;
				local57 = local273;
				arg1 = local51;
				arg2 = local55;
				local51 >>= 0x1;
				local55 >>= 0x1;
				local47 >>= 0x1;
				local40++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!qm", name = "bs", descriptor = "(III[I)V", line = 87)
	void method10577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		if (this.anInt1219 == 0) {
			throw new IllegalStateException("");
		} else if (arg1 > 0 && !Class562.method31306(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg2 > 0 && !Class562.method31306(arg2)) {
			throw new IllegalArgumentException("");
		} else if (this.aClass212_13 == Class212.aClass212_18) {
			@Pc(40) int local40 = 0;
			@Pc(47) int local47 = arg1 < arg2 ? arg1 : arg2;
			@Pc(51) int local51 = arg1 >> 1;
			@Pc(55) int local55 = arg2 >> 1;
			@Pc(57) int[] local57 = arg3;
			@Pc(62) int[] local62 = new int[local51 * local55];
			while (true) {
				OpenGL.glTexImage2Di(arg0, local40, Class86_Sub1_Sub2.method20812(this.aClass212_13, this.aClass206_13), arg1, arg2, 0, 32993, this.aClass86_Sub1_Sub2_6.anInt2854, local57, 0);
				if (local47 <= 1) {
					return;
				}
				@Pc(84) int local84 = 0;
				@Pc(86) int local86 = 0;
				@Pc(90) int local90 = local86 + arg1;
				for (@Pc(92) int local92 = 0; local92 < local55; local92++) {
					for (@Pc(97) int local97 = 0; local97 < local51; local97++) {
						@Pc(105) int local105 = local57[local86++];
						@Pc(110) int local110 = local57[local86++];
						@Pc(115) int local115 = local57[local90++];
						@Pc(120) int local120 = local57[local90++];
						@Pc(126) int local126 = local105 >> 24 & 0xFF;
						@Pc(132) int local132 = local105 >> 16 & 0xFF;
						@Pc(138) int local138 = local105 >> 8 & 0xFF;
						@Pc(142) int local142 = local105 & 0xFF;
						@Pc(150) int local150 = local126 + (local110 >> 24 & 0xFF);
						@Pc(158) int local158 = local132 + (local110 >> 16 & 0xFF);
						@Pc(166) int local166 = local138 + (local110 >> 8 & 0xFF);
						@Pc(172) int local172 = local142 + (local110 & 0xFF);
						@Pc(180) int local180 = local150 + (local115 >> 24 & 0xFF);
						@Pc(188) int local188 = local158 + (local115 >> 16 & 0xFF);
						@Pc(196) int local196 = local166 + (local115 >> 8 & 0xFF);
						@Pc(202) int local202 = local172 + (local115 & 0xFF);
						@Pc(210) int local210 = local180 + (local120 >> 24 & 0xFF);
						@Pc(218) int local218 = local188 + (local120 >> 16 & 0xFF);
						@Pc(226) int local226 = local196 + (local120 >> 8 & 0xFF);
						@Pc(232) int local232 = local202 + (local120 & 0xFF);
						local62[local84++] = (local210 & 0x3FC) << 22 | (local218 & 0x3FC) << 14 | (local226 & 0x3FC) << 6 | local232 >> 2 & 0xFF;
					}
					local86 += arg1;
					local90 += arg1;
				}
				@Pc(273) int[] local273 = local62;
				local62 = local57;
				local57 = local273;
				arg1 = local51;
				arg2 = local55;
				local51 >>= 0x1;
				local55 >>= 0x1;
				local47 >>= 0x1;
				local40++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!qm", name = "bz", descriptor = "(III[B)V", line = 154)
	void method10578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		if (this.anInt1219 == 0) {
			throw new IllegalStateException("");
		} else if (arg1 > 0 && !Class562.method31306(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Class562.method31306(arg2)) {
			@Pc(35) int local35 = this.aClass212_13.anInt3679 * 1676120375;
			@Pc(37) int local37 = 0;
			@Pc(44) int local44 = arg1 < arg2 ? arg1 : arg2;
			@Pc(48) int local48 = arg1 >> 1;
			@Pc(52) int local52 = arg2 >> 1;
			@Pc(54) byte[] local54 = arg3;
			@Pc(61) byte[] local61 = new byte[local48 * local52 * local35];
			while (true) {
				OpenGL.glTexImage2Dub(arg0, local37, Class86_Sub1_Sub2.method20812(this.aClass212_13, this.aClass206_13), arg1, arg2, 0, Class86_Sub1_Sub2.method20810(this.aClass212_13), 5121, local54, 0);
				if (local44 <= 1) {
					return;
				}
				@Pc(85) int local85 = arg1 * local35;
				for (@Pc(87) int local87 = 0; local87 < local35; local87++) {
					@Pc(92) int local92 = local87;
					@Pc(94) int local94 = local87;
					@Pc(98) int local98 = local87 + local85;
					for (@Pc(100) int local100 = 0; local100 < local52; local100++) {
						for (@Pc(105) int local105 = 0; local105 < local48; local105++) {
							@Pc(112) byte local112 = local54[local94];
							local94 += local35;
							@Pc(122) int local122 = local112 + local54[local94];
							local94 += local35;
							@Pc(132) int local132 = local122 + local54[local98];
							local98 += local35;
							@Pc(142) int local142 = local132 + local54[local98];
							local98 += local35;
							local61[local92] = (byte) (local142 >> 2);
							local92 += local35;
						}
						local94 += local85;
						local98 += local85;
					}
				}
				@Pc(173) byte[] local173 = local61;
				local61 = local54;
				local54 = local173;
				arg1 = local48;
				arg2 = local52;
				local48 >>= 0x1;
				local52 >>= 0x1;
				local44 >>= 0x1;
				local37++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!qm", name = "bu", descriptor = "(III[B)V", line = 154)
	void method10579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		if (this.anInt1219 == 0) {
			throw new IllegalStateException("");
		} else if (arg1 > 0 && !Class562.method31306(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Class562.method31306(arg2)) {
			@Pc(35) int local35 = this.aClass212_13.anInt3679 * 1676120375;
			@Pc(37) int local37 = 0;
			@Pc(44) int local44 = arg1 < arg2 ? arg1 : arg2;
			@Pc(48) int local48 = arg1 >> 1;
			@Pc(52) int local52 = arg2 >> 1;
			@Pc(54) byte[] local54 = arg3;
			@Pc(61) byte[] local61 = new byte[local48 * local52 * local35];
			while (true) {
				OpenGL.glTexImage2Dub(arg0, local37, Class86_Sub1_Sub2.method20812(this.aClass212_13, this.aClass206_13), arg1, arg2, 0, Class86_Sub1_Sub2.method20810(this.aClass212_13), 5121, local54, 0);
				if (local44 <= 1) {
					return;
				}
				@Pc(85) int local85 = arg1 * local35;
				for (@Pc(87) int local87 = 0; local87 < local35; local87++) {
					@Pc(92) int local92 = local87;
					@Pc(94) int local94 = local87;
					@Pc(98) int local98 = local87 + local85;
					for (@Pc(100) int local100 = 0; local100 < local52; local100++) {
						for (@Pc(105) int local105 = 0; local105 < local48; local105++) {
							@Pc(112) byte local112 = local54[local94];
							local94 += local35;
							@Pc(122) int local122 = local112 + local54[local94];
							local94 += local35;
							@Pc(132) int local132 = local122 + local54[local98];
							local98 += local35;
							@Pc(142) int local142 = local132 + local54[local98];
							local98 += local35;
							local61[local92] = (byte) (local142 >> 2);
							local92 += local35;
						}
						local94 += local85;
						local98 += local85;
					}
				}
				@Pc(173) byte[] local173 = local61;
				local61 = local54;
				local54 = local173;
				arg1 = local48;
				arg2 = local52;
				local48 >>= 0x1;
				local52 >>= 0x1;
				local44 >>= 0x1;
				local37++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!qm", name = "bf", descriptor = "(III[B)V", line = 154)
	void method10580(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		if (this.anInt1219 == 0) {
			throw new IllegalStateException("");
		} else if (arg1 > 0 && !Class562.method31306(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Class562.method31306(arg2)) {
			@Pc(35) int local35 = this.aClass212_13.anInt3679 * 1676120375;
			@Pc(37) int local37 = 0;
			@Pc(44) int local44 = arg1 < arg2 ? arg1 : arg2;
			@Pc(48) int local48 = arg1 >> 1;
			@Pc(52) int local52 = arg2 >> 1;
			@Pc(54) byte[] local54 = arg3;
			@Pc(61) byte[] local61 = new byte[local48 * local52 * local35];
			while (true) {
				OpenGL.glTexImage2Dub(arg0, local37, Class86_Sub1_Sub2.method20812(this.aClass212_13, this.aClass206_13), arg1, arg2, 0, Class86_Sub1_Sub2.method20810(this.aClass212_13), 5121, local54, 0);
				if (local44 <= 1) {
					return;
				}
				@Pc(85) int local85 = arg1 * local35;
				for (@Pc(87) int local87 = 0; local87 < local35; local87++) {
					@Pc(92) int local92 = local87;
					@Pc(94) int local94 = local87;
					@Pc(98) int local98 = local87 + local85;
					for (@Pc(100) int local100 = 0; local100 < local52; local100++) {
						for (@Pc(105) int local105 = 0; local105 < local48; local105++) {
							@Pc(112) byte local112 = local54[local94];
							local94 += local35;
							@Pc(122) int local122 = local112 + local54[local94];
							local94 += local35;
							@Pc(132) int local132 = local122 + local54[local98];
							local98 += local35;
							@Pc(142) int local142 = local132 + local54[local98];
							local98 += local35;
							local61[local92] = (byte) (local142 >> 2);
							local92 += local35;
						}
						local94 += local85;
						local98 += local85;
					}
				}
				@Pc(173) byte[] local173 = local61;
				local61 = local54;
				local54 = local173;
				arg1 = local48;
				arg2 = local52;
				local48 >>= 0x1;
				local52 >>= 0x1;
				local44 >>= 0x1;
				local37++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!qm", name = "bb", descriptor = "(III[B)V", line = 154)
	void method10581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		if (this.anInt1219 == 0) {
			throw new IllegalStateException("");
		} else if (arg1 > 0 && !Class562.method31306(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Class562.method31306(arg2)) {
			@Pc(35) int local35 = this.aClass212_13.anInt3679 * 1676120375;
			@Pc(37) int local37 = 0;
			@Pc(44) int local44 = arg1 < arg2 ? arg1 : arg2;
			@Pc(48) int local48 = arg1 >> 1;
			@Pc(52) int local52 = arg2 >> 1;
			@Pc(54) byte[] local54 = arg3;
			@Pc(61) byte[] local61 = new byte[local48 * local52 * local35];
			while (true) {
				OpenGL.glTexImage2Dub(arg0, local37, Class86_Sub1_Sub2.method20812(this.aClass212_13, this.aClass206_13), arg1, arg2, 0, Class86_Sub1_Sub2.method20810(this.aClass212_13), 5121, local54, 0);
				if (local44 <= 1) {
					return;
				}
				@Pc(85) int local85 = arg1 * local35;
				for (@Pc(87) int local87 = 0; local87 < local35; local87++) {
					@Pc(92) int local92 = local87;
					@Pc(94) int local94 = local87;
					@Pc(98) int local98 = local87 + local85;
					for (@Pc(100) int local100 = 0; local100 < local52; local100++) {
						for (@Pc(105) int local105 = 0; local105 < local48; local105++) {
							@Pc(112) byte local112 = local54[local94];
							local94 += local35;
							@Pc(122) int local122 = local112 + local54[local94];
							local94 += local35;
							@Pc(132) int local132 = local122 + local54[local98];
							local98 += local35;
							@Pc(142) int local142 = local132 + local54[local98];
							local98 += local35;
							local61[local92] = (byte) (local142 >> 2);
							local92 += local35;
						}
						local94 += local85;
						local98 += local85;
					}
				}
				@Pc(173) byte[] local173 = local61;
				local61 = local54;
				local54 = local173;
				arg1 = local48;
				arg2 = local52;
				local48 >>= 0x1;
				local52 >>= 0x1;
				local44 >>= 0x1;
				local37++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!qm", name = "bd", descriptor = "(III[F)V", line = 206)
	void method10582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3) {
		if (this.anInt1219 == 0) {
			throw new IllegalStateException("");
		} else if (arg1 > 0 && !Class562.method31306(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Class562.method31306(arg2)) {
			@Pc(35) int local35 = this.aClass212_13.anInt3679 * 1676120375;
			@Pc(37) int local37 = 0;
			@Pc(44) int local44 = arg1 < arg2 ? arg1 : arg2;
			@Pc(48) int local48 = arg1 >> 1;
			@Pc(52) int local52 = arg2 >> 1;
			@Pc(54) float[] local54 = arg3;
			@Pc(61) float[] local61 = new float[local48 * local52 * local35];
			while (true) {
				OpenGL.glTexImage2Df(arg0, local37, Class86_Sub1_Sub2.method20812(this.aClass212_13, this.aClass206_13), arg1, arg2, 0, Class86_Sub1_Sub2.method20810(this.aClass212_13), 5126, local54, 0);
				if (local44 <= 1) {
					return;
				}
				@Pc(85) int local85 = arg1 * local35;
				for (@Pc(87) int local87 = 0; local87 < local35; local87++) {
					@Pc(92) int local92 = local87;
					@Pc(94) int local94 = local87;
					@Pc(98) int local98 = local87 + local85;
					for (@Pc(100) int local100 = 0; local100 < local52; local100++) {
						for (@Pc(105) int local105 = 0; local105 < local48; local105++) {
							@Pc(112) float local112 = local54[local94];
							local94 += local35;
							@Pc(122) float local122 = local112 + local54[local94];
							local94 += local35;
							@Pc(132) float local132 = local122 + local54[local98];
							local98 += local35;
							@Pc(142) float local142 = local132 + local54[local98];
							local98 += local35;
							local61[local92] = local142 * 0.25F;
							local92 += local35;
						}
						local94 += local85;
						local98 += local85;
					}
				}
				@Pc(172) float[] local172 = local61;
				local61 = local54;
				local54 = local172;
				arg1 = local48;
				arg2 = local52;
				local48 >>= 0x1;
				local52 >>= 0x1;
				local44 >>= 0x1;
				local37++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!qm", name = "bn", descriptor = "(III[F)V", line = 206)
	void method10583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3) {
		if (this.anInt1219 == 0) {
			throw new IllegalStateException("");
		} else if (arg1 > 0 && !Class562.method31306(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Class562.method31306(arg2)) {
			@Pc(35) int local35 = this.aClass212_13.anInt3679 * 1676120375;
			@Pc(37) int local37 = 0;
			@Pc(44) int local44 = arg1 < arg2 ? arg1 : arg2;
			@Pc(48) int local48 = arg1 >> 1;
			@Pc(52) int local52 = arg2 >> 1;
			@Pc(54) float[] local54 = arg3;
			@Pc(61) float[] local61 = new float[local48 * local52 * local35];
			while (true) {
				OpenGL.glTexImage2Df(arg0, local37, Class86_Sub1_Sub2.method20812(this.aClass212_13, this.aClass206_13), arg1, arg2, 0, Class86_Sub1_Sub2.method20810(this.aClass212_13), 5126, local54, 0);
				if (local44 <= 1) {
					return;
				}
				@Pc(85) int local85 = arg1 * local35;
				for (@Pc(87) int local87 = 0; local87 < local35; local87++) {
					@Pc(92) int local92 = local87;
					@Pc(94) int local94 = local87;
					@Pc(98) int local98 = local87 + local85;
					for (@Pc(100) int local100 = 0; local100 < local52; local100++) {
						for (@Pc(105) int local105 = 0; local105 < local48; local105++) {
							@Pc(112) float local112 = local54[local94];
							local94 += local35;
							@Pc(122) float local122 = local112 + local54[local94];
							local94 += local35;
							@Pc(132) float local132 = local122 + local54[local98];
							local98 += local35;
							@Pc(142) float local142 = local132 + local54[local98];
							local98 += local35;
							local61[local92] = local142 * 0.25F;
							local92 += local35;
						}
						local94 += local85;
						local98 += local85;
					}
				}
				@Pc(172) float[] local172 = local61;
				local61 = local54;
				local54 = local172;
				arg1 = local48;
				arg2 = local52;
				local48 >>= 0x1;
				local52 >>= 0x1;
				local44 >>= 0x1;
				local37++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!qm", name = "bp", descriptor = "(III[F)V", line = 206)
	void method10584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3) {
		if (this.anInt1219 == 0) {
			throw new IllegalStateException("");
		} else if (arg1 > 0 && !Class562.method31306(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Class562.method31306(arg2)) {
			@Pc(35) int local35 = this.aClass212_13.anInt3679 * 1676120375;
			@Pc(37) int local37 = 0;
			@Pc(44) int local44 = arg1 < arg2 ? arg1 : arg2;
			@Pc(48) int local48 = arg1 >> 1;
			@Pc(52) int local52 = arg2 >> 1;
			@Pc(54) float[] local54 = arg3;
			@Pc(61) float[] local61 = new float[local48 * local52 * local35];
			while (true) {
				OpenGL.glTexImage2Df(arg0, local37, Class86_Sub1_Sub2.method20812(this.aClass212_13, this.aClass206_13), arg1, arg2, 0, Class86_Sub1_Sub2.method20810(this.aClass212_13), 5126, local54, 0);
				if (local44 <= 1) {
					return;
				}
				@Pc(85) int local85 = arg1 * local35;
				for (@Pc(87) int local87 = 0; local87 < local35; local87++) {
					@Pc(92) int local92 = local87;
					@Pc(94) int local94 = local87;
					@Pc(98) int local98 = local87 + local85;
					for (@Pc(100) int local100 = 0; local100 < local52; local100++) {
						for (@Pc(105) int local105 = 0; local105 < local48; local105++) {
							@Pc(112) float local112 = local54[local94];
							local94 += local35;
							@Pc(122) float local122 = local112 + local54[local94];
							local94 += local35;
							@Pc(132) float local132 = local122 + local54[local98];
							local98 += local35;
							@Pc(142) float local142 = local132 + local54[local98];
							local98 += local35;
							local61[local92] = local142 * 0.25F;
							local92 += local35;
						}
						local94 += local85;
						local98 += local85;
					}
				}
				@Pc(172) float[] local172 = local61;
				local61 = local54;
				local54 = local172;
				arg1 = local48;
				arg2 = local52;
				local48 >>= 0x1;
				local52 >>= 0x1;
				local44 >>= 0x1;
				local37++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!qm", name = "by", descriptor = "(I)V", line = 258)
	void method10585(@OriginalArg(0) int arg0) {
		this.aClass86_Sub1_Sub2_6.anInt2809 -= arg0;
		this.aClass86_Sub1_Sub2_6.anInt2809 += this.method10588();
	}

	@OriginalMember(owner = "client!qm", name = "bo", descriptor = "(I)V", line = 258)
	void method10586(@OriginalArg(0) int arg0) {
		this.aClass86_Sub1_Sub2_6.anInt2809 -= arg0;
		this.aClass86_Sub1_Sub2_6.anInt2809 += this.method10588();
	}

	@OriginalMember(owner = "client!qm", name = "bm", descriptor = "(I)V", line = 258)
	void method10587(@OriginalArg(0) int arg0) {
		this.aClass86_Sub1_Sub2_6.anInt2809 -= arg0;
		this.aClass86_Sub1_Sub2_6.anInt2809 += this.method10588();
	}

	@OriginalMember(owner = "client!qm", name = "bx", descriptor = "()I", line = 263)
	int method10588() {
		@Pc(14) int local14 = this.aClass212_13.anInt3679 * 1676120375 * this.aClass206_13.anInt3581 * 1899960707 * this.anInt1222;
		return this.aBoolean214 ? local14 * 4 / 3 : local14;
	}

	@OriginalMember(owner = "client!qm", name = "bk", descriptor = "()I", line = 263)
	int method10589() {
		@Pc(14) int local14 = this.aClass212_13.anInt3679 * 1676120375 * this.aClass206_13.anInt3581 * 1899960707 * this.anInt1222;
		return this.aBoolean214 ? local14 * 4 / 3 : local14;
	}

	@OriginalMember(owner = "client!qm", name = "br", descriptor = "()I", line = 263)
	int method10590() {
		@Pc(14) int local14 = this.aClass212_13.anInt3679 * 1676120375 * this.aClass206_13.anInt3581 * 1899960707 * this.anInt1222;
		return this.aBoolean214 ? local14 * 4 / 3 : local14;
	}

	@OriginalMember(owner = "client!qm", name = "s", descriptor = "()V", line = 268)
	@Override
	public void method30320() {
		if (this.anInt1219 != 0) {
			this.aClass86_Sub1_Sub2_6.anInt2809 -= this.method10588();
			@Pc(13) int[] local13 = new int[] { this.anInt1219 };
			OpenGL.glDeleteTextures(1, local13, 0);
			this.anInt1219 = 0;
		}
	}

	@OriginalMember(owner = "client!qm", name = "v", descriptor = "()V", line = 268)
	@Override
	public void method30322() {
		if (this.anInt1219 != 0) {
			this.aClass86_Sub1_Sub2_6.anInt2809 -= this.method10588();
			@Pc(13) int[] local13 = new int[] { this.anInt1219 };
			OpenGL.glDeleteTextures(1, local13, 0);
			this.anInt1219 = 0;
		}
	}

	@OriginalMember(owner = "client!qm", name = "r", descriptor = "()V", line = 268)
	@Override
	public void method30321() {
		if (this.anInt1219 != 0) {
			this.aClass86_Sub1_Sub2_6.anInt2809 -= this.method10588();
			@Pc(13) int[] local13 = new int[] { this.anInt1219 };
			OpenGL.glDeleteTextures(1, local13, 0);
			this.anInt1219 = 0;
		}
	}

	@OriginalMember(owner = "client!qm", name = "g", descriptor = "()V", line = 268)
	@Override
	public void method30319() {
		if (this.anInt1219 != 0) {
			this.aClass86_Sub1_Sub2_6.anInt2809 -= this.method10588();
			@Pc(13) int[] local13 = new int[] { this.anInt1219 };
			OpenGL.glDeleteTextures(1, local13, 0);
			this.anInt1219 = 0;
		}
	}

	@OriginalMember(owner = "client!qm", name = "bw", descriptor = "()V", line = 278)
	void method10591() {
		if (this.anInt1219 != 0) {
			this.aClass86_Sub1_Sub2_6.method20794(this.anInt1219, this.method10588());
			this.anInt1219 = 0;
		}
	}

	@OriginalMember(owner = "client!qm", name = "bh", descriptor = "()V", line = 278)
	void method10592() {
		if (this.anInt1219 != 0) {
			this.aClass86_Sub1_Sub2_6.method20794(this.anInt1219, this.method10588());
			this.anInt1219 = 0;
		}
	}

	@OriginalMember(owner = "client!qm", name = "bq", descriptor = "()V", line = 278)
	void method10593() {
		if (this.anInt1219 != 0) {
			this.aClass86_Sub1_Sub2_6.method20794(this.anInt1219, this.method10588());
			this.anInt1219 = 0;
		}
	}

	@OriginalMember(owner = "client!qm", name = "be", descriptor = "()V", line = 278)
	void method10594() {
		if (this.anInt1219 != 0) {
			this.aClass86_Sub1_Sub2_6.method20794(this.anInt1219, this.method10588());
			this.anInt1219 = 0;
		}
	}

	@OriginalMember(owner = "client!qm", name = "finalize", descriptor = "()V", line = 285)
	@Override
	void finalize() throws Throwable {
		this.method10591();
		super.finalize();
	}

	@OriginalMember(owner = "client!qm", name = "hc", descriptor = "()V", line = 285)
	void method10595() throws Throwable {
		this.method10591();
		super.finalize();
	}

	@OriginalMember(owner = "client!qm", name = "hd", descriptor = "()V", line = 285)
	void method10596() throws Throwable {
		this.method10591();
		super.finalize();
	}

	@OriginalMember(owner = "client!qm", name = "hp", descriptor = "()V", line = 285)
	void method10597() throws Throwable {
		this.method10591();
		super.finalize();
	}
}
