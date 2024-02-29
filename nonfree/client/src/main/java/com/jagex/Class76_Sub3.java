package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adl")
public class Class76_Sub3 extends Class76 {

	@OriginalMember(owner = "client!adl", name = "v", descriptor = "C")
	static final char aChar1 = '\u0000';

	@OriginalMember(owner = "client!adl", name = "l", descriptor = "C")
	static final char aChar2 = '\u0001';

	@OriginalMember(owner = "client!adl", name = "c", descriptor = "Ljava/lang/String;")
	static final String aString18 = "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND";

	@OriginalMember(owner = "client!adl", name = "s", descriptor = "[F")
	static final float[] aFloatArray2 = new float[4];

	@OriginalMember(owner = "client!adl", name = "w", descriptor = "I")
	int anInt268;

	@OriginalMember(owner = "client!adl", name = "y", descriptor = "Lclient!bg;")
	Class169 aClass169_1;

	@OriginalMember(owner = "client!adl", name = "q", descriptor = "F")
	float aFloat1;

	@OriginalMember(owner = "client!adl", name = "d", descriptor = "Lclient!bf;")
	final Class168 aClass168_3;

	@OriginalMember(owner = "client!adl", name = "x", descriptor = "Lclient!bt;")
	Class178 aClass178_1;

	@OriginalMember(owner = "client!adl", name = "t", descriptor = "[F")
	float[] aFloatArray1;

