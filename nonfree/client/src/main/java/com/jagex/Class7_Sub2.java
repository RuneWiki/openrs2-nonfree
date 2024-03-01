package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aal")
public class Class7_Sub2 extends Class7 {

	@OriginalMember(owner = "client!aal", name = "a", descriptor = "Ljava/lang/String;")
	static final String aString10 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n";

	@OriginalMember(owner = "client!aal", name = "l", descriptor = "Ljava/lang/String;")
	static final String aString11 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n";

	@OriginalMember(owner = "client!aal", name = "h", descriptor = "Ljava/lang/String;")
	static final String aString12 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n";

	@OriginalMember(owner = "client!aal", name = "g", descriptor = "Ljava/lang/String;")
	static final String aString13 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n";

	@OriginalMember(owner = "client!aal", name = "e", descriptor = "[F")
	static final float[] aFloatArray3 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!aal", name = "s", descriptor = "Z")
	boolean aBoolean17;

	@OriginalMember(owner = "client!aal", name = "u", descriptor = "Z")
	boolean aBoolean18;

	@OriginalMember(owner = "client!aal", name = "y", descriptor = "Z")
	boolean aBoolean19 = false;

	@OriginalMember(owner = "client!aal", name = "n", descriptor = "Lclient!bb;")
	Class87 aClass87_3;

	@OriginalMember(owner = "client!aal", name = "j", descriptor = "Lclient!bb;")
	Class87 aClass87_4;

	@OriginalMember(owner = "client!aal", name = "z", descriptor = "Lclient!bb;")
	Class87 aClass87_5;

	@OriginalMember(owner = "client!aal", name = "c", descriptor = "Lclient!bb;")
	Class87 aClass87_2;

	@OriginalMember(owner = "client!aal", name = "b", descriptor = "Lclient!aab;")
	Class4_Sub1 aClass4_Sub1_1;

	@OriginalMember(owner = "client!aal", name = "x", descriptor = "Z")
	final boolean aBoolean20;

