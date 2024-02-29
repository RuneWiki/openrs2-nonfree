package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!add")
public class Class76_Sub1 extends Class76 {

	@OriginalMember(owner = "client!add", name = "v", descriptor = "Ljava/lang/String;")
	static final String aString14 = "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n";

	@OriginalMember(owner = "client!add", name = "c", descriptor = "Ljava/lang/String;")
	static final String aString15 = "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n";

	@OriginalMember(owner = "client!add", name = "y", descriptor = "Z")
	boolean aBoolean25 = false;

	@OriginalMember(owner = "client!add", name = "w", descriptor = "Z")
	boolean aBoolean24 = false;

	@OriginalMember(owner = "client!add", name = "t", descriptor = "Lclient!bf;")
	Class168 aClass168_1;

	@OriginalMember(owner = "client!add", name = "l", descriptor = "Lclient!bd;")
	Class166 aClass166_1;

	@OriginalMember(owner = "client!add", name = "<init>", descriptor = "(Lclient!aeq;Lclient!bf;)V", line = 16)
	Class76_Sub1(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) Class168 arg1) {
		super(arg0);
		this.aClass168_1 = arg1;
		if (this.aClass168_1.aClass78_Sub4_3 != null && this.aClass86_Sub3_22.aBoolean144 && this.aClass86_Sub3_22.aBoolean133) {
			@Pc(29) Class181 local29 = Class181.method24564(this.aClass86_Sub3_22, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(35) Class181 local35 = Class181.method24564(this.aClass86_Sub3_22, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			this.aClass166_1 = Class166.method24388(this.aClass86_Sub3_22, new Class181[] { local29, local35 });
			this.aBoolean24 = this.aClass166_1 != null;
		}
	}

	@OriginalMember(owner = "client!add", name = "x", descriptor = "()Z", line = 27)
	@Override
	boolean method1982() {
		return this.aBoolean24;
	}

	@OriginalMember(owner = "client!add", name = "p", descriptor = "()Z", line = 27)
	@Override
	boolean method1995() {
		return this.aBoolean24;
	}

	@OriginalMember(owner = "client!add", name = "q", descriptor = "()Z", line = 27)
	@Override
	boolean method1981() {
		return this.aBoolean24;
	}

	@OriginalMember(owner = "client!add", name = "t", descriptor = "()Z", line = 27)
	@Override
	boolean method1990() {
		return this.aBoolean24;
	}

	@OriginalMember(owner = "client!add", name = "c", descriptor = "(Z)V", line = 31)
	@Override
	void method1976(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class78_Sub1 local3 = this.aClass86_Sub3_22.method6128();
		if (!this.aBoolean24 || local3 == null) {
			return;
		}
		@Pc(21) float local21 = (1.0F - Math.abs(this.aClass86_Sub3_22.aFloatArray23[1])) * 2.0F + 1.0F;
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6195(local3);
		this.aClass86_Sub3_22.method6190(0);
		this.aClass86_Sub3_22.method6195(this.aClass168_1.aClass78_Sub4_3);
		@Pc(43) int local43 = this.aClass166_1.anInt3284;
		OpenGL.glUseProgram(local43);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local43, "normalSampler"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local43, "envMapSampler"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local43, "sunDir"), -this.aClass86_Sub3_22.aFloatArray23[0], -this.aClass86_Sub3_22.aFloatArray23[1], -this.aClass86_Sub3_22.aFloatArray23[2]);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local43, "sunColour"), this.aClass86_Sub3_22.aFloat65 * local21, this.aClass86_Sub3_22.aFloat66 * local21, this.aClass86_Sub3_22.aFloat67 * local21, 1.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local43, "sunExponent"), Math.abs(this.aClass86_Sub3_22.aFloatArray23[1]) * 928.0F + 64.0F);
		this.aBoolean25 = true;
	}

	@OriginalMember(owner = "client!add", name = "d", descriptor = "(Z)V", line = 31)
	@Override
	void method1983(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class78_Sub1 local3 = this.aClass86_Sub3_22.method6128();
		if (!this.aBoolean24 || local3 == null) {
			return;
		}
		@Pc(21) float local21 = (1.0F - Math.abs(this.aClass86_Sub3_22.aFloatArray23[1])) * 2.0F + 1.0F;
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6195(local3);
		this.aClass86_Sub3_22.method6190(0);
		this.aClass86_Sub3_22.method6195(this.aClass168_1.aClass78_Sub4_3);
		@Pc(43) int local43 = this.aClass166_1.anInt3284;
		OpenGL.glUseProgram(local43);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local43, "normalSampler"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local43, "envMapSampler"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local43, "sunDir"), -this.aClass86_Sub3_22.aFloatArray23[0], -this.aClass86_Sub3_22.aFloatArray23[1], -this.aClass86_Sub3_22.aFloatArray23[2]);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local43, "sunColour"), this.aClass86_Sub3_22.aFloat65 * local21, this.aClass86_Sub3_22.aFloat66 * local21, this.aClass86_Sub3_22.aFloat67 * local21, 1.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local43, "sunExponent"), Math.abs(this.aClass86_Sub3_22.aFloatArray23[1]) * 928.0F + 64.0F);
		this.aBoolean25 = true;
	}

	@OriginalMember(owner = "client!add", name = "s", descriptor = "(Z)V", line = 31)
	@Override
	void method1992(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class78_Sub1 local3 = this.aClass86_Sub3_22.method6128();
		if (!this.aBoolean24 || local3 == null) {
			return;
		}
		@Pc(21) float local21 = (1.0F - Math.abs(this.aClass86_Sub3_22.aFloatArray23[1])) * 2.0F + 1.0F;
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6195(local3);
		this.aClass86_Sub3_22.method6190(0);
		this.aClass86_Sub3_22.method6195(this.aClass168_1.aClass78_Sub4_3);
		@Pc(43) int local43 = this.aClass166_1.anInt3284;
		OpenGL.glUseProgram(local43);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local43, "normalSampler"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local43, "envMapSampler"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local43, "sunDir"), -this.aClass86_Sub3_22.aFloatArray23[0], -this.aClass86_Sub3_22.aFloatArray23[1], -this.aClass86_Sub3_22.aFloatArray23[2]);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local43, "sunColour"), this.aClass86_Sub3_22.aFloat65 * local21, this.aClass86_Sub3_22.aFloat66 * local21, this.aClass86_Sub3_22.aFloat67 * local21, 1.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local43, "sunExponent"), Math.abs(this.aClass86_Sub3_22.aFloatArray23[1]) * 928.0F + 64.0F);
		this.aBoolean25 = true;
	}

	@OriginalMember(owner = "client!add", name = "r", descriptor = "(Z)V", line = 31)
	@Override
	void method1985(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class78_Sub1 local3 = this.aClass86_Sub3_22.method6128();
		if (!this.aBoolean24 || local3 == null) {
			return;
		}
		@Pc(21) float local21 = (1.0F - Math.abs(this.aClass86_Sub3_22.aFloatArray23[1])) * 2.0F + 1.0F;
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6195(local3);
		this.aClass86_Sub3_22.method6190(0);
		this.aClass86_Sub3_22.method6195(this.aClass168_1.aClass78_Sub4_3);
		@Pc(43) int local43 = this.aClass166_1.anInt3284;
		OpenGL.glUseProgram(local43);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local43, "normalSampler"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local43, "envMapSampler"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local43, "sunDir"), -this.aClass86_Sub3_22.aFloatArray23[0], -this.aClass86_Sub3_22.aFloatArray23[1], -this.aClass86_Sub3_22.aFloatArray23[2]);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local43, "sunColour"), this.aClass86_Sub3_22.aFloat65 * local21, this.aClass86_Sub3_22.aFloat66 * local21, this.aClass86_Sub3_22.aFloat67 * local21, 1.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local43, "sunExponent"), Math.abs(this.aClass86_Sub3_22.aFloatArray23[1]) * 928.0F + 64.0F);
		this.aBoolean25 = true;
	}

	@OriginalMember(owner = "client!add", name = "g", descriptor = "(Z)V", line = 31)
	@Override
	void method1986(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class78_Sub1 local3 = this.aClass86_Sub3_22.method6128();
		if (!this.aBoolean24 || local3 == null) {
			return;
		}
		@Pc(21) float local21 = (1.0F - Math.abs(this.aClass86_Sub3_22.aFloatArray23[1])) * 2.0F + 1.0F;
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6195(local3);
		this.aClass86_Sub3_22.method6190(0);
		this.aClass86_Sub3_22.method6195(this.aClass168_1.aClass78_Sub4_3);
		@Pc(43) int local43 = this.aClass166_1.anInt3284;
		OpenGL.glUseProgram(local43);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local43, "normalSampler"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local43, "envMapSampler"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local43, "sunDir"), -this.aClass86_Sub3_22.aFloatArray23[0], -this.aClass86_Sub3_22.aFloatArray23[1], -this.aClass86_Sub3_22.aFloatArray23[2]);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local43, "sunColour"), this.aClass86_Sub3_22.aFloat65 * local21, this.aClass86_Sub3_22.aFloat66 * local21, this.aClass86_Sub3_22.aFloat67 * local21, 1.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local43, "sunExponent"), Math.abs(this.aClass86_Sub3_22.aFloatArray23[1]) * 928.0F + 64.0F);
		this.aBoolean25 = true;
	}

	@OriginalMember(owner = "client!add", name = "z", descriptor = "(Z)V", line = 49)
	@Override
	void method1987() {
	}

	@OriginalMember(owner = "client!add", name = "j", descriptor = "(Z)V", line = 49)
	@Override
	void method1988() {
	}

	@OriginalMember(owner = "client!add", name = "i", descriptor = "(Z)V", line = 49)
	@Override
	void method1984() {
	}

	@OriginalMember(owner = "client!add", name = "k", descriptor = "(Z)V", line = 49)
	@Override
	void method1980() {
	}

	@OriginalMember(owner = "client!add", name = "v", descriptor = "(Z)V", line = 49)
	@Override
	void method1977(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!add", name = "l", descriptor = "()V", line = 52)
	@Override
	void method1975() {
		if (!this.aBoolean25) {
			return;
		}
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6195(null);
		this.aClass86_Sub3_22.method6190(0);
		this.aClass86_Sub3_22.method6195(null);
		OpenGL.glUseProgram(0);
		this.aBoolean25 = false;
	}

	@OriginalMember(owner = "client!add", name = "u", descriptor = "()V", line = 52)
	@Override
	void method1989() {
		if (!this.aBoolean25) {
			return;
		}
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6195(null);
		this.aClass86_Sub3_22.method6190(0);
		this.aClass86_Sub3_22.method6195(null);
		OpenGL.glUseProgram(0);
		this.aBoolean25 = false;
	}

	@OriginalMember(owner = "client!add", name = "e", descriptor = "()V", line = 52)
	@Override
	void method1974() {
		if (!this.aBoolean25) {
			return;
		}
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6195(null);
		this.aClass86_Sub3_22.method6190(0);
		this.aClass86_Sub3_22.method6195(null);
		OpenGL.glUseProgram(0);
		this.aBoolean25 = false;
	}

	@OriginalMember(owner = "client!add", name = "f", descriptor = "()V", line = 52)
	@Override
	void method1993() {
		if (!this.aBoolean25) {
			return;
		}
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6195(null);
		this.aClass86_Sub3_22.method6190(0);
		this.aClass86_Sub3_22.method6195(null);
		OpenGL.glUseProgram(0);
		this.aBoolean25 = false;
	}

	@OriginalMember(owner = "client!add", name = "y", descriptor = "(II)V", line = 63)
	@Override
	void method1979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean25) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(41) float local41 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		@Pc(50) float local50 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		@Pc(56) int local56 = arg1 >> 27 & 0xF;
		@Pc(60) int local60 = this.aClass166_1.anInt3284;
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "time"), (float) (local8 * this.aClass86_Sub3_22.anInt723 % 40000) / 40000.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "scale"), local19);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "breakWaterOffset"), local32);
		OpenGL.glUniform2f(OpenGL.glGetUniformLocation(local60, "waveIntensity"), local50, local41);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "waveExponent"), (float) local56);
	}

	@OriginalMember(owner = "client!add", name = "b", descriptor = "(II)V", line = 63)
	@Override
	void method1978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean25) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(41) float local41 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		@Pc(50) float local50 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		@Pc(56) int local56 = arg1 >> 27 & 0xF;
		@Pc(60) int local60 = this.aClass166_1.anInt3284;
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "time"), (float) (local8 * this.aClass86_Sub3_22.anInt723 % 40000) / 40000.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "scale"), local19);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "breakWaterOffset"), local32);
		OpenGL.glUniform2f(OpenGL.glGetUniformLocation(local60, "waveIntensity"), local50, local41);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "waveExponent"), (float) local56);
	}

	@OriginalMember(owner = "client!add", name = "o", descriptor = "(II)V", line = 63)
	@Override
	void method1994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean25) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(41) float local41 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		@Pc(50) float local50 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		@Pc(56) int local56 = arg1 >> 27 & 0xF;
		@Pc(60) int local60 = this.aClass166_1.anInt3284;
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "time"), (float) (local8 * this.aClass86_Sub3_22.anInt723 % 40000) / 40000.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "scale"), local19);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "breakWaterOffset"), local32);
		OpenGL.glUniform2f(OpenGL.glGetUniformLocation(local60, "waveIntensity"), local50, local41);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "waveExponent"), (float) local56);
	}

	@OriginalMember(owner = "client!add", name = "w", descriptor = "(Lclient!bx;I)V", line = 82)
	@Override
	void method1991(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean25) {
			this.aClass86_Sub3_22.method6195(arg0);
			this.aClass86_Sub3_22.method6198(arg1);
		}
	}

	@OriginalMember(owner = "client!add", name = "n", descriptor = "(Lclient!bx;I)V", line = 82)
	@Override
	void method1996(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean25) {
			this.aClass86_Sub3_22.method6195(arg0);
			this.aClass86_Sub3_22.method6198(arg1);
		}
	}
}
