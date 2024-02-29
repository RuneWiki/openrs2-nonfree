package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aps")
public class Class77_Sub11_Sub2 extends Class77_Sub11 {

	@OriginalMember(owner = "client!aps", name = "s", descriptor = "Ljava/lang/String;")
	static final String aString78 = "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n";

	@OriginalMember(owner = "client!aps", name = "r", descriptor = "Ljava/lang/String;")
	static final String aString79 = "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n";

	@OriginalMember(owner = "client!aps", name = "g", descriptor = "Ljava/lang/String;")
	static final String aString80 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n";

	@OriginalMember(owner = "client!aps", name = "d", descriptor = "Ljava/lang/String;")
	static final String aString81 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n";

	@OriginalMember(owner = "client!aps", name = "w", descriptor = "I")
	static final int anInt2861 = 256;

	@OriginalMember(owner = "client!aps", name = "t", descriptor = "F")
	static float aFloat210 = 0.25F;

	@OriginalMember(owner = "client!aps", name = "q", descriptor = "F")
	static float aFloat211 = 1.0F;

	@OriginalMember(owner = "client!aps", name = "x", descriptor = "F")
	static float aFloat212 = 1.0F;

	@OriginalMember(owner = "client!aps", name = "e", descriptor = "I")
	int anInt2858;

	@OriginalMember(owner = "client!aps", name = "h", descriptor = "Lclient!bd;")
	Class166 aClass166_3;

	@OriginalMember(owner = "client!aps", name = "j", descriptor = "Lclient!aob;")
	Class92_Sub1_Sub1 aClass92_Sub1_Sub1_2;

	@OriginalMember(owner = "client!aps", name = "i", descriptor = "Lclient!adi;")
	Class78_Sub2 aClass78_Sub2_3;

	@OriginalMember(owner = "client!aps", name = "m", descriptor = "Lclient!bd;")
	Class166 aClass166_4;

	@OriginalMember(owner = "client!aps", name = "u", descriptor = "[Lclient!adi;")
	Class78_Sub2[] aClass78_Sub2Array1;

	@OriginalMember(owner = "client!aps", name = "k", descriptor = "Lclient!adi;")
	Class78_Sub2 aClass78_Sub2_4;

	@OriginalMember(owner = "client!aps", name = "f", descriptor = "I")
	int anInt2859;

	@OriginalMember(owner = "client!aps", name = "o", descriptor = "I")
	int anInt2860;

	@OriginalMember(owner = "client!aps", name = "z", descriptor = "Lclient!aob;")
	Class92_Sub1_Sub1 aClass92_Sub1_Sub1_3;

	@OriginalMember(owner = "client!aps", name = "n", descriptor = "Lclient!bd;")
	Class166 aClass166_5;

	@OriginalMember(owner = "client!aps", name = "a", descriptor = "Lclient!bd;")
	Class166 aClass166_6;

	@OriginalMember(owner = "client!aps", name = "b", descriptor = "I")
	int anInt2862;

