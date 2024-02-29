package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aho")
public class Class114_Sub3 extends Class114 implements Interface43 {

	@OriginalMember(owner = "client!aho", name = "z", descriptor = "I")
	final int anInt1225;

	@OriginalMember(owner = "client!aho", name = "j", descriptor = "I")
	final int anInt1224;

	@OriginalMember(owner = "client!aho", name = "i", descriptor = "F")
	final float aFloat134;

	@OriginalMember(owner = "client!aho", name = "k", descriptor = "F")
	final float aFloat135;

	@OriginalMember(owner = "client!aho", name = "<init>", descriptor = "(Lclient!apr;Lclient!dt;Lclient!dl;II)V", line = 17)
	Class114_Sub3(@OriginalArg(0) Class86_Sub1_Sub2 arg0, @OriginalArg(1) Class212 arg1, @OriginalArg(2) Class206 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
		if (this.aClass86_Sub1_Sub2_6.aBoolean466) {
			this.anInt1225 = arg3;
			this.anInt1224 = arg4;
			this.aFloat134 = 1.0F;
			this.aFloat135 = 1.0F;
		} else {
			this.anInt1225 = Class199.method25492(arg3);
			this.anInt1224 = Class199.method25492(arg4);
			this.aFloat134 = (float) arg3 / (float) this.anInt1225;
			this.aFloat135 = (float) arg4 / (float) this.anInt1224;
		}
		this.aClass86_Sub1_Sub2_6.method20542(this);
		OpenGL.glTexImage2Dub(this.anInt1223, 0, Class86_Sub1_Sub2.method20812(this.aClass212_13, this.aClass206_13), arg3, arg4, 0, Class86_Sub1_Sub2.method20810(this.aClass212_13), Class86_Sub1_Sub2.method20807(this.aClass206_13), null, 0);
	}

