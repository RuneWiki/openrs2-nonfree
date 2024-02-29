package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!apy")
public class Class77_Sub11_Sub3 extends Class77_Sub11 {

	@OriginalMember(owner = "client!apy", name = "s", descriptor = "Ljava/lang/String;")
	static final String aString86 = "#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n";

	@OriginalMember(owner = "client!apy", name = "w", descriptor = "F")
	static float aFloat219 = 1.0F;

	@OriginalMember(owner = "client!apy", name = "t", descriptor = "F")
	static float aFloat221 = 0.0F;

	@OriginalMember(owner = "client!apy", name = "q", descriptor = "F")
	static float aFloat218 = 1.0F;

	@OriginalMember(owner = "client!apy", name = "x", descriptor = "F")
	static float aFloat217 = 0.0F;

	@OriginalMember(owner = "client!apy", name = "d", descriptor = "F")
	static float aFloat220 = 1.0F;

	@OriginalMember(owner = "client!apy", name = "r", descriptor = "Lclient!bd;")
	Class166 aClass166_7;

	@OriginalMember(owner = "client!apy", name = "<init>", descriptor = "(Lclient!aeq;)V", line = 18)
	Class77_Sub11_Sub3(@OriginalArg(0) Class86_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!apy", name = "bc", descriptor = "()Z", line = 22)
	boolean method21318() {
		return this.aClass86_Sub3_38.aBoolean133;
	}

	@OriginalMember(owner = "client!apy", name = "bj", descriptor = "()Z", line = 22)
	boolean method21319() {
		return this.aClass86_Sub3_38.aBoolean133;
	}

	@OriginalMember(owner = "client!apy", name = "bv", descriptor = "()Z", line = 22)
	boolean method21320() {
		return this.aClass86_Sub3_38.aBoolean133;
	}

	@OriginalMember(owner = "client!apy", name = "ba", descriptor = "()Z", line = 22)
	boolean method21321() {
		return this.aClass86_Sub3_38.aBoolean133;
	}

	@OriginalMember(owner = "client!apy", name = "p", descriptor = "()Z", line = 26)
	@Override
	boolean method21286() {
		return this.aClass166_7 != null;
	}

	@OriginalMember(owner = "client!apy", name = "z", descriptor = "()Z", line = 26)
	@Override
	boolean method21296() {
		return this.aClass166_7 != null;
	}

	@OriginalMember(owner = "client!apy", name = "g", descriptor = "()Z", line = 26)
	@Override
	boolean method21295() {
		return this.aClass166_7 != null;
	}

	@OriginalMember(owner = "client!apy", name = "j", descriptor = "()Z", line = 26)
	@Override
	boolean method21297() {
		return this.aClass166_7 != null;
	}

	@OriginalMember(owner = "client!apy", name = "b", descriptor = "()Z", line = 26)
	@Override
	boolean method21287() {
		return this.aClass166_7 != null;
	}

	@OriginalMember(owner = "client!apy", name = "n", descriptor = "()Z", line = 26)
	@Override
	boolean method21298() {
		return this.aClass166_7 != null;
	}

	@OriginalMember(owner = "client!apy", name = "c", descriptor = "()Z", line = 30)
	@Override
	boolean method21285() {
		if (this.aClass86_Sub3_38.aBoolean133) {
			this.aClass166_7 = Class166.method24388(this.aClass86_Sub3_38, new Class181[] { Class181.method24564(this.aClass86_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n") });
			return this.aClass166_7 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!apy", name = "a", descriptor = "()Z", line = 30)
	@Override
	boolean method21299() {
		if (this.aClass86_Sub3_38.aBoolean133) {
			this.aClass166_7 = Class166.method24388(this.aClass86_Sub3_38, new Class181[] { Class181.method24564(this.aClass86_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n") });
			return this.aClass166_7 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!apy", name = "h", descriptor = "()Z", line = 30)
	@Override
	boolean method21300() {
		if (this.aClass86_Sub3_38.aBoolean133) {
			this.aClass166_7 = Class166.method24388(this.aClass86_Sub3_38, new Class181[] { Class181.method24564(this.aClass86_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n") });
			return this.aClass166_7 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!apy", name = "m", descriptor = "()Z", line = 30)
	@Override
	boolean method21316() {
		if (this.aClass86_Sub3_38.aBoolean133) {
			this.aClass166_7 = Class166.method24388(this.aClass86_Sub3_38, new Class181[] { Class181.method24564(this.aClass86_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n") });
			return this.aClass166_7 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!apy", name = "l", descriptor = "(II)V", line = 37)
	@Override
	void method21288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!apy", name = "ag", descriptor = "(II)V", line = 37)
	@Override
	void method21303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!apy", name = "ao", descriptor = "(II)V", line = 37)
	@Override
	void method21304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!apy", name = "ak", descriptor = "(II)V", line = 37)
	@Override
	void method21305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!apy", name = "al", descriptor = "(II)V", line = 37)
	@Override
	void method21308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!apy", name = "ai", descriptor = "()V", line = 40)
	@Override
	void method21302() {
		this.aClass166_7 = null;
	}

	@OriginalMember(owner = "client!apy", name = "v", descriptor = "()V", line = 40)
	@Override
	void method21311() {
		this.aClass166_7 = null;
	}

	@OriginalMember(owner = "client!apy", name = "aj", descriptor = "()V", line = 40)
	@Override
	void method21301() {
		this.aClass166_7 = null;
	}

	@OriginalMember(owner = "client!apy", name = "y", descriptor = "(ILclient!adi;Lclient!adi;II)V", line = 44)
	@Override
	void method21312(@OriginalArg(0) int arg0, @OriginalArg(1) Class78_Sub2 arg1, @OriginalArg(2) Class78_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = this.aClass166_7.anInt3284;
		OpenGL.glUseProgram(local3);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local3, "sceneTex"), 0);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local3, "paramsGamma"), aFloat219);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local3, "paramsRanges"), aFloat221, aFloat218, aFloat217, aFloat220);
		this.aClass86_Sub3_38.method6190(0);
		this.aClass86_Sub3_38.method6195(arg1);
	}

	@OriginalMember(owner = "client!apy", name = "ap", descriptor = "(ILclient!adi;Lclient!adi;II)V", line = 44)
	@Override
	void method21315(@OriginalArg(1) Class78_Sub2 arg0, @OriginalArg(2) Class78_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) int local3 = this.aClass166_7.anInt3284;
		OpenGL.glUseProgram(local3);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local3, "sceneTex"), 0);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local3, "paramsGamma"), aFloat219);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local3, "paramsRanges"), aFloat221, aFloat218, aFloat217, aFloat220);
		this.aClass86_Sub3_38.method6190(0);
		this.aClass86_Sub3_38.method6195(arg0);
	}

	@OriginalMember(owner = "client!apy", name = "aw", descriptor = "(ILclient!adi;Lclient!adi;II)V", line = 44)
	@Override
	void method21291(@OriginalArg(1) Class78_Sub2 arg0, @OriginalArg(2) Class78_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) int local3 = this.aClass166_7.anInt3284;
		OpenGL.glUseProgram(local3);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local3, "sceneTex"), 0);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local3, "paramsGamma"), aFloat219);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local3, "paramsRanges"), aFloat221, aFloat218, aFloat217, aFloat220);
		this.aClass86_Sub3_38.method6190(0);
		this.aClass86_Sub3_38.method6195(arg0);
	}

	@OriginalMember(owner = "client!apy", name = "az", descriptor = "(ILclient!adi;Lclient!adi;II)V", line = 44)
	@Override
	void method21317(@OriginalArg(1) Class78_Sub2 arg0, @OriginalArg(2) Class78_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) int local3 = this.aClass166_7.anInt3284;
		OpenGL.glUseProgram(local3);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local3, "sceneTex"), 0);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local3, "paramsGamma"), aFloat219);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local3, "paramsRanges"), aFloat221, aFloat218, aFloat217, aFloat220);
		this.aClass86_Sub3_38.method6190(0);
		this.aClass86_Sub3_38.method6195(arg0);
	}

	@OriginalMember(owner = "client!apy", name = "au", descriptor = "(I)V", line = 54)
	@Override
	void method21306() {
		OpenGL.glUseProgram(0);
		this.aClass86_Sub3_38.method6190(0);
		this.aClass86_Sub3_38.method6195(null);
	}

	@OriginalMember(owner = "client!apy", name = "w", descriptor = "(I)V", line = 54)
	@Override
	void method21289(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgram(0);
		this.aClass86_Sub3_38.method6190(0);
		this.aClass86_Sub3_38.method6195(null);
	}

	@OriginalMember(owner = "client!apy", name = "d", descriptor = "()Lclient!dl;", line = 60)
	@Override
	Class206 method21278() {
		return Class206.aClass206_23;
	}

	@OriginalMember(owner = "client!apy", name = "am", descriptor = "()Lclient!dl;", line = 60)
	@Override
	Class206 method21281() {
		return Class206.aClass206_23;
	}

	@OriginalMember(owner = "client!apy", name = "ay", descriptor = "()Lclient!dl;", line = 60)
	@Override
	Class206 method21282() {
		return Class206.aClass206_23;
	}

	@OriginalMember(owner = "client!apy", name = "as", descriptor = "()Lclient!dl;", line = 60)
	@Override
	Class206 method21280() {
		return Class206.aClass206_23;
	}

	@OriginalMember(owner = "client!apy", name = "aq", descriptor = "()Lclient!dl;", line = 60)
	@Override
	Class206 method21279() {
		return Class206.aClass206_23;
	}

	@OriginalMember(owner = "client!apy", name = "ac", descriptor = "()I", line = 64)
	@Override
	int method21309() {
		return 1;
	}

	@OriginalMember(owner = "client!apy", name = "ad", descriptor = "()I", line = 64)
	@Override
	int method21293() {
		return 1;
	}

	@OriginalMember(owner = "client!apy", name = "ar", descriptor = "()I", line = 64)
	@Override
	int method21307() {
		return 1;
	}

	@OriginalMember(owner = "client!apy", name = "av", descriptor = "()I", line = 64)
	@Override
	int method21310() {
		return 1;
	}

	@OriginalMember(owner = "client!apy", name = "q", descriptor = "()I", line = 64)
	@Override
	int method21292() {
		return 1;
	}

	@OriginalMember(owner = "client!apy", name = "r", descriptor = "()Z", line = 68)
	@Override
	boolean method21294() {
		return aFloat219 == 1.0F && aFloat221 == 0.0F && aFloat218 == 1.0F && aFloat217 == 0.0F && aFloat220 == 1.0F;
	}

	@OriginalMember(owner = "client!apy", name = "ab", descriptor = "()Z", line = 68)
	@Override
	boolean method21313() {
		return aFloat219 == 1.0F && aFloat221 == 0.0F && aFloat218 == 1.0F && aFloat217 == 0.0F && aFloat220 == 1.0F;
	}

	@OriginalMember(owner = "client!apy", name = "an", descriptor = "()Z", line = 68)
	@Override
	boolean method21290() {
		return aFloat219 == 1.0F && aFloat221 == 0.0F && aFloat218 == 1.0F && aFloat217 == 0.0F && aFloat220 == 1.0F;
	}

	@OriginalMember(owner = "client!apy", name = "aa", descriptor = "()Z", line = 68)
	@Override
	boolean method21314() {
		return aFloat219 == 1.0F && aFloat221 == 0.0F && aFloat218 == 1.0F && aFloat217 == 0.0F && aFloat220 == 1.0F;
	}
}
