package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oo")
public class Class447 {

	@OriginalMember(owner = "client!oo", name = "c", descriptor = "I")
	static int anInt4949;

	@OriginalMember(owner = "client!oo", name = "v", descriptor = "I")
	static int anInt4950;

	@OriginalMember(owner = "client!oo", name = "p", descriptor = "[Lclient!oo;")
	static Class447[] aClass447Array2;

	@OriginalMember(owner = "client!oo", name = "w", descriptor = "F")
	public float aFloat276;

	@OriginalMember(owner = "client!oo", name = "l", descriptor = "F")
	public float aFloat277;

	@OriginalMember(owner = "client!oo", name = "y", descriptor = "F")
	public float aFloat278;

	static {
		new Class447(0.0F, 0.0F, 0.0F);
		aClass447Array2 = new Class447[0];
	}

	@OriginalMember(owner = "client!oo", name = "p", descriptor = "(I)V", line = 18)
	public static void method29112(@OriginalArg(0) int arg0) {
		anInt4949 = arg0;
		aClass447Array2 = new Class447[arg0];
		anInt4950 = 0;
	}

	@OriginalMember(owner = "client!oo", name = "ad", descriptor = "(I)V", line = 18)
	public static void method29113(@OriginalArg(0) int arg0) {
		anInt4949 = arg0;
		aClass447Array2 = new Class447[arg0];
		anInt4950 = 0;
	}

	@OriginalMember(owner = "client!oo", name = "av", descriptor = "(I)V", line = 18)
	public static void method29114(@OriginalArg(0) int arg0) {
		anInt4949 = arg0;
		aClass447Array2 = new Class447[arg0];
		anInt4950 = 0;
	}

	@OriginalMember(owner = "client!oo", name = "ac", descriptor = "(I)V", line = 18)
	public static void method29115(@OriginalArg(0) int arg0) {
		anInt4949 = arg0;
		aClass447Array2 = new Class447[arg0];
		anInt4950 = 0;
	}

	@OriginalMember(owner = "client!oo", name = "at", descriptor = "()Lclient!oo;", line = 24)
	public static Class447 method29116() {
		@Pc(2) Class447[] local2 = aClass447Array2;
		synchronized (aClass447Array2) {
			if (anInt4950 == 0) {
				return new Class447();
			} else {
				aClass447Array2[--anInt4950].method29137();
				return aClass447Array2[anInt4950];
			}
		}
	}

	@OriginalMember(owner = "client!oo", name = "ae", descriptor = "()Lclient!oo;", line = 24)
	public static Class447 method29117() {
		@Pc(2) Class447[] local2 = aClass447Array2;
		synchronized (aClass447Array2) {
			if (anInt4950 == 0) {
				return new Class447();
			} else {
				aClass447Array2[--anInt4950].method29137();
				return aClass447Array2[anInt4950];
			}
		}
	}

	@OriginalMember(owner = "client!oo", name = "ah", descriptor = "()Lclient!oo;", line = 24)
	public static Class447 method29118() {
		@Pc(2) Class447[] local2 = aClass447Array2;
		synchronized (aClass447Array2) {
			if (anInt4950 == 0) {
				return new Class447();
			} else {
				aClass447Array2[--anInt4950].method29137();
				return aClass447Array2[anInt4950];
			}
		}
	}

	@OriginalMember(owner = "client!oo", name = "c", descriptor = "()Lclient!oo;", line = 24)
	public static Class447 method29119() {
		@Pc(2) Class447[] local2 = aClass447Array2;
		synchronized (aClass447Array2) {
			if (anInt4950 == 0) {
				return new Class447();
			} else {
				aClass447Array2[--anInt4950].method29137();
				return aClass447Array2[anInt4950];
			}
		}
	}

	@OriginalMember(owner = "client!oo", name = "v", descriptor = "(FFF)Lclient!oo;", line = 34)
	public static Class447 method29120(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(2) Class447[] local2 = aClass447Array2;
		synchronized (aClass447Array2) {
			if (anInt4950 == 0) {
				return new Class447(arg0, arg1, arg2);
			} else {
				aClass447Array2[--anInt4950].method29133(arg0, arg1, arg2);
				return aClass447Array2[anInt4950];
			}
		}
	}

	@OriginalMember(owner = "client!oo", name = "as", descriptor = "(FFF)Lclient!oo;", line = 34)
	public static Class447 method29121(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(2) Class447[] local2 = aClass447Array2;
		synchronized (aClass447Array2) {
			if (anInt4950 == 0) {
				return new Class447(arg0, arg1, arg2);
			} else {
				aClass447Array2[--anInt4950].method29133(arg0, arg1, arg2);
				return aClass447Array2[anInt4950];
			}
		}
	}

	@OriginalMember(owner = "client!oo", name = "aq", descriptor = "(FFF)Lclient!oo;", line = 34)
	public static Class447 method29122(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(2) Class447[] local2 = aClass447Array2;
		synchronized (aClass447Array2) {
			if (anInt4950 == 0) {
				return new Class447(arg0, arg1, arg2);
			} else {
				aClass447Array2[--anInt4950].method29133(arg0, arg1, arg2);
				return aClass447Array2[anInt4950];
			}
		}
	}

	@OriginalMember(owner = "client!oo", name = "am", descriptor = "(FFF)Lclient!oo;", line = 34)
	public static Class447 method29123(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(2) Class447[] local2 = aClass447Array2;
		synchronized (aClass447Array2) {
			if (anInt4950 == 0) {
				return new Class447(arg0, arg1, arg2);
			} else {
				aClass447Array2[--anInt4950].method29133(arg0, arg1, arg2);
				return aClass447Array2[anInt4950];
			}
		}
	}

