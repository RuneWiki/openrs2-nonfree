package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aaf")
public class Class7_Sub1 extends Class7 {

	@OriginalMember(owner = "client!aaf", name = "g", descriptor = "C")
	static final char aChar1 = '\u0000';

	@OriginalMember(owner = "client!aaf", name = "l", descriptor = "C")
	static final char aChar2 = '\u0001';

	@OriginalMember(owner = "client!aaf", name = "a", descriptor = "Ljava/lang/String;")
	static final String aString9 = "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND";

	@OriginalMember(owner = "client!aaf", name = "c", descriptor = "[F")
	static final float[] aFloatArray2 = new float[4];

	@OriginalMember(owner = "client!aaf", name = "u", descriptor = "F")
	float aFloat1;

	@OriginalMember(owner = "client!aaf", name = "h", descriptor = "Lclient!bg;")
	Class90 aClass90_1;

	@OriginalMember(owner = "client!aaf", name = "x", descriptor = "I")
	int anInt81;

	@OriginalMember(owner = "client!aaf", name = "b", descriptor = "Lclient!bi;")
	final Class92 aClass92_1;

	@OriginalMember(owner = "client!aaf", name = "y", descriptor = "Lclient!bb;")
	Class87 aClass87_1;

	@OriginalMember(owner = "client!aaf", name = "s", descriptor = "[F")
	float[] aFloatArray1;