	@OriginalMember(owner = "client!aal", name = "<init>", descriptor = "(Lclient!abt;)V", line = 26)
	Class7_Sub2(@OriginalArg(0) Class21_Sub2 arg0) {
		super(arg0);
		if (this.aClass21_Sub2_22.aBoolean71) {
			this.aClass87_3 = Class87.method21646(this.aClass21_Sub2_22, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass87_4 = Class87.method21646(this.aClass21_Sub2_22, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass87_5 = Class87.method21646(this.aClass21_Sub2_22, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			this.aClass87_2 = Class87.method21646(this.aClass21_Sub2_22, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			if (this.aClass87_3 != null & this.aClass87_4 != null & this.aClass87_5 != null & this.aClass87_2 != null) {
				this.aClass4_Sub1_1 = new Class4_Sub1(arg0, 3553, Class121.aClass121_23, Class127.aClass127_23, 2, 1, false, new byte[] { 0, -1 }, Class121.aClass121_23, false);
				this.aClass4_Sub1_1.method14074(false, false);
				this.aBoolean20 = true;
			} else {
				this.aBoolean20 = false;
			}
		} else {
			this.aBoolean20 = false;
		}
	}

	@OriginalMember(owner = "client!aal", name = "p", descriptor = "()Z", line = 43)
	@Override
	boolean method1222() {
		return this.aBoolean20;
	}

	@OriginalMember(owner = "client!aal", name = "y", descriptor = "()Z", line = 43)
	@Override
	boolean method1230() {
		return this.aBoolean20;
	}

	@OriginalMember(owner = "client!aal", name = "s", descriptor = "()Z", line = 43)
	@Override
	boolean method1226() {
		return this.aBoolean20;
	}

	@OriginalMember(owner = "client!aal", name = "u", descriptor = "()Z", line = 43)
	@Override
	boolean method1233() {
		return this.aBoolean20;
	}

	@OriginalMember(owner = "client!aal", name = "a", descriptor = "(Z)V", line = 47)
	@Override
	void method1223(@OriginalArg(0) boolean arg0) {
		this.aBoolean18 = arg0;
		this.aClass21_Sub2_22.method4073(1);
		this.aClass21_Sub2_22.method4074(this.aClass4_Sub1_1);
		this.aClass21_Sub2_22.method4114(34165, 7681);
		this.aClass21_Sub2_22.method4077(0, 34166, 768);
		this.aClass21_Sub2_22.method4077(2, 5890, 770);
		this.aClass21_Sub2_22.method4078(0, 34168, 770);
		this.aClass21_Sub2_22.method4073(0);
		this.method776();
	}

	@OriginalMember(owner = "client!aal", name = "b", descriptor = "(Z)V", line = 47)
	@Override
	void method1231(@OriginalArg(0) boolean arg0) {
		this.aBoolean18 = arg0;
		this.aClass21_Sub2_22.method4073(1);
		this.aClass21_Sub2_22.method4074(this.aClass4_Sub1_1);
		this.aClass21_Sub2_22.method4114(34165, 7681);
		this.aClass21_Sub2_22.method4077(0, 34166, 768);
		this.aClass21_Sub2_22.method4077(2, 5890, 770);
		this.aClass21_Sub2_22.method4078(0, 34168, 770);
		this.aClass21_Sub2_22.method4073(0);
		this.method776();
	}

	@OriginalMember(owner = "client!aal", name = "c", descriptor = "(Z)V", line = 47)
	@Override
	void method1225(@OriginalArg(0) boolean arg0) {
		this.aBoolean18 = arg0;
		this.aClass21_Sub2_22.method4073(1);
		this.aClass21_Sub2_22.method4074(this.aClass4_Sub1_1);
		this.aClass21_Sub2_22.method4114(34165, 7681);
		this.aClass21_Sub2_22.method4077(0, 34166, 768);
		this.aClass21_Sub2_22.method4077(2, 5890, 770);
		this.aClass21_Sub2_22.method4078(0, 34168, 770);
		this.aClass21_Sub2_22.method4073(0);
		this.method776();
	}

	@OriginalMember(owner = "client!aal", name = "z", descriptor = "(Z)V", line = 47)
	@Override
	void method1228(@OriginalArg(0) boolean arg0) {
		this.aBoolean18 = arg0;
		this.aClass21_Sub2_22.method4073(1);
		this.aClass21_Sub2_22.method4074(this.aClass4_Sub1_1);
		this.aClass21_Sub2_22.method4114(34165, 7681);
		this.aClass21_Sub2_22.method4077(0, 34166, 768);
		this.aClass21_Sub2_22.method4077(2, 5890, 770);
		this.aClass21_Sub2_22.method4078(0, 34168, 770);
		this.aClass21_Sub2_22.method4073(0);
		this.method776();
	}

	@OriginalMember(owner = "client!aal", name = "g", descriptor = "(Z)V", line = 58)
	@Override
	void method1224(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aal", name = "j", descriptor = "(Z)V", line = 58)
	@Override
	void method1234() {
	}

	@OriginalMember(owner = "client!aal", name = "l", descriptor = "()V", line = 61)
	@Override
	void method1221() {
		if (this.aBoolean17) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean17 = false;
		}
		this.aClass21_Sub2_22.method4073(1);
		this.aClass21_Sub2_22.method4074(null);
		this.aClass21_Sub2_22.method4114(8448, 8448);
		this.aClass21_Sub2_22.method4077(0, 5890, 768);
		this.aClass21_Sub2_22.method4077(2, 34166, 770);
		this.aClass21_Sub2_22.method4078(0, 5890, 770);
		this.aClass21_Sub2_22.method4073(0);
		if (this.aBoolean19) {
			this.aClass21_Sub2_22.method4077(0, 5890, 768);
			this.aClass21_Sub2_22.method4078(0, 5890, 770);
			this.aBoolean19 = false;
		}
	}

	@OriginalMember(owner = "client!aal", name = "d", descriptor = "()V", line = 61)
	@Override
	void method1238() {
		if (this.aBoolean17) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean17 = false;
		}
		this.aClass21_Sub2_22.method4073(1);
		this.aClass21_Sub2_22.method4074(null);
		this.aClass21_Sub2_22.method4114(8448, 8448);
		this.aClass21_Sub2_22.method4077(0, 5890, 768);
		this.aClass21_Sub2_22.method4077(2, 34166, 770);
		this.aClass21_Sub2_22.method4078(0, 5890, 770);
		this.aClass21_Sub2_22.method4073(0);
		if (this.aBoolean19) {
			this.aClass21_Sub2_22.method4077(0, 5890, 768);
			this.aClass21_Sub2_22.method4078(0, 5890, 770);
			this.aBoolean19 = false;
		}
	}

	@OriginalMember(owner = "client!aal", name = "n", descriptor = "()V", line = 61)
	@Override
	void method1229() {
		if (this.aBoolean17) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean17 = false;
		}
		this.aClass21_Sub2_22.method4073(1);
		this.aClass21_Sub2_22.method4074(null);
		this.aClass21_Sub2_22.method4114(8448, 8448);
		this.aClass21_Sub2_22.method4077(0, 5890, 768);
		this.aClass21_Sub2_22.method4077(2, 34166, 770);
		this.aClass21_Sub2_22.method4078(0, 5890, 770);
		this.aClass21_Sub2_22.method4073(0);
		if (this.aBoolean19) {
			this.aClass21_Sub2_22.method4077(0, 5890, 768);
			this.aClass21_Sub2_22.method4078(0, 5890, 770);
			this.aBoolean19 = false;
		}
	}

	@OriginalMember(owner = "client!aal", name = "e", descriptor = "()V", line = 61)
	@Override
	void method1236() {
		if (this.aBoolean17) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean17 = false;
		}
		this.aClass21_Sub2_22.method4073(1);
		this.aClass21_Sub2_22.method4074(null);
		this.aClass21_Sub2_22.method4114(8448, 8448);
		this.aClass21_Sub2_22.method4077(0, 5890, 768);
		this.aClass21_Sub2_22.method4077(2, 34166, 770);
		this.aClass21_Sub2_22.method4078(0, 5890, 770);
		this.aClass21_Sub2_22.method4073(0);
		if (this.aBoolean19) {
			this.aClass21_Sub2_22.method4077(0, 5890, 768);
			this.aClass21_Sub2_22.method4078(0, 5890, 770);
			this.aBoolean19 = false;
		}
	}

	@OriginalMember(owner = "client!aal", name = "r", descriptor = "()V", line = 61)
	@Override
	void method1237() {
		if (this.aBoolean17) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean17 = false;
		}
		this.aClass21_Sub2_22.method4073(1);
		this.aClass21_Sub2_22.method4074(null);
		this.aClass21_Sub2_22.method4114(8448, 8448);
		this.aClass21_Sub2_22.method4077(0, 5890, 768);
		this.aClass21_Sub2_22.method4077(2, 34166, 770);
		this.aClass21_Sub2_22.method4078(0, 5890, 770);
		this.aClass21_Sub2_22.method4073(0);
		if (this.aBoolean19) {
			this.aClass21_Sub2_22.method4077(0, 5890, 768);
			this.aClass21_Sub2_22.method4078(0, 5890, 770);
			this.aBoolean19 = false;
		}
	}

