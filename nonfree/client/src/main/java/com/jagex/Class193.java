package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cp")
public class Class193 {

	@OriginalMember(owner = "client!cp", name = "p", descriptor = "Ljava/lang/String;")
	static final String aString166 = "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n";

	@OriginalMember(owner = "client!cp", name = "v", descriptor = "Lclient!bd;")
	Class166 aClass166_8;

	@OriginalMember(owner = "client!cp", name = "c", descriptor = "Lclient!aeq;")
	final Class86_Sub3 aClass86_Sub3_46;

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(Lclient!aeq;)V", line = 13)
	Class193(@OriginalArg(0) Class86_Sub3 arg0) {
		this.aClass86_Sub3_46 = arg0;
	}

	@OriginalMember(owner = "client!cp", name = "p", descriptor = "()Z", line = 18)
	boolean method25436() {
		if (this.aClass86_Sub3_46.aBoolean134 && this.aClass86_Sub3_46.aBoolean133 && this.aClass166_8 == null) {
			@Pc(16) Class181 local16 = Class181.method24564(this.aClass86_Sub3_46, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
			if (local16 != null) {
				this.aClass166_8 = Class166.method24388(this.aClass86_Sub3_46, new Class181[] { local16 });
			}
		}
		return this.aClass166_8 != null;
	}

	@OriginalMember(owner = "client!cp", name = "c", descriptor = "(Lclient!adx;Lclient!adx;F)Z", line = 28)
	boolean method25437(@OriginalArg(0) Class78_Sub4 arg0, @OriginalArg(1) Class78_Sub4 arg1, @OriginalArg(2) float arg2) {
		if (!this.method25436()) {
			return false;
		}
		@Pc(8) Class92_Sub1_Sub1 local8 = this.aClass86_Sub3_46.aClass92_Sub1_Sub1_1;
		@Pc(20) Class77_Sub1_Sub1 local20 = new Class77_Sub1_Sub1(this.aClass86_Sub3_46, Class212.aClass212_18, Class206.aClass206_23, arg0.anInt315, arg0.anInt316);
		@Pc(22) boolean local22 = false;
		this.aClass86_Sub3_46.method19968(local8);
		local8.method23513(0, local20);
		if (local8.method23514()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg0.anInt315, arg0.anInt316);
			OpenGL.glUseProgram(this.aClass166_8.anInt3284);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(this.aClass166_8.anInt3284, "heightMap"), 0);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(this.aClass166_8.anInt3284, "rcpRelief"), 1.0F / arg2);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation(this.aClass166_8.anInt3284, "sampleSize"), 1.0F / (float) arg1.anInt315, 1.0F / (float) arg1.anInt316);
			for (@Pc(94) int local94 = 0; local94 < arg0.anInt317; local94++) {
				@Pc(105) float local105 = (float) local94 / (float) arg0.anInt317;
				this.aClass86_Sub3_46.method6195(arg1);
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
				arg0.method1929(0, 0, local94, arg0.anInt315, arg0.anInt316, 0, 0);
			}
			OpenGL.glUseProgram(0);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			local22 = true;
		}
		local8.method23513(0, null);
		this.aClass86_Sub3_46.method19972(local8);
		return local22;
	}

	@OriginalMember(owner = "client!cp", name = "v", descriptor = "(Lclient!adx;Lclient!adx;F)Z", line = 28)
	boolean method25438(@OriginalArg(0) Class78_Sub4 arg0, @OriginalArg(1) Class78_Sub4 arg1, @OriginalArg(2) float arg2) {
		if (!this.method25436()) {
			return false;
		}
		@Pc(8) Class92_Sub1_Sub1 local8 = this.aClass86_Sub3_46.aClass92_Sub1_Sub1_1;
		@Pc(20) Class77_Sub1_Sub1 local20 = new Class77_Sub1_Sub1(this.aClass86_Sub3_46, Class212.aClass212_18, Class206.aClass206_23, arg0.anInt315, arg0.anInt316);
		@Pc(22) boolean local22 = false;
		this.aClass86_Sub3_46.method19968(local8);
		local8.method23513(0, local20);
		if (local8.method23514()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg0.anInt315, arg0.anInt316);
			OpenGL.glUseProgram(this.aClass166_8.anInt3284);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(this.aClass166_8.anInt3284, "heightMap"), 0);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(this.aClass166_8.anInt3284, "rcpRelief"), 1.0F / arg2);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation(this.aClass166_8.anInt3284, "sampleSize"), 1.0F / (float) arg1.anInt315, 1.0F / (float) arg1.anInt316);
			for (@Pc(94) int local94 = 0; local94 < arg0.anInt317; local94++) {
				@Pc(105) float local105 = (float) local94 / (float) arg0.anInt317;
				this.aClass86_Sub3_46.method6195(arg1);
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
				arg0.method1929(0, 0, local94, arg0.anInt315, arg0.anInt316, 0, 0);
			}
			OpenGL.glUseProgram(0);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			local22 = true;
		}
		local8.method23513(0, null);
		this.aClass86_Sub3_46.method19972(local8);
		return local22;
	}

	@OriginalMember(owner = "client!cp", name = "l", descriptor = "(Lclient!adx;Lclient!adx;F)Z", line = 28)
	boolean method25439(@OriginalArg(0) Class78_Sub4 arg0, @OriginalArg(1) Class78_Sub4 arg1, @OriginalArg(2) float arg2) {
		if (!this.method25436()) {
			return false;
		}
		@Pc(8) Class92_Sub1_Sub1 local8 = this.aClass86_Sub3_46.aClass92_Sub1_Sub1_1;
		@Pc(20) Class77_Sub1_Sub1 local20 = new Class77_Sub1_Sub1(this.aClass86_Sub3_46, Class212.aClass212_18, Class206.aClass206_23, arg0.anInt315, arg0.anInt316);
		@Pc(22) boolean local22 = false;
		this.aClass86_Sub3_46.method19968(local8);
		local8.method23513(0, local20);
		if (local8.method23514()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg0.anInt315, arg0.anInt316);
			OpenGL.glUseProgram(this.aClass166_8.anInt3284);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(this.aClass166_8.anInt3284, "heightMap"), 0);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(this.aClass166_8.anInt3284, "rcpRelief"), 1.0F / arg2);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation(this.aClass166_8.anInt3284, "sampleSize"), 1.0F / (float) arg1.anInt315, 1.0F / (float) arg1.anInt316);
			for (@Pc(94) int local94 = 0; local94 < arg0.anInt317; local94++) {
				@Pc(105) float local105 = (float) local94 / (float) arg0.anInt317;
				this.aClass86_Sub3_46.method6195(arg1);
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
				arg0.method1929(0, 0, local94, arg0.anInt315, arg0.anInt316, 0, 0);
			}
			OpenGL.glUseProgram(0);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			local22 = true;
		}
		local8.method23513(0, null);
		this.aClass86_Sub3_46.method19972(local8);
		return local22;
	}

	@OriginalMember(owner = "client!cp", name = "y", descriptor = "(Lclient!adx;Lclient!adx;F)Z", line = 28)
	boolean method25440(@OriginalArg(0) Class78_Sub4 arg0, @OriginalArg(1) Class78_Sub4 arg1, @OriginalArg(2) float arg2) {
		if (!this.method25436()) {
			return false;
		}
		@Pc(8) Class92_Sub1_Sub1 local8 = this.aClass86_Sub3_46.aClass92_Sub1_Sub1_1;
		@Pc(20) Class77_Sub1_Sub1 local20 = new Class77_Sub1_Sub1(this.aClass86_Sub3_46, Class212.aClass212_18, Class206.aClass206_23, arg0.anInt315, arg0.anInt316);
		@Pc(22) boolean local22 = false;
		this.aClass86_Sub3_46.method19968(local8);
		local8.method23513(0, local20);
		if (local8.method23514()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg0.anInt315, arg0.anInt316);
			OpenGL.glUseProgram(this.aClass166_8.anInt3284);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(this.aClass166_8.anInt3284, "heightMap"), 0);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(this.aClass166_8.anInt3284, "rcpRelief"), 1.0F / arg2);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation(this.aClass166_8.anInt3284, "sampleSize"), 1.0F / (float) arg1.anInt315, 1.0F / (float) arg1.anInt316);
			for (@Pc(94) int local94 = 0; local94 < arg0.anInt317; local94++) {
				@Pc(105) float local105 = (float) local94 / (float) arg0.anInt317;
				this.aClass86_Sub3_46.method6195(arg1);
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
				arg0.method1929(0, 0, local94, arg0.anInt315, arg0.anInt316, 0, 0);
			}
			OpenGL.glUseProgram(0);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			local22 = true;
		}
		local8.method23513(0, null);
		this.aClass86_Sub3_46.method19972(local8);
		return local22;
	}
}
