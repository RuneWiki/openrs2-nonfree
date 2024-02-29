package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adm")
public class Class76_Sub4 extends Class76 {

	@OriginalMember(owner = "client!adm", name = "l", descriptor = "Ljava/lang/String;")
	static final String aString19 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n";

	@OriginalMember(owner = "client!adm", name = "y", descriptor = "Ljava/lang/String;")
	static final String aString20 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n";

	@OriginalMember(owner = "client!adm", name = "c", descriptor = "Ljava/lang/String;")
	static final String aString21 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n";

	@OriginalMember(owner = "client!adm", name = "v", descriptor = "Ljava/lang/String;")
	static final String aString22 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n";

	@OriginalMember(owner = "client!adm", name = "j", descriptor = "[F")
	static final float[] aFloatArray3 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!adm", name = "q", descriptor = "Z")
	boolean aBoolean36;

	@OriginalMember(owner = "client!adm", name = "t", descriptor = "Z")
	boolean aBoolean37;

	@OriginalMember(owner = "client!adm", name = "x", descriptor = "Z")
	boolean aBoolean34 = false;

	@OriginalMember(owner = "client!adm", name = "z", descriptor = "Lclient!bt;")
	Class178 aClass178_5;

	@OriginalMember(owner = "client!adm", name = "g", descriptor = "Lclient!bt;")
	Class178 aClass178_2;

	@OriginalMember(owner = "client!adm", name = "r", descriptor = "Lclient!bt;")
	Class178 aClass178_4;

	@OriginalMember(owner = "client!adm", name = "s", descriptor = "Lclient!bt;")
	Class178 aClass178_3;

	@OriginalMember(owner = "client!adm", name = "d", descriptor = "Lclient!adi;")
	Class78_Sub2 aClass78_Sub2_1;

	@OriginalMember(owner = "client!adm", name = "w", descriptor = "Z")
	final boolean aBoolean35;