	@OriginalMember(owner = "client!aho", name = "<init>", descriptor = "(Lclient!apr;IIZ[III)V", line = 35)
	Class114_Sub3(@OriginalArg(0) Class86_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Class212.aClass212_18, Class206.aClass206_23, arg1 * arg2, arg3);
		if (this.aClass86_Sub1_Sub2_6.aBoolean466) {
			this.anInt1225 = arg1;
			this.anInt1224 = arg2;
			this.aFloat134 = 1.0F;
			this.aFloat135 = 1.0F;
		} else {
			this.anInt1225 = Class199.method25492(arg1);
			this.anInt1224 = Class199.method25492(arg2);
			this.aFloat134 = (float) arg1 / (float) this.anInt1225;
			this.aFloat135 = (float) arg2 / (float) this.anInt1224;
			if (arg1 != this.anInt1225 || arg2 != this.anInt1224) {
				arg4 = this.aClass86_Sub1_Sub2_6.method20032(arg1, arg2, this.anInt1225, this.anInt1224, arg4, arg5, arg6);
				arg5 = 0;
				arg6 = this.anInt1225;
			}
		}
		this.aClass86_Sub1_Sub2_6.method20542(this);
		if (arg3 && arg6 == 0 && arg5 == 0) {
			this.method10575(this.anInt1223, arg1, arg2, arg4);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(this.anInt1223, 0, 6408, this.anInt1225, this.anInt1224, 0, 32993, this.aClass86_Sub1_Sub2_6.anInt2854, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!aho", name = "<init>", descriptor = "(Lclient!apr;Lclient!dt;IIZ[BII)V", line = 63)
	Class114_Sub3(@OriginalArg(0) Class86_Sub1_Sub2 arg0, @OriginalArg(1) Class212 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Class206.aClass206_23, arg2 * arg3, arg4);
		if (this.aClass86_Sub1_Sub2_6.aBoolean466) {
			this.anInt1225 = arg2;
			this.anInt1224 = arg3;
			this.aFloat134 = 1.0F;
			this.aFloat135 = 1.0F;
		} else {
			this.anInt1225 = Class199.method25492(arg2);
			this.anInt1224 = Class199.method25492(arg3);
			this.aFloat134 = (float) arg2 / (float) this.anInt1225;
			this.aFloat135 = (float) arg3 / (float) this.anInt1224;
			if (arg2 != this.anInt1225 || arg3 != this.anInt1224) {
				arg5 = this.aClass86_Sub1_Sub2_6.method20039(arg2, arg3, this.anInt1225, this.anInt1224, arg5, arg6, arg7, arg1.anInt3679 * 1676120375);
				arg6 = 0;
				arg7 = this.anInt1225;
			}
		}
		this.aClass86_Sub1_Sub2_6.method20542(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4 && arg7 == 0 && arg6 == 0) {
			this.method10581(this.anInt1223, arg2, arg3, arg5);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			if (this.aClass212_13 == Class212.aClass212_23) {
				OpenGL.glCompressedTexImage2Dub(this.anInt1223, 0, 33777, arg2, arg3, 0, arg2 * arg3 / 2, arg5, arg6);
			} else if (this.aClass212_13 == Class212.aClass212_25) {
				OpenGL.glCompressedTexImage2Dub(this.anInt1223, 0, 33779, arg2, arg3, 0, arg2 * arg3, arg5, arg6);
			} else {
				OpenGL.glTexImage2Dub(this.anInt1223, 0, Class86_Sub1_Sub2.method20812(this.aClass212_13, this.aClass206_13), arg2, arg3, 0, Class86_Sub1_Sub2.method20810(this.aClass212_13), 5121, arg5, arg6);
			}
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!aho", name = "<init>", descriptor = "(Lclient!apr;Lclient!dt;IIZ[FII)V", line = 101)
	Class114_Sub3(@OriginalArg(0) Class86_Sub1_Sub2 arg0, @OriginalArg(1) Class212 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Class206.aClass206_19, arg2 * arg3, arg4);
		if (this.aClass86_Sub1_Sub2_6.aBoolean466) {
			this.anInt1225 = arg2;
			this.anInt1224 = arg3;
			this.aFloat134 = 1.0F;
			this.aFloat135 = 1.0F;
		} else {
			this.anInt1225 = Class199.method25492(arg2);
			this.anInt1224 = Class199.method25492(arg3);
			this.aFloat134 = (float) arg2 / (float) this.anInt1225;
			this.aFloat135 = (float) arg3 / (float) this.anInt1224;
			if (arg2 != this.anInt1225 || arg3 != this.anInt1224) {
				arg5 = this.aClass86_Sub1_Sub2_6.method20035(arg2, arg3, this.anInt1225, this.anInt1224, arg5, arg6, arg7, arg1.anInt3679 * 1676120375);
				arg6 = 0;
				arg7 = this.anInt1225;
			}
		}
		this.aClass86_Sub1_Sub2_6.method20542(this);
		if (arg4 && arg7 == 0 && arg6 == 0) {
			this.method10582(this.anInt1223, arg2, arg3, arg5);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(this.anInt1223, 0, Class86_Sub1_Sub2.method20812(this.aClass212_13, this.aClass206_13), arg2, arg3, 0, Class86_Sub1_Sub2.method20810(this.aClass212_13), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!aho", name = "e", descriptor = "()I", line = 129)
	@Override
	public int method10612() {
		return this.anInt1225;
	}

	@OriginalMember(owner = "client!aho", name = "f", descriptor = "()I", line = 129)
	@Override
	public int method10613() {
		return this.anInt1225;
	}

	@OriginalMember(owner = "client!aho", name = "p", descriptor = "()I", line = 129)
	@Override
	public int method10631() {
		return this.anInt1225;
	}

	@OriginalMember(owner = "client!aho", name = "c", descriptor = "()I", line = 133)
	@Override
	public int method10603() {
		return this.anInt1224;
	}

	@OriginalMember(owner = "client!aho", name = "o", descriptor = "()I", line = 133)
	@Override
	public int method10614() {
		return this.anInt1224;
	}

	@OriginalMember(owner = "client!aho", name = "b", descriptor = "()I", line = 133)
	@Override
	public int method10615() {
		return this.anInt1224;
	}

	@OriginalMember(owner = "client!aho", name = "n", descriptor = "(F)F", line = 137)
	@Override
	public float method10616(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1225;
	}

	@OriginalMember(owner = "client!aho", name = "l", descriptor = "(F)F", line = 137)
	@Override
	public float method10600(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1225;
	}

	@OriginalMember(owner = "client!aho", name = "y", descriptor = "(F)F", line = 141)
	@Override
	public float method10606(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1224;
	}

	@OriginalMember(owner = "client!aho", name = "a", descriptor = "(F)F", line = 141)
	@Override
	public float method10617(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1224;
	}

	@OriginalMember(owner = "client!aho", name = "i", descriptor = "()F", line = 145)
	@Override
	public float method10611() {
		return this.aFloat134;
	}

	@OriginalMember(owner = "client!aho", name = "at", descriptor = "()F", line = 145)
	@Override
	public float method10609() {
		return this.aFloat134;
	}

	@OriginalMember(owner = "client!aho", name = "ae", descriptor = "()F", line = 149)
	@Override
	public float method10598() {
		return this.aFloat135;
	}

	@OriginalMember(owner = "client!aho", name = "k", descriptor = "()F", line = 149)
	@Override
	public float method10610() {
		return this.aFloat135;
	}

	@OriginalMember(owner = "client!aho", name = "ah", descriptor = "()F", line = 149)
	@Override
	public float method10632() {
		return this.aFloat135;
	}

	@OriginalMember(owner = "client!aho", name = "w", descriptor = "()Z", line = 153)
	@Override
	public boolean method10602() {
		return true;
	}

	@OriginalMember(owner = "client!aho", name = "m", descriptor = "()Z", line = 153)
	@Override
	public boolean method10621() {
		return true;
	}

	@OriginalMember(owner = "client!aho", name = "t", descriptor = "(ZZ)V", line = 157)
	@Override
	public void method10618(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aClass86_Sub1_Sub2_6.method20542(this);
		OpenGL.glTexParameteri(this.anInt1223, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(this.anInt1223, 10243, arg1 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!aho", name = "h", descriptor = "(ZZ)V", line = 157)
	@Override
	public void method10601(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aClass86_Sub1_Sub2_6.method20542(this);
		OpenGL.glTexParameteri(this.anInt1223, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(this.anInt1223, 10243, arg1 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!aho", name = "q", descriptor = "(IIII[III)V", line = 163)
	@Override
	public void method10630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass86_Sub1_Sub2_6.method20542(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexSubImage2Di(this.anInt1223, 0, arg0, arg1, arg2, arg3, 32993, this.aClass86_Sub1_Sub2_6.anInt2854, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!aho", name = "aj", descriptor = "(IIII[III)V", line = 163)
	@Override
	public void method10620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass86_Sub1_Sub2_6.method20542(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexSubImage2Di(this.anInt1223, 0, arg0, arg1, arg2, arg3, 32993, this.aClass86_Sub1_Sub2_6.anInt2854, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!aho", name = "x", descriptor = "(IIII[BLclient!dt;II)V", line = 170)
	@Override
	public void method10605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class212 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass86_Sub1_Sub2_6.method20542(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg7);
		OpenGL.glTexSubImage2Dub(this.anInt1223, 0, arg0, arg1, arg2, arg3, Class86_Sub1_Sub2.method20810(arg5), 5121, arg4, arg6);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!aho", name = "ai", descriptor = "(IIII[BLclient!dt;II)V", line = 170)
	@Override
	public void method10626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class212 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass86_Sub1_Sub2_6.method20542(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg7);
		OpenGL.glTexSubImage2Dub(this.anInt1223, 0, arg0, arg1, arg2, arg3, Class86_Sub1_Sub2.method20810(arg5), 5121, arg4, arg6);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!aho", name = "ag", descriptor = "(IIII[BLclient!dt;II)V", line = 170)
	@Override
	public void method10622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class212 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass86_Sub1_Sub2_6.method20542(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg7);
		OpenGL.glTexSubImage2Dub(this.anInt1223, 0, arg0, arg1, arg2, arg3, Class86_Sub1_Sub2.method20810(arg5), 5121, arg4, arg6);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!aho", name = "al", descriptor = "(IIII[BLclient!dt;II)V", line = 170)
	@Override
	public void method10619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class212 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass86_Sub1_Sub2_6.method20542(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg7);
		OpenGL.glTexSubImage2Dub(this.anInt1223, 0, arg0, arg1, arg2, arg3, Class86_Sub1_Sub2.method20810(arg5), 5121, arg4, arg6);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!aho", name = "ao", descriptor = "(IIII[BLclient!dt;II)V", line = 170)
	@Override
	public void method10624(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class212 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass86_Sub1_Sub2_6.method20542(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg7);
		OpenGL.glTexSubImage2Dub(this.anInt1223, 0, arg0, arg1, arg2, arg3, Class86_Sub1_Sub2.method20810(arg5), 5121, arg4, arg6);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!aho", name = "ak", descriptor = "(IIII[BLclient!dt;II)V", line = 170)
	@Override
	public void method10625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class212 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass86_Sub1_Sub2_6.method20542(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg7);
		OpenGL.glTexSubImage2Dub(this.anInt1223, 0, arg0, arg1, arg2, arg3, Class86_Sub1_Sub2.method20810(arg5), 5121, arg4, arg6);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!aho", name = "d", descriptor = "(IIII[II)V", line = 179)
	@Override
	public void method10607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		this.method10623(arg0, arg1, arg2, arg3, arg4, null, arg5);
	}

	@OriginalMember(owner = "client!aho", name = "au", descriptor = "(IIII[II)V", line = 179)
	@Override
	public void method10604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		this.method10623(arg0, arg1, arg2, arg3, arg4, null, arg5);
	}

	@OriginalMember(owner = "client!aho", name = "ax", descriptor = "(IIII[II)V", line = 179)
	@Override
	public void method10627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		this.method10623(arg0, arg1, arg2, arg3, arg4, null, arg5);
	}

	@OriginalMember(owner = "client!aho", name = "ar", descriptor = "(IIII[II)V", line = 179)
	@Override
	public void method10628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		this.method10623(arg0, arg1, arg2, arg3, arg4, null, arg5);
	}

	@OriginalMember(owner = "client!aho", name = "z", descriptor = "(IIII[I[II)V", line = 183)
	@Override
	public void method10623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6) {
		@Pc(10) int[] local10 = arg5 == null ? new int[this.anInt1225 * this.anInt1224] : arg5;
		this.aClass86_Sub1_Sub2_6.method20542(this);
		OpenGL.glGetTexImagei(this.anInt1223, 0, 32993, 5121, local10, 0);
		for (@Pc(24) int local24 = 0; local24 < arg3; local24++) {
			System.arraycopy(local10, local24 * this.anInt1225, arg4, arg6 + local24 * arg2, arg2);
		}
	}

	@OriginalMember(owner = "client!aho", name = "ad", descriptor = "(IIII[I[II)V", line = 183)
	@Override
	public void method10629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6) {
		@Pc(10) int[] local10 = arg5 == null ? new int[this.anInt1225 * this.anInt1224] : arg5;
		this.aClass86_Sub1_Sub2_6.method20542(this);
		OpenGL.glGetTexImagei(this.anInt1223, 0, 32993, 5121, local10, 0);
		for (@Pc(24) int local24 = 0; local24 < arg3; local24++) {
			System.arraycopy(local10, local24 * this.anInt1225, arg4, arg6 + local24 * arg2, arg2);
		}
	}

	@OriginalMember(owner = "client!aho", name = "j", descriptor = "(IIIIII)V", line = 192)
	@Override
	public void method10608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass86_Sub1_Sub2_6.method20542(this);
		@Pc(8) Class92 local8 = this.aClass86_Sub1_Sub2_6.method19940();
		if (local8 != null) {
			@Pc(17) int local17 = local8.method23493() - (arg5 + arg3);
			@Pc(23) int local23 = Class86_Sub1_Sub2.method20812(this.aClass212_13, this.aClass206_13);
			OpenGL.glCopyTexImage2D(this.anInt1223, 0, local23, arg4, local17, arg2, arg3, 0);
		}
	}

	@OriginalMember(owner = "client!aho", name = "ac", descriptor = "(IIIIII)V", line = 192)
	@Override
	public void method10633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass86_Sub1_Sub2_6.method20542(this);
		@Pc(8) Class92 local8 = this.aClass86_Sub1_Sub2_6.method19940();
		if (local8 != null) {
			@Pc(17) int local17 = local8.method23493() - (arg5 + arg3);
			@Pc(23) int local23 = Class86_Sub1_Sub2.method20812(this.aClass212_13, this.aClass206_13);
			OpenGL.glCopyTexImage2D(this.anInt1223, 0, local23, arg4, local17, arg2, arg3, 0);
		}
	}

	@OriginalMember(owner = "client!aho", name = "av", descriptor = "(IIIIII)V", line = 192)
	@Override
	public void method10599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass86_Sub1_Sub2_6.method20542(this);
		@Pc(8) Class92 local8 = this.aClass86_Sub1_Sub2_6.method19940();
		if (local8 != null) {
			@Pc(17) int local17 = local8.method23493() - (arg5 + arg3);
			@Pc(23) int local23 = Class86_Sub1_Sub2.method20812(this.aClass212_13, this.aClass206_13);
			OpenGL.glCopyTexImage2D(this.anInt1223, 0, local23, arg4, local17, arg2, arg3, 0);
		}
	}

	@OriginalMember(owner = "client!aho", name = "bj", descriptor = "(I)Lclient!df;", line = 202)
	@Override
	public Interface21 method10635(@OriginalArg(0) int arg0) {
		return new Class495(this, arg0);
	}

	@OriginalMember(owner = "client!aho", name = "bc", descriptor = "(I)Lclient!df;", line = 202)
	@Override
	public Interface21 method10636(@OriginalArg(0) int arg0) {
		return new Class495(this, arg0);
	}

	@OriginalMember(owner = "client!aho", name = "bv", descriptor = "(I)Lclient!df;", line = 202)
	@Override
	public Interface21 method10634(@OriginalArg(0) int arg0) {
		return new Class495(this, arg0);
	}

	@OriginalMember(owner = "client!aho", name = "u", descriptor = "()Z", line = 206)
	@Override
	public boolean method10572() {
		return super.method10572();
	}

	@OriginalMember(owner = "client!aho", name = "as", descriptor = "()Z", line = 206)
	@Override
	public boolean method10573() {
		return super.method10572();
	}

	@OriginalMember(owner = "client!aho", name = "aq", descriptor = "()Z", line = 206)
	@Override
	public boolean method10574() {
		return super.method10572();
	}

	@OriginalMember(owner = "client!aho", name = "am", descriptor = "()Z", line = 206)
	@Override
	public boolean method10571() {
		return super.method10572();
	}

	@OriginalMember(owner = "client!aho", name = "ay", descriptor = "()V", line = 210)
	@Override
	public void method10865() {
		super.method10865();
	}

	@OriginalMember(owner = "client!aho", name = "ap", descriptor = "()V", line = 210)
	@Override
	public void method10866() {
		super.method10865();
	}

	@OriginalMember(owner = "client!aho", name = "an", descriptor = "()V", line = 210)
	@Override
	public void method10867() {
		super.method10865();
	}

	@OriginalMember(owner = "client!aho", name = "ab", descriptor = "()V", line = 210)
	@Override
	public void method10864() {
		super.method10865();
	}

	@OriginalMember(owner = "client!aho", name = "aa", descriptor = "()V", line = 210)
	@Override
	public void method10868() {
		super.method10865();
	}

	@OriginalMember(owner = "client!aho", name = "az", descriptor = "(Lclient!lo;)V", line = 214)
	@Override
	public void method10855(@OriginalArg(0) Class382 arg0) {
		super.method10856(arg0);
	}

	@OriginalMember(owner = "client!aho", name = "af", descriptor = "(Lclient!lo;)V", line = 214)
	@Override
	public void method10856(@OriginalArg(0) Class382 arg0) {
		super.method10856(arg0);
	}

	@OriginalMember(owner = "client!aho", name = "aw", descriptor = "(Lclient!lo;)V", line = 214)
	@Override
	public void method10854(@OriginalArg(0) Class382 arg0) {
		super.method10856(arg0);
	}

	@OriginalMember(owner = "client!aho", name = "v", descriptor = "()V", line = 218)
	@Override
	public void method30322() {
		super.method30322();
	}

	@OriginalMember(owner = "client!aho", name = "r", descriptor = "()V", line = 218)
	@Override
	public void method30321() {
		super.method30322();
	}

	@OriginalMember(owner = "client!aho", name = "g", descriptor = "()V", line = 218)
	@Override
	public void method30319() {
		super.method30322();
	}

	@OriginalMember(owner = "client!aho", name = "s", descriptor = "()V", line = 218)
	@Override
	public void method30320() {
		super.method30322();
	}
}
