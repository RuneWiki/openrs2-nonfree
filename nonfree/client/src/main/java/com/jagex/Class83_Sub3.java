package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aeu")
public class Class83_Sub3 extends Class83 {

	@OriginalMember(owner = "client!aeu", name = "v", descriptor = "Lclient!aoa;")
	Class78_Sub2_Sub1 aClass78_Sub2_Sub1_2;

	@OriginalMember(owner = "client!aeu", name = "l", descriptor = "I")
	int anInt757 = 0;

	@OriginalMember(owner = "client!aeu", name = "y", descriptor = "Z")
	boolean aBoolean151 = false;

	@OriginalMember(owner = "client!aeu", name = "w", descriptor = "I")
	int anInt758 = 0;

	@OriginalMember(owner = "client!aeu", name = "t", descriptor = "I")
	int anInt756 = 0;

	@OriginalMember(owner = "client!aeu", name = "q", descriptor = "I")
	int anInt760 = 0;

	@OriginalMember(owner = "client!aeu", name = "x", descriptor = "I")
	int anInt759 = 0;

	@OriginalMember(owner = "client!aeu", name = "c", descriptor = "Lclient!aeq;")
	final Class86_Sub3 aClass86_Sub3_26;

	@OriginalMember(owner = "client!aeu", name = "p", descriptor = "Lclient!aoa;")
	final Class78_Sub2_Sub1 aClass78_Sub2_Sub1_1;

	@OriginalMember(owner = "client!aeu", name = "<init>", descriptor = "(Lclient!aeq;IIZ)V", line = 18)
	Class83_Sub3(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass86_Sub3_26 = arg0;
		this.aClass78_Sub2_Sub1_1 = Class78_Sub2_Sub1.method17518(arg0, arg3 ? Class212.aClass212_18 : Class212.aClass212_24, Class206.aClass206_23, arg1, arg2);
	}

	@OriginalMember(owner = "client!aeu", name = "<init>", descriptor = "(Lclient!aeq;IIII)V", line = 23)
	Class83_Sub3(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass86_Sub3_26 = arg0;
		this.aClass78_Sub2_Sub1_1 = Class78_Sub2_Sub1.method17531(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aeu", name = "<init>", descriptor = "(Lclient!aeq;II[III)V", line = 28)
	Class83_Sub3(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass86_Sub3_26 = arg0;
		this.aClass78_Sub2_Sub1_1 = Class78_Sub2_Sub1.method17522(arg0, arg1, arg2, false, arg3, arg5, arg4);
	}

	@OriginalMember(owner = "client!aeu", name = "aw", descriptor = "(IIII)V", line = 34)
	@Override
	public void method18188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt756 = arg0;
		this.anInt758 = arg1;
		this.anInt759 = arg2;
		this.anInt760 = arg3;
		this.aBoolean151 = this.anInt756 != 0 || this.anInt758 != 0 || this.anInt759 != 0 || this.anInt760 != 0;
	}

	@OriginalMember(owner = "client!aeu", name = "p", descriptor = "(IIII)V", line = 34)
	@Override
	public void method18167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt756 = arg0;
		this.anInt758 = arg1;
		this.anInt759 = arg2;
		this.anInt760 = arg3;
		this.aBoolean151 = this.anInt756 != 0 || this.anInt758 != 0 || this.anInt759 != 0 || this.anInt760 != 0;
	}

	@OriginalMember(owner = "client!aeu", name = "c", descriptor = "([I)V", line = 42)
	@Override
	public void method18168(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt756;
		arg0[1] = this.anInt758;
		arg0[2] = this.anInt759;
		arg0[3] = this.anInt760;
	}

	@OriginalMember(owner = "client!aeu", name = "bj", descriptor = "([I)V", line = 42)
	@Override
	public void method18218(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt756;
		arg0[1] = this.anInt758;
		arg0[2] = this.anInt759;
		arg0[3] = this.anInt760;
	}

	@OriginalMember(owner = "client!aeu", name = "az", descriptor = "([I)V", line = 42)
	@Override
	public void method18200(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt756;
		arg0[1] = this.anInt758;
		arg0[2] = this.anInt759;
		arg0[3] = this.anInt760;
	}

	@OriginalMember(owner = "client!aeu", name = "bc", descriptor = "([I)V", line = 42)
	@Override
	public void method18220(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt756;
		arg0[1] = this.anInt758;
		arg0[2] = this.anInt759;
		arg0[3] = this.anInt760;
	}

	@OriginalMember(owner = "client!aeu", name = "v", descriptor = "()I", line = 49)
	@Override
	public int method18169() {
		return this.aClass78_Sub2_Sub1_1.anInt2414;
	}

	@OriginalMember(owner = "client!aeu", name = "bl", descriptor = "()I", line = 49)
	@Override
	public int method18203() {
		return this.aClass78_Sub2_Sub1_1.anInt2414;
	}

	@OriginalMember(owner = "client!aeu", name = "bv", descriptor = "()I", line = 49)
	@Override
	public int method18201() {
		return this.aClass78_Sub2_Sub1_1.anInt2414;
	}

	@OriginalMember(owner = "client!aeu", name = "ba", descriptor = "()I", line = 49)
	@Override
	public int method18210() {
		return this.aClass78_Sub2_Sub1_1.anInt2414;
	}

	@OriginalMember(owner = "client!aeu", name = "bd", descriptor = "()I", line = 53)
	@Override
	public int method18120() {
		return this.aClass78_Sub2_Sub1_1.anInt2414 + this.anInt756 + this.anInt759;
	}

	@OriginalMember(owner = "client!aeu", name = "by", descriptor = "()I", line = 53)
	@Override
	public int method18119() {
		return this.aClass78_Sub2_Sub1_1.anInt2414 + this.anInt756 + this.anInt759;
	}

	@OriginalMember(owner = "client!aeu", name = "l", descriptor = "()I", line = 53)
	@Override
	public int method18121() {
		return this.aClass78_Sub2_Sub1_1.anInt2414 + this.anInt756 + this.anInt759;
	}

	@OriginalMember(owner = "client!aeu", name = "bx", descriptor = "()I", line = 53)
	@Override
	public int method18122() {
		return this.aClass78_Sub2_Sub1_1.anInt2414 + this.anInt756 + this.anInt759;
	}

	@OriginalMember(owner = "client!aeu", name = "y", descriptor = "()I", line = 57)
	@Override
	public int method18171() {
		return this.aClass78_Sub2_Sub1_1.anInt2415;
	}

	@OriginalMember(owner = "client!aeu", name = "bb", descriptor = "()I", line = 57)
	@Override
	public int method18204() {
		return this.aClass78_Sub2_Sub1_1.anInt2415;
	}

	@OriginalMember(owner = "client!aeu", name = "w", descriptor = "()I", line = 61)
	@Override
	public int method18198() {
		return this.aClass78_Sub2_Sub1_1.anInt2415 + this.anInt758 + this.anInt760;
	}

	@OriginalMember(owner = "client!aeu", name = "bw", descriptor = "()I", line = 61)
	@Override
	public int method18180() {
		return this.aClass78_Sub2_Sub1_1.anInt2415 + this.anInt758 + this.anInt760;
	}

	@OriginalMember(owner = "client!aeu", name = "t", descriptor = "()Lclient!df;", line = 65)
	@Override
	public Interface21 method18173() {
		return this.aClass78_Sub2_Sub1_1.method17513(0);
	}

	@OriginalMember(owner = "client!aeu", name = "ac", descriptor = "()Lclient!df;", line = 65)
	@Override
	public Interface21 method18196() {
		return this.aClass78_Sub2_Sub1_1.method17513(0);
	}

	@OriginalMember(owner = "client!aeu", name = "at", descriptor = "()Lclient!df;", line = 65)
	@Override
	public Interface21 method18190() {
		return this.aClass78_Sub2_Sub1_1.method17513(0);
	}

	@OriginalMember(owner = "client!aeu", name = "ae", descriptor = "()Lclient!df;", line = 65)
	@Override
	public Interface21 method18191() {
		return this.aClass78_Sub2_Sub1_1.method17513(0);
	}

	@OriginalMember(owner = "client!aeu", name = "ad", descriptor = "()Lclient!df;", line = 65)
	@Override
	public Interface21 method18172() {
		return this.aClass78_Sub2_Sub1_1.method17513(0);
	}

	@OriginalMember(owner = "client!aeu", name = "av", descriptor = "()Lclient!df;", line = 65)
	@Override
	public Interface21 method18189() {
		return this.aClass78_Sub2_Sub1_1.method17513(0);
	}

	@OriginalMember(owner = "client!aeu", name = "d", descriptor = "(IIIIII)V", line = 69)
	@Override
	public void method18213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method6666(arg0, arg1, arg2, arg3, arg4, arg5, false);
	}

