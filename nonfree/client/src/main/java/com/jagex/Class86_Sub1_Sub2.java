package com.jagex;

import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!apr")
public final class Class86_Sub1_Sub2 extends Class86_Sub1 {

	@OriginalMember(owner = "client!apr", name = "ia", descriptor = "I")
	static final int anInt2855 = 3;

	@OriginalMember(owner = "client!apr", name = "hs", descriptor = "I")
	int anInt2852;

	@OriginalMember(owner = "client!apr", name = "hb", descriptor = "J")
	long aLong122;

	@OriginalMember(owner = "client!apr", name = "hv", descriptor = "Z")
	boolean aBoolean463;

	@OriginalMember(owner = "client!apr", name = "hk", descriptor = "Z")
	boolean aBoolean464;

	@OriginalMember(owner = "client!apr", name = "ho", descriptor = "Lclient!agj;")
	Class105_Sub1 aClass105_Sub1_2;

	@OriginalMember(owner = "client!apr", name = "hx", descriptor = "Lclient!ahz;")
	Class123_Sub2 aClass123_Sub2_1;

	@OriginalMember(owner = "client!apr", name = "hy", descriptor = "Z")
	boolean aBoolean472;

	@OriginalMember(owner = "client!apr", name = "is", descriptor = "Z")
	boolean aBoolean474;

	@OriginalMember(owner = "client!apr", name = "hp", descriptor = "Lclient!zm;")
	Class695 aClass695_34 = new Class695();

	@OriginalMember(owner = "client!apr", name = "hi", descriptor = "Lclient!zm;")
	Class695 aClass695_38 = new Class695();

	@OriginalMember(owner = "client!apr", name = "ha", descriptor = "Lclient!zm;")
	Class695 aClass695_35 = new Class695();

	@OriginalMember(owner = "client!apr", name = "hf", descriptor = "Lclient!zm;")
	Class695 aClass695_40 = new Class695();

	@OriginalMember(owner = "client!apr", name = "hn", descriptor = "Lclient!zm;")
	Class695 aClass695_39 = new Class695();

	@OriginalMember(owner = "client!apr", name = "hj", descriptor = "Lclient!zm;")
	Class695 aClass695_36 = new Class695();

	@OriginalMember(owner = "client!apr", name = "hh", descriptor = "Lclient!zm;")
	Class695 aClass695_37 = new Class695();

	@OriginalMember(owner = "client!apr", name = "hg", descriptor = "[I")
	final int[] anIntArray262 = new int[1000];

	@OriginalMember(owner = "client!apr", name = "hm", descriptor = "[Lclient!ahy;")
	Class123_Sub1[] aClass123_Sub1Array1 = new Class123_Sub1[16];

	@OriginalMember(owner = "client!apr", name = "ix", descriptor = "[F")
	final float[] aFloatArray75;

	@OriginalMember(owner = "client!apr", name = "iz", descriptor = "[F")
	final float[] aFloatArray76;

	@OriginalMember(owner = "client!apr", name = "ij", descriptor = "Lclient!cy;")
	Class83 aClass83_17;

	@OriginalMember(owner = "client!apr", name = "ik", descriptor = "Lclient!cy;")
	Class83 aClass83_16;

	@OriginalMember(owner = "client!apr", name = "ir", descriptor = "Lclient!aeo;")
	Class92_Sub1 aClass92_Sub1_3;

	@OriginalMember(owner = "client!apr", name = "im", descriptor = "[I")
	int[] anIntArray263;

	@OriginalMember(owner = "client!apr", name = "io", descriptor = "[J")
	long[] aLongArray16;

	@OriginalMember(owner = "client!apr", name = "il", descriptor = "[I")
	int[] anIntArray265;

	@OriginalMember(owner = "client!apr", name = "ih", descriptor = "I")
	int anInt2857;

	@OriginalMember(owner = "client!apr", name = "ie", descriptor = "I")
	int anInt2853;

	@OriginalMember(owner = "client!apr", name = "hd", descriptor = "Lclient!jaggl/OpenGL;")
	OpenGL anOpenGL3;

	@OriginalMember(owner = "client!apr", name = "ib", descriptor = "Ljava/lang/String;")
	final String aString76;

	@OriginalMember(owner = "client!apr", name = "if", descriptor = "Ljava/lang/String;")
	final String aString77;

	@OriginalMember(owner = "client!apr", name = "id", descriptor = "I")
	final int anInt2856;

	@OriginalMember(owner = "client!apr", name = "ii", descriptor = "Z")
	boolean aBoolean469;

	@OriginalMember(owner = "client!apr", name = "ip", descriptor = "Z")
	boolean aBoolean467;

	@OriginalMember(owner = "client!apr", name = "iw", descriptor = "Z")
	boolean aBoolean466;

	@OriginalMember(owner = "client!apr", name = "it", descriptor = "Z")
	final boolean aBoolean468;

	@OriginalMember(owner = "client!apr", name = "in", descriptor = "Z")
	final boolean aBoolean462;

	@OriginalMember(owner = "client!apr", name = "ig", descriptor = "Z")
	final boolean aBoolean470;

	@OriginalMember(owner = "client!apr", name = "ic", descriptor = "Z")
	final boolean aBoolean471;

	@OriginalMember(owner = "client!apr", name = "iu", descriptor = "Z")
	boolean aBoolean473;

	@OriginalMember(owner = "client!apr", name = "he", descriptor = "[I")
	int[] anIntArray264;

	@OriginalMember(owner = "client!apr", name = "iy", descriptor = "I")
	final int anInt2854;

	@OriginalMember(owner = "client!apr", name = "iq", descriptor = "Z")
	boolean aBoolean465;

	@OriginalMember(owner = "client!apr", name = "aht", descriptor = "(Ljava/lang/String;)[B", line = 77)
	byte[] method20776(@OriginalArg(0) String arg0) {
		return this.method20403("gl", arg0);
	}

	@OriginalMember(owner = "client!apr", name = "ahr", descriptor = "(Ljava/lang/String;)[B", line = 77)
	byte[] method20777(@OriginalArg(0) String arg0) {
		return this.method20403("gl", arg0);
	}

	@OriginalMember(owner = "client!apr", name = "ahc", descriptor = "(Ljava/lang/String;)[B", line = 77)
	byte[] method20778(@OriginalArg(0) String arg0) {
		return this.method20403("gl", arg0);
	}

	@OriginalMember(owner = "client!apr", name = "agc", descriptor = "(Ljava/lang/String;)[B", line = 77)
	byte[] method20779(@OriginalArg(0) String arg0) {
		return this.method20403("gl", arg0);
	}

	@OriginalMember(owner = "client!apr", name = "ahn", descriptor = "(Ljava/lang/String;)[B", line = 77)
	byte[] method20780(@OriginalArg(0) String arg0) {
		return this.method20403("gl", arg0);
	}

	@OriginalMember(owner = "client!apr", name = "ry", descriptor = "(Ljava/lang/String;)Lclient!hi;", line = 81)
	@Override
	public Class112 method20613(@OriginalArg(0) String arg0) {
		@Pc(3) byte[] local3 = this.method20779(arg0);
		if (local3 == null) {
			return null;
		} else {
			@Pc(11) Class292 local11 = this.method20404(local3);
			return new Class112_Sub2(this, local11);
		}
	}

	@OriginalMember(owner = "client!apr", name = "xu", descriptor = "(Ljava/lang/String;)Lclient!hi;", line = 81)
	@Override
	public Class112 method20692(@OriginalArg(0) String arg0) {
		@Pc(3) byte[] local3 = this.method20779(arg0);
		if (local3 == null) {
			return null;
		} else {
			@Pc(11) Class292 local11 = this.method20404(local3);
			return new Class112_Sub2(this, local11);
		}
	}

	@OriginalMember(owner = "client!apr", name = "xr", descriptor = "(Ljava/lang/String;)Lclient!hi;", line = 81)
	@Override
	public Class112 method20673(@OriginalArg(0) String arg0) {
		@Pc(3) byte[] local3 = this.method20779(arg0);
		if (local3 == null) {
			return null;
		} else {
			@Pc(11) Class292 local11 = this.method20404(local3);
			return new Class112_Sub2(this, local11);
		}
	}

	@OriginalMember(owner = "client!apr", name = "xz", descriptor = "(Ljava/lang/String;)Lclient!hi;", line = 81)
	@Override
	public Class112 method20694(@OriginalArg(0) String arg0) {
		@Pc(3) byte[] local3 = this.method20779(arg0);
		if (local3 == null) {
			return null;
		} else {
			@Pc(11) Class292 local11 = this.method20404(local3);
			return new Class112_Sub2(this, local11);
		}
	}

	@OriginalMember(owner = "client!apr", name = "xm", descriptor = "(Ljava/lang/String;)Lclient!hi;", line = 81)
	@Override
	public Class112 method20725(@OriginalArg(0) String arg0) {
		@Pc(3) byte[] local3 = this.method20779(arg0);
		if (local3 == null) {
			return null;
		} else {
			@Pc(11) Class292 local11 = this.method20404(local3);
			return new Class112_Sub2(this, local11);
		}
	}

	@OriginalMember(owner = "client!apr", name = "rg", descriptor = "()Z", line = 88)
	@Override
	public boolean method20630() {
		return this.aBoolean468;
	}

	@OriginalMember(owner = "client!apr", name = "wp", descriptor = "()Z", line = 88)
	@Override
	public boolean method20685() {
		return this.aBoolean468;
	}

	@OriginalMember(owner = "client!apr", name = "wb", descriptor = "()Z", line = 88)
	@Override
	public boolean method20687() {
		return this.aBoolean468;
	}

	@OriginalMember(owner = "client!apr", name = "wu", descriptor = "()Z", line = 88)
	@Override
	public boolean method20688() {
		return this.aBoolean468;
	}

	@OriginalMember(owner = "client!apr", name = "wh", descriptor = "()Z", line = 88)
	@Override
	public boolean method20686() {
		return this.aBoolean468;
	}

	@OriginalMember(owner = "client!apr", name = "rp", descriptor = "()Z", line = 92)
	@Override
	public boolean method20681() {
		return this.aBoolean470;
	}

	@OriginalMember(owner = "client!apr", name = "ww", descriptor = "()Z", line = 92)
	@Override
	public boolean method20700() {
		return this.aBoolean470;
	}

	@OriginalMember(owner = "client!apr", name = "wr", descriptor = "()Z", line = 92)
	@Override
	public boolean method20620() {
		return this.aBoolean470;
	}

	@OriginalMember(owner = "client!apr", name = "rn", descriptor = "(Z)Z", line = 96)
	@Override
	public boolean method20612(@OriginalArg(0) boolean arg0) {
		return true;
	}

	@OriginalMember(owner = "client!apr", name = "wx", descriptor = "(Z)Z", line = 96)
	@Override
	public boolean method20690(@OriginalArg(0) boolean arg0) {
		return true;
	}

	@OriginalMember(owner = "client!apr", name = "wv", descriptor = "(Z)Z", line = 96)
	@Override
	public boolean method20680(@OriginalArg(0) boolean arg0) {
		return true;
	}

	@OriginalMember(owner = "client!apr", name = "wm", descriptor = "(Z)Z", line = 96)
	@Override
	public boolean method20740(@OriginalArg(0) boolean arg0) {
		return true;
	}

	@OriginalMember(owner = "client!apr", name = "wd", descriptor = "(Z)Z", line = 96)
	@Override
	public boolean method20614(@OriginalArg(0) boolean arg0) {
		return true;
	}