	@OriginalMember(owner = "client!adm", name = "<init>", descriptor = "(Lclient!aeq;)V", line = 26)
	Class76_Sub4(@OriginalArg(0) Class86_Sub3 arg0) {
		super(arg0);
		if (this.aClass86_Sub3_22.aBoolean131) {
			this.aClass178_5 = Class178.method24557(this.aClass86_Sub3_22, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass178_2 = Class178.method24557(this.aClass86_Sub3_22, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass178_4 = Class178.method24557(this.aClass86_Sub3_22, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			this.aClass178_3 = Class178.method24557(this.aClass86_Sub3_22, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			if (this.aClass178_5 != null & this.aClass178_2 != null & this.aClass178_4 != null & this.aClass178_3 != null) {
				this.aClass78_Sub2_1 = new Class78_Sub2(arg0, 3553, Class212.aClass212_17, Class206.aClass206_23, 2, 1, false, new byte[] { 0, -1 }, Class212.aClass212_17, false);
				this.aClass78_Sub2_1.method17493(false, false);
				this.aBoolean35 = true;
			} else {
				this.aBoolean35 = false;
			}
		} else {
			this.aBoolean35 = false;
		}
	}

	@OriginalMember(owner = "client!adm", name = "p", descriptor = "()Z", line = 43)
	@Override
	boolean method1995() {
		return this.aBoolean35;
	}

	@OriginalMember(owner = "client!adm", name = "t", descriptor = "()Z", line = 43)
	@Override
	boolean method1990() {
		return this.aBoolean35;
	}

	@OriginalMember(owner = "client!adm", name = "q", descriptor = "()Z", line = 43)
	@Override
	boolean method1981() {
		return this.aBoolean35;
	}

	@OriginalMember(owner = "client!adm", name = "x", descriptor = "()Z", line = 43)
	@Override
	boolean method1982() {
		return this.aBoolean35;
	}

	@OriginalMember(owner = "client!adm", name = "s", descriptor = "(Z)V", line = 47)
	@Override
	void method1992(@OriginalArg(0) boolean arg0) {
		this.aBoolean36 = arg0;
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6195(this.aClass78_Sub2_1);
		this.aClass86_Sub3_22.method6207(34165, 7681);
		this.aClass86_Sub3_22.method6213(0, 34166, 768);
		this.aClass86_Sub3_22.method6213(2, 5890, 770);
		this.aClass86_Sub3_22.method6214(0, 34168, 770);
		this.aClass86_Sub3_22.method6190(0);
		this.method1576();
	}

	@OriginalMember(owner = "client!adm", name = "c", descriptor = "(Z)V", line = 47)
	@Override
	void method1976(@OriginalArg(0) boolean arg0) {
		this.aBoolean36 = arg0;
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6195(this.aClass78_Sub2_1);
		this.aClass86_Sub3_22.method6207(34165, 7681);
		this.aClass86_Sub3_22.method6213(0, 34166, 768);
		this.aClass86_Sub3_22.method6213(2, 5890, 770);
		this.aClass86_Sub3_22.method6214(0, 34168, 770);
		this.aClass86_Sub3_22.method6190(0);
		this.method1576();
	}

	@OriginalMember(owner = "client!adm", name = "d", descriptor = "(Z)V", line = 47)
	@Override
	void method1983(@OriginalArg(0) boolean arg0) {
		this.aBoolean36 = arg0;
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6195(this.aClass78_Sub2_1);
		this.aClass86_Sub3_22.method6207(34165, 7681);
		this.aClass86_Sub3_22.method6213(0, 34166, 768);
		this.aClass86_Sub3_22.method6213(2, 5890, 770);
		this.aClass86_Sub3_22.method6214(0, 34168, 770);
		this.aClass86_Sub3_22.method6190(0);
		this.method1576();
	}

	@OriginalMember(owner = "client!adm", name = "r", descriptor = "(Z)V", line = 47)
	@Override
	void method1985(@OriginalArg(0) boolean arg0) {
		this.aBoolean36 = arg0;
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6195(this.aClass78_Sub2_1);
		this.aClass86_Sub3_22.method6207(34165, 7681);
		this.aClass86_Sub3_22.method6213(0, 34166, 768);
		this.aClass86_Sub3_22.method6213(2, 5890, 770);
		this.aClass86_Sub3_22.method6214(0, 34168, 770);
		this.aClass86_Sub3_22.method6190(0);
		this.method1576();
	}

	@OriginalMember(owner = "client!adm", name = "g", descriptor = "(Z)V", line = 47)
	@Override
	void method1986(@OriginalArg(0) boolean arg0) {
		this.aBoolean36 = arg0;
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6195(this.aClass78_Sub2_1);
		this.aClass86_Sub3_22.method6207(34165, 7681);
		this.aClass86_Sub3_22.method6213(0, 34166, 768);
		this.aClass86_Sub3_22.method6213(2, 5890, 770);
		this.aClass86_Sub3_22.method6214(0, 34168, 770);
		this.aClass86_Sub3_22.method6190(0);
		this.method1576();
	}

	@OriginalMember(owner = "client!adm", name = "j", descriptor = "(Z)V", line = 58)
	@Override
	void method1988() {
	}

	@OriginalMember(owner = "client!adm", name = "v", descriptor = "(Z)V", line = 58)
	@Override
	void method1977(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!adm", name = "i", descriptor = "(Z)V", line = 58)
	@Override
	void method1984() {
	}

	@OriginalMember(owner = "client!adm", name = "k", descriptor = "(Z)V", line = 58)
	@Override
	void method1980() {
	}

	@OriginalMember(owner = "client!adm", name = "z", descriptor = "(Z)V", line = 58)
	@Override
	void method1987() {
	}

	@OriginalMember(owner = "client!adm", name = "l", descriptor = "()V", line = 61)
	@Override
	void method1975() {
		if (this.aBoolean37) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean37 = false;
		}
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6195(null);
		this.aClass86_Sub3_22.method6207(8448, 8448);
		this.aClass86_Sub3_22.method6213(0, 5890, 768);
		this.aClass86_Sub3_22.method6213(2, 34166, 770);
		this.aClass86_Sub3_22.method6214(0, 5890, 770);
		this.aClass86_Sub3_22.method6190(0);
		if (this.aBoolean34) {
			this.aClass86_Sub3_22.method6213(0, 5890, 768);
			this.aClass86_Sub3_22.method6214(0, 5890, 770);
			this.aBoolean34 = false;
		}
	}

	@OriginalMember(owner = "client!adm", name = "u", descriptor = "()V", line = 61)
	@Override
	void method1989() {
		if (this.aBoolean37) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean37 = false;
		}
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6195(null);
		this.aClass86_Sub3_22.method6207(8448, 8448);
		this.aClass86_Sub3_22.method6213(0, 5890, 768);
		this.aClass86_Sub3_22.method6213(2, 34166, 770);
		this.aClass86_Sub3_22.method6214(0, 5890, 770);
		this.aClass86_Sub3_22.method6190(0);
		if (this.aBoolean34) {
			this.aClass86_Sub3_22.method6213(0, 5890, 768);
			this.aClass86_Sub3_22.method6214(0, 5890, 770);
			this.aBoolean34 = false;
		}
	}

	@OriginalMember(owner = "client!adm", name = "e", descriptor = "()V", line = 61)
	@Override
	void method1974() {
		if (this.aBoolean37) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean37 = false;
		}
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6195(null);
		this.aClass86_Sub3_22.method6207(8448, 8448);
		this.aClass86_Sub3_22.method6213(0, 5890, 768);
		this.aClass86_Sub3_22.method6213(2, 34166, 770);
		this.aClass86_Sub3_22.method6214(0, 5890, 770);
		this.aClass86_Sub3_22.method6190(0);
		if (this.aBoolean34) {
			this.aClass86_Sub3_22.method6213(0, 5890, 768);
			this.aClass86_Sub3_22.method6214(0, 5890, 770);
			this.aBoolean34 = false;
		}
	}

	@OriginalMember(owner = "client!adm", name = "f", descriptor = "()V", line = 61)
	@Override
	void method1993() {
		if (this.aBoolean37) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean37 = false;
		}
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6195(null);
		this.aClass86_Sub3_22.method6207(8448, 8448);
		this.aClass86_Sub3_22.method6213(0, 5890, 768);
		this.aClass86_Sub3_22.method6213(2, 34166, 770);
		this.aClass86_Sub3_22.method6214(0, 5890, 770);
		this.aClass86_Sub3_22.method6190(0);
		if (this.aBoolean34) {
			this.aClass86_Sub3_22.method6213(0, 5890, 768);
			this.aClass86_Sub3_22.method6214(0, 5890, 770);
			this.aBoolean34 = false;
		}
	}

	@OriginalMember(owner = "client!adm", name = "a", descriptor = "()V", line = 82)
	void method1576() {
		@Pc(3) Class442 local3 = this.aClass86_Sub3_22.aClass442_22;
		if (this.aBoolean36) {
			OpenGL.glBindProgramARB(34336, this.aClass86_Sub3_22.anInt710 == Integer.MAX_VALUE ? this.aClass178_2.anInt3309 : this.aClass178_3.anInt3309);
		} else {
			OpenGL.glBindProgramARB(34336, this.aClass86_Sub3_22.anInt710 == Integer.MAX_VALUE ? this.aClass178_5.anInt3309 : this.aClass178_4.anInt3309);
		}
		@Pc(40) float local40 = (float) this.aClass86_Sub3_22.anInt710;
		@Pc(52) float local52 = local3.aFloatArray109[4] * local40 + local3.aFloatArray109[12];
		@Pc(64) float local64 = local3.aFloatArray109[5] * local40 + local3.aFloatArray109[13];
		@Pc(76) float local76 = local3.aFloatArray109[6] * local40 + local3.aFloatArray109[14];
		aFloatArray3[0] = -local3.aFloatArray109[4];
		aFloatArray3[1] = -local3.aFloatArray109[5];
		aFloatArray3[2] = -local3.aFloatArray109[6];
		aFloatArray3[3] = -(aFloatArray3[0] * local52 + aFloatArray3[1] * local64 + aFloatArray3[2] * local76);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, aFloatArray3[0], aFloatArray3[1], aFloatArray3[2], aFloatArray3[3]);
		OpenGL.glEnable(34336);
		this.aBoolean37 = true;
		this.method1579();
	}