	@OriginalMember(owner = "client!oo", name = "l", descriptor = "(Lclient!oo;)Lclient!oo;", line = 44)
	public static Class447 method29124(@OriginalArg(0) Class447 arg0) {
		@Pc(2) Class447[] local2 = aClass447Array2;
		synchronized (aClass447Array2) {
			if (anInt4950 == 0) {
				return new Class447(arg0);
			} else {
				aClass447Array2[--anInt4950].method29136(arg0);
				return aClass447Array2[anInt4950];
			}
		}
	}

	@OriginalMember(owner = "client!oo", name = "ay", descriptor = "(Lclient!oo;)Lclient!oo;", line = 44)
	public static Class447 method29125(@OriginalArg(0) Class447 arg0) {
		@Pc(2) Class447[] local2 = aClass447Array2;
		synchronized (aClass447Array2) {
			if (anInt4950 == 0) {
				return new Class447(arg0);
			} else {
				aClass447Array2[--anInt4950].method29136(arg0);
				return aClass447Array2[anInt4950];
			}
		}
	}

	@OriginalMember(owner = "client!oo", name = "af", descriptor = "(Lclient!oo;)Lclient!oo;", line = 44)
	public static Class447 method29126(@OriginalArg(0) Class447 arg0) {
		@Pc(2) Class447[] local2 = aClass447Array2;
		synchronized (aClass447Array2) {
			if (anInt4950 == 0) {
				return new Class447(arg0);
			} else {
				aClass447Array2[--anInt4950].method29136(arg0);
				return aClass447Array2[anInt4950];
			}
		}
	}

	@OriginalMember(owner = "client!oo", name = "y", descriptor = "(Lclient!akv;)Lclient!oo;", line = 54)
	public static Class447 method29127(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(2) Class447[] local2 = aClass447Array2;
		synchronized (aClass447Array2) {
			if (anInt4950 == 0) {
				return new Class447(arg0);
			} else {
				aClass447Array2[--anInt4950].method29131(arg0);
				return aClass447Array2[anInt4950];
			}
		}
	}

	@OriginalMember(owner = "client!oo", name = "an", descriptor = "(Lclient!akv;)Lclient!oo;", line = 54)
	public static Class447 method29128(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(2) Class447[] local2 = aClass447Array2;
		synchronized (aClass447Array2) {
			if (anInt4950 == 0) {
				return new Class447(arg0);
			} else {
				aClass447Array2[--anInt4950].method29131(arg0);
				return aClass447Array2[anInt4950];
			}
		}
	}

	@OriginalMember(owner = "client!oo", name = "ab", descriptor = "()V", line = 64)
	public void method29129() {
		@Pc(2) Class447[] local2 = aClass447Array2;
		synchronized (aClass447Array2) {
			if (anInt4950 < anInt4949 - 1) {
				aClass447Array2[anInt4950++] = this;
			}
		}
	}

