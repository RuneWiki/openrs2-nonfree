package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!alx")
public class Class3_Sub9_Sub2 extends Class3_Sub9 {

	@OriginalMember(owner = "client!alx", name = "c", descriptor = "Ljava/lang/String;")
	static final String aString96 = "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n";

	@OriginalMember(owner = "client!alx", name = "b", descriptor = "Ljava/lang/String;")
	static final String aString97 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n";

	@OriginalMember(owner = "client!alx", name = "z", descriptor = "Ljava/lang/String;")
	static final String aString98 = "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n";

	@OriginalMember(owner = "client!alx", name = "j", descriptor = "Ljava/lang/String;")
	static final String aString99 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n";

	@OriginalMember(owner = "client!alx", name = "x", descriptor = "I")
	static final int anInt2618 = 256;

	@OriginalMember(owner = "client!alx", name = "s", descriptor = "F")
	static float aFloat203 = 0.25F;

	@OriginalMember(owner = "client!alx", name = "u", descriptor = "F")
	static float aFloat204 = 1.0F;

	@OriginalMember(owner = "client!alx", name = "y", descriptor = "F")
	static float aFloat202 = 1.0F;

	@OriginalMember(owner = "client!alx", name = "o", descriptor = "Lclient!bs;")
	Class100 aClass100_3;

	@OriginalMember(owner = "client!alx", name = "m", descriptor = "I")
	int anInt2615;

	@OriginalMember(owner = "client!alx", name = "n", descriptor = "Lclient!aky;")
	Class19_Sub1_Sub3 aClass19_Sub1_Sub3_2;

	@OriginalMember(owner = "client!alx", name = "e", descriptor = "Lclient!aky;")
	Class19_Sub1_Sub3 aClass19_Sub1_Sub3_3;

	@OriginalMember(owner = "client!alx", name = "r", descriptor = "Lclient!aab;")
	Class4_Sub1 aClass4_Sub1_3;

	@OriginalMember(owner = "client!alx", name = "d", descriptor = "Lclient!aab;")
	Class4_Sub1 aClass4_Sub1_4;

	@OriginalMember(owner = "client!alx", name = "q", descriptor = "[Lclient!aab;")
	Class4_Sub1[] aClass4_Sub1Array1;

	@OriginalMember(owner = "client!alx", name = "i", descriptor = "Lclient!bs;")
	Class100 aClass100_4;

	@OriginalMember(owner = "client!alx", name = "v", descriptor = "I")
	int anInt2616;

	@OriginalMember(owner = "client!alx", name = "w", descriptor = "I")
	int anInt2617;

	@OriginalMember(owner = "client!alx", name = "t", descriptor = "I")
	int anInt2619;

	@OriginalMember(owner = "client!alx", name = "f", descriptor = "Lclient!bs;")
	Class100 aClass100_5;

	@OriginalMember(owner = "client!alx", name = "k", descriptor = "Lclient!bs;")
	Class100 aClass100_6;

