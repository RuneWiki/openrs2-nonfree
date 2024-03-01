package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aar")
public class Class7_Sub4 extends Class7 {

	@OriginalMember(owner = "client!aar", name = "g", descriptor = "Ljava/lang/String;")
	static final String aString14 = "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n";

	@OriginalMember(owner = "client!aar", name = "a", descriptor = "Ljava/lang/String;")
	static final String aString15 = "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n";

	@OriginalMember(owner = "client!aar", name = "h", descriptor = "Z")
	boolean aBoolean32 = false;

	@OriginalMember(owner = "client!aar", name = "x", descriptor = "Z")
	boolean aBoolean33 = false;

	@OriginalMember(owner = "client!aar", name = "s", descriptor = "Lclient!bi;")
	Class92 aClass92_3;

	@OriginalMember(owner = "client!aar", name = "l", descriptor = "Lclient!bs;")
	Class100 aClass100_1;

	@OriginalMember(owner = "client!aar", name = "<init>", descriptor = "(Lclient!abt;Lclient!bi;)V", line = 16)
	Class7_Sub4(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) Class92 arg1) {
		super(arg0);
		this.aClass92_3 = arg1;
		if (this.aClass92_3.aClass4_Sub4_2 != null && this.aClass21_Sub2_22.aBoolean87 && this.aClass21_Sub2_22.aBoolean89) {
			@Pc(29) Class101 local29 = Class101.method21836(this.aClass21_Sub2_22, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(35) Class101 local35 = Class101.method21836(this.aClass21_Sub2_22, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			this.aClass100_1 = Class100.method21834(this.aClass21_Sub2_22, new Class101[] { local29, local35 });
			this.aBoolean33 = this.aClass100_1 != null;
		}
	}

	@OriginalMember(owner = "client!aar", name = "y", descriptor = "()Z", line = 27)
	@Override
	boolean method1230() {
		return this.aBoolean33;
	}

	@OriginalMember(owner = "client!aar", name = "p", descriptor = "()Z", line = 27)
	@Override
	boolean method1222() {
		return this.aBoolean33;
	}

	@OriginalMember(owner = "client!aar", name = "s", descriptor = "()Z", line = 27)
	@Override
	boolean method1226() {
		return this.aBoolean33;
	}

	@OriginalMember(owner = "client!aar", name = "u", descriptor = "()Z", line = 27)
	@Override
	boolean method1233() {
		return this.aBoolean33;
	}

	@OriginalMember(owner = "client!aar", name = "a", descriptor = "(Z)V", line = 31)
	@Override
	void method1223(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class4_Sub2 local3 = this.aClass21_Sub2_22.method4057();
		if (!this.aBoolean33 || local3 == null) {
			return;
		}
		@Pc(21) float local21 = (1.0F - Math.abs(this.aClass21_Sub2_22.aFloatArray26[1])) * 2.0F + 1.0F;
		this.aClass21_Sub2_22.method4073(1);
		this.aClass21_Sub2_22.method4074(local3);
		this.aClass21_Sub2_22.method4073(0);
		this.aClass21_Sub2_22.method4074(this.aClass92_3.aClass4_Sub4_2);
		@Pc(43) int local43 = this.aClass100_1.anInt2963;
		OpenGL.glUseProgram(local43);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local43, "normalSampler"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local43, "envMapSampler"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local43, "sunDir"), -this.aClass21_Sub2_22.aFloatArray26[0], -this.aClass21_Sub2_22.aFloatArray26[1], -this.aClass21_Sub2_22.aFloatArray26[2]);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local43, "sunColour"), this.aClass21_Sub2_22.aFloat52 * local21, this.aClass21_Sub2_22.aFloat50 * local21, this.aClass21_Sub2_22.aFloat53 * local21, 1.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local43, "sunExponent"), Math.abs(this.aClass21_Sub2_22.aFloatArray26[1]) * 928.0F + 64.0F);
		this.aBoolean32 = true;
	}

	@OriginalMember(owner = "client!aar", name = "b", descriptor = "(Z)V", line = 31)
	@Override
	void method1231(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class4_Sub2 local3 = this.aClass21_Sub2_22.method4057();
		if (!this.aBoolean33 || local3 == null) {
			return;
		}
		@Pc(21) float local21 = (1.0F - Math.abs(this.aClass21_Sub2_22.aFloatArray26[1])) * 2.0F + 1.0F;
		this.aClass21_Sub2_22.method4073(1);
		this.aClass21_Sub2_22.method4074(local3);
		this.aClass21_Sub2_22.method4073(0);
		this.aClass21_Sub2_22.method4074(this.aClass92_3.aClass4_Sub4_2);
		@Pc(43) int local43 = this.aClass100_1.anInt2963;
		OpenGL.glUseProgram(local43);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local43, "normalSampler"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local43, "envMapSampler"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local43, "sunDir"), -this.aClass21_Sub2_22.aFloatArray26[0], -this.aClass21_Sub2_22.aFloatArray26[1], -this.aClass21_Sub2_22.aFloatArray26[2]);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local43, "sunColour"), this.aClass21_Sub2_22.aFloat52 * local21, this.aClass21_Sub2_22.aFloat50 * local21, this.aClass21_Sub2_22.aFloat53 * local21, 1.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local43, "sunExponent"), Math.abs(this.aClass21_Sub2_22.aFloatArray26[1]) * 928.0F + 64.0F);
		this.aBoolean32 = true;
	}

	@OriginalMember(owner = "client!aar", name = "c", descriptor = "(Z)V", line = 31)
	@Override
	void method1225(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class4_Sub2 local3 = this.aClass21_Sub2_22.method4057();
		if (!this.aBoolean33 || local3 == null) {
			return;
		}
		@Pc(21) float local21 = (1.0F - Math.abs(this.aClass21_Sub2_22.aFloatArray26[1])) * 2.0F + 1.0F;
		this.aClass21_Sub2_22.method4073(1);
		this.aClass21_Sub2_22.method4074(local3);
		this.aClass21_Sub2_22.method4073(0);
		this.aClass21_Sub2_22.method4074(this.aClass92_3.aClass4_Sub4_2);
		@Pc(43) int local43 = this.aClass100_1.anInt2963;
		OpenGL.glUseProgram(local43);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local43, "normalSampler"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local43, "envMapSampler"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local43, "sunDir"), -this.aClass21_Sub2_22.aFloatArray26[0], -this.aClass21_Sub2_22.aFloatArray26[1], -this.aClass21_Sub2_22.aFloatArray26[2]);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local43, "sunColour"), this.aClass21_Sub2_22.aFloat52 * local21, this.aClass21_Sub2_22.aFloat50 * local21, this.aClass21_Sub2_22.aFloat53 * local21, 1.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local43, "sunExponent"), Math.abs(this.aClass21_Sub2_22.aFloatArray26[1]) * 928.0F + 64.0F);
		this.aBoolean32 = true;
	}

	@OriginalMember(owner = "client!aar", name = "z", descriptor = "(Z)V", line = 31)
	@Override
	void method1228(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class4_Sub2 local3 = this.aClass21_Sub2_22.method4057();
		if (!this.aBoolean33 || local3 == null) {
			return;
		}
		@Pc(21) float local21 = (1.0F - Math.abs(this.aClass21_Sub2_22.aFloatArray26[1])) * 2.0F + 1.0F;
		this.aClass21_Sub2_22.method4073(1);
		this.aClass21_Sub2_22.method4074(local3);
		this.aClass21_Sub2_22.method4073(0);
		this.aClass21_Sub2_22.method4074(this.aClass92_3.aClass4_Sub4_2);
		@Pc(43) int local43 = this.aClass100_1.anInt2963;
		OpenGL.glUseProgram(local43);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local43, "normalSampler"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local43, "envMapSampler"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local43, "sunDir"), -this.aClass21_Sub2_22.aFloatArray26[0], -this.aClass21_Sub2_22.aFloatArray26[1], -this.aClass21_Sub2_22.aFloatArray26[2]);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local43, "sunColour"), this.aClass21_Sub2_22.aFloat52 * local21, this.aClass21_Sub2_22.aFloat50 * local21, this.aClass21_Sub2_22.aFloat53 * local21, 1.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local43, "sunExponent"), Math.abs(this.aClass21_Sub2_22.aFloatArray26[1]) * 928.0F + 64.0F);
		this.aBoolean32 = true;
	}

	@OriginalMember(owner = "client!aar", name = "g", descriptor = "(Z)V", line = 49)
	@Override
	void method1224(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aar", name = "j", descriptor = "(Z)V", line = 49)
	@Override
	void method1234() {
	}

	@OriginalMember(owner = "client!aar", name = "l", descriptor = "()V", line = 52)
	@Override
	void method1221() {
		if (!this.aBoolean32) {
			return;
		}
		this.aClass21_Sub2_22.method4073(1);
		this.aClass21_Sub2_22.method4074(null);
		this.aClass21_Sub2_22.method4073(0);
		this.aClass21_Sub2_22.method4074(null);
		OpenGL.glUseProgram(0);
		this.aBoolean32 = false;
	}

	@OriginalMember(owner = "client!aar", name = "d", descriptor = "()V", line = 52)
	@Override
	void method1238() {
		if (!this.aBoolean32) {
			return;
		}
		this.aClass21_Sub2_22.method4073(1);
		this.aClass21_Sub2_22.method4074(null);
		this.aClass21_Sub2_22.method4073(0);
		this.aClass21_Sub2_22.method4074(null);
		OpenGL.glUseProgram(0);
		this.aBoolean32 = false;
	}

	@OriginalMember(owner = "client!aar", name = "n", descriptor = "()V", line = 52)
	@Override
	void method1229() {
		if (!this.aBoolean32) {
			return;
		}
		this.aClass21_Sub2_22.method4073(1);
		this.aClass21_Sub2_22.method4074(null);
		this.aClass21_Sub2_22.method4073(0);
		this.aClass21_Sub2_22.method4074(null);
		OpenGL.glUseProgram(0);
		this.aBoolean32 = false;
	}

	@OriginalMember(owner = "client!aar", name = "e", descriptor = "()V", line = 52)
	@Override
	void method1236() {
		if (!this.aBoolean32) {
			return;
		}
		this.aClass21_Sub2_22.method4073(1);
		this.aClass21_Sub2_22.method4074(null);
		this.aClass21_Sub2_22.method4073(0);
		this.aClass21_Sub2_22.method4074(null);
		OpenGL.glUseProgram(0);
		this.aBoolean32 = false;
	}

	@OriginalMember(owner = "client!aar", name = "r", descriptor = "()V", line = 52)
	@Override
	void method1237() {
		if (!this.aBoolean32) {
			return;
		}
		this.aClass21_Sub2_22.method4073(1);
		this.aClass21_Sub2_22.method4074(null);
		this.aClass21_Sub2_22.method4073(0);
		this.aClass21_Sub2_22.method4074(null);
		OpenGL.glUseProgram(0);
		this.aBoolean32 = false;
	}

	@OriginalMember(owner = "client!aar", name = "q", descriptor = "()V", line = 52)
	@Override
	void method1239() {
		if (!this.aBoolean32) {
			return;
		}
		this.aClass21_Sub2_22.method4073(1);
		this.aClass21_Sub2_22.method4074(null);
		this.aClass21_Sub2_22.method4073(0);
		this.aClass21_Sub2_22.method4074(null);
		OpenGL.glUseProgram(0);
		this.aBoolean32 = false;
	}

	@OriginalMember(owner = "client!aar", name = "h", descriptor = "(II)V", line = 63)
	@Override
	void method1232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean32) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(41) float local41 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		@Pc(50) float local50 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		@Pc(56) int local56 = arg1 >> 27 & 0xF;
		@Pc(60) int local60 = this.aClass100_1.anInt2963;
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "time"), (float) (local8 * this.aClass21_Sub2_22.anInt443 % 40000) / 40000.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "scale"), local19);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "breakWaterOffset"), local32);
		OpenGL.glUniform2f(OpenGL.glGetUniformLocation(local60, "waveIntensity"), local50, local41);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "waveExponent"), (float) local56);
	}

	@OriginalMember(owner = "client!aar", name = "m", descriptor = "(II)V", line = 63)
	@Override
	void method1235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean32) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(41) float local41 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		@Pc(50) float local50 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		@Pc(56) int local56 = arg1 >> 27 & 0xF;
		@Pc(60) int local60 = this.aClass100_1.anInt2963;
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "time"), (float) (local8 * this.aClass21_Sub2_22.anInt443 % 40000) / 40000.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "scale"), local19);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "breakWaterOffset"), local32);
		OpenGL.glUniform2f(OpenGL.glGetUniformLocation(local60, "waveIntensity"), local50, local41);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "waveExponent"), (float) local56);
	}

	@OriginalMember(owner = "client!aar", name = "x", descriptor = "(Lclient!bf;I)V", line = 82)
	@Override
	void method1227(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean32) {
			this.aClass21_Sub2_22.method4074(arg0);
			this.aClass21_Sub2_22.method4115(arg1);
		}
	}

	@OriginalMember(owner = "client!aar", name = "v", descriptor = "(Lclient!bf;I)V", line = 82)
	@Override
	void method1240(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean32) {
			this.aClass21_Sub2_22.method4074(arg0);
			this.aClass21_Sub2_22.method4115(arg1);
		}
	}

	@OriginalMember(owner = "client!aar", name = "t", descriptor = "(Lclient!bf;I)V", line = 82)
	@Override
	void method1241(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean32) {
			this.aClass21_Sub2_22.method4074(arg0);
			this.aClass21_Sub2_22.method4115(arg1);
		}
	}
}