	@OriginalMember(owner = "client!aaf", name = "<init>", descriptor = "(Lclient!abt;Lclient!bi;)V", line = 23)
	Class7_Sub1(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) Class92 arg1) {
		super(arg0);
		this.aClass92_1 = arg1;
		if (this.aClass21_Sub2_22.aBoolean71 && this.aClass21_Sub2_22.anInt444 >= 2) {
			this.aClass87_1 = Class87.method21646(this.aClass21_Sub2_22, 34336, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
			if (this.aClass87_1 == null) {
				return;
			}
			@Pc(36) int[][] local36 = Class406.method27659(64, 256, 4, 4, 3, 0.4F, false);
			@Pc(47) int[][] local47 = Class406.method27659(64, 256, 4, 4, 3, 0.4F, false);
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
			this.method537();
		}
	}

	@OriginalMember(owner = "client!aaf", name = "y", descriptor = "()Z", line = 45)
	@Override
	boolean method1230() {
		return true;
	}

	@OriginalMember(owner = "client!aaf", name = "u", descriptor = "()Z", line = 45)
	@Override
	boolean method1233() {
		return true;
	}

	@OriginalMember(owner = "client!aaf", name = "p", descriptor = "()Z", line = 45)
	@Override
	boolean method1222() {
		return true;
	}

	@OriginalMember(owner = "client!aaf", name = "s", descriptor = "()Z", line = 45)
	@Override
	boolean method1226() {
		return true;
	}

	@OriginalMember(owner = "client!aaf", name = "f", descriptor = "()V", line = 49)
	void method536() {
		this.aClass90_1 = new Class90(this.aClass21_Sub2_22, 2);
		this.aClass90_1.method21660(0);
		this.aClass21_Sub2_22.method4073(1);
		this.aClass21_Sub2_22.method4195(-16777216);
		this.aClass21_Sub2_22.method4114(260, 7681);
		this.aClass21_Sub2_22.method4078(0, 34166, 770);
		this.aClass21_Sub2_22.method4073(0);
		OpenGL.glBindProgramARB(34336, this.aClass87_1.anInt2934);
		OpenGL.glEnable(34336);
		this.aClass90_1.method21649();
		this.aClass90_1.method21660(1);
		this.aClass21_Sub2_22.method4073(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		this.aClass21_Sub2_22.method4115(0);
		this.aClass21_Sub2_22.method4078(0, 5890, 770);
		this.aClass21_Sub2_22.method4073(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass90_1.method21649();
	}

	@OriginalMember(owner = "client!aaf", name = "w", descriptor = "()V", line = 49)
	void method537() {
		this.aClass90_1 = new Class90(this.aClass21_Sub2_22, 2);
		this.aClass90_1.method21660(0);
		this.aClass21_Sub2_22.method4073(1);
		this.aClass21_Sub2_22.method4195(-16777216);
		this.aClass21_Sub2_22.method4114(260, 7681);
		this.aClass21_Sub2_22.method4078(0, 34166, 770);
		this.aClass21_Sub2_22.method4073(0);
		OpenGL.glBindProgramARB(34336, this.aClass87_1.anInt2934);
		OpenGL.glEnable(34336);
		this.aClass90_1.method21649();
		this.aClass90_1.method21660(1);
		this.aClass21_Sub2_22.method4073(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		this.aClass21_Sub2_22.method4115(0);
		this.aClass21_Sub2_22.method4078(0, 5890, 770);
		this.aClass21_Sub2_22.method4073(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass90_1.method21649();
	}

	@OriginalMember(owner = "client!aaf", name = "o", descriptor = "()V", line = 49)
	void method538() {
		this.aClass90_1 = new Class90(this.aClass21_Sub2_22, 2);
		this.aClass90_1.method21660(0);
		this.aClass21_Sub2_22.method4073(1);
		this.aClass21_Sub2_22.method4195(-16777216);
		this.aClass21_Sub2_22.method4114(260, 7681);
		this.aClass21_Sub2_22.method4078(0, 34166, 770);
		this.aClass21_Sub2_22.method4073(0);
		OpenGL.glBindProgramARB(34336, this.aClass87_1.anInt2934);
		OpenGL.glEnable(34336);
		this.aClass90_1.method21649();
		this.aClass90_1.method21660(1);
		this.aClass21_Sub2_22.method4073(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		this.aClass21_Sub2_22.method4115(0);
		this.aClass21_Sub2_22.method4078(0, 5890, 770);
		this.aClass21_Sub2_22.method4073(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass90_1.method21649();
	}

	@OriginalMember(owner = "client!aaf", name = "i", descriptor = "()V", line = 49)
	void method539() {
		this.aClass90_1 = new Class90(this.aClass21_Sub2_22, 2);
		this.aClass90_1.method21660(0);
		this.aClass21_Sub2_22.method4073(1);
		this.aClass21_Sub2_22.method4195(-16777216);
		this.aClass21_Sub2_22.method4114(260, 7681);
		this.aClass21_Sub2_22.method4078(0, 34166, 770);
		this.aClass21_Sub2_22.method4073(0);
		OpenGL.glBindProgramARB(34336, this.aClass87_1.anInt2934);
		OpenGL.glEnable(34336);
		this.aClass90_1.method21649();
		this.aClass90_1.method21660(1);
		this.aClass21_Sub2_22.method4073(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		this.aClass21_Sub2_22.method4115(0);
		this.aClass21_Sub2_22.method4078(0, 5890, 770);
		this.aClass21_Sub2_22.method4073(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass90_1.method21649();
	}

	@OriginalMember(owner = "client!aaf", name = "a", descriptor = "(Z)V", line = 74)
	@Override
	void method1223(@OriginalArg(0) boolean arg0) {
		if (this.aClass90_1 == null) {
			return;
		}
		this.aClass90_1.method21650('\u0000');
		this.aClass21_Sub2_22.method4073(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(this.aClass21_Sub2_22.aClass328_12.aFloatArray106, 0);
		OpenGL.glMatrixMode(5888);
		this.aClass21_Sub2_22.method4073(0);
		if (this.anInt81 == this.aClass21_Sub2_22.anInt443) {
			return;
		}
		@Pc(41) int local41 = this.aClass21_Sub2_22.anInt443 % 5000 * 128 / 5000;
		for (@Pc(43) int local43 = 0; local43 < 64; local43++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local43, this.aFloatArray1, local41);
			local41 += 2;
		}
		if (this.aClass92_1.aBoolean535) {
			this.aFloat1 = (float) (this.aClass21_Sub2_22.anInt443 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt81 = this.aClass21_Sub2_22.anInt443;
	}

	@OriginalMember(owner = "client!aaf", name = "b", descriptor = "(Z)V", line = 74)
	@Override
	void method1231(@OriginalArg(0) boolean arg0) {
		if (this.aClass90_1 == null) {
			return;
		}
		this.aClass90_1.method21650('\u0000');
		this.aClass21_Sub2_22.method4073(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(this.aClass21_Sub2_22.aClass328_12.aFloatArray106, 0);
		OpenGL.glMatrixMode(5888);
		this.aClass21_Sub2_22.method4073(0);
		if (this.anInt81 == this.aClass21_Sub2_22.anInt443) {
			return;
		}
		@Pc(41) int local41 = this.aClass21_Sub2_22.anInt443 % 5000 * 128 / 5000;
		for (@Pc(43) int local43 = 0; local43 < 64; local43++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local43, this.aFloatArray1, local41);
			local41 += 2;
		}
		if (this.aClass92_1.aBoolean535) {
			this.aFloat1 = (float) (this.aClass21_Sub2_22.anInt443 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt81 = this.aClass21_Sub2_22.anInt443;
	}

	@OriginalMember(owner = "client!aaf", name = "c", descriptor = "(Z)V", line = 74)
	@Override
	void method1225(@OriginalArg(0) boolean arg0) {
		if (this.aClass90_1 == null) {
			return;
		}
		this.aClass90_1.method21650('\u0000');
		this.aClass21_Sub2_22.method4073(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(this.aClass21_Sub2_22.aClass328_12.aFloatArray106, 0);
		OpenGL.glMatrixMode(5888);
		this.aClass21_Sub2_22.method4073(0);
		if (this.anInt81 == this.aClass21_Sub2_22.anInt443) {
			return;
		}
		@Pc(41) int local41 = this.aClass21_Sub2_22.anInt443 % 5000 * 128 / 5000;
		for (@Pc(43) int local43 = 0; local43 < 64; local43++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local43, this.aFloatArray1, local41);
			local41 += 2;
		}
		if (this.aClass92_1.aBoolean535) {
			this.aFloat1 = (float) (this.aClass21_Sub2_22.anInt443 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt81 = this.aClass21_Sub2_22.anInt443;
	}

	@OriginalMember(owner = "client!aaf", name = "z", descriptor = "(Z)V", line = 74)
	@Override
	void method1228(@OriginalArg(0) boolean arg0) {
		if (this.aClass90_1 == null) {
			return;
		}
		this.aClass90_1.method21650('\u0000');
		this.aClass21_Sub2_22.method4073(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(this.aClass21_Sub2_22.aClass328_12.aFloatArray106, 0);
		OpenGL.glMatrixMode(5888);
		this.aClass21_Sub2_22.method4073(0);
		if (this.anInt81 == this.aClass21_Sub2_22.anInt443) {
			return;
		}
		@Pc(41) int local41 = this.aClass21_Sub2_22.anInt443 % 5000 * 128 / 5000;
		for (@Pc(43) int local43 = 0; local43 < 64; local43++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local43, this.aFloatArray1, local41);
			local41 += 2;
		}
		if (this.aClass92_1.aBoolean535) {
			this.aFloat1 = (float) (this.aClass21_Sub2_22.anInt443 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt81 = this.aClass21_Sub2_22.anInt443;
	}

	@OriginalMember(owner = "client!aaf", name = "g", descriptor = "(Z)V", line = 97)
	@Override
	void method1224(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aaf", name = "j", descriptor = "(Z)V", line = 97)
	@Override
	void method1234() {
	}

	@OriginalMember(owner = "client!aaf", name = "l", descriptor = "()V", line = 100)
	@Override
	void method1221() {
		if (this.aClass90_1 != null) {
			this.aClass90_1.method21650('\u0001');
			this.aClass21_Sub2_22.method4073(1);
			this.aClass21_Sub2_22.method4074(null);
			this.aClass21_Sub2_22.method4073(0);
		}
	}

	@OriginalMember(owner = "client!aaf", name = "n", descriptor = "()V", line = 100)
	@Override
	void method1229() {
		if (this.aClass90_1 != null) {
			this.aClass90_1.method21650('\u0001');
			this.aClass21_Sub2_22.method4073(1);
			this.aClass21_Sub2_22.method4074(null);
			this.aClass21_Sub2_22.method4073(0);
		}
	}

	@OriginalMember(owner = "client!aaf", name = "e", descriptor = "()V", line = 100)
	@Override
	void method1236() {
		if (this.aClass90_1 != null) {
			this.aClass90_1.method21650('\u0001');
			this.aClass21_Sub2_22.method4073(1);
			this.aClass21_Sub2_22.method4074(null);
			this.aClass21_Sub2_22.method4073(0);
		}
	}

	@OriginalMember(owner = "client!aaf", name = "r", descriptor = "()V", line = 100)
	@Override
	void method1237() {
		if (this.aClass90_1 != null) {
			this.aClass90_1.method21650('\u0001');
			this.aClass21_Sub2_22.method4073(1);
			this.aClass21_Sub2_22.method4074(null);
			this.aClass21_Sub2_22.method4073(0);
		}
	}

	@OriginalMember(owner = "client!aaf", name = "d", descriptor = "()V", line = 100)
	@Override
	void method1238() {
		if (this.aClass90_1 != null) {
			this.aClass90_1.method21650('\u0001');
			this.aClass21_Sub2_22.method4073(1);
			this.aClass21_Sub2_22.method4074(null);
			this.aClass21_Sub2_22.method4073(0);
		}
	}

	@OriginalMember(owner = "client!aaf", name = "q", descriptor = "()V", line = 100)
	@Override
	void method1239() {
		if (this.aClass90_1 != null) {
			this.aClass90_1.method21650('\u0001');
			this.aClass21_Sub2_22.method4073(1);
			this.aClass21_Sub2_22.method4074(null);
			this.aClass21_Sub2_22.method4073(0);
		}
	}

	@OriginalMember(owner = "client!aaf", name = "h", descriptor = "(II)V", line = 108)
	@Override
	void method1232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass90_1 == null) {
			return;
		}
		this.aClass21_Sub2_22.method4073(1);
		@Pc(30) int local30;
		if ((arg0 & 0x80) != 0) {
			this.aClass21_Sub2_22.method4074(null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass92_1.aBoolean535) {
				this.aClass21_Sub2_22.method4074(this.aClass92_1.aClass4_Sub4_1);
			} else {
				this.aClass21_Sub2_22.method4074(this.aClass92_1.aClass4_Sub1Array2[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass92_1.aBoolean535) {
			this.aClass21_Sub2_22.method4074(this.aClass92_1.aClass4_Sub4_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat1, 0.0F, 0.0F, 1.0F);
		} else {
			local30 = this.aClass21_Sub2_22.anInt443 % 4000 * 16 / 4000;
			this.aClass21_Sub2_22.method4074(this.aClass92_1.aClass4_Sub1Array2[local30]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.aClass21_Sub2_22.method4073(0);
		if ((arg0 & 0x40) == 0) {
			aFloatArray2[0] = this.aClass21_Sub2_22.aFloat44 * this.aClass21_Sub2_22.aFloat52;
			aFloatArray2[1] = this.aClass21_Sub2_22.aFloat44 * this.aClass21_Sub2_22.aFloat50;
			aFloatArray2[2] = this.aClass21_Sub2_22.aFloat44 * this.aClass21_Sub2_22.aFloat53;
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

	@OriginalMember(owner = "client!aaf", name = "m", descriptor = "(II)V", line = 108)
	@Override
	void method1235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass90_1 == null) {
			return;
		}
		this.aClass21_Sub2_22.method4073(1);
		@Pc(30) int local30;
		if ((arg0 & 0x80) != 0) {
			this.aClass21_Sub2_22.method4074(null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass92_1.aBoolean535) {
				this.aClass21_Sub2_22.method4074(this.aClass92_1.aClass4_Sub4_1);
			} else {
				this.aClass21_Sub2_22.method4074(this.aClass92_1.aClass4_Sub1Array2[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass92_1.aBoolean535) {
			this.aClass21_Sub2_22.method4074(this.aClass92_1.aClass4_Sub4_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat1, 0.0F, 0.0F, 1.0F);
		} else {
			local30 = this.aClass21_Sub2_22.anInt443 % 4000 * 16 / 4000;
			this.aClass21_Sub2_22.method4074(this.aClass92_1.aClass4_Sub1Array2[local30]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.aClass21_Sub2_22.method4073(0);
		if ((arg0 & 0x40) == 0) {
			aFloatArray2[0] = this.aClass21_Sub2_22.aFloat44 * this.aClass21_Sub2_22.aFloat52;
			aFloatArray2[1] = this.aClass21_Sub2_22.aFloat44 * this.aClass21_Sub2_22.aFloat50;
			aFloatArray2[2] = this.aClass21_Sub2_22.aFloat44 * this.aClass21_Sub2_22.aFloat53;
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

	@OriginalMember(owner = "client!aaf", name = "v", descriptor = "(Lclient!bf;I)V", line = 146)
	@Override
	void method1240(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1) {
		this.aClass21_Sub2_22.method4074(arg0);
		this.aClass21_Sub2_22.method4115(arg1);
	}

	@OriginalMember(owner = "client!aaf", name = "x", descriptor = "(Lclient!bf;I)V", line = 146)
	@Override
	void method1227(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1) {
		this.aClass21_Sub2_22.method4074(arg0);
		this.aClass21_Sub2_22.method4115(arg1);
	}

	@OriginalMember(owner = "client!aaf", name = "t", descriptor = "(Lclient!bf;I)V", line = 146)
	@Override
	void method1241(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1) {
		this.aClass21_Sub2_22.method4074(arg0);
		this.aClass21_Sub2_22.method4115(arg1);
	}
}