	@OriginalMember(owner = "client!aps", name = "<init>", descriptor = "(Lclient!aeq;)V", line = 33)
	Class77_Sub11_Sub2(@OriginalArg(0) Class86_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aps", name = "bc", descriptor = "()Z", line = 37)
	boolean method20870() {
		return this.aClass86_Sub3_38.aBoolean134 && this.aClass86_Sub3_38.aBoolean133 && this.aClass86_Sub3_38.aBoolean142;
	}

	@OriginalMember(owner = "client!aps", name = "bj", descriptor = "()Z", line = 37)
	boolean method20871() {
		return this.aClass86_Sub3_38.aBoolean134 && this.aClass86_Sub3_38.aBoolean133 && this.aClass86_Sub3_38.aBoolean142;
	}

	@OriginalMember(owner = "client!aps", name = "bv", descriptor = "()Z", line = 37)
	boolean method20872() {
		return this.aClass86_Sub3_38.aBoolean134 && this.aClass86_Sub3_38.aBoolean133 && this.aClass86_Sub3_38.aBoolean142;
	}

	@OriginalMember(owner = "client!aps", name = "ba", descriptor = "()Z", line = 37)
	boolean method20873() {
		return this.aClass86_Sub3_38.aBoolean134 && this.aClass86_Sub3_38.aBoolean133 && this.aClass86_Sub3_38.aBoolean142;
	}

	@OriginalMember(owner = "client!aps", name = "g", descriptor = "()Z", line = 41)
	@Override
	boolean method21295() {
		return this.aClass92_Sub1_Sub1_3 != null;
	}

	@OriginalMember(owner = "client!aps", name = "z", descriptor = "()Z", line = 41)
	@Override
	boolean method21296() {
		return this.aClass92_Sub1_Sub1_3 != null;
	}

	@OriginalMember(owner = "client!aps", name = "j", descriptor = "()Z", line = 41)
	@Override
	boolean method21297() {
		return this.aClass92_Sub1_Sub1_3 != null;
	}

	@OriginalMember(owner = "client!aps", name = "n", descriptor = "()Z", line = 41)
	@Override
	boolean method21298() {
		return this.aClass92_Sub1_Sub1_3 != null;
	}

	@OriginalMember(owner = "client!aps", name = "b", descriptor = "()Z", line = 41)
	@Override
	boolean method21287() {
		return this.aClass92_Sub1_Sub1_3 != null;
	}

	@OriginalMember(owner = "client!aps", name = "p", descriptor = "()Z", line = 41)
	@Override
	boolean method21286() {
		return this.aClass92_Sub1_Sub1_3 != null;
	}

	@OriginalMember(owner = "client!aps", name = "m", descriptor = "()Z", line = 45)
	@Override
	boolean method21316() {
		if (!this.aClass86_Sub3_38.aBoolean134 || !this.aClass86_Sub3_38.aBoolean133 || !this.aClass86_Sub3_38.aBoolean142) {
			return false;
		}
		this.aClass92_Sub1_Sub1_3 = new Class92_Sub1_Sub1(this.aClass86_Sub3_38);
		this.aClass78_Sub2_3 = new Class78_Sub2(this.aClass86_Sub3_38, 3553, Class212.aClass212_18, this.method21278(), 256, 256);
		this.aClass78_Sub2_3.method17493(false, false);
		this.aClass78_Sub2_4 = new Class78_Sub2(this.aClass86_Sub3_38, 3553, Class212.aClass212_18, this.method21278(), 256, 256);
		this.aClass78_Sub2_4.method17493(false, false);
		this.aClass86_Sub3_38.method19968(this.aClass92_Sub1_Sub1_3);
		this.aClass92_Sub1_Sub1_3.method23513(0, this.aClass78_Sub2_3.method17513(0));
		this.aClass92_Sub1_Sub1_3.method23513(1, this.aClass78_Sub2_4.method17513(0));
		this.aClass92_Sub1_Sub1_3.method17580(0);
		if (!this.aClass92_Sub1_Sub1_3.method23514()) {
			this.aClass86_Sub3_38.method19972(this.aClass92_Sub1_Sub1_3);
			return false;
		}
		this.aClass86_Sub3_38.method19972(this.aClass92_Sub1_Sub1_3);
		this.aClass166_3 = Class166.method24388(this.aClass86_Sub3_38, new Class181[] { Class181.method24564(this.aClass86_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass166_4 = Class166.method24388(this.aClass86_Sub3_38, new Class181[] { Class181.method24564(this.aClass86_Sub3_38, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass166_6 = Class166.method24388(this.aClass86_Sub3_38, new Class181[] { Class181.method24564(this.aClass86_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n") });
		this.aClass166_5 = Class166.method24388(this.aClass86_Sub3_38, new Class181[] { Class181.method24564(this.aClass86_Sub3_38, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass166_4 != null && this.aClass166_3 != null && this.aClass166_6 != null && this.aClass166_5 != null;
	}

	@OriginalMember(owner = "client!aps", name = "a", descriptor = "()Z", line = 45)
	@Override
	boolean method21299() {
		if (!this.aClass86_Sub3_38.aBoolean134 || !this.aClass86_Sub3_38.aBoolean133 || !this.aClass86_Sub3_38.aBoolean142) {
			return false;
		}
		this.aClass92_Sub1_Sub1_3 = new Class92_Sub1_Sub1(this.aClass86_Sub3_38);
		this.aClass78_Sub2_3 = new Class78_Sub2(this.aClass86_Sub3_38, 3553, Class212.aClass212_18, this.method21278(), 256, 256);
		this.aClass78_Sub2_3.method17493(false, false);
		this.aClass78_Sub2_4 = new Class78_Sub2(this.aClass86_Sub3_38, 3553, Class212.aClass212_18, this.method21278(), 256, 256);
		this.aClass78_Sub2_4.method17493(false, false);
		this.aClass86_Sub3_38.method19968(this.aClass92_Sub1_Sub1_3);
		this.aClass92_Sub1_Sub1_3.method23513(0, this.aClass78_Sub2_3.method17513(0));
		this.aClass92_Sub1_Sub1_3.method23513(1, this.aClass78_Sub2_4.method17513(0));
		this.aClass92_Sub1_Sub1_3.method17580(0);
		if (!this.aClass92_Sub1_Sub1_3.method23514()) {
			this.aClass86_Sub3_38.method19972(this.aClass92_Sub1_Sub1_3);
			return false;
		}
		this.aClass86_Sub3_38.method19972(this.aClass92_Sub1_Sub1_3);
		this.aClass166_3 = Class166.method24388(this.aClass86_Sub3_38, new Class181[] { Class181.method24564(this.aClass86_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass166_4 = Class166.method24388(this.aClass86_Sub3_38, new Class181[] { Class181.method24564(this.aClass86_Sub3_38, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass166_6 = Class166.method24388(this.aClass86_Sub3_38, new Class181[] { Class181.method24564(this.aClass86_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n") });
		this.aClass166_5 = Class166.method24388(this.aClass86_Sub3_38, new Class181[] { Class181.method24564(this.aClass86_Sub3_38, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass166_4 != null && this.aClass166_3 != null && this.aClass166_6 != null && this.aClass166_5 != null;
	}

	@OriginalMember(owner = "client!aps", name = "h", descriptor = "()Z", line = 45)
	@Override
	boolean method21300() {
		if (!this.aClass86_Sub3_38.aBoolean134 || !this.aClass86_Sub3_38.aBoolean133 || !this.aClass86_Sub3_38.aBoolean142) {
			return false;
		}
		this.aClass92_Sub1_Sub1_3 = new Class92_Sub1_Sub1(this.aClass86_Sub3_38);
		this.aClass78_Sub2_3 = new Class78_Sub2(this.aClass86_Sub3_38, 3553, Class212.aClass212_18, this.method21278(), 256, 256);
		this.aClass78_Sub2_3.method17493(false, false);
		this.aClass78_Sub2_4 = new Class78_Sub2(this.aClass86_Sub3_38, 3553, Class212.aClass212_18, this.method21278(), 256, 256);
		this.aClass78_Sub2_4.method17493(false, false);
		this.aClass86_Sub3_38.method19968(this.aClass92_Sub1_Sub1_3);
		this.aClass92_Sub1_Sub1_3.method23513(0, this.aClass78_Sub2_3.method17513(0));
		this.aClass92_Sub1_Sub1_3.method23513(1, this.aClass78_Sub2_4.method17513(0));
		this.aClass92_Sub1_Sub1_3.method17580(0);
		if (!this.aClass92_Sub1_Sub1_3.method23514()) {
			this.aClass86_Sub3_38.method19972(this.aClass92_Sub1_Sub1_3);
			return false;
		}
		this.aClass86_Sub3_38.method19972(this.aClass92_Sub1_Sub1_3);
		this.aClass166_3 = Class166.method24388(this.aClass86_Sub3_38, new Class181[] { Class181.method24564(this.aClass86_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass166_4 = Class166.method24388(this.aClass86_Sub3_38, new Class181[] { Class181.method24564(this.aClass86_Sub3_38, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass166_6 = Class166.method24388(this.aClass86_Sub3_38, new Class181[] { Class181.method24564(this.aClass86_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n") });
		this.aClass166_5 = Class166.method24388(this.aClass86_Sub3_38, new Class181[] { Class181.method24564(this.aClass86_Sub3_38, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass166_4 != null && this.aClass166_3 != null && this.aClass166_6 != null && this.aClass166_5 != null;
	}

	@OriginalMember(owner = "client!aps", name = "c", descriptor = "()Z", line = 45)
	@Override
	boolean method21285() {
		if (!this.aClass86_Sub3_38.aBoolean134 || !this.aClass86_Sub3_38.aBoolean133 || !this.aClass86_Sub3_38.aBoolean142) {
			return false;
		}
		this.aClass92_Sub1_Sub1_3 = new Class92_Sub1_Sub1(this.aClass86_Sub3_38);
		this.aClass78_Sub2_3 = new Class78_Sub2(this.aClass86_Sub3_38, 3553, Class212.aClass212_18, this.method21278(), 256, 256);
		this.aClass78_Sub2_3.method17493(false, false);
		this.aClass78_Sub2_4 = new Class78_Sub2(this.aClass86_Sub3_38, 3553, Class212.aClass212_18, this.method21278(), 256, 256);
		this.aClass78_Sub2_4.method17493(false, false);
		this.aClass86_Sub3_38.method19968(this.aClass92_Sub1_Sub1_3);
		this.aClass92_Sub1_Sub1_3.method23513(0, this.aClass78_Sub2_3.method17513(0));
		this.aClass92_Sub1_Sub1_3.method23513(1, this.aClass78_Sub2_4.method17513(0));
		this.aClass92_Sub1_Sub1_3.method17580(0);
		if (!this.aClass92_Sub1_Sub1_3.method23514()) {
			this.aClass86_Sub3_38.method19972(this.aClass92_Sub1_Sub1_3);
			return false;
		}
		this.aClass86_Sub3_38.method19972(this.aClass92_Sub1_Sub1_3);
		this.aClass166_3 = Class166.method24388(this.aClass86_Sub3_38, new Class181[] { Class181.method24564(this.aClass86_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass166_4 = Class166.method24388(this.aClass86_Sub3_38, new Class181[] { Class181.method24564(this.aClass86_Sub3_38, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass166_6 = Class166.method24388(this.aClass86_Sub3_38, new Class181[] { Class181.method24564(this.aClass86_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n") });
		this.aClass166_5 = Class166.method24388(this.aClass86_Sub3_38, new Class181[] { Class181.method24564(this.aClass86_Sub3_38, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass166_4 != null && this.aClass166_3 != null && this.aClass166_6 != null && this.aClass166_5 != null;
	}

	@OriginalMember(owner = "client!aps", name = "ag", descriptor = "(II)V", line = 70)
	@Override
	void method21303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2858 = arg0;
		this.anInt2859 = arg1;
		@Pc(10) int local10 = Class462.method29538(this.anInt2858);
		@Pc(15) int local15 = Class462.method29538(this.anInt2859);
		if (this.anInt2860 == local10 && this.anInt2862 == local15) {
			return;
		}
		@Pc(28) int local28;
		if (this.aClass78_Sub2Array1 != null) {
			for (local28 = 0; local28 < this.aClass78_Sub2Array1.length; local28++) {
				this.aClass78_Sub2Array1[local28].method17466();
			}
			this.aClass78_Sub2Array1 = null;
		}
		if (local10 <= 256 && local15 <= 256) {
			this.aClass92_Sub1_Sub1_2 = null;
		} else {
			local28 = local10;
			@Pc(53) int local53 = local15;
			@Pc(55) int local55 = 0;
			label59: while (true) {
				if (local28 <= 256 && local53 <= 256) {
					if (this.aClass92_Sub1_Sub1_2 == null) {
						this.aClass92_Sub1_Sub1_2 = new Class92_Sub1_Sub1(this.aClass86_Sub3_38);
					}
					this.aClass78_Sub2Array1 = new Class78_Sub2[local55];
					local28 = local10;
					local53 = local15;
					local55 = 0;
					while (true) {
						if (local28 <= 256 && local53 <= 256) {
							break label59;
						}
						this.aClass78_Sub2Array1[local55++] = new Class78_Sub2(this.aClass86_Sub3_38, 3553, Class212.aClass212_18, this.method21278(), local28, local53);
						if (local28 > 256) {
							local28 >>= 0x1;
						}
						if (local53 > 256) {
							local53 >>= 0x1;
						}
					}
				}
				if (local28 > 256) {
					local28 >>= 0x1;
				}
				if (local53 > 256) {
					local53 >>= 0x1;
				}
				local55++;
			}
		}
		this.anInt2860 = local10;
		this.anInt2862 = local15;
	}

	@OriginalMember(owner = "client!aps", name = "al", descriptor = "(II)V", line = 70)
	@Override
	void method21308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2858 = arg0;
		this.anInt2859 = arg1;
		@Pc(10) int local10 = Class462.method29538(this.anInt2858);
		@Pc(15) int local15 = Class462.method29538(this.anInt2859);
		if (this.anInt2860 == local10 && this.anInt2862 == local15) {
			return;
		}
		@Pc(28) int local28;
		if (this.aClass78_Sub2Array1 != null) {
			for (local28 = 0; local28 < this.aClass78_Sub2Array1.length; local28++) {
				this.aClass78_Sub2Array1[local28].method17466();
			}
			this.aClass78_Sub2Array1 = null;
		}
		if (local10 <= 256 && local15 <= 256) {
			this.aClass92_Sub1_Sub1_2 = null;
		} else {
			local28 = local10;
			@Pc(53) int local53 = local15;
			@Pc(55) int local55 = 0;
			label59: while (true) {
				if (local28 <= 256 && local53 <= 256) {
					if (this.aClass92_Sub1_Sub1_2 == null) {
						this.aClass92_Sub1_Sub1_2 = new Class92_Sub1_Sub1(this.aClass86_Sub3_38);
					}
					this.aClass78_Sub2Array1 = new Class78_Sub2[local55];
					local28 = local10;
					local53 = local15;
					local55 = 0;
					while (true) {
						if (local28 <= 256 && local53 <= 256) {
							break label59;
						}
						this.aClass78_Sub2Array1[local55++] = new Class78_Sub2(this.aClass86_Sub3_38, 3553, Class212.aClass212_18, this.method21278(), local28, local53);
						if (local28 > 256) {
							local28 >>= 0x1;
						}
						if (local53 > 256) {
							local53 >>= 0x1;
						}
					}
				}
				if (local28 > 256) {
					local28 >>= 0x1;
				}
				if (local53 > 256) {
					local53 >>= 0x1;
				}
				local55++;
			}
		}
		this.anInt2860 = local10;
		this.anInt2862 = local15;
	}

	@OriginalMember(owner = "client!aps", name = "ao", descriptor = "(II)V", line = 70)
	@Override
	void method21304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2858 = arg0;
		this.anInt2859 = arg1;
		@Pc(10) int local10 = Class462.method29538(this.anInt2858);
		@Pc(15) int local15 = Class462.method29538(this.anInt2859);
		if (this.anInt2860 == local10 && this.anInt2862 == local15) {
			return;
		}
		@Pc(28) int local28;
		if (this.aClass78_Sub2Array1 != null) {
			for (local28 = 0; local28 < this.aClass78_Sub2Array1.length; local28++) {
				this.aClass78_Sub2Array1[local28].method17466();
			}
			this.aClass78_Sub2Array1 = null;
		}
		if (local10 <= 256 && local15 <= 256) {
			this.aClass92_Sub1_Sub1_2 = null;
		} else {
			local28 = local10;
			@Pc(53) int local53 = local15;
			@Pc(55) int local55 = 0;
			label59: while (true) {
				if (local28 <= 256 && local53 <= 256) {
					if (this.aClass92_Sub1_Sub1_2 == null) {
						this.aClass92_Sub1_Sub1_2 = new Class92_Sub1_Sub1(this.aClass86_Sub3_38);
					}
					this.aClass78_Sub2Array1 = new Class78_Sub2[local55];
					local28 = local10;
					local53 = local15;
					local55 = 0;
					while (true) {
						if (local28 <= 256 && local53 <= 256) {
							break label59;
						}
						this.aClass78_Sub2Array1[local55++] = new Class78_Sub2(this.aClass86_Sub3_38, 3553, Class212.aClass212_18, this.method21278(), local28, local53);
						if (local28 > 256) {
							local28 >>= 0x1;
						}
						if (local53 > 256) {
							local53 >>= 0x1;
						}
					}
				}
				if (local28 > 256) {
					local28 >>= 0x1;
				}
				if (local53 > 256) {
					local53 >>= 0x1;
				}
				local55++;
			}
		}
		this.anInt2860 = local10;
		this.anInt2862 = local15;
	}

	@OriginalMember(owner = "client!aps", name = "ak", descriptor = "(II)V", line = 70)
	@Override
	void method21305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2858 = arg0;
		this.anInt2859 = arg1;
		@Pc(10) int local10 = Class462.method29538(this.anInt2858);
		@Pc(15) int local15 = Class462.method29538(this.anInt2859);
		if (this.anInt2860 == local10 && this.anInt2862 == local15) {
			return;
		}
		@Pc(28) int local28;
		if (this.aClass78_Sub2Array1 != null) {
			for (local28 = 0; local28 < this.aClass78_Sub2Array1.length; local28++) {
				this.aClass78_Sub2Array1[local28].method17466();
			}
			this.aClass78_Sub2Array1 = null;
		}
		if (local10 <= 256 && local15 <= 256) {
			this.aClass92_Sub1_Sub1_2 = null;
		} else {
			local28 = local10;
			@Pc(53) int local53 = local15;
			@Pc(55) int local55 = 0;
			label59: while (true) {
				if (local28 <= 256 && local53 <= 256) {
					if (this.aClass92_Sub1_Sub1_2 == null) {
						this.aClass92_Sub1_Sub1_2 = new Class92_Sub1_Sub1(this.aClass86_Sub3_38);
					}
					this.aClass78_Sub2Array1 = new Class78_Sub2[local55];
					local28 = local10;
					local53 = local15;
					local55 = 0;
					while (true) {
						if (local28 <= 256 && local53 <= 256) {
							break label59;
						}
						this.aClass78_Sub2Array1[local55++] = new Class78_Sub2(this.aClass86_Sub3_38, 3553, Class212.aClass212_18, this.method21278(), local28, local53);
						if (local28 > 256) {
							local28 >>= 0x1;
						}
						if (local53 > 256) {
							local53 >>= 0x1;
						}
					}
				}
				if (local28 > 256) {
					local28 >>= 0x1;
				}
				if (local53 > 256) {
					local53 >>= 0x1;
				}
				local55++;
			}
		}
		this.anInt2860 = local10;
		this.anInt2862 = local15;
	}

	@OriginalMember(owner = "client!aps", name = "l", descriptor = "(II)V", line = 70)
	@Override
	void method21288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2858 = arg0;
		this.anInt2859 = arg1;
		@Pc(10) int local10 = Class462.method29538(this.anInt2858);
		@Pc(15) int local15 = Class462.method29538(this.anInt2859);
		if (this.anInt2860 == local10 && this.anInt2862 == local15) {
			return;
		}
		@Pc(28) int local28;
		if (this.aClass78_Sub2Array1 != null) {
			for (local28 = 0; local28 < this.aClass78_Sub2Array1.length; local28++) {
				this.aClass78_Sub2Array1[local28].method17466();
			}
			this.aClass78_Sub2Array1 = null;
		}
		if (local10 <= 256 && local15 <= 256) {
			this.aClass92_Sub1_Sub1_2 = null;
		} else {
			local28 = local10;
			@Pc(53) int local53 = local15;
			@Pc(55) int local55 = 0;
			label59: while (true) {
				if (local28 <= 256 && local53 <= 256) {
					if (this.aClass92_Sub1_Sub1_2 == null) {
						this.aClass92_Sub1_Sub1_2 = new Class92_Sub1_Sub1(this.aClass86_Sub3_38);
					}
					this.aClass78_Sub2Array1 = new Class78_Sub2[local55];
					local28 = local10;
					local53 = local15;
					local55 = 0;
					while (true) {
						if (local28 <= 256 && local53 <= 256) {
							break label59;
						}
						this.aClass78_Sub2Array1[local55++] = new Class78_Sub2(this.aClass86_Sub3_38, 3553, Class212.aClass212_18, this.method21278(), local28, local53);
						if (local28 > 256) {
							local28 >>= 0x1;
						}
						if (local53 > 256) {
							local53 >>= 0x1;
						}
					}
				}
				if (local28 > 256) {
					local28 >>= 0x1;
				}
				if (local53 > 256) {
					local53 >>= 0x1;
				}
				local55++;
			}
		}
		this.anInt2860 = local10;
		this.anInt2862 = local15;
	}

	@OriginalMember(owner = "client!aps", name = "v", descriptor = "()V", line = 106)
	@Override
	void method21311() {
		this.anInt2862 = -1;
		this.anInt2860 = -1;
		this.aClass92_Sub1_Sub1_2 = null;
		this.aClass78_Sub2Array1 = null;
		this.aClass92_Sub1_Sub1_3 = null;
		this.aClass78_Sub2_3 = null;
		this.aClass78_Sub2_4 = null;
		this.aClass166_3 = null;
		this.aClass166_4 = null;
		this.aClass166_6 = null;
		this.aClass166_5 = null;
	}

	@OriginalMember(owner = "client!aps", name = "aj", descriptor = "()V", line = 106)
	@Override
	void method21301() {
		this.anInt2862 = -1;
		this.anInt2860 = -1;
		this.aClass92_Sub1_Sub1_2 = null;
		this.aClass78_Sub2Array1 = null;
		this.aClass92_Sub1_Sub1_3 = null;
		this.aClass78_Sub2_3 = null;
		this.aClass78_Sub2_4 = null;
		this.aClass166_3 = null;
		this.aClass166_4 = null;
		this.aClass166_6 = null;
		this.aClass166_5 = null;
	}

	@OriginalMember(owner = "client!aps", name = "ai", descriptor = "()V", line = 106)
	@Override
	void method21302() {
		this.anInt2862 = -1;
		this.anInt2860 = -1;
		this.aClass92_Sub1_Sub1_2 = null;
		this.aClass78_Sub2Array1 = null;
		this.aClass92_Sub1_Sub1_3 = null;
		this.aClass78_Sub2_3 = null;
		this.aClass78_Sub2_4 = null;
		this.aClass166_3 = null;
		this.aClass166_4 = null;
		this.aClass166_6 = null;
		this.aClass166_5 = null;
	}

	@OriginalMember(owner = "client!aps", name = "y", descriptor = "(ILclient!adi;Lclient!adi;II)V", line = 120)
	@Override
	void method21312(@OriginalArg(0) int arg0, @OriginalArg(1) Class78_Sub2 arg1, @OriginalArg(2) Class78_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(26) int local26;
		@Pc(31) int local31;
		if (this.aClass78_Sub2Array1 == null) {
			this.aClass86_Sub3_38.method6195(arg1);
			this.aClass86_Sub3_38.method19968(this.aClass92_Sub1_Sub1_3);
			this.aClass92_Sub1_Sub1_3.method17580(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local26 = this.aClass166_3.anInt3284;
			OpenGL.glUseProgram(local26);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local26, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local26, "params"), aFloat212, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt2858, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt2858, (float) this.anInt2859);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt2859);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			this.aClass86_Sub3_38.method19968(this.aClass92_Sub1_Sub1_2);
			local26 = Class462.method29538(this.anInt2858);
			local31 = Class462.method29538(this.anInt2859);
			@Pc(33) int local33 = 0;
			while (local26 > 256 || local31 > 256) {
				OpenGL.glViewport(0, 0, local26, local31);
				this.aClass92_Sub1_Sub1_2.method23513(0, this.aClass78_Sub2Array1[local33].method17513(0));
				if (local33 == 0) {
					this.aClass86_Sub3_38.method6195(arg1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) (this.anInt2859 - arg3));
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) arg4, (float) (this.anInt2859 - arg3));
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) arg4, (float) this.anInt2859);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt2859);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					this.aClass86_Sub3_38.method6195(this.aClass78_Sub2Array1[local33 - 1]);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(1.0F, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f(1.0F, 1.0F);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, 1.0F);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				}
				if (local26 > 256) {
					local26 >>= 0x1;
				}
				if (local31 > 256) {
					local31 >>= 0x1;
				}
				local33++;
			}
			this.aClass86_Sub3_38.method19972(this.aClass92_Sub1_Sub1_2);
			this.aClass86_Sub3_38.method6195(this.aClass78_Sub2Array1[local33 - 1]);
			this.aClass86_Sub3_38.method19968(this.aClass92_Sub1_Sub1_3);
			this.aClass92_Sub1_Sub1_3.method17580(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(192) int local192 = this.aClass166_4.anInt3284;
			OpenGL.glUseProgram(local192);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local192, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local192, "params"), aFloat212, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f(1.0F, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f(1.0F, 1.0F);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, 1.0F);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		}
		this.aClass92_Sub1_Sub1_3.method17580(1);
		this.aClass86_Sub3_38.method6195(this.aClass78_Sub2_3);
		local26 = this.aClass166_5.anInt3284;
		OpenGL.glUseProgram(local26);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local26, "baseTex"), 0);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local26, "step"), 0.00390625F, 0.0F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		this.aClass92_Sub1_Sub1_3.method17580(0);
		this.aClass86_Sub3_38.method6195(this.aClass78_Sub2_4);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local26, "step"), 0.0F, 0.00390625F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		OpenGL.glPopAttrib();
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
		this.aClass86_Sub3_38.method19972(this.aClass92_Sub1_Sub1_3);
		local31 = this.aClass166_6.anInt3284;
		OpenGL.glUseProgram(local31);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local31, "sceneTex"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local31, "bloomTex"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local31, "params"), aFloat210, aFloat211, 0.0F);
		this.aClass86_Sub3_38.method6190(1);
		this.aClass86_Sub3_38.method6195(this.aClass78_Sub2_3);
		this.aClass86_Sub3_38.method6190(0);
		this.aClass86_Sub3_38.method6195(arg1);
	}

	@OriginalMember(owner = "client!aps", name = "ap", descriptor = "(ILclient!adi;Lclient!adi;II)V", line = 120)
	@Override
	void method21315(@OriginalArg(1) Class78_Sub2 arg0, @OriginalArg(2) Class78_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(26) int local26;
		@Pc(31) int local31;
		if (this.aClass78_Sub2Array1 == null) {
			this.aClass86_Sub3_38.method6195(arg0);
			this.aClass86_Sub3_38.method19968(this.aClass92_Sub1_Sub1_3);
			this.aClass92_Sub1_Sub1_3.method17580(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local26 = this.aClass166_3.anInt3284;
			OpenGL.glUseProgram(local26);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local26, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local26, "params"), aFloat212, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt2858, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt2858, (float) this.anInt2859);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt2859);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			this.aClass86_Sub3_38.method19968(this.aClass92_Sub1_Sub1_2);
			local26 = Class462.method29538(this.anInt2858);
			local31 = Class462.method29538(this.anInt2859);
			@Pc(33) int local33 = 0;
			while (local26 > 256 || local31 > 256) {
				OpenGL.glViewport(0, 0, local26, local31);
				this.aClass92_Sub1_Sub1_2.method23513(0, this.aClass78_Sub2Array1[local33].method17513(0));
				if (local33 == 0) {
					this.aClass86_Sub3_38.method6195(arg0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) (this.anInt2859 - arg2));
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) arg3, (float) (this.anInt2859 - arg2));
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) arg3, (float) this.anInt2859);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt2859);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					this.aClass86_Sub3_38.method6195(this.aClass78_Sub2Array1[local33 - 1]);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(1.0F, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f(1.0F, 1.0F);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, 1.0F);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				}
				if (local26 > 256) {
					local26 >>= 0x1;
				}
				if (local31 > 256) {
					local31 >>= 0x1;
				}
				local33++;
			}
			this.aClass86_Sub3_38.method19972(this.aClass92_Sub1_Sub1_2);
			this.aClass86_Sub3_38.method6195(this.aClass78_Sub2Array1[local33 - 1]);
			this.aClass86_Sub3_38.method19968(this.aClass92_Sub1_Sub1_3);
			this.aClass92_Sub1_Sub1_3.method17580(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(192) int local192 = this.aClass166_4.anInt3284;
			OpenGL.glUseProgram(local192);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local192, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local192, "params"), aFloat212, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f(1.0F, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f(1.0F, 1.0F);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, 1.0F);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		}
		this.aClass92_Sub1_Sub1_3.method17580(1);
		this.aClass86_Sub3_38.method6195(this.aClass78_Sub2_3);
		local26 = this.aClass166_5.anInt3284;
		OpenGL.glUseProgram(local26);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local26, "baseTex"), 0);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local26, "step"), 0.00390625F, 0.0F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		this.aClass92_Sub1_Sub1_3.method17580(0);
		this.aClass86_Sub3_38.method6195(this.aClass78_Sub2_4);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local26, "step"), 0.0F, 0.00390625F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		OpenGL.glPopAttrib();
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
		this.aClass86_Sub3_38.method19972(this.aClass92_Sub1_Sub1_3);
		local31 = this.aClass166_6.anInt3284;
		OpenGL.glUseProgram(local31);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local31, "sceneTex"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local31, "bloomTex"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local31, "params"), aFloat210, aFloat211, 0.0F);
		this.aClass86_Sub3_38.method6190(1);
		this.aClass86_Sub3_38.method6195(this.aClass78_Sub2_3);
		this.aClass86_Sub3_38.method6190(0);
		this.aClass86_Sub3_38.method6195(arg0);
	}

	@OriginalMember(owner = "client!aps", name = "aw", descriptor = "(ILclient!adi;Lclient!adi;II)V", line = 120)
	@Override
	void method21291(@OriginalArg(1) Class78_Sub2 arg0, @OriginalArg(2) Class78_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(26) int local26;
		@Pc(31) int local31;
		if (this.aClass78_Sub2Array1 == null) {
			this.aClass86_Sub3_38.method6195(arg0);
			this.aClass86_Sub3_38.method19968(this.aClass92_Sub1_Sub1_3);
			this.aClass92_Sub1_Sub1_3.method17580(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local26 = this.aClass166_3.anInt3284;
			OpenGL.glUseProgram(local26);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local26, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local26, "params"), aFloat212, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt2858, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt2858, (float) this.anInt2859);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt2859);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			this.aClass86_Sub3_38.method19968(this.aClass92_Sub1_Sub1_2);
			local26 = Class462.method29538(this.anInt2858);
			local31 = Class462.method29538(this.anInt2859);
			@Pc(33) int local33 = 0;
			while (local26 > 256 || local31 > 256) {
				OpenGL.glViewport(0, 0, local26, local31);
				this.aClass92_Sub1_Sub1_2.method23513(0, this.aClass78_Sub2Array1[local33].method17513(0));
				if (local33 == 0) {
					this.aClass86_Sub3_38.method6195(arg0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) (this.anInt2859 - arg2));
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) arg3, (float) (this.anInt2859 - arg2));
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) arg3, (float) this.anInt2859);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt2859);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					this.aClass86_Sub3_38.method6195(this.aClass78_Sub2Array1[local33 - 1]);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(1.0F, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f(1.0F, 1.0F);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, 1.0F);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				}
				if (local26 > 256) {
					local26 >>= 0x1;
				}
				if (local31 > 256) {
					local31 >>= 0x1;
				}
				local33++;
			}
			this.aClass86_Sub3_38.method19972(this.aClass92_Sub1_Sub1_2);
			this.aClass86_Sub3_38.method6195(this.aClass78_Sub2Array1[local33 - 1]);
			this.aClass86_Sub3_38.method19968(this.aClass92_Sub1_Sub1_3);
			this.aClass92_Sub1_Sub1_3.method17580(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(192) int local192 = this.aClass166_4.anInt3284;
			OpenGL.glUseProgram(local192);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local192, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local192, "params"), aFloat212, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f(1.0F, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f(1.0F, 1.0F);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, 1.0F);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		}
		this.aClass92_Sub1_Sub1_3.method17580(1);
		this.aClass86_Sub3_38.method6195(this.aClass78_Sub2_3);
		local26 = this.aClass166_5.anInt3284;
		OpenGL.glUseProgram(local26);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local26, "baseTex"), 0);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local26, "step"), 0.00390625F, 0.0F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		this.aClass92_Sub1_Sub1_3.method17580(0);
		this.aClass86_Sub3_38.method6195(this.aClass78_Sub2_4);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local26, "step"), 0.0F, 0.00390625F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		OpenGL.glPopAttrib();
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
		this.aClass86_Sub3_38.method19972(this.aClass92_Sub1_Sub1_3);
		local31 = this.aClass166_6.anInt3284;
		OpenGL.glUseProgram(local31);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local31, "sceneTex"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local31, "bloomTex"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local31, "params"), aFloat210, aFloat211, 0.0F);
		this.aClass86_Sub3_38.method6190(1);
		this.aClass86_Sub3_38.method6195(this.aClass78_Sub2_3);
		this.aClass86_Sub3_38.method6190(0);
		this.aClass86_Sub3_38.method6195(arg0);
	}

	@OriginalMember(owner = "client!aps", name = "az", descriptor = "(ILclient!adi;Lclient!adi;II)V", line = 120)
	@Override
	void method21317(@OriginalArg(1) Class78_Sub2 arg0, @OriginalArg(2) Class78_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(26) int local26;
		@Pc(31) int local31;
		if (this.aClass78_Sub2Array1 == null) {
			this.aClass86_Sub3_38.method6195(arg0);
			this.aClass86_Sub3_38.method19968(this.aClass92_Sub1_Sub1_3);
			this.aClass92_Sub1_Sub1_3.method17580(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local26 = this.aClass166_3.anInt3284;
			OpenGL.glUseProgram(local26);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local26, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local26, "params"), aFloat212, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt2858, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt2858, (float) this.anInt2859);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt2859);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			this.aClass86_Sub3_38.method19968(this.aClass92_Sub1_Sub1_2);
			local26 = Class462.method29538(this.anInt2858);
			local31 = Class462.method29538(this.anInt2859);
			@Pc(33) int local33 = 0;
			while (local26 > 256 || local31 > 256) {
				OpenGL.glViewport(0, 0, local26, local31);
				this.aClass92_Sub1_Sub1_2.method23513(0, this.aClass78_Sub2Array1[local33].method17513(0));
				if (local33 == 0) {
					this.aClass86_Sub3_38.method6195(arg0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) (this.anInt2859 - arg2));
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) arg3, (float) (this.anInt2859 - arg2));
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) arg3, (float) this.anInt2859);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt2859);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					this.aClass86_Sub3_38.method6195(this.aClass78_Sub2Array1[local33 - 1]);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(1.0F, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f(1.0F, 1.0F);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, 1.0F);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				}
				if (local26 > 256) {
					local26 >>= 0x1;
				}
				if (local31 > 256) {
					local31 >>= 0x1;
				}
				local33++;
			}
			this.aClass86_Sub3_38.method19972(this.aClass92_Sub1_Sub1_2);
			this.aClass86_Sub3_38.method6195(this.aClass78_Sub2Array1[local33 - 1]);
			this.aClass86_Sub3_38.method19968(this.aClass92_Sub1_Sub1_3);
			this.aClass92_Sub1_Sub1_3.method17580(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(192) int local192 = this.aClass166_4.anInt3284;
			OpenGL.glUseProgram(local192);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local192, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local192, "params"), aFloat212, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f(1.0F, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f(1.0F, 1.0F);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, 1.0F);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		}
		this.aClass92_Sub1_Sub1_3.method17580(1);
		this.aClass86_Sub3_38.method6195(this.aClass78_Sub2_3);
		local26 = this.aClass166_5.anInt3284;
		OpenGL.glUseProgram(local26);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local26, "baseTex"), 0);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local26, "step"), 0.00390625F, 0.0F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		this.aClass92_Sub1_Sub1_3.method17580(0);
		this.aClass86_Sub3_38.method6195(this.aClass78_Sub2_4);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local26, "step"), 0.0F, 0.00390625F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		OpenGL.glPopAttrib();
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
		this.aClass86_Sub3_38.method19972(this.aClass92_Sub1_Sub1_3);
		local31 = this.aClass166_6.anInt3284;
		OpenGL.glUseProgram(local31);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local31, "sceneTex"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local31, "bloomTex"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local31, "params"), aFloat210, aFloat211, 0.0F);
		this.aClass86_Sub3_38.method6190(1);
		this.aClass86_Sub3_38.method6195(this.aClass78_Sub2_3);
		this.aClass86_Sub3_38.method6190(0);
		this.aClass86_Sub3_38.method6195(arg0);
	}

	@OriginalMember(owner = "client!aps", name = "au", descriptor = "(I)V", line = 248)
	@Override
	void method21306() {
		OpenGL.glUseProgram(0);
		this.aClass86_Sub3_38.method6190(1);
		this.aClass86_Sub3_38.method6195(null);
		this.aClass86_Sub3_38.method6190(0);
	}

	@OriginalMember(owner = "client!aps", name = "w", descriptor = "(I)V", line = 248)
	@Override
	void method21289(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgram(0);
		this.aClass86_Sub3_38.method6190(1);
		this.aClass86_Sub3_38.method6195(null);
		this.aClass86_Sub3_38.method6190(0);
	}

	@OriginalMember(owner = "client!aps", name = "as", descriptor = "()Lclient!dl;", line = 255)
	@Override
	Class206 method21280() {
		return Class206.aClass206_25;
	}

	@OriginalMember(owner = "client!aps", name = "d", descriptor = "()Lclient!dl;", line = 255)
	@Override
	Class206 method21278() {
		return Class206.aClass206_25;
	}

	@OriginalMember(owner = "client!aps", name = "ay", descriptor = "()Lclient!dl;", line = 255)
	@Override
	Class206 method21282() {
		return Class206.aClass206_25;
	}

	@OriginalMember(owner = "client!aps", name = "am", descriptor = "()Lclient!dl;", line = 255)
	@Override
	Class206 method21281() {
		return Class206.aClass206_25;
	}

	@OriginalMember(owner = "client!aps", name = "aq", descriptor = "()Lclient!dl;", line = 255)
	@Override
	Class206 method21279() {
		return Class206.aClass206_25;
	}

	@OriginalMember(owner = "client!aps", name = "av", descriptor = "()I", line = 259)
	@Override
	int method21310() {
		return 0;
	}

	@OriginalMember(owner = "client!aps", name = "q", descriptor = "()I", line = 259)
	@Override
	int method21292() {
		return 0;
	}

	@OriginalMember(owner = "client!aps", name = "ad", descriptor = "()I", line = 259)
	@Override
	int method21293() {
		return 0;
	}

	@OriginalMember(owner = "client!aps", name = "ar", descriptor = "()I", line = 259)
	@Override
	int method21307() {
		return 0;
	}

	@OriginalMember(owner = "client!aps", name = "ac", descriptor = "()I", line = 259)
	@Override
	int method21309() {
		return 0;
	}

	@OriginalMember(owner = "client!aps", name = "r", descriptor = "()Z", line = 263)
	@Override
	boolean method21294() {
		return false;
	}

	@OriginalMember(owner = "client!aps", name = "ab", descriptor = "()Z", line = 263)
	@Override
	boolean method21313() {
		return false;
	}

	@OriginalMember(owner = "client!aps", name = "aa", descriptor = "()Z", line = 263)
	@Override
	boolean method21314() {
		return false;
	}

	@OriginalMember(owner = "client!aps", name = "an", descriptor = "()Z", line = 263)
	@Override
	boolean method21290() {
		return false;
	}
}
