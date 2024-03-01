package com.jagex;

import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akk")
public final class Class21_Sub3_Sub1 extends Class21_Sub3 {

	@OriginalMember(owner = "client!akk", name = "hg", descriptor = "J")
	long aLong99;

	@OriginalMember(owner = "client!akk", name = "hz", descriptor = "I")
	int anInt2344;

	@OriginalMember(owner = "client!akk", name = "hd", descriptor = "Z")
	boolean aBoolean399;

	@OriginalMember(owner = "client!akk", name = "hb", descriptor = "Z")
	boolean aBoolean400;

	@OriginalMember(owner = "client!akk", name = "hs", descriptor = "Lclient!aef;")
	Class35_Sub2 aClass35_Sub2_1;

	@OriginalMember(owner = "client!akk", name = "hw", descriptor = "Lclient!acj;")
	Class25_Sub2 aClass25_Sub2_2;

	@OriginalMember(owner = "client!akk", name = "ho", descriptor = "Z")
	boolean aBoolean407;

	@OriginalMember(owner = "client!akk", name = "hm", descriptor = "Z")
	boolean aBoolean409;

	@OriginalMember(owner = "client!akk", name = "gb", descriptor = "Lclient!wk;")
	Class553 aClass553_30 = new Class553();

	@OriginalMember(owner = "client!akk", name = "gl", descriptor = "Lclient!wk;")
	Class553 aClass553_35 = new Class553();

	@OriginalMember(owner = "client!akk", name = "gu", descriptor = "Lclient!wk;")
	Class553 aClass553_31 = new Class553();

	@OriginalMember(owner = "client!akk", name = "gg", descriptor = "Lclient!wk;")
	Class553 aClass553_32 = new Class553();

	@OriginalMember(owner = "client!akk", name = "hi", descriptor = "Lclient!wk;")
	Class553 aClass553_33 = new Class553();

	@OriginalMember(owner = "client!akk", name = "hk", descriptor = "Lclient!wk;")
	Class553 aClass553_36 = new Class553();

	@OriginalMember(owner = "client!akk", name = "ha", descriptor = "Lclient!wk;")
	Class553 aClass553_34 = new Class553();

	@OriginalMember(owner = "client!akk", name = "hc", descriptor = "[I")
	final int[] anIntArray228 = new int[1000];

	@OriginalMember(owner = "client!akk", name = "hx", descriptor = "[Lclient!adi;")
	Class35_Sub1[] aClass35_Sub1Array1 = new Class35_Sub1[16];

	@OriginalMember(owner = "client!akk", name = "ib", descriptor = "[F")
	final float[] aFloatArray66;

	@OriginalMember(owner = "client!akk", name = "ik", descriptor = "[F")
	final float[] aFloatArray67;

	@OriginalMember(owner = "client!akk", name = "gi", descriptor = "Lclient!jaggl/OpenGL;")
	OpenGL anOpenGL2;

	@OriginalMember(owner = "client!akk", name = "hr", descriptor = "Ljava/lang/String;")
	final String aString73;

	@OriginalMember(owner = "client!akk", name = "hf", descriptor = "Ljava/lang/String;")
	final String aString74;

	@OriginalMember(owner = "client!akk", name = "hp", descriptor = "I")
	final int anInt2345;

	@OriginalMember(owner = "client!akk", name = "hq", descriptor = "Z")
	boolean aBoolean406;

	@OriginalMember(owner = "client!akk", name = "hv", descriptor = "Z")
	boolean aBoolean405;

	@OriginalMember(owner = "client!akk", name = "ht", descriptor = "Z")
	boolean aBoolean401;

	@OriginalMember(owner = "client!akk", name = "he", descriptor = "Z")
	final boolean aBoolean398;

	@OriginalMember(owner = "client!akk", name = "hj", descriptor = "Z")
	final boolean aBoolean403;

	@OriginalMember(owner = "client!akk", name = "hu", descriptor = "Z")
	final boolean aBoolean408;

	@OriginalMember(owner = "client!akk", name = "hl", descriptor = "Z")
	final boolean aBoolean402;

	@OriginalMember(owner = "client!akk", name = "hn", descriptor = "[I")
	int[] anIntArray229;

	@OriginalMember(owner = "client!akk", name = "hh", descriptor = "I")
	final int anInt2346;

	@OriginalMember(owner = "client!akk", name = "hy", descriptor = "Z")
	boolean aBoolean404;

	@OriginalMember(owner = "client!akk", name = "ada", descriptor = "(Ljava/lang/String;)[B", line = 66)
	byte[] method16342(@OriginalArg(0) String arg0) {
		return this.method17436("gl", arg0);
	}

	@OriginalMember(owner = "client!akk", name = "aec", descriptor = "(Ljava/lang/String;)[B", line = 66)
	byte[] method16357(@OriginalArg(0) String arg0) {
		return this.method17436("gl", arg0);
	}

	@OriginalMember(owner = "client!akk", name = "pl", descriptor = "(Ljava/lang/String;)Lclient!fc;", line = 70)
	@Override
	public Class24 method17435(@OriginalArg(0) String arg0) {
		@Pc(3) byte[] local3 = this.method16342(arg0);
		if (local3 == null) {
			return null;
		} else {
			@Pc(11) Class173 local11 = this.method17437(local3);
			return new Class24_Sub2(this, local11);
		}
	}

	@OriginalMember(owner = "client!akk", name = "ut", descriptor = "(Ljava/lang/String;)Lclient!fc;", line = 70)
	@Override
	public Class24 method17758(@OriginalArg(0) String arg0) {
		@Pc(3) byte[] local3 = this.method16342(arg0);
		if (local3 == null) {
			return null;
		} else {
			@Pc(11) Class173 local11 = this.method17437(local3);
			return new Class24_Sub2(this, local11);
		}
	}

	@OriginalMember(owner = "client!akk", name = "ui", descriptor = "(Ljava/lang/String;)Lclient!fc;", line = 70)
	@Override
	public Class24 method17602(@OriginalArg(0) String arg0) {
		@Pc(3) byte[] local3 = this.method16342(arg0);
		if (local3 == null) {
			return null;
		} else {
			@Pc(11) Class173 local11 = this.method17437(local3);
			return new Class24_Sub2(this, local11);
		}
	}

	@OriginalMember(owner = "client!akk", name = "ur", descriptor = "(Ljava/lang/String;)Lclient!fc;", line = 70)
	@Override
	public Class24 method17603(@OriginalArg(0) String arg0) {
		@Pc(3) byte[] local3 = this.method16342(arg0);
		if (local3 == null) {
			return null;
		} else {
			@Pc(11) Class173 local11 = this.method17437(local3);
			return new Class24_Sub2(this, local11);
		}
	}

	@OriginalMember(owner = "client!akk", name = "uu", descriptor = "(Ljava/lang/String;)Lclient!fc;", line = 70)
	@Override
	public Class24 method17604(@OriginalArg(0) String arg0) {
		@Pc(3) byte[] local3 = this.method16342(arg0);
		if (local3 == null) {
			return null;
		} else {
			@Pc(11) Class173 local11 = this.method17437(local3);
			return new Class24_Sub2(this, local11);
		}
	}

	@OriginalMember(owner = "client!akk", name = "ua", descriptor = "(Ljava/lang/String;)Lclient!fc;", line = 70)
	@Override
	public Class24 method17605(@OriginalArg(0) String arg0) {
		@Pc(3) byte[] local3 = this.method16342(arg0);
		if (local3 == null) {
			return null;
		} else {
			@Pc(11) Class173 local11 = this.method17437(local3);
			return new Class24_Sub2(this, local11);
		}
	}

	@OriginalMember(owner = "client!akk", name = "pj", descriptor = "()Z", line = 77)
	@Override
	public boolean method17432() {
		return this.aBoolean398;
	}

	@OriginalMember(owner = "client!akk", name = "uq", descriptor = "()Z", line = 77)
	@Override
	public boolean method17600() {
		return this.aBoolean398;
	}

	@OriginalMember(owner = "client!akk", name = "ph", descriptor = "()Z", line = 81)
	@Override
	public boolean method17433() {
		return this.aBoolean408;
	}

	@OriginalMember(owner = "client!akk", name = "adi", descriptor = "()Z", line = 81)
	@Override
	public boolean method17633() {
		return this.aBoolean408;
	}

	@OriginalMember(owner = "client!akk", name = "adq", descriptor = "()Z", line = 81)
	@Override
	public boolean method17664() {
		return this.aBoolean408;
	}

