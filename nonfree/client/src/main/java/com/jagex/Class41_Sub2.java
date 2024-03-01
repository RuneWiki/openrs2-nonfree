package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ael")
public class Class41_Sub2 extends Class41 implements Interface29 {

	@OriginalMember(owner = "client!ael", name = "n", descriptor = "I")
	final int anInt985;

	@OriginalMember(owner = "client!ael", name = "e", descriptor = "I")
	final int anInt986;

	@OriginalMember(owner = "client!ael", name = "r", descriptor = "F")
	final float aFloat137;

	@OriginalMember(owner = "client!ael", name = "d", descriptor = "F")
	final float aFloat138;

	@OriginalMember(owner = "client!ael", name = "<init>", descriptor = "(Lclient!akk;Lclient!cw;Lclient!dj;II)V", line = 17)
	Class41_Sub2(@OriginalArg(0) Class21_Sub3_Sub1 arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) Class127 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
		if (this.aClass21_Sub3_Sub1_9.aBoolean401) {
			this.anInt985 = arg3;
			this.anInt986 = arg4;
			this.aFloat137 = 1.0F;
			this.aFloat138 = 1.0F;
		} else {
			this.anInt985 = Class302.method25670(arg3);
			this.anInt986 = Class302.method25670(arg4);
			this.aFloat137 = (float) arg3 / (float) this.anInt985;
			this.aFloat138 = (float) arg4 / (float) this.anInt986;
		}
		this.aClass21_Sub3_Sub1_9.method17513(this);
		OpenGL.glTexImage2Dub(this.anInt1118, 0, Class21_Sub3_Sub1.method16347(this.aClass121_14, this.aClass127_15), arg3, arg4, 0, Class21_Sub3_Sub1.method16337(this.aClass121_14), Class21_Sub3_Sub1.method16346(this.aClass127_15), null, 0);
	}

	@OriginalMember(owner = "client!ael", name = "<init>", descriptor = "(Lclient!akk;IIZ[III)V", line = 35)
	Class41_Sub2(@OriginalArg(0) Class21_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Class121.aClass121_17, Class127.aClass127_23, arg1 * arg2, arg3);
		if (this.aClass21_Sub3_Sub1_9.aBoolean401) {
			this.anInt985 = arg1;
			this.anInt986 = arg2;
			this.aFloat137 = 1.0F;
			this.aFloat138 = 1.0F;
		} else {
			this.anInt985 = Class302.method25670(arg1);
			this.anInt986 = Class302.method25670(arg2);
			this.aFloat137 = (float) arg1 / (float) this.anInt985;
			this.aFloat138 = (float) arg2 / (float) this.anInt986;
			if (arg1 != this.anInt985 || arg2 != this.anInt986) {
				arg4 = this.aClass21_Sub3_Sub1_9.method17139(arg1, arg2, this.anInt985, this.anInt986, arg4, arg5, arg6);
				arg5 = 0;
				arg6 = this.anInt985;
			}
		}
		this.aClass21_Sub3_Sub1_9.method17513(this);
		if (arg3 && arg6 == 0 && arg5 == 0) {
			this.method9884(this.anInt1118, arg1, arg2, arg4);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(this.anInt1118, 0, 6408, this.anInt985, this.anInt986, 0, 32993, this.aClass21_Sub3_Sub1_9.anInt2346, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!ael", name = "<init>", descriptor = "(Lclient!akk;Lclient!cw;IIZ[BII)V", line = 63)
	Class41_Sub2(@OriginalArg(0) Class21_Sub3_Sub1 arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Class127.aClass127_23, arg2 * arg3, arg4);
		if (this.aClass21_Sub3_Sub1_9.aBoolean401) {
			this.anInt985 = arg2;
			this.anInt986 = arg3;
			this.aFloat137 = 1.0F;
			this.aFloat138 = 1.0F;
		} else {
			this.anInt985 = Class302.method25670(arg2);
			this.anInt986 = Class302.method25670(arg3);
			this.aFloat137 = (float) arg2 / (float) this.anInt985;
			this.aFloat138 = (float) arg3 / (float) this.anInt986;
			if (arg2 != this.anInt985 || arg3 != this.anInt986) {
				arg5 = this.aClass21_Sub3_Sub1_9.method17297(arg2, arg3, this.anInt985, this.anInt986, arg5, arg6, arg7, arg1.anInt3211 * 1629489977);
				arg6 = 0;
				arg7 = this.anInt985;
			}
		}
		this.aClass21_Sub3_Sub1_9.method17513(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4 && arg7 == 0 && arg6 == 0) {
			this.method9878(this.anInt1118, arg2, arg3, arg5);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			if (this.aClass121_14 == Class121.aClass121_24) {
				OpenGL.glCompressedTexImage2Dub(this.anInt1118, 0, 33777, arg2, arg3, 0, arg2 * arg3 / 2, arg5, arg6);
			} else if (this.aClass121_14 == Class121.aClass121_25) {
				OpenGL.glCompressedTexImage2Dub(this.anInt1118, 0, 33779, arg2, arg3, 0, arg2 * arg3, arg5, arg6);
			} else {
				OpenGL.glTexImage2Dub(this.anInt1118, 0, Class21_Sub3_Sub1.method16347(this.aClass121_14, this.aClass127_15), arg2, arg3, 0, Class21_Sub3_Sub1.method16337(this.aClass121_14), 5121, arg5, arg6);
			}
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!ael", name = "<init>", descriptor = "(Lclient!akk;Lclient!cw;IIZ[FII)V", line = 101)
	Class41_Sub2(@OriginalArg(0) Class21_Sub3_Sub1 arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Class127.aClass127_20, arg2 * arg3, arg4);
		if (this.aClass21_Sub3_Sub1_9.aBoolean401) {
			this.anInt985 = arg2;
			this.anInt986 = arg3;
			this.aFloat137 = 1.0F;
			this.aFloat138 = 1.0F;
		} else {
			this.anInt985 = Class302.method25670(arg2);
			this.anInt986 = Class302.method25670(arg3);
			this.aFloat137 = (float) arg2 / (float) this.anInt985;
			this.aFloat138 = (float) arg3 / (float) this.anInt986;
			if (arg2 != this.anInt985 || arg3 != this.anInt986) {
				arg5 = this.aClass21_Sub3_Sub1_9.method17140(arg2, arg3, this.anInt985, this.anInt986, arg5, arg6, arg7, arg1.anInt3211 * 1629489977);
				arg6 = 0;
				arg7 = this.anInt985;
			}
		}
		this.aClass21_Sub3_Sub1_9.method17513(this);
		if (arg4 && arg7 == 0 && arg6 == 0) {
			this.method9876(this.anInt1118, arg2, arg3, arg5);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(this.anInt1118, 0, Class21_Sub3_Sub1.method16347(this.aClass121_14, this.aClass127_15), arg2, arg3, 0, Class21_Sub3_Sub1.method16337(this.aClass121_14), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!ael", name = "p", descriptor = "()I", line = 129)
	@Override
	public int method8961() {
		return this.anInt985;
	}

	@OriginalMember(owner = "client!ael", name = "r", descriptor = "()I", line = 129)
	@Override
	public int method8941() {
		return this.anInt985;
	}

	@OriginalMember(owner = "client!ael", name = "d", descriptor = "()I", line = 129)
	@Override
	public int method8942() {
		return this.anInt985;
	}

	@OriginalMember(owner = "client!ael", name = "q", descriptor = "()I", line = 129)
	@Override
	public int method8943() {
		return this.anInt985;
	}

	@OriginalMember(owner = "client!ael", name = "m", descriptor = "()I", line = 129)
	@Override
	public int method8944() {
		return this.anInt985;
	}

	@OriginalMember(owner = "client!ael", name = "t", descriptor = "()I", line = 133)
	@Override
	public int method8946() {
		return this.anInt986;
	}

	@OriginalMember(owner = "client!ael", name = "a", descriptor = "()I", line = 133)
	@Override
	public int method8931() {
		return this.anInt986;
	}

	@OriginalMember(owner = "client!ael", name = "v", descriptor = "()I", line = 133)
	@Override
	public int method8945() {
		return this.anInt986;
	}

	@OriginalMember(owner = "client!ael", name = "l", descriptor = "(F)F", line = 137)
	@Override
	public float method8932(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt985;
	}

	@OriginalMember(owner = "client!ael", name = "w", descriptor = "(F)F", line = 137)
	@Override
	public float method8954(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt985;
	}

	@OriginalMember(owner = "client!ael", name = "h", descriptor = "(F)F", line = 141)
	@Override
	public float method8933(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt986;
	}

	@OriginalMember(owner = "client!ael", name = "i", descriptor = "(F)F", line = 141)
	@Override
	public float method8937(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt986;
	}

	@OriginalMember(owner = "client!ael", name = "o", descriptor = "(F)F", line = 141)
	@Override
	public float method8940(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt986;
	}

	@OriginalMember(owner = "client!ael", name = "j", descriptor = "()F", line = 145)
	@Override
	public float method8938() {
		return this.aFloat137;
	}

	@OriginalMember(owner = "client!ael", name = "ai", descriptor = "()F", line = 145)
	@Override
	public float method8959() {
		return this.aFloat137;
	}

	@OriginalMember(owner = "client!ael", name = "n", descriptor = "()F", line = 149)
	@Override
	public float method8939() {
		return this.aFloat138;
	}

	@OriginalMember(owner = "client!ael", name = "av", descriptor = "()F", line = 149)
	@Override
	public float method8953() {
		return this.aFloat138;
	}

	@OriginalMember(owner = "client!ael", name = "aq", descriptor = "()F", line = 149)
	@Override
	public float method8930() {
		return this.aFloat138;
	}

	@OriginalMember(owner = "client!ael", name = "x", descriptor = "()Z", line = 153)
	@Override
	public boolean method8934() {
		return true;
	}

	@OriginalMember(owner = "client!ael", name = "f", descriptor = "()Z", line = 153)
	@Override
	public boolean method8947() {
		return true;
	}

	@OriginalMember(owner = "client!ael", name = "af", descriptor = "(ZZ)V", line = 157)
	@Override
	public void method8948(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aClass21_Sub3_Sub1_9.method17513(this);
		OpenGL.glTexParameteri(this.anInt1118, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(this.anInt1118, 10243, arg1 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!ael", name = "s", descriptor = "(ZZ)V", line = 157)
	@Override
	public void method8951(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aClass21_Sub3_Sub1_9.method17513(this);
		OpenGL.glTexParameteri(this.anInt1118, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(this.anInt1118, 10243, arg1 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!ael", name = "k", descriptor = "(ZZ)V", line = 157)
	@Override
	public void method8962(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aClass21_Sub3_Sub1_9.method17513(this);
		OpenGL.glTexParameteri(this.anInt1118, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(this.anInt1118, 10243, arg1 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!ael", name = "at", descriptor = "(ZZ)V", line = 157)
	@Override
	public void method8952(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aClass21_Sub3_Sub1_9.method17513(this);
		OpenGL.glTexParameteri(this.anInt1118, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(this.anInt1118, 10243, arg1 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!ael", name = "u", descriptor = "(IIII[III)V", line = 163)
	@Override
	public void method8935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass21_Sub3_Sub1_9.method17513(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexSubImage2Di(this.anInt1118, 0, arg0, arg1, arg2, arg3, 32993, this.aClass21_Sub3_Sub1_9.anInt2346, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!ael", name = "ak", descriptor = "(IIII[III)V", line = 163)
	@Override
	public void method8950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass21_Sub3_Sub1_9.method17513(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexSubImage2Di(this.anInt1118, 0, arg0, arg1, arg2, arg3, 32993, this.aClass21_Sub3_Sub1_9.anInt2346, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!ael", name = "c", descriptor = "(IIII[BLclient!cw;II)V", line = 170)
	@Override
	public void method8936(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class121 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass21_Sub3_Sub1_9.method17513(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg7);
		OpenGL.glTexSubImage2Dub(this.anInt1118, 0, arg0, arg1, arg2, arg3, Class21_Sub3_Sub1.method16337(arg5), 5121, arg4, arg6);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!ael", name = "an", descriptor = "(IIII[BLclient!cw;II)V", line = 170)
	@Override
	public void method8960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class121 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass21_Sub3_Sub1_9.method17513(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg7);
		OpenGL.glTexSubImage2Dub(this.anInt1118, 0, arg0, arg1, arg2, arg3, Class21_Sub3_Sub1.method16337(arg5), 5121, arg4, arg6);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!ael", name = "aa", descriptor = "(IIII[BLclient!cw;II)V", line = 170)
	@Override
	public void method8955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class121 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass21_Sub3_Sub1_9.method17513(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg7);
		OpenGL.glTexSubImage2Dub(this.anInt1118, 0, arg0, arg1, arg2, arg3, Class21_Sub3_Sub1.method16337(arg5), 5121, arg4, arg6);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!ael", name = "ah", descriptor = "(IIII[BLclient!cw;II)V", line = 170)
	@Override
	public void method8956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class121 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass21_Sub3_Sub1_9.method17513(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg7);
		OpenGL.glTexSubImage2Dub(this.anInt1118, 0, arg0, arg1, arg2, arg3, Class21_Sub3_Sub1.method16337(arg5), 5121, arg4, arg6);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!ael", name = "z", descriptor = "(IIII[II)V", line = 179)
	@Override
	public void method8949(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		@Pc(6) int[] local6 = new int[this.anInt985 * this.anInt986];
		this.aClass21_Sub3_Sub1_9.method17513(this);
		OpenGL.glGetTexImagei(this.anInt1118, 0, 32993, 5121, local6, 0);
		for (@Pc(20) int local20 = 0; local20 < arg3; local20++) {
			System.arraycopy(local6, (arg1 + (arg3 - 1) - local20) * this.anInt985, arg4, arg5 + local20 * arg2, arg2);
		}
	}

	@OriginalMember(owner = "client!ael", name = "as", descriptor = "(IIII[II)V", line = 179)
	@Override
	public void method8958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		@Pc(6) int[] local6 = new int[this.anInt985 * this.anInt986];
		this.aClass21_Sub3_Sub1_9.method17513(this);
		OpenGL.glGetTexImagei(this.anInt1118, 0, 32993, 5121, local6, 0);
		for (@Pc(20) int local20 = 0; local20 < arg3; local20++) {
			System.arraycopy(local6, (arg1 + (arg3 - 1) - local20) * this.anInt985, arg4, arg5 + local20 * arg2, arg2);
		}
	}

	@OriginalMember(owner = "client!ael", name = "aj", descriptor = "(IIII[II)V", line = 179)
	@Override
	public void method8957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		@Pc(6) int[] local6 = new int[this.anInt985 * this.anInt986];
		this.aClass21_Sub3_Sub1_9.method17513(this);
		OpenGL.glGetTexImagei(this.anInt1118, 0, 32993, 5121, local6, 0);
		for (@Pc(20) int local20 = 0; local20 < arg3; local20++) {
			System.arraycopy(local6, (arg1 + (arg3 - 1) - local20) * this.anInt985, arg4, arg5 + local20 * arg2, arg2);
		}
	}

	@OriginalMember(owner = "client!ael", name = "ar", descriptor = "(I)Lclient!da;", line = 188)
	@Override
	public Interface10 method8965(@OriginalArg(0) int arg0) {
		return new Class365(this, arg0);
	}

	@OriginalMember(owner = "client!ael", name = "ag", descriptor = "(I)Lclient!da;", line = 188)
	@Override
	public Interface10 method8963(@OriginalArg(0) int arg0) {
		return new Class365(this, arg0);
	}

	@OriginalMember(owner = "client!ael", name = "am", descriptor = "(I)Lclient!da;", line = 188)
	@Override
	public Interface10 method8964(@OriginalArg(0) int arg0) {
		return new Class365(this, arg0);
	}

	@OriginalMember(owner = "client!ael", name = "ae", descriptor = "(I)Lclient!da;", line = 188)
	@Override
	public Interface10 method8966(@OriginalArg(0) int arg0) {
		return new Class365(this, arg0);
	}

	@OriginalMember(owner = "client!ael", name = "ad", descriptor = "(I)Lclient!da;", line = 188)
	@Override
	public Interface10 method8967(@OriginalArg(0) int arg0) {
		return new Class365(this, arg0);
	}

	@OriginalMember(owner = "client!ael", name = "al", descriptor = "()Z", line = 192)
	@Override
	public boolean method9882() {
		return super.method9883();
	}

	@OriginalMember(owner = "client!ael", name = "az", descriptor = "()Z", line = 192)
	@Override
	public boolean method9887() {
		return super.method9883();
	}

	@OriginalMember(owner = "client!ael", name = "ax", descriptor = "()Z", line = 192)
	@Override
	public boolean method9886() {
		return super.method9883();
	}

	@OriginalMember(owner = "client!ael", name = "e", descriptor = "()Z", line = 192)
	@Override
	public boolean method9883() {
		return super.method9883();
	}

	@OriginalMember(owner = "client!ael", name = "ao", descriptor = "()V", line = 196)
	@Override
	public void method9872() {
		super.method9872();
	}

	@OriginalMember(owner = "client!ael", name = "au", descriptor = "()V", line = 196)
	@Override
	public void method9873() {
		super.method9872();
	}

	@OriginalMember(owner = "client!ael", name = "ab", descriptor = "()V", line = 196)
	@Override
	public void method9868() {
		super.method9872();
	}

	@OriginalMember(owner = "client!ael", name = "ap", descriptor = "(Lclient!jn;)V", line = 200)
	@Override
	public void method9867(@OriginalArg(0) Class259 arg0) {
		super.method9867(arg0);
	}

	@OriginalMember(owner = "client!ael", name = "ay", descriptor = "(Lclient!jn;)V", line = 200)
	@Override
	public void method9874(@OriginalArg(0) Class259 arg0) {
		super.method9867(arg0);
	}

	@OriginalMember(owner = "client!ael", name = "y", descriptor = "()V", line = 204)
	@Override
	public void method27208() {
		super.method27209();
	}

	@OriginalMember(owner = "client!ael", name = "b", descriptor = "()V", line = 204)
	@Override
	public void method27210() {
		super.method27209();
	}

	@OriginalMember(owner = "client!ael", name = "g", descriptor = "()V", line = 204)
	@Override
	public void method27209() {
		super.method27209();
	}
}