	@OriginalMember(owner = "client!oo", name = "w", descriptor = "()V", line = 64)
	public void method29130() {
		@Pc(2) Class447[] local2 = aClass447Array2;
		synchronized (aClass447Array2) {
			if (anInt4950 < anInt4949 - 1) {
				aClass447Array2[anInt4950++] = this;
			}
		}
	}

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "()V", line = 69)
	public Class447() {
	}

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(FFF)V", line = 71)
	public Class447(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat277 = arg0;
		this.aFloat276 = arg1;
		this.aFloat278 = arg2;
	}

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(Lclient!oo;)V", line = 77)
	public Class447(@OriginalArg(0) Class447 arg0) {
		this.aFloat277 = arg0.aFloat277;
		this.aFloat276 = arg0.aFloat276;
		this.aFloat278 = arg0.aFloat278;
	}

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(Lclient!akv;)V", line = 83)
	Class447(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aFloat277 = arg0.method22517();
		this.aFloat276 = arg0.method22517();
		this.aFloat278 = arg0.method22517();
	}

	@OriginalMember(owner = "client!oo", name = "t", descriptor = "(Lclient!akv;)V", line = 90)
	public void method29131(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aFloat277 = arg0.method22517();
		this.aFloat276 = arg0.method22517();
		this.aFloat278 = arg0.method22517();
	}

	@OriginalMember(owner = "client!oo", name = "aa", descriptor = "(Lclient!akv;)V", line = 90)
	public void method29132(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aFloat277 = arg0.method22517();
		this.aFloat276 = arg0.method22517();
		this.aFloat278 = arg0.method22517();
	}

	@OriginalMember(owner = "client!oo", name = "q", descriptor = "(FFF)V", line = 96)
	public void method29133(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat277 = arg0;
		this.aFloat276 = arg1;
		this.aFloat278 = arg2;
	}

	@OriginalMember(owner = "client!oo", name = "aw", descriptor = "(FFF)V", line = 96)
	public void method29134(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat277 = arg0;
		this.aFloat276 = arg1;
		this.aFloat278 = arg2;
	}

	@OriginalMember(owner = "client!oo", name = "ap", descriptor = "(FFF)V", line = 96)
	public void method29135(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat277 = arg0;
		this.aFloat276 = arg1;
		this.aFloat278 = arg2;
	}

	@OriginalMember(owner = "client!oo", name = "x", descriptor = "(Lclient!oo;)V", line = 102)
	public void method29136(@OriginalArg(0) Class447 arg0) {
		this.method29133(arg0.aFloat277, arg0.aFloat276, arg0.aFloat278);
	}

	@OriginalMember(owner = "client!oo", name = "d", descriptor = "()V", line = 106)
	public final void method29137() {
		this.aFloat278 = 0.0F;
		this.aFloat276 = 0.0F;
		this.aFloat277 = 0.0F;
	}

	@OriginalMember(owner = "client!oo", name = "az", descriptor = "()V", line = 106)
	public final void method29138() {
		this.aFloat278 = 0.0F;
		this.aFloat276 = 0.0F;
		this.aFloat277 = 0.0F;
	}

	@OriginalMember(owner = "client!oo", name = "bc", descriptor = "()V", line = 106)
	public final void method29139() {
		this.aFloat278 = 0.0F;
		this.aFloat276 = 0.0F;
		this.aFloat277 = 0.0F;
	}

	@OriginalMember(owner = "client!oo", name = "ba", descriptor = "(Lclient!oo;)Z", line = 112)
	public boolean method29140(@OriginalArg(0) Class447 arg0) {
		return this.aFloat277 == arg0.aFloat277 && this.aFloat276 == arg0.aFloat276 && this.aFloat278 == arg0.aFloat278;
	}

	@OriginalMember(owner = "client!oo", name = "bj", descriptor = "(Lclient!oo;)Z", line = 112)
	public boolean method29141(@OriginalArg(0) Class447 arg0) {
		return this.aFloat277 == arg0.aFloat277 && this.aFloat276 == arg0.aFloat276 && this.aFloat278 == arg0.aFloat278;
	}

	@OriginalMember(owner = "client!oo", name = "bv", descriptor = "(Lclient!oo;)Z", line = 112)
	public boolean method29142(@OriginalArg(0) Class447 arg0) {
		return this.aFloat277 == arg0.aFloat277 && this.aFloat276 == arg0.aFloat276 && this.aFloat278 == arg0.aFloat278;
	}

	@OriginalMember(owner = "client!oo", name = "s", descriptor = "(Lclient!oo;)Z", line = 112)
	public boolean method29143(@OriginalArg(0) Class447 arg0) {
		return this.aFloat277 == arg0.aFloat277 && this.aFloat276 == arg0.aFloat276 && this.aFloat278 == arg0.aFloat278;
	}

	@OriginalMember(owner = "client!oo", name = "r", descriptor = "()V", line = 117)
	public final void method29144() {
		this.aFloat277 = -this.aFloat277;
		this.aFloat276 = -this.aFloat276;
		this.aFloat278 = -this.aFloat278;
	}

	@OriginalMember(owner = "client!oo", name = "g", descriptor = "()V", line = 123)
	public final void method29145() {
		@Pc(4) float local4 = 1.0F / this.method29170();
		this.aFloat277 *= local4;
		this.aFloat276 *= local4;
		this.aFloat278 *= local4;
	}

	@OriginalMember(owner = "client!oo", name = "z", descriptor = "(Lclient!oo;)V", line = 130)
	public final void method29146(@OriginalArg(0) Class447 arg0) {
		this.aFloat277 += arg0.aFloat277;
		this.aFloat276 += arg0.aFloat276;
		this.aFloat278 += arg0.aFloat278;
	}

	@OriginalMember(owner = "client!oo", name = "bl", descriptor = "(Lclient!oo;)V", line = 130)
	public final void method29147(@OriginalArg(0) Class447 arg0) {
		this.aFloat277 += arg0.aFloat277;
		this.aFloat276 += arg0.aFloat276;
		this.aFloat278 += arg0.aFloat278;
	}

	@OriginalMember(owner = "client!oo", name = "bb", descriptor = "(Lclient!oo;)V", line = 130)
	public final void method29148(@OriginalArg(0) Class447 arg0) {
		this.aFloat277 += arg0.aFloat277;
		this.aFloat276 += arg0.aFloat276;
		this.aFloat278 += arg0.aFloat278;
	}

	@OriginalMember(owner = "client!oo", name = "bd", descriptor = "(Lclient!oo;)V", line = 130)
	public final void method29149(@OriginalArg(0) Class447 arg0) {
		this.aFloat277 += arg0.aFloat277;
		this.aFloat276 += arg0.aFloat276;
		this.aFloat278 += arg0.aFloat278;
	}

	@OriginalMember(owner = "client!oo", name = "bw", descriptor = "(Lclient!oo;F)V", line = 136)
	public final void method29150(@OriginalArg(0) Class447 arg0, @OriginalArg(1) float arg1) {
		this.aFloat277 += arg0.aFloat277 * arg1;
		this.aFloat276 += arg0.aFloat276 * arg1;
		this.aFloat278 += arg0.aFloat278 * arg1;
	}

	@OriginalMember(owner = "client!oo", name = "bx", descriptor = "(Lclient!oo;F)V", line = 136)
	public final void method29151(@OriginalArg(0) Class447 arg0, @OriginalArg(1) float arg1) {
		this.aFloat277 += arg0.aFloat277 * arg1;
		this.aFloat276 += arg0.aFloat276 * arg1;
		this.aFloat278 += arg0.aFloat278 * arg1;
	}

	@OriginalMember(owner = "client!oo", name = "j", descriptor = "(Lclient!oo;F)V", line = 136)
	public final void method29152(@OriginalArg(0) Class447 arg0, @OriginalArg(1) float arg1) {
		this.aFloat277 += arg0.aFloat277 * arg1;
		this.aFloat276 += arg0.aFloat276 * arg1;
		this.aFloat278 += arg0.aFloat278 * arg1;
	}

	@OriginalMember(owner = "client!oo", name = "by", descriptor = "(Lclient!oo;F)V", line = 136)
	public final void method29153(@OriginalArg(0) Class447 arg0, @OriginalArg(1) float arg1) {
		this.aFloat277 += arg0.aFloat277 * arg1;
		this.aFloat276 += arg0.aFloat276 * arg1;
		this.aFloat278 += arg0.aFloat278 * arg1;
	}

	@OriginalMember(owner = "client!oo", name = "i", descriptor = "(Lclient!oo;Lclient!oo;)Lclient!oo;", line = 142)
	public static final Class447 method29154(@OriginalArg(0) Class447 arg0, @OriginalArg(1) Class447 arg1) {
		@Pc(2) Class447 local2 = method29124(arg0);
		local2.method29146(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!oo", name = "bi", descriptor = "(Lclient!oo;Lclient!oo;)Lclient!oo;", line = 142)
	public static final Class447 method29155(@OriginalArg(0) Class447 arg0, @OriginalArg(1) Class447 arg1) {
		@Pc(2) Class447 local2 = method29124(arg0);
		local2.method29146(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!oo", name = "k", descriptor = "(Lclient!oo;)V", line = 148)
	public final void method29156(@OriginalArg(0) Class447 arg0) {
		this.aFloat277 -= arg0.aFloat277;
		this.aFloat276 -= arg0.aFloat276;
		this.aFloat278 -= arg0.aFloat278;
	}

	@OriginalMember(owner = "client!oo", name = "bs", descriptor = "(Lclient!oo;)V", line = 148)
	public final void method29157(@OriginalArg(0) Class447 arg0) {
		this.aFloat277 -= arg0.aFloat277;
		this.aFloat276 -= arg0.aFloat276;
		this.aFloat278 -= arg0.aFloat278;
	}

	@OriginalMember(owner = "client!oo", name = "bg", descriptor = "(Lclient!oo;)V", line = 148)
	public final void method29158(@OriginalArg(0) Class447 arg0) {
		this.aFloat277 -= arg0.aFloat277;
		this.aFloat276 -= arg0.aFloat276;
		this.aFloat278 -= arg0.aFloat278;
	}

	@OriginalMember(owner = "client!oo", name = "bz", descriptor = "(Lclient!oo;Lclient!oo;)Lclient!oo;", line = 154)
	public static final Class447 method29159(@OriginalArg(0) Class447 arg0, @OriginalArg(1) Class447 arg1) {
		@Pc(2) Class447 local2 = method29124(arg0);
		local2.method29156(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!oo", name = "u", descriptor = "(Lclient!oo;Lclient!oo;)Lclient!oo;", line = 154)
	public static final Class447 method29160(@OriginalArg(0) Class447 arg0, @OriginalArg(1) Class447 arg1) {
		@Pc(2) Class447 local2 = method29124(arg0);
		local2.method29156(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!oo", name = "bt", descriptor = "(Lclient!oo;Lclient!oo;)Lclient!oo;", line = 154)
	public static final Class447 method29161(@OriginalArg(0) Class447 arg0, @OriginalArg(1) Class447 arg1) {
		@Pc(2) Class447 local2 = method29124(arg0);
		local2.method29156(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!oo", name = "e", descriptor = "(Lclient!oo;)F", line = 160)
	public final float method29162(@OriginalArg(0) Class447 arg0) {
		return this.aFloat277 * arg0.aFloat277 + this.aFloat276 * arg0.aFloat276 + this.aFloat278 * arg0.aFloat278;
	}

	@OriginalMember(owner = "client!oo", name = "bu", descriptor = "(Lclient!oo;)F", line = 160)
	public final float method29163(@OriginalArg(0) Class447 arg0) {
		return this.aFloat277 * arg0.aFloat277 + this.aFloat276 * arg0.aFloat276 + this.aFloat278 * arg0.aFloat278;
	}

	@OriginalMember(owner = "client!oo", name = "bf", descriptor = "(Lclient!oo;Lclient!oo;)F", line = 164)
	public static final float method29164(@OriginalArg(0) Class447 arg0, @OriginalArg(1) Class447 arg1) {
		return arg0.method29162(arg1);
	}

	@OriginalMember(owner = "client!oo", name = "f", descriptor = "(Lclient!oo;Lclient!oo;)F", line = 164)
	public static final float method29165(@OriginalArg(0) Class447 arg0, @OriginalArg(1) Class447 arg1) {
		return arg0.method29162(arg1);
	}

	@OriginalMember(owner = "client!oo", name = "o", descriptor = "(Lclient!oo;)V", line = 168)
	final void method29166(@OriginalArg(0) Class447 arg0) {
		this.method29133(this.aFloat276 * arg0.aFloat278 - this.aFloat278 * arg0.aFloat276, this.aFloat278 * arg0.aFloat277 - this.aFloat277 * arg0.aFloat278, this.aFloat277 * arg0.aFloat276 - this.aFloat276 * arg0.aFloat277);
	}

	@OriginalMember(owner = "client!oo", name = "bn", descriptor = "(Lclient!oo;)V", line = 168)
	final void method29167(@OriginalArg(0) Class447 arg0) {
		this.method29133(this.aFloat276 * arg0.aFloat278 - this.aFloat278 * arg0.aFloat276, this.aFloat278 * arg0.aFloat277 - this.aFloat277 * arg0.aFloat278, this.aFloat277 * arg0.aFloat276 - this.aFloat276 * arg0.aFloat277);
	}

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "(Lclient!oo;Lclient!oo;)Lclient!oo;", line = 172)
	public static final Class447 method29168(@OriginalArg(0) Class447 arg0, @OriginalArg(1) Class447 arg1) {
		@Pc(2) Class447 local2 = method29124(arg0);
		local2.method29166(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!oo", name = "bp", descriptor = "(Lclient!oo;Lclient!oo;)Lclient!oo;", line = 172)
	public static final Class447 method29169(@OriginalArg(0) Class447 arg0, @OriginalArg(1) Class447 arg1) {
		@Pc(2) Class447 local2 = method29124(arg0);
		local2.method29166(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!oo", name = "n", descriptor = "()F", line = 178)
	public final float method29170() {
		return (float) Math.sqrt((double) (this.aFloat277 * this.aFloat277 + this.aFloat276 * this.aFloat276 + this.aFloat278 * this.aFloat278));
	}

	@OriginalMember(owner = "client!oo", name = "bm", descriptor = "()F", line = 178)
	public final float method29171() {
		return (float) Math.sqrt((double) (this.aFloat277 * this.aFloat277 + this.aFloat276 * this.aFloat276 + this.aFloat278 * this.aFloat278));
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "()V", line = 182)
	public final void method29172() {
		if (this.aFloat277 < 0.0F) {
			this.aFloat277 *= -1.0F;
		}
		if (this.aFloat276 < 0.0F) {
			this.aFloat276 *= -1.0F;
		}
		if (this.aFloat278 < 0.0F) {
			this.aFloat278 *= -1.0F;
		}
	}

	@OriginalMember(owner = "client!oo", name = "bo", descriptor = "()V", line = 182)
	public final void method29173() {
		if (this.aFloat277 < 0.0F) {
			this.aFloat277 *= -1.0F;
		}
		if (this.aFloat276 < 0.0F) {
			this.aFloat276 *= -1.0F;
		}
		if (this.aFloat278 < 0.0F) {
			this.aFloat278 *= -1.0F;
		}
	}

	@OriginalMember(owner = "client!oo", name = "bk", descriptor = "()V", line = 182)
	public final void method29174() {
		if (this.aFloat277 < 0.0F) {
			this.aFloat277 *= -1.0F;
		}
		if (this.aFloat276 < 0.0F) {
			this.aFloat276 *= -1.0F;
		}
		if (this.aFloat278 < 0.0F) {
			this.aFloat278 *= -1.0F;
		}
	}

	@OriginalMember(owner = "client!oo", name = "m", descriptor = "(Lclient!oo;)V", line = 188)
	final void method29175(@OriginalArg(0) Class447 arg0) {
		this.aFloat277 *= arg0.aFloat277;
		this.aFloat276 *= arg0.aFloat276;
		this.aFloat278 *= arg0.aFloat278;
	}

	@OriginalMember(owner = "client!oo", name = "br", descriptor = "(Lclient!oo;)V", line = 188)
	final void method29176(@OriginalArg(0) Class447 arg0) {
		this.aFloat277 *= arg0.aFloat277;
		this.aFloat276 *= arg0.aFloat276;
		this.aFloat278 *= arg0.aFloat278;
	}

	@OriginalMember(owner = "client!oo", name = "bq", descriptor = "(Lclient!oo;)V", line = 188)
	final void method29177(@OriginalArg(0) Class447 arg0) {
		this.aFloat277 *= arg0.aFloat277;
		this.aFloat276 *= arg0.aFloat276;
		this.aFloat278 *= arg0.aFloat278;
	}

	@OriginalMember(owner = "client!oo", name = "h", descriptor = "(Lclient!oo;Lclient!oo;)Lclient!oo;", line = 194)
	public static final Class447 method29178(@OriginalArg(0) Class447 arg0, @OriginalArg(1) Class447 arg1) {
		@Pc(2) Class447 local2 = method29124(arg0);
		local2.method29175(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!oo", name = "be", descriptor = "(Lclient!oo;Lclient!oo;)Lclient!oo;", line = 194)
	public static final Class447 method29179(@OriginalArg(0) Class447 arg0, @OriginalArg(1) Class447 arg1) {
		@Pc(2) Class447 local2 = method29124(arg0);
		local2.method29175(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!oo", name = "bh", descriptor = "(Lclient!oo;Lclient!oo;)Lclient!oo;", line = 194)
	public static final Class447 method29180(@OriginalArg(0) Class447 arg0, @OriginalArg(1) Class447 arg1) {
		@Pc(2) Class447 local2 = method29124(arg0);
		local2.method29175(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!oo", name = "cb", descriptor = "(Lclient!oo;Lclient!oo;)Lclient!oo;", line = 194)
	public static final Class447 method29181(@OriginalArg(0) Class447 arg0, @OriginalArg(1) Class447 arg1) {
		@Pc(2) Class447 local2 = method29124(arg0);
		local2.method29175(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!oo", name = "cg", descriptor = "(F)V", line = 200)
	public final void method29182(@OriginalArg(0) float arg0) {
		this.aFloat277 *= arg0;
		this.aFloat276 *= arg0;
		this.aFloat278 *= arg0;
	}

	@OriginalMember(owner = "client!oo", name = "aj", descriptor = "(F)V", line = 200)
	public final void method29183(@OriginalArg(0) float arg0) {
		this.aFloat277 *= arg0;
		this.aFloat276 *= arg0;
		this.aFloat278 *= arg0;
	}

	@OriginalMember(owner = "client!oo", name = "cc", descriptor = "(F)V", line = 200)
	public final void method29184(@OriginalArg(0) float arg0) {
		this.aFloat277 *= arg0;
		this.aFloat276 *= arg0;
		this.aFloat278 *= arg0;
	}

	@OriginalMember(owner = "client!oo", name = "cl", descriptor = "(Lclient!oo;)V", line = 206)
	final void method29185(@OriginalArg(0) Class447 arg0) {
		this.aFloat277 /= arg0.aFloat277;
		this.aFloat276 /= arg0.aFloat276;
		this.aFloat278 /= arg0.aFloat278;
	}

	@OriginalMember(owner = "client!oo", name = "cf", descriptor = "(Lclient!oo;)V", line = 206)
	final void method29186(@OriginalArg(0) Class447 arg0) {
		this.aFloat277 /= arg0.aFloat277;
		this.aFloat276 /= arg0.aFloat276;
		this.aFloat278 /= arg0.aFloat278;
	}

	@OriginalMember(owner = "client!oo", name = "ai", descriptor = "(Lclient!oo;)V", line = 206)
	final void method29187(@OriginalArg(0) Class447 arg0) {
		this.aFloat277 /= arg0.aFloat277;
		this.aFloat276 /= arg0.aFloat276;
		this.aFloat278 /= arg0.aFloat278;
	}

	@OriginalMember(owner = "client!oo", name = "ag", descriptor = "(Lclient!oo;Lclient!oo;)Lclient!oo;", line = 212)
	public static final Class447 method29188(@OriginalArg(0) Class447 arg0, @OriginalArg(1) Class447 arg1) {
		@Pc(2) Class447 local2 = method29124(arg0);
		local2.method29187(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!oo", name = "cp", descriptor = "(Lclient!oo;Lclient!oo;)Lclient!oo;", line = 212)
	public static final Class447 method29189(@OriginalArg(0) Class447 arg0, @OriginalArg(1) Class447 arg1) {
		@Pc(2) Class447 local2 = method29124(arg0);
		local2.method29187(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!oo", name = "cw", descriptor = "(Lclient!oo;Lclient!oo;)Lclient!oo;", line = 212)
	public static final Class447 method29190(@OriginalArg(0) Class447 arg0, @OriginalArg(1) Class447 arg1) {
		@Pc(2) Class447 local2 = method29124(arg0);
		local2.method29187(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!oo", name = "al", descriptor = "(F)V", line = 218)
	public final void method29191(@OriginalArg(0) float arg0) {
		this.aFloat277 /= arg0;
		this.aFloat276 /= arg0;
		this.aFloat278 /= arg0;
	}

	@OriginalMember(owner = "client!oo", name = "ck", descriptor = "(F)V", line = 218)
	public final void method29192(@OriginalArg(0) float arg0) {
		this.aFloat277 /= arg0;
		this.aFloat276 /= arg0;
		this.aFloat278 /= arg0;
	}

	@OriginalMember(owner = "client!oo", name = "cz", descriptor = "(Lclient!oo;F)Lclient!oo;", line = 224)
	public static final Class447 method29193(@OriginalArg(0) Class447 arg0, @OriginalArg(1) float arg1) {
		@Pc(2) Class447 local2 = method29124(arg0);
		local2.method29183(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!oo", name = "ao", descriptor = "(Lclient!oo;F)Lclient!oo;", line = 224)
	public static final Class447 method29194(@OriginalArg(0) Class447 arg0, @OriginalArg(1) float arg1) {
		@Pc(2) Class447 local2 = method29124(arg0);
		local2.method29183(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!oo", name = "ch", descriptor = "(Lclient!oo;F)Lclient!oo;", line = 224)
	public static final Class447 method29195(@OriginalArg(0) Class447 arg0, @OriginalArg(1) float arg1) {
		@Pc(2) Class447 local2 = method29124(arg0);
		local2.method29183(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!oo", name = "cr", descriptor = "(Lclient!ot;)V", line = 230)
	public final void method29196(@OriginalArg(0) Class452 arg0) {
		@Pc(8) Class452 local8 = Class452.method29271(this.aFloat277, this.aFloat276, this.aFloat278, 0.0F);
		@Pc(11) Class452 local11 = Class452.method29313(arg0);
		@Pc(15) Class452 local15 = Class452.method29334(local11, local8);
		local15.method29330(arg0);
		this.method29133(local15.aFloat284, local15.aFloat286, local15.aFloat285);
		local8.method29277();
		local11.method29277();
		local15.method29277();
	}

	@OriginalMember(owner = "client!oo", name = "cv", descriptor = "(Lclient!ot;)V", line = 230)
	public final void method29197(@OriginalArg(0) Class452 arg0) {
		@Pc(8) Class452 local8 = Class452.method29271(this.aFloat277, this.aFloat276, this.aFloat278, 0.0F);
		@Pc(11) Class452 local11 = Class452.method29313(arg0);
		@Pc(15) Class452 local15 = Class452.method29334(local11, local8);
		local15.method29330(arg0);
		this.method29133(local15.aFloat284, local15.aFloat286, local15.aFloat285);
		local8.method29277();
		local11.method29277();
		local15.method29277();
	}

	@OriginalMember(owner = "client!oo", name = "ak", descriptor = "(Lclient!ot;)V", line = 230)
	public final void method29198(@OriginalArg(0) Class452 arg0) {
		@Pc(8) Class452 local8 = Class452.method29271(this.aFloat277, this.aFloat276, this.aFloat278, 0.0F);
		@Pc(11) Class452 local11 = Class452.method29313(arg0);
		@Pc(15) Class452 local15 = Class452.method29334(local11, local8);
		local15.method29330(arg0);
		this.method29133(local15.aFloat284, local15.aFloat286, local15.aFloat285);
		local8.method29277();
		local11.method29277();
		local15.method29277();
	}

	@OriginalMember(owner = "client!oo", name = "cx", descriptor = "(Lclient!ot;)V", line = 230)
	public final void method29199(@OriginalArg(0) Class452 arg0) {
		@Pc(8) Class452 local8 = Class452.method29271(this.aFloat277, this.aFloat276, this.aFloat278, 0.0F);
		@Pc(11) Class452 local11 = Class452.method29313(arg0);
		@Pc(15) Class452 local15 = Class452.method29334(local11, local8);
		local15.method29330(arg0);
		this.method29133(local15.aFloat284, local15.aFloat286, local15.aFloat285);
		local8.method29277();
		local11.method29277();
		local15.method29277();
	}

	@OriginalMember(owner = "client!oo", name = "ca", descriptor = "(Lclient!ot;)V", line = 230)
	public final void method29200(@OriginalArg(0) Class452 arg0) {
		@Pc(8) Class452 local8 = Class452.method29271(this.aFloat277, this.aFloat276, this.aFloat278, 0.0F);
		@Pc(11) Class452 local11 = Class452.method29313(arg0);
		@Pc(15) Class452 local15 = Class452.method29334(local11, local8);
		local15.method29330(arg0);
		this.method29133(local15.aFloat284, local15.aFloat286, local15.aFloat285);
		local8.method29277();
		local11.method29277();
		local15.method29277();
	}

	@OriginalMember(owner = "client!oo", name = "ct", descriptor = "(Lclient!ot;)V", line = 230)
	public final void method29201(@OriginalArg(0) Class452 arg0) {
		@Pc(8) Class452 local8 = Class452.method29271(this.aFloat277, this.aFloat276, this.aFloat278, 0.0F);
		@Pc(11) Class452 local11 = Class452.method29313(arg0);
		@Pc(15) Class452 local15 = Class452.method29334(local11, local8);
		local15.method29330(arg0);
		this.method29133(local15.aFloat284, local15.aFloat286, local15.aFloat285);
		local8.method29277();
		local11.method29277();
		local15.method29277();
	}

	@OriginalMember(owner = "client!oo", name = "cq", descriptor = "(Lclient!ow;)V", line = 241)
	public final void method29202(@OriginalArg(0) Class455 arg0) {
		@Pc(2) float local2 = this.aFloat277;
		@Pc(5) float local5 = this.aFloat276;
		this.aFloat277 = arg0.aFloat288 * local2 + arg0.aFloat291 * local5 + arg0.aFloat294 * this.aFloat278 + arg0.aFloat297;
		this.aFloat276 = arg0.aFloat287 * local2 + arg0.aFloat298 * local5 + arg0.aFloat289 * this.aFloat278 + arg0.aFloat295;
		this.aFloat278 = arg0.aFloat290 * local2 + arg0.aFloat293 * local5 + arg0.aFloat296 * this.aFloat278 + arg0.aFloat292;
	}

	@OriginalMember(owner = "client!oo", name = "ci", descriptor = "(Lclient!ow;)V", line = 241)
	public final void method29203(@OriginalArg(0) Class455 arg0) {
		@Pc(2) float local2 = this.aFloat277;
		@Pc(5) float local5 = this.aFloat276;
		this.aFloat277 = arg0.aFloat288 * local2 + arg0.aFloat291 * local5 + arg0.aFloat294 * this.aFloat278 + arg0.aFloat297;
		this.aFloat276 = arg0.aFloat287 * local2 + arg0.aFloat298 * local5 + arg0.aFloat289 * this.aFloat278 + arg0.aFloat295;
		this.aFloat278 = arg0.aFloat290 * local2 + arg0.aFloat293 * local5 + arg0.aFloat296 * this.aFloat278 + arg0.aFloat292;
	}

	@OriginalMember(owner = "client!oo", name = "au", descriptor = "(Lclient!ow;)V", line = 241)
	public final void method29204(@OriginalArg(0) Class455 arg0) {
		@Pc(2) float local2 = this.aFloat277;
		@Pc(5) float local5 = this.aFloat276;
		this.aFloat277 = arg0.aFloat288 * local2 + arg0.aFloat291 * local5 + arg0.aFloat294 * this.aFloat278 + arg0.aFloat297;
		this.aFloat276 = arg0.aFloat287 * local2 + arg0.aFloat298 * local5 + arg0.aFloat289 * this.aFloat278 + arg0.aFloat295;
		this.aFloat278 = arg0.aFloat290 * local2 + arg0.aFloat293 * local5 + arg0.aFloat296 * this.aFloat278 + arg0.aFloat292;
	}

	@OriginalMember(owner = "client!oo", name = "cu", descriptor = "(Lclient!ow;)V", line = 241)
	public final void method29205(@OriginalArg(0) Class455 arg0) {
		@Pc(2) float local2 = this.aFloat277;
		@Pc(5) float local5 = this.aFloat276;
		this.aFloat277 = arg0.aFloat288 * local2 + arg0.aFloat291 * local5 + arg0.aFloat294 * this.aFloat278 + arg0.aFloat297;
		this.aFloat276 = arg0.aFloat287 * local2 + arg0.aFloat298 * local5 + arg0.aFloat289 * this.aFloat278 + arg0.aFloat295;
		this.aFloat278 = arg0.aFloat290 * local2 + arg0.aFloat293 * local5 + arg0.aFloat296 * this.aFloat278 + arg0.aFloat292;
	}

	@OriginalMember(owner = "client!oo", name = "cm", descriptor = "(Lclient!ow;)V", line = 241)
	public final void method29206(@OriginalArg(0) Class455 arg0) {
		@Pc(2) float local2 = this.aFloat277;
		@Pc(5) float local5 = this.aFloat276;
		this.aFloat277 = arg0.aFloat288 * local2 + arg0.aFloat291 * local5 + arg0.aFloat294 * this.aFloat278 + arg0.aFloat297;
		this.aFloat276 = arg0.aFloat287 * local2 + arg0.aFloat298 * local5 + arg0.aFloat289 * this.aFloat278 + arg0.aFloat295;
		this.aFloat278 = arg0.aFloat290 * local2 + arg0.aFloat293 * local5 + arg0.aFloat296 * this.aFloat278 + arg0.aFloat292;
	}

	@OriginalMember(owner = "client!oo", name = "co", descriptor = "(Lclient!ow;)V", line = 241)
	public final void method29207(@OriginalArg(0) Class455 arg0) {
		@Pc(2) float local2 = this.aFloat277;
		@Pc(5) float local5 = this.aFloat276;
		this.aFloat277 = arg0.aFloat288 * local2 + arg0.aFloat291 * local5 + arg0.aFloat294 * this.aFloat278 + arg0.aFloat297;
		this.aFloat276 = arg0.aFloat287 * local2 + arg0.aFloat298 * local5 + arg0.aFloat289 * this.aFloat278 + arg0.aFloat295;
		this.aFloat278 = arg0.aFloat290 * local2 + arg0.aFloat293 * local5 + arg0.aFloat296 * this.aFloat278 + arg0.aFloat292;
	}

	@OriginalMember(owner = "client!oo", name = "cn", descriptor = "(Lclient!ow;)V", line = 241)
	public final void method29208(@OriginalArg(0) Class455 arg0) {
		@Pc(2) float local2 = this.aFloat277;
		@Pc(5) float local5 = this.aFloat276;
		this.aFloat277 = arg0.aFloat288 * local2 + arg0.aFloat291 * local5 + arg0.aFloat294 * this.aFloat278 + arg0.aFloat297;
		this.aFloat276 = arg0.aFloat287 * local2 + arg0.aFloat298 * local5 + arg0.aFloat289 * this.aFloat278 + arg0.aFloat295;
		this.aFloat278 = arg0.aFloat290 * local2 + arg0.aFloat293 * local5 + arg0.aFloat296 * this.aFloat278 + arg0.aFloat292;
	}

	@OriginalMember(owner = "client!oo", name = "ax", descriptor = "(Lclient!ow;)V", line = 249)
	public final void method29209(@OriginalArg(0) Class455 arg0) {
		@Pc(2) float local2 = this.aFloat277;
		@Pc(5) float local5 = this.aFloat276;
		this.aFloat277 = arg0.aFloat288 * local2 + arg0.aFloat291 * local5 + arg0.aFloat294 * this.aFloat278;
		this.aFloat276 = arg0.aFloat287 * local2 + arg0.aFloat298 * local5 + arg0.aFloat289 * this.aFloat278;
		this.aFloat278 = arg0.aFloat290 * local2 + arg0.aFloat293 * local5 + arg0.aFloat296 * this.aFloat278;
	}

	@OriginalMember(owner = "client!oo", name = "cy", descriptor = "(Lclient!oo;F)V", line = 257)
	public final void method29210(@OriginalArg(0) Class447 arg0, @OriginalArg(1) float arg1) {
		this.method29183(1.0F - arg1);
		this.method29146(method29194(arg0, arg1));
	}

	@OriginalMember(owner = "client!oo", name = "ar", descriptor = "(Lclient!oo;F)V", line = 257)
	public final void method29211(@OriginalArg(0) Class447 arg0, @OriginalArg(1) float arg1) {
		this.method29183(1.0F - arg1);
		this.method29146(method29194(arg0, arg1));
	}

	@OriginalMember(owner = "client!oo", name = "cs", descriptor = "(Lclient!oo;F)V", line = 257)
	public final void method29212(@OriginalArg(0) Class447 arg0, @OriginalArg(1) float arg1) {
		this.method29183(1.0F - arg1);
		this.method29146(method29194(arg0, arg1));
	}

	@OriginalMember(owner = "client!oo", name = "cd", descriptor = "(Lclient!oo;F)V", line = 257)
	public final void method29213(@OriginalArg(0) Class447 arg0, @OriginalArg(1) float arg1) {
		this.method29183(1.0F - arg1);
		this.method29146(method29194(arg0, arg1));
	}

	@OriginalMember(owner = "client!oo", name = "toString", descriptor = "()Ljava/lang/String;", line = 263)
	@Override
	public String toString() {
		return this.aFloat277 + ", " + this.aFloat276 + ", " + this.aFloat278;
	}

	@OriginalMember(owner = "client!oo", name = "rs", descriptor = "()Ljava/lang/String;", line = 263)
	public String method29214() {
		return this.aFloat277 + ", " + this.aFloat276 + ", " + this.aFloat278;
	}

	@OriginalMember(owner = "client!oo", name = "ro", descriptor = "()Ljava/lang/String;", line = 263)
	public String method29215() {
		return this.aFloat277 + ", " + this.aFloat276 + ", " + this.aFloat278;
	}
}