	@OriginalMember(owner = "client!akk", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!ds;Lclient!di;Lclient!ny;I)V", line = 86)
	Class21_Sub3_Sub1(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Class134 arg3, @OriginalArg(4) Interface11 arg4, @OriginalArg(5) Class359 arg5, @OriginalArg(6) int arg6) {
		super(arg3, arg4, arg5, arg6, 1);
		new MapBuffer();
		new MapBuffer();
		this.aFloatArray66 = new float[4];
		this.aFloatArray67 = new float[16];
		@Pc(68) int[] local68 = new int[1];
		try {
			this.anOpenGL2 = arg0;
			this.anOpenGL2.method25099();
			this.aString73 = OpenGL.glGetString(7936).toLowerCase();
			this.aString74 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString73.indexOf("microsoft") != -1 || this.aString73.indexOf("brian paul") != -1 || this.aString73.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(111) String local111 = OpenGL.glGetString(7938);
			@Pc(119) String[] local119 = Class230.method24546(local111.replace('.', ' '), ' ');
			if (local119.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(129) int local129;
			try {
				local129 = Class70.method33883(local119[0]);
				@Pc(135) int local135 = Class70.method33883(local119[1]);
				this.anInt2345 = local129 * 10 + local135;
			} catch (@Pc(144) NumberFormatException local144) {
				throw new RuntimeException("");
			}
			if (this.anInt2345 < 12) {
				throw new RuntimeException("");
			}
			OpenGL.glGetIntegerv(34018, local68, 0);
			this.anInt2525 = local68[0];
			if (this.anInt2525 < 2) {
				throw new RuntimeException("");
			}
			this.anInt2526 = 8;
			this.aBoolean406 = this.anOpenGL2.method25098("GL_ARB_vertex_buffer_object");
			this.aBoolean439 = this.anOpenGL2.method25098("GL_ARB_multisample");
			this.aBoolean448 = this.anOpenGL2.method25098("GL_EXT_blend_func_separate");
			this.aBoolean405 = this.anOpenGL2.method25098("GL_ARB_texture_rectangle");
			this.aBoolean441 = this.anOpenGL2.method25098("GL_ARB_texture_cube_map");
			this.aBoolean401 = this.anOpenGL2.method25098("GL_ARB_texture_non_power_of_two");
			this.aBoolean438 = true;
			this.aBoolean398 = this.anOpenGL2.method25098("GL_ARB_vertex_shader");
			this.aBoolean403 = this.anOpenGL2.method25098("GL_ARB_vertex_program");
			this.aBoolean408 = this.anOpenGL2.method25098("GL_ARB_fragment_shader");
			this.aBoolean402 = this.anOpenGL2.method25098("GL_ARB_fragment_program");
			this.aBoolean443 = this.anOpenGL2.method25098("GL_EXT_framebuffer_object");
			this.aBoolean447 = this.aBoolean443;
			this.aBoolean444 = this.anOpenGL2.method25098("GL_EXT_framebuffer_blit");
			this.aBoolean445 = this.anOpenGL2.method25098("GL_EXT_framebuffer_multisample");
			this.anIntArray229 = new int[this.anInt2525];
			if (!this.method17432() || !this.method17433()) {
				if (!this.anOpenGL2.method25098("GL_ARB_multitexture")) {
					throw new RuntimeException("");
				}
				if (!this.anOpenGL2.method25098("GL_ARB_texture_env_combine")) {
					throw new RuntimeException("");
				}
			}
			this.aBoolean423 = Class377.aString211.startsWith("mac");
			this.anInt2346 = Stream.u() ? 33639 : 5121;
			if (this.aString74.indexOf("radeon") != -1 || this.aString73.indexOf("intel") != -1) {
				local129 = 0;
				@Pc(336) boolean local336 = this.aString73.indexOf("intel") != -1;
				@Pc(338) boolean local338 = false;
				@Pc(340) boolean local340 = false;
				@Pc(349) String[] local349 = Class230.method24546(this.aString74.replace('/', ' '), ' ');
				for (@Pc(351) int local351 = 0; local351 < local349.length; local351++) {
					@Pc(359) String local359 = local349[local351];
					try {
						if (local359.length() > 0) {
							if (local359.charAt(0) == 'x' && local359.length() >= 3 && Class469.method28756(local359.substring(1, 3))) {
								local359 = local359.substring(1);
								local340 = true;
							}
							if (local359.equals("hd")) {
								local338 = true;
							} else {
								if (local359.startsWith("hd")) {
									local359 = local359.substring(2);
									local338 = true;
								}
								if (local359.length() >= 4 && Class469.method28756(local359.substring(0, 4))) {
									local129 = Class70.method33883(local359.substring(0, 4));
									break;
								}
							}
						}
					} catch (@Pc(423) Exception local423) {
					}
				}
				if (!local336) {
					if (!local340 && !local338) {
						if (local129 >= 7000 && local129 <= 7999) {
							this.aBoolean406 = false;
						}
						if (local129 >= 7000 && local129 <= 9250) {
							this.aBoolean438 = false;
						}
					}
					this.aBoolean405 &= this.anOpenGL2.method25098("GL_ARB_half_float_pixel");
					this.aBoolean404 = true;
				} else if (!local338) {
					this.aBoolean443 = false;
				}
			}
			if (!this.aBoolean406) {
				throw new RuntimeException("");
			}
			try {
				@Pc(473) int[] local473 = new int[1];
				OpenGL.glGenBuffersARB(1, local473, 0);
			} catch (@Pc(479) Throwable local479) {
				throw new RuntimeException("");
			}
			this.method17040(arg1, new Class19_Sub2_Sub1_Sub2(this, arg1, arg2));
			this.method17042(arg1);
			this.method17463(32768, false);
			this.method17463(32768, false);
		} catch (@Pc(515) Throwable local515) {
			local515.printStackTrace();
			this.method17020();
			if (local515 instanceof OutOfMemoryError) {
				throw (OutOfMemoryError) local515;
			}
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!akk", name = "pb", descriptor = "()V", line = 201)
	@Override
	void method17443() {
		OpenGL.glDepthFunc(515);
		OpenGL.glEnable(2884);
		OpenGL.glCullFace(1029);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glPolygonMode(1028, 6914);
		this.method17770(this.aBoolean439 && this.anInt2522 != 0);
		if (this.aBoolean439) {
			OpenGL.glDisable(32926);
		}
		for (@Pc(34) int local34 = this.anInt2525 - 1; local34 >= 0; local34--) {
			OpenGL.glActiveTexture(local34 + 33984);
			OpenGL.glTexEnvi(8960, 8704, 34160);
			OpenGL.glTexEnvi(8960, 34161, 8448);
			OpenGL.glTexEnvi(8960, 34178, 34166);
			OpenGL.glTexEnvi(8960, 34162, 8448);
			OpenGL.glTexEnvi(8960, 34186, 34166);
		}
		OpenGL.glTexEnvi(8960, 34186, 34168);
		OpenGL.glShadeModel(7425);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		@Pc(95) float[] local95 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(97) int local97 = 0; local97 < 8; local97++) {
			@Pc(104) int local104 = local97 + 16384;
			OpenGL.glLightfv(local104, 4608, local95, 0);
			OpenGL.glLightf(local104, 4615, 0.0F);
			OpenGL.glLightf(local104, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL2.setSwapInterval(0);
		super.method17443();
	}

	@OriginalMember(owner = "client!akk", name = "us", descriptor = "()V", line = 201)
	@Override
	void method17624() {
		OpenGL.glDepthFunc(515);
		OpenGL.glEnable(2884);
		OpenGL.glCullFace(1029);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glPolygonMode(1028, 6914);
		this.method17770(this.aBoolean439 && this.anInt2522 != 0);
		if (this.aBoolean439) {
			OpenGL.glDisable(32926);
		}
		for (@Pc(34) int local34 = this.anInt2525 - 1; local34 >= 0; local34--) {
			OpenGL.glActiveTexture(local34 + 33984);
			OpenGL.glTexEnvi(8960, 8704, 34160);
			OpenGL.glTexEnvi(8960, 34161, 8448);
			OpenGL.glTexEnvi(8960, 34178, 34166);
			OpenGL.glTexEnvi(8960, 34162, 8448);
			OpenGL.glTexEnvi(8960, 34186, 34166);
		}
		OpenGL.glTexEnvi(8960, 34186, 34168);
		OpenGL.glShadeModel(7425);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		@Pc(95) float[] local95 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(97) int local97 = 0; local97 < 8; local97++) {
			@Pc(104) int local104 = local97 + 16384;
			OpenGL.glLightfv(local104, 4608, local95, 0);
			OpenGL.glLightf(local104, 4615, 0.0F);
			OpenGL.glLightf(local104, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL2.setSwapInterval(0);
		super.method17443();
	}

	@OriginalMember(owner = "client!akk", name = "uj", descriptor = "()V", line = 201)
	@Override
	void method17612() {
		OpenGL.glDepthFunc(515);
		OpenGL.glEnable(2884);
		OpenGL.glCullFace(1029);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glPolygonMode(1028, 6914);
		this.method17770(this.aBoolean439 && this.anInt2522 != 0);
		if (this.aBoolean439) {
			OpenGL.glDisable(32926);
		}
		for (@Pc(34) int local34 = this.anInt2525 - 1; local34 >= 0; local34--) {
			OpenGL.glActiveTexture(local34 + 33984);
			OpenGL.glTexEnvi(8960, 8704, 34160);
			OpenGL.glTexEnvi(8960, 34161, 8448);
			OpenGL.glTexEnvi(8960, 34178, 34166);
			OpenGL.glTexEnvi(8960, 34162, 8448);
			OpenGL.glTexEnvi(8960, 34186, 34166);
		}
		OpenGL.glTexEnvi(8960, 34186, 34168);
		OpenGL.glShadeModel(7425);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		@Pc(95) float[] local95 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(97) int local97 = 0; local97 < 8; local97++) {
			@Pc(104) int local104 = local97 + 16384;
			OpenGL.glLightfv(local104, 4608, local95, 0);
			OpenGL.glLightf(local104, 4615, 0.0F);
			OpenGL.glLightf(local104, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL2.setSwapInterval(0);
		super.method17443();
	}

	@OriginalMember(owner = "client!akk", name = "uo", descriptor = "()V", line = 201)
	@Override
	void method17613() {
		OpenGL.glDepthFunc(515);
		OpenGL.glEnable(2884);
		OpenGL.glCullFace(1029);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glPolygonMode(1028, 6914);
		this.method17770(this.aBoolean439 && this.anInt2522 != 0);
		if (this.aBoolean439) {
			OpenGL.glDisable(32926);
		}
		for (@Pc(34) int local34 = this.anInt2525 - 1; local34 >= 0; local34--) {
			OpenGL.glActiveTexture(local34 + 33984);
			OpenGL.glTexEnvi(8960, 8704, 34160);
			OpenGL.glTexEnvi(8960, 34161, 8448);
			OpenGL.glTexEnvi(8960, 34178, 34166);
			OpenGL.glTexEnvi(8960, 34162, 8448);
			OpenGL.glTexEnvi(8960, 34186, 34166);
		}
		OpenGL.glTexEnvi(8960, 34186, 34168);
		OpenGL.glShadeModel(7425);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		@Pc(95) float[] local95 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(97) int local97 = 0; local97 < 8; local97++) {
			@Pc(104) int local104 = local97 + 16384;
			OpenGL.glLightfv(local104, 4608, local95, 0);
			OpenGL.glLightf(local104, 4615, 0.0F);
			OpenGL.glLightf(local104, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL2.setSwapInterval(0);
		super.method17443();
	}

	@OriginalMember(owner = "client!akk", name = "h", descriptor = "()Lclient!cr;", line = 238)
	@Override
	public Class117 method17016() {
		@Pc(1) int local1 = -1;
		if (this.aString73.indexOf("nvidia") != -1) {
			local1 = 4318;
		} else if (this.aString73.indexOf("intel") != -1) {
			local1 = 32902;
		} else if (this.aString73.indexOf("ati") != -1) {
			local1 = 4098;
		}
		return new Class117(local1, this.method17547() ? "OpenGL FF" : "OpenGL", this.anInt2345, this.aString74, 0L, this.method17547());
	}

	@OriginalMember(owner = "client!akk", name = "ex", descriptor = "()Lclient!cr;", line = 238)
	@Override
	public Class117 method17143() {
		@Pc(1) int local1 = -1;
		if (this.aString73.indexOf("nvidia") != -1) {
			local1 = 4318;
		} else if (this.aString73.indexOf("intel") != -1) {
			local1 = 32902;
		} else if (this.aString73.indexOf("ati") != -1) {
			local1 = 4098;
		}
		return new Class117(local1, this.method17547() ? "OpenGL FF" : "OpenGL", this.anInt2345, this.aString74, 0L, this.method17547());
	}

	@OriginalMember(owner = "client!akk", name = "s", descriptor = "(II)V", line = 246)
	@Override
	void method17018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub2 {
		this.aClass19_Sub2_6.method21412();
		if (this.anInterface11_6 != null) {
			this.anInterface11_6.method21972();
		}
	}

	@OriginalMember(owner = "client!akk", name = "eb", descriptor = "(II)V", line = 246)
	@Override
	void method17265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub2 {
		this.aClass19_Sub2_6.method21412();
		if (this.anInterface11_6 != null) {
			this.anInterface11_6.method21972();
		}
	}

	@OriginalMember(owner = "client!akk", name = "u", descriptor = "()V", line = 251)
	@Override
	public void method17019() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!akk", name = "ef", descriptor = "()V", line = 251)
	@Override
	public void method17372() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!akk", name = "ey", descriptor = "()V", line = 251)
	@Override
	public void method17026() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!akk", name = "er", descriptor = "()V", line = 251)
	@Override
	public void method17147() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!akk", name = "ej", descriptor = "()V", line = 251)
	@Override
	public void method17148() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!akk", name = "en", descriptor = "()V", line = 255)
	@Override
	void method17149() {
		super.method17021();
		if (this.anOpenGL2 != null) {
			this.anOpenGL2.method25100();
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
	}

	@OriginalMember(owner = "client!akk", name = "b", descriptor = "()V", line = 255)
	@Override
	void method17021() {
		super.method17021();
		if (this.anOpenGL2 != null) {
			this.anOpenGL2.method25100();
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
	}

	@OriginalMember(owner = "client!akk", name = "em", descriptor = "()V", line = 255)
	@Override
	void method17151() {
		super.method17021();
		if (this.anOpenGL2 != null) {
			this.anOpenGL2.method25100();
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
	}

	@OriginalMember(owner = "client!akk", name = "ec", descriptor = "()V", line = 255)
	@Override
	void method17152() {
		super.method17021();
		if (this.anOpenGL2 != null) {
			this.anOpenGL2.method25100();
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
	}

	@OriginalMember(owner = "client!akk", name = "ea", descriptor = "()V", line = 255)
	@Override
	void method17153() {
		super.method17021();
		if (this.anOpenGL2 != null) {
			this.anOpenGL2.method25100();
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
	}

	@OriginalMember(owner = "client!akk", name = "ew", descriptor = "()V", line = 255)
	@Override
	void method17150() {
		super.method17021();
		if (this.anOpenGL2 != null) {
			this.anOpenGL2.method25100();
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
	}

	@OriginalMember(owner = "client!akk", name = "pt", descriptor = "()F", line = 264)
	@Override
	public float method17577() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!akk", name = "vb", descriptor = "()F", line = 264)
	@Override
	public float method17796() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!akk", name = "vj", descriptor = "()F", line = 264)
	@Override
	public float method17589() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!akk", name = "vz", descriptor = "()F", line = 264)
	@Override
	public float method17588() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!akk", name = "vl", descriptor = "()F", line = 264)
	@Override
	public float method17444() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!akk", name = "ai", descriptor = "(Ljava/awt/Canvas;II)Lclient!abq;", line = 268)
	@Override
	Class19_Sub2 method17046(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class19_Sub2_Sub1_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!akk", name = "ff", descriptor = "(Ljava/awt/Canvas;II)Lclient!abq;", line = 268)
	@Override
	Class19_Sub2 method17186(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class19_Sub2_Sub1_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!akk", name = "fk", descriptor = "(Ljava/awt/Canvas;II)Lclient!abq;", line = 268)
	@Override
	Class19_Sub2 method17187(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class19_Sub2_Sub1_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!akk", name = "aq", descriptor = "()Lclient!abj;", line = 272)
	@Override
	public Class19_Sub1 method17047() {
		return new Class19_Sub1_Sub1_Sub1(this);
	}

	@OriginalMember(owner = "client!akk", name = "la", descriptor = "()Lclient!abj;", line = 272)
	@Override
	public Class19_Sub1 method17324() {
		return new Class19_Sub1_Sub1_Sub1(this);
	}

	@OriginalMember(owner = "client!akk", name = "av", descriptor = "(IILclient!cw;Lclient!dj;I)Lclient!da;", line = 276)
	@Override
	public Interface10 method17048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) Class127 arg3, @OriginalArg(4) int arg4) {
		return new Class373(this, arg2, arg3, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!akk", name = "lm", descriptor = "(IILclient!cw;Lclient!dj;I)Lclient!da;", line = 276)
	@Override
	public Interface10 method17328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) Class127 arg3, @OriginalArg(4) int arg4) {
		return new Class373(this, arg2, arg3, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!akk", name = "ld", descriptor = "(IILclient!cw;Lclient!dj;I)Lclient!da;", line = 276)
	@Override
	public Interface10 method17257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) Class127 arg3, @OriginalArg(4) int arg4) {
		return new Class373(this, arg2, arg3, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!akk", name = "ll", descriptor = "(IILclient!cw;Lclient!dj;I)Lclient!da;", line = 276)
	@Override
	public Interface10 method17326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) Class127 arg3, @OriginalArg(4) int arg4) {
		return new Class373(this, arg2, arg3, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!akk", name = "lk", descriptor = "(IILclient!cw;Lclient!dj;I)Lclient!da;", line = 276)
	@Override
	public Interface10 method17284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) Class127 arg3, @OriginalArg(4) int arg4) {
		return new Class373(this, arg2, arg3, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!akk", name = "lv", descriptor = "(IILclient!cw;Lclient!dj;I)Lclient!da;", line = 276)
	@Override
	public Interface10 method17276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) Class127 arg3, @OriginalArg(4) int arg4) {
		return new Class373(this, arg2, arg3, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!akk", name = "ax", descriptor = "(II)Lclient!dr;", line = 280)
	@Override
	public Interface13 method17049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class373(this, Class121.aClass121_21, Class127.aClass127_22, arg0, arg1);
	}

	@OriginalMember(owner = "client!akk", name = "mv", descriptor = "(II)Lclient!dr;", line = 280)
	@Override
	public Interface13 method17349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class373(this, Class121.aClass121_21, Class127.aClass127_22, arg0, arg1);
	}

	@OriginalMember(owner = "client!akk", name = "ma", descriptor = "(II)Lclient!dr;", line = 280)
	@Override
	public Interface13 method17015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class373(this, Class121.aClass121_21, Class127.aClass127_22, arg0, arg1);
	}

	@OriginalMember(owner = "client!akk", name = "le", descriptor = "(III)Lclient!dr;", line = 284)
	@Override
	public Interface13 method17306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class373(this, Class121.aClass121_21, Class127.aClass127_22, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!akk", name = "lc", descriptor = "(III)Lclient!dr;", line = 284)
	@Override
	public Interface13 method17330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class373(this, Class121.aClass121_21, Class127.aClass127_22, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!akk", name = "az", descriptor = "(III)Lclient!dr;", line = 284)
	@Override
	public Interface13 method17329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class373(this, Class121.aClass121_21, Class127.aClass127_22, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!akk", name = "al", descriptor = "(IIII)[I", line = 288)
	@Override
	public int[] method17051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(8) int local8 = this.aClass19_6.method21391();
		for (@Pc(10) int local10 = 0; local10 < arg3; local10++) {
			OpenGL.glReadPixelsi(arg0, local8 - arg1 - local10 - 1, arg2, 1, 32993, this.anInt2346, local4, local10 * arg2);
		}
		return local4;
	}

	@OriginalMember(owner = "client!akk", name = "fj", descriptor = "(IIII)[I", line = 288)
	@Override
	public int[] method17188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(8) int local8 = this.aClass19_6.method21391();
		for (@Pc(10) int local10 = 0; local10 < arg3; local10++) {
			OpenGL.glReadPixelsi(arg0, local8 - arg1 - local10 - 1, arg2, 1, 32993, this.anInt2346, local4, local10 * arg2);
		}
		return local4;
	}

	@OriginalMember(owner = "client!akk", name = "ao", descriptor = "()V", line = 297)
	@Override
	public void method17302() {
		if (this.aClass19_6 == null) {
			return;
		}
		@Pc(7) int local7 = this.aClass19_6.method21390();
		@Pc(11) int local11 = this.aClass19_6.method21391();
		if (local7 <= 0 && local11 <= 0) {
			return;
		}
		@Pc(19) int local19 = this.anInt2499;
		@Pc(22) int local22 = this.anInt2500;
		@Pc(25) int local25 = this.anInt2501;
		@Pc(28) int local28 = this.anInt2506;
		this.method17053();
		@Pc(33) int local33 = this.anInt2495;
		@Pc(36) int local36 = this.anInt2496;
		@Pc(39) int local39 = this.anInt2493;
		@Pc(42) int local42 = this.anInt2494;
		this.method17056();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method17491();
		this.method17620(false);
		this.method17533(false);
		this.method17488(false);
		this.method17685(false);
		this.method17513(null);
		this.method17710(1);
		this.method17469(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glDisable(3553);
		OpenGL.glCopyPixels(0, 0, local7, local11, 6144);
		OpenGL.glEnable(3553);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.method17079(local33, local39, local36, local42);
		this.method17054(local19, local22, local25, local28);
	}

	@OriginalMember(owner = "client!akk", name = "fa", descriptor = "()V", line = 297)
	@Override
	public void method17189() {
		if (this.aClass19_6 == null) {
			return;
		}
		@Pc(7) int local7 = this.aClass19_6.method21390();
		@Pc(11) int local11 = this.aClass19_6.method21391();
		if (local7 <= 0 && local11 <= 0) {
			return;
		}
		@Pc(19) int local19 = this.anInt2499;
		@Pc(22) int local22 = this.anInt2500;
		@Pc(25) int local25 = this.anInt2501;
		@Pc(28) int local28 = this.anInt2506;
		this.method17053();
		@Pc(33) int local33 = this.anInt2495;
		@Pc(36) int local36 = this.anInt2496;
		@Pc(39) int local39 = this.anInt2493;
		@Pc(42) int local42 = this.anInt2494;
		this.method17056();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method17491();
		this.method17620(false);
		this.method17533(false);
		this.method17488(false);
		this.method17685(false);
		this.method17513(null);
		this.method17710(1);
		this.method17469(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glDisable(3553);
		OpenGL.glCopyPixels(0, 0, local7, local11, 6144);
		OpenGL.glEnable(3553);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.method17079(local33, local39, local36, local42);
		this.method17054(local19, local22, local25, local28);
	}

	@OriginalMember(owner = "client!akk", name = "fq", descriptor = "()V", line = 297)
	@Override
	public void method17377() {
		if (this.aClass19_6 == null) {
			return;
		}
		@Pc(7) int local7 = this.aClass19_6.method21390();
		@Pc(11) int local11 = this.aClass19_6.method21391();
		if (local7 <= 0 && local11 <= 0) {
			return;
		}
		@Pc(19) int local19 = this.anInt2499;
		@Pc(22) int local22 = this.anInt2500;
		@Pc(25) int local25 = this.anInt2501;
		@Pc(28) int local28 = this.anInt2506;
		this.method17053();
		@Pc(33) int local33 = this.anInt2495;
		@Pc(36) int local36 = this.anInt2496;
		@Pc(39) int local39 = this.anInt2493;
		@Pc(42) int local42 = this.anInt2494;
		this.method17056();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method17491();
		this.method17620(false);
		this.method17533(false);
		this.method17488(false);
		this.method17685(false);
		this.method17513(null);
		this.method17710(1);
		this.method17469(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glDisable(3553);
		OpenGL.glCopyPixels(0, 0, local7, local11, 6144);
		OpenGL.glEnable(3553);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.method17079(local33, local39, local36, local42);
		this.method17054(local19, local22, local25, local28);
	}

	@OriginalMember(owner = "client!akk", name = "fc", descriptor = "()V", line = 297)
	@Override
	public void method17301() {
		if (this.aClass19_6 == null) {
			return;
		}
		@Pc(7) int local7 = this.aClass19_6.method21390();
		@Pc(11) int local11 = this.aClass19_6.method21391();
		if (local7 <= 0 && local11 <= 0) {
			return;
		}
		@Pc(19) int local19 = this.anInt2499;
		@Pc(22) int local22 = this.anInt2500;
		@Pc(25) int local25 = this.anInt2501;
		@Pc(28) int local28 = this.anInt2506;
		this.method17053();
		@Pc(33) int local33 = this.anInt2495;
		@Pc(36) int local36 = this.anInt2496;
		@Pc(39) int local39 = this.anInt2493;
		@Pc(42) int local42 = this.anInt2494;
		this.method17056();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method17491();
		this.method17620(false);
		this.method17533(false);
		this.method17488(false);
		this.method17685(false);
		this.method17513(null);
		this.method17710(1);
		this.method17469(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glDisable(3553);
		OpenGL.glCopyPixels(0, 0, local7, local11, 6144);
		OpenGL.glEnable(3553);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.method17079(local33, local39, local36, local42);
		this.method17054(local19, local22, local25, local28);
	}

	@OriginalMember(owner = "client!akk", name = "db", descriptor = "(Lclient!db;Lclient!db;FLclient!db;)Lclient!db;", line = 338)
	@Override
	public Class18 method17074(@OriginalArg(0) Class18 arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class18 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!akk", name = "jk", descriptor = "(Lclient!db;Lclient!db;FLclient!db;)Lclient!db;", line = 338)
	@Override
	public Class18 method17288(@OriginalArg(0) Class18 arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class18 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!akk", name = "js", descriptor = "(Lclient!db;Lclient!db;FLclient!db;)Lclient!db;", line = 338)
	@Override
	public Class18 method17379(@OriginalArg(0) Class18 arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class18 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!akk", name = "jv", descriptor = "(Lclient!db;Lclient!db;FLclient!db;)Lclient!db;", line = 338)
	@Override
	public Class18 method17289(@OriginalArg(0) Class18 arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class18 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!akk", name = "ad", descriptor = "(II)V", line = 342)
	@Override
	public void method17061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		if ((arg0 & 0x1) != 0) {
			OpenGL.glClearColor((float) (arg1 & 0xFF0000) / 1.671168E7F, (float) (arg1 & 0xFF00) / 65280.0F, (float) (arg1 & 0xFF) / 255.0F, (float) (arg1 >>> 24) / 255.0F);
			local1 = 16384;
		}
		if ((arg0 & 0x2) != 0) {
			this.method17685(true);
			local1 |= 0x100;
		}
		if ((arg0 & 0x4) != 0) {
			local1 |= 0x400;
		}
		OpenGL.glClear(local1);
	}

	@OriginalMember(owner = "client!akk", name = "gx", descriptor = "(II)V", line = 342)
	@Override
	public void method17270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		if ((arg0 & 0x1) != 0) {
			OpenGL.glClearColor((float) (arg1 & 0xFF0000) / 1.671168E7F, (float) (arg1 & 0xFF00) / 65280.0F, (float) (arg1 & 0xFF) / 255.0F, (float) (arg1 >>> 24) / 255.0F);
			local1 = 16384;
		}
		if ((arg0 & 0x2) != 0) {
			this.method17685(true);
			local1 |= 0x100;
		}
		if ((arg0 & 0x4) != 0) {
			local1 |= 0x400;
		}
		OpenGL.glClear(local1);
	}

	@OriginalMember(owner = "client!akk", name = "qh", descriptor = "()V", line = 356)
	@Override
	void method17570() {
		if (this.aClass19_6 != null) {
			OpenGL.glViewport(this.anInt2528 + this.anInt2499, this.anInt2503 + this.aClass19_6.method21391() - this.anInt2500 - this.anInt2506, this.anInt2501, this.anInt2506);
		}
		OpenGL.glDepthRange(this.aFloat188, this.aFloat189);
	}

	@OriginalMember(owner = "client!akk", name = "wt", descriptor = "()V", line = 356)
	@Override
	void method17686() {
		if (this.aClass19_6 != null) {
			OpenGL.glViewport(this.anInt2528 + this.anInt2499, this.anInt2503 + this.aClass19_6.method21391() - this.anInt2500 - this.anInt2506, this.anInt2501, this.anInt2506);
		}
		OpenGL.glDepthRange(this.aFloat188, this.aFloat189);
	}

	@OriginalMember(owner = "client!akk", name = "wp", descriptor = "()V", line = 356)
	@Override
	void method17571() {
		if (this.aClass19_6 != null) {
			OpenGL.glViewport(this.anInt2528 + this.anInt2499, this.anInt2503 + this.aClass19_6.method21391() - this.anInt2500 - this.anInt2506, this.anInt2501, this.anInt2506);
		}
		OpenGL.glDepthRange(this.aFloat188, this.aFloat189);
	}

	@OriginalMember(owner = "client!akk", name = "qe", descriptor = "()V", line = 361)
	@Override
	void method17472() {
		if (this.aClass19_6 == null) {
			return;
		}
		@Pc(8) int local8 = this.anInt2528 + this.anInt2495;
		@Pc(18) int local18 = this.anInt2503 + this.aClass19_6.method21391() - this.anInt2494;
		@Pc(24) int local24 = this.anInt2496 - this.anInt2495;
		@Pc(30) int local30 = this.anInt2494 - this.anInt2493;
		if (local24 < 0) {
			local24 = 0;
		}
		if (local30 < 0) {
			local30 = 0;
		}
		OpenGL.glScissor(local8, local18, local24, local30);
	}

	@OriginalMember(owner = "client!akk", name = "wq", descriptor = "()V", line = 361)
	@Override
	void method17670() {
		if (this.aClass19_6 == null) {
			return;
		}
		@Pc(8) int local8 = this.anInt2528 + this.anInt2495;
		@Pc(18) int local18 = this.anInt2503 + this.aClass19_6.method21391() - this.anInt2494;
		@Pc(24) int local24 = this.anInt2496 - this.anInt2495;
		@Pc(30) int local30 = this.anInt2494 - this.anInt2493;
		if (local24 < 0) {
			local24 = 0;
		}
		if (local30 < 0) {
			local30 = 0;
		}
		OpenGL.glScissor(local8, local18, local24, local30);
	}

	@OriginalMember(owner = "client!akk", name = "wk", descriptor = "()V", line = 361)
	@Override
	void method17484() {
		if (this.aClass19_6 == null) {
			return;
		}
		@Pc(8) int local8 = this.anInt2528 + this.anInt2495;
		@Pc(18) int local18 = this.anInt2503 + this.aClass19_6.method21391() - this.anInt2494;
		@Pc(24) int local24 = this.anInt2496 - this.anInt2495;
		@Pc(30) int local30 = this.anInt2494 - this.anInt2493;
		if (local24 < 0) {
			local24 = 0;
		}
		if (local30 < 0) {
			local30 = 0;
		}
		OpenGL.glScissor(local8, local18, local24, local30);
	}

	@OriginalMember(owner = "client!akk", name = "wo", descriptor = "()V", line = 361)
	@Override
	void method17649() {
		if (this.aClass19_6 == null) {
			return;
		}
		@Pc(8) int local8 = this.anInt2528 + this.anInt2495;
		@Pc(18) int local18 = this.anInt2503 + this.aClass19_6.method21391() - this.anInt2494;
		@Pc(24) int local24 = this.anInt2496 - this.anInt2495;
		@Pc(30) int local30 = this.anInt2494 - this.anInt2493;
		if (local24 < 0) {
			local24 = 0;
		}
		if (local30 < 0) {
			local30 = 0;
		}
		OpenGL.glScissor(local8, local18, local24, local30);
	}

	@OriginalMember(owner = "client!akk", name = "wu", descriptor = "()V", line = 361)
	@Override
	void method17650() {
		if (this.aClass19_6 == null) {
			return;
		}
		@Pc(8) int local8 = this.anInt2528 + this.anInt2495;
		@Pc(18) int local18 = this.anInt2503 + this.aClass19_6.method21391() - this.anInt2494;
		@Pc(24) int local24 = this.anInt2496 - this.anInt2495;
		@Pc(30) int local30 = this.anInt2494 - this.anInt2493;
		if (local24 < 0) {
			local24 = 0;
		}
		if (local30 < 0) {
			local30 = 0;
		}
		OpenGL.glScissor(local8, local18, local24, local30);
	}

	@OriginalMember(owner = "client!akk", name = "qw", descriptor = "()V", line = 373)
	@Override
	void method17468() {
		if (this.aBoolean449) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!akk", name = "wh", descriptor = "()V", line = 373)
	@Override
	void method17651() {
		if (this.aBoolean449) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!akk", name = "wl", descriptor = "()V", line = 373)
	@Override
	void method17576() {
		if (this.aBoolean449) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!akk", name = "wf", descriptor = "()V", line = 373)
	@Override
	void method17653() {
		if (this.aBoolean449) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!akk", name = "pg", descriptor = "(Lclient!mq;Lclient!mq;Lclient!mq;)V", line = 378)
	@Override
	public void method17438(@OriginalArg(0) Class328 arg0, @OriginalArg(1) Class328 arg1, @OriginalArg(2) Class328 arg2) {
		OpenGL.glMatrixMode(5888);
		this.aClass328_86.method26045(arg0, arg1);
		OpenGL.glLoadMatrixf(this.aClass328_86.aFloatArray106, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(arg2.aFloatArray106, 0);
	}

	@OriginalMember(owner = "client!akk", name = "um", descriptor = "(Lclient!mq;Lclient!mq;Lclient!mq;)V", line = 378)
	@Override
	public void method17608(@OriginalArg(0) Class328 arg0, @OriginalArg(1) Class328 arg1, @OriginalArg(2) Class328 arg2) {
		OpenGL.glMatrixMode(5888);
		this.aClass328_86.method26045(arg0, arg1);
		OpenGL.glLoadMatrixf(this.aClass328_86.aFloatArray106, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(arg2.aFloatArray106, 0);
	}

	@OriginalMember(owner = "client!akk", name = "qu", descriptor = "(Lclient!mq;)V", line = 386)
	@Override
	public void method17483(@OriginalArg(0) Class328 arg0) {
		@Pc(2) float[] local2 = arg0.aFloatArray106;
		local2[1] = -local2[1];
		local2[5] = -local2[5];
		local2[9] = -local2[9];
		local2[13] = -local2[13];
	}

	@OriginalMember(owner = "client!akk", name = "xi", descriptor = "(Lclient!mq;)V", line = 386)
	@Override
	public void method17669(@OriginalArg(0) Class328 arg0) {
		@Pc(2) float[] local2 = arg0.aFloatArray106;
		local2[1] = -local2[1];
		local2[5] = -local2[5];
		local2[9] = -local2[9];
		local2[13] = -local2[13];
	}

	@OriginalMember(owner = "client!akk", name = "xl", descriptor = "(Lclient!mq;)V", line = 386)
	@Override
	public void method17668(@OriginalArg(0) Class328 arg0) {
		@Pc(2) float[] local2 = arg0.aFloatArray106;
		local2[1] = -local2[1];
		local2[5] = -local2[5];
		local2[9] = -local2[9];
		local2[13] = -local2[13];
	}

	@OriginalMember(owner = "client!akk", name = "ry", descriptor = "()V", line = 394)
	@Override
	void method17793() {
		if (this.aBoolean428) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!akk", name = "yn", descriptor = "()V", line = 394)
	@Override
	void method17575() {
		if (this.aBoolean428) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!akk", name = "rr", descriptor = "()V", line = 399)
	@Override
	void method17490() {
		OpenGL.glDepthMask(this.aBoolean434 && this.aBoolean429);
	}

	@OriginalMember(owner = "client!akk", name = "yk", descriptor = "()V", line = 399)
	@Override
	void method17566() {
		OpenGL.glDepthMask(this.aBoolean434 && this.aBoolean429);
	}

	@OriginalMember(owner = "client!akk", name = "yq", descriptor = "()V", line = 399)
	@Override
	void method17687() {
		OpenGL.glDepthMask(this.aBoolean434 && this.aBoolean429);
	}

	@OriginalMember(owner = "client!akk", name = "yy", descriptor = "()V", line = 399)
	@Override
	void method17688() {
		OpenGL.glDepthMask(this.aBoolean434 && this.aBoolean429);
	}

	@OriginalMember(owner = "client!akk", name = "rw", descriptor = "()V", line = 403)
	@Override
	void method17493() {
		if (this.aBoolean430 && !this.aBoolean425) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!akk", name = "yw", descriptor = "()V", line = 403)
	@Override
	void method17515() {
		if (this.aBoolean430 && !this.aBoolean425) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!akk", name = "rc", descriptor = "()V", line = 408)
	@Override
	void method17494() {
		this.aFloatArray66[0] = this.aFloat197 * this.aFloat193;
		this.aFloatArray66[1] = this.aFloat197 * this.aFloat194;
		this.aFloatArray66[2] = this.aFloat197 * this.aFloat185;
		this.aFloatArray66[3] = 1.0F;
		OpenGL.glLightModelfv(2899, this.aFloatArray66, 0);
	}

	@OriginalMember(owner = "client!akk", name = "yz", descriptor = "()V", line = 408)
	@Override
	void method17691() {
		this.aFloatArray66[0] = this.aFloat197 * this.aFloat193;
		this.aFloatArray66[1] = this.aFloat197 * this.aFloat194;
		this.aFloatArray66[2] = this.aFloat197 * this.aFloat185;
		this.aFloatArray66[3] = 1.0F;
		OpenGL.glLightModelfv(2899, this.aFloatArray66, 0);
	}

	@OriginalMember(owner = "client!akk", name = "ro", descriptor = "()V", line = 416)
	@Override
	void method17495() {
		this.aFloatArray66[0] = this.aFloat195 * this.aFloat193;
		this.aFloatArray66[1] = this.aFloat195 * this.aFloat194;
		this.aFloatArray66[2] = this.aFloat195 * this.aFloat185;
		this.aFloatArray66[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, this.aFloatArray66, 0);
		this.aFloatArray66[0] = -this.aFloat196 * this.aFloat193;
		this.aFloatArray66[1] = -this.aFloat196 * this.aFloat194;
		this.aFloatArray66[2] = -this.aFloat196 * this.aFloat185;
		this.aFloatArray66[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, this.aFloatArray66, 0);
	}

	@OriginalMember(owner = "client!akk", name = "ya", descriptor = "()V", line = 416)
	@Override
	void method17528() {
		this.aFloatArray66[0] = this.aFloat195 * this.aFloat193;
		this.aFloatArray66[1] = this.aFloat195 * this.aFloat194;
		this.aFloatArray66[2] = this.aFloat195 * this.aFloat185;
		this.aFloatArray66[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, this.aFloatArray66, 0);
		this.aFloatArray66[0] = -this.aFloat196 * this.aFloat193;
		this.aFloatArray66[1] = -this.aFloat196 * this.aFloat194;
		this.aFloatArray66[2] = -this.aFloat196 * this.aFloat185;
		this.aFloatArray66[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, this.aFloatArray66, 0);
	}

	@OriginalMember(owner = "client!akk", name = "yp", descriptor = "()V", line = 416)
	@Override
	void method17693() {
		this.aFloatArray66[0] = this.aFloat195 * this.aFloat193;
		this.aFloatArray66[1] = this.aFloat195 * this.aFloat194;
		this.aFloatArray66[2] = this.aFloat195 * this.aFloat185;
		this.aFloatArray66[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, this.aFloatArray66, 0);
		this.aFloatArray66[0] = -this.aFloat196 * this.aFloat193;
		this.aFloatArray66[1] = -this.aFloat196 * this.aFloat194;
		this.aFloatArray66[2] = -this.aFloat196 * this.aFloat185;
		this.aFloatArray66[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, this.aFloatArray66, 0);
	}

	@OriginalMember(owner = "client!akk", name = "yo", descriptor = "()V", line = 416)
	@Override
	void method17694() {
		this.aFloatArray66[0] = this.aFloat195 * this.aFloat193;
		this.aFloatArray66[1] = this.aFloat195 * this.aFloat194;
		this.aFloatArray66[2] = this.aFloat195 * this.aFloat185;
		this.aFloatArray66[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, this.aFloatArray66, 0);
		this.aFloatArray66[0] = -this.aFloat196 * this.aFloat193;
		this.aFloatArray66[1] = -this.aFloat196 * this.aFloat194;
		this.aFloatArray66[2] = -this.aFloat196 * this.aFloat185;
		this.aFloatArray66[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, this.aFloatArray66, 0);
	}

	@OriginalMember(owner = "client!akk", name = "yc", descriptor = "()V", line = 416)
	@Override
	void method17695() {
		this.aFloatArray66[0] = this.aFloat195 * this.aFloat193;
		this.aFloatArray66[1] = this.aFloat195 * this.aFloat194;
		this.aFloatArray66[2] = this.aFloat195 * this.aFloat185;
		this.aFloatArray66[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, this.aFloatArray66, 0);
		this.aFloatArray66[0] = -this.aFloat196 * this.aFloat193;
		this.aFloatArray66[1] = -this.aFloat196 * this.aFloat194;
		this.aFloatArray66[2] = -this.aFloat196 * this.aFloat185;
		this.aFloatArray66[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, this.aFloatArray66, 0);
	}

	@OriginalMember(owner = "client!akk", name = "rq", descriptor = "()V", line = 429)
	@Override
	void method17496() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(this.aClass328_78.aFloatArray106, 0);
		OpenGL.glLightfv(16384, 4611, this.aFloatArray76, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray77, 0);
	}

	@OriginalMember(owner = "client!akk", name = "yr", descriptor = "()V", line = 429)
	@Override
	void method17584() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(this.aClass328_78.aFloatArray106, 0);
		OpenGL.glLightfv(16384, 4611, this.aFloatArray76, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray77, 0);
	}

	@OriginalMember(owner = "client!akk", name = "yu", descriptor = "()V", line = 429)
	@Override
	void method17697() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(this.aClass328_78.aFloatArray106, 0);
		OpenGL.glLightfv(16384, 4611, this.aFloatArray76, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray77, 0);
	}

	@OriginalMember(owner = "client!akk", name = "yg", descriptor = "()V", line = 436)
	@Override
	void method17701() {
		if (this.aBoolean431) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!akk", name = "rg", descriptor = "()V", line = 436)
	@Override
	void method17536() {
		if (this.aBoolean431) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!akk", name = "yv", descriptor = "()V", line = 436)
	@Override
	void method17700() {
		if (this.aBoolean431) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!akk", name = "yd", descriptor = "()V", line = 446)
	@Override
	void method17456() {
	}

	@OriginalMember(owner = "client!akk", name = "yb", descriptor = "()V", line = 446)
	@Override
	void method17598() {
	}

	@OriginalMember(owner = "client!akk", name = "yt", descriptor = "()V", line = 446)
	@Override
	void method17698() {
	}

	@OriginalMember(owner = "client!akk", name = "ra", descriptor = "()V", line = 446)
	@Override
	void method17497() {
	}

	@OriginalMember(owner = "client!akk", name = "rb", descriptor = "()V", line = 449)
	@Override
	void method17499() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(this.aClass328_78.aFloatArray106, 0);
		@Pc(8) int local8;
		for (local8 = 0; local8 < this.anInt2509; local8++) {
			@Pc(17) Class3_Sub15 local17 = this.aClass3_Sub15Array19[local8];
			@Pc(21) int local21 = local17.method11279();
			@Pc(25) int local25 = local8 + 16386;
			@Pc(31) float local31 = local17.method11300() / 255.0F;
			this.aFloatArray66[0] = local17.method11280();
			this.aFloatArray66[1] = local17.method11281();
			this.aFloatArray66[2] = local17.method11282();
			this.aFloatArray66[3] = 1.0F;
			OpenGL.glLightfv(local25, 4611, this.aFloatArray66, 0);
			this.aFloatArray66[0] = (float) (local21 >> 16 & 0xFF) * local31;
			this.aFloatArray66[1] = (float) (local21 >> 8 & 0xFF) * local31;
			this.aFloatArray66[2] = (float) (local21 & 0xFF) * local31;
			this.aFloatArray66[3] = 1.0F;
			OpenGL.glLightfv(local25, 4609, this.aFloatArray66, 0);
			OpenGL.glLightf(local25, 4617, 1.0F / (float) (local17.method11291() * local17.method11291()));
			OpenGL.glEnable(local25);
		}
		while (local8 < this.anInt2508) {
			OpenGL.glDisable(local8 + 16386);
			local8++;
		}
	}

	@OriginalMember(owner = "client!akk", name = "yi", descriptor = "()V", line = 449)
	@Override
	void method17704() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(this.aClass328_78.aFloatArray106, 0);
		@Pc(8) int local8;
		for (local8 = 0; local8 < this.anInt2509; local8++) {
			@Pc(17) Class3_Sub15 local17 = this.aClass3_Sub15Array19[local8];
			@Pc(21) int local21 = local17.method11279();
			@Pc(25) int local25 = local8 + 16386;
			@Pc(31) float local31 = local17.method11300() / 255.0F;
			this.aFloatArray66[0] = local17.method11280();
			this.aFloatArray66[1] = local17.method11281();
			this.aFloatArray66[2] = local17.method11282();
			this.aFloatArray66[3] = 1.0F;
			OpenGL.glLightfv(local25, 4611, this.aFloatArray66, 0);
			this.aFloatArray66[0] = (float) (local21 >> 16 & 0xFF) * local31;
			this.aFloatArray66[1] = (float) (local21 >> 8 & 0xFF) * local31;
			this.aFloatArray66[2] = (float) (local21 & 0xFF) * local31;
			this.aFloatArray66[3] = 1.0F;
			OpenGL.glLightfv(local25, 4609, this.aFloatArray66, 0);
			OpenGL.glLightf(local25, 4617, 1.0F / (float) (local17.method11291() * local17.method11291()));
			OpenGL.glEnable(local25);
		}
		while (local8 < this.anInt2508) {
			OpenGL.glDisable(local8 + 16386);
			local8++;
		}
	}

	@OriginalMember(owner = "client!akk", name = "yf", descriptor = "()V", line = 449)
	@Override
	void method17798() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(this.aClass328_78.aFloatArray106, 0);
		@Pc(8) int local8;
		for (local8 = 0; local8 < this.anInt2509; local8++) {
			@Pc(17) Class3_Sub15 local17 = this.aClass3_Sub15Array19[local8];
			@Pc(21) int local21 = local17.method11279();
			@Pc(25) int local25 = local8 + 16386;
			@Pc(31) float local31 = local17.method11300() / 255.0F;
			this.aFloatArray66[0] = local17.method11280();
			this.aFloatArray66[1] = local17.method11281();
			this.aFloatArray66[2] = local17.method11282();
			this.aFloatArray66[3] = 1.0F;
			OpenGL.glLightfv(local25, 4611, this.aFloatArray66, 0);
			this.aFloatArray66[0] = (float) (local21 >> 16 & 0xFF) * local31;
			this.aFloatArray66[1] = (float) (local21 >> 8 & 0xFF) * local31;
			this.aFloatArray66[2] = (float) (local21 & 0xFF) * local31;
			this.aFloatArray66[3] = 1.0F;
			OpenGL.glLightfv(local25, 4609, this.aFloatArray66, 0);
			OpenGL.glLightf(local25, 4617, 1.0F / (float) (local17.method11291() * local17.method11291()));
			OpenGL.glEnable(local25);
		}
		while (local8 < this.anInt2508) {
			OpenGL.glDisable(local8 + 16386);
			local8++;
		}
	}

	@OriginalMember(owner = "client!akk", name = "rt", descriptor = "(Lclient!cw;Lclient!dj;)Z", line = 476)
	@Override
	boolean method17768(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class127 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!akk", name = "zc", descriptor = "(Lclient!cw;Lclient!dj;)Z", line = 476)
	@Override
	boolean method17452(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class127 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!akk", name = "rh", descriptor = "(Lclient!cw;Lclient!dj;)Z", line = 480)
	@Override
	boolean method17500(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class127 arg1) {
		return this.aBoolean438;
	}

	@OriginalMember(owner = "client!akk", name = "zi", descriptor = "(Lclient!cw;Lclient!dj;)Z", line = 480)
	@Override
	boolean method17706(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class127 arg1) {
		return this.aBoolean438;
	}

	@OriginalMember(owner = "client!akk", name = "rn", descriptor = "(Lclient!cw;Lclient!dj;II)Lclient!ic;", line = 484)
	@Override
	Interface20 method17504(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return this.method17510(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!akk", name = "zm", descriptor = "(Lclient!cw;Lclient!dj;II)Lclient!ic;", line = 484)
	@Override
	Interface20 method17714(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return this.method17510(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!akk", name = "zw", descriptor = "(Lclient!cw;Lclient!dj;II)Lclient!ic;", line = 484)
	@Override
	Interface20 method17715(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return this.method17510(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!akk", name = "zj", descriptor = "(Lclient!cw;Lclient!dj;II)Lclient!ic;", line = 484)
	@Override
	Interface20 method17713(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return this.method17510(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!akk", name = "ru", descriptor = "(IIZ[III)Lclient!ic;", line = 488)
	@Override
	Interface20 method17507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class41_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!akk", name = "zp", descriptor = "(IIZ[III)Lclient!ic;", line = 488)
	@Override
	Interface20 method17709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class41_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!akk", name = "zu", descriptor = "(IIZ[III)Lclient!ic;", line = 488)
	@Override
	Interface20 method17616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class41_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!akk", name = "rl", descriptor = "(Lclient!cw;IIZ[BII)Lclient!ic;", line = 492)
	@Override
	Interface20 method17505(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class41_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!akk", name = "ze", descriptor = "(Lclient!cw;IIZ[BII)Lclient!ic;", line = 492)
	@Override
	Interface20 method17717(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class41_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!akk", name = "zv", descriptor = "(Lclient!cw;IIZ[BII)Lclient!ic;", line = 492)
	@Override
	Interface20 method17716(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class41_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!akk", name = "zn", descriptor = "(Lclient!cw;IIZ[FII)Lclient!ic;", line = 496)
	@Override
	Interface20 method17667(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class41_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!akk", name = "rm", descriptor = "(Lclient!cw;IIZ[FII)Lclient!ic;", line = 496)
	@Override
	Interface20 method17506(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class41_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!akk", name = "zq", descriptor = "(Lclient!cw;IIZ[FII)Lclient!ic;", line = 496)
	@Override
	Interface20 method17574(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class41_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!akk", name = "rv", descriptor = "(Lclient!cw;Lclient!dj;II)Lclient!jt;", line = 500)
	@Override
	Interface29 method17510(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class41_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!akk", name = "zy", descriptor = "(Lclient!cw;Lclient!dj;II)Lclient!jt;", line = 500)
	@Override
	Interface29 method17724(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class41_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!akk", name = "za", descriptor = "(Lclient!cw;Lclient!dj;II)Lclient!jt;", line = 500)
	@Override
	Interface29 method17757(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class41_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!akk", name = "rx", descriptor = "(IZ[[I)Lclient!jk;", line = 504)
	@Override
	Interface27 method17508(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2) {
		return new Class41_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!akk", name = "zh", descriptor = "(IZ[[I)Lclient!jk;", line = 504)
	@Override
	Interface27 method17720(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2) {
		return new Class41_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!akk", name = "zb", descriptor = "(IZ[[I)Lclient!jk;", line = 504)
	@Override
	Interface27 method17721(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2) {
		return new Class41_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!akk", name = "zl", descriptor = "(IZ[[I)Lclient!jk;", line = 504)
	@Override
	Interface27 method17722(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2) {
		return new Class41_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!akk", name = "zx", descriptor = "(Lclient!cw;IIIZ[B)Lclient!in;", line = 508)
	@Override
	Interface23 method17723(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5) {
		return new Class41_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!akk", name = "zf", descriptor = "(Lclient!cw;IIIZ[B)Lclient!in;", line = 508)
	@Override
	Interface23 method17527(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5) {
		return new Class41_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!akk", name = "re", descriptor = "(Lclient!cw;IIIZ[B)Lclient!in;", line = 508)
	@Override
	Interface23 method17509(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5) {
		return new Class41_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!akk", name = "sk", descriptor = "()V", line = 512)
	@Override
	public void method17514() {
		@Pc(5) int local5 = this.anIntArray229[this.anInt2516];
		if (local5 != 0) {
			this.anIntArray229[this.anInt2516] = 0;
			OpenGL.glBindTexture(local5, 0);
			OpenGL.glDisable(local5);
		}
	}

	@OriginalMember(owner = "client!akk", name = "aaw", descriptor = "()V", line = 512)
	@Override
	public void method17561() {
		@Pc(5) int local5 = this.anIntArray229[this.anInt2516];
		if (local5 != 0) {
			this.anIntArray229[this.anInt2516] = 0;
			OpenGL.glBindTexture(local5, 0);
			OpenGL.glDisable(local5);
		}
	}

	@OriginalMember(owner = "client!akk", name = "aaz", descriptor = "()V", line = 512)
	@Override
	public void method17732() {
		@Pc(5) int local5 = this.anIntArray229[this.anInt2516];
		if (local5 != 0) {
			this.anIntArray229[this.anInt2516] = 0;
			OpenGL.glBindTexture(local5, 0);
			OpenGL.glDisable(local5);
		}
	}

	@OriginalMember(owner = "client!akk", name = "aat", descriptor = "()V", line = 512)
	@Override
	public void method17731() {
		@Pc(5) int local5 = this.anIntArray229[this.anInt2516];
		if (local5 != 0) {
			this.anIntArray229[this.anInt2516] = 0;
			OpenGL.glBindTexture(local5, 0);
			OpenGL.glDisable(local5);
		}
	}

	@OriginalMember(owner = "client!akk", name = "sl", descriptor = "()V", line = 521)
	@Override
	void method17523() {
		OpenGL.glMatrixMode(5890);
		if (this.aClass268Array3[this.anInt2516] == Class268.aClass268_1) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(this.aClass328Array6[this.anInt2516].method26151(this.aFloatArray67), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!akk", name = "abx", descriptor = "()V", line = 521)
	@Override
	void method17563() {
		OpenGL.glMatrixMode(5890);
		if (this.aClass268Array3[this.anInt2516] == Class268.aClass268_1) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(this.aClass328Array6[this.anInt2516].method26151(this.aFloatArray67), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!akk", name = "sq", descriptor = "()V", line = 530)
	@Override
	void method17582() {
		OpenGL.glActiveTexture(this.anInt2516 + 33984);
	}

	@OriginalMember(owner = "client!akk", name = "abl", descriptor = "()V", line = 530)
	@Override
	void method17760() {
		OpenGL.glActiveTexture(this.anInt2516 + 33984);
	}

	@OriginalMember(owner = "client!akk", name = "abi", descriptor = "()V", line = 530)
	@Override
	void method17550() {
		OpenGL.glActiveTexture(this.anInt2516 + 33984);
	}

	@OriginalMember(owner = "client!akk", name = "abw", descriptor = "()V", line = 530)
	@Override
	void method17450() {
		OpenGL.glActiveTexture(this.anInt2516 + 33984);
	}

	@OriginalMember(owner = "client!akk", name = "abz", descriptor = "()V", line = 530)
	@Override
	void method17759() {
		OpenGL.glActiveTexture(this.anInt2516 + 33984);
	}

	@OriginalMember(owner = "client!akk", name = "abk", descriptor = "()V", line = 530)
	@Override
	void method17503() {
		OpenGL.glActiveTexture(this.anInt2516 + 33984);
	}

	@OriginalMember(owner = "client!akk", name = "so", descriptor = "()V", line = 534)
	@Override
	void method17525() {
		OpenGL.glTexEnvi(8960, 34161, method16338(this.aClass251Array5[this.anInt2516]));
	}

	@OriginalMember(owner = "client!akk", name = "abv", descriptor = "()V", line = 534)
	@Override
	void method17761() {
		OpenGL.glTexEnvi(8960, 34161, method16338(this.aClass251Array5[this.anInt2516]));
	}

	@OriginalMember(owner = "client!akk", name = "abt", descriptor = "()V", line = 534)
	@Override
	void method17498() {
		OpenGL.glTexEnvi(8960, 34161, method16338(this.aClass251Array5[this.anInt2516]));
	}

	@OriginalMember(owner = "client!akk", name = "sh", descriptor = "()V", line = 538)
	@Override
	void method17526() {
		OpenGL.glTexEnvi(8960, 34162, method16338(this.aClass251Array6[this.anInt2516]));
	}

	@OriginalMember(owner = "client!akk", name = "adm", descriptor = "()V", line = 538)
	@Override
	void method17813() {
		OpenGL.glTexEnvi(8960, 34162, method16338(this.aClass251Array6[this.anInt2516]));
	}

	@OriginalMember(owner = "client!akk", name = "adz", descriptor = "()V", line = 538)
	@Override
	void method17753() {
		OpenGL.glTexEnvi(8960, 34162, method16338(this.aClass251Array6[this.anInt2516]));
	}

	@OriginalMember(owner = "client!akk", name = "sd", descriptor = "(ILclient!jg;ZZ)V", line = 542)
	@Override
	final void method17517(@OriginalArg(0) int arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, method16335(arg1));
		if (arg2) {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg3 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg3 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!akk", name = "aay", descriptor = "(ILclient!jg;ZZ)V", line = 542)
	@Override
	final void method17767(@OriginalArg(0) int arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, method16335(arg1));
		if (arg2) {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg3 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg3 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!akk", name = "aam", descriptor = "(ILclient!jg;ZZ)V", line = 542)
	@Override
	final void method17743(@OriginalArg(0) int arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, method16335(arg1));
		if (arg2) {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg3 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg3 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!akk", name = "aan", descriptor = "(ILclient!jg;Z)V", line = 548)
	@Override
	final void method17747(@OriginalArg(0) int arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) boolean arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, method16335(arg1));
		OpenGL.glTexEnvi(8960, arg0 + 34200, arg2 ? 771 : 770);
	}

	@OriginalMember(owner = "client!akk", name = "aas", descriptor = "(ILclient!jg;Z)V", line = 548)
	@Override
	final void method17746(@OriginalArg(0) int arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) boolean arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, method16335(arg1));
		OpenGL.glTexEnvi(8960, arg0 + 34200, arg2 ? 771 : 770);
	}

	@OriginalMember(owner = "client!akk", name = "aak", descriptor = "(ILclient!jg;Z)V", line = 548)
	@Override
	final void method17748(@OriginalArg(0) int arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) boolean arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, method16335(arg1));
		OpenGL.glTexEnvi(8960, arg0 + 34200, arg2 ? 771 : 770);
	}

	@OriginalMember(owner = "client!akk", name = "aac", descriptor = "(ILclient!jg;Z)V", line = 548)
	@Override
	final void method17750(@OriginalArg(0) int arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) boolean arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, method16335(arg1));
		OpenGL.glTexEnvi(8960, arg0 + 34200, arg2 ? 771 : 770);
	}

	@OriginalMember(owner = "client!akk", name = "aah", descriptor = "(ILclient!jg;Z)V", line = 548)
	@Override
	final void method17749(@OriginalArg(0) int arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) boolean arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, method16335(arg1));
		OpenGL.glTexEnvi(8960, arg0 + 34200, arg2 ? 771 : 770);
	}

	@OriginalMember(owner = "client!akk", name = "sr", descriptor = "(ILclient!jg;Z)V", line = 548)
	@Override
	final void method17518(@OriginalArg(0) int arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) boolean arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, method16335(arg1));
		OpenGL.glTexEnvi(8960, arg0 + 34200, arg2 ? 771 : 770);
	}

	@OriginalMember(owner = "client!akk", name = "sm", descriptor = "()V", line = 553)
	@Override
	final void method17678() {
		this.aFloatArray66[0] = (float) (this.anInt2507 & 0xFF0000) / 1.671168E7F;
		this.aFloatArray66[1] = (float) (this.anInt2507 & 0xFF00) / 65280.0F;
		this.aFloatArray66[2] = (float) (this.anInt2507 & 0xFF) / 255.0F;
		this.aFloatArray66[3] = (float) (this.anInt2507 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, this.aFloatArray66, 0);
	}

	@OriginalMember(owner = "client!akk", name = "abq", descriptor = "()V", line = 553)
	@Override
	final void method17756() {
		this.aFloatArray66[0] = (float) (this.anInt2507 & 0xFF0000) / 1.671168E7F;
		this.aFloatArray66[1] = (float) (this.anInt2507 & 0xFF00) / 65280.0F;
		this.aFloatArray66[2] = (float) (this.anInt2507 & 0xFF) / 255.0F;
		this.aFloatArray66[3] = (float) (this.anInt2507 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, this.aFloatArray66, 0);
	}

	@OriginalMember(owner = "client!akk", name = "aeg", descriptor = "(Lclient!ja;)I", line = 561)
	static final int method16338(@OriginalArg(0) Class251 arg0) {
		if (arg0 == Class251.aClass251_3) {
			return 7681;
		} else if (arg0 == Class251.aClass251_2) {
			return 8448;
		} else if (arg0 == Class251.aClass251_5) {
			return 34165;
		} else if (arg0 == Class251.aClass251_1) {
			return 260;
		} else if (arg0 == Class251.aClass251_4) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!akk", name = "aek", descriptor = "(Lclient!ja;)I", line = 561)
	static final int method16340(@OriginalArg(0) Class251 arg0) {
		if (arg0 == Class251.aClass251_3) {
			return 7681;
		} else if (arg0 == Class251.aClass251_2) {
			return 8448;
		} else if (arg0 == Class251.aClass251_5) {
			return 34165;
		} else if (arg0 == Class251.aClass251_1) {
			return 260;
		} else if (arg0 == Class251.aClass251_4) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!akk", name = "ael", descriptor = "(Lclient!jg;)I", line = 570)
	static final int method16335(@OriginalArg(0) Class255 arg0) {
		if (arg0 == Class255.aClass255_2) {
			return 5890;
		} else if (arg0 == Class255.aClass255_1) {
			return 34167;
		} else if (arg0 == Class255.aClass255_4) {
			return 34168;
		} else if (arg0 == Class255.aClass255_3) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!akk", name = "aey", descriptor = "(Lclient!jg;)I", line = 570)
	static final int method16354(@OriginalArg(0) Class255 arg0) {
		if (arg0 == Class255.aClass255_2) {
			return 5890;
		} else if (arg0 == Class255.aClass255_1) {
			return 34167;
		} else if (arg0 == Class255.aClass255_4) {
			return 34168;
		} else if (arg0 == Class255.aClass255_3) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!akk", name = "aee", descriptor = "(Lclient!jg;)I", line = 570)
	static final int method16355(@OriginalArg(0) Class255 arg0) {
		if (arg0 == Class255.aClass255_2) {
			return 5890;
		} else if (arg0 == Class255.aClass255_1) {
			return 34167;
		} else if (arg0 == Class255.aClass255_4) {
			return 34168;
		} else if (arg0 == Class255.aClass255_3) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!akk", name = "sv", descriptor = "(I)V", line = 578)
	@Override
	void method17532(@OriginalArg(0) int arg0) {
		OpenGL.glColorMask((arg0 & 0x1) != 0, (arg0 & 0x2) != 0, (arg0 & 0x4) != 0, (arg0 & 0x8) != 0);
	}

	@OriginalMember(owner = "client!akk", name = "aca", descriptor = "(I)V", line = 578)
	@Override
	void method17529(@OriginalArg(0) int arg0) {
		OpenGL.glColorMask((arg0 & 0x1) != 0, (arg0 & 0x2) != 0, (arg0 & 0x4) != 0, (arg0 & 0x8) != 0);
	}

	@OriginalMember(owner = "client!akk", name = "acr", descriptor = "(I)V", line = 578)
	@Override
	void method17776(@OriginalArg(0) int arg0) {
		OpenGL.glColorMask((arg0 & 0x1) != 0, (arg0 & 0x2) != 0, (arg0 & 0x4) != 0, (arg0 & 0x8) != 0);
	}

	@OriginalMember(owner = "client!akk", name = "tm", descriptor = "()V", line = 582)
	@Override
	void method17441() {
		if (this.aBoolean433) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
		OpenGL.glAlphaFunc(516, (float) (this.aByte78 & 0xFF) / 255.0F);
	}

	@OriginalMember(owner = "client!akk", name = "acs", descriptor = "()V", line = 582)
	@Override
	void method17777() {
		if (this.aBoolean433) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
		OpenGL.glAlphaFunc(516, (float) (this.aByte78 & 0xFF) / 255.0F);
	}

	@OriginalMember(owner = "client!akk", name = "acy", descriptor = "()V", line = 582)
	@Override
	void method17778() {
		if (this.aBoolean433) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
		OpenGL.glAlphaFunc(516, (float) (this.aByte78 & 0xFF) / 255.0F);
	}

	@OriginalMember(owner = "client!akk", name = "tn", descriptor = "()V", line = 588)
	@Override
	void method17534() {
		if (this.aBoolean448) {
			@Pc(4) byte local4 = 0;
			@Pc(6) byte local6 = 0;
			if (this.anInt2478 == 0) {
				local4 = 0;
				local6 = 0;
			} else if (this.anInt2478 == 1) {
				local4 = 1;
				local6 = 0;
			} else if (this.anInt2478 == 2) {
				local4 = 1;
				local6 = 1;
			} else if (this.anInt2478 == 3) {
				local4 = 0;
				local6 = 1;
			}
			if (this.aClass258_3 == Class258.aClass258_6) {
				OpenGL.glBlendFuncSeparate(770, 771, local4, local6);
			} else if (this.aClass258_3 == Class258.aClass258_5) {
				OpenGL.glBlendFuncSeparate(1, 1, local4, local6);
			} else if (this.aClass258_3 == Class258.aClass258_4) {
				OpenGL.glBlendFuncSeparate(774, 1, local4, local6);
			} else if (this.aClass258_3 == Class258.aClass258_7) {
				OpenGL.glBlendFuncSeparate(1, 0, local4, local6);
			}
		} else if (this.aClass258_3 == Class258.aClass258_6) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(770, 771);
		} else if (this.aClass258_3 == Class258.aClass258_5) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(1, 1);
		} else if (this.aClass258_3 == Class258.aClass258_4) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(774, 1);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!akk", name = "acl", descriptor = "()V", line = 588)
	@Override
	void method17652() {
		if (this.aBoolean448) {
			@Pc(4) byte local4 = 0;
			@Pc(6) byte local6 = 0;
			if (this.anInt2478 == 0) {
				local4 = 0;
				local6 = 0;
			} else if (this.anInt2478 == 1) {
				local4 = 1;
				local6 = 0;
			} else if (this.anInt2478 == 2) {
				local4 = 1;
				local6 = 1;
			} else if (this.anInt2478 == 3) {
				local4 = 0;
				local6 = 1;
			}
			if (this.aClass258_3 == Class258.aClass258_6) {
				OpenGL.glBlendFuncSeparate(770, 771, local4, local6);
			} else if (this.aClass258_3 == Class258.aClass258_5) {
				OpenGL.glBlendFuncSeparate(1, 1, local4, local6);
			} else if (this.aClass258_3 == Class258.aClass258_4) {
				OpenGL.glBlendFuncSeparate(774, 1, local4, local6);
			} else if (this.aClass258_3 == Class258.aClass258_7) {
				OpenGL.glBlendFuncSeparate(1, 0, local4, local6);
			}
		} else if (this.aClass258_3 == Class258.aClass258_6) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(770, 771);
		} else if (this.aClass258_3 == Class258.aClass258_5) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(1, 1);
		} else if (this.aClass258_3 == Class258.aClass258_4) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(774, 1);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!akk", name = "ack", descriptor = "()V", line = 630)
	@Override
	void method17781() {
		if (this.aBoolean440) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!akk", name = "tc", descriptor = "()V", line = 630)
	@Override
	void method17535() {
		if (this.aBoolean440) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!akk", name = "acq", descriptor = "()V", line = 630)
	@Override
	void method17487() {
		if (this.aBoolean440) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!akk", name = "ts", descriptor = "()V", line = 635)
	@Override
	void method17462() {
		if (this.aBoolean437 && this.aBoolean432 && this.anInt2520 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!akk", name = "acj", descriptor = "()V", line = 635)
	@Override
	void method17790() {
		if (this.aBoolean437 && this.aBoolean432 && this.anInt2520 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!akk", name = "tu", descriptor = "()V", line = 640)
	@Override
	void method17538() {
		this.aFloat199 = this.aFloat192 - (float) this.anInt2521;
		this.aFloat198 = this.aFloat199 - (float) this.anInt2520;
		if (this.aFloat198 < this.aFloat184) {
			this.aFloat198 = this.aFloat184;
		}
		if (!this.aBoolean422) {
			return;
		}
		OpenGL.glFogf(2915, this.aFloat198);
		OpenGL.glFogf(2916, this.aFloat199);
		this.aFloatArray66[0] = (float) (this.anInt2519 & 0xFF0000) / 1.671168E7F;
		this.aFloatArray66[1] = (float) (this.anInt2519 & 0xFF00) / 65280.0F;
		this.aFloatArray66[2] = (float) (this.anInt2519 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, this.aFloatArray66, 0);
	}

	@OriginalMember(owner = "client!akk", name = "acn", descriptor = "()V", line = 640)
	@Override
	void method17596() {
		this.aFloat199 = this.aFloat192 - (float) this.anInt2521;
		this.aFloat198 = this.aFloat199 - (float) this.anInt2520;
		if (this.aFloat198 < this.aFloat184) {
			this.aFloat198 = this.aFloat184;
		}
		if (!this.aBoolean422) {
			return;
		}
		OpenGL.glFogf(2915, this.aFloat198);
		OpenGL.glFogf(2916, this.aFloat199);
		this.aFloatArray66[0] = (float) (this.anInt2519 & 0xFF0000) / 1.671168E7F;
		this.aFloatArray66[1] = (float) (this.anInt2519 & 0xFF00) / 65280.0F;
		this.aFloatArray66[2] = (float) (this.anInt2519 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, this.aFloatArray66, 0);
	}

	@OriginalMember(owner = "client!akk", name = "aci", descriptor = "()V", line = 640)
	@Override
	void method17789() {
		this.aFloat199 = this.aFloat192 - (float) this.anInt2521;
		this.aFloat198 = this.aFloat199 - (float) this.anInt2520;
		if (this.aFloat198 < this.aFloat184) {
			this.aFloat198 = this.aFloat184;
		}
		if (!this.aBoolean422) {
			return;
		}
		OpenGL.glFogf(2915, this.aFloat198);
		OpenGL.glFogf(2916, this.aFloat199);
		this.aFloatArray66[0] = (float) (this.anInt2519 & 0xFF0000) / 1.671168E7F;
		this.aFloatArray66[1] = (float) (this.anInt2519 & 0xFF00) / 65280.0F;
		this.aFloatArray66[2] = (float) (this.anInt2519 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, this.aFloatArray66, 0);
	}

	@OriginalMember(owner = "client!akk", name = "ty", descriptor = "(Z)V", line = 654)
	@Override
	void method17770(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!akk", name = "acp", descriptor = "(Z)V", line = 654)
	@Override
	void method17792(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!akk", name = "acd", descriptor = "(Z)V", line = 654)
	@Override
	void method17791(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!akk", name = "acb", descriptor = "(Z)Lclient!if;", line = 659)
	@Override
	final Interface21 method17642(@OriginalArg(0) boolean arg0) {
		return new Class35_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!akk", name = "tk", descriptor = "(Z)Lclient!if;", line = 659)
	@Override
	final Interface21 method17542(@OriginalArg(0) boolean arg0) {
		return new Class35_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!akk", name = "tw", descriptor = "(Z)Lclient!jw;", line = 663)
	@Override
	final Interface30 method17648(@OriginalArg(0) boolean arg0) {
		return new Class35_Sub2(this, Class127.aClass127_21, arg0);
	}

	@OriginalMember(owner = "client!akk", name = "act", descriptor = "(Z)Lclient!jw;", line = 663)
	@Override
	final Interface30 method17465(@OriginalArg(0) boolean arg0) {
		return new Class35_Sub2(this, Class127.aClass127_21, arg0);
	}

	@OriginalMember(owner = "client!akk", name = "to", descriptor = "([Lclient!jb;)Lclient!iy;", line = 667)
	@Override
	Class37 method17590(@OriginalArg(0) Class252[] arg0) {
		return new Class37_Sub2(arg0);
	}

	@OriginalMember(owner = "client!akk", name = "acv", descriptor = "([Lclient!jb;)Lclient!iy;", line = 667)
	@Override
	Class37 method17795(@OriginalArg(0) Class252[] arg0) {
		return new Class37_Sub2(arg0);
	}

	@OriginalMember(owner = "client!akk", name = "tl", descriptor = "(ILclient!if;)V", line = 671)
	@Override
	public void method17544(@OriginalArg(0) int arg0, @OriginalArg(1) Interface21 arg1) {
		this.aClass35_Sub1Array1[arg0] = (Class35_Sub1) arg1;
	}

	@OriginalMember(owner = "client!akk", name = "ado", descriptor = "(ILclient!if;)V", line = 671)
	@Override
	public void method17799(@OriginalArg(0) int arg0, @OriginalArg(1) Interface21 arg1) {
		this.aClass35_Sub1Array1[arg0] = (Class35_Sub1) arg1;
	}

	@OriginalMember(owner = "client!akk", name = "tb", descriptor = "(Lclient!jw;)V", line = 675)
	@Override
	void method17545(@OriginalArg(0) Interface30 arg0) {
		this.aClass35_Sub2_1 = (Class35_Sub2) arg0;
		this.aClass35_Sub2_1.method8574();
	}

	@OriginalMember(owner = "client!akk", name = "adt", descriptor = "(Lclient!jw;)V", line = 675)
	@Override
	void method17711(@OriginalArg(0) Interface30 arg0) {
		this.aClass35_Sub2_1 = (Class35_Sub2) arg0;
		this.aClass35_Sub2_1.method8574();
	}

	@OriginalMember(owner = "client!akk", name = "adn", descriptor = "(Lclient!jw;)V", line = 675)
	@Override
	void method17815(@OriginalArg(0) Interface30 arg0) {
		this.aClass35_Sub2_1 = (Class35_Sub2) arg0;
		this.aClass35_Sub2_1.method8574();
	}

	@OriginalMember(owner = "client!akk", name = "ads", descriptor = "(Lclient!jw;)V", line = 675)
	@Override
	void method17727(@OriginalArg(0) Interface30 arg0) {
		this.aClass35_Sub2_1 = (Class35_Sub2) arg0;
		this.aClass35_Sub2_1.method8574();
	}

	@OriginalMember(owner = "client!akk", name = "tz", descriptor = "(Lclient!iy;)V", line = 680)
	@Override
	public void method17738(@OriginalArg(0) Class37 arg0) {
		@Pc(2) Class252[] local2 = arg0.aClass252Array3;
		@Pc(4) int local4 = 0;
		@Pc(6) boolean local6 = false;
		@Pc(8) boolean local8 = false;
		@Pc(10) boolean local10 = false;
		@Pc(12) int local12;
		for (local12 = 0; local12 < local2.length; local12++) {
			@Pc(20) Class252 local20 = local2[local12];
			@Pc(25) Class35_Sub1 local25 = this.aClass35_Sub1Array1[local12];
			@Pc(27) int local27 = 0;
			@Pc(30) int local30 = local25.method7762();
			@Pc(33) long local33 = local25.method8584();
			local25.method8574();
			for (@Pc(37) int local37 = 0; local37 < local20.method25198(); local37++) {
				@Pc(45) Class240 local45 = local20.method25199(local37);
				switch(local45.anInt3757) {
					case 0:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(3, 5126, local30, local33 + (long) local27);
					case 1:
					case 4:
					case 7:
					case 9:
					case 10:
					default:
						break;
					case 2:
						OpenGL.glVertexPointer(3, 5126, local30, local33 + (long) local27);
						local10 = true;
						break;
					case 3:
						OpenGL.glColorPointer(4, 5121, local30, local33 + (long) local27);
						local6 = true;
						break;
					case 5:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(2, 5126, local30, local33 + (long) local27);
						break;
					case 6:
						OpenGL.glNormalPointer(5126, local30, local33 + (long) local27);
						local8 = true;
						break;
					case 8:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(4, 5126, local30, local33 + (long) local27);
						break;
					case 11:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(1, 5126, local30, local33 + (long) local27);
				}
				local27 += local45.anInt3760;
			}
		}
		if (this.aBoolean400 != local10) {
			if (local10) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean400 = local10;
		}
		if (this.aBoolean399 != local8) {
			if (local8) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean399 = local8;
		}
		if (this.aBoolean407 != local6) {
			if (local6) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean407 = local6;
		}
		if (this.anInt2344 < local4) {
			for (local12 = this.anInt2344; local12 < local4; local12++) {
				OpenGL.glClientActiveTexture(local12 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt2344 = local4;
		} else if (this.anInt2344 > local4) {
			for (local12 = local4; local12 < this.anInt2344; local12++) {
				OpenGL.glClientActiveTexture(local12 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt2344 = local4;
		}
	}

	@OriginalMember(owner = "client!akk", name = "adk", descriptor = "(Lclient!iy;)V", line = 680)
	@Override
	public void method17797(@OriginalArg(0) Class37 arg0) {
		@Pc(2) Class252[] local2 = arg0.aClass252Array3;
		@Pc(4) int local4 = 0;
		@Pc(6) boolean local6 = false;
		@Pc(8) boolean local8 = false;
		@Pc(10) boolean local10 = false;
		@Pc(12) int local12;
		for (local12 = 0; local12 < local2.length; local12++) {
			@Pc(20) Class252 local20 = local2[local12];
			@Pc(25) Class35_Sub1 local25 = this.aClass35_Sub1Array1[local12];
			@Pc(27) int local27 = 0;
			@Pc(30) int local30 = local25.method7762();
			@Pc(33) long local33 = local25.method8584();
			local25.method8574();
			for (@Pc(37) int local37 = 0; local37 < local20.method25198(); local37++) {
				@Pc(45) Class240 local45 = local20.method25199(local37);
				switch(local45.anInt3757) {
					case 0:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(3, 5126, local30, local33 + (long) local27);
					case 1:
					case 4:
					case 7:
					case 9:
					case 10:
					default:
						break;
					case 2:
						OpenGL.glVertexPointer(3, 5126, local30, local33 + (long) local27);
						local10 = true;
						break;
					case 3:
						OpenGL.glColorPointer(4, 5121, local30, local33 + (long) local27);
						local6 = true;
						break;
					case 5:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(2, 5126, local30, local33 + (long) local27);
						break;
					case 6:
						OpenGL.glNormalPointer(5126, local30, local33 + (long) local27);
						local8 = true;
						break;
					case 8:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(4, 5126, local30, local33 + (long) local27);
						break;
					case 11:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(1, 5126, local30, local33 + (long) local27);
				}
				local27 += local45.anInt3760;
			}
		}
		if (this.aBoolean400 != local10) {
			if (local10) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean400 = local10;
		}
		if (this.aBoolean399 != local8) {
			if (local8) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean399 = local8;
		}
		if (this.aBoolean407 != local6) {
			if (local6) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean407 = local6;
		}
		if (this.anInt2344 < local4) {
			for (local12 = this.anInt2344; local12 < local4; local12++) {
				OpenGL.glClientActiveTexture(local12 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt2344 = local4;
		} else if (this.anInt2344 > local4) {
			for (local12 = local4; local12 < this.anInt2344; local12++) {
				OpenGL.glClientActiveTexture(local12 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt2344 = local4;
		}
	}

	@OriginalMember(owner = "client!akk", name = "add", descriptor = "(Lclient!iy;)V", line = 680)
	@Override
	public void method17516(@OriginalArg(0) Class37 arg0) {
		@Pc(2) Class252[] local2 = arg0.aClass252Array3;
		@Pc(4) int local4 = 0;
		@Pc(6) boolean local6 = false;
		@Pc(8) boolean local8 = false;
		@Pc(10) boolean local10 = false;
		@Pc(12) int local12;
		for (local12 = 0; local12 < local2.length; local12++) {
			@Pc(20) Class252 local20 = local2[local12];
			@Pc(25) Class35_Sub1 local25 = this.aClass35_Sub1Array1[local12];
			@Pc(27) int local27 = 0;
			@Pc(30) int local30 = local25.method7762();
			@Pc(33) long local33 = local25.method8584();
			local25.method8574();
			for (@Pc(37) int local37 = 0; local37 < local20.method25198(); local37++) {
				@Pc(45) Class240 local45 = local20.method25199(local37);
				switch(local45.anInt3757) {
					case 0:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(3, 5126, local30, local33 + (long) local27);
					case 1:
					case 4:
					case 7:
					case 9:
					case 10:
					default:
						break;
					case 2:
						OpenGL.glVertexPointer(3, 5126, local30, local33 + (long) local27);
						local10 = true;
						break;
					case 3:
						OpenGL.glColorPointer(4, 5121, local30, local33 + (long) local27);
						local6 = true;
						break;
					case 5:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(2, 5126, local30, local33 + (long) local27);
						break;
					case 6:
						OpenGL.glNormalPointer(5126, local30, local33 + (long) local27);
						local8 = true;
						break;
					case 8:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(4, 5126, local30, local33 + (long) local27);
						break;
					case 11:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(1, 5126, local30, local33 + (long) local27);
				}
				local27 += local45.anInt3760;
			}
		}
		if (this.aBoolean400 != local10) {
			if (local10) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean400 = local10;
		}
		if (this.aBoolean399 != local8) {
			if (local8) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean399 = local8;
		}
		if (this.aBoolean407 != local6) {
			if (local6) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean407 = local6;
		}
		if (this.anInt2344 < local4) {
			for (local12 = this.anInt2344; local12 < local4; local12++) {
				OpenGL.glClientActiveTexture(local12 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt2344 = local4;
		} else if (this.anInt2344 > local4) {
			for (local12 = local4; local12 < this.anInt2344; local12++) {
				OpenGL.glClientActiveTexture(local12 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt2344 = local4;
		}
	}

	@OriginalMember(owner = "client!akk", name = "ade", descriptor = "(Lclient!iy;)V", line = 680)
	@Override
	public void method17621(@OriginalArg(0) Class37 arg0) {
		@Pc(2) Class252[] local2 = arg0.aClass252Array3;
		@Pc(4) int local4 = 0;
		@Pc(6) boolean local6 = false;
		@Pc(8) boolean local8 = false;
		@Pc(10) boolean local10 = false;
		@Pc(12) int local12;
		for (local12 = 0; local12 < local2.length; local12++) {
			@Pc(20) Class252 local20 = local2[local12];
			@Pc(25) Class35_Sub1 local25 = this.aClass35_Sub1Array1[local12];
			@Pc(27) int local27 = 0;
			@Pc(30) int local30 = local25.method7762();
			@Pc(33) long local33 = local25.method8584();
			local25.method8574();
			for (@Pc(37) int local37 = 0; local37 < local20.method25198(); local37++) {
				@Pc(45) Class240 local45 = local20.method25199(local37);
				switch(local45.anInt3757) {
					case 0:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(3, 5126, local30, local33 + (long) local27);
					case 1:
					case 4:
					case 7:
					case 9:
					case 10:
					default:
						break;
					case 2:
						OpenGL.glVertexPointer(3, 5126, local30, local33 + (long) local27);
						local10 = true;
						break;
					case 3:
						OpenGL.glColorPointer(4, 5121, local30, local33 + (long) local27);
						local6 = true;
						break;
					case 5:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(2, 5126, local30, local33 + (long) local27);
						break;
					case 6:
						OpenGL.glNormalPointer(5126, local30, local33 + (long) local27);
						local8 = true;
						break;
					case 8:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(4, 5126, local30, local33 + (long) local27);
						break;
					case 11:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(1, 5126, local30, local33 + (long) local27);
				}
				local27 += local45.anInt3760;
			}
		}
		if (this.aBoolean400 != local10) {
			if (local10) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean400 = local10;
		}
		if (this.aBoolean399 != local8) {
			if (local8) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean399 = local8;
		}
		if (this.aBoolean407 != local6) {
			if (local6) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean407 = local6;
		}
		if (this.anInt2344 < local4) {
			for (local12 = this.anInt2344; local12 < local4; local12++) {
				OpenGL.glClientActiveTexture(local12 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt2344 = local4;
		} else if (this.anInt2344 > local4) {
			for (local12 = local4; local12 < this.anInt2344; local12++) {
				OpenGL.glClientActiveTexture(local12 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt2344 = local4;
		}
	}

	@OriginalMember(owner = "client!akk", name = "tv", descriptor = "(Lclient!jr;II)V", line = 763)
	@Override
	public final void method17554(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) byte local4;
		@Pc(8) int local8;
		if (arg0 == Class263.aClass263_2) {
			local4 = 1;
			local8 = arg2 * 2;
		} else if (arg0 == Class263.aClass263_1) {
			local4 = 3;
			local8 = arg2 + 1;
		} else if (arg0 == Class263.aClass263_4) {
			local4 = 4;
			local8 = arg2 * 3;
		} else if (arg0 == Class263.aClass263_3) {
			local4 = 6;
			local8 = arg2 + 2;
		} else if (arg0 == Class263.aClass263_6) {
			local4 = 5;
			local8 = arg2 + 2;
		} else {
			local4 = 0;
			local8 = arg2;
		}
		OpenGL.glDrawArrays(local4, arg1, local8);
	}

	@OriginalMember(owner = "client!akk", name = "adf", descriptor = "(Lclient!jr;II)V", line = 763)
	@Override
	public final void method17586(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) byte local4;
		@Pc(8) int local8;
		if (arg0 == Class263.aClass263_2) {
			local4 = 1;
			local8 = arg2 * 2;
		} else if (arg0 == Class263.aClass263_1) {
			local4 = 3;
			local8 = arg2 + 1;
		} else if (arg0 == Class263.aClass263_4) {
			local4 = 4;
			local8 = arg2 * 3;
		} else if (arg0 == Class263.aClass263_3) {
			local4 = 6;
			local8 = arg2 + 2;
		} else if (arg0 == Class263.aClass263_6) {
			local4 = 5;
			local8 = arg2 + 2;
		} else {
			local4 = 0;
			local8 = arg2;
		}
		OpenGL.glDrawArrays(local4, arg1, local8);
	}

	@OriginalMember(owner = "client!akk", name = "adr", descriptor = "(Lclient!jw;Lclient!jr;IIII)V", line = 793)
	@Override
	final void method17805(@OriginalArg(0) Interface30 arg0, @OriginalArg(1) Class263 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) byte local4;
		@Pc(8) int local8;
		if (arg1 == Class263.aClass263_2) {
			local4 = 1;
			local8 = arg5 * 2;
		} else if (arg1 == Class263.aClass263_1) {
			local4 = 3;
			local8 = arg5 + 1;
		} else if (arg1 == Class263.aClass263_4) {
			local4 = 4;
			local8 = arg5 * 3;
		} else if (arg1 == Class263.aClass263_3) {
			local4 = 6;
			local8 = arg5 + 2;
		} else if (arg1 == Class263.aClass263_6) {
			local4 = 5;
			local8 = arg5 + 2;
		} else {
			local4 = 0;
			local8 = arg5;
		}
		@Pc(56) Class127 local56 = arg0.method25721();
		@Pc(59) Class35_Sub2 local59 = (Class35_Sub2) arg0;
		local59.method8574();
		OpenGL.glDrawElements(local4, local8, method16346(local56), local59.method8584() + (long) (arg4 * local56.anInt3315 * -1246993659));
	}

	@OriginalMember(owner = "client!akk", name = "tj", descriptor = "(Lclient!jw;Lclient!jr;IIII)V", line = 793)
	@Override
	final void method17817(@OriginalArg(0) Interface30 arg0, @OriginalArg(1) Class263 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) byte local4;
		@Pc(8) int local8;
		if (arg1 == Class263.aClass263_2) {
			local4 = 1;
			local8 = arg5 * 2;
		} else if (arg1 == Class263.aClass263_1) {
			local4 = 3;
			local8 = arg5 + 1;
		} else if (arg1 == Class263.aClass263_4) {
			local4 = 4;
			local8 = arg5 * 3;
		} else if (arg1 == Class263.aClass263_3) {
			local4 = 6;
			local8 = arg5 + 2;
		} else if (arg1 == Class263.aClass263_6) {
			local4 = 5;
			local8 = arg5 + 2;
		} else {
			local4 = 0;
			local8 = arg5;
		}
		@Pc(56) Class127 local56 = arg0.method25721();
		@Pc(59) Class35_Sub2 local59 = (Class35_Sub2) arg0;
		local59.method8574();
		OpenGL.glDrawElements(local4, local8, method16346(local56), local59.method8584() + (long) (arg4 * local56.anInt3315 * -1246993659));
	}

	@OriginalMember(owner = "client!akk", name = "adg", descriptor = "(Lclient!jr;IIII)V", line = 826)
	@Override
	public final void method17806(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(4) byte local4;
		@Pc(8) int local8;
		if (arg0 == Class263.aClass263_2) {
			local4 = 1;
			local8 = arg4 * 2;
		} else if (arg0 == Class263.aClass263_1) {
			local4 = 3;
			local8 = arg4 + 1;
		} else if (arg0 == Class263.aClass263_4) {
			local4 = 4;
			local8 = arg4 * 3;
		} else if (arg0 == Class263.aClass263_3) {
			local4 = 6;
			local8 = arg4 + 2;
		} else if (arg0 == Class263.aClass263_6) {
			local4 = 5;
			local8 = arg4 + 2;
		} else {
			local4 = 0;
			local8 = arg4;
		}
		@Pc(57) Class127 local57 = this.aClass35_Sub2_1.method25721();
		OpenGL.glDrawElements(local4, local8, method16346(local57), this.aClass35_Sub2_1.method8584() + (long) (arg3 * local57.anInt3315 * -1246993659));
	}

	@OriginalMember(owner = "client!akk", name = "tf", descriptor = "(Lclient!jr;IIII)V", line = 826)
	@Override
	public final void method17555(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(4) byte local4;
		@Pc(8) int local8;
		if (arg0 == Class263.aClass263_2) {
			local4 = 1;
			local8 = arg4 * 2;
		} else if (arg0 == Class263.aClass263_1) {
			local4 = 3;
			local8 = arg4 + 1;
		} else if (arg0 == Class263.aClass263_4) {
			local4 = 4;
			local8 = arg4 * 3;
		} else if (arg0 == Class263.aClass263_3) {
			local4 = 6;
			local8 = arg4 + 2;
		} else if (arg0 == Class263.aClass263_6) {
			local4 = 5;
			local8 = arg4 + 2;
		} else {
			local4 = 0;
			local8 = arg4;
		}
		@Pc(57) Class127 local57 = this.aClass35_Sub2_1.method25721();
		OpenGL.glDrawElements(local4, local8, method16346(local57), this.aClass35_Sub2_1.method8584() + (long) (arg3 * local57.anInt3315 * -1246993659));
	}

	@OriginalMember(owner = "client!akk", name = "c", descriptor = "(I)V", line = 856)
	@Override
	public final synchronized void method17022(@OriginalArg(0) int arg0) {
		try {
			this.method16353();
		} catch (@Pc(3) Exception local3) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) int local10 = arg0 & Integer.MAX_VALUE;
		@Pc(21) Class3_Sub21 local21;
		while (!this.aClass553_35.method32712()) {
			local21 = (Class3_Sub21) this.aClass553_35.method32718();
			this.anIntArray228[local6++] = (int) (local21.aLong296 * -1930649055099428229L);
			this.anInt2483 -= local21.anInt1285 * 1585682181;
			if (local6 == 1000) {
				OpenGL.glDeleteBuffersARB(local6, this.anIntArray228, 0);
				local6 = 0;
			}
		}
		if (local6 > 0) {
			OpenGL.glDeleteBuffersARB(local6, this.anIntArray228, 0);
			local6 = 0;
		}
		while (!this.aClass553_31.method32712()) {
			local21 = (Class3_Sub21) this.aClass553_31.method32718();
			this.anIntArray228[local6++] = (int) (local21.aLong296 * -1930649055099428229L);
			this.anInt2484 -= local21.anInt1285 * 1585682181;
			if (local6 == 1000) {
				OpenGL.glDeleteTextures(local6, this.anIntArray228, 0);
				local6 = 0;
			}
		}
		if (local6 > 0) {
			OpenGL.glDeleteTextures(local6, this.anIntArray228, 0);
			local6 = 0;
		}
		while (!this.aClass553_32.method32712()) {
			local21 = (Class3_Sub21) this.aClass553_32.method32718();
			this.anIntArray228[local6++] = local21.anInt1285 * 1585682181;
			if (local6 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local6, this.anIntArray228, 0);
				local6 = 0;
			}
		}
		if (local6 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local6, this.anIntArray228, 0);
			local6 = 0;
		}
		while (!this.aClass553_33.method32712()) {
			local21 = (Class3_Sub21) this.aClass553_33.method32718();
			this.anIntArray228[local6++] = (int) (local21.aLong296 * -1930649055099428229L);
			this.anInt2490 -= local21.anInt1285 * 1585682181;
			if (local6 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local6, this.anIntArray228, 0);
				local6 = 0;
			}
		}
		if (local6 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local6, this.anIntArray228, 0);
		}
		while (!this.aClass553_30.method32712()) {
			local21 = (Class3_Sub21) this.aClass553_30.method32718();
			OpenGL.glDeleteLists((int) (local21.aLong296 * -1930649055099428229L), local21.anInt1285 * 1585682181);
		}
		@Pc(232) Class3 local232;
		while (!this.aClass553_36.method32712()) {
			local232 = this.aClass553_36.method32718();
			OpenGL.glDeleteProgram((int) (local232.aLong296 * -1930649055099428229L));
		}
		while (!this.aClass553_34.method32712()) {
			local232 = this.aClass553_34.method32718();
			OpenGL.glDeleteShader((int) (local232.aLong296 * -1930649055099428229L));
		}
		while (!this.aClass553_30.method32712()) {
			local21 = (Class3_Sub21) this.aClass553_30.method32718();
			OpenGL.glDeleteLists((int) (local21.aLong296 * -1930649055099428229L), local21.anInt1285 * 1585682181);
		}
		if (this.method17157() > 100663296 && Class176.method23413() > this.aLong99 + 60000L) {
			System.gc();
			this.aLong99 = Class176.method23413();
		}
		super.method17022(local10);
	}

	@OriginalMember(owner = "client!akk", name = "ez", descriptor = "(I)V", line = 856)
	@Override
	public final synchronized void method17154(@OriginalArg(0) int arg0) {
		try {
			this.method16353();
		} catch (@Pc(3) Exception local3) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) int local10 = arg0 & Integer.MAX_VALUE;
		@Pc(21) Class3_Sub21 local21;
		while (!this.aClass553_35.method32712()) {
			local21 = (Class3_Sub21) this.aClass553_35.method32718();
			this.anIntArray228[local6++] = (int) (local21.aLong296 * -1930649055099428229L);
			this.anInt2483 -= local21.anInt1285 * 1585682181;
			if (local6 == 1000) {
				OpenGL.glDeleteBuffersARB(local6, this.anIntArray228, 0);
				local6 = 0;
			}
		}
		if (local6 > 0) {
			OpenGL.glDeleteBuffersARB(local6, this.anIntArray228, 0);
			local6 = 0;
		}
		while (!this.aClass553_31.method32712()) {
			local21 = (Class3_Sub21) this.aClass553_31.method32718();
			this.anIntArray228[local6++] = (int) (local21.aLong296 * -1930649055099428229L);
			this.anInt2484 -= local21.anInt1285 * 1585682181;
			if (local6 == 1000) {
				OpenGL.glDeleteTextures(local6, this.anIntArray228, 0);
				local6 = 0;
			}
		}
		if (local6 > 0) {
			OpenGL.glDeleteTextures(local6, this.anIntArray228, 0);
			local6 = 0;
		}
		while (!this.aClass553_32.method32712()) {
			local21 = (Class3_Sub21) this.aClass553_32.method32718();
			this.anIntArray228[local6++] = local21.anInt1285 * 1585682181;
			if (local6 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local6, this.anIntArray228, 0);
				local6 = 0;
			}
		}
		if (local6 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local6, this.anIntArray228, 0);
			local6 = 0;
		}
		while (!this.aClass553_33.method32712()) {
			local21 = (Class3_Sub21) this.aClass553_33.method32718();
			this.anIntArray228[local6++] = (int) (local21.aLong296 * -1930649055099428229L);
			this.anInt2490 -= local21.anInt1285 * 1585682181;
			if (local6 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local6, this.anIntArray228, 0);
				local6 = 0;
			}
		}
		if (local6 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local6, this.anIntArray228, 0);
		}
		while (!this.aClass553_30.method32712()) {
			local21 = (Class3_Sub21) this.aClass553_30.method32718();
			OpenGL.glDeleteLists((int) (local21.aLong296 * -1930649055099428229L), local21.anInt1285 * 1585682181);
		}
		@Pc(232) Class3 local232;
		while (!this.aClass553_36.method32712()) {
			local232 = this.aClass553_36.method32718();
			OpenGL.glDeleteProgram((int) (local232.aLong296 * -1930649055099428229L));
		}
		while (!this.aClass553_34.method32712()) {
			local232 = this.aClass553_34.method32718();
			OpenGL.glDeleteShader((int) (local232.aLong296 * -1930649055099428229L));
		}
		while (!this.aClass553_30.method32712()) {
			local21 = (Class3_Sub21) this.aClass553_30.method32718();
			OpenGL.glDeleteLists((int) (local21.aLong296 * -1930649055099428229L), local21.anInt1285 * 1585682181);
		}
		if (this.method17157() > 100663296 && Class176.method23413() > this.aLong99 + 60000L) {
			System.gc();
			this.aLong99 = Class176.method23413();
		}
		super.method17022(local10);
	}

	@OriginalMember(owner = "client!akk", name = "ep", descriptor = "(I)V", line = 856)
	@Override
	public final synchronized void method17155(@OriginalArg(0) int arg0) {
		try {
			this.method16353();
		} catch (@Pc(3) Exception local3) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) int local10 = arg0 & Integer.MAX_VALUE;
		@Pc(21) Class3_Sub21 local21;
		while (!this.aClass553_35.method32712()) {
			local21 = (Class3_Sub21) this.aClass553_35.method32718();
			this.anIntArray228[local6++] = (int) (local21.aLong296 * -1930649055099428229L);
			this.anInt2483 -= local21.anInt1285 * 1585682181;
			if (local6 == 1000) {
				OpenGL.glDeleteBuffersARB(local6, this.anIntArray228, 0);
				local6 = 0;
			}
		}
		if (local6 > 0) {
			OpenGL.glDeleteBuffersARB(local6, this.anIntArray228, 0);
			local6 = 0;
		}
		while (!this.aClass553_31.method32712()) {
			local21 = (Class3_Sub21) this.aClass553_31.method32718();
			this.anIntArray228[local6++] = (int) (local21.aLong296 * -1930649055099428229L);
			this.anInt2484 -= local21.anInt1285 * 1585682181;
			if (local6 == 1000) {
				OpenGL.glDeleteTextures(local6, this.anIntArray228, 0);
				local6 = 0;
			}
		}
		if (local6 > 0) {
			OpenGL.glDeleteTextures(local6, this.anIntArray228, 0);
			local6 = 0;
		}
		while (!this.aClass553_32.method32712()) {
			local21 = (Class3_Sub21) this.aClass553_32.method32718();
			this.anIntArray228[local6++] = local21.anInt1285 * 1585682181;
			if (local6 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local6, this.anIntArray228, 0);
				local6 = 0;
			}
		}
		if (local6 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local6, this.anIntArray228, 0);
			local6 = 0;
		}
		while (!this.aClass553_33.method32712()) {
			local21 = (Class3_Sub21) this.aClass553_33.method32718();
			this.anIntArray228[local6++] = (int) (local21.aLong296 * -1930649055099428229L);
			this.anInt2490 -= local21.anInt1285 * 1585682181;
			if (local6 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local6, this.anIntArray228, 0);
				local6 = 0;
			}
		}
		if (local6 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local6, this.anIntArray228, 0);
		}
		while (!this.aClass553_30.method32712()) {
			local21 = (Class3_Sub21) this.aClass553_30.method32718();
			OpenGL.glDeleteLists((int) (local21.aLong296 * -1930649055099428229L), local21.anInt1285 * 1585682181);
		}
		@Pc(232) Class3 local232;
		while (!this.aClass553_36.method32712()) {
			local232 = this.aClass553_36.method32718();
			OpenGL.glDeleteProgram((int) (local232.aLong296 * -1930649055099428229L));
		}
		while (!this.aClass553_34.method32712()) {
			local232 = this.aClass553_34.method32718();
			OpenGL.glDeleteShader((int) (local232.aLong296 * -1930649055099428229L));
		}
		while (!this.aClass553_30.method32712()) {
			local21 = (Class3_Sub21) this.aClass553_30.method32718();
			OpenGL.glDeleteLists((int) (local21.aLong296 * -1930649055099428229L), local21.anInt1285 * 1585682181);
		}
		if (this.method17157() > 100663296 && Class176.method23413() > this.aLong99 + 60000L) {
			System.gc();
			this.aLong99 = Class176.method23413();
		}
		super.method17022(local10);
	}

	@OriginalMember(owner = "client!akk", name = "aeu", descriptor = "(II)V", line = 938)
	final synchronized void method16356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class3_Sub21 local4 = new Class3_Sub21(arg1);
		local4.aLong296 = (long) arg0 * 7335455165921340595L;
		this.aClass553_35.method32702(local4);
	}

	@OriginalMember(owner = "client!akk", name = "aef", descriptor = "(II)V", line = 938)
	final synchronized void method16358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class3_Sub21 local4 = new Class3_Sub21(arg1);
		local4.aLong296 = (long) arg0 * 7335455165921340595L;
		this.aClass553_35.method32702(local4);
	}

	@OriginalMember(owner = "client!akk", name = "aeh", descriptor = "(II)V", line = 944)
	final synchronized void method16341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class3_Sub21 local4 = new Class3_Sub21(arg1);
		local4.aLong296 = (long) arg0 * 7335455165921340595L;
		this.aClass553_31.method32702(local4);
	}

	@OriginalMember(owner = "client!akk", name = "aea", descriptor = "(II)V", line = 944)
	final synchronized void method16359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class3_Sub21 local4 = new Class3_Sub21(arg1);
		local4.aLong296 = (long) arg0 * 7335455165921340595L;
		this.aClass553_31.method32702(local4);
	}

	@OriginalMember(owner = "client!akk", name = "aez", descriptor = "(I)V", line = 950)
	final synchronized void method16349(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub21 local4 = new Class3_Sub21(arg0);
		this.aClass553_32.method32702(local4);
	}

	@OriginalMember(owner = "client!akk", name = "aes", descriptor = "(I)V", line = 950)
	final synchronized void method16360(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub21 local4 = new Class3_Sub21(arg0);
		this.aClass553_32.method32702(local4);
	}

	@OriginalMember(owner = "client!akk", name = "aem", descriptor = "(II)V", line = 955)
	final synchronized void method16343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class3_Sub21 local4 = new Class3_Sub21(arg1);
		local4.aLong296 = (long) arg0 * 7335455165921340595L;
		this.aClass553_33.method32702(local4);
	}

	@OriginalMember(owner = "client!akk", name = "aev", descriptor = "(II)V", line = 955)
	final synchronized void method16350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class3_Sub21 local4 = new Class3_Sub21(arg1);
		local4.aLong296 = (long) arg0 * 7335455165921340595L;
		this.aClass553_33.method32702(local4);
	}

	@OriginalMember(owner = "client!akk", name = "aei", descriptor = "(II)V", line = 955)
	final synchronized void method16361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class3_Sub21 local4 = new Class3_Sub21(arg1);
		local4.aLong296 = (long) arg0 * 7335455165921340595L;
		this.aClass553_33.method32702(local4);
	}

	@OriginalMember(owner = "client!akk", name = "aet", descriptor = "(J)V", line = 961)
	final synchronized void method16336(@OriginalArg(0) long arg0) {
		@Pc(3) Class3 local3 = new Class3();
		local3.aLong296 = arg0 * 7335455165921340595L;
		this.aClass553_34.method32702(local3);
	}

	@OriginalMember(owner = "client!akk", name = "aew", descriptor = "(J)V", line = 961)
	final synchronized void method16344(@OriginalArg(0) long arg0) {
		@Pc(3) Class3 local3 = new Class3();
		local3.aLong296 = arg0 * 7335455165921340595L;
		this.aClass553_34.method32702(local3);
	}

	@OriginalMember(owner = "client!akk", name = "aeq", descriptor = "(I)V", line = 967)
	final synchronized void method16339(@OriginalArg(0) int arg0) {
		@Pc(3) Class3 local3 = new Class3();
		local3.aLong296 = (long) arg0 * 7335455165921340595L;
		this.aClass553_36.method32702(local3);
	}

	@OriginalMember(owner = "client!akk", name = "aed", descriptor = "(I)V", line = 967)
	final synchronized void method16345(@OriginalArg(0) int arg0) {
		@Pc(3) Class3 local3 = new Class3();
		local3.aLong296 = (long) arg0 * 7335455165921340595L;
		this.aClass553_36.method32702(local3);
	}

	@OriginalMember(owner = "client!akk", name = "aej", descriptor = "(I)V", line = 967)
	final synchronized void method16362(@OriginalArg(0) int arg0) {
		@Pc(3) Class3 local3 = new Class3();
		local3.aLong296 = (long) arg0 * 7335455165921340595L;
		this.aClass553_36.method32702(local3);
	}

	@OriginalMember(owner = "client!akk", name = "aen", descriptor = "(I)V", line = 967)
	final synchronized void method16363(@OriginalArg(0) int arg0) {
		@Pc(3) Class3 local3 = new Class3();
		local3.aLong296 = (long) arg0 * 7335455165921340595L;
		this.aClass553_36.method32702(local3);
	}

	@OriginalMember(owner = "client!akk", name = "aeb", descriptor = "(Lclient!dj;)I", line = 973)
	static final int method16346(@OriginalArg(0) Class127 arg0) {
		switch(arg0.anInt3314 * -663455835) {
			case 0:
				return 5125;
			case 1:
				return 5121;
			case 2:
			default:
				return 5121;
			case 3:
				return 5120;
			case 4:
				return 5126;
			case 5:
				return 5123;
			case 6:
				return 5122;
			case 7:
				return 5131;
			case 8:
				return 5124;
		}
	}

	@OriginalMember(owner = "client!akk", name = "aex", descriptor = "(Lclient!dj;)I", line = 973)
	static final int method16364(@OriginalArg(0) Class127 arg0) {
		switch(arg0.anInt3314 * -663455835) {
			case 0:
				return 5125;
			case 1:
				return 5121;
			case 2:
			default:
				return 5121;
			case 3:
				return 5120;
			case 4:
				return 5126;
			case 5:
				return 5123;
			case 6:
				return 5122;
			case 7:
				return 5131;
			case 8:
				return 5124;
		}
	}

	@OriginalMember(owner = "client!akk", name = "afm", descriptor = "(Lclient!dj;)I", line = 973)
	static final int method16365(@OriginalArg(0) Class127 arg0) {
		switch(arg0.anInt3314 * -663455835) {
			case 0:
				return 5125;
			case 1:
				return 5121;
			case 2:
			default:
				return 5121;
			case 3:
				return 5120;
			case 4:
				return 5126;
			case 5:
				return 5123;
			case 6:
				return 5122;
			case 7:
				return 5131;
			case 8:
				return 5124;
		}
	}

	@OriginalMember(owner = "client!akk", name = "afs", descriptor = "(Lclient!dj;)I", line = 973)
	static final int method16366(@OriginalArg(0) Class127 arg0) {
		switch(arg0.anInt3314 * -663455835) {
			case 0:
				return 5125;
			case 1:
				return 5121;
			case 2:
			default:
				return 5121;
			case 3:
				return 5120;
			case 4:
				return 5126;
			case 5:
				return 5123;
			case 6:
				return 5122;
			case 7:
				return 5131;
			case 8:
				return 5124;
		}
	}

	@OriginalMember(owner = "client!akk", name = "aep", descriptor = "(Lclient!cw;)I", line = 996)
	static int method16337(@OriginalArg(0) Class121 arg0) {
		switch(arg0.anInt3210 * -1309589553) {
			case 1:
				return 6402;
			case 2:
			case 3:
			default:
				throw new IllegalStateException();
			case 4:
				return 6406;
			case 5:
				return 6410;
			case 6:
				return 6407;
			case 7:
				return 6409;
			case 8:
				return 6408;
		}
	}

	@OriginalMember(owner = "client!akk", name = "afo", descriptor = "(Lclient!cw;)I", line = 996)
	static int method16351(@OriginalArg(0) Class121 arg0) {
		switch(arg0.anInt3210 * -1309589553) {
			case 1:
				return 6402;
			case 2:
			case 3:
			default:
				throw new IllegalStateException();
			case 4:
				return 6406;
			case 5:
				return 6410;
			case 6:
				return 6407;
			case 7:
				return 6409;
			case 8:
				return 6408;
		}
	}

	@OriginalMember(owner = "client!akk", name = "afd", descriptor = "(Lclient!cw;)I", line = 996)
	static int method16367(@OriginalArg(0) Class121 arg0) {
		switch(arg0.anInt3210 * -1309589553) {
			case 1:
				return 6402;
			case 2:
			case 3:
			default:
				throw new IllegalStateException();
			case 4:
				return 6406;
			case 5:
				return 6410;
			case 6:
				return 6407;
			case 7:
				return 6409;
			case 8:
				return 6408;
		}
	}

	@OriginalMember(owner = "client!akk", name = "afn", descriptor = "(Lclient!cw;)I", line = 996)
	static int method16368(@OriginalArg(0) Class121 arg0) {
		switch(arg0.anInt3210 * -1309589553) {
			case 1:
				return 6402;
			case 2:
			case 3:
			default:
				throw new IllegalStateException();
			case 4:
				return 6406;
			case 5:
				return 6410;
			case 6:
				return 6407;
			case 7:
				return 6409;
			case 8:
				return 6408;
		}
	}

	@OriginalMember(owner = "client!akk", name = "aer", descriptor = "(Lclient!cw;Lclient!dj;)I", line = 1015)
	static int method16347(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class127 arg1) {
		if (arg1 == Class127.aClass127_23) {
			switch(arg0.anInt3210 * -1309589553) {
				case 0:
					return 33779;
				case 1:
				case 2:
				default:
					throw new IllegalArgumentException();
				case 3:
					return 33777;
				case 4:
					return 6406;
				case 5:
					return 6410;
				case 6:
					return 6407;
				case 7:
					return 6409;
				case 8:
					return 6408;
			}
		} else if (arg1 == Class127.aClass127_21) {
			switch(arg0.anInt3210 * -1309589553) {
				case 1:
					return 33189;
				case 2:
				case 3:
				default:
					throw new IllegalArgumentException();
				case 4:
					return 32830;
				case 5:
					return 36219;
				case 6:
					return 32852;
				case 7:
					return 32834;
				case 8:
					return 32859;
			}
		} else if (arg1 == Class127.aClass127_22) {
			switch(arg0.anInt3210 * -1309589553) {
				case 1:
					return 33190;
				default:
					throw new IllegalArgumentException();
			}
		} else if (arg1 == Class127.aClass127_24) {
			switch(arg0.anInt3210 * -1309589553) {
				case 4:
					return 34844;
				case 5:
					return 34847;
				case 6:
					return 34843;
				case 7:
					return 34846;
				case 8:
					return 34842;
				default:
					throw new IllegalArgumentException();
			}
		} else if (arg1 == Class127.aClass127_20) {
			switch(arg0.anInt3210 * -1309589553) {
				case 4:
					return 34838;
				case 5:
					return 34841;
				case 6:
					return 34837;
				case 7:
					return 34840;
				case 8:
					return 34836;
				default:
					throw new IllegalArgumentException();
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!akk", name = "afr", descriptor = "(Lclient!cw;Lclient!dj;)I", line = 1015)
	static int method16352(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class127 arg1) {
		if (arg1 == Class127.aClass127_23) {
			switch(arg0.anInt3210 * -1309589553) {
				case 0:
					return 33779;
				case 1:
				case 2:
				default:
					throw new IllegalArgumentException();
				case 3:
					return 33777;
				case 4:
					return 6406;
				case 5:
					return 6410;
				case 6:
					return 6407;
				case 7:
					return 6409;
				case 8:
					return 6408;
			}
		} else if (arg1 == Class127.aClass127_21) {
			switch(arg0.anInt3210 * -1309589553) {
				case 1:
					return 33189;
				case 2:
				case 3:
				default:
					throw new IllegalArgumentException();
				case 4:
					return 32830;
				case 5:
					return 36219;
				case 6:
					return 32852;
				case 7:
					return 32834;
				case 8:
					return 32859;
			}
		} else if (arg1 == Class127.aClass127_22) {
			switch(arg0.anInt3210 * -1309589553) {
				case 1:
					return 33190;
				default:
					throw new IllegalArgumentException();
			}
		} else if (arg1 == Class127.aClass127_24) {
			switch(arg0.anInt3210 * -1309589553) {
				case 4:
					return 34844;
				case 5:
					return 34847;
				case 6:
					return 34843;
				case 7:
					return 34846;
				case 8:
					return 34842;
				default:
					throw new IllegalArgumentException();
			}
		} else if (arg1 == Class127.aClass127_20) {
			switch(arg0.anInt3210 * -1309589553) {
				case 4:
					return 34838;
				case 5:
					return 34841;
				case 6:
					return 34837;
				case 7:
					return 34840;
				case 8:
					return 34836;
				default:
					throw new IllegalArgumentException();
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!akk", name = "fe", descriptor = "(Z)V", line = 1096)
	@Override
	public void method17182() {
	}

	@OriginalMember(owner = "client!akk", name = "fo", descriptor = "(Z)V", line = 1096)
	@Override
	public void method17184() {
	}

	@OriginalMember(owner = "client!akk", name = "fl", descriptor = "(Z)V", line = 1096)
	@Override
	public void method17241() {
	}

	@OriginalMember(owner = "client!akk", name = "fw", descriptor = "(Z)V", line = 1096)
	@Override
	public void method17183() {
	}

	@OriginalMember(owner = "client!akk", name = "ee", descriptor = "(Z)V", line = 1096)
	@Override
	public void method17142(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!akk", name = "afh", descriptor = "()V", line = 1099)
	void method16348() {
		@Pc(1) int local1 = 0;
		while (!this.anOpenGL2.method25099()) {
			if (local1++ > 5) {
				throw new RuntimeException("");
			}
			Class60_Sub11.method13407(1000L);
		}
	}

	@OriginalMember(owner = "client!akk", name = "aeo", descriptor = "()V", line = 1099)
	void method16353() {
		@Pc(1) int local1 = 0;
		while (!this.anOpenGL2.method25099()) {
			if (local1++ > 5) {
				throw new RuntimeException("");
			}
			Class60_Sub11.method13407(1000L);
		}
	}

	@OriginalMember(owner = "client!akk", name = "afw", descriptor = "()V", line = 1099)
	void method16369() {
		@Pc(1) int local1 = 0;
		while (!this.anOpenGL2.method25099()) {
			if (local1++ > 5) {
				throw new RuntimeException("");
			}
			Class60_Sub11.method13407(1000L);
		}
	}

	@OriginalMember(owner = "client!akk", name = "th", descriptor = "(I)V", line = 1107)
	@Override
	void method17558(@OriginalArg(0) int arg0) {
		if (!this.aBoolean409) {
			OpenGL.glPolygonMode(1028, (arg0 & 0x2) == 0 ? 6914 : 6913);
		}
	}

	@OriginalMember(owner = "client!akk", name = "adl", descriptor = "(I)V", line = 1107)
	@Override
	void method17619(@OriginalArg(0) int arg0) {
		if (!this.aBoolean409) {
			OpenGL.glPolygonMode(1028, (arg0 & 0x2) == 0 ? 6914 : 6913);
		}
	}

	@OriginalMember(owner = "client!akk", name = "o", descriptor = "()Ljava/lang/String;", line = 1113)
	@Override
	public String method17035() {
		@Pc(1) String local1 = "Caps: 4:";
		@Pc(3) String local3 = ":";
		@Pc(15) String local15 = local1 + this.anInt2522 + local3;
		@Pc(27) String local27 = local15 + this.anInt2346 + local3;
		@Pc(39) String local39 = local27 + this.anInt2525 + local3;
		@Pc(51) String local51 = local39 + this.anInt2526 + local3;
		@Pc(67) String local67 = local51 + (this.aBoolean406 ? 1 : 0) + local3;
		@Pc(83) String local83 = local67 + (this.aBoolean439 ? 1 : 0) + local3;
		@Pc(99) String local99 = local83 + (this.aBoolean403 ? 1 : 0) + local3;
		@Pc(115) String local115 = local99 + (this.aBoolean402 ? 1 : 0) + local3;
		@Pc(131) String local131 = local115 + (this.aBoolean398 ? 1 : 0) + local3;
		@Pc(147) String local147 = local131 + (this.aBoolean408 ? 1 : 0) + local3;
		@Pc(163) String local163 = local147 + (this.aBoolean438 ? 1 : 0) + local3;
		@Pc(179) String local179 = local163 + (this.aBoolean405 ? 1 : 0) + local3;
		@Pc(195) String local195 = local179 + (this.aBoolean441 ? 1 : 0) + local3;
		@Pc(211) String local211 = local195 + (this.aBoolean401 ? 1 : 0) + local3;
		@Pc(227) String local227 = local211 + (this.aBoolean443 ? 1 : 0) + local3;
		@Pc(243) String local243 = local227 + (this.aBoolean444 ? 1 : 0) + local3;
		@Pc(259) String local259 = local243 + (this.aBoolean445 ? 1 : 0) + local3;
		@Pc(275) String local275 = local259 + (this.aBoolean448 ? 1 : 0) + local3;
		return local275 + OpenGL.glGetString(35724).toLowerCase();
	}

	@OriginalMember(owner = "client!akk", name = "fz", descriptor = "()Ljava/lang/String;", line = 1113)
	@Override
	public String method17179() {
		@Pc(1) String local1 = "Caps: 4:";
		@Pc(3) String local3 = ":";
		@Pc(15) String local15 = local1 + this.anInt2522 + local3;
		@Pc(27) String local27 = local15 + this.anInt2346 + local3;
		@Pc(39) String local39 = local27 + this.anInt2525 + local3;
		@Pc(51) String local51 = local39 + this.anInt2526 + local3;
		@Pc(67) String local67 = local51 + (this.aBoolean406 ? 1 : 0) + local3;
		@Pc(83) String local83 = local67 + (this.aBoolean439 ? 1 : 0) + local3;
		@Pc(99) String local99 = local83 + (this.aBoolean403 ? 1 : 0) + local3;
		@Pc(115) String local115 = local99 + (this.aBoolean402 ? 1 : 0) + local3;
		@Pc(131) String local131 = local115 + (this.aBoolean398 ? 1 : 0) + local3;
		@Pc(147) String local147 = local131 + (this.aBoolean408 ? 1 : 0) + local3;
		@Pc(163) String local163 = local147 + (this.aBoolean438 ? 1 : 0) + local3;
		@Pc(179) String local179 = local163 + (this.aBoolean405 ? 1 : 0) + local3;
		@Pc(195) String local195 = local179 + (this.aBoolean441 ? 1 : 0) + local3;
		@Pc(211) String local211 = local195 + (this.aBoolean401 ? 1 : 0) + local3;
		@Pc(227) String local227 = local211 + (this.aBoolean443 ? 1 : 0) + local3;
		@Pc(243) String local243 = local227 + (this.aBoolean444 ? 1 : 0) + local3;
		@Pc(259) String local259 = local243 + (this.aBoolean445 ? 1 : 0) + local3;
		@Pc(275) String local275 = local259 + (this.aBoolean448 ? 1 : 0) + local3;
		return local275 + OpenGL.glGetString(35724).toLowerCase();
	}

	@OriginalMember(owner = "client!akk", name = "fv", descriptor = "()Ljava/lang/String;", line = 1113)
	@Override
	public String method17180() {
		@Pc(1) String local1 = "Caps: 4:";
		@Pc(3) String local3 = ":";
		@Pc(15) String local15 = local1 + this.anInt2522 + local3;
		@Pc(27) String local27 = local15 + this.anInt2346 + local3;
		@Pc(39) String local39 = local27 + this.anInt2525 + local3;
		@Pc(51) String local51 = local39 + this.anInt2526 + local3;
		@Pc(67) String local67 = local51 + (this.aBoolean406 ? 1 : 0) + local3;
		@Pc(83) String local83 = local67 + (this.aBoolean439 ? 1 : 0) + local3;
		@Pc(99) String local99 = local83 + (this.aBoolean403 ? 1 : 0) + local3;
		@Pc(115) String local115 = local99 + (this.aBoolean402 ? 1 : 0) + local3;
		@Pc(131) String local131 = local115 + (this.aBoolean398 ? 1 : 0) + local3;
		@Pc(147) String local147 = local131 + (this.aBoolean408 ? 1 : 0) + local3;
		@Pc(163) String local163 = local147 + (this.aBoolean438 ? 1 : 0) + local3;
		@Pc(179) String local179 = local163 + (this.aBoolean405 ? 1 : 0) + local3;
		@Pc(195) String local195 = local179 + (this.aBoolean441 ? 1 : 0) + local3;
		@Pc(211) String local211 = local195 + (this.aBoolean401 ? 1 : 0) + local3;
		@Pc(227) String local227 = local211 + (this.aBoolean443 ? 1 : 0) + local3;
		@Pc(243) String local243 = local227 + (this.aBoolean444 ? 1 : 0) + local3;
		@Pc(259) String local259 = local243 + (this.aBoolean445 ? 1 : 0) + local3;
		@Pc(275) String local275 = local259 + (this.aBoolean448 ? 1 : 0) + local3;
		return local275 + OpenGL.glGetString(35724).toLowerCase();
	}

	@OriginalMember(owner = "client!akk", name = "fy", descriptor = "()Ljava/lang/String;", line = 1113)
	@Override
	public String method17181() {
		@Pc(1) String local1 = "Caps: 4:";
		@Pc(3) String local3 = ":";
		@Pc(15) String local15 = local1 + this.anInt2522 + local3;
		@Pc(27) String local27 = local15 + this.anInt2346 + local3;
		@Pc(39) String local39 = local27 + this.anInt2525 + local3;
		@Pc(51) String local51 = local39 + this.anInt2526 + local3;
		@Pc(67) String local67 = local51 + (this.aBoolean406 ? 1 : 0) + local3;
		@Pc(83) String local83 = local67 + (this.aBoolean439 ? 1 : 0) + local3;
		@Pc(99) String local99 = local83 + (this.aBoolean403 ? 1 : 0) + local3;
		@Pc(115) String local115 = local99 + (this.aBoolean402 ? 1 : 0) + local3;
		@Pc(131) String local131 = local115 + (this.aBoolean398 ? 1 : 0) + local3;
		@Pc(147) String local147 = local131 + (this.aBoolean408 ? 1 : 0) + local3;
		@Pc(163) String local163 = local147 + (this.aBoolean438 ? 1 : 0) + local3;
		@Pc(179) String local179 = local163 + (this.aBoolean405 ? 1 : 0) + local3;
		@Pc(195) String local195 = local179 + (this.aBoolean441 ? 1 : 0) + local3;
		@Pc(211) String local211 = local195 + (this.aBoolean401 ? 1 : 0) + local3;
		@Pc(227) String local227 = local211 + (this.aBoolean443 ? 1 : 0) + local3;
		@Pc(243) String local243 = local227 + (this.aBoolean444 ? 1 : 0) + local3;
		@Pc(259) String local259 = local243 + (this.aBoolean445 ? 1 : 0) + local3;
		@Pc(275) String local275 = local259 + (this.aBoolean448 ? 1 : 0) + local3;
		return local275 + OpenGL.glGetString(35724).toLowerCase();
	}
}