	@OriginalMember(owner = "client!apr", name = "<init>", descriptor = "(Lclient!jaggl/OpenGL;Ljava/awt/Canvas;JLclient!dp;Lclient!eo;Lclient!md;Lclient!mp;Lclient!mn;Lclient!pw;I)V", line = 101)
	Class86_Sub1_Sub2(@OriginalArg(0) OpenGL arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Class209 arg3, @OriginalArg(4) Interface24 arg4, @OriginalArg(5) Interface44 arg5, @OriginalArg(6) Interface47 arg6, @OriginalArg(7) Interface45 arg7, @OriginalArg(8) Class478 arg8, @OriginalArg(9) int arg9) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, 1);
		new MapBuffer();
		new MapBuffer();
		this.aFloatArray75 = new float[4];
		this.aFloatArray76 = new float[16];
		this.aClass83_17 = null;
		this.aClass83_16 = null;
		this.aClass92_Sub1_3 = null;
		this.anIntArray263 = new int[3];
		this.aLongArray16 = new long[3];
		this.anIntArray265 = new int[3];
		this.anInt2857 = 0;
		this.anInt2853 = 0;
		@Pc(98) int[] local98 = new int[1];
		try {
			this.anOpenGL3 = arg0;
			this.anOpenGL3.method27719();
			this.aString76 = OpenGL.glGetString(7936).toLowerCase();
			this.aString77 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString76.indexOf("microsoft") != -1 || this.aString76.indexOf("brian paul") != -1 || this.aString76.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			@Pc(141) String local141 = OpenGL.glGetString(7938);
			@Pc(149) String[] local149 = Class398.method28452(local141.replace('.', ' '), ' ');
			if (local149.length < 2) {
				throw new RuntimeException("");
			}
			@Pc(159) int local159;
			try {
				local159 = Class679.method36041(local149[0]);
				@Pc(165) int local165 = Class679.method36041(local149[1]);
				this.anInt2856 = local159 * 10 + local165;
			} catch (@Pc(174) NumberFormatException local174) {
				throw new RuntimeException("");
			}
			if (this.anInt2856 < 12) {
				throw new RuntimeException("");
			}
			OpenGL.glGetIntegerv(34018, local98, 0);
			this.anInt2848 = local98[0];
			if (this.anInt2848 < 2) {
				throw new RuntimeException("");
			}
			this.anInt2849 = 8;
			this.aBoolean469 = this.anOpenGL3.method27714("GL_ARB_vertex_buffer_object");
			this.aBoolean453 = this.anOpenGL3.method27714("GL_ARB_multisample");
			this.aBoolean438 = this.anOpenGL3.method27714("GL_EXT_blend_func_separate");
			this.aBoolean467 = this.anOpenGL3.method27714("GL_ARB_texture_rectangle");
			this.aBoolean457 = this.anOpenGL3.method27714("GL_ARB_texture_cube_map");
			this.aBoolean466 = this.anOpenGL3.method27714("GL_ARB_texture_non_power_of_two");
			this.aBoolean458 = true;
			this.aBoolean468 = this.anOpenGL3.method27714("GL_ARB_vertex_shader");
			this.aBoolean462 = this.anOpenGL3.method27714("GL_ARB_vertex_program");
			this.aBoolean470 = this.anOpenGL3.method27714("GL_ARB_fragment_shader");
			this.aBoolean471 = this.anOpenGL3.method27714("GL_ARB_fragment_program");
			this.aBoolean454 = this.anOpenGL3.method27714("GL_EXT_framebuffer_object");
			this.aBoolean459 = this.aBoolean454;
			this.aBoolean455 = this.anOpenGL3.method27714("GL_EXT_framebuffer_blit");
			this.aBoolean456 = this.anOpenGL3.method27714("GL_EXT_framebuffer_multisample");
			this.aBoolean473 = this.anUnsafe4 != null && (this.anInt2856 >= 32 || this.anOpenGL3.method27714("GL_ARB_sync"));
			this.anIntArray264 = new int[this.anInt2848];
			if (!this.method20630() || !this.method20681()) {
				if (!this.anOpenGL3.method27714("GL_ARB_multitexture")) {
					throw new RuntimeException("");
				}
				if (!this.anOpenGL3.method27714("GL_ARB_texture_env_combine")) {
					throw new RuntimeException("");
				}
			}
			Class508.aString221.startsWith("mac");
			this.anInt2854 = Stream.q() ? 33639 : 5121;
			if (this.aString77.indexOf("radeon") != -1 || this.aString76.indexOf("intel") != -1) {
				local159 = 0;
				@Pc(382) boolean local382 = this.aString76.indexOf("intel") != -1;
				@Pc(384) boolean local384 = false;
				@Pc(386) boolean local386 = false;
				@Pc(395) String[] local395 = Class398.method28452(this.aString77.replace('/', ' '), ' ');
				for (@Pc(397) int local397 = 0; local397 < local395.length; local397++) {
					@Pc(405) String local405 = local395[local397];
					try {
						if (local405.length() > 0) {
							if (local405.charAt(0) == 'x' && local405.length() >= 3 && Class547.method30973(local405.substring(1, 3))) {
								local405 = local405.substring(1);
								local386 = true;
							}
							if (local405.equals("hd")) {
								local384 = true;
							} else {
								if (local405.startsWith("hd")) {
									local405 = local405.substring(2);
									local384 = true;
								}
								if (local405.length() >= 4 && Class547.method30973(local405.substring(0, 4))) {
									local159 = Class679.method36041(local405.substring(0, 4));
									break;
								}
							}
						}
					} catch (@Pc(469) Exception local469) {
					}
				}
				if (!local382) {
					if (!local386 && !local384) {
						if (local159 >= 7000 && local159 <= 7999) {
							this.aBoolean469 = false;
						}
						if (local159 >= 7000 && local159 <= 9250) {
							this.aBoolean458 = false;
						}
					}
					this.aBoolean467 &= this.anOpenGL3.method27714("GL_ARB_half_float_pixel");
					this.aBoolean465 = true;
				} else if (!local384) {
					this.aBoolean454 = false;
				}
			}
			if (!this.aBoolean469) {
				throw new RuntimeException("");
			}
			try {
				@Pc(519) int[] local519 = new int[1];
				OpenGL.glGenBuffersARB(1, local519, 0);
			} catch (@Pc(525) Throwable local525) {
				throw new RuntimeException("");
			}
			this.method19951(arg1, new Class92_Sub2_Sub1_Sub2(this, arg1, arg2));
			this.method19959(arg1);
			this.method20453(32768, false);
			this.method20453(32768, false);
		} catch (@Pc(561) Throwable local561) {
			local561.printStackTrace();
			this.method19929();
			if (local561 instanceof OutOfMemoryError) {
				throw (OutOfMemoryError) local561;
			}
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!apr", name = "rw", descriptor = "()V", line = 217)
	@Override
	void method20417() {
		OpenGL.glDepthFunc(515);
		this.method20790();
		OpenGL.glClearDepth(1.0F);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glPolygonMode(1028, 6914);
		if (this.aBoolean453) {
			this.method20655(this.anInt2844 > 1);
			OpenGL.glDisable(32926);
		}
		for (@Pc(30) int local30 = this.anInt2848 - 1; local30 >= 0; local30--) {
			OpenGL.glActiveTexture(local30 + 33984);
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
		@Pc(91) float[] local91 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(93) int local93 = 0; local93 < 8; local93++) {
			@Pc(100) int local100 = local93 + 16384;
			OpenGL.glLightfv(local100, 4608, local91, 0);
			OpenGL.glLightf(local100, 4615, 0.0F);
			OpenGL.glLightf(local100, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL3.setSwapInterval(0);
		super.method20417();
	}

	@OriginalMember(owner = "client!apr", name = "xc", descriptor = "()V", line = 217)
	@Override
	void method20418() {
		OpenGL.glDepthFunc(515);
		this.method20790();
		OpenGL.glClearDepth(1.0F);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glPolygonMode(1028, 6914);
		if (this.aBoolean453) {
			this.method20655(this.anInt2844 > 1);
			OpenGL.glDisable(32926);
		}
		for (@Pc(30) int local30 = this.anInt2848 - 1; local30 >= 0; local30--) {
			OpenGL.glActiveTexture(local30 + 33984);
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
		@Pc(91) float[] local91 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(93) int local93 = 0; local93 < 8; local93++) {
			@Pc(100) int local100 = local93 + 16384;
			OpenGL.glLightfv(local100, 4608, local91, 0);
			OpenGL.glLightf(local100, 4615, 0.0F);
			OpenGL.glLightf(local100, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL3.setSwapInterval(0);
		super.method20417();
	}

	@OriginalMember(owner = "client!apr", name = "xh", descriptor = "()V", line = 217)
	@Override
	void method20416() {
		OpenGL.glDepthFunc(515);
		this.method20790();
		OpenGL.glClearDepth(1.0F);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glPolygonMode(1028, 6914);
		if (this.aBoolean453) {
			this.method20655(this.anInt2844 > 1);
			OpenGL.glDisable(32926);
		}
		for (@Pc(30) int local30 = this.anInt2848 - 1; local30 >= 0; local30--) {
			OpenGL.glActiveTexture(local30 + 33984);
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
		@Pc(91) float[] local91 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(93) int local93 = 0; local93 < 8; local93++) {
			@Pc(100) int local100 = local93 + 16384;
			OpenGL.glLightfv(local100, 4608, local91, 0);
			OpenGL.glLightf(local100, 4615, 0.0F);
			OpenGL.glLightf(local100, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL3.setSwapInterval(0);
		super.method20417();
	}

	@OriginalMember(owner = "client!apr", name = "y", descriptor = "()Lclient!do;", line = 255)
	@Override
	public Class208 method20046() {
		@Pc(1) int local1 = -1;
		if (this.aString76.indexOf("nvidia") != -1) {
			local1 = 4318;
		} else if (this.aString76.indexOf("intel") != -1) {
			local1 = 32902;
		} else if (this.aString76.indexOf("ati") != -1) {
			local1 = 4098;
		}
		return new Class208(local1, this.method20390() ? "OpenGL FF" : "OpenGL", this.anInt2856, this.aString77, 0L, this.method20390());
	}

	@OriginalMember(owner = "client!apr", name = "eu", descriptor = "()Lclient!do;", line = 255)
	@Override
	public Class208 method20372() {
		@Pc(1) int local1 = -1;
		if (this.aString76.indexOf("nvidia") != -1) {
			local1 = 4318;
		} else if (this.aString76.indexOf("intel") != -1) {
			local1 = 32902;
		} else if (this.aString76.indexOf("ati") != -1) {
			local1 = 4098;
		}
		return new Class208(local1, this.method20390() ? "OpenGL FF" : "OpenGL", this.anInt2856, this.aString77, 0L, this.method20390());
	}

	@OriginalMember(owner = "client!apr", name = "ew", descriptor = "()Lclient!do;", line = 255)
	@Override
	public Class208 method20084() {
		@Pc(1) int local1 = -1;
		if (this.aString76.indexOf("nvidia") != -1) {
			local1 = 4318;
		} else if (this.aString76.indexOf("intel") != -1) {
			local1 = 32902;
		} else if (this.aString76.indexOf("ati") != -1) {
			local1 = 4098;
		}
		return new Class208(local1, this.method20390() ? "OpenGL FF" : "OpenGL", this.anInt2856, this.aString77, 0L, this.method20390());
	}

	@OriginalMember(owner = "client!apr", name = "t", descriptor = "(II)V", line = 263)
	@Override
	void method20047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub7 {
		this.aClass92_Sub2_6.method23348();
		if (this.anInterface24_55 != null) {
			this.anInterface24_55.method4227();
		}
	}

	@OriginalMember(owner = "client!apr", name = "ea", descriptor = "(II)V", line = 263)
	@Override
	void method20152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub7 {
		this.aClass92_Sub2_6.method23348();
		if (this.anInterface24_55 != null) {
			this.anInterface24_55.method4227();
		}
	}

	@OriginalMember(owner = "client!apr", name = "ec", descriptor = "(II)V", line = 263)
	@Override
	void method20153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub7 {
		this.aClass92_Sub2_6.method23348();
		if (this.anInterface24_55 != null) {
			this.anInterface24_55.method4227();
		}
	}

	@OriginalMember(owner = "client!apr", name = "q", descriptor = "()V", line = 268)
	@Override
	public void method20331() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!apr", name = "el", descriptor = "()V", line = 268)
	@Override
	public void method20154() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!apr", name = "mn", descriptor = "()V", line = 272)
	@Override
	void method20332() {
		super.method20113();
		if (this.anOpenGL3 != null) {
			this.anOpenGL3.method27722();
			this.anOpenGL3.release();
			this.anOpenGL3 = null;
		}
	}

	@OriginalMember(owner = "client!apr", name = "mc", descriptor = "()V", line = 272)
	@Override
	void method20315() {
		super.method20113();
		if (this.anOpenGL3 != null) {
			this.anOpenGL3.method27722();
			this.anOpenGL3.release();
			this.anOpenGL3 = null;
		}
	}

	@OriginalMember(owner = "client!apr", name = "ms", descriptor = "()V", line = 272)
	@Override
	void method20333() {
		super.method20113();
		if (this.anOpenGL3 != null) {
			this.anOpenGL3.method27722();
			this.anOpenGL3.release();
			this.anOpenGL3 = null;
		}
	}

	@OriginalMember(owner = "client!apr", name = "d", descriptor = "()V", line = 272)
	@Override
	void method20113() {
		super.method20113();
		if (this.anOpenGL3 != null) {
			this.anOpenGL3.method27722();
			this.anOpenGL3.release();
			this.anOpenGL3 = null;
		}
	}

	@OriginalMember(owner = "client!apr", name = "sq", descriptor = "()F", line = 281)
	@Override
	public float method20664() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!apr", name = "yg", descriptor = "()F", line = 281)
	@Override
	public float method20679() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!apr", name = "ad", descriptor = "(Ljava/awt/Canvas;II)Lclient!aer;", line = 285)
	@Override
	Class92_Sub2 method20062(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class92_Sub2_Sub1_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!apr", name = "fx", descriptor = "(Ljava/awt/Canvas;II)Lclient!aer;", line = 285)
	@Override
	Class92_Sub2 method20053(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class92_Sub2_Sub1_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!apr", name = "fr", descriptor = "(Ljava/awt/Canvas;II)Lclient!aer;", line = 285)
	@Override
	Class92_Sub2 method20182(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class92_Sub2_Sub1_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!apr", name = "ac", descriptor = "()Lclient!aeo;", line = 289)
	@Override
	public Class92_Sub1 method20063() {
		return new Class92_Sub1_Sub2_Sub2(this);
	}

	@OriginalMember(owner = "client!apr", name = "mi", descriptor = "()Lclient!aeo;", line = 289)
	@Override
	public Class92_Sub1 method20326() {
		return new Class92_Sub1_Sub2_Sub2(this);
	}

	@OriginalMember(owner = "client!apr", name = "mt", descriptor = "()Lclient!aeo;", line = 289)
	@Override
	public Class92_Sub1 method20325() {
		return new Class92_Sub1_Sub2_Sub2(this);
	}

	@OriginalMember(owner = "client!apr", name = "av", descriptor = "(IILclient!dt;Lclient!dl;I)Lclient!df;", line = 293)
	@Override
	public Interface21 method20376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class212 arg2, @OriginalArg(3) Class206 arg3, @OriginalArg(4) int arg4) {
		return new Class511(this, arg2, arg3, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!apr", name = "mj", descriptor = "(IILclient!dt;Lclient!dl;I)Lclient!df;", line = 293)
	@Override
	public Interface21 method20327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class212 arg2, @OriginalArg(3) Class206 arg3, @OriginalArg(4) int arg4) {
		return new Class511(this, arg2, arg3, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!apr", name = "ml", descriptor = "(IILclient!dt;Lclient!dl;I)Lclient!df;", line = 293)
	@Override
	public Interface21 method20073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class212 arg2, @OriginalArg(3) Class206 arg3, @OriginalArg(4) int arg4) {
		return new Class511(this, arg2, arg3, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!apr", name = "mb", descriptor = "(II)Lclient!de;", line = 297)
	@Override
	public Interface20 method20356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class511(this, Class212.aClass212_21, Class206.aClass206_21, arg0, arg1);
	}

	@OriginalMember(owner = "client!apr", name = "mv", descriptor = "(II)Lclient!de;", line = 297)
	@Override
	public Interface20 method20329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class511(this, Class212.aClass212_21, Class206.aClass206_21, arg0, arg1);
	}

	@OriginalMember(owner = "client!apr", name = "mr", descriptor = "(II)Lclient!de;", line = 297)
	@Override
	public Interface20 method20328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class511(this, Class212.aClass212_21, Class206.aClass206_21, arg0, arg1);
	}

	@OriginalMember(owner = "client!apr", name = "at", descriptor = "(II)Lclient!de;", line = 297)
	@Override
	public Interface20 method20064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class511(this, Class212.aClass212_21, Class206.aClass206_21, arg0, arg1);
	}

	@OriginalMember(owner = "client!apr", name = "ae", descriptor = "(III)Lclient!de;", line = 301)
	@Override
	public Interface20 method20065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class511(this, Class212.aClass212_21, Class206.aClass206_21, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!apr", name = "me", descriptor = "(III)Lclient!de;", line = 301)
	@Override
	public Interface20 method20357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class511(this, Class212.aClass212_21, Class206.aClass206_21, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!apr", name = "mg", descriptor = "(III)Lclient!de;", line = 301)
	@Override
	public Interface20 method20363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class511(this, Class212.aClass212_21, Class206.aClass206_21, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!apr", name = "ah", descriptor = "(IIII)[I", line = 305)
	@Override
	public int[] method20066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(8) int local8 = this.aClass92_6.method23493();
		for (@Pc(10) int local10 = 0; local10 < arg3; local10++) {
			OpenGL.glReadPixelsi(arg0, local8 - arg1 - local10 - 1, arg2, 1, 32993, this.anInt2854, local4, local10 * arg2);
		}
		return local4;
	}

	@OriginalMember(owner = "client!apr", name = "fc", descriptor = "(IIII)[I", line = 305)
	@Override
	public int[] method20347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(8) int local8 = this.aClass92_6.method23493();
		for (@Pc(10) int local10 = 0; local10 < arg3; local10++) {
			OpenGL.glReadPixelsi(arg0, local8 - arg1 - local10 - 1, arg2, 1, 32993, this.anInt2854, local4, local10 * arg2);
		}
		return local4;
	}

	@OriginalMember(owner = "client!apr", name = "gr", descriptor = "(IIII)[I", line = 305)
	@Override
	public int[] method20184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(8) int local8 = this.aClass92_6.method23493();
		for (@Pc(10) int local10 = 0; local10 < arg3; local10++) {
			OpenGL.glReadPixelsi(arg0, local8 - arg1 - local10 - 1, arg2, 1, 32993, this.anInt2854, local4, local10 * arg2);
		}
		return local4;
	}

	@OriginalMember(owner = "client!apr", name = "as", descriptor = "()V", line = 314)
	@Override
	public void method20067() {
		if (this.aClass92_6 == null) {
			return;
		}
		@Pc(7) int local7 = this.aClass92_6.method23491();
		@Pc(11) int local11 = this.aClass92_6.method23493();
		if (local7 <= 0 && local11 <= 0) {
			return;
		}
		@Pc(19) int local19 = this.anInt2820;
		@Pc(22) int local22 = this.anInt2821;
		@Pc(25) int local25 = this.anInt2822;
		@Pc(28) int local28 = this.anInt2829;
		this.method20078();
		@Pc(33) int local33 = this.anInt2815;
		@Pc(36) int local36 = this.anInt2816;
		@Pc(39) int local39 = this.anInt2813;
		@Pc(42) int local42 = this.anInt2814;
		this.method20299();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method20487();
		this.method20584(false);
		this.method20522(false);
		this.method20515(false);
		this.method20519(false);
		this.method20542(null);
		this.method20545(1);
		this.method20579(0);
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
		this.method20151(local33, local39, local36, local42);
		this.method20104(local19, local22, local25, local28);
	}

	@OriginalMember(owner = "client!apr", name = "gj", descriptor = "()V", line = 314)
	@Override
	public void method20223() {
		if (this.aClass92_6 == null) {
			return;
		}
		@Pc(7) int local7 = this.aClass92_6.method23491();
		@Pc(11) int local11 = this.aClass92_6.method23493();
		if (local7 <= 0 && local11 <= 0) {
			return;
		}
		@Pc(19) int local19 = this.anInt2820;
		@Pc(22) int local22 = this.anInt2821;
		@Pc(25) int local25 = this.anInt2822;
		@Pc(28) int local28 = this.anInt2829;
		this.method20078();
		@Pc(33) int local33 = this.anInt2815;
		@Pc(36) int local36 = this.anInt2816;
		@Pc(39) int local39 = this.anInt2813;
		@Pc(42) int local42 = this.anInt2814;
		this.method20299();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method20487();
		this.method20584(false);
		this.method20522(false);
		this.method20515(false);
		this.method20519(false);
		this.method20542(null);
		this.method20545(1);
		this.method20579(0);
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
		this.method20151(local33, local39, local36, local42);
		this.method20104(local19, local22, local25, local28);
	}

	@OriginalMember(owner = "client!apr", name = "gi", descriptor = "()V", line = 314)
	@Override
	public void method20186() {
		if (this.aClass92_6 == null) {
			return;
		}
		@Pc(7) int local7 = this.aClass92_6.method23491();
		@Pc(11) int local11 = this.aClass92_6.method23493();
		if (local7 <= 0 && local11 <= 0) {
			return;
		}
		@Pc(19) int local19 = this.anInt2820;
		@Pc(22) int local22 = this.anInt2821;
		@Pc(25) int local25 = this.anInt2822;
		@Pc(28) int local28 = this.anInt2829;
		this.method20078();
		@Pc(33) int local33 = this.anInt2815;
		@Pc(36) int local36 = this.anInt2816;
		@Pc(39) int local39 = this.anInt2813;
		@Pc(42) int local42 = this.anInt2814;
		this.method20299();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method20487();
		this.method20584(false);
		this.method20522(false);
		this.method20515(false);
		this.method20519(false);
		this.method20542(null);
		this.method20545(1);
		this.method20579(0);
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
		this.method20151(local33, local39, local36, local42);
		this.method20104(local19, local22, local25, local28);
	}

	@OriginalMember(owner = "client!apr", name = "gt", descriptor = "()V", line = 314)
	@Override
	public void method20187() {
		if (this.aClass92_6 == null) {
			return;
		}
		@Pc(7) int local7 = this.aClass92_6.method23491();
		@Pc(11) int local11 = this.aClass92_6.method23493();
		if (local7 <= 0 && local11 <= 0) {
			return;
		}
		@Pc(19) int local19 = this.anInt2820;
		@Pc(22) int local22 = this.anInt2821;
		@Pc(25) int local25 = this.anInt2822;
		@Pc(28) int local28 = this.anInt2829;
		this.method20078();
		@Pc(33) int local33 = this.anInt2815;
		@Pc(36) int local36 = this.anInt2816;
		@Pc(39) int local39 = this.anInt2813;
		@Pc(42) int local42 = this.anInt2814;
		this.method20299();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method20487();
		this.method20584(false);
		this.method20522(false);
		this.method20515(false);
		this.method20519(false);
		this.method20542(null);
		this.method20545(1);
		this.method20579(0);
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
		this.method20151(local33, local39, local36, local42);
		this.method20104(local19, local22, local25, local28);
	}

	@OriginalMember(owner = "client!apr", name = "ga", descriptor = "()V", line = 314)
	@Override
	public void method20188() {
		if (this.aClass92_6 == null) {
			return;
		}
		@Pc(7) int local7 = this.aClass92_6.method23491();
		@Pc(11) int local11 = this.aClass92_6.method23493();
		if (local7 <= 0 && local11 <= 0) {
			return;
		}
		@Pc(19) int local19 = this.anInt2820;
		@Pc(22) int local22 = this.anInt2821;
		@Pc(25) int local25 = this.anInt2822;
		@Pc(28) int local28 = this.anInt2829;
		this.method20078();
		@Pc(33) int local33 = this.anInt2815;
		@Pc(36) int local36 = this.anInt2816;
		@Pc(39) int local39 = this.anInt2813;
		@Pc(42) int local42 = this.anInt2814;
		this.method20299();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method20487();
		this.method20584(false);
		this.method20522(false);
		this.method20515(false);
		this.method20519(false);
		this.method20542(null);
		this.method20545(1);
		this.method20579(0);
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
		this.method20151(local33, local39, local36, local42);
		this.method20104(local19, local22, local25, local28);
	}

	@OriginalMember(owner = "client!apr", name = "gc", descriptor = "()V", line = 314)
	@Override
	public void method20189() {
		if (this.aClass92_6 == null) {
			return;
		}
		@Pc(7) int local7 = this.aClass92_6.method23491();
		@Pc(11) int local11 = this.aClass92_6.method23493();
		if (local7 <= 0 && local11 <= 0) {
			return;
		}
		@Pc(19) int local19 = this.anInt2820;
		@Pc(22) int local22 = this.anInt2821;
		@Pc(25) int local25 = this.anInt2822;
		@Pc(28) int local28 = this.anInt2829;
		this.method20078();
		@Pc(33) int local33 = this.anInt2815;
		@Pc(36) int local36 = this.anInt2816;
		@Pc(39) int local39 = this.anInt2813;
		@Pc(42) int local42 = this.anInt2814;
		this.method20299();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method20487();
		this.method20584(false);
		this.method20522(false);
		this.method20515(false);
		this.method20519(false);
		this.method20542(null);
		this.method20545(1);
		this.method20579(0);
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
		this.method20151(local33, local39, local36, local42);
		this.method20104(local19, local22, local25, local28);
	}

	@OriginalMember(owner = "client!apr", name = "gz", descriptor = "()Z", line = 355)
	@Override
	public boolean method20191() {
		return this.aBoolean473;
	}

	@OriginalMember(owner = "client!apr", name = "aq", descriptor = "()Z", line = 355)
	@Override
	public boolean method20068() {
		return this.aBoolean473;
	}

	@OriginalMember(owner = "client!apr", name = "am", descriptor = "()Z", line = 359)
	@Override
	public boolean method20069() {
		return !this.aBoolean473 || this.aLongArray16[this.anInt2853] == 0L;
	}

	@OriginalMember(owner = "client!apr", name = "gb", descriptor = "()Z", line = 359)
	@Override
	public boolean method20192() {
		return !this.aBoolean473 || this.aLongArray16[this.anInt2853] == 0L;
	}

	@OriginalMember(owner = "client!apr", name = "gu", descriptor = "()Z", line = 368)
	@Override
	public boolean method20193() {
		return true;
	}

	@OriginalMember(owner = "client!apr", name = "ay", descriptor = "()Z", line = 368)
	@Override
	public boolean method20172() {
		return true;
	}

	@OriginalMember(owner = "client!apr", name = "gk", descriptor = "()Z", line = 372)
	@Override
	public boolean method20358() {
		return false;
	}

	@OriginalMember(owner = "client!apr", name = "af", descriptor = "()Z", line = 372)
	@Override
	public boolean method20371() {
		return false;
	}

	@OriginalMember(owner = "client!apr", name = "gp", descriptor = "()Z", line = 372)
	@Override
	public boolean method20195() {
		return false;
	}

	@OriginalMember(owner = "client!apr", name = "an", descriptor = "()I", line = 376)
	@Override
	public int method20070() {
		if (!this.aBoolean473) {
			return -1;
		} else if (this.aLongArray16[this.anInt2857] == 0L) {
			return -1;
		} else {
			@Pc(21) int local21 = OpenGL.glClientWaitSync(this.aLongArray16[this.anInt2857], 0, 0);
			if (local21 == 37149) {
				this.method20366();
				return -1;
			} else if (local21 == 37147) {
				return -1;
			} else {
				return this.anIntArray265[this.anInt2857];
			}
		}
	}

	@OriginalMember(owner = "client!apr", name = "gq", descriptor = "()I", line = 376)
	@Override
	public int method20380() {
		if (!this.aBoolean473) {
			return -1;
		} else if (this.aLongArray16[this.anInt2857] == 0L) {
			return -1;
		} else {
			@Pc(21) int local21 = OpenGL.glClientWaitSync(this.aLongArray16[this.anInt2857], 0, 0);
			if (local21 == 37149) {
				this.method20366();
				return -1;
			} else if (local21 == 37147) {
				return -1;
			} else {
				return this.anIntArray265[this.anInt2857];
			}
		}
	}

	@OriginalMember(owner = "client!apr", name = "ge", descriptor = "()I", line = 376)
	@Override
	public int method20288() {
		if (!this.aBoolean473) {
			return -1;
		} else if (this.aLongArray16[this.anInt2857] == 0L) {
			return -1;
		} else {
			@Pc(21) int local21 = OpenGL.glClientWaitSync(this.aLongArray16[this.anInt2857], 0, 0);
			if (local21 == 37149) {
				this.method20366();
				return -1;
			} else if (local21 == 37147) {
				return -1;
			} else {
				return this.anIntArray265[this.anInt2857];
			}
		}
	}

	@OriginalMember(owner = "client!apr", name = "aa", descriptor = "(III)V", line = 389)
	@Override
	public void method20072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method20014();
		if (this.aClass92_Sub1_3 == null) {
			this.method20783(arg1, arg2);
		}
		if (this.aClass83_17 == null) {
			this.aClass83_17 = this.method20105(0, 0, this.aClass92_6.method23491(), this.aClass92_6.method23493(), false);
		} else {
			this.aClass83_17.method18213(0, 0, this.aClass92_6.method23491(), this.aClass92_6.method23493(), 0, 0);
		}
		this.method19968(this.aClass92_Sub1_3);
		this.method20125(1, -16777216);
		this.aClass83_17.method18125(this.anInt2792 * -1555714981, this.anInt2793 * -385311879, this.anInt2794 * 1769547157, this.anInt2795 * -740019615);
		OpenGL.glBindBufferARB(35051, this.anIntArray263[this.anInt2853]);
		OpenGL.glReadPixelsub(0, 0, this.anInt2790 * 1104963955, this.anInt2791 * 1827315157, 32993, 5121, null, 0);
		OpenGL.glBindBufferARB(35051, 0);
		this.method19972(this.aClass92_Sub1_3);
		this.aLongArray16[this.anInt2853] = OpenGL.glFenceSync(37143, 0);
		this.anIntArray265[this.anInt2853] = arg0;
		if (++this.anInt2853 >= 3) {
			this.anInt2853 = 0;
		}
		this.method20017();
	}

	@OriginalMember(owner = "client!apr", name = "gf", descriptor = "(III)V", line = 389)
	@Override
	public void method20197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method20014();
		if (this.aClass92_Sub1_3 == null) {
			this.method20783(arg1, arg2);
		}
		if (this.aClass83_17 == null) {
			this.aClass83_17 = this.method20105(0, 0, this.aClass92_6.method23491(), this.aClass92_6.method23493(), false);
		} else {
			this.aClass83_17.method18213(0, 0, this.aClass92_6.method23491(), this.aClass92_6.method23493(), 0, 0);
		}
		this.method19968(this.aClass92_Sub1_3);
		this.method20125(1, -16777216);
		this.aClass83_17.method18125(this.anInt2792 * -1555714981, this.anInt2793 * -385311879, this.anInt2794 * 1769547157, this.anInt2795 * -740019615);
		OpenGL.glBindBufferARB(35051, this.anIntArray263[this.anInt2853]);
		OpenGL.glReadPixelsub(0, 0, this.anInt2790 * 1104963955, this.anInt2791 * 1827315157, 32993, 5121, null, 0);
		OpenGL.glBindBufferARB(35051, 0);
		this.method19972(this.aClass92_Sub1_3);
		this.aLongArray16[this.anInt2853] = OpenGL.glFenceSync(37143, 0);
		this.anIntArray265[this.anInt2853] = arg0;
		if (++this.anInt2853 >= 3) {
			this.anInt2853 = 0;
		}
		this.method20017();
	}

	@OriginalMember(owner = "client!apr", name = "ab", descriptor = "()V", line = 407)
	@Override
	public void method20366() {
		for (@Pc(1) int local1 = 0; local1 < 3; local1++) {
			if (this.aLongArray16[local1] != 0L) {
				OpenGL.glDeleteSync(this.aLongArray16[local1]);
				this.aLongArray16[local1] = 0L;
			}
		}
		this.anInt2853 = 0;
		this.anInt2857 = 0;
	}

	@OriginalMember(owner = "client!apr", name = "go", descriptor = "()V", line = 407)
	@Override
	public void method20054() {
		for (@Pc(1) int local1 = 0; local1 < 3; local1++) {
			if (this.aLongArray16[local1] != 0L) {
				OpenGL.glDeleteSync(this.aLongArray16[local1]);
				this.aLongArray16[local1] = 0L;
			}
		}
		this.anInt2853 = 0;
		this.anInt2857 = 0;
	}

	@OriginalMember(owner = "client!apr", name = "gx", descriptor = "()V", line = 407)
	@Override
	public void method20198() {
		for (@Pc(1) int local1 = 0; local1 < 3; local1++) {
			if (this.aLongArray16[local1] != 0L) {
				OpenGL.glDeleteSync(this.aLongArray16[local1]);
				this.aLongArray16[local1] = 0L;
			}
		}
		this.anInt2853 = 0;
		this.anInt2857 = 0;
	}

	@OriginalMember(owner = "client!apr", name = "gv", descriptor = "()V", line = 407)
	@Override
	public void method20199() {
		for (@Pc(1) int local1 = 0; local1 < 3; local1++) {
			if (this.aLongArray16[local1] != 0L) {
				OpenGL.glDeleteSync(this.aLongArray16[local1]);
				this.aLongArray16[local1] = 0L;
			}
		}
		this.anInt2853 = 0;
		this.anInt2857 = 0;
	}

	@OriginalMember(owner = "client!apr", name = "gd", descriptor = "()V", line = 407)
	@Override
	public void method20200() {
		for (@Pc(1) int local1 = 0; local1 < 3; local1++) {
			if (this.aLongArray16[local1] != 0L) {
				OpenGL.glDeleteSync(this.aLongArray16[local1]);
				this.aLongArray16[local1] = 0L;
			}
		}
		this.anInt2853 = 0;
		this.anInt2857 = 0;
	}

	@OriginalMember(owner = "client!apr", name = "gn", descriptor = "()V", line = 407)
	@Override
	public void method20044() {
		for (@Pc(1) int local1 = 0; local1 < 3; local1++) {
			if (this.aLongArray16[local1] != 0L) {
				OpenGL.glDeleteSync(this.aLongArray16[local1]);
				this.aLongArray16[local1] = 0L;
			}
		}
		this.anInt2853 = 0;
		this.anInt2857 = 0;
	}

	@OriginalMember(owner = "client!apr", name = "ap", descriptor = "(II)J", line = 418)
	@Override
	public long method20138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method20781(arg0, arg1, null, null);
	}

	@OriginalMember(owner = "client!apr", name = "nn", descriptor = "(II)J", line = 418)
	@Override
	public long method20337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method20781(arg0, arg1, null, null);
	}

	@OriginalMember(owner = "client!apr", name = "az", descriptor = "(II[I[I)V", line = 422)
	@Override
	public void method20075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.method20781(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!apr", name = "gs", descriptor = "(II[I[I)V", line = 422)
	@Override
	public void method20202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.method20781(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!apr", name = "gl", descriptor = "(II[I[I)V", line = 422)
	@Override
	public void method20203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.method20781(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!apr", name = "gh", descriptor = "(II[I[I)V", line = 422)
	@Override
	public void method20204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.method20781(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!apr", name = "gm", descriptor = "(II[I[I)V", line = 422)
	@Override
	public void method20150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.method20781(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!apr", name = "agu", descriptor = "(II[I[I)J", line = 426)
	long method20781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		if (!this.aBoolean473) {
			if (this.aClass83_16 == null) {
				this.method20783(arg0, arg1);
			}
			if (this.aClass83_17 == null) {
				this.aClass83_17 = this.method20105(0, 0, this.aClass92_6.method23491(), this.aClass92_6.method23493(), false);
			} else {
				this.aClass83_17.method18213(0, 0, this.aClass92_6.method23491(), this.aClass92_6.method23493(), 0, 0);
			}
			this.method19968(this.aClass92_Sub1_3);
			this.method20125(1, -16777216);
			this.aClass83_17.method18125(this.anInt2792 * -1555714981, this.anInt2793 * -385311879, this.anInt2794 * 1769547157, this.anInt2795 * -740019615);
			this.aClass83_16.method18175(0, 0, arg0, arg1, arg2, arg3, 0, arg0);
			this.method19972(this.aClass92_Sub1_3);
			return 0L;
		}
		if (this.aLongArray16[this.anInt2857] != 0L) {
			OpenGL.glDeleteSync(this.aLongArray16[this.anInt2857]);
			this.aLongArray16[this.anInt2857] = 0L;
		}
		OpenGL.glBindBufferARB(35051, this.anIntArray263[this.anInt2857]);
		@Pc(33) long local33 = OpenGL.glMapBufferARB(35051, 35000);
		if (arg2 != null) {
			for (@Pc(37) int local37 = 0; local37 < arg0 * arg1; local37++) {
				arg2[local37] = this.anUnsafe4.getInt(local33 + (long) (local37 * 4));
			}
			if (!OpenGL.glUnmapBufferARB(35051)) {
			}
			OpenGL.glBindBufferARB(35051, 0);
			local33 = 0L;
		}
		if (++this.anInt2857 >= 3) {
			this.anInt2857 = 0;
		}
		return local33;
	}

	@OriginalMember(owner = "client!apr", name = "ahb", descriptor = "(II[I[I)J", line = 426)
	long method20782(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		if (!this.aBoolean473) {
			if (this.aClass83_16 == null) {
				this.method20783(arg0, arg1);
			}
			if (this.aClass83_17 == null) {
				this.aClass83_17 = this.method20105(0, 0, this.aClass92_6.method23491(), this.aClass92_6.method23493(), false);
			} else {
				this.aClass83_17.method18213(0, 0, this.aClass92_6.method23491(), this.aClass92_6.method23493(), 0, 0);
			}
			this.method19968(this.aClass92_Sub1_3);
			this.method20125(1, -16777216);
			this.aClass83_17.method18125(this.anInt2792 * -1555714981, this.anInt2793 * -385311879, this.anInt2794 * 1769547157, this.anInt2795 * -740019615);
			this.aClass83_16.method18175(0, 0, arg0, arg1, arg2, arg3, 0, arg0);
			this.method19972(this.aClass92_Sub1_3);
			return 0L;
		}
		if (this.aLongArray16[this.anInt2857] != 0L) {
			OpenGL.glDeleteSync(this.aLongArray16[this.anInt2857]);
			this.aLongArray16[this.anInt2857] = 0L;
		}
		OpenGL.glBindBufferARB(35051, this.anIntArray263[this.anInt2857]);
		@Pc(33) long local33 = OpenGL.glMapBufferARB(35051, 35000);
		if (arg2 != null) {
			for (@Pc(37) int local37 = 0; local37 < arg0 * arg1; local37++) {
				arg2[local37] = this.anUnsafe4.getInt(local33 + (long) (local37 * 4));
			}
			if (!OpenGL.glUnmapBufferARB(35051)) {
			}
			OpenGL.glBindBufferARB(35051, 0);
			local33 = 0L;
		}
		if (++this.anInt2857 >= 3) {
			this.anInt2857 = 0;
		}
		return local33;
	}

	@OriginalMember(owner = "client!apr", name = "aw", descriptor = "(J)V", line = 457)
	@Override
	public void method20074(@OriginalArg(0) long arg0) {
		if (arg0 != 0L) {
			if (!OpenGL.glUnmapBufferARB(35051)) {
			}
			OpenGL.glBindBufferARB(35051, 0);
		}
	}

	@OriginalMember(owner = "client!apr", name = "gg", descriptor = "(J)V", line = 457)
	@Override
	public void method20201(@OriginalArg(0) long arg0) {
		if (arg0 != 0L) {
			if (!OpenGL.glUnmapBufferARB(35051)) {
			}
			OpenGL.glBindBufferARB(35051, 0);
		}
	}

	@OriginalMember(owner = "client!apr", name = "bj", descriptor = "()V", line = 463)
	@Override
	public void method20077() {
		if (this.aBoolean473) {
			this.aClass83_17 = null;
			if (this.aClass92_Sub1_3 != null) {
				this.aClass92_Sub1_3.method23506();
				this.aClass92_Sub1_3 = null;
			}
			OpenGL.glDeleteBuffersARB(3, this.anIntArray263, 0);
			for (@Pc(21) int local21 = 0; local21 < 3; local21++) {
				this.anIntArray263[local21] = 0;
				if (this.aLongArray16[local21] != 0L) {
					OpenGL.glDeleteSync(this.aLongArray16[local21]);
					this.aLongArray16[local21] = 0L;
				}
			}
		} else {
			this.aClass92_Sub1_3 = null;
			this.aClass83_16 = null;
			this.aClass83_17 = null;
		}
		this.anInt2853 = 0;
		this.anInt2857 = 0;
	}

	@OriginalMember(owner = "client!apr", name = "gw", descriptor = "()V", line = 463)
	@Override
	public void method20130() {
		if (this.aBoolean473) {
			this.aClass83_17 = null;
			if (this.aClass92_Sub1_3 != null) {
				this.aClass92_Sub1_3.method23506();
				this.aClass92_Sub1_3 = null;
			}
			OpenGL.glDeleteBuffersARB(3, this.anIntArray263, 0);
			for (@Pc(21) int local21 = 0; local21 < 3; local21++) {
				this.anIntArray263[local21] = 0;
				if (this.aLongArray16[local21] != 0L) {
					OpenGL.glDeleteSync(this.aLongArray16[local21]);
					this.aLongArray16[local21] = 0L;
				}
			}
		} else {
			this.aClass92_Sub1_3 = null;
			this.aClass83_16 = null;
			this.aClass83_17 = null;
		}
		this.anInt2853 = 0;
		this.anInt2857 = 0;
	}

	@OriginalMember(owner = "client!apr", name = "hl", descriptor = "()V", line = 463)
	@Override
	public void method20287() {
		if (this.aBoolean473) {
			this.aClass83_17 = null;
			if (this.aClass92_Sub1_3 != null) {
				this.aClass92_Sub1_3.method23506();
				this.aClass92_Sub1_3 = null;
			}
			OpenGL.glDeleteBuffersARB(3, this.anIntArray263, 0);
			for (@Pc(21) int local21 = 0; local21 < 3; local21++) {
				this.anIntArray263[local21] = 0;
				if (this.aLongArray16[local21] != 0L) {
					OpenGL.glDeleteSync(this.aLongArray16[local21]);
					this.aLongArray16[local21] = 0L;
				}
			}
		} else {
			this.aClass92_Sub1_3 = null;
			this.aClass83_16 = null;
			this.aClass83_17 = null;
		}
		this.anInt2853 = 0;
		this.anInt2857 = 0;
	}

	@OriginalMember(owner = "client!apr", name = "ags", descriptor = "(II)V", line = 488)
	void method20783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method20077();
		this.method19976(arg0, arg1);
		if (!this.aBoolean473) {
			this.aClass83_16 = this.method20102(arg0, arg1, false, true);
			this.aClass92_Sub1_3 = this.method20063();
			this.aClass92_Sub1_3.method23513(0, this.aClass83_16.method18173());
			return;
		}
		this.aClass83_16 = this.method20102(arg0, arg1, false, true);
		this.aClass92_Sub1_3 = this.method20063();
		this.aClass92_Sub1_3.method23513(0, this.aClass83_16.method18173());
		OpenGL.glGenBuffersARB(3, this.anIntArray263, 0);
		for (@Pc(35) int local35 = 0; local35 < 3; local35++) {
			OpenGL.glBindBufferARB(35051, this.anIntArray263[local35]);
			OpenGL.glBufferDataARBa(35051, arg0 * arg1 * 4, 0L, 35041);
			OpenGL.glBindBufferARB(35051, 0);
		}
	}

	@OriginalMember(owner = "client!apr", name = "ahy", descriptor = "(II)V", line = 488)
	void method20784(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method20077();
		this.method19976(arg0, arg1);
		if (!this.aBoolean473) {
			this.aClass83_16 = this.method20102(arg0, arg1, false, true);
			this.aClass92_Sub1_3 = this.method20063();
			this.aClass92_Sub1_3.method23513(0, this.aClass83_16.method18173());
			return;
		}
		this.aClass83_16 = this.method20102(arg0, arg1, false, true);
		this.aClass92_Sub1_3 = this.method20063();
		this.aClass92_Sub1_3.method23513(0, this.aClass83_16.method18173());
		OpenGL.glGenBuffersARB(3, this.anIntArray263, 0);
		for (@Pc(35) int local35 = 0; local35 < 3; local35++) {
			OpenGL.glBindBufferARB(35051, this.anIntArray263[local35]);
			OpenGL.glBufferDataARBa(35051, arg0 * arg1 * 4, 0L, 35041);
			OpenGL.glBindBufferARB(35051, 0);
		}
	}

	@OriginalMember(owner = "client!apr", name = "aha", descriptor = "(II)V", line = 488)
	void method20785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method20077();
		this.method19976(arg0, arg1);
		if (!this.aBoolean473) {
			this.aClass83_16 = this.method20102(arg0, arg1, false, true);
			this.aClass92_Sub1_3 = this.method20063();
			this.aClass92_Sub1_3.method23513(0, this.aClass83_16.method18173());
			return;
		}
		this.aClass83_16 = this.method20102(arg0, arg1, false, true);
		this.aClass92_Sub1_3 = this.method20063();
		this.aClass92_Sub1_3.method23513(0, this.aClass83_16.method18173());
		OpenGL.glGenBuffersARB(3, this.anIntArray263, 0);
		for (@Pc(35) int local35 = 0; local35 < 3; local35++) {
			OpenGL.glBindBufferARB(35051, this.anIntArray263[local35]);
			OpenGL.glBufferDataARBa(35051, arg0 * arg1 * 4, 0L, 35041);
			OpenGL.glBindBufferARB(35051, 0);
		}
	}

	@OriginalMember(owner = "client!apr", name = "kd", descriptor = "(Lclient!da;Lclient!da;FLclient!da;)Lclient!da;", line = 509)
	@Override
	public Class91 method20252(@OriginalArg(0) Class91 arg0, @OriginalArg(1) Class91 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class91 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!apr", name = "ds", descriptor = "(Lclient!da;Lclient!da;FLclient!da;)Lclient!da;", line = 509)
	@Override
	public Class91 method20220(@OriginalArg(0) Class91 arg0, @OriginalArg(1) Class91 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class91 arg3) {
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!apr", name = "bg", descriptor = "(II)V", line = 513)
	@Override
	public void method20125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		if ((arg0 & 0x1) != 0) {
			OpenGL.glClearColor((float) (arg1 & 0xFF0000) / 1.671168E7F, (float) (arg1 & 0xFF00) / 65280.0F, (float) (arg1 & 0xFF) / 255.0F, (float) (arg1 >>> 24) / 255.0F);
			local1 = 16384;
		}
		if ((arg0 & 0x2) != 0) {
			this.method20519(true);
			local1 |= 0x100;
		}
		if ((arg0 & 0x4) != 0) {
			local1 |= 0x400;
		}
		OpenGL.glClear(local1);
	}

	@OriginalMember(owner = "client!apr", name = "ii", descriptor = "(II)V", line = 513)
	@Override
	public void method20227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		if ((arg0 & 0x1) != 0) {
			OpenGL.glClearColor((float) (arg1 & 0xFF0000) / 1.671168E7F, (float) (arg1 & 0xFF00) / 65280.0F, (float) (arg1 & 0xFF) / 255.0F, (float) (arg1 >>> 24) / 255.0F);
			local1 = 16384;
		}
		if ((arg0 & 0x2) != 0) {
			this.method20519(true);
			local1 |= 0x100;
		}
		if ((arg0 & 0x4) != 0) {
			local1 |= 0x400;
		}
		OpenGL.glClear(local1);
	}

	@OriginalMember(owner = "client!apr", name = "ip", descriptor = "(II)V", line = 513)
	@Override
	public void method20228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		if ((arg0 & 0x1) != 0) {
			OpenGL.glClearColor((float) (arg1 & 0xFF0000) / 1.671168E7F, (float) (arg1 & 0xFF00) / 65280.0F, (float) (arg1 & 0xFF) / 255.0F, (float) (arg1 >>> 24) / 255.0F);
			local1 = 16384;
		}
		if ((arg0 & 0x2) != 0) {
			this.method20519(true);
			local1 |= 0x100;
		}
		if ((arg0 & 0x4) != 0) {
			local1 |= 0x400;
		}
		OpenGL.glClear(local1);
	}

	@OriginalMember(owner = "client!apr", name = "id", descriptor = "(II)V", line = 513)
	@Override
	public void method20226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		if ((arg0 & 0x1) != 0) {
			OpenGL.glClearColor((float) (arg1 & 0xFF0000) / 1.671168E7F, (float) (arg1 & 0xFF00) / 65280.0F, (float) (arg1 & 0xFF) / 255.0F, (float) (arg1 >>> 24) / 255.0F);
			local1 = 16384;
		}
		if ((arg0 & 0x2) != 0) {
			this.method20519(true);
			local1 |= 0x100;
		}
		if ((arg0 & 0x4) != 0) {
			local1 |= 0x400;
		}
		OpenGL.glClear(local1);
	}

	@OriginalMember(owner = "client!apr", name = "sp", descriptor = "()V", line = 527)
	@Override
	void method20617() {
		if (this.aClass92_6 != null) {
			OpenGL.glViewport(this.anInt2798 + this.anInt2820, this.anInt2825 + this.aClass92_6.method23493() - this.anInt2821 - this.anInt2829, this.anInt2822, this.anInt2829);
		}
		OpenGL.glDepthRange(this.aFloat193, this.aFloat194);
	}

	@OriginalMember(owner = "client!apr", name = "za", descriptor = "()V", line = 527)
	@Override
	void method20704() {
		if (this.aClass92_6 != null) {
			OpenGL.glViewport(this.anInt2798 + this.anInt2820, this.anInt2825 + this.aClass92_6.method23493() - this.anInt2821 - this.anInt2829, this.anInt2822, this.anInt2829);
		}
		OpenGL.glDepthRange(this.aFloat193, this.aFloat194);
	}

	@OriginalMember(owner = "client!apr", name = "zd", descriptor = "()V", line = 527)
	@Override
	void method20649() {
		if (this.aClass92_6 != null) {
			OpenGL.glViewport(this.anInt2798 + this.anInt2820, this.anInt2825 + this.aClass92_6.method23493() - this.anInt2821 - this.anInt2829, this.anInt2822, this.anInt2829);
		}
		OpenGL.glDepthRange(this.aFloat193, this.aFloat194);
	}

	@OriginalMember(owner = "client!apr", name = "zr", descriptor = "()V", line = 527)
	@Override
	void method20705() {
		if (this.aClass92_6 != null) {
			OpenGL.glViewport(this.anInt2798 + this.anInt2820, this.anInt2825 + this.aClass92_6.method23493() - this.anInt2821 - this.anInt2829, this.anInt2822, this.anInt2829);
		}
		OpenGL.glDepthRange(this.aFloat193, this.aFloat194);
	}

	@OriginalMember(owner = "client!apr", name = "zh", descriptor = "()V", line = 527)
	@Override
	void method20633() {
		if (this.aClass92_6 != null) {
			OpenGL.glViewport(this.anInt2798 + this.anInt2820, this.anInt2825 + this.aClass92_6.method23493() - this.anInt2821 - this.anInt2829, this.anInt2822, this.anInt2829);
		}
		OpenGL.glDepthRange(this.aFloat193, this.aFloat194);
	}

	@OriginalMember(owner = "client!apr", name = "sn", descriptor = "()V", line = 532)
	@Override
	void method20618() {
		if (this.aClass92_6 == null) {
			return;
		}
		@Pc(8) int local8 = this.anInt2798 + this.anInt2815;
		@Pc(18) int local18 = this.anInt2825 + this.aClass92_6.method23493() - this.anInt2814;
		@Pc(24) int local24 = this.anInt2816 - this.anInt2815;
		@Pc(30) int local30 = this.anInt2814 - this.anInt2813;
		if (local24 < 0) {
			local24 = 0;
		}
		if (local30 < 0) {
			local30 = 0;
		}
		OpenGL.glScissor(local8, local18, local24, local30);
	}

	@OriginalMember(owner = "client!apr", name = "zq", descriptor = "()V", line = 532)
	@Override
	void method20615() {
		if (this.aClass92_6 == null) {
			return;
		}
		@Pc(8) int local8 = this.anInt2798 + this.anInt2815;
		@Pc(18) int local18 = this.anInt2825 + this.aClass92_6.method23493() - this.anInt2814;
		@Pc(24) int local24 = this.anInt2816 - this.anInt2815;
		@Pc(30) int local30 = this.anInt2814 - this.anInt2813;
		if (local24 < 0) {
			local24 = 0;
		}
		if (local30 < 0) {
			local30 = 0;
		}
		OpenGL.glScissor(local8, local18, local24, local30);
	}

	@OriginalMember(owner = "client!apr", name = "zo", descriptor = "()V", line = 532)
	@Override
	void method20706() {
		if (this.aClass92_6 == null) {
			return;
		}
		@Pc(8) int local8 = this.anInt2798 + this.anInt2815;
		@Pc(18) int local18 = this.anInt2825 + this.aClass92_6.method23493() - this.anInt2814;
		@Pc(24) int local24 = this.anInt2816 - this.anInt2815;
		@Pc(30) int local30 = this.anInt2814 - this.anInt2813;
		if (local24 < 0) {
			local24 = 0;
		}
		if (local30 < 0) {
			local30 = 0;
		}
		OpenGL.glScissor(local8, local18, local24, local30);
	}

	@OriginalMember(owner = "client!apr", name = "sm", descriptor = "()V", line = 544)
	@Override
	void method20619() {
		if (this.aBoolean461) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!apr", name = "zp", descriptor = "()V", line = 544)
	@Override
	void method20707() {
		if (this.aBoolean461) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!apr", name = "zl", descriptor = "()V", line = 544)
	@Override
	void method20708() {
		if (this.aBoolean461) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@OriginalMember(owner = "client!apr", name = "rx", descriptor = "(Lclient!oi;Lclient!oi;Lclient!oi;)V", line = 549)
	@Override
	public void method20736(@OriginalArg(0) Class442 arg0, @OriginalArg(1) Class442 arg1, @OriginalArg(2) Class442 arg2) {
		OpenGL.glMatrixMode(5888);
		this.aClass442_87.method28960(arg0, arg1);
		OpenGL.glLoadMatrixf(this.aClass442_87.aFloatArray109, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(arg2.aFloatArray109, 0);
	}

	@OriginalMember(owner = "client!apr", name = "xx", descriptor = "(Lclient!oi;Lclient!oi;Lclient!oi;)V", line = 549)
	@Override
	public void method20678(@OriginalArg(0) Class442 arg0, @OriginalArg(1) Class442 arg1, @OriginalArg(2) Class442 arg2) {
		OpenGL.glMatrixMode(5888);
		this.aClass442_87.method28960(arg0, arg1);
		OpenGL.glLoadMatrixf(this.aClass442_87.aFloatArray109, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(arg2.aFloatArray109, 0);
	}

	@OriginalMember(owner = "client!apr", name = "tf", descriptor = "(Lclient!oi;)V", line = 557)
	@Override
	public void method20675(@OriginalArg(0) Class442 arg0) {
		@Pc(2) float[] local2 = arg0.aFloatArray109;
		local2[1] = -local2[1];
		local2[5] = -local2[5];
		local2[9] = -local2[9];
		local2[13] = -local2[13];
	}

	@OriginalMember(owner = "client!apr", name = "agq", descriptor = "(Lclient!oi;)V", line = 557)
	@Override
	public void method20774(@OriginalArg(0) Class442 arg0) {
		@Pc(2) float[] local2 = arg0.aFloatArray109;
		local2[1] = -local2[1];
		local2[5] = -local2[5];
		local2[9] = -local2[9];
		local2[13] = -local2[13];
	}

	@OriginalMember(owner = "client!apr", name = "tr", descriptor = "()V", line = 565)
	@Override
	void method20623() {
		if (this.aBoolean449 && this.aBoolean442) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!apr", name = "aai", descriptor = "()V", line = 565)
	@Override
	void method20712() {
		if (this.aBoolean449 && this.aBoolean442) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@OriginalMember(owner = "client!apr", name = "aah", descriptor = "()V", line = 570)
	@Override
	void method20713() {
		OpenGL.glDepthMask(this.aBoolean440 && this.aBoolean441);
	}

	@OriginalMember(owner = "client!apr", name = "tg", descriptor = "()V", line = 570)
	@Override
	void method20624() {
		OpenGL.glDepthMask(this.aBoolean440 && this.aBoolean441);
	}

	@OriginalMember(owner = "client!apr", name = "aao", descriptor = "()V", line = 570)
	@Override
	void method20714() {
		OpenGL.glDepthMask(this.aBoolean440 && this.aBoolean441);
	}

	@OriginalMember(owner = "client!apr", name = "abb", descriptor = "()V", line = 574)
	@Override
	void method20715() {
		if (this.aBoolean436 && !this.aBoolean444) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!apr", name = "abj", descriptor = "()V", line = 574)
	@Override
	void method20672() {
		if (this.aBoolean436 && !this.aBoolean444) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!apr", name = "tp", descriptor = "()V", line = 574)
	@Override
	void method20629() {
		if (this.aBoolean436 && !this.aBoolean444) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!apr", name = "tq", descriptor = "()V", line = 579)
	@Override
	void method20668() {
		this.aFloatArray75[0] = this.aFloat203 * this.aFloat195;
		this.aFloatArray75[1] = this.aFloat203 * this.aFloat209;
		this.aFloatArray75[2] = this.aFloat203 * this.aFloat196;
		this.aFloatArray75[3] = 1.0F;
		OpenGL.glLightModelfv(2899, this.aFloatArray75, 0);
	}

	@OriginalMember(owner = "client!apr", name = "abl", descriptor = "()V", line = 579)
	@Override
	void method20716() {
		this.aFloatArray75[0] = this.aFloat203 * this.aFloat195;
		this.aFloatArray75[1] = this.aFloat203 * this.aFloat209;
		this.aFloatArray75[2] = this.aFloat203 * this.aFloat196;
		this.aFloatArray75[3] = 1.0F;
		OpenGL.glLightModelfv(2899, this.aFloatArray75, 0);
	}

	@OriginalMember(owner = "client!apr", name = "ts", descriptor = "()V", line = 587)
	@Override
	void method20631() {
		this.aFloatArray75[0] = this.aFloat204 * this.aFloat195;
		this.aFloatArray75[1] = this.aFloat204 * this.aFloat209;
		this.aFloatArray75[2] = this.aFloat204 * this.aFloat196;
		this.aFloatArray75[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, this.aFloatArray75, 0);
		this.aFloatArray75[0] = -this.aFloat208 * this.aFloat195;
		this.aFloatArray75[1] = -this.aFloat208 * this.aFloat209;
		this.aFloatArray75[2] = -this.aFloat208 * this.aFloat196;
		this.aFloatArray75[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, this.aFloatArray75, 0);
	}

	@OriginalMember(owner = "client!apr", name = "abs", descriptor = "()V", line = 587)
	@Override
	void method20699() {
		this.aFloatArray75[0] = this.aFloat204 * this.aFloat195;
		this.aFloatArray75[1] = this.aFloat204 * this.aFloat209;
		this.aFloatArray75[2] = this.aFloat204 * this.aFloat196;
		this.aFloatArray75[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, this.aFloatArray75, 0);
		this.aFloatArray75[0] = -this.aFloat208 * this.aFloat195;
		this.aFloatArray75[1] = -this.aFloat208 * this.aFloat209;
		this.aFloatArray75[2] = -this.aFloat208 * this.aFloat196;
		this.aFloatArray75[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, this.aFloatArray75, 0);
	}

	@OriginalMember(owner = "client!apr", name = "abi", descriptor = "()V", line = 587)
	@Override
	void method20717() {
		this.aFloatArray75[0] = this.aFloat204 * this.aFloat195;
		this.aFloatArray75[1] = this.aFloat204 * this.aFloat209;
		this.aFloatArray75[2] = this.aFloat204 * this.aFloat196;
		this.aFloatArray75[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, this.aFloatArray75, 0);
		this.aFloatArray75[0] = -this.aFloat208 * this.aFloat195;
		this.aFloatArray75[1] = -this.aFloat208 * this.aFloat209;
		this.aFloatArray75[2] = -this.aFloat208 * this.aFloat196;
		this.aFloatArray75[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, this.aFloatArray75, 0);
	}

	@OriginalMember(owner = "client!apr", name = "tx", descriptor = "()V", line = 600)
	@Override
	void method20689() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(this.aClass442_79.aFloatArray109, 0);
		OpenGL.glLightfv(16384, 4611, this.aFloatArray71, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray72, 0);
	}

	@OriginalMember(owner = "client!apr", name = "afy", descriptor = "()V", line = 600)
	@Override
	void method20767() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(this.aClass442_79.aFloatArray109, 0);
		OpenGL.glLightfv(16384, 4611, this.aFloatArray71, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray72, 0);
	}

	@OriginalMember(owner = "client!apr", name = "tw", descriptor = "()V", line = 607)
	@Override
	void method20632() {
		if (this.aBoolean443) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!apr", name = "abv", descriptor = "()V", line = 607)
	@Override
	void method20654() {
		if (this.aBoolean443) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!apr", name = "abx", descriptor = "()V", line = 607)
	@Override
	void method20719() {
		if (this.aBoolean443) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!apr", name = "abg", descriptor = "()V", line = 607)
	@Override
	void method20720() {
		if (this.aBoolean443) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@OriginalMember(owner = "client!apr", name = "ta", descriptor = "()V", line = 617)
	@Override
	void method20698() {
	}

	@OriginalMember(owner = "client!apr", name = "abw", descriptor = "()V", line = 617)
	@Override
	void method20718() {
	}

	@OriginalMember(owner = "client!apr", name = "abk", descriptor = "()V", line = 617)
	@Override
	void method20666() {
	}

	@OriginalMember(owner = "client!apr", name = "abp", descriptor = "()V", line = 617)
	@Override
	void method20640() {
	}

	@OriginalMember(owner = "client!apr", name = "tt", descriptor = "()V", line = 620)
	@Override
	void method20647() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(this.aClass442_79.aFloatArray109, 0);
		@Pc(8) int local8;
		for (local8 = 0; local8 < this.anInt2806; local8++) {
			@Pc(17) Class77_Sub22 local17 = this.aClass77_Sub22Array18[local8];
			@Pc(21) int local21 = local17.method13557();
			@Pc(25) int local25 = local8 + 16386;
			@Pc(31) float local31 = local17.method13561() / 255.0F;
			this.aFloatArray75[0] = local17.method13544();
			this.aFloatArray75[1] = local17.method13550();
			this.aFloatArray75[2] = local17.method13552();
			this.aFloatArray75[3] = 1.0F;
			OpenGL.glLightfv(local25, 4611, this.aFloatArray75, 0);
			this.aFloatArray75[0] = (float) (local21 >> 16 & 0xFF) * local31;
			this.aFloatArray75[1] = (float) (local21 >> 8 & 0xFF) * local31;
			this.aFloatArray75[2] = (float) (local21 & 0xFF) * local31;
			this.aFloatArray75[3] = 1.0F;
			OpenGL.glLightfv(local25, 4609, this.aFloatArray75, 0);
			OpenGL.glLightf(local25, 4617, 1.0F / (float) (local17.method13555() * local17.method13555()));
			OpenGL.glEnable(local25);
		}
		while (local8 < this.anInt2828) {
			OpenGL.glDisable(local8 + 16386);
			local8++;
		}
	}

	@OriginalMember(owner = "client!apr", name = "abf", descriptor = "()V", line = 620)
	@Override
	void method20721() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(this.aClass442_79.aFloatArray109, 0);
		@Pc(8) int local8;
		for (local8 = 0; local8 < this.anInt2806; local8++) {
			@Pc(17) Class77_Sub22 local17 = this.aClass77_Sub22Array18[local8];
			@Pc(21) int local21 = local17.method13557();
			@Pc(25) int local25 = local8 + 16386;
			@Pc(31) float local31 = local17.method13561() / 255.0F;
			this.aFloatArray75[0] = local17.method13544();
			this.aFloatArray75[1] = local17.method13550();
			this.aFloatArray75[2] = local17.method13552();
			this.aFloatArray75[3] = 1.0F;
			OpenGL.glLightfv(local25, 4611, this.aFloatArray75, 0);
			this.aFloatArray75[0] = (float) (local21 >> 16 & 0xFF) * local31;
			this.aFloatArray75[1] = (float) (local21 >> 8 & 0xFF) * local31;
			this.aFloatArray75[2] = (float) (local21 & 0xFF) * local31;
			this.aFloatArray75[3] = 1.0F;
			OpenGL.glLightfv(local25, 4609, this.aFloatArray75, 0);
			OpenGL.glLightf(local25, 4617, 1.0F / (float) (local17.method13555() * local17.method13555()));
			OpenGL.glEnable(local25);
		}
		while (local8 < this.anInt2828) {
			OpenGL.glDisable(local8 + 16386);
			local8++;
		}
	}

	@OriginalMember(owner = "client!apr", name = "abd", descriptor = "()V", line = 620)
	@Override
	void method20722() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(this.aClass442_79.aFloatArray109, 0);
		@Pc(8) int local8;
		for (local8 = 0; local8 < this.anInt2806; local8++) {
			@Pc(17) Class77_Sub22 local17 = this.aClass77_Sub22Array18[local8];
			@Pc(21) int local21 = local17.method13557();
			@Pc(25) int local25 = local8 + 16386;
			@Pc(31) float local31 = local17.method13561() / 255.0F;
			this.aFloatArray75[0] = local17.method13544();
			this.aFloatArray75[1] = local17.method13550();
			this.aFloatArray75[2] = local17.method13552();
			this.aFloatArray75[3] = 1.0F;
			OpenGL.glLightfv(local25, 4611, this.aFloatArray75, 0);
			this.aFloatArray75[0] = (float) (local21 >> 16 & 0xFF) * local31;
			this.aFloatArray75[1] = (float) (local21 >> 8 & 0xFF) * local31;
			this.aFloatArray75[2] = (float) (local21 & 0xFF) * local31;
			this.aFloatArray75[3] = 1.0F;
			OpenGL.glLightfv(local25, 4609, this.aFloatArray75, 0);
			OpenGL.glLightf(local25, 4617, 1.0F / (float) (local17.method13555() * local17.method13555()));
			OpenGL.glEnable(local25);
		}
		while (local8 < this.anInt2828) {
			OpenGL.glDisable(local8 + 16386);
			local8++;
		}
	}

	@OriginalMember(owner = "client!apr", name = "abq", descriptor = "(Lclient!dt;Lclient!dl;)Z", line = 647)
	@Override
	boolean method20723(@OriginalArg(0) Class212 arg0, @OriginalArg(1) Class206 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!apr", name = "tl", descriptor = "(Lclient!dt;Lclient!dl;)Z", line = 647)
	@Override
	boolean method20676(@OriginalArg(0) Class212 arg0, @OriginalArg(1) Class206 arg1) {
		return true;
	}

	@OriginalMember(owner = "client!apr", name = "uk", descriptor = "(Lclient!dt;Lclient!dl;)Z", line = 651)
	@Override
	boolean method20691(@OriginalArg(0) Class212 arg0, @OriginalArg(1) Class206 arg1) {
		return this.aBoolean458;
	}

	@OriginalMember(owner = "client!apr", name = "aby", descriptor = "(Lclient!dt;Lclient!dl;)Z", line = 651)
	@Override
	boolean method20703(@OriginalArg(0) Class212 arg0, @OriginalArg(1) Class206 arg1) {
		return this.aBoolean458;
	}

	@OriginalMember(owner = "client!apr", name = "aba", descriptor = "(Lclient!dt;Lclient!dl;)Z", line = 651)
	@Override
	boolean method20637(@OriginalArg(0) Class212 arg0, @OriginalArg(1) Class206 arg1) {
		return this.aBoolean458;
	}

	@OriginalMember(owner = "client!apr", name = "ul", descriptor = "(Lclient!dt;Lclient!dl;II)Lclient!ks;", line = 655)
	@Override
	Interface37 method20634(@OriginalArg(0) Class212 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return this.method20639(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!apr", name = "abh", descriptor = "(Lclient!dt;Lclient!dl;II)Lclient!ks;", line = 655)
	@Override
	Interface37 method20627(@OriginalArg(0) Class212 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return this.method20639(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!apr", name = "acq", descriptor = "(Lclient!dt;Lclient!dl;II)Lclient!ks;", line = 655)
	@Override
	Interface37 method20726(@OriginalArg(0) Class212 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return this.method20639(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!apr", name = "acp", descriptor = "(IIZ[III)Lclient!ks;", line = 659)
	@Override
	Interface37 method20669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class114_Sub3(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!apr", name = "un", descriptor = "(IIZ[III)Lclient!ks;", line = 659)
	@Override
	Interface37 method20693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class114_Sub3(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!apr", name = "acb", descriptor = "(IIZ[III)Lclient!ks;", line = 659)
	@Override
	Interface37 method20710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class114_Sub3(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!apr", name = "acl", descriptor = "(IIZ[III)Lclient!ks;", line = 659)
	@Override
	Interface37 method20671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class114_Sub3(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!apr", name = "uy", descriptor = "(Lclient!dt;IIZ[BII)Lclient!ks;", line = 663)
	@Override
	Interface37 method20635(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class114_Sub3(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!apr", name = "aco", descriptor = "(Lclient!dt;IIZ[BII)Lclient!ks;", line = 663)
	@Override
	Interface37 method20727(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class114_Sub3(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!apr", name = "uq", descriptor = "(Lclient!dt;IIZ[FII)Lclient!ks;", line = 667)
	@Override
	Interface37 method20636(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class114_Sub3(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!apr", name = "ace", descriptor = "(Lclient!dt;IIZ[FII)Lclient!ks;", line = 667)
	@Override
	Interface37 method20728(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class114_Sub3(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!apr", name = "acy", descriptor = "(Lclient!dt;IIZ[FII)Lclient!ks;", line = 667)
	@Override
	Interface37 method20683(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class114_Sub3(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!apr", name = "ug", descriptor = "(Lclient!dt;Lclient!dl;II)Lclient!lx;", line = 671)
	@Override
	Interface43 method20639(@OriginalArg(0) Class212 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class114_Sub3(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!apr", name = "agk", descriptor = "(Lclient!dt;Lclient!dl;II)Lclient!lx;", line = 671)
	@Override
	Interface43 method20769(@OriginalArg(0) Class212 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class114_Sub3(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!apr", name = "agd", descriptor = "(Lclient!dt;Lclient!dl;II)Lclient!lx;", line = 671)
	@Override
	Interface43 method20768(@OriginalArg(0) Class212 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class114_Sub3(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!apr", name = "uu", descriptor = "(IZ[[I)Lclient!le;", line = 675)
	@Override
	Interface40 method20638(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2) {
		return new Class114_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!apr", name = "acf", descriptor = "(IZ[[I)Lclient!le;", line = 675)
	@Override
	Interface40 method20732(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2) {
		return new Class114_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!apr", name = "acm", descriptor = "(IZ[[I)Lclient!le;", line = 675)
	@Override
	Interface40 method20674(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2) {
		return new Class114_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!apr", name = "act", descriptor = "(IZ[[I)Lclient!le;", line = 675)
	@Override
	Interface40 method20733(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2) {
		return new Class114_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!apr", name = "ur", descriptor = "(Lclient!dt;IIIZ[B)Lclient!kn;", line = 679)
	@Override
	Interface34 method20766(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5) {
		return new Class114_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!apr", name = "acg", descriptor = "(Lclient!dt;IIIZ[B)Lclient!kn;", line = 679)
	@Override
	Interface34 method20731(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5) {
		return new Class114_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!apr", name = "aca", descriptor = "(Lclient!dt;IIIZ[B)Lclient!kn;", line = 679)
	@Override
	Interface34 method20734(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5) {
		return new Class114_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!apr", name = "ack", descriptor = "(Lclient!dt;IIIZ[B)Lclient!kn;", line = 679)
	@Override
	Interface34 method20616(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5) {
		return new Class114_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!apr", name = "us", descriptor = "()V", line = 683)
	@Override
	public void method20641() {
		@Pc(5) int local5 = this.anIntArray264[this.anInt2832];
		if (local5 != 0) {
			this.anIntArray264[this.anInt2832] = 0;
			OpenGL.glBindTexture(local5, 0);
			OpenGL.glDisable(local5);
		}
	}

	@OriginalMember(owner = "client!apr", name = "acw", descriptor = "()V", line = 683)
	@Override
	public void method20735() {
		@Pc(5) int local5 = this.anIntArray264[this.anInt2832];
		if (local5 != 0) {
			this.anIntArray264[this.anInt2832] = 0;
			OpenGL.glBindTexture(local5, 0);
			OpenGL.glDisable(local5);
		}
	}

	@OriginalMember(owner = "client!apr", name = "adk", descriptor = "()V", line = 692)
	@Override
	void method20665() {
		OpenGL.glMatrixMode(5890);
		if (this.aClass377Array3[this.anInt2832] == Class377.aClass377_2) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(this.aClass442Array6[this.anInt2832].method29038(this.aFloatArray76), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!apr", name = "vh", descriptor = "()V", line = 692)
	@Override
	void method20711() {
		OpenGL.glMatrixMode(5890);
		if (this.aClass377Array3[this.anInt2832] == Class377.aClass377_2) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(this.aClass442Array6[this.anInt2832].method29038(this.aFloatArray76), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!apr", name = "ads", descriptor = "()V", line = 692)
	@Override
	void method20695() {
		OpenGL.glMatrixMode(5890);
		if (this.aClass377Array3[this.anInt2832] == Class377.aClass377_2) {
			OpenGL.glLoadIdentity();
		} else {
			OpenGL.glLoadMatrixf(this.aClass442Array6[this.anInt2832].method29038(this.aFloatArray76), 0);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!apr", name = "vo", descriptor = "()V", line = 701)
	@Override
	void method20644() {
		OpenGL.glActiveTexture(this.anInt2832 + 33984);
	}

	@OriginalMember(owner = "client!apr", name = "ada", descriptor = "()V", line = 701)
	@Override
	void method20742() {
		OpenGL.glActiveTexture(this.anInt2832 + 33984);
	}

	@OriginalMember(owner = "client!apr", name = "vb", descriptor = "()V", line = 705)
	@Override
	void method20645() {
		OpenGL.glTexEnvi(8960, 34161, method20786(this.aClass388Array6[this.anInt2832]));
	}

	@OriginalMember(owner = "client!apr", name = "adr", descriptor = "()V", line = 705)
	@Override
	void method20743() {
		OpenGL.glTexEnvi(8960, 34161, method20786(this.aClass388Array6[this.anInt2832]));
	}

	@OriginalMember(owner = "client!apr", name = "adt", descriptor = "()V", line = 709)
	@Override
	void method20730() {
		OpenGL.glTexEnvi(8960, 34162, method20786(this.aClass388Array5[this.anInt2832]));
	}

	@OriginalMember(owner = "client!apr", name = "ve", descriptor = "()V", line = 709)
	@Override
	void method20646() {
		OpenGL.glTexEnvi(8960, 34162, method20786(this.aClass388Array5[this.anInt2832]));
	}

	@OriginalMember(owner = "client!apr", name = "ade", descriptor = "()V", line = 709)
	@Override
	void method20745() {
		OpenGL.glTexEnvi(8960, 34162, method20786(this.aClass388Array5[this.anInt2832]));
	}

	@OriginalMember(owner = "client!apr", name = "adh", descriptor = "()V", line = 709)
	@Override
	void method20744() {
		OpenGL.glTexEnvi(8960, 34162, method20786(this.aClass388Array5[this.anInt2832]));
	}

	@OriginalMember(owner = "client!apr", name = "adc", descriptor = "()V", line = 709)
	@Override
	void method20660() {
		OpenGL.glTexEnvi(8960, 34162, method20786(this.aClass388Array5[this.anInt2832]));
	}

	@OriginalMember(owner = "client!apr", name = "ua", descriptor = "(ILclient!lp;ZZ)V", line = 713)
	@Override
	final void method20642(@OriginalArg(0) int arg0, @OriginalArg(1) Class383 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, method20788(arg1));
		if (arg2) {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg3 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg3 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!apr", name = "ach", descriptor = "(ILclient!lp;ZZ)V", line = 713)
	@Override
	final void method20739(@OriginalArg(0) int arg0, @OriginalArg(1) Class383 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, method20788(arg1));
		if (arg2) {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg3 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg3 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!apr", name = "acv", descriptor = "(ILclient!lp;ZZ)V", line = 713)
	@Override
	final void method20737(@OriginalArg(0) int arg0, @OriginalArg(1) Class383 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, method20788(arg1));
		if (arg2) {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg3 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg3 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!apr", name = "aci", descriptor = "(ILclient!lp;ZZ)V", line = 713)
	@Override
	final void method20738(@OriginalArg(0) int arg0, @OriginalArg(1) Class383 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, method20788(arg1));
		if (arg2) {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg3 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, arg0 + 34192, arg3 ? 769 : 768);
		}
	}

	@OriginalMember(owner = "client!apr", name = "agn", descriptor = "(ILclient!lp;Z)V", line = 719)
	@Override
	final void method20648(@OriginalArg(0) int arg0, @OriginalArg(1) Class383 arg1, @OriginalArg(2) boolean arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, method20788(arg1));
		OpenGL.glTexEnvi(8960, arg0 + 34200, arg2 ? 771 : 770);
	}

	@OriginalMember(owner = "client!apr", name = "ue", descriptor = "(ILclient!lp;Z)V", line = 719)
	@Override
	final void method20702(@OriginalArg(0) int arg0, @OriginalArg(1) Class383 arg1, @OriginalArg(2) boolean arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, method20788(arg1));
		OpenGL.glTexEnvi(8960, arg0 + 34200, arg2 ? 771 : 770);
	}

	@OriginalMember(owner = "client!apr", name = "agh", descriptor = "(ILclient!lp;Z)V", line = 719)
	@Override
	final void method20775(@OriginalArg(0) int arg0, @OriginalArg(1) Class383 arg1, @OriginalArg(2) boolean arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, method20788(arg1));
		OpenGL.glTexEnvi(8960, arg0 + 34200, arg2 ? 771 : 770);
	}

	@OriginalMember(owner = "client!apr", name = "vn", descriptor = "()V", line = 724)
	@Override
	final void method20643() {
		this.aFloatArray75[0] = (float) (this.anInt2833 & 0xFF0000) / 1.671168E7F;
		this.aFloatArray75[1] = (float) (this.anInt2833 & 0xFF00) / 65280.0F;
		this.aFloatArray75[2] = (float) (this.anInt2833 & 0xFF) / 255.0F;
		this.aFloatArray75[3] = (float) (this.anInt2833 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, this.aFloatArray75, 0);
	}

	@OriginalMember(owner = "client!apr", name = "add", descriptor = "()V", line = 724)
	@Override
	final void method20677() {
		this.aFloatArray75[0] = (float) (this.anInt2833 & 0xFF0000) / 1.671168E7F;
		this.aFloatArray75[1] = (float) (this.anInt2833 & 0xFF00) / 65280.0F;
		this.aFloatArray75[2] = (float) (this.anInt2833 & 0xFF) / 255.0F;
		this.aFloatArray75[3] = (float) (this.anInt2833 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, this.aFloatArray75, 0);
	}

	@OriginalMember(owner = "client!apr", name = "adv", descriptor = "()V", line = 724)
	@Override
	final void method20625() {
		this.aFloatArray75[0] = (float) (this.anInt2833 & 0xFF0000) / 1.671168E7F;
		this.aFloatArray75[1] = (float) (this.anInt2833 & 0xFF00) / 65280.0F;
		this.aFloatArray75[2] = (float) (this.anInt2833 & 0xFF) / 255.0F;
		this.aFloatArray75[3] = (float) (this.anInt2833 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, this.aFloatArray75, 0);
	}

	@OriginalMember(owner = "client!apr", name = "adm", descriptor = "()V", line = 724)
	@Override
	final void method20741() {
		this.aFloatArray75[0] = (float) (this.anInt2833 & 0xFF0000) / 1.671168E7F;
		this.aFloatArray75[1] = (float) (this.anInt2833 & 0xFF00) / 65280.0F;
		this.aFloatArray75[2] = (float) (this.anInt2833 & 0xFF) / 255.0F;
		this.aFloatArray75[3] = (float) (this.anInt2833 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, this.aFloatArray75, 0);
	}

	@OriginalMember(owner = "client!apr", name = "agr", descriptor = "(Lclient!lv;)I", line = 732)
	static final int method20786(@OriginalArg(0) Class388 arg0) {
		if (arg0 == Class388.aClass388_5) {
			return 7681;
		} else if (arg0 == Class388.aClass388_2) {
			return 8448;
		} else if (arg0 == Class388.aClass388_4) {
			return 34165;
		} else if (arg0 == Class388.aClass388_3) {
			return 260;
		} else if (arg0 == Class388.aClass388_1) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!apr", name = "ahl", descriptor = "(Lclient!lv;)I", line = 732)
	static final int method20787(@OriginalArg(0) Class388 arg0) {
		if (arg0 == Class388.aClass388_5) {
			return 7681;
		} else if (arg0 == Class388.aClass388_2) {
			return 8448;
		} else if (arg0 == Class388.aClass388_4) {
			return 34165;
		} else if (arg0 == Class388.aClass388_3) {
			return 260;
		} else if (arg0 == Class388.aClass388_1) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!apr", name = "agl", descriptor = "(Lclient!lp;)I", line = 741)
	static final int method20788(@OriginalArg(0) Class383 arg0) {
		if (arg0 == Class383.aClass383_2) {
			return 5890;
		} else if (arg0 == Class383.aClass383_1) {
			return 34167;
		} else if (arg0 == Class383.aClass383_4) {
			return 34168;
		} else if (arg0 == Class383.aClass383_3) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!apr", name = "vj", descriptor = "(I)V", line = 749)
	@Override
	void method20628(@OriginalArg(0) int arg0) {
		OpenGL.glColorMask((arg0 & 0x1) != 0, (arg0 & 0x2) != 0, (arg0 & 0x4) != 0, (arg0 & 0x8) != 0);
	}

	@OriginalMember(owner = "client!apr", name = "aev", descriptor = "(I)V", line = 749)
	@Override
	void method20729(@OriginalArg(0) int arg0) {
		OpenGL.glColorMask((arg0 & 0x1) != 0, (arg0 & 0x2) != 0, (arg0 & 0x4) != 0, (arg0 & 0x8) != 0);
	}

	@OriginalMember(owner = "client!apr", name = "ael", descriptor = "()V", line = 753)
	@Override
	void method20747() {
		if (this.aBoolean435) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
		OpenGL.glAlphaFunc(516, (float) (this.aByte68 & 0xFF) / 255.0F);
		if (this.anInt2844 <= 1) {
			return;
		}
		if (this.aByte68 == 0) {
			OpenGL.glDisable(32926);
		} else {
			OpenGL.glEnable(32926);
		}
	}

	@OriginalMember(owner = "client!apr", name = "aex", descriptor = "()V", line = 753)
	@Override
	void method20746() {
		if (this.aBoolean435) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
		OpenGL.glAlphaFunc(516, (float) (this.aByte68 & 0xFF) / 255.0F);
		if (this.anInt2844 <= 1) {
			return;
		}
		if (this.aByte68 == 0) {
			OpenGL.glDisable(32926);
		} else {
			OpenGL.glEnable(32926);
		}
	}

	@OriginalMember(owner = "client!apr", name = "vu", descriptor = "()V", line = 753)
	@Override
	void method20650() {
		if (this.aBoolean435) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
		OpenGL.glAlphaFunc(516, (float) (this.aByte68 & 0xFF) / 255.0F);
		if (this.anInt2844 <= 1) {
			return;
		}
		if (this.aByte68 == 0) {
			OpenGL.glDisable(32926);
		} else {
			OpenGL.glEnable(32926);
		}
	}

	@OriginalMember(owner = "client!apr", name = "aep", descriptor = "()V", line = 763)
	@Override
	void method20748() {
		if (this.aBoolean438) {
			@Pc(4) byte local4 = 0;
			@Pc(6) byte local6 = 0;
			if (this.anInt2834 == 0) {
				local4 = 0;
				local6 = 0;
			} else if (this.anInt2834 == 1) {
				local4 = 1;
				local6 = 0;
			} else if (this.anInt2834 == 2) {
				local4 = 1;
				local6 = 1;
			} else if (this.anInt2834 == 3) {
				local4 = 0;
				local6 = 1;
			}
			if (this.aClass380_3 == Class380.aClass380_7) {
				OpenGL.glBlendFuncSeparate(770, 771, local4, local6);
			} else if (this.aClass380_3 == Class380.aClass380_4) {
				OpenGL.glBlendFuncSeparate(1, 1, local4, local6);
			} else if (this.aClass380_3 == Class380.aClass380_6) {
				OpenGL.glBlendFuncSeparate(774, 1, local4, local6);
			} else if (this.aClass380_3 == Class380.aClass380_5) {
				OpenGL.glBlendFuncSeparate(1, 0, local4, local6);
			}
		} else if (this.aClass380_3 == Class380.aClass380_7) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(770, 771);
		} else if (this.aClass380_3 == Class380.aClass380_4) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(1, 1);
		} else if (this.aClass380_3 == Class380.aClass380_6) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(774, 1);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!apr", name = "vt", descriptor = "()V", line = 763)
	@Override
	void method20651() {
		if (this.aBoolean438) {
			@Pc(4) byte local4 = 0;
			@Pc(6) byte local6 = 0;
			if (this.anInt2834 == 0) {
				local4 = 0;
				local6 = 0;
			} else if (this.anInt2834 == 1) {
				local4 = 1;
				local6 = 0;
			} else if (this.anInt2834 == 2) {
				local4 = 1;
				local6 = 1;
			} else if (this.anInt2834 == 3) {
				local4 = 0;
				local6 = 1;
			}
			if (this.aClass380_3 == Class380.aClass380_7) {
				OpenGL.glBlendFuncSeparate(770, 771, local4, local6);
			} else if (this.aClass380_3 == Class380.aClass380_4) {
				OpenGL.glBlendFuncSeparate(1, 1, local4, local6);
			} else if (this.aClass380_3 == Class380.aClass380_6) {
				OpenGL.glBlendFuncSeparate(774, 1, local4, local6);
			} else if (this.aClass380_3 == Class380.aClass380_5) {
				OpenGL.glBlendFuncSeparate(1, 0, local4, local6);
			}
		} else if (this.aClass380_3 == Class380.aClass380_7) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(770, 771);
		} else if (this.aClass380_3 == Class380.aClass380_4) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(1, 1);
		} else if (this.aClass380_3 == Class380.aClass380_6) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(774, 1);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!apr", name = "vi", descriptor = "()V", line = 805)
	@Override
	void method20652() {
		if (this.aBoolean452) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!apr", name = "agt", descriptor = "()V", line = 805)
	@Override
	void method20770() {
		if (this.aBoolean452) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!apr", name = "agf", descriptor = "()V", line = 805)
	@Override
	void method20771() {
		if (this.aBoolean452) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!apr", name = "agj", descriptor = "()V", line = 805)
	@Override
	void method20696() {
		if (this.aBoolean452) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!apr", name = "agz", descriptor = "()V", line = 805)
	@Override
	void method20749() {
		if (this.aBoolean452) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@OriginalMember(owner = "client!apr", name = "ahk", descriptor = "()V", line = 810)
	void method20789() {
		if (this.anInt2843 == 1) {
			OpenGL.glDisable(2884);
			return;
		}
		OpenGL.glEnable(2884);
		if (this.anInt2843 == 2) {
			OpenGL.glCullFace(1029);
		} else if (this.anInt2843 == 3) {
			OpenGL.glCullFace(1028);
		}
	}

	@OriginalMember(owner = "client!apr", name = "agp", descriptor = "()V", line = 810)
	void method20790() {
		if (this.anInt2843 == 1) {
			OpenGL.glDisable(2884);
			return;
		}
		OpenGL.glEnable(2884);
		if (this.anInt2843 == 2) {
			OpenGL.glCullFace(1029);
		} else if (this.anInt2843 == 3) {
			OpenGL.glCullFace(1028);
		}
	}

	@OriginalMember(owner = "client!apr", name = "ahp", descriptor = "()V", line = 810)
	void method20791() {
		if (this.anInt2843 == 1) {
			OpenGL.glDisable(2884);
			return;
		}
		OpenGL.glEnable(2884);
		if (this.anInt2843 == 2) {
			OpenGL.glCullFace(1029);
		} else if (this.anInt2843 == 3) {
			OpenGL.glCullFace(1028);
		}
	}

	@OriginalMember(owner = "client!apr", name = "aer", descriptor = "()V", line = 825)
	@Override
	void method20751() {
		if (this.aBoolean451 && this.aBoolean450 && this.anInt2841 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!apr", name = "vs", descriptor = "()V", line = 825)
	@Override
	void method20667() {
		if (this.aBoolean451 && this.aBoolean450 && this.anInt2841 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!apr", name = "aec", descriptor = "()V", line = 825)
	@Override
	void method20750() {
		if (this.aBoolean451 && this.aBoolean450 && this.anInt2841 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!apr", name = "aeo", descriptor = "()V", line = 825)
	@Override
	void method20621() {
		if (this.aBoolean451 && this.aBoolean450 && this.anInt2841 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!apr", name = "aen", descriptor = "()V", line = 825)
	@Override
	void method20752() {
		if (this.aBoolean451 && this.aBoolean450 && this.anInt2841 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!apr", name = "vx", descriptor = "()V", line = 830)
	@Override
	void method20684() {
		this.aFloat206 = this.aFloat202 - (float) this.anInt2824;
		this.aFloat205 = this.aFloat206 - (float) this.anInt2841;
		if (this.aFloat205 < this.aFloat201) {
			this.aFloat205 = this.aFloat201;
		}
		if (!this.aBoolean434) {
			return;
		}
		OpenGL.glFogf(2915, this.aFloat205);
		OpenGL.glFogf(2916, this.aFloat206);
		this.aFloatArray75[0] = (float) (this.anInt2840 & 0xFF0000) / 1.671168E7F;
		this.aFloatArray75[1] = (float) (this.anInt2840 & 0xFF00) / 65280.0F;
		this.aFloatArray75[2] = (float) (this.anInt2840 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, this.aFloatArray75, 0);
	}

	@OriginalMember(owner = "client!apr", name = "aei", descriptor = "()V", line = 830)
	@Override
	void method20653() {
		this.aFloat206 = this.aFloat202 - (float) this.anInt2824;
		this.aFloat205 = this.aFloat206 - (float) this.anInt2841;
		if (this.aFloat205 < this.aFloat201) {
			this.aFloat205 = this.aFloat201;
		}
		if (!this.aBoolean434) {
			return;
		}
		OpenGL.glFogf(2915, this.aFloat205);
		OpenGL.glFogf(2916, this.aFloat206);
		this.aFloatArray75[0] = (float) (this.anInt2840 & 0xFF0000) / 1.671168E7F;
		this.aFloatArray75[1] = (float) (this.anInt2840 & 0xFF00) / 65280.0F;
		this.aFloatArray75[2] = (float) (this.anInt2840 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, this.aFloatArray75, 0);
	}

	@OriginalMember(owner = "client!apr", name = "aeb", descriptor = "(Z)V", line = 844)
	@Override
	void method20626(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!apr", name = "vw", descriptor = "(Z)V", line = 844)
	@Override
	void method20655(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@OriginalMember(owner = "client!apr", name = "aez", descriptor = "(Z)Lclient!kp;", line = 849)
	@Override
	final Interface36 method20754(@OriginalArg(0) boolean arg0) {
		return new Class123_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!apr", name = "vz", descriptor = "(Z)Lclient!kp;", line = 849)
	@Override
	final Interface36 method20656(@OriginalArg(0) boolean arg0) {
		return new Class123_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!apr", name = "aem", descriptor = "(Z)Lclient!kp;", line = 849)
	@Override
	final Interface36 method20753(@OriginalArg(0) boolean arg0) {
		return new Class123_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!apr", name = "vf", descriptor = "(Z)Lclient!lc;", line = 853)
	@Override
	final Interface38 method20772(@OriginalArg(0) boolean arg0) {
		return new Class123_Sub2(this, Class206.aClass206_22, arg0);
	}

	@OriginalMember(owner = "client!apr", name = "aey", descriptor = "(Z)Lclient!lc;", line = 853)
	@Override
	final Interface38 method20697(@OriginalArg(0) boolean arg0) {
		return new Class123_Sub2(this, Class206.aClass206_22, arg0);
	}

	@OriginalMember(owner = "client!apr", name = "aef", descriptor = "([Lclient!lz;)Lclient!kt;", line = 857)
	@Override
	Class113 method20755(@OriginalArg(0) Class391[] arg0) {
		return new Class113_Sub2(arg0);
	}

	@OriginalMember(owner = "client!apr", name = "aeq", descriptor = "([Lclient!lz;)Lclient!kt;", line = 857)
	@Override
	Class113 method20757(@OriginalArg(0) Class391[] arg0) {
		return new Class113_Sub2(arg0);
	}

	@OriginalMember(owner = "client!apr", name = "vg", descriptor = "([Lclient!lz;)Lclient!kt;", line = 857)
	@Override
	Class113 method20657(@OriginalArg(0) Class391[] arg0) {
		return new Class113_Sub2(arg0);
	}

	@OriginalMember(owner = "client!apr", name = "aeh", descriptor = "([Lclient!lz;)Lclient!kt;", line = 857)
	@Override
	Class113 method20756(@OriginalArg(0) Class391[] arg0) {
		return new Class113_Sub2(arg0);
	}

	@OriginalMember(owner = "client!apr", name = "vk", descriptor = "(ILclient!kp;)V", line = 861)
	@Override
	public void method20670(@OriginalArg(0) int arg0, @OriginalArg(1) Interface36 arg1) {
		this.aClass123_Sub1Array1[arg0] = (Class123_Sub1) arg1;
	}

	@OriginalMember(owner = "client!apr", name = "aet", descriptor = "(ILclient!kp;)V", line = 861)
	@Override
	public void method20759(@OriginalArg(0) int arg0, @OriginalArg(1) Interface36 arg1) {
		this.aClass123_Sub1Array1[arg0] = (Class123_Sub1) arg1;
	}

	@OriginalMember(owner = "client!apr", name = "aft", descriptor = "(ILclient!kp;)V", line = 861)
	@Override
	public void method20760(@OriginalArg(0) int arg0, @OriginalArg(1) Interface36 arg1) {
		this.aClass123_Sub1Array1[arg0] = (Class123_Sub1) arg1;
	}

	@OriginalMember(owner = "client!apr", name = "vv", descriptor = "(Lclient!lc;)V", line = 865)
	@Override
	void method20659(@OriginalArg(0) Interface38 arg0) {
		this.aClass123_Sub2_1 = (Class123_Sub2) arg0;
		this.aClass123_Sub2_1.method11026();
	}

	@OriginalMember(owner = "client!apr", name = "afu", descriptor = "(Lclient!lc;)V", line = 865)
	@Override
	void method20761(@OriginalArg(0) Interface38 arg0) {
		this.aClass123_Sub2_1 = (Class123_Sub2) arg0;
		this.aClass123_Sub2_1.method11026();
	}

	@OriginalMember(owner = "client!apr", name = "aew", descriptor = "(Lclient!kt;)V", line = 870)
	@Override
	public void method20701(@OriginalArg(0) Class113 arg0) {
		@Pc(2) Class391[] local2 = arg0.aClass391Array3;
		@Pc(4) int local4 = 0;
		@Pc(6) boolean local6 = false;
		@Pc(8) boolean local8 = false;
		@Pc(10) boolean local10 = false;
		@Pc(12) int local12;
		for (local12 = 0; local12 < local2.length; local12++) {
			@Pc(20) Class391 local20 = local2[local12];
			@Pc(25) Class123_Sub1 local25 = this.aClass123_Sub1Array1[local12];
			@Pc(27) int local27 = 0;
			@Pc(30) int local30 = local25.method11004();
			@Pc(33) long local33 = local25.method11024();
			local25.method11026();
			for (@Pc(37) int local37 = 0; local37 < local20.method28364(); local37++) {
				@Pc(45) Class366 local45 = local20.method28367(local37);
				switch(local45.anInt4539) {
					case 0:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(1, 5126, local30, local33 + (long) local27);
						break;
					case 1:
						OpenGL.glNormalPointer(5126, local30, local33 + (long) local27);
						local8 = true;
						break;
					case 2:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(3, 5126, local30, local33 + (long) local27);
						break;
					case 3:
						OpenGL.glColorPointer(4, 5121, local30, local33 + (long) local27);
						local6 = true;
					case 4:
					case 5:
					case 7:
					case 9:
					case 10:
					default:
						break;
					case 6:
						OpenGL.glVertexPointer(3, 5126, local30, local33 + (long) local27);
						local10 = true;
						break;
					case 8:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(2, 5126, local30, local33 + (long) local27);
						break;
					case 11:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(4, 5126, local30, local33 + (long) local27);
				}
				local27 += local45.anInt4542;
			}
		}
		if (this.aBoolean472 != local10) {
			if (local10) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean472 = local10;
		}
		if (this.aBoolean463 != local8) {
			if (local8) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean463 = local8;
		}
		if (this.aBoolean464 != local6) {
			if (local6) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean464 = local6;
		}
		if (this.anInt2852 < local4) {
			for (local12 = this.anInt2852; local12 < local4; local12++) {
				OpenGL.glClientActiveTexture(local12 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt2852 = local4;
		} else if (this.anInt2852 > local4) {
			for (local12 = local4; local12 < this.anInt2852; local12++) {
				OpenGL.glClientActiveTexture(local12 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt2852 = local4;
		}
	}

	@OriginalMember(owner = "client!apr", name = "va", descriptor = "(Lclient!kt;)V", line = 870)
	@Override
	public void method20658(@OriginalArg(0) Class113 arg0) {
		@Pc(2) Class391[] local2 = arg0.aClass391Array3;
		@Pc(4) int local4 = 0;
		@Pc(6) boolean local6 = false;
		@Pc(8) boolean local8 = false;
		@Pc(10) boolean local10 = false;
		@Pc(12) int local12;
		for (local12 = 0; local12 < local2.length; local12++) {
			@Pc(20) Class391 local20 = local2[local12];
			@Pc(25) Class123_Sub1 local25 = this.aClass123_Sub1Array1[local12];
			@Pc(27) int local27 = 0;
			@Pc(30) int local30 = local25.method11004();
			@Pc(33) long local33 = local25.method11024();
			local25.method11026();
			for (@Pc(37) int local37 = 0; local37 < local20.method28364(); local37++) {
				@Pc(45) Class366 local45 = local20.method28367(local37);
				switch(local45.anInt4539) {
					case 0:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(1, 5126, local30, local33 + (long) local27);
						break;
					case 1:
						OpenGL.glNormalPointer(5126, local30, local33 + (long) local27);
						local8 = true;
						break;
					case 2:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(3, 5126, local30, local33 + (long) local27);
						break;
					case 3:
						OpenGL.glColorPointer(4, 5121, local30, local33 + (long) local27);
						local6 = true;
					case 4:
					case 5:
					case 7:
					case 9:
					case 10:
					default:
						break;
					case 6:
						OpenGL.glVertexPointer(3, 5126, local30, local33 + (long) local27);
						local10 = true;
						break;
					case 8:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(2, 5126, local30, local33 + (long) local27);
						break;
					case 11:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(4, 5126, local30, local33 + (long) local27);
				}
				local27 += local45.anInt4542;
			}
		}
		if (this.aBoolean472 != local10) {
			if (local10) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean472 = local10;
		}
		if (this.aBoolean463 != local8) {
			if (local8) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean463 = local8;
		}
		if (this.aBoolean464 != local6) {
			if (local6) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean464 = local6;
		}
		if (this.anInt2852 < local4) {
			for (local12 = this.anInt2852; local12 < local4; local12++) {
				OpenGL.glClientActiveTexture(local12 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt2852 = local4;
		} else if (this.anInt2852 > local4) {
			for (local12 = local4; local12 < this.anInt2852; local12++) {
				OpenGL.glClientActiveTexture(local12 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt2852 = local4;
		}
	}

	@OriginalMember(owner = "client!apr", name = "aed", descriptor = "(Lclient!kt;)V", line = 870)
	@Override
	public void method20758(@OriginalArg(0) Class113 arg0) {
		@Pc(2) Class391[] local2 = arg0.aClass391Array3;
		@Pc(4) int local4 = 0;
		@Pc(6) boolean local6 = false;
		@Pc(8) boolean local8 = false;
		@Pc(10) boolean local10 = false;
		@Pc(12) int local12;
		for (local12 = 0; local12 < local2.length; local12++) {
			@Pc(20) Class391 local20 = local2[local12];
			@Pc(25) Class123_Sub1 local25 = this.aClass123_Sub1Array1[local12];
			@Pc(27) int local27 = 0;
			@Pc(30) int local30 = local25.method11004();
			@Pc(33) long local33 = local25.method11024();
			local25.method11026();
			for (@Pc(37) int local37 = 0; local37 < local20.method28364(); local37++) {
				@Pc(45) Class366 local45 = local20.method28367(local37);
				switch(local45.anInt4539) {
					case 0:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(1, 5126, local30, local33 + (long) local27);
						break;
					case 1:
						OpenGL.glNormalPointer(5126, local30, local33 + (long) local27);
						local8 = true;
						break;
					case 2:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(3, 5126, local30, local33 + (long) local27);
						break;
					case 3:
						OpenGL.glColorPointer(4, 5121, local30, local33 + (long) local27);
						local6 = true;
					case 4:
					case 5:
					case 7:
					case 9:
					case 10:
					default:
						break;
					case 6:
						OpenGL.glVertexPointer(3, 5126, local30, local33 + (long) local27);
						local10 = true;
						break;
					case 8:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(2, 5126, local30, local33 + (long) local27);
						break;
					case 11:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(4, 5126, local30, local33 + (long) local27);
				}
				local27 += local45.anInt4542;
			}
		}
		if (this.aBoolean472 != local10) {
			if (local10) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean472 = local10;
		}
		if (this.aBoolean463 != local8) {
			if (local8) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean463 = local8;
		}
		if (this.aBoolean464 != local6) {
			if (local6) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean464 = local6;
		}
		if (this.anInt2852 < local4) {
			for (local12 = this.anInt2852; local12 < local4; local12++) {
				OpenGL.glClientActiveTexture(local12 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt2852 = local4;
		} else if (this.anInt2852 > local4) {
			for (local12 = local4; local12 < this.anInt2852; local12++) {
				OpenGL.glClientActiveTexture(local12 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt2852 = local4;
		}
	}

	@OriginalMember(owner = "client!apr", name = "aej", descriptor = "(Lclient!kt;)V", line = 870)
	@Override
	public void method20682(@OriginalArg(0) Class113 arg0) {
		@Pc(2) Class391[] local2 = arg0.aClass391Array3;
		@Pc(4) int local4 = 0;
		@Pc(6) boolean local6 = false;
		@Pc(8) boolean local8 = false;
		@Pc(10) boolean local10 = false;
		@Pc(12) int local12;
		for (local12 = 0; local12 < local2.length; local12++) {
			@Pc(20) Class391 local20 = local2[local12];
			@Pc(25) Class123_Sub1 local25 = this.aClass123_Sub1Array1[local12];
			@Pc(27) int local27 = 0;
			@Pc(30) int local30 = local25.method11004();
			@Pc(33) long local33 = local25.method11024();
			local25.method11026();
			for (@Pc(37) int local37 = 0; local37 < local20.method28364(); local37++) {
				@Pc(45) Class366 local45 = local20.method28367(local37);
				switch(local45.anInt4539) {
					case 0:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(1, 5126, local30, local33 + (long) local27);
						break;
					case 1:
						OpenGL.glNormalPointer(5126, local30, local33 + (long) local27);
						local8 = true;
						break;
					case 2:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(3, 5126, local30, local33 + (long) local27);
						break;
					case 3:
						OpenGL.glColorPointer(4, 5121, local30, local33 + (long) local27);
						local6 = true;
					case 4:
					case 5:
					case 7:
					case 9:
					case 10:
					default:
						break;
					case 6:
						OpenGL.glVertexPointer(3, 5126, local30, local33 + (long) local27);
						local10 = true;
						break;
					case 8:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(2, 5126, local30, local33 + (long) local27);
						break;
					case 11:
						OpenGL.glClientActiveTexture(local4++ + 33984);
						OpenGL.glTexCoordPointer(4, 5126, local30, local33 + (long) local27);
				}
				local27 += local45.anInt4542;
			}
		}
		if (this.aBoolean472 != local10) {
			if (local10) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			this.aBoolean472 = local10;
		}
		if (this.aBoolean463 != local8) {
			if (local8) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			this.aBoolean463 = local8;
		}
		if (this.aBoolean464 != local6) {
			if (local6) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			this.aBoolean464 = local6;
		}
		if (this.anInt2852 < local4) {
			for (local12 = this.anInt2852; local12 < local4; local12++) {
				OpenGL.glClientActiveTexture(local12 + 33984);
				OpenGL.glEnableClientState(32888);
			}
			this.anInt2852 = local4;
		} else if (this.anInt2852 > local4) {
			for (local12 = local4; local12 < this.anInt2852; local12++) {
				OpenGL.glClientActiveTexture(local12 + 33984);
				OpenGL.glDisableClientState(32888);
			}
			this.anInt2852 = local4;
		}
	}

	@OriginalMember(owner = "client!apr", name = "wt", descriptor = "(Lclient!lq;II)V", line = 953)
	@Override
	public final void method20661(@OriginalArg(0) Class384 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) byte local4;
		@Pc(8) int local8;
		if (arg0 == Class384.aClass384_6) {
			local4 = 1;
			local8 = arg2 * 2;
		} else if (arg0 == Class384.aClass384_2) {
			local4 = 3;
			local8 = arg2 + 1;
		} else if (arg0 == Class384.aClass384_4) {
			local4 = 4;
			local8 = arg2 * 3;
		} else if (arg0 == Class384.aClass384_1) {
			local4 = 6;
			local8 = arg2 + 2;
		} else if (arg0 == Class384.aClass384_5) {
			local4 = 5;
			local8 = arg2 + 2;
		} else {
			local4 = 0;
			local8 = arg2;
		}
		OpenGL.glDrawArrays(local4, arg1, local8);
	}

	@OriginalMember(owner = "client!apr", name = "agx", descriptor = "(Lclient!lq;II)V", line = 953)
	@Override
	public final void method20773(@OriginalArg(0) Class384 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) byte local4;
		@Pc(8) int local8;
		if (arg0 == Class384.aClass384_6) {
			local4 = 1;
			local8 = arg2 * 2;
		} else if (arg0 == Class384.aClass384_2) {
			local4 = 3;
			local8 = arg2 + 1;
		} else if (arg0 == Class384.aClass384_4) {
			local4 = 4;
			local8 = arg2 * 3;
		} else if (arg0 == Class384.aClass384_1) {
			local4 = 6;
			local8 = arg2 + 2;
		} else if (arg0 == Class384.aClass384_5) {
			local4 = 5;
			local8 = arg2 + 2;
		} else {
			local4 = 0;
			local8 = arg2;
		}
		OpenGL.glDrawArrays(local4, arg1, local8);
	}

	@OriginalMember(owner = "client!apr", name = "wy", descriptor = "(Lclient!lc;Lclient!lq;IIII)V", line = 983)
	@Override
	final void method20662(@OriginalArg(0) Interface38 arg0, @OriginalArg(1) Class384 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) byte local4;
		@Pc(8) int local8;
		if (arg1 == Class384.aClass384_6) {
			local4 = 1;
			local8 = arg5 * 2;
		} else if (arg1 == Class384.aClass384_2) {
			local4 = 3;
			local8 = arg5 + 1;
		} else if (arg1 == Class384.aClass384_4) {
			local4 = 4;
			local8 = arg5 * 3;
		} else if (arg1 == Class384.aClass384_1) {
			local4 = 6;
			local8 = arg5 + 2;
		} else if (arg1 == Class384.aClass384_5) {
			local4 = 5;
			local8 = arg5 + 2;
		} else {
			local4 = 0;
			local8 = arg5;
		}
		@Pc(56) Class206 local56 = arg0.method28727();
		@Pc(59) Class123_Sub2 local59 = (Class123_Sub2) arg0;
		local59.method11026();
		OpenGL.glDrawElements(local4, local8, method20807(local56), local59.method11024() + (long) (arg4 * local56.anInt3581 * 1899960707));
	}

	@OriginalMember(owner = "client!apr", name = "afv", descriptor = "(Lclient!lc;Lclient!lq;IIII)V", line = 983)
	@Override
	final void method20763(@OriginalArg(0) Interface38 arg0, @OriginalArg(1) Class384 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) byte local4;
		@Pc(8) int local8;
		if (arg1 == Class384.aClass384_6) {
			local4 = 1;
			local8 = arg5 * 2;
		} else if (arg1 == Class384.aClass384_2) {
			local4 = 3;
			local8 = arg5 + 1;
		} else if (arg1 == Class384.aClass384_4) {
			local4 = 4;
			local8 = arg5 * 3;
		} else if (arg1 == Class384.aClass384_1) {
			local4 = 6;
			local8 = arg5 + 2;
		} else if (arg1 == Class384.aClass384_5) {
			local4 = 5;
			local8 = arg5 + 2;
		} else {
			local4 = 0;
			local8 = arg5;
		}
		@Pc(56) Class206 local56 = arg0.method28727();
		@Pc(59) Class123_Sub2 local59 = (Class123_Sub2) arg0;
		local59.method11026();
		OpenGL.glDrawElements(local4, local8, method20807(local56), local59.method11024() + (long) (arg4 * local56.anInt3581 * 1899960707));
	}

	@OriginalMember(owner = "client!apr", name = "aff", descriptor = "(Lclient!lc;Lclient!lq;IIII)V", line = 983)
	@Override
	final void method20762(@OriginalArg(0) Interface38 arg0, @OriginalArg(1) Class384 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) byte local4;
		@Pc(8) int local8;
		if (arg1 == Class384.aClass384_6) {
			local4 = 1;
			local8 = arg5 * 2;
		} else if (arg1 == Class384.aClass384_2) {
			local4 = 3;
			local8 = arg5 + 1;
		} else if (arg1 == Class384.aClass384_4) {
			local4 = 4;
			local8 = arg5 * 3;
		} else if (arg1 == Class384.aClass384_1) {
			local4 = 6;
			local8 = arg5 + 2;
		} else if (arg1 == Class384.aClass384_5) {
			local4 = 5;
			local8 = arg5 + 2;
		} else {
			local4 = 0;
			local8 = arg5;
		}
		@Pc(56) Class206 local56 = arg0.method28727();
		@Pc(59) Class123_Sub2 local59 = (Class123_Sub2) arg0;
		local59.method11026();
		OpenGL.glDrawElements(local4, local8, method20807(local56), local59.method11024() + (long) (arg4 * local56.anInt3581 * 1899960707));
	}

	@OriginalMember(owner = "client!apr", name = "wk", descriptor = "(Lclient!lq;IIII)V", line = 1016)
	@Override
	public final void method20663(@OriginalArg(0) Class384 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(4) byte local4;
		@Pc(8) int local8;
		if (arg0 == Class384.aClass384_6) {
			local4 = 1;
			local8 = arg4 * 2;
		} else if (arg0 == Class384.aClass384_2) {
			local4 = 3;
			local8 = arg4 + 1;
		} else if (arg0 == Class384.aClass384_4) {
			local4 = 4;
			local8 = arg4 * 3;
		} else if (arg0 == Class384.aClass384_1) {
			local4 = 6;
			local8 = arg4 + 2;
		} else if (arg0 == Class384.aClass384_5) {
			local4 = 5;
			local8 = arg4 + 2;
		} else {
			local4 = 0;
			local8 = arg4;
		}
		@Pc(57) Class206 local57 = this.aClass123_Sub2_1.method28727();
		OpenGL.glDrawElements(local4, local8, method20807(local57), this.aClass123_Sub2_1.method11024() + (long) (arg3 * local57.anInt3581 * 1899960707));
	}

	@OriginalMember(owner = "client!apr", name = "agy", descriptor = "(Lclient!lq;IIII)V", line = 1016)
	@Override
	public final void method20724(@OriginalArg(0) Class384 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(4) byte local4;
		@Pc(8) int local8;
		if (arg0 == Class384.aClass384_6) {
			local4 = 1;
			local8 = arg4 * 2;
		} else if (arg0 == Class384.aClass384_2) {
			local4 = 3;
			local8 = arg4 + 1;
		} else if (arg0 == Class384.aClass384_4) {
			local4 = 4;
			local8 = arg4 * 3;
		} else if (arg0 == Class384.aClass384_1) {
			local4 = 6;
			local8 = arg4 + 2;
		} else if (arg0 == Class384.aClass384_5) {
			local4 = 5;
			local8 = arg4 + 2;
		} else {
			local4 = 0;
			local8 = arg4;
		}
		@Pc(57) Class206 local57 = this.aClass123_Sub2_1.method28727();
		OpenGL.glDrawElements(local4, local8, method20807(local57), this.aClass123_Sub2_1.method11024() + (long) (arg3 * local57.anInt3581 * 1899960707));
	}

	@OriginalMember(owner = "client!apr", name = "s", descriptor = "(I)V", line = 1046)
	@Override
	public final synchronized void method20368(@OriginalArg(0) int arg0) {
		try {
			this.method20813();
		} catch (@Pc(3) Exception local3) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) int local10 = arg0 & Integer.MAX_VALUE;
		@Pc(21) Class77_Sub40 local21;
		while (!this.aClass695_38.method36416()) {
			local21 = (Class77_Sub40) this.aClass695_38.method36388();
			this.anIntArray262[local6++] = (int) (local21.aLong229 * 8258869577519436579L);
			this.anInt2810 -= local21.anInt1786 * -705967177;
			if (local6 == 1000) {
				OpenGL.glDeleteBuffersARB(local6, this.anIntArray262, 0);
				local6 = 0;
			}
		}
		if (local6 > 0) {
			OpenGL.glDeleteBuffersARB(local6, this.anIntArray262, 0);
			local6 = 0;
		}
		while (!this.aClass695_35.method36416()) {
			local21 = (Class77_Sub40) this.aClass695_35.method36388();
			this.anIntArray262[local6++] = (int) (local21.aLong229 * 8258869577519436579L);
			this.anInt2809 -= local21.anInt1786 * -705967177;
			if (local6 == 1000) {
				OpenGL.glDeleteTextures(local6, this.anIntArray262, 0);
				local6 = 0;
			}
		}
		if (local6 > 0) {
			OpenGL.glDeleteTextures(local6, this.anIntArray262, 0);
			local6 = 0;
		}
		while (!this.aClass695_40.method36416()) {
			local21 = (Class77_Sub40) this.aClass695_40.method36388();
			this.anIntArray262[local6++] = local21.anInt1786 * -705967177;
			if (local6 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local6, this.anIntArray262, 0);
				local6 = 0;
			}
		}
		if (local6 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local6, this.anIntArray262, 0);
			local6 = 0;
		}
		while (!this.aClass695_39.method36416()) {
			local21 = (Class77_Sub40) this.aClass695_39.method36388();
			this.anIntArray262[local6++] = (int) (local21.aLong229 * 8258869577519436579L);
			this.anInt2811 -= local21.anInt1786 * -705967177;
			if (local6 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local6, this.anIntArray262, 0);
				local6 = 0;
			}
		}
		if (local6 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local6, this.anIntArray262, 0);
			@Pc(200) boolean local200 = false;
		}
		while (!this.aClass695_34.method36416()) {
			local21 = (Class77_Sub40) this.aClass695_34.method36388();
			OpenGL.glDeleteLists((int) (local21.aLong229 * 8258869577519436579L), local21.anInt1786 * -705967177);
		}
		@Pc(232) Class77 local232;
		while (!this.aClass695_36.method36416()) {
			local232 = this.aClass695_36.method36388();
			OpenGL.glDeleteProgram((int) (local232.aLong229 * 8258869577519436579L));
		}
		while (!this.aClass695_37.method36416()) {
			local232 = this.aClass695_37.method36388();
			OpenGL.glDeleteShader((int) (local232.aLong229 * 8258869577519436579L));
		}
		while (!this.aClass695_34.method36416()) {
			local21 = (Class77_Sub40) this.aClass695_34.method36388();
			OpenGL.glDeleteLists((int) (local21.aLong229 * 8258869577519436579L), local21.anInt1786 * -705967177);
		}
		if (this.method20049() > 100663296 && Class280.method26667() > this.aLong122 + 60000L) {
			System.gc();
			this.aLong122 = Class280.method26667();
		}
		super.method20368(local10);
	}

	@OriginalMember(owner = "client!apr", name = "eg", descriptor = "(I)V", line = 1046)
	@Override
	public final synchronized void method20108(@OriginalArg(0) int arg0) {
		try {
			this.method20813();
		} catch (@Pc(3) Exception local3) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) int local10 = arg0 & Integer.MAX_VALUE;
		@Pc(21) Class77_Sub40 local21;
		while (!this.aClass695_38.method36416()) {
			local21 = (Class77_Sub40) this.aClass695_38.method36388();
			this.anIntArray262[local6++] = (int) (local21.aLong229 * 8258869577519436579L);
			this.anInt2810 -= local21.anInt1786 * -705967177;
			if (local6 == 1000) {
				OpenGL.glDeleteBuffersARB(local6, this.anIntArray262, 0);
				local6 = 0;
			}
		}
		if (local6 > 0) {
			OpenGL.glDeleteBuffersARB(local6, this.anIntArray262, 0);
			local6 = 0;
		}
		while (!this.aClass695_35.method36416()) {
			local21 = (Class77_Sub40) this.aClass695_35.method36388();
			this.anIntArray262[local6++] = (int) (local21.aLong229 * 8258869577519436579L);
			this.anInt2809 -= local21.anInt1786 * -705967177;
			if (local6 == 1000) {
				OpenGL.glDeleteTextures(local6, this.anIntArray262, 0);
				local6 = 0;
			}
		}
		if (local6 > 0) {
			OpenGL.glDeleteTextures(local6, this.anIntArray262, 0);
			local6 = 0;
		}
		while (!this.aClass695_40.method36416()) {
			local21 = (Class77_Sub40) this.aClass695_40.method36388();
			this.anIntArray262[local6++] = local21.anInt1786 * -705967177;
			if (local6 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local6, this.anIntArray262, 0);
				local6 = 0;
			}
		}
		if (local6 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local6, this.anIntArray262, 0);
			local6 = 0;
		}
		while (!this.aClass695_39.method36416()) {
			local21 = (Class77_Sub40) this.aClass695_39.method36388();
			this.anIntArray262[local6++] = (int) (local21.aLong229 * 8258869577519436579L);
			this.anInt2811 -= local21.anInt1786 * -705967177;
			if (local6 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local6, this.anIntArray262, 0);
				local6 = 0;
			}
		}
		if (local6 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local6, this.anIntArray262, 0);
			@Pc(200) boolean local200 = false;
		}
		while (!this.aClass695_34.method36416()) {
			local21 = (Class77_Sub40) this.aClass695_34.method36388();
			OpenGL.glDeleteLists((int) (local21.aLong229 * 8258869577519436579L), local21.anInt1786 * -705967177);
		}
		@Pc(232) Class77 local232;
		while (!this.aClass695_36.method36416()) {
			local232 = this.aClass695_36.method36388();
			OpenGL.glDeleteProgram((int) (local232.aLong229 * 8258869577519436579L));
		}
		while (!this.aClass695_37.method36416()) {
			local232 = this.aClass695_37.method36388();
			OpenGL.glDeleteShader((int) (local232.aLong229 * 8258869577519436579L));
		}
		while (!this.aClass695_34.method36416()) {
			local21 = (Class77_Sub40) this.aClass695_34.method36388();
			OpenGL.glDeleteLists((int) (local21.aLong229 * 8258869577519436579L), local21.anInt1786 * -705967177);
		}
		if (this.method20049() > 100663296 && Class280.method26667() > this.aLong122 + 60000L) {
			System.gc();
			this.aLong122 = Class280.method26667();
		}
		super.method20368(local10);
	}

	@OriginalMember(owner = "client!apr", name = "ey", descriptor = "(I)V", line = 1046)
	@Override
	public final synchronized void method20381(@OriginalArg(0) int arg0) {
		try {
			this.method20813();
		} catch (@Pc(3) Exception local3) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) int local10 = arg0 & Integer.MAX_VALUE;
		@Pc(21) Class77_Sub40 local21;
		while (!this.aClass695_38.method36416()) {
			local21 = (Class77_Sub40) this.aClass695_38.method36388();
			this.anIntArray262[local6++] = (int) (local21.aLong229 * 8258869577519436579L);
			this.anInt2810 -= local21.anInt1786 * -705967177;
			if (local6 == 1000) {
				OpenGL.glDeleteBuffersARB(local6, this.anIntArray262, 0);
				local6 = 0;
			}
		}
		if (local6 > 0) {
			OpenGL.glDeleteBuffersARB(local6, this.anIntArray262, 0);
			local6 = 0;
		}
		while (!this.aClass695_35.method36416()) {
			local21 = (Class77_Sub40) this.aClass695_35.method36388();
			this.anIntArray262[local6++] = (int) (local21.aLong229 * 8258869577519436579L);
			this.anInt2809 -= local21.anInt1786 * -705967177;
			if (local6 == 1000) {
				OpenGL.glDeleteTextures(local6, this.anIntArray262, 0);
				local6 = 0;
			}
		}
		if (local6 > 0) {
			OpenGL.glDeleteTextures(local6, this.anIntArray262, 0);
			local6 = 0;
		}
		while (!this.aClass695_40.method36416()) {
			local21 = (Class77_Sub40) this.aClass695_40.method36388();
			this.anIntArray262[local6++] = local21.anInt1786 * -705967177;
			if (local6 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local6, this.anIntArray262, 0);
				local6 = 0;
			}
		}
		if (local6 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local6, this.anIntArray262, 0);
			local6 = 0;
		}
		while (!this.aClass695_39.method36416()) {
			local21 = (Class77_Sub40) this.aClass695_39.method36388();
			this.anIntArray262[local6++] = (int) (local21.aLong229 * 8258869577519436579L);
			this.anInt2811 -= local21.anInt1786 * -705967177;
			if (local6 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local6, this.anIntArray262, 0);
				local6 = 0;
			}
		}
		if (local6 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local6, this.anIntArray262, 0);
			@Pc(200) boolean local200 = false;
		}
		while (!this.aClass695_34.method36416()) {
			local21 = (Class77_Sub40) this.aClass695_34.method36388();
			OpenGL.glDeleteLists((int) (local21.aLong229 * 8258869577519436579L), local21.anInt1786 * -705967177);
		}
		@Pc(232) Class77 local232;
		while (!this.aClass695_36.method36416()) {
			local232 = this.aClass695_36.method36388();
			OpenGL.glDeleteProgram((int) (local232.aLong229 * 8258869577519436579L));
		}
		while (!this.aClass695_37.method36416()) {
			local232 = this.aClass695_37.method36388();
			OpenGL.glDeleteShader((int) (local232.aLong229 * 8258869577519436579L));
		}
		while (!this.aClass695_34.method36416()) {
			local21 = (Class77_Sub40) this.aClass695_34.method36388();
			OpenGL.glDeleteLists((int) (local21.aLong229 * 8258869577519436579L), local21.anInt1786 * -705967177);
		}
		if (this.method20049() > 100663296 && Class280.method26667() > this.aLong122 + 60000L) {
			System.gc();
			this.aLong122 = Class280.method26667();
		}
		super.method20368(local10);
	}

	@OriginalMember(owner = "client!apr", name = "ez", descriptor = "(I)V", line = 1046)
	@Override
	public final synchronized void method20158(@OriginalArg(0) int arg0) {
		try {
			this.method20813();
		} catch (@Pc(3) Exception local3) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) int local10 = arg0 & Integer.MAX_VALUE;
		@Pc(21) Class77_Sub40 local21;
		while (!this.aClass695_38.method36416()) {
			local21 = (Class77_Sub40) this.aClass695_38.method36388();
			this.anIntArray262[local6++] = (int) (local21.aLong229 * 8258869577519436579L);
			this.anInt2810 -= local21.anInt1786 * -705967177;
			if (local6 == 1000) {
				OpenGL.glDeleteBuffersARB(local6, this.anIntArray262, 0);
				local6 = 0;
			}
		}
		if (local6 > 0) {
			OpenGL.glDeleteBuffersARB(local6, this.anIntArray262, 0);
			local6 = 0;
		}
		while (!this.aClass695_35.method36416()) {
			local21 = (Class77_Sub40) this.aClass695_35.method36388();
			this.anIntArray262[local6++] = (int) (local21.aLong229 * 8258869577519436579L);
			this.anInt2809 -= local21.anInt1786 * -705967177;
			if (local6 == 1000) {
				OpenGL.glDeleteTextures(local6, this.anIntArray262, 0);
				local6 = 0;
			}
		}
		if (local6 > 0) {
			OpenGL.glDeleteTextures(local6, this.anIntArray262, 0);
			local6 = 0;
		}
		while (!this.aClass695_40.method36416()) {
			local21 = (Class77_Sub40) this.aClass695_40.method36388();
			this.anIntArray262[local6++] = local21.anInt1786 * -705967177;
			if (local6 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local6, this.anIntArray262, 0);
				local6 = 0;
			}
		}
		if (local6 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local6, this.anIntArray262, 0);
			local6 = 0;
		}
		while (!this.aClass695_39.method36416()) {
			local21 = (Class77_Sub40) this.aClass695_39.method36388();
			this.anIntArray262[local6++] = (int) (local21.aLong229 * 8258869577519436579L);
			this.anInt2811 -= local21.anInt1786 * -705967177;
			if (local6 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local6, this.anIntArray262, 0);
				local6 = 0;
			}
		}
		if (local6 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local6, this.anIntArray262, 0);
			@Pc(200) boolean local200 = false;
		}
		while (!this.aClass695_34.method36416()) {
			local21 = (Class77_Sub40) this.aClass695_34.method36388();
			OpenGL.glDeleteLists((int) (local21.aLong229 * 8258869577519436579L), local21.anInt1786 * -705967177);
		}
		@Pc(232) Class77 local232;
		while (!this.aClass695_36.method36416()) {
			local232 = this.aClass695_36.method36388();
			OpenGL.glDeleteProgram((int) (local232.aLong229 * 8258869577519436579L));
		}
		while (!this.aClass695_37.method36416()) {
			local232 = this.aClass695_37.method36388();
			OpenGL.glDeleteShader((int) (local232.aLong229 * 8258869577519436579L));
		}
		while (!this.aClass695_34.method36416()) {
			local21 = (Class77_Sub40) this.aClass695_34.method36388();
			OpenGL.glDeleteLists((int) (local21.aLong229 * 8258869577519436579L), local21.anInt1786 * -705967177);
		}
		if (this.method20049() > 100663296 && Class280.method26667() > this.aLong122 + 60000L) {
			System.gc();
			this.aLong122 = Class280.method26667();
		}
		super.method20368(local10);
	}

	@OriginalMember(owner = "client!apr", name = "eb", descriptor = "(I)V", line = 1046)
	@Override
	public final synchronized void method20165(@OriginalArg(0) int arg0) {
		try {
			this.method20813();
		} catch (@Pc(3) Exception local3) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) int local10 = arg0 & Integer.MAX_VALUE;
		@Pc(21) Class77_Sub40 local21;
		while (!this.aClass695_38.method36416()) {
			local21 = (Class77_Sub40) this.aClass695_38.method36388();
			this.anIntArray262[local6++] = (int) (local21.aLong229 * 8258869577519436579L);
			this.anInt2810 -= local21.anInt1786 * -705967177;
			if (local6 == 1000) {
				OpenGL.glDeleteBuffersARB(local6, this.anIntArray262, 0);
				local6 = 0;
			}
		}
		if (local6 > 0) {
			OpenGL.glDeleteBuffersARB(local6, this.anIntArray262, 0);
			local6 = 0;
		}
		while (!this.aClass695_35.method36416()) {
			local21 = (Class77_Sub40) this.aClass695_35.method36388();
			this.anIntArray262[local6++] = (int) (local21.aLong229 * 8258869577519436579L);
			this.anInt2809 -= local21.anInt1786 * -705967177;
			if (local6 == 1000) {
				OpenGL.glDeleteTextures(local6, this.anIntArray262, 0);
				local6 = 0;
			}
		}
		if (local6 > 0) {
			OpenGL.glDeleteTextures(local6, this.anIntArray262, 0);
			local6 = 0;
		}
		while (!this.aClass695_40.method36416()) {
			local21 = (Class77_Sub40) this.aClass695_40.method36388();
			this.anIntArray262[local6++] = local21.anInt1786 * -705967177;
			if (local6 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local6, this.anIntArray262, 0);
				local6 = 0;
			}
		}
		if (local6 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local6, this.anIntArray262, 0);
			local6 = 0;
		}
		while (!this.aClass695_39.method36416()) {
			local21 = (Class77_Sub40) this.aClass695_39.method36388();
			this.anIntArray262[local6++] = (int) (local21.aLong229 * 8258869577519436579L);
			this.anInt2811 -= local21.anInt1786 * -705967177;
			if (local6 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local6, this.anIntArray262, 0);
				local6 = 0;
			}
		}
		if (local6 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local6, this.anIntArray262, 0);
			@Pc(200) boolean local200 = false;
		}
		while (!this.aClass695_34.method36416()) {
			local21 = (Class77_Sub40) this.aClass695_34.method36388();
			OpenGL.glDeleteLists((int) (local21.aLong229 * 8258869577519436579L), local21.anInt1786 * -705967177);
		}
		@Pc(232) Class77 local232;
		while (!this.aClass695_36.method36416()) {
			local232 = this.aClass695_36.method36388();
			OpenGL.glDeleteProgram((int) (local232.aLong229 * 8258869577519436579L));
		}
		while (!this.aClass695_37.method36416()) {
			local232 = this.aClass695_37.method36388();
			OpenGL.glDeleteShader((int) (local232.aLong229 * 8258869577519436579L));
		}
		while (!this.aClass695_34.method36416()) {
			local21 = (Class77_Sub40) this.aClass695_34.method36388();
			OpenGL.glDeleteLists((int) (local21.aLong229 * 8258869577519436579L), local21.anInt1786 * -705967177);
		}
		if (this.method20049() > 100663296 && Class280.method26667() > this.aLong122 + 60000L) {
			System.gc();
			this.aLong122 = Class280.method26667();
		}
		super.method20368(local10);
	}

	@OriginalMember(owner = "client!apr", name = "agi", descriptor = "(II)V", line = 1128)
	final synchronized void method20792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class77_Sub40 local4 = new Class77_Sub40(arg1);
		local4.aLong229 = (long) arg0 * 936217890172187787L;
		this.aClass695_38.method36383(local4);
	}

	@OriginalMember(owner = "client!apr", name = "ahu", descriptor = "(II)V", line = 1128)
	final synchronized void method20793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class77_Sub40 local4 = new Class77_Sub40(arg1);
		local4.aLong229 = (long) arg0 * 936217890172187787L;
		this.aClass695_38.method36383(local4);
	}

	@OriginalMember(owner = "client!apr", name = "agb", descriptor = "(II)V", line = 1134)
	final synchronized void method20794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class77_Sub40 local4 = new Class77_Sub40(arg1);
		local4.aLong229 = (long) arg0 * 936217890172187787L;
		this.aClass695_35.method36383(local4);
	}

	@OriginalMember(owner = "client!apr", name = "ahd", descriptor = "(II)V", line = 1134)
	final synchronized void method20795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class77_Sub40 local4 = new Class77_Sub40(arg1);
		local4.aLong229 = (long) arg0 * 936217890172187787L;
		this.aClass695_35.method36383(local4);
	}

	@OriginalMember(owner = "client!apr", name = "ahs", descriptor = "(II)V", line = 1134)
	final synchronized void method20796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class77_Sub40 local4 = new Class77_Sub40(arg1);
		local4.aLong229 = (long) arg0 * 936217890172187787L;
		this.aClass695_35.method36383(local4);
	}

	@OriginalMember(owner = "client!apr", name = "agv", descriptor = "(I)V", line = 1140)
	final synchronized void method20797(@OriginalArg(0) int arg0) {
		@Pc(4) Class77_Sub40 local4 = new Class77_Sub40(arg0);
		this.aClass695_40.method36383(local4);
	}

	@OriginalMember(owner = "client!apr", name = "ahz", descriptor = "(I)V", line = 1140)
	final synchronized void method20798(@OriginalArg(0) int arg0) {
		@Pc(4) Class77_Sub40 local4 = new Class77_Sub40(arg0);
		this.aClass695_40.method36383(local4);
	}

	@OriginalMember(owner = "client!apr", name = "aho", descriptor = "(I)V", line = 1140)
	final synchronized void method20799(@OriginalArg(0) int arg0) {
		@Pc(4) Class77_Sub40 local4 = new Class77_Sub40(arg0);
		this.aClass695_40.method36383(local4);
	}

	@OriginalMember(owner = "client!apr", name = "agg", descriptor = "(II)V", line = 1145)
	final synchronized void method20800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class77_Sub40 local4 = new Class77_Sub40(arg1);
		local4.aLong229 = (long) arg0 * 936217890172187787L;
		this.aClass695_39.method36383(local4);
	}

	@OriginalMember(owner = "client!apr", name = "ahi", descriptor = "(J)V", line = 1151)
	final synchronized void method20801(@OriginalArg(0) long arg0) {
		@Pc(3) Class77 local3 = new Class77();
		local3.aLong229 = arg0 * 936217890172187787L;
		this.aClass695_37.method36383(local3);
	}

	@OriginalMember(owner = "client!apr", name = "aga", descriptor = "(J)V", line = 1151)
	final synchronized void method20802(@OriginalArg(0) long arg0) {
		@Pc(3) Class77 local3 = new Class77();
		local3.aLong229 = arg0 * 936217890172187787L;
		this.aClass695_37.method36383(local3);
	}

	@OriginalMember(owner = "client!apr", name = "ahw", descriptor = "(J)V", line = 1151)
	final synchronized void method20803(@OriginalArg(0) long arg0) {
		@Pc(3) Class77 local3 = new Class77();
		local3.aLong229 = arg0 * 936217890172187787L;
		this.aClass695_37.method36383(local3);
	}

	@OriginalMember(owner = "client!apr", name = "ago", descriptor = "(I)V", line = 1157)
	final synchronized void method20804(@OriginalArg(0) int arg0) {
		@Pc(3) Class77 local3 = new Class77();
		local3.aLong229 = (long) arg0 * 936217890172187787L;
		this.aClass695_36.method36383(local3);
	}

	@OriginalMember(owner = "client!apr", name = "ahx", descriptor = "(I)V", line = 1157)
	final synchronized void method20805(@OriginalArg(0) int arg0) {
		@Pc(3) Class77 local3 = new Class77();
		local3.aLong229 = (long) arg0 * 936217890172187787L;
		this.aClass695_36.method36383(local3);
	}

	@OriginalMember(owner = "client!apr", name = "ahe", descriptor = "(I)V", line = 1157)
	final synchronized void method20806(@OriginalArg(0) int arg0) {
		@Pc(3) Class77 local3 = new Class77();
		local3.aLong229 = (long) arg0 * 936217890172187787L;
		this.aClass695_36.method36383(local3);
	}

	@OriginalMember(owner = "client!apr", name = "age", descriptor = "(Lclient!dl;)I", line = 1163)
	static final int method20807(@OriginalArg(0) Class206 arg0) {
		switch(arg0.anInt3582 * -1414205941) {
			case 0:
				return 5131;
			case 1:
				return 5120;
			case 2:
				return 5126;
			case 3:
				return 5125;
			case 4:
				return 5121;
			case 5:
				return 5123;
			case 6:
				return 5124;
			case 7:
			default:
				return 5121;
			case 8:
				return 5122;
		}
	}

	@OriginalMember(owner = "client!apr", name = "ahf", descriptor = "(Lclient!dl;)I", line = 1163)
	static final int method20808(@OriginalArg(0) Class206 arg0) {
		switch(arg0.anInt3582 * -1414205941) {
			case 0:
				return 5131;
			case 1:
				return 5120;
			case 2:
				return 5126;
			case 3:
				return 5125;
			case 4:
				return 5121;
			case 5:
				return 5123;
			case 6:
				return 5124;
			case 7:
			default:
				return 5121;
			case 8:
				return 5122;
		}
	}

	@OriginalMember(owner = "client!apr", name = "ahq", descriptor = "(Lclient!dt;)I", line = 1186)
	static int method20809(@OriginalArg(0) Class212 arg0) {
		switch(arg0.anInt3678 * -939549997) {
			case 0:
				return 6408;
			case 1:
				return 6410;
			case 2:
			case 5:
			case 7:
			default:
				throw new IllegalStateException();
			case 3:
				return 6402;
			case 4:
				return 6407;
			case 6:
				return 6409;
			case 8:
				return 6406;
		}
	}

	@OriginalMember(owner = "client!apr", name = "agm", descriptor = "(Lclient!dt;)I", line = 1186)
	static int method20810(@OriginalArg(0) Class212 arg0) {
		switch(arg0.anInt3678 * -939549997) {
			case 0:
				return 6408;
			case 1:
				return 6410;
			case 2:
			case 5:
			case 7:
			default:
				throw new IllegalStateException();
			case 3:
				return 6402;
			case 4:
				return 6407;
			case 6:
				return 6409;
			case 8:
				return 6406;
		}
	}

	@OriginalMember(owner = "client!apr", name = "ahh", descriptor = "(Lclient!dt;)I", line = 1186)
	static int method20811(@OriginalArg(0) Class212 arg0) {
		switch(arg0.anInt3678 * -939549997) {
			case 0:
				return 6408;
			case 1:
				return 6410;
			case 2:
			case 5:
			case 7:
			default:
				throw new IllegalStateException();
			case 3:
				return 6402;
			case 4:
				return 6407;
			case 6:
				return 6409;
			case 8:
				return 6406;
		}
	}

	@OriginalMember(owner = "client!apr", name = "agw", descriptor = "(Lclient!dt;Lclient!dl;)I", line = 1205)
	static int method20812(@OriginalArg(0) Class212 arg0, @OriginalArg(1) Class206 arg1) {
		if (arg1 == Class206.aClass206_23) {
			switch(arg0.anInt3678 * -939549997) {
				case 0:
					return 6408;
				case 1:
					return 6410;
				case 2:
					return 33779;
				case 3:
				case 5:
				default:
					throw new IllegalArgumentException();
				case 4:
					return 6407;
				case 6:
					return 6409;
				case 7:
					return 33777;
				case 8:
					return 6406;
			}
		} else if (arg1 == Class206.aClass206_22) {
			switch(arg0.anInt3678 * -939549997) {
				case 0:
					return 32859;
				case 1:
					return 36219;
				case 2:
				case 5:
				case 7:
				default:
					throw new IllegalArgumentException();
				case 3:
					return 33189;
				case 4:
					return 32852;
				case 6:
					return 32834;
				case 8:
					return 32830;
			}
		} else if (arg1 == Class206.aClass206_21) {
			switch(arg0.anInt3678 * -939549997) {
				case 3:
					return 33190;
				default:
					throw new IllegalArgumentException();
			}
		} else if (arg1 == Class206.aClass206_24) {
			switch(arg0.anInt3678 * -939549997) {
				case 3:
					return 33191;
				default:
					throw new IllegalArgumentException();
			}
		} else if (arg1 == Class206.aClass206_25) {
			switch(arg0.anInt3678 * -939549997) {
				case 0:
					return 34842;
				case 1:
					return 34847;
				case 2:
				case 3:
				case 5:
				case 7:
				default:
					throw new IllegalArgumentException();
				case 4:
					return 34843;
				case 6:
					return 34846;
				case 8:
					return 34844;
			}
		} else if (arg1 == Class206.aClass206_19) {
			switch(arg0.anInt3678 * -939549997) {
				case 0:
					return 34836;
				case 1:
					return 34841;
				case 2:
				case 3:
				case 5:
				case 7:
				default:
					throw new IllegalArgumentException();
				case 4:
					return 34837;
				case 6:
					return 34840;
				case 8:
					return 34838;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!apr", name = "et", descriptor = "(Z)V", line = 1294)
	@Override
	public void method20149(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!apr", name = "fy", descriptor = "(Z)V", line = 1294)
	@Override
	public void method20180() {
	}

	@OriginalMember(owner = "client!apr", name = "ahg", descriptor = "()V", line = 1297)
	void method20813() {
		@Pc(1) int local1 = 0;
		while (!this.anOpenGL3.method27719()) {
			if (local1++ > 5) {
				throw new RuntimeException("");
			}
			Class281.method26679(1000L);
		}
	}

	@OriginalMember(owner = "client!apr", name = "ahm", descriptor = "()V", line = 1297)
	void method20814() {
		@Pc(1) int local1 = 0;
		while (!this.anOpenGL3.method27719()) {
			if (local1++ > 5) {
				throw new RuntimeException("");
			}
			Class281.method26679(1000L);
		}
	}

	@OriginalMember(owner = "client!apr", name = "ahv", descriptor = "()V", line = 1297)
	void method20815() {
		@Pc(1) int local1 = 0;
		while (!this.anOpenGL3.method27719()) {
			if (local1++ > 5) {
				throw new RuntimeException("");
			}
			Class281.method26679(1000L);
		}
	}

	@OriginalMember(owner = "client!apr", name = "wg", descriptor = "(I)V", line = 1305)
	@Override
	void method20622(@OriginalArg(0) int arg0) {
		if (!this.aBoolean474) {
			OpenGL.glPolygonMode(1028, (arg0 & 0x2) == 0 ? 6914 : 6913);
		}
	}

	@OriginalMember(owner = "client!apr", name = "afx", descriptor = "(I)V", line = 1305)
	@Override
	void method20709(@OriginalArg(0) int arg0) {
		if (!this.aBoolean474) {
			OpenGL.glPolygonMode(1028, (arg0 & 0x2) == 0 ? 6914 : 6913);
		}
	}

	@OriginalMember(owner = "client!apr", name = "afm", descriptor = "(I)V", line = 1305)
	@Override
	void method20764(@OriginalArg(0) int arg0) {
		if (!this.aBoolean474) {
			OpenGL.glPolygonMode(1028, (arg0 & 0x2) == 0 ? 6914 : 6913);
		}
	}

	@OriginalMember(owner = "client!apr", name = "afr", descriptor = "(I)V", line = 1305)
	@Override
	void method20765(@OriginalArg(0) int arg0) {
		if (!this.aBoolean474) {
			OpenGL.glPolygonMode(1028, (arg0 & 0x2) == 0 ? 6914 : 6913);
		}
	}

	@OriginalMember(owner = "client!apr", name = "fh", descriptor = "()Ljava/lang/String;", line = 1311)
	@Override
	public String method20176() {
		@Pc(1) String local1 = "Caps: 4:";
		@Pc(3) String local3 = ":";
		@Pc(15) String local15 = local1 + this.anInt2844 + local3;
		@Pc(27) String local27 = local15 + this.anInt2854 + local3;
		@Pc(39) String local39 = local27 + this.anInt2848 + local3;
		@Pc(51) String local51 = local39 + this.anInt2849 + local3;
		@Pc(67) String local67 = local51 + (this.aBoolean469 ? 1 : 0) + local3;
		@Pc(83) String local83 = local67 + (this.aBoolean453 ? 1 : 0) + local3;
		@Pc(99) String local99 = local83 + (this.aBoolean462 ? 1 : 0) + local3;
		@Pc(115) String local115 = local99 + (this.aBoolean471 ? 1 : 0) + local3;
		@Pc(131) String local131 = local115 + (this.aBoolean468 ? 1 : 0) + local3;
		@Pc(147) String local147 = local131 + (this.aBoolean470 ? 1 : 0) + local3;
		@Pc(163) String local163 = local147 + (this.aBoolean458 ? 1 : 0) + local3;
		@Pc(179) String local179 = local163 + (this.aBoolean467 ? 1 : 0) + local3;
		@Pc(195) String local195 = local179 + (this.aBoolean457 ? 1 : 0) + local3;
		@Pc(211) String local211 = local195 + (this.aBoolean466 ? 1 : 0) + local3;
		@Pc(227) String local227 = local211 + (this.aBoolean454 ? 1 : 0) + local3;
		@Pc(243) String local243 = local227 + (this.aBoolean455 ? 1 : 0) + local3;
		@Pc(259) String local259 = local243 + (this.aBoolean456 ? 1 : 0) + local3;
		@Pc(275) String local275 = local259 + (this.aBoolean438 ? 1 : 0) + local3;
		return local275 + OpenGL.glGetString(35724).toLowerCase();
	}

	@OriginalMember(owner = "client!apr", name = "fn", descriptor = "()Ljava/lang/String;", line = 1311)
	@Override
	public String method20177() {
		@Pc(1) String local1 = "Caps: 4:";
		@Pc(3) String local3 = ":";
		@Pc(15) String local15 = local1 + this.anInt2844 + local3;
		@Pc(27) String local27 = local15 + this.anInt2854 + local3;
		@Pc(39) String local39 = local27 + this.anInt2848 + local3;
		@Pc(51) String local51 = local39 + this.anInt2849 + local3;
		@Pc(67) String local67 = local51 + (this.aBoolean469 ? 1 : 0) + local3;
		@Pc(83) String local83 = local67 + (this.aBoolean453 ? 1 : 0) + local3;
		@Pc(99) String local99 = local83 + (this.aBoolean462 ? 1 : 0) + local3;
		@Pc(115) String local115 = local99 + (this.aBoolean471 ? 1 : 0) + local3;
		@Pc(131) String local131 = local115 + (this.aBoolean468 ? 1 : 0) + local3;
		@Pc(147) String local147 = local131 + (this.aBoolean470 ? 1 : 0) + local3;
		@Pc(163) String local163 = local147 + (this.aBoolean458 ? 1 : 0) + local3;
		@Pc(179) String local179 = local163 + (this.aBoolean467 ? 1 : 0) + local3;
		@Pc(195) String local195 = local179 + (this.aBoolean457 ? 1 : 0) + local3;
		@Pc(211) String local211 = local195 + (this.aBoolean466 ? 1 : 0) + local3;
		@Pc(227) String local227 = local211 + (this.aBoolean454 ? 1 : 0) + local3;
		@Pc(243) String local243 = local227 + (this.aBoolean455 ? 1 : 0) + local3;
		@Pc(259) String local259 = local243 + (this.aBoolean456 ? 1 : 0) + local3;
		@Pc(275) String local275 = local259 + (this.aBoolean438 ? 1 : 0) + local3;
		return local275 + OpenGL.glGetString(35724).toLowerCase();
	}

	@OriginalMember(owner = "client!apr", name = "n", descriptor = "()Ljava/lang/String;", line = 1311)
	@Override
	public String method20059() {
		@Pc(1) String local1 = "Caps: 4:";
		@Pc(3) String local3 = ":";
		@Pc(15) String local15 = local1 + this.anInt2844 + local3;
		@Pc(27) String local27 = local15 + this.anInt2854 + local3;
		@Pc(39) String local39 = local27 + this.anInt2848 + local3;
		@Pc(51) String local51 = local39 + this.anInt2849 + local3;
		@Pc(67) String local67 = local51 + (this.aBoolean469 ? 1 : 0) + local3;
		@Pc(83) String local83 = local67 + (this.aBoolean453 ? 1 : 0) + local3;
		@Pc(99) String local99 = local83 + (this.aBoolean462 ? 1 : 0) + local3;
		@Pc(115) String local115 = local99 + (this.aBoolean471 ? 1 : 0) + local3;
		@Pc(131) String local131 = local115 + (this.aBoolean468 ? 1 : 0) + local3;
		@Pc(147) String local147 = local131 + (this.aBoolean470 ? 1 : 0) + local3;
		@Pc(163) String local163 = local147 + (this.aBoolean458 ? 1 : 0) + local3;
		@Pc(179) String local179 = local163 + (this.aBoolean467 ? 1 : 0) + local3;
		@Pc(195) String local195 = local179 + (this.aBoolean457 ? 1 : 0) + local3;
		@Pc(211) String local211 = local195 + (this.aBoolean466 ? 1 : 0) + local3;
		@Pc(227) String local227 = local211 + (this.aBoolean454 ? 1 : 0) + local3;
		@Pc(243) String local243 = local227 + (this.aBoolean455 ? 1 : 0) + local3;
		@Pc(259) String local259 = local243 + (this.aBoolean456 ? 1 : 0) + local3;
		@Pc(275) String local275 = local259 + (this.aBoolean438 ? 1 : 0) + local3;
		return local275 + OpenGL.glGetString(35724).toLowerCase();
	}
}
