package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aas")
public class Class6_Sub3 extends Class6 {

	@OriginalMember(owner = "client!aas", name = "g", descriptor = "Lclient!aja;")
	Class4_Sub1_Sub1 aClass4_Sub1_Sub1_2;

	@OriginalMember(owner = "client!aas", name = "l", descriptor = "I")
	int anInt122 = 0;

	@OriginalMember(owner = "client!aas", name = "h", descriptor = "Z")
	boolean aBoolean34 = false;

	@OriginalMember(owner = "client!aas", name = "x", descriptor = "I")
	int anInt124 = 0;

	@OriginalMember(owner = "client!aas", name = "s", descriptor = "I")
	int anInt121 = 0;

	@OriginalMember(owner = "client!aas", name = "u", descriptor = "I")
	int anInt123 = 0;

	@OriginalMember(owner = "client!aas", name = "y", descriptor = "I")
	int anInt125 = 0;

	@OriginalMember(owner = "client!aas", name = "a", descriptor = "Lclient!abt;")
	final Class21_Sub2 aClass21_Sub2_16;

	@OriginalMember(owner = "client!aas", name = "p", descriptor = "Lclient!aja;")
	final Class4_Sub1_Sub1 aClass4_Sub1_Sub1_3;

	@OriginalMember(owner = "client!aas", name = "<init>", descriptor = "(Lclient!abt;IIZ)V", line = 18)
	Class6_Sub3(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass21_Sub2_16 = arg0;
		this.aClass4_Sub1_Sub1_3 = Class4_Sub1_Sub1.method14099(arg0, arg3 ? Class121.aClass121_17 : Class121.aClass121_18, Class127.aClass127_23, arg1, arg2);
	}