	@OriginalMember(owner = "client!adl", name = "<init>", descriptor = "(Lclient!aeq;Lclient!bf;)V", line = 23)
	Class76_Sub3(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) Class168 arg1) {
		super(arg0);
		this.aClass168_3 = arg1;
		if (this.aClass86_Sub3_22.aBoolean131 && this.aClass86_Sub3_22.anInt718 >= 2) {
			this.aClass178_1 = Class178.method24557(this.aClass86_Sub3_22, 34336, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
			if (this.aClass178_1 == null) {
				return;
			}
			@Pc(36) int[][] local36 = Class125.method12681(64, 256, 4, 4, 3, 0.4F, false);
			@Pc(47) int[][] local47 = Class125.method12681(64, 256, 4, 4, 3, 0.4F, false);
			@Pc(49) int local49 = 0;
			this.aFloatArray1 = new float[32768];
			for (@Pc(55) int local55 = 0; local55 < 256; local55++) {
				@Pc(62) int[] local62 = local36[local55];
				@Pc(66) int[] local66 = local47[local55];
				for (@Pc(68) int local68 = 0; local68 < 64; local68++) {
					this.aFloatArray1[local49++] = (float) local62[local68] / 4096.0F;
					this.aFloatArray1[local49++] = (float) local66[local68] / 4096.0F;
				}
			}
			this.method1552();
		}
	}

	@OriginalMember(owner = "client!adl", name = "p", descriptor = "()Z", line = 45)
	@Override
	boolean method1995() {
		return true;
	}

	@OriginalMember(owner = "client!adl", name = "t", descriptor = "()Z", line = 45)
	@Override
	boolean method1990() {
		return true;
	}

	@OriginalMember(owner = "client!adl", name = "q", descriptor = "()Z", line = 45)
	@Override
	boolean method1981() {
		return true;
	}

	@OriginalMember(owner = "client!adl", name = "x", descriptor = "()Z", line = 45)
	@Override
	boolean method1982() {
		return true;
	}

	@OriginalMember(owner = "client!adl", name = "m", descriptor = "()V", line = 49)
	void method1547() {
		this.aClass169_1 = new Class169(this.aClass86_Sub3_22, 2);
		this.aClass169_1.method24412(0);
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6216(-16777216);
		this.aClass86_Sub3_22.method6207(260, 7681);
		this.aClass86_Sub3_22.method6214(0, 34166, 770);
		this.aClass86_Sub3_22.method6190(0);
		OpenGL.glBindProgramARB(34336, this.aClass178_1.anInt3309);
		OpenGL.glEnable(34336);
		this.aClass169_1.method24414();
		this.aClass169_1.method24412(1);
		this.aClass86_Sub3_22.method6190(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		this.aClass86_Sub3_22.method6198(0);
		this.aClass86_Sub3_22.method6214(0, 5890, 770);
		this.aClass86_Sub3_22.method6190(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		this.aClass169_1.method24414();
	}

	@OriginalMember(owner = "client!adl", name = "h", descriptor = "()V", line = 49)
	void method1548() {
		this.aClass169_1 = new Class169(this.aClass86_Sub3_22, 2);
		this.aClass169_1.method24412(0);
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6216(-16777216);
		this.aClass86_Sub3_22.method6207(260, 7681);
		this.aClass86_Sub3_22.method6214(0, 34166, 770);
		this.aClass86_Sub3_22.method6190(0);
		OpenGL.glBindProgramARB(34336, this.aClass178_1.anInt3309);
		OpenGL.glEnable(34336);
		this.aClass169_1.method24414();
		this.aClass169_1.method24412(1);
		this.aClass86_Sub3_22.method6190(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		this.aClass86_Sub3_22.method6198(0);
		this.aClass86_Sub3_22.method6214(0, 5890, 770);
		this.aClass86_Sub3_22.method6190(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		this.aClass169_1.method24414();
	}

	@OriginalMember(owner = "client!adl", name = "ag", descriptor = "()V", line = 49)
	void method1549() {
		this.aClass169_1 = new Class169(this.aClass86_Sub3_22, 2);
		this.aClass169_1.method24412(0);
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6216(-16777216);
		this.aClass86_Sub3_22.method6207(260, 7681);
		this.aClass86_Sub3_22.method6214(0, 34166, 770);
		this.aClass86_Sub3_22.method6190(0);
		OpenGL.glBindProgramARB(34336, this.aClass178_1.anInt3309);
		OpenGL.glEnable(34336);
		this.aClass169_1.method24414();
		this.aClass169_1.method24412(1);
		this.aClass86_Sub3_22.method6190(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		this.aClass86_Sub3_22.method6198(0);
		this.aClass86_Sub3_22.method6214(0, 5890, 770);
		this.aClass86_Sub3_22.method6190(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		this.aClass169_1.method24414();
	}

	@OriginalMember(owner = "client!adl", name = "ai", descriptor = "()V", line = 49)
	void method1550() {
		this.aClass169_1 = new Class169(this.aClass86_Sub3_22, 2);
		this.aClass169_1.method24412(0);
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6216(-16777216);
		this.aClass86_Sub3_22.method6207(260, 7681);
		this.aClass86_Sub3_22.method6214(0, 34166, 770);
		this.aClass86_Sub3_22.method6190(0);
		OpenGL.glBindProgramARB(34336, this.aClass178_1.anInt3309);
		OpenGL.glEnable(34336);
		this.aClass169_1.method24414();
		this.aClass169_1.method24412(1);
		this.aClass86_Sub3_22.method6190(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		this.aClass86_Sub3_22.method6198(0);
		this.aClass86_Sub3_22.method6214(0, 5890, 770);
		this.aClass86_Sub3_22.method6190(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		this.aClass169_1.method24414();
	}

	@OriginalMember(owner = "client!adl", name = "aj", descriptor = "()V", line = 49)
	void method1551() {
		this.aClass169_1 = new Class169(this.aClass86_Sub3_22, 2);
		this.aClass169_1.method24412(0);
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6216(-16777216);
		this.aClass86_Sub3_22.method6207(260, 7681);
		this.aClass86_Sub3_22.method6214(0, 34166, 770);
		this.aClass86_Sub3_22.method6190(0);
		OpenGL.glBindProgramARB(34336, this.aClass178_1.anInt3309);
		OpenGL.glEnable(34336);
		this.aClass169_1.method24414();
		this.aClass169_1.method24412(1);
		this.aClass86_Sub3_22.method6190(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		this.aClass86_Sub3_22.method6198(0);
		this.aClass86_Sub3_22.method6214(0, 5890, 770);
		this.aClass86_Sub3_22.method6190(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		this.aClass169_1.method24414();
	}

	@OriginalMember(owner = "client!adl", name = "a", descriptor = "()V", line = 49)
	void method1552() {
		this.aClass169_1 = new Class169(this.aClass86_Sub3_22, 2);
		this.aClass169_1.method24412(0);
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6216(-16777216);
		this.aClass86_Sub3_22.method6207(260, 7681);
		this.aClass86_Sub3_22.method6214(0, 34166, 770);
		this.aClass86_Sub3_22.method6190(0);
		OpenGL.glBindProgramARB(34336, this.aClass178_1.anInt3309);
		OpenGL.glEnable(34336);
		this.aClass169_1.method24414();
		this.aClass169_1.method24412(1);
		this.aClass86_Sub3_22.method6190(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		this.aClass86_Sub3_22.method6198(0);
		this.aClass86_Sub3_22.method6214(0, 5890, 770);
		this.aClass86_Sub3_22.method6190(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		this.aClass169_1.method24414();
	}

	@OriginalMember(owner = "client!adl", name = "c", descriptor = "(Z)V", line = 73)
	@Override
	void method1976(@OriginalArg(0) boolean arg0) {
		if (this.aClass169_1 == null) {
			return;
		}
		this.aClass169_1.method24416('\u0000');
		this.aClass86_Sub3_22.method6190(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(this.aClass86_Sub3_22.aClass442_25.aFloatArray109, 0);
		OpenGL.glMatrixMode(5888);
		this.aClass86_Sub3_22.method6190(0);
		if (this.anInt268 == this.aClass86_Sub3_22.anInt723) {
			return;
		}
		@Pc(41) int local41 = this.aClass86_Sub3_22.anInt723 % 5000 * 128 / 5000;
		for (@Pc(43) int local43 = 0; local43 < 64; local43++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local43, this.aFloatArray1, local41);
			local41 += 2;
		}
		if (this.aClass168_3.aBoolean564) {
			this.aFloat1 = (float) (this.aClass86_Sub3_22.anInt723 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt268 = this.aClass86_Sub3_22.anInt723;
	}

	@OriginalMember(owner = "client!adl", name = "s", descriptor = "(Z)V", line = 73)
	@Override
	void method1992(@OriginalArg(0) boolean arg0) {
		if (this.aClass169_1 == null) {
			return;
		}
		this.aClass169_1.method24416('\u0000');
		this.aClass86_Sub3_22.method6190(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(this.aClass86_Sub3_22.aClass442_25.aFloatArray109, 0);
		OpenGL.glMatrixMode(5888);
		this.aClass86_Sub3_22.method6190(0);
		if (this.anInt268 == this.aClass86_Sub3_22.anInt723) {
			return;
		}
		@Pc(41) int local41 = this.aClass86_Sub3_22.anInt723 % 5000 * 128 / 5000;
		for (@Pc(43) int local43 = 0; local43 < 64; local43++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local43, this.aFloatArray1, local41);
			local41 += 2;
		}
		if (this.aClass168_3.aBoolean564) {
			this.aFloat1 = (float) (this.aClass86_Sub3_22.anInt723 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt268 = this.aClass86_Sub3_22.anInt723;
	}

	@OriginalMember(owner = "client!adl", name = "r", descriptor = "(Z)V", line = 73)
	@Override
	void method1985(@OriginalArg(0) boolean arg0) {
		if (this.aClass169_1 == null) {
			return;
		}
		this.aClass169_1.method24416('\u0000');
		this.aClass86_Sub3_22.method6190(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(this.aClass86_Sub3_22.aClass442_25.aFloatArray109, 0);
		OpenGL.glMatrixMode(5888);
		this.aClass86_Sub3_22.method6190(0);
		if (this.anInt268 == this.aClass86_Sub3_22.anInt723) {
			return;
		}
		@Pc(41) int local41 = this.aClass86_Sub3_22.anInt723 % 5000 * 128 / 5000;
		for (@Pc(43) int local43 = 0; local43 < 64; local43++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local43, this.aFloatArray1, local41);
			local41 += 2;
		}
		if (this.aClass168_3.aBoolean564) {
			this.aFloat1 = (float) (this.aClass86_Sub3_22.anInt723 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt268 = this.aClass86_Sub3_22.anInt723;
	}

	@OriginalMember(owner = "client!adl", name = "g", descriptor = "(Z)V", line = 73)
	@Override
	void method1986(@OriginalArg(0) boolean arg0) {
		if (this.aClass169_1 == null) {
			return;
		}
		this.aClass169_1.method24416('\u0000');
		this.aClass86_Sub3_22.method6190(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(this.aClass86_Sub3_22.aClass442_25.aFloatArray109, 0);
		OpenGL.glMatrixMode(5888);
		this.aClass86_Sub3_22.method6190(0);
		if (this.anInt268 == this.aClass86_Sub3_22.anInt723) {
			return;
		}
		@Pc(41) int local41 = this.aClass86_Sub3_22.anInt723 % 5000 * 128 / 5000;
		for (@Pc(43) int local43 = 0; local43 < 64; local43++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local43, this.aFloatArray1, local41);
			local41 += 2;
		}
		if (this.aClass168_3.aBoolean564) {
			this.aFloat1 = (float) (this.aClass86_Sub3_22.anInt723 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt268 = this.aClass86_Sub3_22.anInt723;
	}

	@OriginalMember(owner = "client!adl", name = "d", descriptor = "(Z)V", line = 73)
	@Override
	void method1983(@OriginalArg(0) boolean arg0) {
		if (this.aClass169_1 == null) {
			return;
		}
		this.aClass169_1.method24416('\u0000');
		this.aClass86_Sub3_22.method6190(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(this.aClass86_Sub3_22.aClass442_25.aFloatArray109, 0);
		OpenGL.glMatrixMode(5888);
		this.aClass86_Sub3_22.method6190(0);
		if (this.anInt268 == this.aClass86_Sub3_22.anInt723) {
			return;
		}
		@Pc(41) int local41 = this.aClass86_Sub3_22.anInt723 % 5000 * 128 / 5000;
		for (@Pc(43) int local43 = 0; local43 < 64; local43++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local43, this.aFloatArray1, local41);
			local41 += 2;
		}
		if (this.aClass168_3.aBoolean564) {
			this.aFloat1 = (float) (this.aClass86_Sub3_22.anInt723 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt268 = this.aClass86_Sub3_22.anInt723;
	}

	@OriginalMember(owner = "client!adl", name = "v", descriptor = "(Z)V", line = 96)
	@Override
	void method1977(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!adl", name = "k", descriptor = "(Z)V", line = 96)
	@Override
	void method1980() {
	}

	@OriginalMember(owner = "client!adl", name = "z", descriptor = "(Z)V", line = 96)
	@Override
	void method1987() {
	}

	@OriginalMember(owner = "client!adl", name = "j", descriptor = "(Z)V", line = 96)
	@Override
	void method1988() {
	}

	@OriginalMember(owner = "client!adl", name = "i", descriptor = "(Z)V", line = 96)
	@Override
	void method1984() {
	}

	@OriginalMember(owner = "client!adl", name = "f", descriptor = "()V", line = 99)
	@Override
	void method1993() {
		if (this.aClass169_1 != null) {
			this.aClass169_1.method24416('\u0001');
			this.aClass86_Sub3_22.method6190(1);
			this.aClass86_Sub3_22.method6195(null);
			this.aClass86_Sub3_22.method6190(0);
		}
	}

	@OriginalMember(owner = "client!adl", name = "l", descriptor = "()V", line = 99)
	@Override
	void method1975() {
		if (this.aClass169_1 != null) {
			this.aClass169_1.method24416('\u0001');
			this.aClass86_Sub3_22.method6190(1);
			this.aClass86_Sub3_22.method6195(null);
			this.aClass86_Sub3_22.method6190(0);
		}
	}

	@OriginalMember(owner = "client!adl", name = "u", descriptor = "()V", line = 99)
	@Override
	void method1989() {
		if (this.aClass169_1 != null) {
			this.aClass169_1.method24416('\u0001');
			this.aClass86_Sub3_22.method6190(1);
			this.aClass86_Sub3_22.method6195(null);
			this.aClass86_Sub3_22.method6190(0);
		}
	}

	@OriginalMember(owner = "client!adl", name = "e", descriptor = "()V", line = 99)
	@Override
	void method1974() {
		if (this.aClass169_1 != null) {
			this.aClass169_1.method24416('\u0001');
			this.aClass86_Sub3_22.method6190(1);
			this.aClass86_Sub3_22.method6195(null);
			this.aClass86_Sub3_22.method6190(0);
		}
	}

	@OriginalMember(owner = "client!adl", name = "y", descriptor = "(II)V", line = 107)
	@Override
	void method1979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass169_1 == null) {
			return;
		}
		this.aClass86_Sub3_22.method6190(1);
		@Pc(30) int local30;
		if ((arg0 & 0x80) != 0) {
			this.aClass86_Sub3_22.method6195(null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass168_3.aBoolean564) {
				this.aClass86_Sub3_22.method6195(this.aClass168_3.aClass78_Sub4_2);
			} else {
				this.aClass86_Sub3_22.method6195(this.aClass168_3.aClass78_Sub2Array2[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass168_3.aBoolean564) {
			this.aClass86_Sub3_22.method6195(this.aClass168_3.aClass78_Sub4_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat1, 0.0F, 0.0F, 1.0F);
		} else {
			local30 = this.aClass86_Sub3_22.anInt723 % 4000 * 16 / 4000;
			this.aClass86_Sub3_22.method6195(this.aClass168_3.aClass78_Sub2Array2[local30]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.aClass86_Sub3_22.method6190(0);
		if ((arg0 & 0x40) == 0) {
			aFloatArray2[0] = this.aClass86_Sub3_22.aFloat68 * this.aClass86_Sub3_22.aFloat65;
			aFloatArray2[1] = this.aClass86_Sub3_22.aFloat68 * this.aClass86_Sub3_22.aFloat66;
			aFloatArray2[2] = this.aClass86_Sub3_22.aFloat68 * this.aClass86_Sub3_22.aFloat67;
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray2, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local30 = arg0 & 0x3;
		if (local30 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local30 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!adl", name = "b", descriptor = "(II)V", line = 107)
	@Override
	void method1978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass169_1 == null) {
			return;
		}
		this.aClass86_Sub3_22.method6190(1);
		@Pc(30) int local30;
		if ((arg0 & 0x80) != 0) {
			this.aClass86_Sub3_22.method6195(null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass168_3.aBoolean564) {
				this.aClass86_Sub3_22.method6195(this.aClass168_3.aClass78_Sub4_2);
			} else {
				this.aClass86_Sub3_22.method6195(this.aClass168_3.aClass78_Sub2Array2[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass168_3.aBoolean564) {
			this.aClass86_Sub3_22.method6195(this.aClass168_3.aClass78_Sub4_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat1, 0.0F, 0.0F, 1.0F);
		} else {
			local30 = this.aClass86_Sub3_22.anInt723 % 4000 * 16 / 4000;
			this.aClass86_Sub3_22.method6195(this.aClass168_3.aClass78_Sub2Array2[local30]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.aClass86_Sub3_22.method6190(0);
		if ((arg0 & 0x40) == 0) {
			aFloatArray2[0] = this.aClass86_Sub3_22.aFloat68 * this.aClass86_Sub3_22.aFloat65;
			aFloatArray2[1] = this.aClass86_Sub3_22.aFloat68 * this.aClass86_Sub3_22.aFloat66;
			aFloatArray2[2] = this.aClass86_Sub3_22.aFloat68 * this.aClass86_Sub3_22.aFloat67;
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray2, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local30 = arg0 & 0x3;
		if (local30 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local30 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!adl", name = "o", descriptor = "(II)V", line = 107)
	@Override
	void method1994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass169_1 == null) {
			return;
		}
		this.aClass86_Sub3_22.method6190(1);
		@Pc(30) int local30;
		if ((arg0 & 0x80) != 0) {
			this.aClass86_Sub3_22.method6195(null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass168_3.aBoolean564) {
				this.aClass86_Sub3_22.method6195(this.aClass168_3.aClass78_Sub4_2);
			} else {
				this.aClass86_Sub3_22.method6195(this.aClass168_3.aClass78_Sub2Array2[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass168_3.aBoolean564) {
			this.aClass86_Sub3_22.method6195(this.aClass168_3.aClass78_Sub4_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat1, 0.0F, 0.0F, 1.0F);
		} else {
			local30 = this.aClass86_Sub3_22.anInt723 % 4000 * 16 / 4000;
			this.aClass86_Sub3_22.method6195(this.aClass168_3.aClass78_Sub2Array2[local30]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.aClass86_Sub3_22.method6190(0);
		if ((arg0 & 0x40) == 0) {
			aFloatArray2[0] = this.aClass86_Sub3_22.aFloat68 * this.aClass86_Sub3_22.aFloat65;
			aFloatArray2[1] = this.aClass86_Sub3_22.aFloat68 * this.aClass86_Sub3_22.aFloat66;
			aFloatArray2[2] = this.aClass86_Sub3_22.aFloat68 * this.aClass86_Sub3_22.aFloat67;
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray2, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local30 = arg0 & 0x3;
		if (local30 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local30 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!adl", name = "w", descriptor = "(Lclient!bx;I)V", line = 145)
	@Override
	void method1991(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1) {
		this.aClass86_Sub3_22.method6195(arg0);
		this.aClass86_Sub3_22.method6198(arg1);
	}

	@OriginalMember(owner = "client!adl", name = "n", descriptor = "(Lclient!bx;I)V", line = 145)
	@Override
	void method1996(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1) {
		this.aClass86_Sub3_22.method6195(arg0);
		this.aClass86_Sub3_22.method6198(arg1);
	}
}
