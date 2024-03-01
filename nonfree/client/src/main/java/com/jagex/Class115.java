package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public class Class115 {

	@OriginalMember(owner = "client!cm", name = "p", descriptor = "Ljava/lang/String;")
	static final String aString156 = "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n";

	@OriginalMember(owner = "client!cm", name = "g", descriptor = "Lclient!bs;")
	Class100 aClass100_8;

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "Lclient!abt;")
	final Class21_Sub2 aClass21_Sub2_46;

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Lclient!abt;)V", line = 13)
	Class115(@OriginalArg(0) Class21_Sub2 arg0) {
		this.aClass21_Sub2_46 = arg0;
	}

	@OriginalMember(owner = "client!cm", name = "p", descriptor = "()Z", line = 18)
	boolean method22803() {
		if (this.aClass21_Sub2_46.aBoolean77 && this.aClass21_Sub2_46.aBoolean89 && this.aClass100_8 == null) {
			@Pc(16) Class101 local16 = Class101.method21836(this.aClass21_Sub2_46, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
			if (local16 != null) {
				this.aClass100_8 = Class100.method21834(this.aClass21_Sub2_46, new Class101[] { local16 });
			}
		}
		return this.aClass100_8 != null;
	}

	@OriginalMember(owner = "client!cm", name = "g", descriptor = "()Z", line = 18)
	boolean method22806() {
		if (this.aClass21_Sub2_46.aBoolean77 && this.aClass21_Sub2_46.aBoolean89 && this.aClass100_8 == null) {
			@Pc(16) Class101 local16 = Class101.method21836(this.aClass21_Sub2_46, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
			if (local16 != null) {
				this.aClass100_8 = Class100.method21834(this.aClass21_Sub2_46, new Class101[] { local16 });
			}
		}
		return this.aClass100_8 != null;
	}

	@OriginalMember(owner = "client!cm", name = "h", descriptor = "(Lclient!zg;Lclient!zg;F)Z", line = 28)
	boolean method22804(@OriginalArg(0) Class4_Sub4 arg0, @OriginalArg(1) Class4_Sub4 arg1, @OriginalArg(2) float arg2) {
		if (!this.method22803()) {
			return false;
		}
		@Pc(8) Class19_Sub1_Sub3 local8 = this.aClass21_Sub2_46.aClass19_Sub1_Sub3_1;
		@Pc(20) Class3_Sub1_Sub1 local20 = new Class3_Sub1_Sub1(this.aClass21_Sub2_46, Class121.aClass121_17, Class127.aClass127_23, arg0.anInt5564, arg0.anInt5563);
		@Pc(22) boolean local22 = false;
		this.aClass21_Sub2_46.method17044(local8);
		local8.method20882(0, local20);
		if (local8.method20883()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg0.anInt5564, arg0.anInt5563);
			OpenGL.glUseProgram(this.aClass100_8.anInt2963);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(this.aClass100_8.anInt2963, "heightMap"), 0);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(this.aClass100_8.anInt2963, "rcpRelief"), 1.0F / arg2);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation(this.aClass100_8.anInt2963, "sampleSize"), 1.0F / (float) arg1.anInt5564, 1.0F / (float) arg1.anInt5563);
			for (@Pc(94) int local94 = 0; local94 < arg0.anInt5565; local94++) {
				@Pc(105) float local105 = (float) local94 / (float) arg0.anInt5565;
				this.aClass21_Sub2_46.method4074(arg1);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord3f(0.0F, 0.0F, local105);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 0.0F, local105);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 1.0F, local105);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3f(0.0F, 1.0F, local105);
				OpenGL.glVertex2f(0.0F, 1.0F);
				OpenGL.glEnd();
				arg0.method33744(0, 0, local94, arg0.anInt5564, arg0.anInt5563, 0, 0);
			}
			OpenGL.glUseProgram(0);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			local22 = true;
		}
		local8.method20882(0, null);
		this.aClass21_Sub2_46.method17263(local8);
		return local22;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!zg;Lclient!zg;F)Z", line = 28)
	boolean method22805(@OriginalArg(0) Class4_Sub4 arg0, @OriginalArg(1) Class4_Sub4 arg1, @OriginalArg(2) float arg2) {
		if (!this.method22803()) {
			return false;
		}
		@Pc(8) Class19_Sub1_Sub3 local8 = this.aClass21_Sub2_46.aClass19_Sub1_Sub3_1;
		@Pc(20) Class3_Sub1_Sub1 local20 = new Class3_Sub1_Sub1(this.aClass21_Sub2_46, Class121.aClass121_17, Class127.aClass127_23, arg0.anInt5564, arg0.anInt5563);
		@Pc(22) boolean local22 = false;
		this.aClass21_Sub2_46.method17044(local8);
		local8.method20882(0, local20);
		if (local8.method20883()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg0.anInt5564, arg0.anInt5563);
			OpenGL.glUseProgram(this.aClass100_8.anInt2963);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(this.aClass100_8.anInt2963, "heightMap"), 0);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(this.aClass100_8.anInt2963, "rcpRelief"), 1.0F / arg2);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation(this.aClass100_8.anInt2963, "sampleSize"), 1.0F / (float) arg1.anInt5564, 1.0F / (float) arg1.anInt5563);
			for (@Pc(94) int local94 = 0; local94 < arg0.anInt5565; local94++) {
				@Pc(105) float local105 = (float) local94 / (float) arg0.anInt5565;
				this.aClass21_Sub2_46.method4074(arg1);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord3f(0.0F, 0.0F, local105);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 0.0F, local105);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 1.0F, local105);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3f(0.0F, 1.0F, local105);
				OpenGL.glVertex2f(0.0F, 1.0F);
				OpenGL.glEnd();
				arg0.method33744(0, 0, local94, arg0.anInt5564, arg0.anInt5563, 0, 0);
			}
			OpenGL.glUseProgram(0);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			local22 = true;
		}
		local8.method20882(0, null);
		this.aClass21_Sub2_46.method17263(local8);
		return local22;
	}

	@OriginalMember(owner = "client!cm", name = "l", descriptor = "(Lclient!zg;Lclient!zg;F)Z", line = 28)
	boolean method22807(@OriginalArg(0) Class4_Sub4 arg0, @OriginalArg(1) Class4_Sub4 arg1, @OriginalArg(2) float arg2) {
		if (!this.method22803()) {
			return false;
		}
		@Pc(8) Class19_Sub1_Sub3 local8 = this.aClass21_Sub2_46.aClass19_Sub1_Sub3_1;
		@Pc(20) Class3_Sub1_Sub1 local20 = new Class3_Sub1_Sub1(this.aClass21_Sub2_46, Class121.aClass121_17, Class127.aClass127_23, arg0.anInt5564, arg0.anInt5563);
		@Pc(22) boolean local22 = false;
		this.aClass21_Sub2_46.method17044(local8);
		local8.method20882(0, local20);
		if (local8.method20883()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg0.anInt5564, arg0.anInt5563);
			OpenGL.glUseProgram(this.aClass100_8.anInt2963);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(this.aClass100_8.anInt2963, "heightMap"), 0);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(this.aClass100_8.anInt2963, "rcpRelief"), 1.0F / arg2);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation(this.aClass100_8.anInt2963, "sampleSize"), 1.0F / (float) arg1.anInt5564, 1.0F / (float) arg1.anInt5563);
			for (@Pc(94) int local94 = 0; local94 < arg0.anInt5565; local94++) {
				@Pc(105) float local105 = (float) local94 / (float) arg0.anInt5565;
				this.aClass21_Sub2_46.method4074(arg1);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord3f(0.0F, 0.0F, local105);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 0.0F, local105);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 1.0F, local105);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3f(0.0F, 1.0F, local105);
				OpenGL.glVertex2f(0.0F, 1.0F);
				OpenGL.glEnd();
				arg0.method33744(0, 0, local94, arg0.anInt5564, arg0.anInt5563, 0, 0);
			}
			OpenGL.glUseProgram(0);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			local22 = true;
		}
		local8.method20882(0, null);
		this.aClass21_Sub2_46.method17263(local8);
		return local22;
	}
}