	@OriginalMember(owner = "client!adm", name = "aj", descriptor = "()V", line = 82)
	void method1577() {
		@Pc(3) Class442 local3 = this.aClass86_Sub3_22.aClass442_22;
		if (this.aBoolean36) {
			OpenGL.glBindProgramARB(34336, this.aClass86_Sub3_22.anInt710 == Integer.MAX_VALUE ? this.aClass178_2.anInt3309 : this.aClass178_3.anInt3309);
		} else {
			OpenGL.glBindProgramARB(34336, this.aClass86_Sub3_22.anInt710 == Integer.MAX_VALUE ? this.aClass178_5.anInt3309 : this.aClass178_4.anInt3309);
		}
		@Pc(40) float local40 = (float) this.aClass86_Sub3_22.anInt710;
		@Pc(52) float local52 = local3.aFloatArray109[4] * local40 + local3.aFloatArray109[12];
		@Pc(64) float local64 = local3.aFloatArray109[5] * local40 + local3.aFloatArray109[13];
		@Pc(76) float local76 = local3.aFloatArray109[6] * local40 + local3.aFloatArray109[14];
		aFloatArray3[0] = -local3.aFloatArray109[4];
		aFloatArray3[1] = -local3.aFloatArray109[5];
		aFloatArray3[2] = -local3.aFloatArray109[6];
		aFloatArray3[3] = -(aFloatArray3[0] * local52 + aFloatArray3[1] * local64 + aFloatArray3[2] * local76);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, aFloatArray3[0], aFloatArray3[1], aFloatArray3[2], aFloatArray3[3]);
		OpenGL.glEnable(34336);
		this.aBoolean37 = true;
		this.method1579();
	}

	@OriginalMember(owner = "client!adm", name = "h", descriptor = "()V", line = 82)
	void method1578() {
		@Pc(3) Class442 local3 = this.aClass86_Sub3_22.aClass442_22;
		if (this.aBoolean36) {
			OpenGL.glBindProgramARB(34336, this.aClass86_Sub3_22.anInt710 == Integer.MAX_VALUE ? this.aClass178_2.anInt3309 : this.aClass178_3.anInt3309);
		} else {
			OpenGL.glBindProgramARB(34336, this.aClass86_Sub3_22.anInt710 == Integer.MAX_VALUE ? this.aClass178_5.anInt3309 : this.aClass178_4.anInt3309);
		}
		@Pc(40) float local40 = (float) this.aClass86_Sub3_22.anInt710;
		@Pc(52) float local52 = local3.aFloatArray109[4] * local40 + local3.aFloatArray109[12];
		@Pc(64) float local64 = local3.aFloatArray109[5] * local40 + local3.aFloatArray109[13];
		@Pc(76) float local76 = local3.aFloatArray109[6] * local40 + local3.aFloatArray109[14];
		aFloatArray3[0] = -local3.aFloatArray109[4];
		aFloatArray3[1] = -local3.aFloatArray109[5];
		aFloatArray3[2] = -local3.aFloatArray109[6];
		aFloatArray3[3] = -(aFloatArray3[0] * local52 + aFloatArray3[1] * local64 + aFloatArray3[2] * local76);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, aFloatArray3[0], aFloatArray3[1], aFloatArray3[2], aFloatArray3[3]);
		OpenGL.glEnable(34336);
		this.aBoolean37 = true;
		this.method1579();
	}

	@OriginalMember(owner = "client!adm", name = "m", descriptor = "()V", line = 104)
	void method1579() {
		if (!this.aBoolean37) {
			return;
		}
		@Pc(6) float local6 = this.aClass86_Sub3_22.aFloat64;
		@Pc(10) float local10 = this.aClass86_Sub3_22.aFloat63;
		@Pc(18) float local18 = local6 - (local6 - local10) * 0.125F;
		@Pc(26) float local26 = local6 - (local6 - local10) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local26, local18, 256.0F / (float) (this.aClass86_Sub3_22.aClass202_2.anInt3553 * -1095140607), (float) (this.aClass86_Sub3_22.aClass202_2.anInt3555 * 1446227271) / 255.0F);
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6216(this.aClass86_Sub3_22.aClass202_2.anInt3554 * 2113275141);
		this.aClass86_Sub3_22.method6190(0);
	}

	@OriginalMember(owner = "client!adm", name = "ai", descriptor = "()V", line = 104)
	void method1580() {
		if (!this.aBoolean37) {
			return;
		}
		@Pc(6) float local6 = this.aClass86_Sub3_22.aFloat64;
		@Pc(10) float local10 = this.aClass86_Sub3_22.aFloat63;
		@Pc(18) float local18 = local6 - (local6 - local10) * 0.125F;
		@Pc(26) float local26 = local6 - (local6 - local10) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local26, local18, 256.0F / (float) (this.aClass86_Sub3_22.aClass202_2.anInt3553 * -1095140607), (float) (this.aClass86_Sub3_22.aClass202_2.anInt3555 * 1446227271) / 255.0F);
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6216(this.aClass86_Sub3_22.aClass202_2.anInt3554 * 2113275141);
		this.aClass86_Sub3_22.method6190(0);
	}

	@OriginalMember(owner = "client!adm", name = "ag", descriptor = "()V", line = 104)
	void method1581() {
		if (!this.aBoolean37) {
			return;
		}
		@Pc(6) float local6 = this.aClass86_Sub3_22.aFloat64;
		@Pc(10) float local10 = this.aClass86_Sub3_22.aFloat63;
		@Pc(18) float local18 = local6 - (local6 - local10) * 0.125F;
		@Pc(26) float local26 = local6 - (local6 - local10) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local26, local18, 256.0F / (float) (this.aClass86_Sub3_22.aClass202_2.anInt3553 * -1095140607), (float) (this.aClass86_Sub3_22.aClass202_2.anInt3555 * 1446227271) / 255.0F);
		this.aClass86_Sub3_22.method6190(1);
		this.aClass86_Sub3_22.method6216(this.aClass86_Sub3_22.aClass202_2.anInt3554 * 2113275141);
		this.aClass86_Sub3_22.method6190(0);
	}

	@OriginalMember(owner = "client!adm", name = "w", descriptor = "(Lclient!bx;I)V", line = 117)
	@Override
	void method1991(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean34) {
				this.aClass86_Sub3_22.method6213(0, 5890, 768);
				this.aClass86_Sub3_22.method6214(0, 5890, 770);
				this.aBoolean34 = false;
			}
			this.aClass86_Sub3_22.method6195(arg0);
			this.aClass86_Sub3_22.method6198(arg1);
		} else if (!this.aBoolean34) {
			this.aClass86_Sub3_22.method6195(this.aClass86_Sub3_22.aClass78_Sub2_2);
			this.aClass86_Sub3_22.method6198(1);
			this.aClass86_Sub3_22.method6213(0, 34168, 768);
			this.aClass86_Sub3_22.method6214(0, 34168, 770);
			this.aBoolean34 = true;
		}
	}

	@OriginalMember(owner = "client!adm", name = "n", descriptor = "(Lclient!bx;I)V", line = 117)
	@Override
	void method1996(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean34) {
				this.aClass86_Sub3_22.method6213(0, 5890, 768);
				this.aClass86_Sub3_22.method6214(0, 5890, 770);
				this.aBoolean34 = false;
			}
			this.aClass86_Sub3_22.method6195(arg0);
			this.aClass86_Sub3_22.method6198(arg1);
		} else if (!this.aBoolean34) {
			this.aClass86_Sub3_22.method6195(this.aClass86_Sub3_22.aClass78_Sub2_2);
			this.aClass86_Sub3_22.method6198(1);
			this.aClass86_Sub3_22.method6213(0, 34168, 768);
			this.aClass86_Sub3_22.method6214(0, 34168, 770);
			this.aBoolean34 = true;
		}
	}

	@OriginalMember(owner = "client!adm", name = "y", descriptor = "(II)V", line = 137)
	@Override
	void method1979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!adm", name = "b", descriptor = "(II)V", line = 137)
	@Override
	void method1978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!adm", name = "o", descriptor = "(II)V", line = 137)
	@Override
	void method1994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
