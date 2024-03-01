package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aly")
public class Class3_Sub9_Sub3 extends Class3_Sub9 {

	@OriginalMember(owner = "client!aly", name = "c", descriptor = "Ljava/lang/String;")
	static final String aString100 = "#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n";

	@OriginalMember(owner = "client!aly", name = "x", descriptor = "F")
	static float aFloat209 = 1.0F;

	@OriginalMember(owner = "client!aly", name = "s", descriptor = "F")
	static float aFloat205 = 0.0F;

	@OriginalMember(owner = "client!aly", name = "u", descriptor = "F")
	static float aFloat206 = 1.0F;

	@OriginalMember(owner = "client!aly", name = "y", descriptor = "F")
	static float aFloat207 = 0.0F;

	@OriginalMember(owner = "client!aly", name = "b", descriptor = "F")
	static float aFloat208 = 1.0F;

	@OriginalMember(owner = "client!aly", name = "z", descriptor = "Lclient!bs;")
	Class100 aClass100_7;

	@OriginalMember(owner = "client!aly", name = "<init>", descriptor = "(Lclient!abt;)V", line = 18)
	Class3_Sub9_Sub3(@OriginalArg(0) Class21_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aly", name = "ac", descriptor = "()Z", line = 22)
	boolean method18627() {
		return this.aClass21_Sub2_37.aBoolean89;
	}

	@OriginalMember(owner = "client!aly", name = "bw", descriptor = "()Z", line = 22)
	boolean method18628() {
		return this.aClass21_Sub2_37.aBoolean89;
	}

	@OriginalMember(owner = "client!aly", name = "bp", descriptor = "()Z", line = 22)
	boolean method18629() {
		return this.aClass21_Sub2_37.aBoolean89;
	}

	@OriginalMember(owner = "client!aly", name = "bd", descriptor = "()Z", line = 22)
	boolean method18630() {
		return this.aClass21_Sub2_37.aBoolean89;
	}

	@OriginalMember(owner = "client!aly", name = "p", descriptor = "()Z", line = 26)
	@Override
	boolean method18586() {
		return this.aClass100_7 != null;
	}

	@OriginalMember(owner = "client!aly", name = "j", descriptor = "()Z", line = 26)
	@Override
	boolean method18598() {
		return this.aClass100_7 != null;
	}

	@OriginalMember(owner = "client!aly", name = "n", descriptor = "()Z", line = 26)
	@Override
	boolean method18624() {
		return this.aClass100_7 != null;
	}

	@OriginalMember(owner = "client!aly", name = "k", descriptor = "()Z", line = 30)
	@Override
	boolean method18602() {
		if (this.aClass21_Sub2_37.aBoolean89) {
			this.aClass100_7 = Class100.method21834(this.aClass21_Sub2_37, new Class101[] { Class101.method21836(this.aClass21_Sub2_37, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n") });
			return this.aClass100_7 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aly", name = "i", descriptor = "()Z", line = 30)
	@Override
	boolean method18600() {
		if (this.aClass21_Sub2_37.aBoolean89) {
			this.aClass100_7 = Class100.method21834(this.aClass21_Sub2_37, new Class101[] { Class101.method21836(this.aClass21_Sub2_37, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n") });
			return this.aClass100_7 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aly", name = "f", descriptor = "()Z", line = 30)
	@Override
	boolean method18601() {
		if (this.aClass21_Sub2_37.aBoolean89) {
			this.aClass100_7 = Class100.method21834(this.aClass21_Sub2_37, new Class101[] { Class101.method21836(this.aClass21_Sub2_37, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n") });
			return this.aClass100_7 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aly", name = "a", descriptor = "()Z", line = 30)
	@Override
	boolean method18605() {
		if (this.aClass21_Sub2_37.aBoolean89) {
			this.aClass100_7 = Class100.method21834(this.aClass21_Sub2_37, new Class101[] { Class101.method21836(this.aClass21_Sub2_37, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n") });
			return this.aClass100_7 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aly", name = "l", descriptor = "(II)V", line = 37)
	@Override
	void method18613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aly", name = "ah", descriptor = "(II)V", line = 37)
	@Override
	void method18606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aly", name = "g", descriptor = "()V", line = 40)
	@Override
	void method18588() {
		this.aClass100_7 = null;
	}

	@OriginalMember(owner = "client!aly", name = "ak", descriptor = "()V", line = 40)
	@Override
	void method18589() {
		this.aClass100_7 = null;
	}

	@OriginalMember(owner = "client!aly", name = "af", descriptor = "()V", line = 40)
	@Override
	void method18608() {
		this.aClass100_7 = null;
	}

	@OriginalMember(owner = "client!aly", name = "at", descriptor = "()V", line = 40)
	@Override
	void method18603() {
		this.aClass100_7 = null;
	}

	@OriginalMember(owner = "client!aly", name = "aa", descriptor = "()V", line = 40)
	@Override
	void method18599() {
		this.aClass100_7 = null;
	}

	@OriginalMember(owner = "client!aly", name = "an", descriptor = "(ILclient!aab;Lclient!aab;)V", line = 44)
	@Override
	void method18607(@OriginalArg(1) Class4_Sub1 arg0, @OriginalArg(2) Class4_Sub1 arg1) {
		@Pc(3) int local3 = this.aClass100_7.anInt2963;
		OpenGL.glUseProgram(local3);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local3, "sceneTex"), 0);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local3, "paramsGamma"), aFloat209);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local3, "paramsRanges"), aFloat205, aFloat206, aFloat207, aFloat208);
		this.aClass21_Sub2_37.method4073(0);
		this.aClass21_Sub2_37.method4074(arg0);
	}

	@OriginalMember(owner = "client!aly", name = "h", descriptor = "(ILclient!aab;Lclient!aab;)V", line = 44)
	@Override
	void method18590(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1 arg1, @OriginalArg(2) Class4_Sub1 arg2) {
		@Pc(3) int local3 = this.aClass100_7.anInt2963;
		OpenGL.glUseProgram(local3);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local3, "sceneTex"), 0);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local3, "paramsGamma"), aFloat209);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local3, "paramsRanges"), aFloat205, aFloat206, aFloat207, aFloat208);
		this.aClass21_Sub2_37.method4073(0);
		this.aClass21_Sub2_37.method4074(arg1);
	}

	@OriginalMember(owner = "client!aly", name = "as", descriptor = "(I)V", line = 54)
	@Override
	void method18615() {
		OpenGL.glUseProgram(0);
		this.aClass21_Sub2_37.method4073(0);
		this.aClass21_Sub2_37.method4074(null);
	}

	@OriginalMember(owner = "client!aly", name = "aq", descriptor = "(I)V", line = 54)
	@Override
	void method18611() {
		OpenGL.glUseProgram(0);
		this.aClass21_Sub2_37.method4073(0);
		this.aClass21_Sub2_37.method4074(null);
	}

	@OriginalMember(owner = "client!aly", name = "x", descriptor = "(I)V", line = 54)
	@Override
	void method18591(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgram(0);
		this.aClass21_Sub2_37.method4073(0);
		this.aClass21_Sub2_37.method4074(null);
	}

	@OriginalMember(owner = "client!aly", name = "aj", descriptor = "(I)V", line = 54)
	@Override
	void method18592() {
		OpenGL.glUseProgram(0);
		this.aClass21_Sub2_37.method4073(0);
		this.aClass21_Sub2_37.method4074(null);
	}

	@OriginalMember(owner = "client!aly", name = "ai", descriptor = "(I)V", line = 54)
	@Override
	void method18610() {
		OpenGL.glUseProgram(0);
		this.aClass21_Sub2_37.method4073(0);
		this.aClass21_Sub2_37.method4074(null);
	}

	@OriginalMember(owner = "client!aly", name = "b", descriptor = "()Lclient!dj;", line = 60)
	@Override
	Class127 method18625() {
		return Class127.aClass127_23;
	}

	@OriginalMember(owner = "client!aly", name = "ab", descriptor = "()Lclient!dj;", line = 60)
	@Override
	Class127 method18617() {
		return Class127.aClass127_23;
	}

	@OriginalMember(owner = "client!aly", name = "au", descriptor = "()Lclient!dj;", line = 60)
	@Override
	Class127 method18619() {
		return Class127.aClass127_23;
	}

	@OriginalMember(owner = "client!aly", name = "ay", descriptor = "()Lclient!dj;", line = 60)
	@Override
	Class127 method18620() {
		return Class127.aClass127_23;
	}

	@OriginalMember(owner = "client!aly", name = "ag", descriptor = "()Lclient!dj;", line = 60)
	@Override
	Class127 method18621() {
		return Class127.aClass127_23;
	}

	@OriginalMember(owner = "client!aly", name = "u", descriptor = "()I", line = 64)
	@Override
	int method18593() {
		return 1;
	}

	@OriginalMember(owner = "client!aly", name = "aw", descriptor = "()I", line = 64)
	@Override
	int method18622() {
		return 1;
	}

	@OriginalMember(owner = "client!aly", name = "z", descriptor = "()Z", line = 68)
	@Override
	boolean method18597() {
		return aFloat209 == 1.0F && aFloat205 == 0.0F && aFloat206 == 1.0F && aFloat207 == 0.0F && aFloat208 == 1.0F;
	}

	@OriginalMember(owner = "client!aly", name = "ar", descriptor = "()Z", line = 68)
	@Override
	boolean method18623() {
		return aFloat209 == 1.0F && aFloat205 == 0.0F && aFloat206 == 1.0F && aFloat207 == 0.0F && aFloat208 == 1.0F;
	}

	@OriginalMember(owner = "client!aly", name = "ae", descriptor = "()Z", line = 68)
	@Override
	boolean method18587() {
		return aFloat209 == 1.0F && aFloat205 == 0.0F && aFloat206 == 1.0F && aFloat207 == 0.0F && aFloat208 == 1.0F;
	}

	@OriginalMember(owner = "client!aly", name = "ad", descriptor = "()Z", line = 68)
	@Override
	boolean method18609() {
		return aFloat209 == 1.0F && aFloat205 == 0.0F && aFloat206 == 1.0F && aFloat207 == 0.0F && aFloat208 == 1.0F;
	}
}