	@OriginalMember(owner = "client!aas", name = "<init>", descriptor = "(Lclient!abt;IIII)V", line = 23)
	Class6_Sub3(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass21_Sub2_16 = arg0;
		this.aClass4_Sub1_Sub1_3 = Class4_Sub1_Sub1.method14101(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aas", name = "<init>", descriptor = "(Lclient!abt;II[III)V", line = 28)
	Class6_Sub3(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass21_Sub2_16 = arg0;
		this.aClass4_Sub1_Sub1_3 = Class4_Sub1_Sub1.method14098(arg0, arg1, arg2, false, arg3, arg5, arg4);
	}

	@OriginalMember(owner = "client!aas", name = "p", descriptor = "(IIII)V", line = 34)
	@Override
	public void method16775(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt121 = arg0;
		this.anInt124 = arg1;
		this.anInt125 = arg2;
		this.anInt123 = arg3;
		this.aBoolean34 = this.anInt121 != 0 || this.anInt124 != 0 || this.anInt125 != 0 || this.anInt123 != 0;
	}

	@OriginalMember(owner = "client!aas", name = "bt", descriptor = "(IIII)V", line = 34)
	@Override
	public void method16831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt121 = arg0;
		this.anInt124 = arg1;
		this.anInt125 = arg2;
		this.anInt123 = arg3;
		this.aBoolean34 = this.anInt121 != 0 || this.anInt124 != 0 || this.anInt125 != 0 || this.anInt123 != 0;
	}

	@OriginalMember(owner = "client!aas", name = "bk", descriptor = "(IIII)V", line = 34)
	@Override
	public void method16832(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt121 = arg0;
		this.anInt124 = arg1;
		this.anInt125 = arg2;
		this.anInt123 = arg3;
		this.aBoolean34 = this.anInt121 != 0 || this.anInt124 != 0 || this.anInt125 != 0 || this.anInt123 != 0;
	}

	@OriginalMember(owner = "client!aas", name = "a", descriptor = "([I)V", line = 42)
	@Override
	public void method16776(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt121;
		arg0[1] = this.anInt124;
		arg0[2] = this.anInt125;
		arg0[3] = this.anInt123;
	}

	@OriginalMember(owner = "client!aas", name = "al", descriptor = "([I)V", line = 42)
	@Override
	public void method16798(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt121;
		arg0[1] = this.anInt124;
		arg0[2] = this.anInt125;
		arg0[3] = this.anInt123;
	}

	@OriginalMember(owner = "client!aas", name = "ao", descriptor = "([I)V", line = 42)
	@Override
	public void method16814(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt121;
		arg0[1] = this.anInt124;
		arg0[2] = this.anInt125;
		arg0[3] = this.anInt123;
	}

	@OriginalMember(owner = "client!aas", name = "ap", descriptor = "([I)V", line = 42)
	@Override
	public void method16815(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt121;
		arg0[1] = this.anInt124;
		arg0[2] = this.anInt125;
		arg0[3] = this.anInt123;
	}

	@OriginalMember(owner = "client!aas", name = "au", descriptor = "()I", line = 49)
	@Override
	public int method16817() {
		return this.aClass4_Sub1_Sub1_3.anInt2031;
	}

	@OriginalMember(owner = "client!aas", name = "g", descriptor = "()I", line = 49)
	@Override
	public int method16782() {
		return this.aClass4_Sub1_Sub1_3.anInt2031;
	}

	@OriginalMember(owner = "client!aas", name = "ab", descriptor = "()I", line = 49)
	@Override
	public int method16816() {
		return this.aClass4_Sub1_Sub1_3.anInt2031;
	}

	@OriginalMember(owner = "client!aas", name = "ay", descriptor = "()I", line = 49)
	@Override
	public int method16818() {
		return this.aClass4_Sub1_Sub1_3.anInt2031;
	}

	@OriginalMember(owner = "client!aas", name = "l", descriptor = "()I", line = 53)
	@Override
	public int method16772() {
		return this.aClass4_Sub1_Sub1_3.anInt2031 + this.anInt121 + this.anInt125;
	}

	@OriginalMember(owner = "client!aas", name = "am", descriptor = "()I", line = 53)
	@Override
	public int method16771() {
		return this.aClass4_Sub1_Sub1_3.anInt2031 + this.anInt121 + this.anInt125;
	}

	@OriginalMember(owner = "client!aas", name = "ar", descriptor = "()I", line = 53)
	@Override
	public int method16773() {
		return this.aClass4_Sub1_Sub1_3.anInt2031 + this.anInt121 + this.anInt125;
	}

	@OriginalMember(owner = "client!aas", name = "h", descriptor = "()I", line = 57)
	@Override
	public int method16787() {
		return this.aClass4_Sub1_Sub1_3.anInt2030;
	}

	@OriginalMember(owner = "client!aas", name = "ag", descriptor = "()I", line = 57)
	@Override
	public int method16819() {
		return this.aClass4_Sub1_Sub1_3.anInt2030;
	}

	@OriginalMember(owner = "client!aas", name = "ae", descriptor = "()I", line = 61)
	@Override
	public int method16821() {
		return this.aClass4_Sub1_Sub1_3.anInt2030 + this.anInt124 + this.anInt123;
	}

	@OriginalMember(owner = "client!aas", name = "x", descriptor = "()I", line = 61)
	@Override
	public int method16779() {
		return this.aClass4_Sub1_Sub1_3.anInt2030 + this.anInt124 + this.anInt123;
	}

	@OriginalMember(owner = "client!aas", name = "ad", descriptor = "()I", line = 61)
	@Override
	public int method16781() {
		return this.aClass4_Sub1_Sub1_3.anInt2030 + this.anInt124 + this.anInt123;
	}

	@OriginalMember(owner = "client!aas", name = "ai", descriptor = "()Lclient!da;", line = 65)
	@Override
	public Interface10 method16820() {
		return this.aClass4_Sub1_Sub1_3.method14078(0);
	}

	@OriginalMember(owner = "client!aas", name = "as", descriptor = "()Lclient!da;", line = 65)
	@Override
	public Interface10 method16807() {
		return this.aClass4_Sub1_Sub1_3.method14078(0);
	}

	@OriginalMember(owner = "client!aas", name = "s", descriptor = "()Lclient!da;", line = 65)
	@Override
	public Interface10 method16835() {
		return this.aClass4_Sub1_Sub1_3.method14078(0);
	}

	@OriginalMember(owner = "client!aas", name = "u", descriptor = "(IIIIII)V", line = 69)
	@Override
	public void method16795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (!this.aClass21_Sub2_16.aBoolean76) {
			this.aClass4_Sub1_Sub1_3.method14076(arg0, arg1, arg2, arg3, arg4, arg5);
			return;
		}
		@Pc(11) int[] local11 = this.aClass21_Sub2_16.method17051(arg4, arg5, arg2, arg3);
		if (local11 != null) {
			for (@Pc(15) int local15 = 0; local15 < local11.length; local15++) {
				local11[local15] |= 0xFF000000;
			}
			this.method1089(arg0, arg1, arg2, arg3, local11, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!aas", name = "aa", descriptor = "(IIIIII)V", line = 69)
	@Override
	public void method16803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (!this.aClass21_Sub2_16.aBoolean76) {
			this.aClass4_Sub1_Sub1_3.method14076(arg0, arg1, arg2, arg3, arg4, arg5);
			return;
		}
		@Pc(11) int[] local11 = this.aClass21_Sub2_16.method17051(arg4, arg5, arg2, arg3);
		if (local11 != null) {
			for (@Pc(15) int local15 = 0; local15 < local11.length; local15++) {
				local11[local15] |= 0xFF000000;
			}
			this.method1089(arg0, arg1, arg2, arg3, local11, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!aas", name = "ak", descriptor = "(IIIIII)V", line = 69)
	@Override
	public void method16809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (!this.aClass21_Sub2_16.aBoolean76) {
			this.aClass4_Sub1_Sub1_3.method14076(arg0, arg1, arg2, arg3, arg4, arg5);
			return;
		}
		@Pc(11) int[] local11 = this.aClass21_Sub2_16.method17051(arg4, arg5, arg2, arg3);
		if (local11 != null) {
			for (@Pc(15) int local15 = 0; local15 < local11.length; local15++) {
				local11[local15] |= 0xFF000000;
			}
			this.method1089(arg0, arg1, arg2, arg3, local11, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!aas", name = "an", descriptor = "(III)V", line = 80)
	@Override
	public void method16805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass4_Sub1_Sub1_2 = Class4_Sub1_Sub1.method14101(this.aClass21_Sub2_16, arg0, arg1, this.aClass4_Sub1_Sub1_3.anInt2031, this.aClass4_Sub1_Sub1_3.anInt2030);
		this.anInt122 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!aas", name = "ah", descriptor = "(III)V", line = 80)
	@Override
	public void method16804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass4_Sub1_Sub1_2 = Class4_Sub1_Sub1.method14101(this.aClass21_Sub2_16, arg0, arg1, this.aClass4_Sub1_Sub1_3.anInt2031, this.aClass4_Sub1_Sub1_3.anInt2030);
		this.anInt122 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!aas", name = "aj", descriptor = "(III)V", line = 80)
	@Override
	public void method16806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass4_Sub1_Sub1_2 = Class4_Sub1_Sub1.method14101(this.aClass21_Sub2_16, arg0, arg1, this.aClass4_Sub1_Sub1_3.anInt2031, this.aClass4_Sub1_Sub1_3.anInt2030);
		this.anInt122 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!aas", name = "y", descriptor = "(III)V", line = 80)
	@Override
	public void method16780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass4_Sub1_Sub1_2 = Class4_Sub1_Sub1.method14101(this.aClass21_Sub2_16, arg0, arg1, this.aClass4_Sub1_Sub1_3.anInt2031, this.aClass4_Sub1_Sub1_3.anInt2030);
		this.anInt122 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!aas", name = "cc", descriptor = "(IIII[III)V", line = 97)
	void method1086(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass4_Sub1_Sub1_3.method14075(arg0, arg1, arg2, arg3, arg4, arg5, arg6, true);
	}

	@OriginalMember(owner = "client!aas", name = "cl", descriptor = "(IIII[III)V", line = 97)
	void method1089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass4_Sub1_Sub1_3.method14075(arg0, arg1, arg2, arg3, arg4, arg5, arg6, true);
	}

	@OriginalMember(owner = "client!aas", name = "cp", descriptor = "(IIII[III)V", line = 97)
	void method1091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass4_Sub1_Sub1_3.method14075(arg0, arg1, arg2, arg3, arg4, arg5, arg6, true);
	}

	@OriginalMember(owner = "client!aas", name = "cs", descriptor = "(IIII[III)V", line = 97)
	void method1092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass4_Sub1_Sub1_3.method14075(arg0, arg1, arg2, arg3, arg4, arg5, arg6, true);
	}

	@OriginalMember(owner = "client!aas", name = "ct", descriptor = "(IIII[III)V", line = 97)
	void method1093(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass4_Sub1_Sub1_3.method14075(arg0, arg1, arg2, arg3, arg4, arg5, arg6, true);
	}

	@OriginalMember(owner = "client!aas", name = "cz", descriptor = "(I)V", line = 101)
	void method1087(@OriginalArg(0) int arg0) {
		this.aClass21_Sub2_16.method4073(1);
		this.aClass21_Sub2_16.method4074(this.aClass4_Sub1_Sub1_3);
		this.aClass21_Sub2_16.method4114(this.aClass21_Sub2_16.method4076(arg0), 7681);
		this.aClass21_Sub2_16.method4077(1, 34167, 768);
		this.aClass21_Sub2_16.method4078(0, 34168, 770);
		this.aClass21_Sub2_16.method4073(0);
		this.aClass21_Sub2_16.method4074(this.aClass4_Sub1_Sub1_2);
		this.aClass21_Sub2_16.method4114(34479, 7681);
		this.aClass21_Sub2_16.method4077(1, 34166, 768);
		if (this.anInt122 == 0) {
			this.aClass21_Sub2_16.method4080(1.0F, 0.5F, 0.5F, 0.0F);
		} else if (this.anInt122 == 1) {
			this.aClass21_Sub2_16.method4080(0.5F, 1.0F, 0.5F, 0.0F);
		} else if (this.anInt122 == 2) {
			this.aClass21_Sub2_16.method4080(0.5F, 0.5F, 1.0F, 0.0F);
		} else if (this.anInt122 == 3) {
			this.aClass21_Sub2_16.method4080(128.5F, 128.5F, 128.5F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!aas", name = "cq", descriptor = "(I)V", line = 101)
	void method1088(@OriginalArg(0) int arg0) {
		this.aClass21_Sub2_16.method4073(1);
		this.aClass21_Sub2_16.method4074(this.aClass4_Sub1_Sub1_3);
		this.aClass21_Sub2_16.method4114(this.aClass21_Sub2_16.method4076(arg0), 7681);
		this.aClass21_Sub2_16.method4077(1, 34167, 768);
		this.aClass21_Sub2_16.method4078(0, 34168, 770);
		this.aClass21_Sub2_16.method4073(0);
		this.aClass21_Sub2_16.method4074(this.aClass4_Sub1_Sub1_2);
		this.aClass21_Sub2_16.method4114(34479, 7681);
		this.aClass21_Sub2_16.method4077(1, 34166, 768);
		if (this.anInt122 == 0) {
			this.aClass21_Sub2_16.method4080(1.0F, 0.5F, 0.5F, 0.0F);
		} else if (this.anInt122 == 1) {
			this.aClass21_Sub2_16.method4080(0.5F, 1.0F, 0.5F, 0.0F);
		} else if (this.anInt122 == 2) {
			this.aClass21_Sub2_16.method4080(0.5F, 0.5F, 1.0F, 0.0F);
		} else if (this.anInt122 == 3) {
			this.aClass21_Sub2_16.method4080(128.5F, 128.5F, 128.5F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!aas", name = "cx", descriptor = "(I)V", line = 101)
	void method1094(@OriginalArg(0) int arg0) {
		this.aClass21_Sub2_16.method4073(1);
		this.aClass21_Sub2_16.method4074(this.aClass4_Sub1_Sub1_3);
		this.aClass21_Sub2_16.method4114(this.aClass21_Sub2_16.method4076(arg0), 7681);
		this.aClass21_Sub2_16.method4077(1, 34167, 768);
		this.aClass21_Sub2_16.method4078(0, 34168, 770);
		this.aClass21_Sub2_16.method4073(0);
		this.aClass21_Sub2_16.method4074(this.aClass4_Sub1_Sub1_2);
		this.aClass21_Sub2_16.method4114(34479, 7681);
		this.aClass21_Sub2_16.method4077(1, 34166, 768);
		if (this.anInt122 == 0) {
			this.aClass21_Sub2_16.method4080(1.0F, 0.5F, 0.5F, 0.0F);
		} else if (this.anInt122 == 1) {
			this.aClass21_Sub2_16.method4080(0.5F, 1.0F, 0.5F, 0.0F);
		} else if (this.anInt122 == 2) {
			this.aClass21_Sub2_16.method4080(0.5F, 0.5F, 1.0F, 0.0F);
		} else if (this.anInt122 == 3) {
			this.aClass21_Sub2_16.method4080(128.5F, 128.5F, 128.5F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!aas", name = "cy", descriptor = "(I)V", line = 101)
	void method1095(@OriginalArg(0) int arg0) {
		this.aClass21_Sub2_16.method4073(1);
		this.aClass21_Sub2_16.method4074(this.aClass4_Sub1_Sub1_3);
		this.aClass21_Sub2_16.method4114(this.aClass21_Sub2_16.method4076(arg0), 7681);
		this.aClass21_Sub2_16.method4077(1, 34167, 768);
		this.aClass21_Sub2_16.method4078(0, 34168, 770);
		this.aClass21_Sub2_16.method4073(0);
		this.aClass21_Sub2_16.method4074(this.aClass4_Sub1_Sub1_2);
		this.aClass21_Sub2_16.method4114(34479, 7681);
		this.aClass21_Sub2_16.method4077(1, 34166, 768);
		if (this.anInt122 == 0) {
			this.aClass21_Sub2_16.method4080(1.0F, 0.5F, 0.5F, 0.0F);
		} else if (this.anInt122 == 1) {
			this.aClass21_Sub2_16.method4080(0.5F, 1.0F, 0.5F, 0.0F);
		} else if (this.anInt122 == 2) {
			this.aClass21_Sub2_16.method4080(0.5F, 0.5F, 1.0F, 0.0F);
		} else if (this.anInt122 == 3) {
			this.aClass21_Sub2_16.method4080(128.5F, 128.5F, 128.5F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!aas", name = "cb", descriptor = "(I)V", line = 101)
	void method1096(@OriginalArg(0) int arg0) {
		this.aClass21_Sub2_16.method4073(1);
		this.aClass21_Sub2_16.method4074(this.aClass4_Sub1_Sub1_3);
		this.aClass21_Sub2_16.method4114(this.aClass21_Sub2_16.method4076(arg0), 7681);
		this.aClass21_Sub2_16.method4077(1, 34167, 768);
		this.aClass21_Sub2_16.method4078(0, 34168, 770);
		this.aClass21_Sub2_16.method4073(0);
		this.aClass21_Sub2_16.method4074(this.aClass4_Sub1_Sub1_2);
		this.aClass21_Sub2_16.method4114(34479, 7681);
		this.aClass21_Sub2_16.method4077(1, 34166, 768);
		if (this.anInt122 == 0) {
			this.aClass21_Sub2_16.method4080(1.0F, 0.5F, 0.5F, 0.0F);
		} else if (this.anInt122 == 1) {
			this.aClass21_Sub2_16.method4080(0.5F, 1.0F, 0.5F, 0.0F);
		} else if (this.anInt122 == 2) {
			this.aClass21_Sub2_16.method4080(0.5F, 0.5F, 1.0F, 0.0F);
		} else if (this.anInt122 == 3) {
			this.aClass21_Sub2_16.method4080(128.5F, 128.5F, 128.5F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!aas", name = "cg", descriptor = "()V", line = 117)
	void method1090() {
		this.aClass21_Sub2_16.method4073(1);
		this.aClass21_Sub2_16.method4074(null);
		this.aClass21_Sub2_16.method4114(8448, 8448);
		this.aClass21_Sub2_16.method4077(1, 34168, 768);
		this.aClass21_Sub2_16.method4078(0, 5890, 770);
		this.aClass21_Sub2_16.method4073(0);
		this.aClass21_Sub2_16.method4077(1, 34168, 768);
	}

	@OriginalMember(owner = "client!aas", name = "az", descriptor = "(IIIII)V", line = 127)
	@Override
	public void method16812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass4_Sub1_Sub1_3.method33712(false);
		this.aClass21_Sub2_16.method4068();
		this.aClass21_Sub2_16.method4089(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(30) int local30 = arg0 + this.anInt121;
		@Pc(35) int local35 = arg1 + this.anInt124;
		if (this.aClass4_Sub1_Sub1_2 == null) {
			this.aClass21_Sub2_16.method4074(this.aClass4_Sub1_Sub1_3);
			this.aClass21_Sub2_16.method4115(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass4_Sub1_Sub1_3.aFloat151);
			OpenGL.glVertex2i(local30, local35);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local30, local35 + this.aClass4_Sub1_Sub1_3.anInt2030);
			OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat152, 0.0F);
			OpenGL.glVertex2i(local30 + this.aClass4_Sub1_Sub1_3.anInt2031, local35 + this.aClass4_Sub1_Sub1_3.anInt2030);
			OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat152, this.aClass4_Sub1_Sub1_3.aFloat151);
			OpenGL.glVertex2i(local30 + this.aClass4_Sub1_Sub1_3.anInt2031, local35);
			OpenGL.glEnd();
			return;
		}
		this.method1088(arg2);
		this.aClass4_Sub1_Sub1_2.method33712(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass4_Sub1_Sub1_3.aFloat151);
		OpenGL.glTexCoord2f(0.0F, this.aClass4_Sub1_Sub1_3.aFloat151);
		OpenGL.glVertex2i(local30, local35);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local30, local35 + this.aClass4_Sub1_Sub1_3.anInt2030);
		OpenGL.glMultiTexCoord2f(33985, this.aClass4_Sub1_Sub1_3.aFloat152, 0.0F);
		OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat152, 0.0F);
		OpenGL.glVertex2i(local30 + this.aClass4_Sub1_Sub1_3.anInt2031, local35 + this.aClass4_Sub1_Sub1_3.anInt2030);
		OpenGL.glMultiTexCoord2f(33985, this.aClass4_Sub1_Sub1_3.aFloat152, this.aClass4_Sub1_Sub1_3.aFloat151);
		OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat152, this.aClass4_Sub1_Sub1_3.aFloat151);
		OpenGL.glVertex2i(local30 + this.aClass4_Sub1_Sub1_3.anInt2031, local35);
		OpenGL.glEnd();
		this.method1090();
	}

	@OriginalMember(owner = "client!aas", name = "c", descriptor = "(IIIII)V", line = 127)
	@Override
	public void method16794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass4_Sub1_Sub1_3.method33712(false);
		this.aClass21_Sub2_16.method4068();
		this.aClass21_Sub2_16.method4089(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(30) int local30 = arg0 + this.anInt121;
		@Pc(35) int local35 = arg1 + this.anInt124;
		if (this.aClass4_Sub1_Sub1_2 == null) {
			this.aClass21_Sub2_16.method4074(this.aClass4_Sub1_Sub1_3);
			this.aClass21_Sub2_16.method4115(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass4_Sub1_Sub1_3.aFloat151);
			OpenGL.glVertex2i(local30, local35);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local30, local35 + this.aClass4_Sub1_Sub1_3.anInt2030);
			OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat152, 0.0F);
			OpenGL.glVertex2i(local30 + this.aClass4_Sub1_Sub1_3.anInt2031, local35 + this.aClass4_Sub1_Sub1_3.anInt2030);
			OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat152, this.aClass4_Sub1_Sub1_3.aFloat151);
			OpenGL.glVertex2i(local30 + this.aClass4_Sub1_Sub1_3.anInt2031, local35);
			OpenGL.glEnd();
			return;
		}
		this.method1088(arg2);
		this.aClass4_Sub1_Sub1_2.method33712(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass4_Sub1_Sub1_3.aFloat151);
		OpenGL.glTexCoord2f(0.0F, this.aClass4_Sub1_Sub1_3.aFloat151);
		OpenGL.glVertex2i(local30, local35);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local30, local35 + this.aClass4_Sub1_Sub1_3.anInt2030);
		OpenGL.glMultiTexCoord2f(33985, this.aClass4_Sub1_Sub1_3.aFloat152, 0.0F);
		OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat152, 0.0F);
		OpenGL.glVertex2i(local30 + this.aClass4_Sub1_Sub1_3.anInt2031, local35 + this.aClass4_Sub1_Sub1_3.anInt2030);
		OpenGL.glMultiTexCoord2f(33985, this.aClass4_Sub1_Sub1_3.aFloat152, this.aClass4_Sub1_Sub1_3.aFloat151);
		OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat152, this.aClass4_Sub1_Sub1_3.aFloat151);
		OpenGL.glVertex2i(local30 + this.aClass4_Sub1_Sub1_3.anInt2031, local35);
		OpenGL.glEnd();
		this.method1090();
	}

	@OriginalMember(owner = "client!aas", name = "z", descriptor = "(IILclient!ch;II)V", line = 169)
	@Override
	public void method16785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) Class5_Sub2 local2 = (Class5_Sub2) arg2;
		@Pc(5) Class4_Sub1_Sub1 local5 = local2.aClass4_Sub1_Sub1_1;
		this.aClass4_Sub1_Sub1_3.method33712(false);
		this.aClass21_Sub2_16.method4068();
		this.aClass21_Sub2_16.method4074(this.aClass4_Sub1_Sub1_3);
		this.aClass21_Sub2_16.method4115(1);
		this.aClass21_Sub2_16.method4073(1);
		this.aClass21_Sub2_16.method4074(local5);
		this.aClass21_Sub2_16.method4114(7681, 8448);
		this.aClass21_Sub2_16.method4077(0, 34168, 768);
		this.aClass21_Sub2_16.method4089(1);
		@Pc(49) int local49 = arg0 + this.anInt121;
		@Pc(54) int local54 = arg1 + this.anInt124;
		@Pc(60) int local60 = local49 + this.aClass4_Sub1_Sub1_3.anInt2031;
		@Pc(66) int local66 = local54 + this.aClass4_Sub1_Sub1_3.anInt2030;
		@Pc(73) float local73 = local5.aFloat152 / (float) local5.anInt2031;
		@Pc(80) float local80 = local5.aFloat151 / (float) local5.anInt2030;
		@Pc(87) float local87 = (float) (local49 - arg3) * local73;
		@Pc(94) float local94 = (float) (local60 - arg3) * local73;
		@Pc(104) float local104 = local5.aFloat151 - (float) (local54 - arg4) * local80;
		@Pc(114) float local114 = local5.aFloat151 - (float) (local66 - arg4) * local80;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass4_Sub1_Sub1_3.aFloat151);
		OpenGL.glMultiTexCoord2f(33985, local87, local104);
		OpenGL.glVertex2i(local49, local54);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local87, local114);
		OpenGL.glVertex2i(local49, local54 + this.aClass4_Sub1_Sub1_3.anInt2030);
		OpenGL.glMultiTexCoord2f(33984, this.aClass4_Sub1_Sub1_3.aFloat152, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local94, local114);
		OpenGL.glVertex2i(local49 + this.aClass4_Sub1_Sub1_3.anInt2031, local54 + this.aClass4_Sub1_Sub1_3.anInt2030);
		OpenGL.glMultiTexCoord2f(33984, this.aClass4_Sub1_Sub1_3.aFloat152, this.aClass4_Sub1_Sub1_3.aFloat151);
		OpenGL.glMultiTexCoord2f(33985, local94, local104);
		OpenGL.glVertex2i(local49 + this.aClass4_Sub1_Sub1_3.anInt2031, local54);
		OpenGL.glEnd();
		this.aClass21_Sub2_16.method4077(0, 5890, 768);
		this.aClass21_Sub2_16.method4115(0);
		this.aClass21_Sub2_16.method4074(null);
		this.aClass21_Sub2_16.method4073(0);
	}

	@OriginalMember(owner = "client!aas", name = "aq", descriptor = "(IILclient!ch;II)V", line = 169)
	@Override
	public void method16802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) Class5_Sub2 local2 = (Class5_Sub2) arg2;
		@Pc(5) Class4_Sub1_Sub1 local5 = local2.aClass4_Sub1_Sub1_1;
		this.aClass4_Sub1_Sub1_3.method33712(false);
		this.aClass21_Sub2_16.method4068();
		this.aClass21_Sub2_16.method4074(this.aClass4_Sub1_Sub1_3);
		this.aClass21_Sub2_16.method4115(1);
		this.aClass21_Sub2_16.method4073(1);
		this.aClass21_Sub2_16.method4074(local5);
		this.aClass21_Sub2_16.method4114(7681, 8448);
		this.aClass21_Sub2_16.method4077(0, 34168, 768);
		this.aClass21_Sub2_16.method4089(1);
		@Pc(49) int local49 = arg0 + this.anInt121;
		@Pc(54) int local54 = arg1 + this.anInt124;
		@Pc(60) int local60 = local49 + this.aClass4_Sub1_Sub1_3.anInt2031;
		@Pc(66) int local66 = local54 + this.aClass4_Sub1_Sub1_3.anInt2030;
		@Pc(73) float local73 = local5.aFloat152 / (float) local5.anInt2031;
		@Pc(80) float local80 = local5.aFloat151 / (float) local5.anInt2030;
		@Pc(87) float local87 = (float) (local49 - arg3) * local73;
		@Pc(94) float local94 = (float) (local60 - arg3) * local73;
		@Pc(104) float local104 = local5.aFloat151 - (float) (local54 - arg4) * local80;
		@Pc(114) float local114 = local5.aFloat151 - (float) (local66 - arg4) * local80;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass4_Sub1_Sub1_3.aFloat151);
		OpenGL.glMultiTexCoord2f(33985, local87, local104);
		OpenGL.glVertex2i(local49, local54);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local87, local114);
		OpenGL.glVertex2i(local49, local54 + this.aClass4_Sub1_Sub1_3.anInt2030);
		OpenGL.glMultiTexCoord2f(33984, this.aClass4_Sub1_Sub1_3.aFloat152, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local94, local114);
		OpenGL.glVertex2i(local49 + this.aClass4_Sub1_Sub1_3.anInt2031, local54 + this.aClass4_Sub1_Sub1_3.anInt2030);
		OpenGL.glMultiTexCoord2f(33984, this.aClass4_Sub1_Sub1_3.aFloat152, this.aClass4_Sub1_Sub1_3.aFloat151);
		OpenGL.glMultiTexCoord2f(33985, local94, local104);
		OpenGL.glVertex2i(local49 + this.aClass4_Sub1_Sub1_3.anInt2031, local54);
		OpenGL.glEnd();
		this.aClass21_Sub2_16.method4077(0, 5890, 768);
		this.aClass21_Sub2_16.method4115(0);
		this.aClass21_Sub2_16.method4074(null);
		this.aClass21_Sub2_16.method4073(0);
	}

	@OriginalMember(owner = "client!aas", name = "av", descriptor = "(IILclient!ch;II)V", line = 169)
	@Override
	public void method16810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) Class5_Sub2 local2 = (Class5_Sub2) arg2;
		@Pc(5) Class4_Sub1_Sub1 local5 = local2.aClass4_Sub1_Sub1_1;
		this.aClass4_Sub1_Sub1_3.method33712(false);
		this.aClass21_Sub2_16.method4068();
		this.aClass21_Sub2_16.method4074(this.aClass4_Sub1_Sub1_3);
		this.aClass21_Sub2_16.method4115(1);
		this.aClass21_Sub2_16.method4073(1);
		this.aClass21_Sub2_16.method4074(local5);
		this.aClass21_Sub2_16.method4114(7681, 8448);
		this.aClass21_Sub2_16.method4077(0, 34168, 768);
		this.aClass21_Sub2_16.method4089(1);
		@Pc(49) int local49 = arg0 + this.anInt121;
		@Pc(54) int local54 = arg1 + this.anInt124;
		@Pc(60) int local60 = local49 + this.aClass4_Sub1_Sub1_3.anInt2031;
		@Pc(66) int local66 = local54 + this.aClass4_Sub1_Sub1_3.anInt2030;
		@Pc(73) float local73 = local5.aFloat152 / (float) local5.anInt2031;
		@Pc(80) float local80 = local5.aFloat151 / (float) local5.anInt2030;
		@Pc(87) float local87 = (float) (local49 - arg3) * local73;
		@Pc(94) float local94 = (float) (local60 - arg3) * local73;
		@Pc(104) float local104 = local5.aFloat151 - (float) (local54 - arg4) * local80;
		@Pc(114) float local114 = local5.aFloat151 - (float) (local66 - arg4) * local80;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass4_Sub1_Sub1_3.aFloat151);
		OpenGL.glMultiTexCoord2f(33985, local87, local104);
		OpenGL.glVertex2i(local49, local54);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local87, local114);
		OpenGL.glVertex2i(local49, local54 + this.aClass4_Sub1_Sub1_3.anInt2030);
		OpenGL.glMultiTexCoord2f(33984, this.aClass4_Sub1_Sub1_3.aFloat152, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local94, local114);
		OpenGL.glVertex2i(local49 + this.aClass4_Sub1_Sub1_3.anInt2031, local54 + this.aClass4_Sub1_Sub1_3.anInt2030);
		OpenGL.glMultiTexCoord2f(33984, this.aClass4_Sub1_Sub1_3.aFloat152, this.aClass4_Sub1_Sub1_3.aFloat151);
		OpenGL.glMultiTexCoord2f(33985, local94, local104);
		OpenGL.glVertex2i(local49 + this.aClass4_Sub1_Sub1_3.anInt2031, local54);
		OpenGL.glEnd();
		this.aClass21_Sub2_16.method4077(0, 5890, 768);
		this.aClass21_Sub2_16.method4115(0);
		this.aClass21_Sub2_16.method4074(null);
		this.aClass21_Sub2_16.method4073(0);
	}

	@OriginalMember(owner = "client!aas", name = "e", descriptor = "(IIIIIIII)V", line = 212)
	@Override
	void method16846(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass4_Sub1_Sub1_3.method33712((arg7 & 0x1) != 0);
		this.aClass21_Sub2_16.method4068();
		this.aClass21_Sub2_16.method4089(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean34) {
			@Pc(41) float local41 = (float) arg2 / (float) this.method16772();
			@Pc(48) float local48 = (float) arg3 / (float) this.method16779();
			@Pc(57) float local57 = (float) arg0 + (float) this.anInt121 * local41;
			@Pc(66) float local66 = (float) arg1 + (float) this.anInt124 * local48;
			@Pc(75) float local75 = local57 + (float) this.aClass4_Sub1_Sub1_3.anInt2031 * local41;
			@Pc(84) float local84 = local66 + (float) this.aClass4_Sub1_Sub1_3.anInt2030 * local48;
			if (this.aClass4_Sub1_Sub1_2 == null) {
				this.aClass21_Sub2_16.method4074(this.aClass4_Sub1_Sub1_3);
				this.aClass21_Sub2_16.method4115(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass4_Sub1_Sub1_3.aFloat151);
				OpenGL.glVertex2f(local57, local66);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local57, local84);
				OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat152, 0.0F);
				OpenGL.glVertex2f(local75, local84);
				OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat152, this.aClass4_Sub1_Sub1_3.aFloat151);
				OpenGL.glVertex2f(local75, local66);
				OpenGL.glEnd();
			} else {
				this.method1088(arg4);
				this.aClass4_Sub1_Sub1_2.method33712(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass4_Sub1_Sub1_3.aFloat151);
				OpenGL.glTexCoord2f(0.0F, this.aClass4_Sub1_Sub1_3.aFloat151);
				OpenGL.glVertex2f(local57, local66);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local57, local84);
				OpenGL.glMultiTexCoord2f(33985, this.aClass4_Sub1_Sub1_3.aFloat152, 0.0F);
				OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat152, 0.0F);
				OpenGL.glVertex2f(local75, local84);
				OpenGL.glMultiTexCoord2f(33985, this.aClass4_Sub1_Sub1_3.aFloat152, this.aClass4_Sub1_Sub1_3.aFloat151);
				OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat152, this.aClass4_Sub1_Sub1_3.aFloat151);
				OpenGL.glVertex2f(local75, local66);
				OpenGL.glEnd();
				this.method1090();
			}
		} else if (this.aClass4_Sub1_Sub1_2 == null) {
			this.aClass21_Sub2_16.method4074(this.aClass4_Sub1_Sub1_3);
			this.aClass21_Sub2_16.method4115(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass4_Sub1_Sub1_3.aFloat151);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat152, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat152, this.aClass4_Sub1_Sub1_3.aFloat151);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method1088(arg4);
			this.aClass4_Sub1_Sub1_2.method33712(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass4_Sub1_Sub1_3.aFloat151);
			OpenGL.glTexCoord2f(0.0F, this.aClass4_Sub1_Sub1_3.aFloat151);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass4_Sub1_Sub1_3.aFloat152, 0.0F);
			OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat152, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass4_Sub1_Sub1_3.aFloat152, this.aClass4_Sub1_Sub1_3.aFloat151);
			OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat152, this.aClass4_Sub1_Sub1_3.aFloat151);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method1090();
		}
	}

	@OriginalMember(owner = "client!aas", name = "ax", descriptor = "(IIIIIIII)V", line = 212)
	@Override
	void method16811(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass4_Sub1_Sub1_3.method33712((arg7 & 0x1) != 0);
		this.aClass21_Sub2_16.method4068();
		this.aClass21_Sub2_16.method4089(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean34) {
			@Pc(41) float local41 = (float) arg2 / (float) this.method16772();
			@Pc(48) float local48 = (float) arg3 / (float) this.method16779();
			@Pc(57) float local57 = (float) arg0 + (float) this.anInt121 * local41;
			@Pc(66) float local66 = (float) arg1 + (float) this.anInt124 * local48;
			@Pc(75) float local75 = local57 + (float) this.aClass4_Sub1_Sub1_3.anInt2031 * local41;
			@Pc(84) float local84 = local66 + (float) this.aClass4_Sub1_Sub1_3.anInt2030 * local48;
			if (this.aClass4_Sub1_Sub1_2 == null) {
				this.aClass21_Sub2_16.method4074(this.aClass4_Sub1_Sub1_3);
				this.aClass21_Sub2_16.method4115(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass4_Sub1_Sub1_3.aFloat151);
				OpenGL.glVertex2f(local57, local66);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local57, local84);
				OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat152, 0.0F);
				OpenGL.glVertex2f(local75, local84);
				OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat152, this.aClass4_Sub1_Sub1_3.aFloat151);
				OpenGL.glVertex2f(local75, local66);
				OpenGL.glEnd();
			} else {
				this.method1088(arg4);
				this.aClass4_Sub1_Sub1_2.method33712(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass4_Sub1_Sub1_3.aFloat151);
				OpenGL.glTexCoord2f(0.0F, this.aClass4_Sub1_Sub1_3.aFloat151);
				OpenGL.glVertex2f(local57, local66);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local57, local84);
				OpenGL.glMultiTexCoord2f(33985, this.aClass4_Sub1_Sub1_3.aFloat152, 0.0F);
				OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat152, 0.0F);
				OpenGL.glVertex2f(local75, local84);
				OpenGL.glMultiTexCoord2f(33985, this.aClass4_Sub1_Sub1_3.aFloat152, this.aClass4_Sub1_Sub1_3.aFloat151);
				OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat152, this.aClass4_Sub1_Sub1_3.aFloat151);
				OpenGL.glVertex2f(local75, local66);
				OpenGL.glEnd();
				this.method1090();
			}
		} else if (this.aClass4_Sub1_Sub1_2 == null) {
			this.aClass21_Sub2_16.method4074(this.aClass4_Sub1_Sub1_3);
			this.aClass21_Sub2_16.method4115(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass4_Sub1_Sub1_3.aFloat151);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat152, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat152, this.aClass4_Sub1_Sub1_3.aFloat151);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method1088(arg4);
			this.aClass4_Sub1_Sub1_2.method33712(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass4_Sub1_Sub1_3.aFloat151);
			OpenGL.glTexCoord2f(0.0F, this.aClass4_Sub1_Sub1_3.aFloat151);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass4_Sub1_Sub1_3.aFloat152, 0.0F);
			OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat152, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass4_Sub1_Sub1_3.aFloat152, this.aClass4_Sub1_Sub1_3.aFloat151);
			OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat152, this.aClass4_Sub1_Sub1_3.aFloat151);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method1090();
		}
	}

	@OriginalMember(owner = "client!aas", name = "d", descriptor = "(IIIIIII)V", line = 295)
	@Override
	public void method16790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0 + arg2;
		@Pc(7) int local7 = arg1 + arg3;
		this.aClass4_Sub1_Sub1_3.method33712(false);
		this.aClass21_Sub2_16.method4068();
		this.aClass21_Sub2_16.method4074(this.aClass4_Sub1_Sub1_3);
		this.aClass21_Sub2_16.method4089(arg6);
		this.aClass21_Sub2_16.method4115(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass4_Sub1_Sub1_3.aBoolean344 && !this.aBoolean34 && arg3 >= this.aClass4_Sub1_Sub1_3.anInt2030 && arg2 >= this.aClass4_Sub1_Sub1_3.anInt2031) {
			@Pc(71) float local71 = this.aClass4_Sub1_Sub1_3.aFloat151 * (float) arg3 / (float) this.aClass4_Sub1_Sub1_3.anInt2030;
			@Pc(83) float local83 = this.aClass4_Sub1_Sub1_3.aFloat152 * (float) arg2 / (float) this.aClass4_Sub1_Sub1_3.anInt2031;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local71);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local7);
			OpenGL.glTexCoord2f(local83, 0.0F);
			OpenGL.glVertex2i(local3, local7);
			OpenGL.glTexCoord2f(local83, local71);
			OpenGL.glVertex2i(local3, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt121, (float) this.anInt124, 0.0F);
		@Pc(123) int local123 = this.method16772();
		@Pc(126) int local126 = this.method16779();
		@Pc(132) int local132 = arg1 + this.aClass4_Sub1_Sub1_3.anInt2030;
		OpenGL.glBegin(7);
		@Pc(136) int local136 = arg1;
		@Pc(145) int local145;
		while (local132 <= local7) {
			local145 = arg0 + this.aClass4_Sub1_Sub1_3.anInt2031;
			@Pc(147) int local147 = arg0;
			while (local145 <= local3) {
				OpenGL.glTexCoord2f(0.0F, this.aClass4_Sub1_Sub1_3.aFloat151);
				OpenGL.glVertex2i(local147, local136);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local147, local132);
				OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat152, 0.0F);
				OpenGL.glVertex2i(local145, local132);
				OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat152, this.aClass4_Sub1_Sub1_3.aFloat151);
				OpenGL.glVertex2i(local145, local136);
				local145 += local123;
				local147 += local123;
			}
			if (local147 < local3) {
				@Pc(208) float local208 = this.aClass4_Sub1_Sub1_3.aFloat152 * (float) (local3 - local147) / (float) this.aClass4_Sub1_Sub1_3.anInt2031;
				OpenGL.glTexCoord2f(0.0F, this.aClass4_Sub1_Sub1_3.aFloat151);
				OpenGL.glVertex2i(local147, local136);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local147, local132);
				OpenGL.glTexCoord2f(local208, 0.0F);
				OpenGL.glVertex2i(local3, local132);
				OpenGL.glTexCoord2f(local208, this.aClass4_Sub1_Sub1_3.aFloat151);
				OpenGL.glVertex2i(local3, local136);
			}
			local136 += local126;
			local132 += local126;
		}
		if (local136 < local7) {
			@Pc(266) float local266 = this.aClass4_Sub1_Sub1_3.aFloat151 * (float) (this.aClass4_Sub1_Sub1_3.anInt2030 - (local7 - local136)) / (float) this.aClass4_Sub1_Sub1_3.anInt2030;
			@Pc(272) int local272 = arg0 + this.aClass4_Sub1_Sub1_3.anInt2031;
			local145 = arg0;
			while (local272 <= local3) {
				OpenGL.glTexCoord2f(0.0F, this.aClass4_Sub1_Sub1_3.aFloat151);
				OpenGL.glVertex2i(local145, local136);
				OpenGL.glTexCoord2f(0.0F, local266);
				OpenGL.glVertex2i(local145, local7);
				OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat152, local266);
				OpenGL.glVertex2i(local272, local7);
				OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat152, this.aClass4_Sub1_Sub1_3.aFloat151);
				OpenGL.glVertex2i(local272, local136);
				local272 += local123;
				local145 += local123;
			}
			if (local145 < local3) {
				@Pc(335) float local335 = this.aClass4_Sub1_Sub1_3.aFloat152 * (float) (local3 - local145) / (float) this.aClass4_Sub1_Sub1_3.anInt2031;
				OpenGL.glTexCoord2f(0.0F, this.aClass4_Sub1_Sub1_3.aFloat151);
				OpenGL.glVertex2i(local145, local136);
				OpenGL.glTexCoord2f(0.0F, local266);
				OpenGL.glVertex2i(local145, local7);
				OpenGL.glTexCoord2f(local335, local266);
				OpenGL.glVertex2i(local3, local7);
				OpenGL.glTexCoord2f(local335, this.aClass4_Sub1_Sub1_3.aFloat151);
				OpenGL.glVertex2i(local3, local136);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!aas", name = "aw", descriptor = "(IIIIIII)V", line = 295)
	@Override
	public void method16823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0 + arg2;
		@Pc(7) int local7 = arg1 + arg3;
		this.aClass4_Sub1_Sub1_3.method33712(false);
		this.aClass21_Sub2_16.method4068();
		this.aClass21_Sub2_16.method4074(this.aClass4_Sub1_Sub1_3);
		this.aClass21_Sub2_16.method4089(arg6);
		this.aClass21_Sub2_16.method4115(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass4_Sub1_Sub1_3.aBoolean344 && !this.aBoolean34 && arg3 >= this.aClass4_Sub1_Sub1_3.anInt2030 && arg2 >= this.aClass4_Sub1_Sub1_3.anInt2031) {
			@Pc(71) float local71 = this.aClass4_Sub1_Sub1_3.aFloat151 * (float) arg3 / (float) this.aClass4_Sub1_Sub1_3.anInt2030;
			@Pc(83) float local83 = this.aClass4_Sub1_Sub1_3.aFloat152 * (float) arg2 / (float) this.aClass4_Sub1_Sub1_3.anInt2031;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local71);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local7);
			OpenGL.glTexCoord2f(local83, 0.0F);
			OpenGL.glVertex2i(local3, local7);
			OpenGL.glTexCoord2f(local83, local71);
			OpenGL.glVertex2i(local3, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt121, (float) this.anInt124, 0.0F);
		@Pc(123) int local123 = this.method16772();
		@Pc(126) int local126 = this.method16779();
		@Pc(132) int local132 = arg1 + this.aClass4_Sub1_Sub1_3.anInt2030;
		OpenGL.glBegin(7);
		@Pc(136) int local136 = arg1;
		@Pc(145) int local145;
		while (local132 <= local7) {
			local145 = arg0 + this.aClass4_Sub1_Sub1_3.anInt2031;
			@Pc(147) int local147 = arg0;
			while (local145 <= local3) {
				OpenGL.glTexCoord2f(0.0F, this.aClass4_Sub1_Sub1_3.aFloat151);
				OpenGL.glVertex2i(local147, local136);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local147, local132);
				OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat152, 0.0F);
				OpenGL.glVertex2i(local145, local132);
				OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat152, this.aClass4_Sub1_Sub1_3.aFloat151);
				OpenGL.glVertex2i(local145, local136);
				local145 += local123;
				local147 += local123;
			}
			if (local147 < local3) {
				@Pc(208) float local208 = this.aClass4_Sub1_Sub1_3.aFloat152 * (float) (local3 - local147) / (float) this.aClass4_Sub1_Sub1_3.anInt2031;
				OpenGL.glTexCoord2f(0.0F, this.aClass4_Sub1_Sub1_3.aFloat151);
				OpenGL.glVertex2i(local147, local136);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local147, local132);
				OpenGL.glTexCoord2f(local208, 0.0F);
				OpenGL.glVertex2i(local3, local132);
				OpenGL.glTexCoord2f(local208, this.aClass4_Sub1_Sub1_3.aFloat151);
				OpenGL.glVertex2i(local3, local136);
			}
			local136 += local126;
			local132 += local126;
		}
		if (local136 < local7) {
			@Pc(266) float local266 = this.aClass4_Sub1_Sub1_3.aFloat151 * (float) (this.aClass4_Sub1_Sub1_3.anInt2030 - (local7 - local136)) / (float) this.aClass4_Sub1_Sub1_3.anInt2030;
			@Pc(272) int local272 = arg0 + this.aClass4_Sub1_Sub1_3.anInt2031;
			local145 = arg0;
			while (local272 <= local3) {
				OpenGL.glTexCoord2f(0.0F, this.aClass4_Sub1_Sub1_3.aFloat151);
				OpenGL.glVertex2i(local145, local136);
				OpenGL.glTexCoord2f(0.0F, local266);
				OpenGL.glVertex2i(local145, local7);
				OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat152, local266);
				OpenGL.glVertex2i(local272, local7);
				OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat152, this.aClass4_Sub1_Sub1_3.aFloat151);
				OpenGL.glVertex2i(local272, local136);
				local272 += local123;
				local145 += local123;
			}
			if (local145 < local3) {
				@Pc(335) float local335 = this.aClass4_Sub1_Sub1_3.aFloat152 * (float) (local3 - local145) / (float) this.aClass4_Sub1_Sub1_3.anInt2031;
				OpenGL.glTexCoord2f(0.0F, this.aClass4_Sub1_Sub1_3.aFloat151);
				OpenGL.glVertex2i(local145, local136);
				OpenGL.glTexCoord2f(0.0F, local266);
				OpenGL.glVertex2i(local145, local7);
				OpenGL.glTexCoord2f(local335, local266);
				OpenGL.glVertex2i(local3, local7);
				OpenGL.glTexCoord2f(local335, this.aClass4_Sub1_Sub1_3.aFloat151);
				OpenGL.glVertex2i(local3, local136);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!aas", name = "k", descriptor = "(FFFFFFIIII)V", line = 388)
	@Override
	void method16799(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean34) {
			local6 = this.method16772();
			local10 = this.method16779();
			@Pc(16) float local16 = (arg2 - arg0) / local6;
			@Pc(22) float local22 = (arg3 - arg1) / local6;
			@Pc(28) float local28 = (arg4 - arg0) / local10;
			@Pc(34) float local34 = (arg5 - arg1) / local10;
			@Pc(40) float local40 = local28 * (float) this.anInt124;
			@Pc(46) float local46 = local34 * (float) this.anInt124;
			@Pc(52) float local52 = local16 * (float) this.anInt121;
			@Pc(58) float local58 = local22 * (float) this.anInt121;
			@Pc(65) float local65 = -local16 * (float) this.anInt125;
			@Pc(72) float local72 = -local22 * (float) this.anInt125;
			@Pc(79) float local79 = -local28 * (float) this.anInt123;
			@Pc(86) float local86 = -local34 * (float) this.anInt123;
			arg0 = arg0 + local52 + local40;
			arg1 = arg1 + local58 + local46;
			arg2 = arg2 + local65 + local40;
			arg3 = arg3 + local72 + local46;
			arg4 = arg4 + local52 + local79;
			arg5 = arg5 + local58 + local86;
		}
		local6 = arg4 + (arg2 - arg0);
		local10 = arg3 + (arg5 - arg1);
		this.aClass4_Sub1_Sub1_3.method33712((arg9 & 0x1) != 0);
		this.aClass21_Sub2_16.method4068();
		this.aClass21_Sub2_16.method4074(this.aClass4_Sub1_Sub1_3);
		this.aClass21_Sub2_16.method4089(arg8);
		this.aClass21_Sub2_16.method4115(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass4_Sub1_Sub1_3.aFloat151);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat152, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat152, this.aClass4_Sub1_Sub1_3.aFloat151);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!aas", name = "ac", descriptor = "(FFFFFFIIII)V", line = 388)
	@Override
	void method16850(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean34) {
			local6 = this.method16772();
			local10 = this.method16779();
			@Pc(16) float local16 = (arg2 - arg0) / local6;
			@Pc(22) float local22 = (arg3 - arg1) / local6;
			@Pc(28) float local28 = (arg4 - arg0) / local10;
			@Pc(34) float local34 = (arg5 - arg1) / local10;
			@Pc(40) float local40 = local28 * (float) this.anInt124;
			@Pc(46) float local46 = local34 * (float) this.anInt124;
			@Pc(52) float local52 = local16 * (float) this.anInt121;
			@Pc(58) float local58 = local22 * (float) this.anInt121;
			@Pc(65) float local65 = -local16 * (float) this.anInt125;
			@Pc(72) float local72 = -local22 * (float) this.anInt125;
			@Pc(79) float local79 = -local28 * (float) this.anInt123;
			@Pc(86) float local86 = -local34 * (float) this.anInt123;
			arg0 = arg0 + local52 + local40;
			arg1 = arg1 + local58 + local46;
			arg2 = arg2 + local65 + local40;
			arg3 = arg3 + local72 + local46;
			arg4 = arg4 + local52 + local79;
			arg5 = arg5 + local58 + local86;
		}
		local6 = arg4 + (arg2 - arg0);
		local10 = arg3 + (arg5 - arg1);
		this.aClass4_Sub1_Sub1_3.method33712((arg9 & 0x1) != 0);
		this.aClass21_Sub2_16.method4068();
		this.aClass21_Sub2_16.method4074(this.aClass4_Sub1_Sub1_3);
		this.aClass21_Sub2_16.method4089(arg8);
		this.aClass21_Sub2_16.method4115(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass4_Sub1_Sub1_3.aFloat151);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat152, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat152, this.aClass4_Sub1_Sub1_3.aFloat151);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!aas", name = "bw", descriptor = "(FFFFFFIIII)V", line = 388)
	@Override
	void method16825(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean34) {
			local6 = this.method16772();
			local10 = this.method16779();
			@Pc(16) float local16 = (arg2 - arg0) / local6;
			@Pc(22) float local22 = (arg3 - arg1) / local6;
			@Pc(28) float local28 = (arg4 - arg0) / local10;
			@Pc(34) float local34 = (arg5 - arg1) / local10;
			@Pc(40) float local40 = local28 * (float) this.anInt124;
			@Pc(46) float local46 = local34 * (float) this.anInt124;
			@Pc(52) float local52 = local16 * (float) this.anInt121;
			@Pc(58) float local58 = local22 * (float) this.anInt121;
			@Pc(65) float local65 = -local16 * (float) this.anInt125;
			@Pc(72) float local72 = -local22 * (float) this.anInt125;
			@Pc(79) float local79 = -local28 * (float) this.anInt123;
			@Pc(86) float local86 = -local34 * (float) this.anInt123;
			arg0 = arg0 + local52 + local40;
			arg1 = arg1 + local58 + local46;
			arg2 = arg2 + local65 + local40;
			arg3 = arg3 + local72 + local46;
			arg4 = arg4 + local52 + local79;
			arg5 = arg5 + local58 + local86;
		}
		local6 = arg4 + (arg2 - arg0);
		local10 = arg3 + (arg5 - arg1);
		this.aClass4_Sub1_Sub1_3.method33712((arg9 & 0x1) != 0);
		this.aClass21_Sub2_16.method4068();
		this.aClass21_Sub2_16.method4074(this.aClass4_Sub1_Sub1_3);
		this.aClass21_Sub2_16.method4089(arg8);
		this.aClass21_Sub2_16.method4115(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass4_Sub1_Sub1_3.aFloat151);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat152, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat152, this.aClass4_Sub1_Sub1_3.aFloat151);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!aas", name = "bp", descriptor = "(FFFFFFIIII)V", line = 388)
	@Override
	void method16826(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean34) {
			local6 = this.method16772();
			local10 = this.method16779();
			@Pc(16) float local16 = (arg2 - arg0) / local6;
			@Pc(22) float local22 = (arg3 - arg1) / local6;
			@Pc(28) float local28 = (arg4 - arg0) / local10;
			@Pc(34) float local34 = (arg5 - arg1) / local10;
			@Pc(40) float local40 = local28 * (float) this.anInt124;
			@Pc(46) float local46 = local34 * (float) this.anInt124;
			@Pc(52) float local52 = local16 * (float) this.anInt121;
			@Pc(58) float local58 = local22 * (float) this.anInt121;
			@Pc(65) float local65 = -local16 * (float) this.anInt125;
			@Pc(72) float local72 = -local22 * (float) this.anInt125;
			@Pc(79) float local79 = -local28 * (float) this.anInt123;
			@Pc(86) float local86 = -local34 * (float) this.anInt123;
			arg0 = arg0 + local52 + local40;
			arg1 = arg1 + local58 + local46;
			arg2 = arg2 + local65 + local40;
			arg3 = arg3 + local72 + local46;
			arg4 = arg4 + local52 + local79;
			arg5 = arg5 + local58 + local86;
		}
		local6 = arg4 + (arg2 - arg0);
		local10 = arg3 + (arg5 - arg1);
		this.aClass4_Sub1_Sub1_3.method33712((arg9 & 0x1) != 0);
		this.aClass21_Sub2_16.method4068();
		this.aClass21_Sub2_16.method4074(this.aClass4_Sub1_Sub1_3);
		this.aClass21_Sub2_16.method4089(arg8);
		this.aClass21_Sub2_16.method4115(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass4_Sub1_Sub1_3.aFloat151);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat152, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat152, this.aClass4_Sub1_Sub1_3.aFloat151);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!aas", name = "bd", descriptor = "(FFFFFFIIII)V", line = 388)
	@Override
	void method16827(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean34) {
			local6 = this.method16772();
			local10 = this.method16779();
			@Pc(16) float local16 = (arg2 - arg0) / local6;
			@Pc(22) float local22 = (arg3 - arg1) / local6;
			@Pc(28) float local28 = (arg4 - arg0) / local10;
			@Pc(34) float local34 = (arg5 - arg1) / local10;
			@Pc(40) float local40 = local28 * (float) this.anInt124;
			@Pc(46) float local46 = local34 * (float) this.anInt124;
			@Pc(52) float local52 = local16 * (float) this.anInt121;
			@Pc(58) float local58 = local22 * (float) this.anInt121;
			@Pc(65) float local65 = -local16 * (float) this.anInt125;
			@Pc(72) float local72 = -local22 * (float) this.anInt125;
			@Pc(79) float local79 = -local28 * (float) this.anInt123;
			@Pc(86) float local86 = -local34 * (float) this.anInt123;
			arg0 = arg0 + local52 + local40;
			arg1 = arg1 + local58 + local46;
			arg2 = arg2 + local65 + local40;
			arg3 = arg3 + local72 + local46;
			arg4 = arg4 + local52 + local79;
			arg5 = arg5 + local58 + local86;
		}
		local6 = arg4 + (arg2 - arg0);
		local10 = arg3 + (arg5 - arg1);
		this.aClass4_Sub1_Sub1_3.method33712((arg9 & 0x1) != 0);
		this.aClass21_Sub2_16.method4068();
		this.aClass21_Sub2_16.method4074(this.aClass4_Sub1_Sub1_3);
		this.aClass21_Sub2_16.method4089(arg8);
		this.aClass21_Sub2_16.method4115(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass4_Sub1_Sub1_3.aFloat151);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat152, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat152, this.aClass4_Sub1_Sub1_3.aFloat151);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!aas", name = "bs", descriptor = "(FFFFFFILclient!ch;II)V", line = 431)
	@Override
	void method16828(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class5 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(3) Class4_Sub1_Sub1 local3 = ((Class5_Sub2) arg7).aClass4_Sub1_Sub1_1;
		@Pc(10) float local10;
		@Pc(14) float local14;
		@Pc(20) float local20;
		@Pc(26) float local26;
		if (this.aBoolean34) {
			local10 = this.method16772();
			local14 = this.method16779();
			local20 = (arg2 - arg0) / local10;
			local26 = (arg3 - arg1) / local10;
			@Pc(32) float local32 = (arg4 - arg0) / local14;
			@Pc(38) float local38 = (arg5 - arg1) / local14;
			@Pc(44) float local44 = local32 * (float) this.anInt124;
			@Pc(50) float local50 = local38 * (float) this.anInt124;
			@Pc(56) float local56 = local20 * (float) this.anInt121;
			@Pc(62) float local62 = local26 * (float) this.anInt121;
			@Pc(69) float local69 = -local20 * (float) this.anInt125;
			@Pc(76) float local76 = -local26 * (float) this.anInt125;
			@Pc(83) float local83 = -local32 * (float) this.anInt123;
			@Pc(90) float local90 = -local38 * (float) this.anInt123;
			arg0 = arg0 + local56 + local44;
			arg1 = arg1 + local62 + local50;
			arg2 = arg2 + local69 + local44;
			arg3 = arg3 + local76 + local50;
			arg4 = arg4 + local56 + local83;
			arg5 = arg5 + local62 + local90;
		}
		local10 = arg4 + (arg2 - arg0);
		local14 = arg3 + (arg5 - arg1);
		this.aClass4_Sub1_Sub1_3.method33712((arg6 & 0x1) != 0);
		this.aClass21_Sub2_16.method4068();
		this.aClass21_Sub2_16.method4074(this.aClass4_Sub1_Sub1_3);
		this.aClass21_Sub2_16.method4115(1);
		this.aClass21_Sub2_16.method4073(1);
		this.aClass21_Sub2_16.method4074(local3);
		this.aClass21_Sub2_16.method4114(7681, 8448);
		this.aClass21_Sub2_16.method4077(0, 34168, 768);
		this.aClass21_Sub2_16.method4089(1);
		local20 = local3.aFloat152 / (float) local3.anInt2031;
		local26 = local3.aFloat151 / (float) local3.anInt2030;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass4_Sub1_Sub1_3.aFloat151);
		OpenGL.glMultiTexCoord2f(33985, local20 * (arg0 - (float) arg8), local3.aFloat151 - local26 * (arg1 - (float) arg9));
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local20 * (arg4 - (float) arg8), local3.aFloat151 - local26 * (arg5 - (float) arg9));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass4_Sub1_Sub1_3.aFloat152, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local20 * (local10 - (float) arg8), local3.aFloat151 - local26 * (local14 - (float) arg9));
		OpenGL.glVertex2f(local10, local14);
		OpenGL.glMultiTexCoord2f(33984, this.aClass4_Sub1_Sub1_3.aFloat152, this.aClass4_Sub1_Sub1_3.aFloat151);
		OpenGL.glMultiTexCoord2f(33985, local20 * (arg2 - (float) arg8), local3.aFloat151 - local26 * (arg3 - (float) arg9));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass21_Sub2_16.method4077(0, 5890, 768);
		this.aClass21_Sub2_16.method4115(0);
		this.aClass21_Sub2_16.method4074(null);
		this.aClass21_Sub2_16.method4073(0);
	}

	@OriginalMember(owner = "client!aas", name = "af", descriptor = "(FFFFFFILclient!ch;II)V", line = 431)
	@Override
	void method16801(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class5 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(3) Class4_Sub1_Sub1 local3 = ((Class5_Sub2) arg7).aClass4_Sub1_Sub1_1;
		@Pc(10) float local10;
		@Pc(14) float local14;
		@Pc(20) float local20;
		@Pc(26) float local26;
		if (this.aBoolean34) {
			local10 = this.method16772();
			local14 = this.method16779();
			local20 = (arg2 - arg0) / local10;
			local26 = (arg3 - arg1) / local10;
			@Pc(32) float local32 = (arg4 - arg0) / local14;
			@Pc(38) float local38 = (arg5 - arg1) / local14;
			@Pc(44) float local44 = local32 * (float) this.anInt124;
			@Pc(50) float local50 = local38 * (float) this.anInt124;
			@Pc(56) float local56 = local20 * (float) this.anInt121;
			@Pc(62) float local62 = local26 * (float) this.anInt121;
			@Pc(69) float local69 = -local20 * (float) this.anInt125;
			@Pc(76) float local76 = -local26 * (float) this.anInt125;
			@Pc(83) float local83 = -local32 * (float) this.anInt123;
			@Pc(90) float local90 = -local38 * (float) this.anInt123;
			arg0 = arg0 + local56 + local44;
			arg1 = arg1 + local62 + local50;
			arg2 = arg2 + local69 + local44;
			arg3 = arg3 + local76 + local50;
			arg4 = arg4 + local56 + local83;
			arg5 = arg5 + local62 + local90;
		}
		local10 = arg4 + (arg2 - arg0);
		local14 = arg3 + (arg5 - arg1);
		this.aClass4_Sub1_Sub1_3.method33712((arg6 & 0x1) != 0);
		this.aClass21_Sub2_16.method4068();
		this.aClass21_Sub2_16.method4074(this.aClass4_Sub1_Sub1_3);
		this.aClass21_Sub2_16.method4115(1);
		this.aClass21_Sub2_16.method4073(1);
		this.aClass21_Sub2_16.method4074(local3);
		this.aClass21_Sub2_16.method4114(7681, 8448);
		this.aClass21_Sub2_16.method4077(0, 34168, 768);
		this.aClass21_Sub2_16.method4089(1);
		local20 = local3.aFloat152 / (float) local3.anInt2031;
		local26 = local3.aFloat151 / (float) local3.anInt2030;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass4_Sub1_Sub1_3.aFloat151);
		OpenGL.glMultiTexCoord2f(33985, local20 * (arg0 - (float) arg8), local3.aFloat151 - local26 * (arg1 - (float) arg9));
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local20 * (arg4 - (float) arg8), local3.aFloat151 - local26 * (arg5 - (float) arg9));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass4_Sub1_Sub1_3.aFloat152, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local20 * (local10 - (float) arg8), local3.aFloat151 - local26 * (local14 - (float) arg9));
		OpenGL.glVertex2f(local10, local14);
		OpenGL.glMultiTexCoord2f(33984, this.aClass4_Sub1_Sub1_3.aFloat152, this.aClass4_Sub1_Sub1_3.aFloat151);
		OpenGL.glMultiTexCoord2f(33985, local20 * (arg2 - (float) arg8), local3.aFloat151 - local26 * (arg3 - (float) arg9));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass21_Sub2_16.method4077(0, 5890, 768);
		this.aClass21_Sub2_16.method4115(0);
		this.aClass21_Sub2_16.method4074(null);
		this.aClass21_Sub2_16.method4073(0);
	}

	@OriginalMember(owner = "client!aas", name = "bf", descriptor = "(FFFFFFILclient!ch;II)V", line = 431)
	@Override
	void method16830(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class5 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(3) Class4_Sub1_Sub1 local3 = ((Class5_Sub2) arg7).aClass4_Sub1_Sub1_1;
		@Pc(10) float local10;
		@Pc(14) float local14;
		@Pc(20) float local20;
		@Pc(26) float local26;
		if (this.aBoolean34) {
			local10 = this.method16772();
			local14 = this.method16779();
			local20 = (arg2 - arg0) / local10;
			local26 = (arg3 - arg1) / local10;
			@Pc(32) float local32 = (arg4 - arg0) / local14;
			@Pc(38) float local38 = (arg5 - arg1) / local14;
			@Pc(44) float local44 = local32 * (float) this.anInt124;
			@Pc(50) float local50 = local38 * (float) this.anInt124;
			@Pc(56) float local56 = local20 * (float) this.anInt121;
			@Pc(62) float local62 = local26 * (float) this.anInt121;
			@Pc(69) float local69 = -local20 * (float) this.anInt125;
			@Pc(76) float local76 = -local26 * (float) this.anInt125;
			@Pc(83) float local83 = -local32 * (float) this.anInt123;
			@Pc(90) float local90 = -local38 * (float) this.anInt123;
			arg0 = arg0 + local56 + local44;
			arg1 = arg1 + local62 + local50;
			arg2 = arg2 + local69 + local44;
			arg3 = arg3 + local76 + local50;
			arg4 = arg4 + local56 + local83;
			arg5 = arg5 + local62 + local90;
		}
		local10 = arg4 + (arg2 - arg0);
		local14 = arg3 + (arg5 - arg1);
		this.aClass4_Sub1_Sub1_3.method33712((arg6 & 0x1) != 0);
		this.aClass21_Sub2_16.method4068();
		this.aClass21_Sub2_16.method4074(this.aClass4_Sub1_Sub1_3);
		this.aClass21_Sub2_16.method4115(1);
		this.aClass21_Sub2_16.method4073(1);
		this.aClass21_Sub2_16.method4074(local3);
		this.aClass21_Sub2_16.method4114(7681, 8448);
		this.aClass21_Sub2_16.method4077(0, 34168, 768);
		this.aClass21_Sub2_16.method4089(1);
		local20 = local3.aFloat152 / (float) local3.anInt2031;
		local26 = local3.aFloat151 / (float) local3.anInt2030;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass4_Sub1_Sub1_3.aFloat151);
		OpenGL.glMultiTexCoord2f(33985, local20 * (arg0 - (float) arg8), local3.aFloat151 - local26 * (arg1 - (float) arg9));
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local20 * (arg4 - (float) arg8), local3.aFloat151 - local26 * (arg5 - (float) arg9));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass4_Sub1_Sub1_3.aFloat152, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local20 * (local10 - (float) arg8), local3.aFloat151 - local26 * (local14 - (float) arg9));
		OpenGL.glVertex2f(local10, local14);
		OpenGL.glMultiTexCoord2f(33984, this.aClass4_Sub1_Sub1_3.aFloat152, this.aClass4_Sub1_Sub1_3.aFloat151);
		OpenGL.glMultiTexCoord2f(33985, local20 * (arg2 - (float) arg8), local3.aFloat151 - local26 * (arg3 - (float) arg9));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass21_Sub2_16.method4077(0, 5890, 768);
		this.aClass21_Sub2_16.method4115(0);
		this.aClass21_Sub2_16.method4074(null);
		this.aClass21_Sub2_16.method4073(0);
	}

	@OriginalMember(owner = "client!aas", name = "bm", descriptor = "(FFFFFFILclient!ch;II)V", line = 431)
	@Override
	void method16829(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class5 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(3) Class4_Sub1_Sub1 local3 = ((Class5_Sub2) arg7).aClass4_Sub1_Sub1_1;
		@Pc(10) float local10;
		@Pc(14) float local14;
		@Pc(20) float local20;
		@Pc(26) float local26;
		if (this.aBoolean34) {
			local10 = this.method16772();
			local14 = this.method16779();
			local20 = (arg2 - arg0) / local10;
			local26 = (arg3 - arg1) / local10;
			@Pc(32) float local32 = (arg4 - arg0) / local14;
			@Pc(38) float local38 = (arg5 - arg1) / local14;
			@Pc(44) float local44 = local32 * (float) this.anInt124;
			@Pc(50) float local50 = local38 * (float) this.anInt124;
			@Pc(56) float local56 = local20 * (float) this.anInt121;
			@Pc(62) float local62 = local26 * (float) this.anInt121;
			@Pc(69) float local69 = -local20 * (float) this.anInt125;
			@Pc(76) float local76 = -local26 * (float) this.anInt125;
			@Pc(83) float local83 = -local32 * (float) this.anInt123;
			@Pc(90) float local90 = -local38 * (float) this.anInt123;
			arg0 = arg0 + local56 + local44;
			arg1 = arg1 + local62 + local50;
			arg2 = arg2 + local69 + local44;
			arg3 = arg3 + local76 + local50;
			arg4 = arg4 + local56 + local83;
			arg5 = arg5 + local62 + local90;
		}
		local10 = arg4 + (arg2 - arg0);
		local14 = arg3 + (arg5 - arg1);
		this.aClass4_Sub1_Sub1_3.method33712((arg6 & 0x1) != 0);
		this.aClass21_Sub2_16.method4068();
		this.aClass21_Sub2_16.method4074(this.aClass4_Sub1_Sub1_3);
		this.aClass21_Sub2_16.method4115(1);
		this.aClass21_Sub2_16.method4073(1);
		this.aClass21_Sub2_16.method4074(local3);
		this.aClass21_Sub2_16.method4114(7681, 8448);
		this.aClass21_Sub2_16.method4077(0, 34168, 768);
		this.aClass21_Sub2_16.method4089(1);
		local20 = local3.aFloat152 / (float) local3.anInt2031;
		local26 = local3.aFloat151 / (float) local3.anInt2030;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass4_Sub1_Sub1_3.aFloat151);
		OpenGL.glMultiTexCoord2f(33985, local20 * (arg0 - (float) arg8), local3.aFloat151 - local26 * (arg1 - (float) arg9));
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local20 * (arg4 - (float) arg8), local3.aFloat151 - local26 * (arg5 - (float) arg9));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass4_Sub1_Sub1_3.aFloat152, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local20 * (local10 - (float) arg8), local3.aFloat151 - local26 * (local14 - (float) arg9));
		OpenGL.glVertex2f(local10, local14);
		OpenGL.glMultiTexCoord2f(33984, this.aClass4_Sub1_Sub1_3.aFloat152, this.aClass4_Sub1_Sub1_3.aFloat151);
		OpenGL.glMultiTexCoord2f(33985, local20 * (arg2 - (float) arg8), local3.aFloat151 - local26 * (arg3 - (float) arg9));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass21_Sub2_16.method4077(0, 5890, 768);
		this.aClass21_Sub2_16.method4115(0);
		this.aClass21_Sub2_16.method4074(null);
		this.aClass21_Sub2_16.method4073(0);
	}
}