	@OriginalMember(owner = "client!aal", name = "q", descriptor = "()V", line = 61)
	@Override
	void method1239() {
		if (this.aBoolean17) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean17 = false;
		}
		this.aClass21_Sub2_22.method4073(1);
		this.aClass21_Sub2_22.method4074(null);
		this.aClass21_Sub2_22.method4114(8448, 8448);
		this.aClass21_Sub2_22.method4077(0, 5890, 768);
		this.aClass21_Sub2_22.method4077(2, 34166, 770);
		this.aClass21_Sub2_22.method4078(0, 5890, 770);
		this.aClass21_Sub2_22.method4073(0);
		if (this.aBoolean19) {
			this.aClass21_Sub2_22.method4077(0, 5890, 768);
			this.aClass21_Sub2_22.method4078(0, 5890, 770);
			this.aBoolean19 = false;
		}
	}

	@OriginalMember(owner = "client!aal", name = "w", descriptor = "()V", line = 82)
	void method776() {
		@Pc(3) Class328 local3 = this.aClass21_Sub2_22.aClass328_11;
		if (this.aBoolean18) {
			OpenGL.glBindProgramARB(34336, this.aClass21_Sub2_22.anInt453 == Integer.MAX_VALUE ? this.aClass87_4.anInt2934 : this.aClass87_2.anInt2934);
		} else {
			OpenGL.glBindProgramARB(34336, this.aClass21_Sub2_22.anInt453 == Integer.MAX_VALUE ? this.aClass87_3.anInt2934 : this.aClass87_5.anInt2934);
		}
		@Pc(40) float local40 = (float) this.aClass21_Sub2_22.anInt453;
		@Pc(52) float local52 = local3.aFloatArray106[4] * local40 + local3.aFloatArray106[12];
		@Pc(64) float local64 = local3.aFloatArray106[5] * local40 + local3.aFloatArray106[13];
		@Pc(76) float local76 = local3.aFloatArray106[6] * local40 + local3.aFloatArray106[14];
		aFloatArray3[0] = -local3.aFloatArray106[4];
		aFloatArray3[1] = -local3.aFloatArray106[5];
		aFloatArray3[2] = -local3.aFloatArray106[6];
		aFloatArray3[3] = -(aFloatArray3[0] * local52 + aFloatArray3[1] * local64 + aFloatArray3[2] * local76);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, aFloatArray3[0], aFloatArray3[1], aFloatArray3[2], aFloatArray3[3]);
		OpenGL.glEnable(34336);
		this.aBoolean17 = true;
		this.method777();
	}

	@OriginalMember(owner = "client!aal", name = "i", descriptor = "()V", line = 82)
	void method779() {
		@Pc(3) Class328 local3 = this.aClass21_Sub2_22.aClass328_11;
		if (this.aBoolean18) {
			OpenGL.glBindProgramARB(34336, this.aClass21_Sub2_22.anInt453 == Integer.MAX_VALUE ? this.aClass87_4.anInt2934 : this.aClass87_2.anInt2934);
		} else {
			OpenGL.glBindProgramARB(34336, this.aClass21_Sub2_22.anInt453 == Integer.MAX_VALUE ? this.aClass87_3.anInt2934 : this.aClass87_5.anInt2934);
		}
		@Pc(40) float local40 = (float) this.aClass21_Sub2_22.anInt453;
		@Pc(52) float local52 = local3.aFloatArray106[4] * local40 + local3.aFloatArray106[12];
		@Pc(64) float local64 = local3.aFloatArray106[5] * local40 + local3.aFloatArray106[13];
		@Pc(76) float local76 = local3.aFloatArray106[6] * local40 + local3.aFloatArray106[14];
		aFloatArray3[0] = -local3.aFloatArray106[4];
		aFloatArray3[1] = -local3.aFloatArray106[5];
		aFloatArray3[2] = -local3.aFloatArray106[6];
		aFloatArray3[3] = -(aFloatArray3[0] * local52 + aFloatArray3[1] * local64 + aFloatArray3[2] * local76);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, aFloatArray3[0], aFloatArray3[1], aFloatArray3[2], aFloatArray3[3]);
		OpenGL.glEnable(34336);
		this.aBoolean17 = true;
		this.method777();
	}

	@OriginalMember(owner = "client!aal", name = "f", descriptor = "()V", line = 104)
	void method775() {
		if (!this.aBoolean17) {
			return;
		}
		@Pc(6) float local6 = this.aClass21_Sub2_22.aFloat55;
		@Pc(10) float local10 = this.aClass21_Sub2_22.aFloat49;
		@Pc(18) float local18 = local6 - (local6 - local10) * 0.125F;
		@Pc(26) float local26 = local6 - (local6 - local10) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local26, local18, 256.0F / (float) (this.aClass21_Sub2_22.aClass139_1.anInt3417 * 1125508145), (float) (this.aClass21_Sub2_22.aClass139_1.anInt3419 * -729027733) / 255.0F);
		this.aClass21_Sub2_22.method4073(1);
		this.aClass21_Sub2_22.method4195(this.aClass21_Sub2_22.aClass139_1.anInt3422 * -470091381);
		this.aClass21_Sub2_22.method4073(0);
	}

	@OriginalMember(owner = "client!aal", name = "o", descriptor = "()V", line = 104)
	void method777() {
		if (!this.aBoolean17) {
			return;
		}
		@Pc(6) float local6 = this.aClass21_Sub2_22.aFloat55;
		@Pc(10) float local10 = this.aClass21_Sub2_22.aFloat49;
		@Pc(18) float local18 = local6 - (local6 - local10) * 0.125F;
		@Pc(26) float local26 = local6 - (local6 - local10) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local26, local18, 256.0F / (float) (this.aClass21_Sub2_22.aClass139_1.anInt3417 * 1125508145), (float) (this.aClass21_Sub2_22.aClass139_1.anInt3419 * -729027733) / 255.0F);
		this.aClass21_Sub2_22.method4073(1);
		this.aClass21_Sub2_22.method4195(this.aClass21_Sub2_22.aClass139_1.anInt3422 * -470091381);
		this.aClass21_Sub2_22.method4073(0);
	}

	@OriginalMember(owner = "client!aal", name = "k", descriptor = "()V", line = 104)
	void method778() {
		if (!this.aBoolean17) {
			return;
		}
		@Pc(6) float local6 = this.aClass21_Sub2_22.aFloat55;
		@Pc(10) float local10 = this.aClass21_Sub2_22.aFloat49;
		@Pc(18) float local18 = local6 - (local6 - local10) * 0.125F;
		@Pc(26) float local26 = local6 - (local6 - local10) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local26, local18, 256.0F / (float) (this.aClass21_Sub2_22.aClass139_1.anInt3417 * 1125508145), (float) (this.aClass21_Sub2_22.aClass139_1.anInt3419 * -729027733) / 255.0F);
		this.aClass21_Sub2_22.method4073(1);
		this.aClass21_Sub2_22.method4195(this.aClass21_Sub2_22.aClass139_1.anInt3422 * -470091381);
		this.aClass21_Sub2_22.method4073(0);
	}

	@OriginalMember(owner = "client!aal", name = "v", descriptor = "(Lclient!bf;I)V", line = 117)
	@Override
	void method1240(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean19) {
				this.aClass21_Sub2_22.method4077(0, 5890, 768);
				this.aClass21_Sub2_22.method4078(0, 5890, 770);
				this.aBoolean19 = false;
			}
			this.aClass21_Sub2_22.method4074(arg0);
			this.aClass21_Sub2_22.method4115(arg1);
		} else if (!this.aBoolean19) {
			this.aClass21_Sub2_22.method4074(this.aClass21_Sub2_22.aClass4_Sub1_2);
			this.aClass21_Sub2_22.method4115(1);
			this.aClass21_Sub2_22.method4077(0, 34168, 768);
			this.aClass21_Sub2_22.method4078(0, 34168, 770);
			this.aBoolean19 = true;
		}
	}

	@OriginalMember(owner = "client!aal", name = "x", descriptor = "(Lclient!bf;I)V", line = 117)
	@Override
	void method1227(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean19) {
				this.aClass21_Sub2_22.method4077(0, 5890, 768);
				this.aClass21_Sub2_22.method4078(0, 5890, 770);
				this.aBoolean19 = false;
			}
			this.aClass21_Sub2_22.method4074(arg0);
			this.aClass21_Sub2_22.method4115(arg1);
		} else if (!this.aBoolean19) {
			this.aClass21_Sub2_22.method4074(this.aClass21_Sub2_22.aClass4_Sub1_2);
			this.aClass21_Sub2_22.method4115(1);
			this.aClass21_Sub2_22.method4077(0, 34168, 768);
			this.aClass21_Sub2_22.method4078(0, 34168, 770);
			this.aBoolean19 = true;
		}
	}

	@OriginalMember(owner = "client!aal", name = "t", descriptor = "(Lclient!bf;I)V", line = 117)
	@Override
	void method1241(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean19) {
				this.aClass21_Sub2_22.method4077(0, 5890, 768);
				this.aClass21_Sub2_22.method4078(0, 5890, 770);
				this.aBoolean19 = false;
			}
			this.aClass21_Sub2_22.method4074(arg0);
			this.aClass21_Sub2_22.method4115(arg1);
		} else if (!this.aBoolean19) {
			this.aClass21_Sub2_22.method4074(this.aClass21_Sub2_22.aClass4_Sub1_2);
			this.aClass21_Sub2_22.method4115(1);
			this.aClass21_Sub2_22.method4077(0, 34168, 768);
			this.aClass21_Sub2_22.method4078(0, 34168, 770);
			this.aBoolean19 = true;
		}
	}

	@OriginalMember(owner = "client!aal", name = "h", descriptor = "(II)V", line = 137)
	@Override
	void method1232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aal", name = "m", descriptor = "(II)V", line = 137)
	@Override
	void method1235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
