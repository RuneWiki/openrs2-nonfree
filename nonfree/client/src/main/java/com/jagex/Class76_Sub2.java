package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adk")
public class Class76_Sub2 extends Class76 {

	@OriginalMember(owner = "client!adk", name = "c", descriptor = "Ljava/lang/String;")
	static final String aString16 = "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n";

	@OriginalMember(owner = "client!adk", name = "v", descriptor = "Ljava/lang/String;")
	static final String aString17 = "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n";

	@OriginalMember(owner = "client!adk", name = "y", descriptor = "Z")
	boolean aBoolean33 = false;

	@OriginalMember(owner = "client!adk", name = "w", descriptor = "Z")
	boolean aBoolean32 = false;

	@OriginalMember(owner = "client!adk", name = "t", descriptor = "Lclient!bf;")
	Class168 aClass168_2;

	@OriginalMember(owner = "client!adk", name = "l", descriptor = "Lclient!bd;")
	Class166 aClass166_2;

	@OriginalMember(owner = "client!adk", name = "<init>", descriptor = "(Lclient!aeq;Lclient!bf;)V", line = 16)
	Class76_Sub2(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) Class168 arg1) {
		super(arg0);
		this.aClass168_2 = arg1;
		if (this.aClass168_2.aClass78_Sub4_3 != null && this.aClass86_Sub3_22.aBoolean144 && this.aClass86_Sub3_22.aBoolean133) {
			@Pc(29) Class181 local29 = Class181.method24564(this.aClass86_Sub3_22, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(35) Class181 local35 = Class181.method24564(this.aClass86_Sub3_22, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			this.aClass166_2 = Class166.method24388(this.aClass86_Sub3_22, new Class181[] { local29, local35 });
			this.aBoolean32 = this.aClass166_2 != null;
		}
	}

	@OriginalMember(owner = "client!adk", name = "p", descriptor = "()Z", line = 27)
	@Override
	boolean method1995() {
		return this.aBoolean32;
	}

	@OriginalMember(owner = "client!adk", name = "x", descriptor = "()Z", line = 27)
	@Override
	boolean method1982() {
		return this.aBoolean32;
	}

	@OriginalMember(owner = "client!adk", name = "q", descriptor = "()Z", line = 27)
	@Override
	boolean method1981() {
		return this.aBoolean32;
	}

	@OriginalMember(owner = "client!adk", name = "t", descriptor = "()Z", line = 27)
	@Override
	boolean method1990() {
		return this.aBoolean32;
	}

	@OriginalMember(owner = "client!adk", name = "r", descriptor = "(Z)V", line = 31)
	@Override
	void method1985(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class78_Sub1 local3 = this.aClass86_Sub3_22.method6128();
		if (!this.aBoolean32 || local3 == null) {
			return;
		}
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6195(local3);
		this.aClass86_Sub3_22.method6190(0);
		this.aClass86_Sub3_22.method6195(this.aClass168_2.aClass78_Sub4_3);
		@Pc(30) int local30 = this.aClass166_2.anInt3284;
		OpenGL.glUseProgram(local30);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local30, "normalSampler"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local30, "envMapSampler"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local30, "sunDir"), -this.aClass86_Sub3_22.aFloatArray23[0], -this.aClass86_Sub3_22.aFloatArray23[1], -this.aClass86_Sub3_22.aFloatArray23[2]);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local30, "sunColour"), this.aClass86_Sub3_22.aFloat65, this.aClass86_Sub3_22.aFloat66, this.aClass86_Sub3_22.aFloat67, 1.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local30, "sunExponent"), Math.abs(this.aClass86_Sub3_22.aFloatArray23[1]) * 928.0F + 96.0F);
		this.aBoolean33 = true;
	}

	@OriginalMember(owner = "client!adk", name = "c", descriptor = "(Z)V", line = 31)
	@Override
	void method1976(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class78_Sub1 local3 = this.aClass86_Sub3_22.method6128();
		if (!this.aBoolean32 || local3 == null) {
			return;
		}
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6195(local3);
		this.aClass86_Sub3_22.method6190(0);
		this.aClass86_Sub3_22.method6195(this.aClass168_2.aClass78_Sub4_3);
		@Pc(30) int local30 = this.aClass166_2.anInt3284;
		OpenGL.glUseProgram(local30);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local30, "normalSampler"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local30, "envMapSampler"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local30, "sunDir"), -this.aClass86_Sub3_22.aFloatArray23[0], -this.aClass86_Sub3_22.aFloatArray23[1], -this.aClass86_Sub3_22.aFloatArray23[2]);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local30, "sunColour"), this.aClass86_Sub3_22.aFloat65, this.aClass86_Sub3_22.aFloat66, this.aClass86_Sub3_22.aFloat67, 1.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local30, "sunExponent"), Math.abs(this.aClass86_Sub3_22.aFloatArray23[1]) * 928.0F + 96.0F);
		this.aBoolean33 = true;
	}

	@OriginalMember(owner = "client!adk", name = "d", descriptor = "(Z)V", line = 31)
	@Override
	void method1983(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class78_Sub1 local3 = this.aClass86_Sub3_22.method6128();
		if (!this.aBoolean32 || local3 == null) {
			return;
		}
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6195(local3);
		this.aClass86_Sub3_22.method6190(0);
		this.aClass86_Sub3_22.method6195(this.aClass168_2.aClass78_Sub4_3);
		@Pc(30) int local30 = this.aClass166_2.anInt3284;
		OpenGL.glUseProgram(local30);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local30, "normalSampler"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local30, "envMapSampler"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local30, "sunDir"), -this.aClass86_Sub3_22.aFloatArray23[0], -this.aClass86_Sub3_22.aFloatArray23[1], -this.aClass86_Sub3_22.aFloatArray23[2]);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local30, "sunColour"), this.aClass86_Sub3_22.aFloat65, this.aClass86_Sub3_22.aFloat66, this.aClass86_Sub3_22.aFloat67, 1.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local30, "sunExponent"), Math.abs(this.aClass86_Sub3_22.aFloatArray23[1]) * 928.0F + 96.0F);
		this.aBoolean33 = true;
	}

	@OriginalMember(owner = "client!adk", name = "s", descriptor = "(Z)V", line = 31)
	@Override
	void method1992(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class78_Sub1 local3 = this.aClass86_Sub3_22.method6128();
		if (!this.aBoolean32 || local3 == null) {
			return;
		}
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6195(local3);
		this.aClass86_Sub3_22.method6190(0);
		this.aClass86_Sub3_22.method6195(this.aClass168_2.aClass78_Sub4_3);
		@Pc(30) int local30 = this.aClass166_2.anInt3284;
		OpenGL.glUseProgram(local30);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local30, "normalSampler"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local30, "envMapSampler"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local30, "sunDir"), -this.aClass86_Sub3_22.aFloatArray23[0], -this.aClass86_Sub3_22.aFloatArray23[1], -this.aClass86_Sub3_22.aFloatArray23[2]);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local30, "sunColour"), this.aClass86_Sub3_22.aFloat65, this.aClass86_Sub3_22.aFloat66, this.aClass86_Sub3_22.aFloat67, 1.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local30, "sunExponent"), Math.abs(this.aClass86_Sub3_22.aFloatArray23[1]) * 928.0F + 96.0F);
		this.aBoolean33 = true;
	}

	@OriginalMember(owner = "client!adk", name = "g", descriptor = "(Z)V", line = 31)
	@Override
	void method1986(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class78_Sub1 local3 = this.aClass86_Sub3_22.method6128();
		if (!this.aBoolean32 || local3 == null) {
			return;
		}
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6195(local3);
		this.aClass86_Sub3_22.method6190(0);
		this.aClass86_Sub3_22.method6195(this.aClass168_2.aClass78_Sub4_3);
		@Pc(30) int local30 = this.aClass166_2.anInt3284;
		OpenGL.glUseProgram(local30);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local30, "normalSampler"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local30, "envMapSampler"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local30, "sunDir"), -this.aClass86_Sub3_22.aFloatArray23[0], -this.aClass86_Sub3_22.aFloatArray23[1], -this.aClass86_Sub3_22.aFloatArray23[2]);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local30, "sunColour"), this.aClass86_Sub3_22.aFloat65, this.aClass86_Sub3_22.aFloat66, this.aClass86_Sub3_22.aFloat67, 1.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local30, "sunExponent"), Math.abs(this.aClass86_Sub3_22.aFloatArray23[1]) * 928.0F + 96.0F);
		this.aBoolean33 = true;
	}

	@OriginalMember(owner = "client!adk", name = "v", descriptor = "(Z)V", line = 48)
	@Override
	void method1977(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!adk", name = "z", descriptor = "(Z)V", line = 48)
	@Override
	void method1987() {
	}

	@OriginalMember(owner = "client!adk", name = "j", descriptor = "(Z)V", line = 48)
	@Override
	void method1988() {
	}

	@OriginalMember(owner = "client!adk", name = "i", descriptor = "(Z)V", line = 48)
	@Override
	void method1984() {
	}

	@OriginalMember(owner = "client!adk", name = "k", descriptor = "(Z)V", line = 48)
	@Override
	void method1980() {
	}

	@OriginalMember(owner = "client!adk", name = "u", descriptor = "()V", line = 51)
	@Override
	void method1989() {
		if (!this.aBoolean33) {
			return;
		}
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6195(null);
		this.aClass86_Sub3_22.method6190(0);
		this.aClass86_Sub3_22.method6195(null);
		OpenGL.glUseProgram(0);
		this.aBoolean33 = false;
	}

	@OriginalMember(owner = "client!adk", name = "l", descriptor = "()V", line = 51)
	@Override
	void method1975() {
		if (!this.aBoolean33) {
			return;
		}
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6195(null);
		this.aClass86_Sub3_22.method6190(0);
		this.aClass86_Sub3_22.method6195(null);
		OpenGL.glUseProgram(0);
		this.aBoolean33 = false;
	}

	@OriginalMember(owner = "client!adk", name = "e", descriptor = "()V", line = 51)
	@Override
	void method1974() {
		if (!this.aBoolean33) {
			return;
		}
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6195(null);
		this.aClass86_Sub3_22.method6190(0);
		this.aClass86_Sub3_22.method6195(null);
		OpenGL.glUseProgram(0);
		this.aBoolean33 = false;
	}

	@OriginalMember(owner = "client!adk", name = "f", descriptor = "()V", line = 51)
	@Override
	void method1993() {
		if (!this.aBoolean33) {
			return;
		}
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6195(null);
		this.aClass86_Sub3_22.method6190(0);
		this.aClass86_Sub3_22.method6195(null);
		OpenGL.glUseProgram(0);
		this.aBoolean33 = false;
	}

	@OriginalMember(owner = "client!adk", name = "o", descriptor = "(II)V", line = 62)
	@Override
	void method1994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean33) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(36) int local36 = this.aClass166_2.anInt3284;
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local36, "time"), (float) (local8 * this.aClass86_Sub3_22.anInt723 % 40000) / 40000.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local36, "scale"), local19);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local36, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local36, "breakWaterOffset"), local32);
	}

	@OriginalMember(owner = "client!adk", name = "y", descriptor = "(II)V", line = 62)
	@Override
	void method1979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean33) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(36) int local36 = this.aClass166_2.anInt3284;
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local36, "time"), (float) (local8 * this.aClass86_Sub3_22.anInt723 % 40000) / 40000.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local36, "scale"), local19);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local36, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local36, "breakWaterOffset"), local32);
	}

	@OriginalMember(owner = "client!adk", name = "b", descriptor = "(II)V", line = 62)
	@Override
	void method1978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean33) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(36) int local36 = this.aClass166_2.anInt3284;
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local36, "time"), (float) (local8 * this.aClass86_Sub3_22.anInt723 % 40000) / 40000.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local36, "scale"), local19);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local36, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local36, "breakWaterOffset"), local32);
	}

	@OriginalMember(owner = "client!adk", name = "w", descriptor = "(Lclient!bx;I)V", line = 76)
	@Override
	void method1991(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean33) {
			this.aClass86_Sub3_22.method6195(arg0);
			this.aClass86_Sub3_22.method6198(arg1);
		}
	}

	@OriginalMember(owner = "client!adk", name = "n", descriptor = "(Lclient!bx;I)V", line = 76)
	@Override
	void method1996(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean33) {
			this.aClass86_Sub3_22.method6195(arg0);
			this.aClass86_Sub3_22.method6198(arg1);
		}
	}
}