	@OriginalMember(owner = "client!aeu", name = "ar", descriptor = "(IIIIII)V", line = 69)
	@Override
	public void method18187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method6666(arg0, arg1, arg2, arg3, arg4, arg5, false);
	}

	@OriginalMember(owner = "client!aeu", name = "cj", descriptor = "(IIIIIIZ)V", line = 73)
	void method6666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		if (!this.aClass86_Sub3_26.aBoolean119 || arg6) {
			this.aClass78_Sub2_Sub1_1.method17505(arg0, arg1, arg2, arg3, arg4, arg5);
			return;
		}
		@Pc(13) int[] local13 = this.aClass86_Sub3_26.method20066(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method18174(arg0, arg1, arg2, arg3, local13, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!aeu", name = "dt", descriptor = "(IIIIIIZ)V", line = 73)
	void method6667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		if (!this.aClass86_Sub3_26.aBoolean119 || arg6) {
			this.aClass78_Sub2_Sub1_1.method17505(arg0, arg1, arg2, arg3, arg4, arg5);
			return;
		}
		@Pc(13) int[] local13 = this.aClass86_Sub3_26.method20066(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method18174(arg0, arg1, arg2, arg3, local13, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!aeu", name = "dh", descriptor = "(IIIIIIZ)V", line = 73)
	void method6668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		if (!this.aClass86_Sub3_26.aBoolean119 || arg6) {
			this.aClass78_Sub2_Sub1_1.method17505(arg0, arg1, arg2, arg3, arg4, arg5);
			return;
		}
		@Pc(13) int[] local13 = this.aClass86_Sub3_26.method20066(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method18174(arg0, arg1, arg2, arg3, local13, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!aeu", name = "dq", descriptor = "(IIIIIIZ)V", line = 73)
	void method6669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		if (!this.aClass86_Sub3_26.aBoolean119 || arg6) {
			this.aClass78_Sub2_Sub1_1.method17505(arg0, arg1, arg2, arg3, arg4, arg5);
			return;
		}
		@Pc(13) int[] local13 = this.aClass86_Sub3_26.method20066(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method18174(arg0, arg1, arg2, arg3, local13, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!aeu", name = "aa", descriptor = "(III)V", line = 84)
	@Override
	public void method18202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass78_Sub2_Sub1_2 = Class78_Sub2_Sub1.method17531(this.aClass86_Sub3_26, arg0, arg1, this.aClass78_Sub2_Sub1_1.anInt2414, this.aClass78_Sub2_Sub1_1.anInt2415);
		this.anInt757 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!aeu", name = "s", descriptor = "(III)V", line = 84)
	@Override
	public void method18176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass78_Sub2_Sub1_2 = Class78_Sub2_Sub1.method17531(this.aClass86_Sub3_26, arg0, arg1, this.aClass78_Sub2_Sub1_1.anInt2414, this.aClass78_Sub2_Sub1_1.anInt2415);
		this.anInt757 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!aeu", name = "ab", descriptor = "(III)V", line = 84)
	@Override
	public void method18217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass78_Sub2_Sub1_2 = Class78_Sub2_Sub1.method17531(this.aClass86_Sub3_26, arg0, arg1, this.aClass78_Sub2_Sub1_1.anInt2414, this.aClass78_Sub2_Sub1_1.anInt2415);
		this.anInt757 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!aeu", name = "ap", descriptor = "(III)V", line = 84)
	@Override
	public void method18182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass78_Sub2_Sub1_2 = Class78_Sub2_Sub1.method17531(this.aClass86_Sub3_26, arg0, arg1, this.aClass78_Sub2_Sub1_1.anInt2414, this.aClass78_Sub2_Sub1_1.anInt2415);
		this.anInt757 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!aeu", name = "an", descriptor = "(IIII[III)V", line = 101)
	@Override
	public void method18219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass78_Sub2_Sub1_1.method17500(arg0, arg1, arg2, arg3, arg4, arg5, arg6, true);
	}

	@OriginalMember(owner = "client!aeu", name = "q", descriptor = "(IIII[III)V", line = 101)
	@Override
	public void method18174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass78_Sub2_Sub1_1.method17500(arg0, arg1, arg2, arg3, arg4, arg5, arg6, true);
	}

	@OriginalMember(owner = "client!aeu", name = "x", descriptor = "(IIII[I[III)V", line = 105)
	@Override
	public void method18175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass78_Sub2_Sub1_1.method17501(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aeu", name = "ak", descriptor = "(IIII[I[III)V", line = 105)
	@Override
	public void method18170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass78_Sub2_Sub1_1.method17501(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aeu", name = "au", descriptor = "(IIII[I[III)V", line = 105)
	@Override
	public void method18185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass78_Sub2_Sub1_1.method17501(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aeu", name = "ax", descriptor = "(IIII[I[III)V", line = 105)
	@Override
	public void method18199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass78_Sub2_Sub1_1.method17501(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aeu", name = "ao", descriptor = "(IIII[I[III)V", line = 105)
	@Override
	public void method18184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass78_Sub2_Sub1_1.method17501(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aeu", name = "ce", descriptor = "(I)V", line = 109)
	void method6670(@OriginalArg(0) int arg0) {
		this.aClass86_Sub3_26.method6190(1);
		this.aClass86_Sub3_26.method6195(this.aClass78_Sub2_Sub1_1);
		this.aClass86_Sub3_26.method6207(this.aClass86_Sub3_26.method6203(arg0), 7681);
		this.aClass86_Sub3_26.method6213(1, 34167, 768);
		this.aClass86_Sub3_26.method6214(0, 34168, 770);
		this.aClass86_Sub3_26.method6190(0);
		this.aClass86_Sub3_26.method6195(this.aClass78_Sub2_Sub1_2);
		this.aClass86_Sub3_26.method6207(34479, 7681);
		this.aClass86_Sub3_26.method6213(1, 34166, 768);
		if (this.anInt757 == 0) {
			this.aClass86_Sub3_26.method6220(1.0F, 0.5F, 0.5F, 0.0F);
		} else if (this.anInt757 == 1) {
			this.aClass86_Sub3_26.method6220(0.5F, 1.0F, 0.5F, 0.0F);
		} else if (this.anInt757 == 2) {
			this.aClass86_Sub3_26.method6220(0.5F, 0.5F, 1.0F, 0.0F);
		} else if (this.anInt757 == 3) {
			this.aClass86_Sub3_26.method6220(128.5F, 128.5F, 128.5F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!aeu", name = "dn", descriptor = "(I)V", line = 109)
	void method6671(@OriginalArg(0) int arg0) {
		this.aClass86_Sub3_26.method6190(1);
		this.aClass86_Sub3_26.method6195(this.aClass78_Sub2_Sub1_1);
		this.aClass86_Sub3_26.method6207(this.aClass86_Sub3_26.method6203(arg0), 7681);
		this.aClass86_Sub3_26.method6213(1, 34167, 768);
		this.aClass86_Sub3_26.method6214(0, 34168, 770);
		this.aClass86_Sub3_26.method6190(0);
		this.aClass86_Sub3_26.method6195(this.aClass78_Sub2_Sub1_2);
		this.aClass86_Sub3_26.method6207(34479, 7681);
		this.aClass86_Sub3_26.method6213(1, 34166, 768);
		if (this.anInt757 == 0) {
			this.aClass86_Sub3_26.method6220(1.0F, 0.5F, 0.5F, 0.0F);
		} else if (this.anInt757 == 1) {
			this.aClass86_Sub3_26.method6220(0.5F, 1.0F, 0.5F, 0.0F);
		} else if (this.anInt757 == 2) {
			this.aClass86_Sub3_26.method6220(0.5F, 0.5F, 1.0F, 0.0F);
		} else if (this.anInt757 == 3) {
			this.aClass86_Sub3_26.method6220(128.5F, 128.5F, 128.5F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!aeu", name = "dm", descriptor = "()V", line = 125)
	void method6672() {
		this.aClass86_Sub3_26.method6190(1);
		this.aClass86_Sub3_26.method6195(null);
		this.aClass86_Sub3_26.method6207(8448, 8448);
		this.aClass86_Sub3_26.method6213(1, 34168, 768);
		this.aClass86_Sub3_26.method6214(0, 5890, 770);
		this.aClass86_Sub3_26.method6190(0);
		this.aClass86_Sub3_26.method6213(1, 34168, 768);
	}

	@OriginalMember(owner = "client!aeu", name = "do", descriptor = "()V", line = 125)
	void method6673() {
		this.aClass86_Sub3_26.method6190(1);
		this.aClass86_Sub3_26.method6195(null);
		this.aClass86_Sub3_26.method6207(8448, 8448);
		this.aClass86_Sub3_26.method6213(1, 34168, 768);
		this.aClass86_Sub3_26.method6214(0, 5890, 770);
		this.aClass86_Sub3_26.method6190(0);
		this.aClass86_Sub3_26.method6213(1, 34168, 768);
	}

	@OriginalMember(owner = "client!aeu", name = "dv", descriptor = "()V", line = 125)
	void method6674() {
		this.aClass86_Sub3_26.method6190(1);
		this.aClass86_Sub3_26.method6195(null);
		this.aClass86_Sub3_26.method6207(8448, 8448);
		this.aClass86_Sub3_26.method6213(1, 34168, 768);
		this.aClass86_Sub3_26.method6214(0, 5890, 770);
		this.aClass86_Sub3_26.method6190(0);
		this.aClass86_Sub3_26.method6213(1, 34168, 768);
	}

	@OriginalMember(owner = "client!aeu", name = "da", descriptor = "()V", line = 125)
	void method6675() {
		this.aClass86_Sub3_26.method6190(1);
		this.aClass86_Sub3_26.method6195(null);
		this.aClass86_Sub3_26.method6207(8448, 8448);
		this.aClass86_Sub3_26.method6213(1, 34168, 768);
		this.aClass86_Sub3_26.method6214(0, 5890, 770);
		this.aClass86_Sub3_26.method6190(0);
		this.aClass86_Sub3_26.method6213(1, 34168, 768);
	}

	@OriginalMember(owner = "client!aeu", name = "dy", descriptor = "()V", line = 125)
	void method6676() {
		this.aClass86_Sub3_26.method6190(1);
		this.aClass86_Sub3_26.method6195(null);
		this.aClass86_Sub3_26.method6207(8448, 8448);
		this.aClass86_Sub3_26.method6213(1, 34168, 768);
		this.aClass86_Sub3_26.method6214(0, 5890, 770);
		this.aClass86_Sub3_26.method6190(0);
		this.aClass86_Sub3_26.method6213(1, 34168, 768);
	}

	@OriginalMember(owner = "client!aeu", name = "g", descriptor = "(IIIII)V", line = 135)
	@Override
	public void method18177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass78_Sub2_Sub1_1.method17453(false);
		this.aClass86_Sub3_26.method6171();
		this.aClass86_Sub3_26.method6250(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(30) int local30 = arg0 + this.anInt756;
		@Pc(35) int local35 = arg1 + this.anInt758;
		if (this.aClass78_Sub2_Sub1_2 == null) {
			this.aClass86_Sub3_26.method6195(this.aClass78_Sub2_Sub1_1);
			this.aClass86_Sub3_26.method6198(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
			OpenGL.glVertex2i(local30, local35);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local30, local35 + this.aClass78_Sub2_Sub1_1.anInt2415);
			OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
			OpenGL.glVertex2i(local30 + this.aClass78_Sub2_Sub1_1.anInt2414, local35 + this.aClass78_Sub2_Sub1_1.anInt2415);
			OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
			OpenGL.glVertex2i(local30 + this.aClass78_Sub2_Sub1_1.anInt2414, local35);
			OpenGL.glEnd();
			return;
		}
		this.method6670(arg2);
		this.aClass78_Sub2_Sub1_2.method17453(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
		OpenGL.glTexCoord2f(0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
		OpenGL.glVertex2i(local30, local35);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local30, local35 + this.aClass78_Sub2_Sub1_1.anInt2415);
		OpenGL.glMultiTexCoord2f(33985, this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
		OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
		OpenGL.glVertex2i(local30 + this.aClass78_Sub2_Sub1_1.anInt2414, local35 + this.aClass78_Sub2_Sub1_1.anInt2415);
		OpenGL.glMultiTexCoord2f(33985, this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
		OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
		OpenGL.glVertex2i(local30 + this.aClass78_Sub2_Sub1_1.anInt2414, local35);
		OpenGL.glEnd();
		this.method6673();
	}

	@OriginalMember(owner = "client!aeu", name = "ah", descriptor = "(IIIII)V", line = 135)
	@Override
	public void method18192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass78_Sub2_Sub1_1.method17453(false);
		this.aClass86_Sub3_26.method6171();
		this.aClass86_Sub3_26.method6250(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(30) int local30 = arg0 + this.anInt756;
		@Pc(35) int local35 = arg1 + this.anInt758;
		if (this.aClass78_Sub2_Sub1_2 == null) {
			this.aClass86_Sub3_26.method6195(this.aClass78_Sub2_Sub1_1);
			this.aClass86_Sub3_26.method6198(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
			OpenGL.glVertex2i(local30, local35);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local30, local35 + this.aClass78_Sub2_Sub1_1.anInt2415);
			OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
			OpenGL.glVertex2i(local30 + this.aClass78_Sub2_Sub1_1.anInt2414, local35 + this.aClass78_Sub2_Sub1_1.anInt2415);
			OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
			OpenGL.glVertex2i(local30 + this.aClass78_Sub2_Sub1_1.anInt2414, local35);
			OpenGL.glEnd();
			return;
		}
		this.method6670(arg2);
		this.aClass78_Sub2_Sub1_2.method17453(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
		OpenGL.glTexCoord2f(0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
		OpenGL.glVertex2i(local30, local35);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local30, local35 + this.aClass78_Sub2_Sub1_1.anInt2415);
		OpenGL.glMultiTexCoord2f(33985, this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
		OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
		OpenGL.glVertex2i(local30 + this.aClass78_Sub2_Sub1_1.anInt2414, local35 + this.aClass78_Sub2_Sub1_1.anInt2415);
		OpenGL.glMultiTexCoord2f(33985, this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
		OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
		OpenGL.glVertex2i(local30 + this.aClass78_Sub2_Sub1_1.anInt2414, local35);
		OpenGL.glEnd();
		this.method6673();
	}

	@OriginalMember(owner = "client!aeu", name = "z", descriptor = "(IILclient!cd;II)V", line = 177)
	@Override
	public void method18197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class90 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) Class90_Sub3 local2 = (Class90_Sub3) arg2;
		@Pc(5) Class78_Sub2_Sub1 local5 = local2.aClass78_Sub2_Sub1_3;
		this.aClass78_Sub2_Sub1_1.method17453(false);
		this.aClass86_Sub3_26.method6171();
		this.aClass86_Sub3_26.method6195(this.aClass78_Sub2_Sub1_1);
		this.aClass86_Sub3_26.method6198(1);
		this.aClass86_Sub3_26.method6190(1);
		this.aClass86_Sub3_26.method6195(local5);
		this.aClass86_Sub3_26.method6207(7681, 8448);
		this.aClass86_Sub3_26.method6213(0, 34168, 768);
		this.aClass86_Sub3_26.method6250(1);
		@Pc(49) int local49 = arg0 + this.anInt756;
		@Pc(54) int local54 = arg1 + this.anInt758;
		@Pc(60) int local60 = local49 + this.aClass78_Sub2_Sub1_1.anInt2414;
		@Pc(66) int local66 = local54 + this.aClass78_Sub2_Sub1_1.anInt2415;
		@Pc(73) float local73 = local5.aFloat163 / (float) local5.anInt2414;
		@Pc(80) float local80 = local5.aFloat164 / (float) local5.anInt2415;
		@Pc(87) float local87 = (float) (local49 - arg3) * local73;
		@Pc(94) float local94 = (float) (local60 - arg3) * local73;
		@Pc(104) float local104 = local5.aFloat164 - (float) (local54 - arg4) * local80;
		@Pc(114) float local114 = local5.aFloat164 - (float) (local66 - arg4) * local80;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
		OpenGL.glMultiTexCoord2f(33985, local87, local104);
		OpenGL.glVertex2i(local49, local54);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local87, local114);
		OpenGL.glVertex2i(local49, local54 + this.aClass78_Sub2_Sub1_1.anInt2415);
		OpenGL.glMultiTexCoord2f(33984, this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local94, local114);
		OpenGL.glVertex2i(local49 + this.aClass78_Sub2_Sub1_1.anInt2414, local54 + this.aClass78_Sub2_Sub1_1.anInt2415);
		OpenGL.glMultiTexCoord2f(33984, this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
		OpenGL.glMultiTexCoord2f(33985, local94, local104);
		OpenGL.glVertex2i(local49 + this.aClass78_Sub2_Sub1_1.anInt2414, local54);
		OpenGL.glEnd();
		this.aClass86_Sub3_26.method6213(0, 5890, 768);
		this.aClass86_Sub3_26.method6198(0);
		this.aClass86_Sub3_26.method6195(null);
		this.aClass86_Sub3_26.method6190(0);
	}

	@OriginalMember(owner = "client!aeu", name = "as", descriptor = "(IILclient!cd;II)V", line = 177)
	@Override
	public void method18193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class90 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) Class90_Sub3 local2 = (Class90_Sub3) arg2;
		@Pc(5) Class78_Sub2_Sub1 local5 = local2.aClass78_Sub2_Sub1_3;
		this.aClass78_Sub2_Sub1_1.method17453(false);
		this.aClass86_Sub3_26.method6171();
		this.aClass86_Sub3_26.method6195(this.aClass78_Sub2_Sub1_1);
		this.aClass86_Sub3_26.method6198(1);
		this.aClass86_Sub3_26.method6190(1);
		this.aClass86_Sub3_26.method6195(local5);
		this.aClass86_Sub3_26.method6207(7681, 8448);
		this.aClass86_Sub3_26.method6213(0, 34168, 768);
		this.aClass86_Sub3_26.method6250(1);
		@Pc(49) int local49 = arg0 + this.anInt756;
		@Pc(54) int local54 = arg1 + this.anInt758;
		@Pc(60) int local60 = local49 + this.aClass78_Sub2_Sub1_1.anInt2414;
		@Pc(66) int local66 = local54 + this.aClass78_Sub2_Sub1_1.anInt2415;
		@Pc(73) float local73 = local5.aFloat163 / (float) local5.anInt2414;
		@Pc(80) float local80 = local5.aFloat164 / (float) local5.anInt2415;
		@Pc(87) float local87 = (float) (local49 - arg3) * local73;
		@Pc(94) float local94 = (float) (local60 - arg3) * local73;
		@Pc(104) float local104 = local5.aFloat164 - (float) (local54 - arg4) * local80;
		@Pc(114) float local114 = local5.aFloat164 - (float) (local66 - arg4) * local80;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
		OpenGL.glMultiTexCoord2f(33985, local87, local104);
		OpenGL.glVertex2i(local49, local54);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local87, local114);
		OpenGL.glVertex2i(local49, local54 + this.aClass78_Sub2_Sub1_1.anInt2415);
		OpenGL.glMultiTexCoord2f(33984, this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local94, local114);
		OpenGL.glVertex2i(local49 + this.aClass78_Sub2_Sub1_1.anInt2414, local54 + this.aClass78_Sub2_Sub1_1.anInt2415);
		OpenGL.glMultiTexCoord2f(33984, this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
		OpenGL.glMultiTexCoord2f(33985, local94, local104);
		OpenGL.glVertex2i(local49 + this.aClass78_Sub2_Sub1_1.anInt2414, local54);
		OpenGL.glEnd();
		this.aClass86_Sub3_26.method6213(0, 5890, 768);
		this.aClass86_Sub3_26.method6198(0);
		this.aClass86_Sub3_26.method6195(null);
		this.aClass86_Sub3_26.method6190(0);
	}

	@OriginalMember(owner = "client!aeu", name = "k", descriptor = "(IIIIIIII)V", line = 220)
	@Override
	void method18178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass78_Sub2_Sub1_1.method17453((arg7 & 0x1) != 0);
		this.aClass86_Sub3_26.method6171();
		this.aClass86_Sub3_26.method6250(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean151) {
			@Pc(41) float local41 = (float) arg2 / (float) this.method18121();
			@Pc(48) float local48 = (float) arg3 / (float) this.method18198();
			@Pc(57) float local57 = (float) arg0 + (float) this.anInt756 * local41;
			@Pc(66) float local66 = (float) arg1 + (float) this.anInt758 * local48;
			@Pc(75) float local75 = local57 + (float) this.aClass78_Sub2_Sub1_1.anInt2414 * local41;
			@Pc(84) float local84 = local66 + (float) this.aClass78_Sub2_Sub1_1.anInt2415 * local48;
			if (this.aClass78_Sub2_Sub1_2 == null) {
				this.aClass86_Sub3_26.method6195(this.aClass78_Sub2_Sub1_1);
				this.aClass86_Sub3_26.method6198(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2f(local57, local66);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local57, local84);
				OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
				OpenGL.glVertex2f(local75, local84);
				OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2f(local75, local66);
				OpenGL.glEnd();
			} else {
				this.method6670(arg4);
				this.aClass78_Sub2_Sub1_2.method17453(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glTexCoord2f(0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2f(local57, local66);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local57, local84);
				OpenGL.glMultiTexCoord2f(33985, this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
				OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
				OpenGL.glVertex2f(local75, local84);
				OpenGL.glMultiTexCoord2f(33985, this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2f(local75, local66);
				OpenGL.glEnd();
				this.method6673();
			}
		} else if (this.aClass78_Sub2_Sub1_2 == null) {
			this.aClass86_Sub3_26.method6195(this.aClass78_Sub2_Sub1_1);
			this.aClass86_Sub3_26.method6198(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method6670(arg4);
			this.aClass78_Sub2_Sub1_2.method17453(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
			OpenGL.glTexCoord2f(0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
			OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
			OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method6673();
		}
	}

	@OriginalMember(owner = "client!aeu", name = "am", descriptor = "(IIIIIIII)V", line = 220)
	@Override
	void method18195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass78_Sub2_Sub1_1.method17453((arg7 & 0x1) != 0);
		this.aClass86_Sub3_26.method6171();
		this.aClass86_Sub3_26.method6250(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean151) {
			@Pc(41) float local41 = (float) arg2 / (float) this.method18121();
			@Pc(48) float local48 = (float) arg3 / (float) this.method18198();
			@Pc(57) float local57 = (float) arg0 + (float) this.anInt756 * local41;
			@Pc(66) float local66 = (float) arg1 + (float) this.anInt758 * local48;
			@Pc(75) float local75 = local57 + (float) this.aClass78_Sub2_Sub1_1.anInt2414 * local41;
			@Pc(84) float local84 = local66 + (float) this.aClass78_Sub2_Sub1_1.anInt2415 * local48;
			if (this.aClass78_Sub2_Sub1_2 == null) {
				this.aClass86_Sub3_26.method6195(this.aClass78_Sub2_Sub1_1);
				this.aClass86_Sub3_26.method6198(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2f(local57, local66);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local57, local84);
				OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
				OpenGL.glVertex2f(local75, local84);
				OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2f(local75, local66);
				OpenGL.glEnd();
			} else {
				this.method6670(arg4);
				this.aClass78_Sub2_Sub1_2.method17453(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glTexCoord2f(0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2f(local57, local66);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local57, local84);
				OpenGL.glMultiTexCoord2f(33985, this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
				OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
				OpenGL.glVertex2f(local75, local84);
				OpenGL.glMultiTexCoord2f(33985, this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2f(local75, local66);
				OpenGL.glEnd();
				this.method6673();
			}
		} else if (this.aClass78_Sub2_Sub1_2 == null) {
			this.aClass86_Sub3_26.method6195(this.aClass78_Sub2_Sub1_1);
			this.aClass86_Sub3_26.method6198(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method6670(arg4);
			this.aClass78_Sub2_Sub1_2.method17453(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
			OpenGL.glTexCoord2f(0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
			OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
			OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method6673();
		}
	}

	@OriginalMember(owner = "client!aeu", name = "ay", descriptor = "(IIIIIIII)V", line = 220)
	@Override
	void method18205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass78_Sub2_Sub1_1.method17453((arg7 & 0x1) != 0);
		this.aClass86_Sub3_26.method6171();
		this.aClass86_Sub3_26.method6250(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean151) {
			@Pc(41) float local41 = (float) arg2 / (float) this.method18121();
			@Pc(48) float local48 = (float) arg3 / (float) this.method18198();
			@Pc(57) float local57 = (float) arg0 + (float) this.anInt756 * local41;
			@Pc(66) float local66 = (float) arg1 + (float) this.anInt758 * local48;
			@Pc(75) float local75 = local57 + (float) this.aClass78_Sub2_Sub1_1.anInt2414 * local41;
			@Pc(84) float local84 = local66 + (float) this.aClass78_Sub2_Sub1_1.anInt2415 * local48;
			if (this.aClass78_Sub2_Sub1_2 == null) {
				this.aClass86_Sub3_26.method6195(this.aClass78_Sub2_Sub1_1);
				this.aClass86_Sub3_26.method6198(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2f(local57, local66);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local57, local84);
				OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
				OpenGL.glVertex2f(local75, local84);
				OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2f(local75, local66);
				OpenGL.glEnd();
			} else {
				this.method6670(arg4);
				this.aClass78_Sub2_Sub1_2.method17453(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glTexCoord2f(0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2f(local57, local66);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local57, local84);
				OpenGL.glMultiTexCoord2f(33985, this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
				OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
				OpenGL.glVertex2f(local75, local84);
				OpenGL.glMultiTexCoord2f(33985, this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2f(local75, local66);
				OpenGL.glEnd();
				this.method6673();
			}
		} else if (this.aClass78_Sub2_Sub1_2 == null) {
			this.aClass86_Sub3_26.method6195(this.aClass78_Sub2_Sub1_1);
			this.aClass86_Sub3_26.method6198(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method6670(arg4);
			this.aClass78_Sub2_Sub1_2.method17453(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
			OpenGL.glTexCoord2f(0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
			OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
			OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method6673();
		}
	}

	@OriginalMember(owner = "client!aeu", name = "aq", descriptor = "(IIIIIIII)V", line = 220)
	@Override
	void method18194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass78_Sub2_Sub1_1.method17453((arg7 & 0x1) != 0);
		this.aClass86_Sub3_26.method6171();
		this.aClass86_Sub3_26.method6250(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean151) {
			@Pc(41) float local41 = (float) arg2 / (float) this.method18121();
			@Pc(48) float local48 = (float) arg3 / (float) this.method18198();
			@Pc(57) float local57 = (float) arg0 + (float) this.anInt756 * local41;
			@Pc(66) float local66 = (float) arg1 + (float) this.anInt758 * local48;
			@Pc(75) float local75 = local57 + (float) this.aClass78_Sub2_Sub1_1.anInt2414 * local41;
			@Pc(84) float local84 = local66 + (float) this.aClass78_Sub2_Sub1_1.anInt2415 * local48;
			if (this.aClass78_Sub2_Sub1_2 == null) {
				this.aClass86_Sub3_26.method6195(this.aClass78_Sub2_Sub1_1);
				this.aClass86_Sub3_26.method6198(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2f(local57, local66);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local57, local84);
				OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
				OpenGL.glVertex2f(local75, local84);
				OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2f(local75, local66);
				OpenGL.glEnd();
			} else {
				this.method6670(arg4);
				this.aClass78_Sub2_Sub1_2.method17453(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glTexCoord2f(0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2f(local57, local66);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local57, local84);
				OpenGL.glMultiTexCoord2f(33985, this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
				OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
				OpenGL.glVertex2f(local75, local84);
				OpenGL.glMultiTexCoord2f(33985, this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2f(local75, local66);
				OpenGL.glEnd();
				this.method6673();
			}
		} else if (this.aClass78_Sub2_Sub1_2 == null) {
			this.aClass86_Sub3_26.method6195(this.aClass78_Sub2_Sub1_1);
			this.aClass86_Sub3_26.method6198(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method6670(arg4);
			this.aClass78_Sub2_Sub1_2.method17453(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
			OpenGL.glTexCoord2f(0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
			OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
			OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method6673();
		}
	}

	@OriginalMember(owner = "client!aeu", name = "af", descriptor = "(IIIIIIII)V", line = 220)
	@Override
	void method18214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass78_Sub2_Sub1_1.method17453((arg7 & 0x1) != 0);
		this.aClass86_Sub3_26.method6171();
		this.aClass86_Sub3_26.method6250(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean151) {
			@Pc(41) float local41 = (float) arg2 / (float) this.method18121();
			@Pc(48) float local48 = (float) arg3 / (float) this.method18198();
			@Pc(57) float local57 = (float) arg0 + (float) this.anInt756 * local41;
			@Pc(66) float local66 = (float) arg1 + (float) this.anInt758 * local48;
			@Pc(75) float local75 = local57 + (float) this.aClass78_Sub2_Sub1_1.anInt2414 * local41;
			@Pc(84) float local84 = local66 + (float) this.aClass78_Sub2_Sub1_1.anInt2415 * local48;
			if (this.aClass78_Sub2_Sub1_2 == null) {
				this.aClass86_Sub3_26.method6195(this.aClass78_Sub2_Sub1_1);
				this.aClass86_Sub3_26.method6198(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2f(local57, local66);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local57, local84);
				OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
				OpenGL.glVertex2f(local75, local84);
				OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2f(local75, local66);
				OpenGL.glEnd();
			} else {
				this.method6670(arg4);
				this.aClass78_Sub2_Sub1_2.method17453(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glTexCoord2f(0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2f(local57, local66);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local57, local84);
				OpenGL.glMultiTexCoord2f(33985, this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
				OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
				OpenGL.glVertex2f(local75, local84);
				OpenGL.glMultiTexCoord2f(33985, this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2f(local75, local66);
				OpenGL.glEnd();
				this.method6673();
			}
		} else if (this.aClass78_Sub2_Sub1_2 == null) {
			this.aClass86_Sub3_26.method6195(this.aClass78_Sub2_Sub1_1);
			this.aClass86_Sub3_26.method6198(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method6670(arg4);
			this.aClass78_Sub2_Sub1_2.method17453(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
			OpenGL.glTexCoord2f(0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
			OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
			OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method6673();
		}
	}

	@OriginalMember(owner = "client!aeu", name = "bs", descriptor = "(IIIIIII)V", line = 303)
	@Override
	public void method18207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0 + arg2;
		@Pc(7) int local7 = arg1 + arg3;
		this.aClass78_Sub2_Sub1_1.method17453(false);
		this.aClass86_Sub3_26.method6171();
		this.aClass86_Sub3_26.method6195(this.aClass78_Sub2_Sub1_1);
		this.aClass86_Sub3_26.method6250(arg6);
		this.aClass86_Sub3_26.method6198(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass78_Sub2_Sub1_1.aBoolean374 && !this.aBoolean151 && arg3 >= this.aClass78_Sub2_Sub1_1.anInt2415 && arg2 >= this.aClass78_Sub2_Sub1_1.anInt2414) {
			@Pc(71) float local71 = this.aClass78_Sub2_Sub1_1.aFloat164 * (float) arg3 / (float) this.aClass78_Sub2_Sub1_1.anInt2415;
			@Pc(83) float local83 = this.aClass78_Sub2_Sub1_1.aFloat163 * (float) arg2 / (float) this.aClass78_Sub2_Sub1_1.anInt2414;
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
		OpenGL.glTranslatef((float) this.anInt756, (float) this.anInt758, 0.0F);
		@Pc(123) int local123 = this.method18121();
		@Pc(126) int local126 = this.method18198();
		@Pc(132) int local132 = arg1 + this.aClass78_Sub2_Sub1_1.anInt2415;
		OpenGL.glBegin(7);
		@Pc(136) int local136 = arg1;
		@Pc(145) int local145;
		while (local132 <= local7) {
			local145 = arg0 + this.aClass78_Sub2_Sub1_1.anInt2414;
			@Pc(147) int local147 = arg0;
			while (local145 <= local3) {
				OpenGL.glTexCoord2f(0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2i(local147, local136);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local147, local132);
				OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
				OpenGL.glVertex2i(local145, local132);
				OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2i(local145, local136);
				local145 += local123;
				local147 += local123;
			}
			if (local147 < local3) {
				@Pc(208) float local208 = this.aClass78_Sub2_Sub1_1.aFloat163 * (float) (local3 - local147) / (float) this.aClass78_Sub2_Sub1_1.anInt2414;
				OpenGL.glTexCoord2f(0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2i(local147, local136);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local147, local132);
				OpenGL.glTexCoord2f(local208, 0.0F);
				OpenGL.glVertex2i(local3, local132);
				OpenGL.glTexCoord2f(local208, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2i(local3, local136);
			}
			local136 += local126;
			local132 += local126;
		}
		if (local136 < local7) {
			@Pc(266) float local266 = this.aClass78_Sub2_Sub1_1.aFloat164 * (float) (this.aClass78_Sub2_Sub1_1.anInt2415 - (local7 - local136)) / (float) this.aClass78_Sub2_Sub1_1.anInt2415;
			@Pc(272) int local272 = arg0 + this.aClass78_Sub2_Sub1_1.anInt2414;
			local145 = arg0;
			while (local272 <= local3) {
				OpenGL.glTexCoord2f(0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2i(local145, local136);
				OpenGL.glTexCoord2f(0.0F, local266);
				OpenGL.glVertex2i(local145, local7);
				OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, local266);
				OpenGL.glVertex2i(local272, local7);
				OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2i(local272, local136);
				local272 += local123;
				local145 += local123;
			}
			if (local145 < local3) {
				@Pc(335) float local335 = this.aClass78_Sub2_Sub1_1.aFloat163 * (float) (local3 - local145) / (float) this.aClass78_Sub2_Sub1_1.anInt2414;
				OpenGL.glTexCoord2f(0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2i(local145, local136);
				OpenGL.glTexCoord2f(0.0F, local266);
				OpenGL.glVertex2i(local145, local7);
				OpenGL.glTexCoord2f(local335, local266);
				OpenGL.glVertex2i(local3, local7);
				OpenGL.glTexCoord2f(local335, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2i(local3, local136);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!aeu", name = "e", descriptor = "(IIIIIII)V", line = 303)
	@Override
	public void method18179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0 + arg2;
		@Pc(7) int local7 = arg1 + arg3;
		this.aClass78_Sub2_Sub1_1.method17453(false);
		this.aClass86_Sub3_26.method6171();
		this.aClass86_Sub3_26.method6195(this.aClass78_Sub2_Sub1_1);
		this.aClass86_Sub3_26.method6250(arg6);
		this.aClass86_Sub3_26.method6198(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass78_Sub2_Sub1_1.aBoolean374 && !this.aBoolean151 && arg3 >= this.aClass78_Sub2_Sub1_1.anInt2415 && arg2 >= this.aClass78_Sub2_Sub1_1.anInt2414) {
			@Pc(71) float local71 = this.aClass78_Sub2_Sub1_1.aFloat164 * (float) arg3 / (float) this.aClass78_Sub2_Sub1_1.anInt2415;
			@Pc(83) float local83 = this.aClass78_Sub2_Sub1_1.aFloat163 * (float) arg2 / (float) this.aClass78_Sub2_Sub1_1.anInt2414;
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
		OpenGL.glTranslatef((float) this.anInt756, (float) this.anInt758, 0.0F);
		@Pc(123) int local123 = this.method18121();
		@Pc(126) int local126 = this.method18198();
		@Pc(132) int local132 = arg1 + this.aClass78_Sub2_Sub1_1.anInt2415;
		OpenGL.glBegin(7);
		@Pc(136) int local136 = arg1;
		@Pc(145) int local145;
		while (local132 <= local7) {
			local145 = arg0 + this.aClass78_Sub2_Sub1_1.anInt2414;
			@Pc(147) int local147 = arg0;
			while (local145 <= local3) {
				OpenGL.glTexCoord2f(0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2i(local147, local136);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local147, local132);
				OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
				OpenGL.glVertex2i(local145, local132);
				OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2i(local145, local136);
				local145 += local123;
				local147 += local123;
			}
			if (local147 < local3) {
				@Pc(208) float local208 = this.aClass78_Sub2_Sub1_1.aFloat163 * (float) (local3 - local147) / (float) this.aClass78_Sub2_Sub1_1.anInt2414;
				OpenGL.glTexCoord2f(0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2i(local147, local136);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local147, local132);
				OpenGL.glTexCoord2f(local208, 0.0F);
				OpenGL.glVertex2i(local3, local132);
				OpenGL.glTexCoord2f(local208, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2i(local3, local136);
			}
			local136 += local126;
			local132 += local126;
		}
		if (local136 < local7) {
			@Pc(266) float local266 = this.aClass78_Sub2_Sub1_1.aFloat164 * (float) (this.aClass78_Sub2_Sub1_1.anInt2415 - (local7 - local136)) / (float) this.aClass78_Sub2_Sub1_1.anInt2415;
			@Pc(272) int local272 = arg0 + this.aClass78_Sub2_Sub1_1.anInt2414;
			local145 = arg0;
			while (local272 <= local3) {
				OpenGL.glTexCoord2f(0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2i(local145, local136);
				OpenGL.glTexCoord2f(0.0F, local266);
				OpenGL.glVertex2i(local145, local7);
				OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, local266);
				OpenGL.glVertex2i(local272, local7);
				OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2i(local272, local136);
				local272 += local123;
				local145 += local123;
			}
			if (local145 < local3) {
				@Pc(335) float local335 = this.aClass78_Sub2_Sub1_1.aFloat163 * (float) (local3 - local145) / (float) this.aClass78_Sub2_Sub1_1.anInt2414;
				OpenGL.glTexCoord2f(0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2i(local145, local136);
				OpenGL.glTexCoord2f(0.0F, local266);
				OpenGL.glVertex2i(local145, local7);
				OpenGL.glTexCoord2f(local335, local266);
				OpenGL.glVertex2i(local3, local7);
				OpenGL.glTexCoord2f(local335, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2i(local3, local136);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!aeu", name = "bg", descriptor = "(IIIIIII)V", line = 303)
	@Override
	public void method18206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0 + arg2;
		@Pc(7) int local7 = arg1 + arg3;
		this.aClass78_Sub2_Sub1_1.method17453(false);
		this.aClass86_Sub3_26.method6171();
		this.aClass86_Sub3_26.method6195(this.aClass78_Sub2_Sub1_1);
		this.aClass86_Sub3_26.method6250(arg6);
		this.aClass86_Sub3_26.method6198(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass78_Sub2_Sub1_1.aBoolean374 && !this.aBoolean151 && arg3 >= this.aClass78_Sub2_Sub1_1.anInt2415 && arg2 >= this.aClass78_Sub2_Sub1_1.anInt2414) {
			@Pc(71) float local71 = this.aClass78_Sub2_Sub1_1.aFloat164 * (float) arg3 / (float) this.aClass78_Sub2_Sub1_1.anInt2415;
			@Pc(83) float local83 = this.aClass78_Sub2_Sub1_1.aFloat163 * (float) arg2 / (float) this.aClass78_Sub2_Sub1_1.anInt2414;
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
		OpenGL.glTranslatef((float) this.anInt756, (float) this.anInt758, 0.0F);
		@Pc(123) int local123 = this.method18121();
		@Pc(126) int local126 = this.method18198();
		@Pc(132) int local132 = arg1 + this.aClass78_Sub2_Sub1_1.anInt2415;
		OpenGL.glBegin(7);
		@Pc(136) int local136 = arg1;
		@Pc(145) int local145;
		while (local132 <= local7) {
			local145 = arg0 + this.aClass78_Sub2_Sub1_1.anInt2414;
			@Pc(147) int local147 = arg0;
			while (local145 <= local3) {
				OpenGL.glTexCoord2f(0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2i(local147, local136);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local147, local132);
				OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
				OpenGL.glVertex2i(local145, local132);
				OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2i(local145, local136);
				local145 += local123;
				local147 += local123;
			}
			if (local147 < local3) {
				@Pc(208) float local208 = this.aClass78_Sub2_Sub1_1.aFloat163 * (float) (local3 - local147) / (float) this.aClass78_Sub2_Sub1_1.anInt2414;
				OpenGL.glTexCoord2f(0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2i(local147, local136);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local147, local132);
				OpenGL.glTexCoord2f(local208, 0.0F);
				OpenGL.glVertex2i(local3, local132);
				OpenGL.glTexCoord2f(local208, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2i(local3, local136);
			}
			local136 += local126;
			local132 += local126;
		}
		if (local136 < local7) {
			@Pc(266) float local266 = this.aClass78_Sub2_Sub1_1.aFloat164 * (float) (this.aClass78_Sub2_Sub1_1.anInt2415 - (local7 - local136)) / (float) this.aClass78_Sub2_Sub1_1.anInt2415;
			@Pc(272) int local272 = arg0 + this.aClass78_Sub2_Sub1_1.anInt2414;
			local145 = arg0;
			while (local272 <= local3) {
				OpenGL.glTexCoord2f(0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2i(local145, local136);
				OpenGL.glTexCoord2f(0.0F, local266);
				OpenGL.glVertex2i(local145, local7);
				OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, local266);
				OpenGL.glVertex2i(local272, local7);
				OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2i(local272, local136);
				local272 += local123;
				local145 += local123;
			}
			if (local145 < local3) {
				@Pc(335) float local335 = this.aClass78_Sub2_Sub1_1.aFloat163 * (float) (local3 - local145) / (float) this.aClass78_Sub2_Sub1_1.anInt2414;
				OpenGL.glTexCoord2f(0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2i(local145, local136);
				OpenGL.glTexCoord2f(0.0F, local266);
				OpenGL.glVertex2i(local145, local7);
				OpenGL.glTexCoord2f(local335, local266);
				OpenGL.glVertex2i(local3, local7);
				OpenGL.glTexCoord2f(local335, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2i(local3, local136);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!aeu", name = "bi", descriptor = "(IIIIIII)V", line = 303)
	@Override
	public void method18216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0 + arg2;
		@Pc(7) int local7 = arg1 + arg3;
		this.aClass78_Sub2_Sub1_1.method17453(false);
		this.aClass86_Sub3_26.method6171();
		this.aClass86_Sub3_26.method6195(this.aClass78_Sub2_Sub1_1);
		this.aClass86_Sub3_26.method6250(arg6);
		this.aClass86_Sub3_26.method6198(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass78_Sub2_Sub1_1.aBoolean374 && !this.aBoolean151 && arg3 >= this.aClass78_Sub2_Sub1_1.anInt2415 && arg2 >= this.aClass78_Sub2_Sub1_1.anInt2414) {
			@Pc(71) float local71 = this.aClass78_Sub2_Sub1_1.aFloat164 * (float) arg3 / (float) this.aClass78_Sub2_Sub1_1.anInt2415;
			@Pc(83) float local83 = this.aClass78_Sub2_Sub1_1.aFloat163 * (float) arg2 / (float) this.aClass78_Sub2_Sub1_1.anInt2414;
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
		OpenGL.glTranslatef((float) this.anInt756, (float) this.anInt758, 0.0F);
		@Pc(123) int local123 = this.method18121();
		@Pc(126) int local126 = this.method18198();
		@Pc(132) int local132 = arg1 + this.aClass78_Sub2_Sub1_1.anInt2415;
		OpenGL.glBegin(7);
		@Pc(136) int local136 = arg1;
		@Pc(145) int local145;
		while (local132 <= local7) {
			local145 = arg0 + this.aClass78_Sub2_Sub1_1.anInt2414;
			@Pc(147) int local147 = arg0;
			while (local145 <= local3) {
				OpenGL.glTexCoord2f(0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2i(local147, local136);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local147, local132);
				OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
				OpenGL.glVertex2i(local145, local132);
				OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2i(local145, local136);
				local145 += local123;
				local147 += local123;
			}
			if (local147 < local3) {
				@Pc(208) float local208 = this.aClass78_Sub2_Sub1_1.aFloat163 * (float) (local3 - local147) / (float) this.aClass78_Sub2_Sub1_1.anInt2414;
				OpenGL.glTexCoord2f(0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2i(local147, local136);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local147, local132);
				OpenGL.glTexCoord2f(local208, 0.0F);
				OpenGL.glVertex2i(local3, local132);
				OpenGL.glTexCoord2f(local208, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2i(local3, local136);
			}
			local136 += local126;
			local132 += local126;
		}
		if (local136 < local7) {
			@Pc(266) float local266 = this.aClass78_Sub2_Sub1_1.aFloat164 * (float) (this.aClass78_Sub2_Sub1_1.anInt2415 - (local7 - local136)) / (float) this.aClass78_Sub2_Sub1_1.anInt2415;
			@Pc(272) int local272 = arg0 + this.aClass78_Sub2_Sub1_1.anInt2414;
			local145 = arg0;
			while (local272 <= local3) {
				OpenGL.glTexCoord2f(0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2i(local145, local136);
				OpenGL.glTexCoord2f(0.0F, local266);
				OpenGL.glVertex2i(local145, local7);
				OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, local266);
				OpenGL.glVertex2i(local272, local7);
				OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2i(local272, local136);
				local272 += local123;
				local145 += local123;
			}
			if (local145 < local3) {
				@Pc(335) float local335 = this.aClass78_Sub2_Sub1_1.aFloat163 * (float) (local3 - local145) / (float) this.aClass78_Sub2_Sub1_1.anInt2414;
				OpenGL.glTexCoord2f(0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2i(local145, local136);
				OpenGL.glTexCoord2f(0.0F, local266);
				OpenGL.glVertex2i(local145, local7);
				OpenGL.glTexCoord2f(local335, local266);
				OpenGL.glVertex2i(local3, local7);
				OpenGL.glTexCoord2f(local335, this.aClass78_Sub2_Sub1_1.aFloat164);
				OpenGL.glVertex2i(local3, local136);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!aeu", name = "bu", descriptor = "(FFFFFFIIII)V", line = 396)
	@Override
	void method18215(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean151) {
			local6 = this.method18121();
			local10 = this.method18198();
			@Pc(16) float local16 = (arg2 - arg0) / local6;
			@Pc(22) float local22 = (arg3 - arg1) / local6;
			@Pc(28) float local28 = (arg4 - arg0) / local10;
			@Pc(34) float local34 = (arg5 - arg1) / local10;
			@Pc(40) float local40 = local28 * (float) this.anInt758;
			@Pc(46) float local46 = local34 * (float) this.anInt758;
			@Pc(52) float local52 = local16 * (float) this.anInt756;
			@Pc(58) float local58 = local22 * (float) this.anInt756;
			@Pc(65) float local65 = -local16 * (float) this.anInt759;
			@Pc(72) float local72 = -local22 * (float) this.anInt759;
			@Pc(79) float local79 = -local28 * (float) this.anInt760;
			@Pc(86) float local86 = -local34 * (float) this.anInt760;
			arg0 = arg0 + local52 + local40;
			arg1 = arg1 + local58 + local46;
			arg2 = arg2 + local65 + local40;
			arg3 = arg3 + local72 + local46;
			arg4 = arg4 + local52 + local79;
			arg5 = arg5 + local58 + local86;
		}
		local6 = arg4 + (arg2 - arg0);
		local10 = arg3 + (arg5 - arg1);
		this.aClass78_Sub2_Sub1_1.method17453((arg9 & 0x1) != 0);
		this.aClass86_Sub3_26.method6171();
		this.aClass86_Sub3_26.method6195(this.aClass78_Sub2_Sub1_1);
		this.aClass86_Sub3_26.method6250(arg8);
		this.aClass86_Sub3_26.method6198(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!aeu", name = "ai", descriptor = "(FFFFFFIIII)V", line = 396)
	@Override
	void method18181(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean151) {
			local6 = this.method18121();
			local10 = this.method18198();
			@Pc(16) float local16 = (arg2 - arg0) / local6;
			@Pc(22) float local22 = (arg3 - arg1) / local6;
			@Pc(28) float local28 = (arg4 - arg0) / local10;
			@Pc(34) float local34 = (arg5 - arg1) / local10;
			@Pc(40) float local40 = local28 * (float) this.anInt758;
			@Pc(46) float local46 = local34 * (float) this.anInt758;
			@Pc(52) float local52 = local16 * (float) this.anInt756;
			@Pc(58) float local58 = local22 * (float) this.anInt756;
			@Pc(65) float local65 = -local16 * (float) this.anInt759;
			@Pc(72) float local72 = -local22 * (float) this.anInt759;
			@Pc(79) float local79 = -local28 * (float) this.anInt760;
			@Pc(86) float local86 = -local34 * (float) this.anInt760;
			arg0 = arg0 + local52 + local40;
			arg1 = arg1 + local58 + local46;
			arg2 = arg2 + local65 + local40;
			arg3 = arg3 + local72 + local46;
			arg4 = arg4 + local52 + local79;
			arg5 = arg5 + local58 + local86;
		}
		local6 = arg4 + (arg2 - arg0);
		local10 = arg3 + (arg5 - arg1);
		this.aClass78_Sub2_Sub1_1.method17453((arg9 & 0x1) != 0);
		this.aClass86_Sub3_26.method6171();
		this.aClass86_Sub3_26.method6195(this.aClass78_Sub2_Sub1_1);
		this.aClass86_Sub3_26.method6250(arg8);
		this.aClass86_Sub3_26.method6198(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!aeu", name = "bf", descriptor = "(FFFFFFIIII)V", line = 396)
	@Override
	void method18211(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean151) {
			local6 = this.method18121();
			local10 = this.method18198();
			@Pc(16) float local16 = (arg2 - arg0) / local6;
			@Pc(22) float local22 = (arg3 - arg1) / local6;
			@Pc(28) float local28 = (arg4 - arg0) / local10;
			@Pc(34) float local34 = (arg5 - arg1) / local10;
			@Pc(40) float local40 = local28 * (float) this.anInt758;
			@Pc(46) float local46 = local34 * (float) this.anInt758;
			@Pc(52) float local52 = local16 * (float) this.anInt756;
			@Pc(58) float local58 = local22 * (float) this.anInt756;
			@Pc(65) float local65 = -local16 * (float) this.anInt759;
			@Pc(72) float local72 = -local22 * (float) this.anInt759;
			@Pc(79) float local79 = -local28 * (float) this.anInt760;
			@Pc(86) float local86 = -local34 * (float) this.anInt760;
			arg0 = arg0 + local52 + local40;
			arg1 = arg1 + local58 + local46;
			arg2 = arg2 + local65 + local40;
			arg3 = arg3 + local72 + local46;
			arg4 = arg4 + local52 + local79;
			arg5 = arg5 + local58 + local86;
		}
		local6 = arg4 + (arg2 - arg0);
		local10 = arg3 + (arg5 - arg1);
		this.aClass78_Sub2_Sub1_1.method17453((arg9 & 0x1) != 0);
		this.aClass86_Sub3_26.method6171();
		this.aClass86_Sub3_26.method6195(this.aClass78_Sub2_Sub1_1);
		this.aClass86_Sub3_26.method6250(arg8);
		this.aClass86_Sub3_26.method6198(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!aeu", name = "bn", descriptor = "(FFFFFFIIII)V", line = 396)
	@Override
	void method18212(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean151) {
			local6 = this.method18121();
			local10 = this.method18198();
			@Pc(16) float local16 = (arg2 - arg0) / local6;
			@Pc(22) float local22 = (arg3 - arg1) / local6;
			@Pc(28) float local28 = (arg4 - arg0) / local10;
			@Pc(34) float local34 = (arg5 - arg1) / local10;
			@Pc(40) float local40 = local28 * (float) this.anInt758;
			@Pc(46) float local46 = local34 * (float) this.anInt758;
			@Pc(52) float local52 = local16 * (float) this.anInt756;
			@Pc(58) float local58 = local22 * (float) this.anInt756;
			@Pc(65) float local65 = -local16 * (float) this.anInt759;
			@Pc(72) float local72 = -local22 * (float) this.anInt759;
			@Pc(79) float local79 = -local28 * (float) this.anInt760;
			@Pc(86) float local86 = -local34 * (float) this.anInt760;
			arg0 = arg0 + local52 + local40;
			arg1 = arg1 + local58 + local46;
			arg2 = arg2 + local65 + local40;
			arg3 = arg3 + local72 + local46;
			arg4 = arg4 + local52 + local79;
			arg5 = arg5 + local58 + local86;
		}
		local6 = arg4 + (arg2 - arg0);
		local10 = arg3 + (arg5 - arg1);
		this.aClass78_Sub2_Sub1_1.method17453((arg9 & 0x1) != 0);
		this.aClass86_Sub3_26.method6171();
		this.aClass86_Sub3_26.method6195(this.aClass78_Sub2_Sub1_1);
		this.aClass86_Sub3_26.method6250(arg8);
		this.aClass86_Sub3_26.method6198(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!aeu", name = "bp", descriptor = "(FFFFFFIIII)V", line = 396)
	@Override
	void method18186(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean151) {
			local6 = this.method18121();
			local10 = this.method18198();
			@Pc(16) float local16 = (arg2 - arg0) / local6;
			@Pc(22) float local22 = (arg3 - arg1) / local6;
			@Pc(28) float local28 = (arg4 - arg0) / local10;
			@Pc(34) float local34 = (arg5 - arg1) / local10;
			@Pc(40) float local40 = local28 * (float) this.anInt758;
			@Pc(46) float local46 = local34 * (float) this.anInt758;
			@Pc(52) float local52 = local16 * (float) this.anInt756;
			@Pc(58) float local58 = local22 * (float) this.anInt756;
			@Pc(65) float local65 = -local16 * (float) this.anInt759;
			@Pc(72) float local72 = -local22 * (float) this.anInt759;
			@Pc(79) float local79 = -local28 * (float) this.anInt760;
			@Pc(86) float local86 = -local34 * (float) this.anInt760;
			arg0 = arg0 + local52 + local40;
			arg1 = arg1 + local58 + local46;
			arg2 = arg2 + local65 + local40;
			arg3 = arg3 + local72 + local46;
			arg4 = arg4 + local52 + local79;
			arg5 = arg5 + local58 + local86;
		}
		local6 = arg4 + (arg2 - arg0);
		local10 = arg3 + (arg5 - arg1);
		this.aClass78_Sub2_Sub1_1.method17453((arg9 & 0x1) != 0);
		this.aClass86_Sub3_26.method6171();
		this.aClass86_Sub3_26.method6195(this.aClass78_Sub2_Sub1_1);
		this.aClass86_Sub3_26.method6250(arg8);
		this.aClass86_Sub3_26.method6198(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!aeu", name = "al", descriptor = "(FFFFFFILclient!cd;II)V", line = 439)
	@Override
	void method18183(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class90 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(3) Class78_Sub2_Sub1 local3 = ((Class90_Sub3) arg7).aClass78_Sub2_Sub1_3;
		@Pc(10) float local10;
		@Pc(14) float local14;
		@Pc(20) float local20;
		@Pc(26) float local26;
		if (this.aBoolean151) {
			local10 = this.method18121();
			local14 = this.method18198();
			local20 = (arg2 - arg0) / local10;
			local26 = (arg3 - arg1) / local10;
			@Pc(32) float local32 = (arg4 - arg0) / local14;
			@Pc(38) float local38 = (arg5 - arg1) / local14;
			@Pc(44) float local44 = local32 * (float) this.anInt758;
			@Pc(50) float local50 = local38 * (float) this.anInt758;
			@Pc(56) float local56 = local20 * (float) this.anInt756;
			@Pc(62) float local62 = local26 * (float) this.anInt756;
			@Pc(69) float local69 = -local20 * (float) this.anInt759;
			@Pc(76) float local76 = -local26 * (float) this.anInt759;
			@Pc(83) float local83 = -local32 * (float) this.anInt760;
			@Pc(90) float local90 = -local38 * (float) this.anInt760;
			arg0 = arg0 + local56 + local44;
			arg1 = arg1 + local62 + local50;
			arg2 = arg2 + local69 + local44;
			arg3 = arg3 + local76 + local50;
			arg4 = arg4 + local56 + local83;
			arg5 = arg5 + local62 + local90;
		}
		local10 = arg4 + (arg2 - arg0);
		local14 = arg3 + (arg5 - arg1);
		this.aClass78_Sub2_Sub1_1.method17453((arg6 & 0x1) != 0);
		this.aClass86_Sub3_26.method6171();
		this.aClass86_Sub3_26.method6195(this.aClass78_Sub2_Sub1_1);
		this.aClass86_Sub3_26.method6198(1);
		this.aClass86_Sub3_26.method6190(1);
		this.aClass86_Sub3_26.method6195(local3);
		this.aClass86_Sub3_26.method6207(7681, 8448);
		this.aClass86_Sub3_26.method6213(0, 34168, 768);
		this.aClass86_Sub3_26.method6250(1);
		local20 = local3.aFloat163 / (float) local3.anInt2414;
		local26 = local3.aFloat164 / (float) local3.anInt2415;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
		OpenGL.glMultiTexCoord2f(33985, local20 * (arg0 - (float) arg8), local3.aFloat164 - local26 * (arg1 - (float) arg9));
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local20 * (arg4 - (float) arg8), local3.aFloat164 - local26 * (arg5 - (float) arg9));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local20 * (local10 - (float) arg8), local3.aFloat164 - local26 * (local14 - (float) arg9));
		OpenGL.glVertex2f(local10, local14);
		OpenGL.glMultiTexCoord2f(33984, this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
		OpenGL.glMultiTexCoord2f(33985, local20 * (arg2 - (float) arg8), local3.aFloat164 - local26 * (arg3 - (float) arg9));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass86_Sub3_26.method6213(0, 5890, 768);
		this.aClass86_Sub3_26.method6198(0);
		this.aClass86_Sub3_26.method6195(null);
		this.aClass86_Sub3_26.method6190(0);
	}

	@OriginalMember(owner = "client!aeu", name = "bz", descriptor = "(FFFFFFILclient!cd;II)V", line = 439)
	@Override
	void method18209(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class90 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(3) Class78_Sub2_Sub1 local3 = ((Class90_Sub3) arg7).aClass78_Sub2_Sub1_3;
		@Pc(10) float local10;
		@Pc(14) float local14;
		@Pc(20) float local20;
		@Pc(26) float local26;
		if (this.aBoolean151) {
			local10 = this.method18121();
			local14 = this.method18198();
			local20 = (arg2 - arg0) / local10;
			local26 = (arg3 - arg1) / local10;
			@Pc(32) float local32 = (arg4 - arg0) / local14;
			@Pc(38) float local38 = (arg5 - arg1) / local14;
			@Pc(44) float local44 = local32 * (float) this.anInt758;
			@Pc(50) float local50 = local38 * (float) this.anInt758;
			@Pc(56) float local56 = local20 * (float) this.anInt756;
			@Pc(62) float local62 = local26 * (float) this.anInt756;
			@Pc(69) float local69 = -local20 * (float) this.anInt759;
			@Pc(76) float local76 = -local26 * (float) this.anInt759;
			@Pc(83) float local83 = -local32 * (float) this.anInt760;
			@Pc(90) float local90 = -local38 * (float) this.anInt760;
			arg0 = arg0 + local56 + local44;
			arg1 = arg1 + local62 + local50;
			arg2 = arg2 + local69 + local44;
			arg3 = arg3 + local76 + local50;
			arg4 = arg4 + local56 + local83;
			arg5 = arg5 + local62 + local90;
		}
		local10 = arg4 + (arg2 - arg0);
		local14 = arg3 + (arg5 - arg1);
		this.aClass78_Sub2_Sub1_1.method17453((arg6 & 0x1) != 0);
		this.aClass86_Sub3_26.method6171();
		this.aClass86_Sub3_26.method6195(this.aClass78_Sub2_Sub1_1);
		this.aClass86_Sub3_26.method6198(1);
		this.aClass86_Sub3_26.method6190(1);
		this.aClass86_Sub3_26.method6195(local3);
		this.aClass86_Sub3_26.method6207(7681, 8448);
		this.aClass86_Sub3_26.method6213(0, 34168, 768);
		this.aClass86_Sub3_26.method6250(1);
		local20 = local3.aFloat163 / (float) local3.anInt2414;
		local26 = local3.aFloat164 / (float) local3.anInt2415;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
		OpenGL.glMultiTexCoord2f(33985, local20 * (arg0 - (float) arg8), local3.aFloat164 - local26 * (arg1 - (float) arg9));
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local20 * (arg4 - (float) arg8), local3.aFloat164 - local26 * (arg5 - (float) arg9));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local20 * (local10 - (float) arg8), local3.aFloat164 - local26 * (local14 - (float) arg9));
		OpenGL.glVertex2f(local10, local14);
		OpenGL.glMultiTexCoord2f(33984, this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
		OpenGL.glMultiTexCoord2f(33985, local20 * (arg2 - (float) arg8), local3.aFloat164 - local26 * (arg3 - (float) arg9));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass86_Sub3_26.method6213(0, 5890, 768);
		this.aClass86_Sub3_26.method6198(0);
		this.aClass86_Sub3_26.method6195(null);
		this.aClass86_Sub3_26.method6190(0);
	}

	@OriginalMember(owner = "client!aeu", name = "bt", descriptor = "(FFFFFFILclient!cd;II)V", line = 439)
	@Override
	void method18208(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class90 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(3) Class78_Sub2_Sub1 local3 = ((Class90_Sub3) arg7).aClass78_Sub2_Sub1_3;
		@Pc(10) float local10;
		@Pc(14) float local14;
		@Pc(20) float local20;
		@Pc(26) float local26;
		if (this.aBoolean151) {
			local10 = this.method18121();
			local14 = this.method18198();
			local20 = (arg2 - arg0) / local10;
			local26 = (arg3 - arg1) / local10;
			@Pc(32) float local32 = (arg4 - arg0) / local14;
			@Pc(38) float local38 = (arg5 - arg1) / local14;
			@Pc(44) float local44 = local32 * (float) this.anInt758;
			@Pc(50) float local50 = local38 * (float) this.anInt758;
			@Pc(56) float local56 = local20 * (float) this.anInt756;
			@Pc(62) float local62 = local26 * (float) this.anInt756;
			@Pc(69) float local69 = -local20 * (float) this.anInt759;
			@Pc(76) float local76 = -local26 * (float) this.anInt759;
			@Pc(83) float local83 = -local32 * (float) this.anInt760;
			@Pc(90) float local90 = -local38 * (float) this.anInt760;
			arg0 = arg0 + local56 + local44;
			arg1 = arg1 + local62 + local50;
			arg2 = arg2 + local69 + local44;
			arg3 = arg3 + local76 + local50;
			arg4 = arg4 + local56 + local83;
			arg5 = arg5 + local62 + local90;
		}
		local10 = arg4 + (arg2 - arg0);
		local14 = arg3 + (arg5 - arg1);
		this.aClass78_Sub2_Sub1_1.method17453((arg6 & 0x1) != 0);
		this.aClass86_Sub3_26.method6171();
		this.aClass86_Sub3_26.method6195(this.aClass78_Sub2_Sub1_1);
		this.aClass86_Sub3_26.method6198(1);
		this.aClass86_Sub3_26.method6190(1);
		this.aClass86_Sub3_26.method6195(local3);
		this.aClass86_Sub3_26.method6207(7681, 8448);
		this.aClass86_Sub3_26.method6213(0, 34168, 768);
		this.aClass86_Sub3_26.method6250(1);
		local20 = local3.aFloat163 / (float) local3.anInt2414;
		local26 = local3.aFloat164 / (float) local3.anInt2415;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass78_Sub2_Sub1_1.aFloat164);
		OpenGL.glMultiTexCoord2f(33985, local20 * (arg0 - (float) arg8), local3.aFloat164 - local26 * (arg1 - (float) arg9));
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local20 * (arg4 - (float) arg8), local3.aFloat164 - local26 * (arg5 - (float) arg9));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass78_Sub2_Sub1_1.aFloat163, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local20 * (local10 - (float) arg8), local3.aFloat164 - local26 * (local14 - (float) arg9));
		OpenGL.glVertex2f(local10, local14);
		OpenGL.glMultiTexCoord2f(33984, this.aClass78_Sub2_Sub1_1.aFloat163, this.aClass78_Sub2_Sub1_1.aFloat164);
		OpenGL.glMultiTexCoord2f(33985, local20 * (arg2 - (float) arg8), local3.aFloat164 - local26 * (arg3 - (float) arg9));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass86_Sub3_26.method6213(0, 5890, 768);
		this.aClass86_Sub3_26.method6198(0);
		this.aClass86_Sub3_26.method6195(null);
		this.aClass86_Sub3_26.method6190(0);
	}
}