	@OriginalMember(owner = "client!alx", name = "<init>", descriptor = "(Lclient!abt;)V", line = 33)
	Class3_Sub9_Sub2(@OriginalArg(0) Class21_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!alx", name = "bd", descriptor = "()Z", line = 37)
	boolean method18569() {
		return this.aClass21_Sub2_37.aBoolean77 && this.aClass21_Sub2_37.aBoolean89 && this.aClass21_Sub2_37.aBoolean60;
	}

	@OriginalMember(owner = "client!alx", name = "bw", descriptor = "()Z", line = 37)
	boolean method18570() {
		return this.aClass21_Sub2_37.aBoolean77 && this.aClass21_Sub2_37.aBoolean89 && this.aClass21_Sub2_37.aBoolean60;
	}

	@OriginalMember(owner = "client!alx", name = "ac", descriptor = "()Z", line = 37)
	boolean method18571() {
		return this.aClass21_Sub2_37.aBoolean77 && this.aClass21_Sub2_37.aBoolean89 && this.aClass21_Sub2_37.aBoolean60;
	}

	@OriginalMember(owner = "client!alx", name = "bp", descriptor = "()Z", line = 37)
	boolean method18572() {
		return this.aClass21_Sub2_37.aBoolean77 && this.aClass21_Sub2_37.aBoolean89 && this.aClass21_Sub2_37.aBoolean60;
	}

	@OriginalMember(owner = "client!alx", name = "p", descriptor = "()Z", line = 41)
	@Override
	boolean method18586() {
		return this.aClass19_Sub1_Sub3_2 != null;
	}

	@OriginalMember(owner = "client!alx", name = "j", descriptor = "()Z", line = 41)
	@Override
	boolean method18598() {
		return this.aClass19_Sub1_Sub3_2 != null;
	}

	@OriginalMember(owner = "client!alx", name = "n", descriptor = "()Z", line = 41)
	@Override
	boolean method18624() {
		return this.aClass19_Sub1_Sub3_2 != null;
	}

	@OriginalMember(owner = "client!alx", name = "a", descriptor = "()Z", line = 45)
	@Override
	boolean method18605() {
		if (!this.aClass21_Sub2_37.aBoolean77 || !this.aClass21_Sub2_37.aBoolean89 || !this.aClass21_Sub2_37.aBoolean60) {
			return false;
		}
		this.aClass19_Sub1_Sub3_2 = new Class19_Sub1_Sub3(this.aClass21_Sub2_37);
		this.aClass4_Sub1_3 = new Class4_Sub1(this.aClass21_Sub2_37, 3553, Class121.aClass121_17, this.method18625(), 256, 256);
		this.aClass4_Sub1_3.method14074(false, false);
		this.aClass4_Sub1_4 = new Class4_Sub1(this.aClass21_Sub2_37, 3553, Class121.aClass121_17, this.method18625(), 256, 256);
		this.aClass4_Sub1_4.method14074(false, false);
		this.aClass21_Sub2_37.method17044(this.aClass19_Sub1_Sub3_2);
		this.aClass19_Sub1_Sub3_2.method20882(0, this.aClass4_Sub1_3.method14078(0));
		this.aClass19_Sub1_Sub3_2.method20882(1, this.aClass4_Sub1_4.method14078(0));
		this.aClass19_Sub1_Sub3_2.method17949(0);
		if (!this.aClass19_Sub1_Sub3_2.method20883()) {
			this.aClass21_Sub2_37.method17263(this.aClass19_Sub1_Sub3_2);
			return false;
		}
		this.aClass21_Sub2_37.method17263(this.aClass19_Sub1_Sub3_2);
		this.aClass100_6 = Class100.method21834(this.aClass21_Sub2_37, new Class101[] { Class101.method21836(this.aClass21_Sub2_37, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass100_5 = Class100.method21834(this.aClass21_Sub2_37, new Class101[] { Class101.method21836(this.aClass21_Sub2_37, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass100_4 = Class100.method21834(this.aClass21_Sub2_37, new Class101[] { Class101.method21836(this.aClass21_Sub2_37, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n") });
		this.aClass100_3 = Class100.method21834(this.aClass21_Sub2_37, new Class101[] { Class101.method21836(this.aClass21_Sub2_37, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass100_5 != null && this.aClass100_6 != null && this.aClass100_4 != null && this.aClass100_3 != null;
	}

	@OriginalMember(owner = "client!alx", name = "i", descriptor = "()Z", line = 45)
	@Override
	boolean method18600() {
		if (!this.aClass21_Sub2_37.aBoolean77 || !this.aClass21_Sub2_37.aBoolean89 || !this.aClass21_Sub2_37.aBoolean60) {
			return false;
		}
		this.aClass19_Sub1_Sub3_2 = new Class19_Sub1_Sub3(this.aClass21_Sub2_37);
		this.aClass4_Sub1_3 = new Class4_Sub1(this.aClass21_Sub2_37, 3553, Class121.aClass121_17, this.method18625(), 256, 256);
		this.aClass4_Sub1_3.method14074(false, false);
		this.aClass4_Sub1_4 = new Class4_Sub1(this.aClass21_Sub2_37, 3553, Class121.aClass121_17, this.method18625(), 256, 256);
		this.aClass4_Sub1_4.method14074(false, false);
		this.aClass21_Sub2_37.method17044(this.aClass19_Sub1_Sub3_2);
		this.aClass19_Sub1_Sub3_2.method20882(0, this.aClass4_Sub1_3.method14078(0));
		this.aClass19_Sub1_Sub3_2.method20882(1, this.aClass4_Sub1_4.method14078(0));
		this.aClass19_Sub1_Sub3_2.method17949(0);
		if (!this.aClass19_Sub1_Sub3_2.method20883()) {
			this.aClass21_Sub2_37.method17263(this.aClass19_Sub1_Sub3_2);
			return false;
		}
		this.aClass21_Sub2_37.method17263(this.aClass19_Sub1_Sub3_2);
		this.aClass100_6 = Class100.method21834(this.aClass21_Sub2_37, new Class101[] { Class101.method21836(this.aClass21_Sub2_37, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass100_5 = Class100.method21834(this.aClass21_Sub2_37, new Class101[] { Class101.method21836(this.aClass21_Sub2_37, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass100_4 = Class100.method21834(this.aClass21_Sub2_37, new Class101[] { Class101.method21836(this.aClass21_Sub2_37, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n") });
		this.aClass100_3 = Class100.method21834(this.aClass21_Sub2_37, new Class101[] { Class101.method21836(this.aClass21_Sub2_37, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass100_5 != null && this.aClass100_6 != null && this.aClass100_4 != null && this.aClass100_3 != null;
	}

	@OriginalMember(owner = "client!alx", name = "f", descriptor = "()Z", line = 45)
	@Override
	boolean method18601() {
		if (!this.aClass21_Sub2_37.aBoolean77 || !this.aClass21_Sub2_37.aBoolean89 || !this.aClass21_Sub2_37.aBoolean60) {
			return false;
		}
		this.aClass19_Sub1_Sub3_2 = new Class19_Sub1_Sub3(this.aClass21_Sub2_37);
		this.aClass4_Sub1_3 = new Class4_Sub1(this.aClass21_Sub2_37, 3553, Class121.aClass121_17, this.method18625(), 256, 256);
		this.aClass4_Sub1_3.method14074(false, false);
		this.aClass4_Sub1_4 = new Class4_Sub1(this.aClass21_Sub2_37, 3553, Class121.aClass121_17, this.method18625(), 256, 256);
		this.aClass4_Sub1_4.method14074(false, false);
		this.aClass21_Sub2_37.method17044(this.aClass19_Sub1_Sub3_2);
		this.aClass19_Sub1_Sub3_2.method20882(0, this.aClass4_Sub1_3.method14078(0));
		this.aClass19_Sub1_Sub3_2.method20882(1, this.aClass4_Sub1_4.method14078(0));
		this.aClass19_Sub1_Sub3_2.method17949(0);
		if (!this.aClass19_Sub1_Sub3_2.method20883()) {
			this.aClass21_Sub2_37.method17263(this.aClass19_Sub1_Sub3_2);
			return false;
		}
		this.aClass21_Sub2_37.method17263(this.aClass19_Sub1_Sub3_2);
		this.aClass100_6 = Class100.method21834(this.aClass21_Sub2_37, new Class101[] { Class101.method21836(this.aClass21_Sub2_37, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass100_5 = Class100.method21834(this.aClass21_Sub2_37, new Class101[] { Class101.method21836(this.aClass21_Sub2_37, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass100_4 = Class100.method21834(this.aClass21_Sub2_37, new Class101[] { Class101.method21836(this.aClass21_Sub2_37, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n") });
		this.aClass100_3 = Class100.method21834(this.aClass21_Sub2_37, new Class101[] { Class101.method21836(this.aClass21_Sub2_37, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass100_5 != null && this.aClass100_6 != null && this.aClass100_4 != null && this.aClass100_3 != null;
	}

	@OriginalMember(owner = "client!alx", name = "k", descriptor = "()Z", line = 45)
	@Override
	boolean method18602() {
		if (!this.aClass21_Sub2_37.aBoolean77 || !this.aClass21_Sub2_37.aBoolean89 || !this.aClass21_Sub2_37.aBoolean60) {
			return false;
		}
		this.aClass19_Sub1_Sub3_2 = new Class19_Sub1_Sub3(this.aClass21_Sub2_37);
		this.aClass4_Sub1_3 = new Class4_Sub1(this.aClass21_Sub2_37, 3553, Class121.aClass121_17, this.method18625(), 256, 256);
		this.aClass4_Sub1_3.method14074(false, false);
		this.aClass4_Sub1_4 = new Class4_Sub1(this.aClass21_Sub2_37, 3553, Class121.aClass121_17, this.method18625(), 256, 256);
		this.aClass4_Sub1_4.method14074(false, false);
		this.aClass21_Sub2_37.method17044(this.aClass19_Sub1_Sub3_2);
		this.aClass19_Sub1_Sub3_2.method20882(0, this.aClass4_Sub1_3.method14078(0));
		this.aClass19_Sub1_Sub3_2.method20882(1, this.aClass4_Sub1_4.method14078(0));
		this.aClass19_Sub1_Sub3_2.method17949(0);
		if (!this.aClass19_Sub1_Sub3_2.method20883()) {
			this.aClass21_Sub2_37.method17263(this.aClass19_Sub1_Sub3_2);
			return false;
		}
		this.aClass21_Sub2_37.method17263(this.aClass19_Sub1_Sub3_2);
		this.aClass100_6 = Class100.method21834(this.aClass21_Sub2_37, new Class101[] { Class101.method21836(this.aClass21_Sub2_37, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass100_5 = Class100.method21834(this.aClass21_Sub2_37, new Class101[] { Class101.method21836(this.aClass21_Sub2_37, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass100_4 = Class100.method21834(this.aClass21_Sub2_37, new Class101[] { Class101.method21836(this.aClass21_Sub2_37, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n") });
		this.aClass100_3 = Class100.method21834(this.aClass21_Sub2_37, new Class101[] { Class101.method21836(this.aClass21_Sub2_37, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass100_5 != null && this.aClass100_6 != null && this.aClass100_4 != null && this.aClass100_3 != null;
	}

	@OriginalMember(owner = "client!alx", name = "l", descriptor = "(II)V", line = 70)
	@Override
	void method18613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2615 = arg0;
		this.anInt2616 = arg1;
		@Pc(10) int local10 = Class525.method32379(this.anInt2615);
		@Pc(15) int local15 = Class525.method32379(this.anInt2616);
		if (this.anInt2619 == local10 && this.anInt2617 == local15) {
			return;
		}
		@Pc(28) int local28;
		if (this.aClass4_Sub1Array1 != null) {
			for (local28 = 0; local28 < this.aClass4_Sub1Array1.length; local28++) {
				this.aClass4_Sub1Array1[local28].method33739();
			}
			this.aClass4_Sub1Array1 = null;
		}
		if (local10 <= 256 && local15 <= 256) {
			this.aClass19_Sub1_Sub3_3 = null;
		} else {
			local28 = local10;
			@Pc(53) int local53 = local15;
			@Pc(55) int local55 = 0;
			label59: while (true) {
				if (local28 <= 256 && local53 <= 256) {
					if (this.aClass19_Sub1_Sub3_3 == null) {
						this.aClass19_Sub1_Sub3_3 = new Class19_Sub1_Sub3(this.aClass21_Sub2_37);
					}
					this.aClass4_Sub1Array1 = new Class4_Sub1[local55];
					local28 = local10;
					local53 = local15;
					local55 = 0;
					while (true) {
						if (local28 <= 256 && local53 <= 256) {
							break label59;
						}
						this.aClass4_Sub1Array1[local55++] = new Class4_Sub1(this.aClass21_Sub2_37, 3553, Class121.aClass121_17, this.method18625(), local28, local53);
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
		this.anInt2619 = local10;
		this.anInt2617 = local15;
	}

	@OriginalMember(owner = "client!alx", name = "ah", descriptor = "(II)V", line = 70)
	@Override
	void method18606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2615 = arg0;
		this.anInt2616 = arg1;
		@Pc(10) int local10 = Class525.method32379(this.anInt2615);
		@Pc(15) int local15 = Class525.method32379(this.anInt2616);
		if (this.anInt2619 == local10 && this.anInt2617 == local15) {
			return;
		}
		@Pc(28) int local28;
		if (this.aClass4_Sub1Array1 != null) {
			for (local28 = 0; local28 < this.aClass4_Sub1Array1.length; local28++) {
				this.aClass4_Sub1Array1[local28].method33739();
			}
			this.aClass4_Sub1Array1 = null;
		}
		if (local10 <= 256 && local15 <= 256) {
			this.aClass19_Sub1_Sub3_3 = null;
		} else {
			local28 = local10;
			@Pc(53) int local53 = local15;
			@Pc(55) int local55 = 0;
			label59: while (true) {
				if (local28 <= 256 && local53 <= 256) {
					if (this.aClass19_Sub1_Sub3_3 == null) {
						this.aClass19_Sub1_Sub3_3 = new Class19_Sub1_Sub3(this.aClass21_Sub2_37);
					}
					this.aClass4_Sub1Array1 = new Class4_Sub1[local55];
					local28 = local10;
					local53 = local15;
					local55 = 0;
					while (true) {
						if (local28 <= 256 && local53 <= 256) {
							break label59;
						}
						this.aClass4_Sub1Array1[local55++] = new Class4_Sub1(this.aClass21_Sub2_37, 3553, Class121.aClass121_17, this.method18625(), local28, local53);
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
		this.anInt2619 = local10;
		this.anInt2617 = local15;
	}

	@OriginalMember(owner = "client!alx", name = "g", descriptor = "()V", line = 106)
	@Override
	void method18588() {
		this.anInt2617 = -1;
		this.anInt2619 = -1;
		this.aClass19_Sub1_Sub3_3 = null;
		this.aClass4_Sub1Array1 = null;
		this.aClass19_Sub1_Sub3_2 = null;
		this.aClass4_Sub1_3 = null;
		this.aClass4_Sub1_4 = null;
		this.aClass100_6 = null;
		this.aClass100_5 = null;
		this.aClass100_4 = null;
		this.aClass100_3 = null;
	}

	@OriginalMember(owner = "client!alx", name = "at", descriptor = "()V", line = 106)
	@Override
	void method18603() {
		this.anInt2617 = -1;
		this.anInt2619 = -1;
		this.aClass19_Sub1_Sub3_3 = null;
		this.aClass4_Sub1Array1 = null;
		this.aClass19_Sub1_Sub3_2 = null;
		this.aClass4_Sub1_3 = null;
		this.aClass4_Sub1_4 = null;
		this.aClass100_6 = null;
		this.aClass100_5 = null;
		this.aClass100_4 = null;
		this.aClass100_3 = null;
	}

	@OriginalMember(owner = "client!alx", name = "af", descriptor = "()V", line = 106)
	@Override
	void method18608() {
		this.anInt2617 = -1;
		this.anInt2619 = -1;
		this.aClass19_Sub1_Sub3_3 = null;
		this.aClass4_Sub1Array1 = null;
		this.aClass19_Sub1_Sub3_2 = null;
		this.aClass4_Sub1_3 = null;
		this.aClass4_Sub1_4 = null;
		this.aClass100_6 = null;
		this.aClass100_5 = null;
		this.aClass100_4 = null;
		this.aClass100_3 = null;
	}

	@OriginalMember(owner = "client!alx", name = "ak", descriptor = "()V", line = 106)
	@Override
	void method18589() {
		this.anInt2617 = -1;
		this.anInt2619 = -1;
		this.aClass19_Sub1_Sub3_3 = null;
		this.aClass4_Sub1Array1 = null;
		this.aClass19_Sub1_Sub3_2 = null;
		this.aClass4_Sub1_3 = null;
		this.aClass4_Sub1_4 = null;
		this.aClass100_6 = null;
		this.aClass100_5 = null;
		this.aClass100_4 = null;
		this.aClass100_3 = null;
	}

	@OriginalMember(owner = "client!alx", name = "aa", descriptor = "()V", line = 106)
	@Override
	void method18599() {
		this.anInt2617 = -1;
		this.anInt2619 = -1;
		this.aClass19_Sub1_Sub3_3 = null;
		this.aClass4_Sub1Array1 = null;
		this.aClass19_Sub1_Sub3_2 = null;
		this.aClass4_Sub1_3 = null;
		this.aClass4_Sub1_4 = null;
		this.aClass100_6 = null;
		this.aClass100_5 = null;
		this.aClass100_4 = null;
		this.aClass100_3 = null;
	}

	@OriginalMember(owner = "client!alx", name = "an", descriptor = "(ILclient!aab;Lclient!aab;)V", line = 120)
	@Override
	void method18607(@OriginalArg(1) Class4_Sub1 arg0, @OriginalArg(2) Class4_Sub1 arg1) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(26) int local26;
		@Pc(31) int local31;
		if (this.aClass4_Sub1Array1 == null) {
			this.aClass21_Sub2_37.method4074(arg0);
			this.aClass21_Sub2_37.method17044(this.aClass19_Sub1_Sub3_2);
			this.aClass19_Sub1_Sub3_2.method17949(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local26 = this.aClass100_6.anInt2963;
			OpenGL.glUseProgram(local26);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local26, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local26, "params"), aFloat202, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt2615, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt2615, (float) this.anInt2616);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt2616);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			this.aClass21_Sub2_37.method17044(this.aClass19_Sub1_Sub3_3);
			local26 = Class525.method32379(this.anInt2615);
			local31 = Class525.method32379(this.anInt2616);
			@Pc(33) int local33 = 0;
			while (local26 > 256 || local31 > 256) {
				OpenGL.glViewport(0, 0, local26, local31);
				this.aClass19_Sub1_Sub3_3.method20882(0, this.aClass4_Sub1Array1[local33].method14078(0));
				if (local33 == 0) {
					this.aClass21_Sub2_37.method4074(arg0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt2615, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt2615, (float) this.anInt2616);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt2616);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					this.aClass21_Sub2_37.method4074(this.aClass4_Sub1Array1[local33 - 1]);
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
			this.aClass21_Sub2_37.method17263(this.aClass19_Sub1_Sub3_3);
			this.aClass21_Sub2_37.method4074(this.aClass4_Sub1Array1[local33 - 1]);
			this.aClass21_Sub2_37.method17044(this.aClass19_Sub1_Sub3_2);
			this.aClass19_Sub1_Sub3_2.method17949(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(182) int local182 = this.aClass100_5.anInt2963;
			OpenGL.glUseProgram(local182);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local182, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local182, "params"), aFloat202, 0.0F, 0.0F);
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
		this.aClass19_Sub1_Sub3_2.method17949(1);
		this.aClass21_Sub2_37.method4074(this.aClass4_Sub1_3);
		local26 = this.aClass100_3.anInt2963;
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
		this.aClass19_Sub1_Sub3_2.method17949(0);
		this.aClass21_Sub2_37.method4074(this.aClass4_Sub1_4);
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
		this.aClass21_Sub2_37.method17263(this.aClass19_Sub1_Sub3_2);
		local31 = this.aClass100_4.anInt2963;
		OpenGL.glUseProgram(local31);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local31, "sceneTex"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local31, "bloomTex"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local31, "params"), aFloat203, aFloat204, 0.0F);
		this.aClass21_Sub2_37.method4073(1);
		this.aClass21_Sub2_37.method4074(this.aClass4_Sub1_3);
		this.aClass21_Sub2_37.method4073(0);
		this.aClass21_Sub2_37.method4074(arg0);
	}

	@OriginalMember(owner = "client!alx", name = "h", descriptor = "(ILclient!aab;Lclient!aab;)V", line = 120)
	@Override
	void method18590(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1 arg1, @OriginalArg(2) Class4_Sub1 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(26) int local26;
		@Pc(31) int local31;
		if (this.aClass4_Sub1Array1 == null) {
			this.aClass21_Sub2_37.method4074(arg1);
			this.aClass21_Sub2_37.method17044(this.aClass19_Sub1_Sub3_2);
			this.aClass19_Sub1_Sub3_2.method17949(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local26 = this.aClass100_6.anInt2963;
			OpenGL.glUseProgram(local26);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local26, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local26, "params"), aFloat202, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt2615, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt2615, (float) this.anInt2616);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt2616);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			this.aClass21_Sub2_37.method17044(this.aClass19_Sub1_Sub3_3);
			local26 = Class525.method32379(this.anInt2615);
			local31 = Class525.method32379(this.anInt2616);
			@Pc(33) int local33 = 0;
			while (local26 > 256 || local31 > 256) {
				OpenGL.glViewport(0, 0, local26, local31);
				this.aClass19_Sub1_Sub3_3.method20882(0, this.aClass4_Sub1Array1[local33].method14078(0));
				if (local33 == 0) {
					this.aClass21_Sub2_37.method4074(arg1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt2615, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt2615, (float) this.anInt2616);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt2616);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					this.aClass21_Sub2_37.method4074(this.aClass4_Sub1Array1[local33 - 1]);
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
			this.aClass21_Sub2_37.method17263(this.aClass19_Sub1_Sub3_3);
			this.aClass21_Sub2_37.method4074(this.aClass4_Sub1Array1[local33 - 1]);
			this.aClass21_Sub2_37.method17044(this.aClass19_Sub1_Sub3_2);
			this.aClass19_Sub1_Sub3_2.method17949(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(182) int local182 = this.aClass100_5.anInt2963;
			OpenGL.glUseProgram(local182);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local182, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local182, "params"), aFloat202, 0.0F, 0.0F);
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
		this.aClass19_Sub1_Sub3_2.method17949(1);
		this.aClass21_Sub2_37.method4074(this.aClass4_Sub1_3);
		local26 = this.aClass100_3.anInt2963;
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
		this.aClass19_Sub1_Sub3_2.method17949(0);
		this.aClass21_Sub2_37.method4074(this.aClass4_Sub1_4);
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
		this.aClass21_Sub2_37.method17263(this.aClass19_Sub1_Sub3_2);
		local31 = this.aClass100_4.anInt2963;
		OpenGL.glUseProgram(local31);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local31, "sceneTex"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local31, "bloomTex"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local31, "params"), aFloat203, aFloat204, 0.0F);
		this.aClass21_Sub2_37.method4073(1);
		this.aClass21_Sub2_37.method4074(this.aClass4_Sub1_3);
		this.aClass21_Sub2_37.method4073(0);
		this.aClass21_Sub2_37.method4074(arg1);
	}

	@OriginalMember(owner = "client!alx", name = "aq", descriptor = "(I)V", line = 248)
	@Override
	void method18611() {
		OpenGL.glUseProgram(0);
		this.aClass21_Sub2_37.method4073(1);
		this.aClass21_Sub2_37.method4074(null);
		this.aClass21_Sub2_37.method4073(0);
	}

	@OriginalMember(owner = "client!alx", name = "aj", descriptor = "(I)V", line = 248)
	@Override
	void method18592() {
		OpenGL.glUseProgram(0);
		this.aClass21_Sub2_37.method4073(1);
		this.aClass21_Sub2_37.method4074(null);
		this.aClass21_Sub2_37.method4073(0);
	}

	@OriginalMember(owner = "client!alx", name = "as", descriptor = "(I)V", line = 248)
	@Override
	void method18615() {
		OpenGL.glUseProgram(0);
		this.aClass21_Sub2_37.method4073(1);
		this.aClass21_Sub2_37.method4074(null);
		this.aClass21_Sub2_37.method4073(0);
	}

	@OriginalMember(owner = "client!alx", name = "ai", descriptor = "(I)V", line = 248)
	@Override
	void method18610() {
		OpenGL.glUseProgram(0);
		this.aClass21_Sub2_37.method4073(1);
		this.aClass21_Sub2_37.method4074(null);
		this.aClass21_Sub2_37.method4073(0);
	}

	@OriginalMember(owner = "client!alx", name = "x", descriptor = "(I)V", line = 248)
	@Override
	void method18591(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgram(0);
		this.aClass21_Sub2_37.method4073(1);
		this.aClass21_Sub2_37.method4074(null);
		this.aClass21_Sub2_37.method4073(0);
	}

	@OriginalMember(owner = "client!alx", name = "b", descriptor = "()Lclient!dj;", line = 255)
	@Override
	Class127 method18625() {
		return Class127.aClass127_24;
	}

	@OriginalMember(owner = "client!alx", name = "au", descriptor = "()Lclient!dj;", line = 255)
	@Override
	Class127 method18619() {
		return Class127.aClass127_24;
	}

	@OriginalMember(owner = "client!alx", name = "ab", descriptor = "()Lclient!dj;", line = 255)
	@Override
	Class127 method18617() {
		return Class127.aClass127_24;
	}

	@OriginalMember(owner = "client!alx", name = "ay", descriptor = "()Lclient!dj;", line = 255)
	@Override
	Class127 method18620() {
		return Class127.aClass127_24;
	}

	@OriginalMember(owner = "client!alx", name = "ag", descriptor = "()Lclient!dj;", line = 255)
	@Override
	Class127 method18621() {
		return Class127.aClass127_24;
	}

	@OriginalMember(owner = "client!alx", name = "u", descriptor = "()I", line = 259)
	@Override
	int method18593() {
		return 0;
	}

	@OriginalMember(owner = "client!alx", name = "aw", descriptor = "()I", line = 259)
	@Override
	int method18622() {
		return 0;
	}

	@OriginalMember(owner = "client!alx", name = "ae", descriptor = "()Z", line = 263)
	@Override
	boolean method18587() {
		return false;
	}

	@OriginalMember(owner = "client!alx", name = "ar", descriptor = "()Z", line = 263)
	@Override
	boolean method18623() {
		return false;
	}

	@OriginalMember(owner = "client!alx", name = "ad", descriptor = "()Z", line = 263)
	@Override
	boolean method18609() {
		return false;
	}

	@OriginalMember(owner = "client!alx", name = "z", descriptor = "()Z", line = 263)
	@Override
	boolean method18597() {
		return false;
	}
}
