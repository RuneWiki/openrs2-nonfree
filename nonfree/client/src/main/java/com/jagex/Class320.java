package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public class Class320 {

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
	static int anInt4564;

	@OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
	static int anInt4565;

	@OriginalMember(owner = "client!mh", name = "p", descriptor = "[Lclient!mh;")
	static Class320[] aClass320Array1;

	@OriginalMember(owner = "client!mh", name = "l", descriptor = "F")
	public float aFloat259;

	@OriginalMember(owner = "client!mh", name = "h", descriptor = "F")
	public float aFloat260;

	@OriginalMember(owner = "client!mh", name = "x", descriptor = "F")
	public float aFloat261;

	static {
		new Class320(0.0F, 0.0F, 0.0F);
		aClass320Array1 = new Class320[0];
	}

	@OriginalMember(owner = "client!mh", name = "aq", descriptor = "(I)V", line = 18)
	public static void method25896(@OriginalArg(0) int arg0) {
		anInt4564 = arg0;
		aClass320Array1 = new Class320[arg0];
		anInt4565 = 0;
	}

	@OriginalMember(owner = "client!mh", name = "av", descriptor = "(I)V", line = 18)
	public static void method25897(@OriginalArg(0) int arg0) {
		anInt4564 = arg0;
		aClass320Array1 = new Class320[arg0];
		anInt4565 = 0;
	}

	@OriginalMember(owner = "client!mh", name = "p", descriptor = "(I)V", line = 18)
	public static void method25933(@OriginalArg(0) int arg0) {
		anInt4564 = arg0;
		aClass320Array1 = new Class320[arg0];
		anInt4565 = 0;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "()Lclient!mh;", line = 24)
	public static Class320 method25859() {
		@Pc(2) Class320[] local2 = aClass320Array1;
		synchronized (aClass320Array1) {
			if (anInt4565 == 0) {
				return new Class320();
			} else {
				aClass320Array1[--anInt4565].method25868();
				return aClass320Array1[anInt4565];
			}
		}
	}

	@OriginalMember(owner = "client!mh", name = "g", descriptor = "(FFF)Lclient!mh;", line = 34)
	public static Class320 method25891(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(2) Class320[] local2 = aClass320Array1;
		synchronized (aClass320Array1) {
			if (anInt4565 == 0) {
				return new Class320(arg0, arg1, arg2);
			} else {
				aClass320Array1[--anInt4565].method25863(arg0, arg1, arg2);
				return aClass320Array1[anInt4565];
			}
		}
	}

	@OriginalMember(owner = "client!mh", name = "ax", descriptor = "(FFF)Lclient!mh;", line = 34)
	public static Class320 method25898(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(2) Class320[] local2 = aClass320Array1;
		synchronized (aClass320Array1) {
			if (anInt4565 == 0) {
				return new Class320(arg0, arg1, arg2);
			} else {
				aClass320Array1[--anInt4565].method25863(arg0, arg1, arg2);
				return aClass320Array1[anInt4565];
			}
		}
	}

	@OriginalMember(owner = "client!mh", name = "az", descriptor = "(FFF)Lclient!mh;", line = 34)
	public static Class320 method25899(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(2) Class320[] local2 = aClass320Array1;
		synchronized (aClass320Array1) {
			if (anInt4565 == 0) {
				return new Class320(arg0, arg1, arg2);
			} else {
				aClass320Array1[--anInt4565].method25863(arg0, arg1, arg2);
				return aClass320Array1[anInt4565];
			}
		}
	}

	@OriginalMember(owner = "client!mh", name = "al", descriptor = "(Lclient!mh;)Lclient!mh;", line = 44)
	public static Class320 method25900(@OriginalArg(0) Class320 arg0) {
		@Pc(2) Class320[] local2 = aClass320Array1;
		synchronized (aClass320Array1) {
			if (anInt4565 == 0) {
				return new Class320(arg0);
			} else {
				aClass320Array1[--anInt4565].method25893(arg0);
				return aClass320Array1[anInt4565];
			}
		}
	}

	@OriginalMember(owner = "client!mh", name = "l", descriptor = "(Lclient!mh;)Lclient!mh;", line = 44)
	public static Class320 method25906(@OriginalArg(0) Class320 arg0) {
		@Pc(2) Class320[] local2 = aClass320Array1;
		synchronized (aClass320Array1) {
			if (anInt4565 == 0) {
				return new Class320(arg0);
			} else {
				aClass320Array1[--anInt4565].method25893(arg0);
				return aClass320Array1[anInt4565];
			}
		}
	}

	@OriginalMember(owner = "client!mh", name = "h", descriptor = "(Lclient!ahb;)Lclient!mh;", line = 54)
	public static Class320 method25895(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(2) Class320[] local2 = aClass320Array1;
		synchronized (aClass320Array1) {
			if (anInt4565 == 0) {
				return new Class320(arg0);
			} else {
				aClass320Array1[--anInt4565].method25866(arg0);
				return aClass320Array1[anInt4565];
			}
		}
	}

	@OriginalMember(owner = "client!mh", name = "x", descriptor = "()V", line = 64)
	public void method25874() {
		@Pc(2) Class320[] local2 = aClass320Array1;
		synchronized (aClass320Array1) {
			if (anInt4565 < anInt4564 - 1) {
				aClass320Array1[anInt4565++] = this;
			}
		}
	}

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V", line = 69)
	public Class320() {
	}

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(FFF)V", line = 71)
	public Class320(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat259 = arg0;
		this.aFloat260 = arg1;
		this.aFloat261 = arg2;
	}

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lclient!mh;)V", line = 77)
	public Class320(@OriginalArg(0) Class320 arg0) {
		this.aFloat259 = arg0.aFloat259;
		this.aFloat260 = arg0.aFloat260;
		this.aFloat261 = arg0.aFloat261;
	}

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lclient!ahb;)V", line = 83)
	Class320(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aFloat259 = arg0.method20448();
		this.aFloat260 = arg0.method20448();
		this.aFloat261 = arg0.method20448();
	}

	@OriginalMember(owner = "client!mh", name = "s", descriptor = "(Lclient!ahb;)V", line = 90)
	public void method25866(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aFloat259 = arg0.method20448();
		this.aFloat260 = arg0.method20448();
		this.aFloat261 = arg0.method20448();
	}

	@OriginalMember(owner = "client!mh", name = "ab", descriptor = "(Lclient!ahb;)V", line = 90)
	public void method25894(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aFloat259 = arg0.method20448();
		this.aFloat260 = arg0.method20448();
		this.aFloat261 = arg0.method20448();
	}

	@OriginalMember(owner = "client!mh", name = "ao", descriptor = "(Lclient!ahb;)V", line = 90)
	public void method25901(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aFloat259 = arg0.method20448();
		this.aFloat260 = arg0.method20448();
		this.aFloat261 = arg0.method20448();
	}

	@OriginalMember(owner = "client!mh", name = "ap", descriptor = "(Lclient!ahb;)V", line = 90)
	public void method25902(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aFloat259 = arg0.method20448();
		this.aFloat260 = arg0.method20448();
		this.aFloat261 = arg0.method20448();
	}

	@OriginalMember(owner = "client!mh", name = "u", descriptor = "(FFF)V", line = 96)
	public void method25863(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat259 = arg0;
		this.aFloat260 = arg1;
		this.aFloat261 = arg2;
	}

	@OriginalMember(owner = "client!mh", name = "au", descriptor = "(FFF)V", line = 96)
	public void method25904(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat259 = arg0;
		this.aFloat260 = arg1;
		this.aFloat261 = arg2;
	}

	@OriginalMember(owner = "client!mh", name = "y", descriptor = "(Lclient!mh;)V", line = 102)
	public void method25893(@OriginalArg(0) Class320 arg0) {
		this.method25863(arg0.aFloat259, arg0.aFloat260, arg0.aFloat261);
	}

	@OriginalMember(owner = "client!mh", name = "ay", descriptor = "(Lclient!mh;)V", line = 102)
	public void method25905(@OriginalArg(0) Class320 arg0) {
		this.method25863(arg0.aFloat259, arg0.aFloat260, arg0.aFloat261);
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "()V", line = 106)
	public final void method25868() {
		this.aFloat261 = 0.0F;
		this.aFloat260 = 0.0F;
		this.aFloat259 = 0.0F;
	}

	@OriginalMember(owner = "client!mh", name = "ag", descriptor = "()V", line = 106)
	public final void method25873() {
		this.aFloat261 = 0.0F;
		this.aFloat260 = 0.0F;
		this.aFloat259 = 0.0F;
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(Lclient!mh;)Z", line = 112)
	public boolean method25869(@OriginalArg(0) Class320 arg0) {
		return this.aFloat259 == arg0.aFloat259 && this.aFloat260 == arg0.aFloat260 && this.aFloat261 == arg0.aFloat261;
	}

	@OriginalMember(owner = "client!mh", name = "ar", descriptor = "(Lclient!mh;)Z", line = 112)
	public boolean method25885(@OriginalArg(0) Class320 arg0) {
		return this.aFloat259 == arg0.aFloat259 && this.aFloat260 == arg0.aFloat260 && this.aFloat261 == arg0.aFloat261;
	}

	@OriginalMember(owner = "client!mh", name = "am", descriptor = "(Lclient!mh;)Z", line = 112)
	public boolean method25907(@OriginalArg(0) Class320 arg0) {
		return this.aFloat259 == arg0.aFloat259 && this.aFloat260 == arg0.aFloat260 && this.aFloat261 == arg0.aFloat261;
	}

	@OriginalMember(owner = "client!mh", name = "ae", descriptor = "(Lclient!mh;)Z", line = 112)
	public boolean method25909(@OriginalArg(0) Class320 arg0) {
		return this.aFloat259 == arg0.aFloat259 && this.aFloat260 == arg0.aFloat260 && this.aFloat261 == arg0.aFloat261;
	}

	@OriginalMember(owner = "client!mh", name = "z", descriptor = "()V", line = 117)
	public final void method25870() {
		this.aFloat259 = -this.aFloat259;
		this.aFloat260 = -this.aFloat260;
		this.aFloat261 = -this.aFloat261;
	}

	@OriginalMember(owner = "client!mh", name = "ad", descriptor = "()V", line = 117)
	public final void method25910() {
		this.aFloat259 = -this.aFloat259;
		this.aFloat260 = -this.aFloat260;
		this.aFloat261 = -this.aFloat261;
	}

	@OriginalMember(owner = "client!mh", name = "ac", descriptor = "()V", line = 117)
	public final void method25912() {
		this.aFloat259 = -this.aFloat259;
		this.aFloat260 = -this.aFloat260;
		this.aFloat261 = -this.aFloat261;
	}

	@OriginalMember(owner = "client!mh", name = "bw", descriptor = "()V", line = 117)
	public final void method25913() {
		this.aFloat259 = -this.aFloat259;
		this.aFloat260 = -this.aFloat260;
		this.aFloat261 = -this.aFloat261;
	}

	@OriginalMember(owner = "client!mh", name = "aw", descriptor = "()V", line = 117)
	public final void method25924() {
		this.aFloat259 = -this.aFloat259;
		this.aFloat260 = -this.aFloat260;
		this.aFloat261 = -this.aFloat261;
	}

	@OriginalMember(owner = "client!mh", name = "bp", descriptor = "()V", line = 123)
	public final void method25876() {
		@Pc(4) float local4 = 1.0F / this.method25861();
		this.aFloat259 *= local4;
		this.aFloat260 *= local4;
		this.aFloat261 *= local4;
	}

	@OriginalMember(owner = "client!mh", name = "bf", descriptor = "()V", line = 123)
	public final void method25881() {
		@Pc(4) float local4 = 1.0F / this.method25861();
		this.aFloat259 *= local4;
		this.aFloat260 *= local4;
		this.aFloat261 *= local4;
	}

	@OriginalMember(owner = "client!mh", name = "j", descriptor = "()V", line = 123)
	public final void method25890() {
		@Pc(4) float local4 = 1.0F / this.method25861();
		this.aFloat259 *= local4;
		this.aFloat260 *= local4;
		this.aFloat261 *= local4;
	}

	@OriginalMember(owner = "client!mh", name = "bd", descriptor = "()V", line = 123)
	public final void method25915() {
		@Pc(4) float local4 = 1.0F / this.method25861();
		this.aFloat259 *= local4;
		this.aFloat260 *= local4;
		this.aFloat261 *= local4;
	}

	@OriginalMember(owner = "client!mh", name = "bs", descriptor = "()V", line = 123)
	public final void method25916() {
		@Pc(4) float local4 = 1.0F / this.method25861();
		this.aFloat259 *= local4;
		this.aFloat260 *= local4;
		this.aFloat261 *= local4;
	}

	@OriginalMember(owner = "client!mh", name = "bm", descriptor = "()V", line = 123)
	public final void method25917() {
		@Pc(4) float local4 = 1.0F / this.method25861();
		this.aFloat259 *= local4;
		this.aFloat260 *= local4;
		this.aFloat261 *= local4;
	}

	@OriginalMember(owner = "client!mh", name = "n", descriptor = "(Lclient!mh;)V", line = 130)
	public final void method25872(@OriginalArg(0) Class320 arg0) {
		this.aFloat259 += arg0.aFloat259;
		this.aFloat260 += arg0.aFloat260;
		this.aFloat261 += arg0.aFloat261;
	}

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "(Lclient!mh;F)V", line = 136)
	public final void method25875(@OriginalArg(0) Class320 arg0, @OriginalArg(1) float arg1) {
		this.aFloat259 += arg0.aFloat259 * arg1;
		this.aFloat260 += arg0.aFloat260 * arg1;
		this.aFloat261 += arg0.aFloat261 * arg1;
	}

	@OriginalMember(owner = "client!mh", name = "bg", descriptor = "(Lclient!mh;F)V", line = 136)
	public final void method25883(@OriginalArg(0) Class320 arg0, @OriginalArg(1) float arg1) {
		this.aFloat259 += arg0.aFloat259 * arg1;
		this.aFloat260 += arg0.aFloat260 * arg1;
		this.aFloat261 += arg0.aFloat261 * arg1;
	}

	@OriginalMember(owner = "client!mh", name = "bt", descriptor = "(Lclient!mh;F)V", line = 136)
	public final void method25919(@OriginalArg(0) Class320 arg0, @OriginalArg(1) float arg1) {
		this.aFloat259 += arg0.aFloat259 * arg1;
		this.aFloat260 += arg0.aFloat260 * arg1;
		this.aFloat261 += arg0.aFloat261 * arg1;
	}

	@OriginalMember(owner = "client!mh", name = "bk", descriptor = "(Lclient!mh;F)V", line = 136)
	public final void method25920(@OriginalArg(0) Class320 arg0, @OriginalArg(1) float arg1) {
		this.aFloat259 += arg0.aFloat259 * arg1;
		this.aFloat260 += arg0.aFloat260 * arg1;
		this.aFloat261 += arg0.aFloat261 * arg1;
	}

	@OriginalMember(owner = "client!mh", name = "by", descriptor = "(Lclient!mh;Lclient!mh;)Lclient!mh;", line = 142)
	public static final Class320 method25864(@OriginalArg(0) Class320 arg0, @OriginalArg(1) Class320 arg1) {
		@Pc(2) Class320 local2 = method25906(arg0);
		local2.method25872(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!mh", name = "br", descriptor = "(Lclient!mh;Lclient!mh;)Lclient!mh;", line = 142)
	public static final Class320 method25865(@OriginalArg(0) Class320 arg0, @OriginalArg(1) Class320 arg1) {
		@Pc(2) Class320 local2 = method25906(arg0);
		local2.method25872(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!mh", name = "r", descriptor = "(Lclient!mh;Lclient!mh;)Lclient!mh;", line = 142)
	public static final Class320 method25903(@OriginalArg(0) Class320 arg0, @OriginalArg(1) Class320 arg1) {
		@Pc(2) Class320 local2 = method25906(arg0);
		local2.method25872(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!mh", name = "bb", descriptor = "(Lclient!mh;Lclient!mh;)Lclient!mh;", line = 142)
	public static final Class320 method25923(@OriginalArg(0) Class320 arg0, @OriginalArg(1) Class320 arg1) {
		@Pc(2) Class320 local2 = method25906(arg0);
		local2.method25872(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "(Lclient!mh;)V", line = 148)
	public final void method25867(@OriginalArg(0) Class320 arg0) {
		this.aFloat259 -= arg0.aFloat259;
		this.aFloat260 -= arg0.aFloat260;
		this.aFloat261 -= arg0.aFloat261;
	}

	@OriginalMember(owner = "client!mh", name = "bi", descriptor = "(Lclient!mh;)V", line = 148)
	public final void method25880(@OriginalArg(0) Class320 arg0) {
		this.aFloat259 -= arg0.aFloat259;
		this.aFloat260 -= arg0.aFloat260;
		this.aFloat261 -= arg0.aFloat261;
	}

	@OriginalMember(owner = "client!mh", name = "bl", descriptor = "(Lclient!mh;)V", line = 148)
	public final void method25925(@OriginalArg(0) Class320 arg0) {
		this.aFloat259 -= arg0.aFloat259;
		this.aFloat260 -= arg0.aFloat260;
		this.aFloat261 -= arg0.aFloat261;
	}

	@OriginalMember(owner = "client!mh", name = "bu", descriptor = "(Lclient!mh;Lclient!mh;)Lclient!mh;", line = 154)
	public static final Class320 method25871(@OriginalArg(0) Class320 arg0, @OriginalArg(1) Class320 arg1) {
		@Pc(2) Class320 local2 = method25906(arg0);
		local2.method25867(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!mh", name = "ba", descriptor = "(Lclient!mh;Lclient!mh;)Lclient!mh;", line = 154)
	public static final Class320 method25918(@OriginalArg(0) Class320 arg0, @OriginalArg(1) Class320 arg1) {
		@Pc(2) Class320 local2 = method25906(arg0);
		local2.method25867(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!mh", name = "q", descriptor = "(Lclient!mh;Lclient!mh;)Lclient!mh;", line = 154)
	public static final Class320 method25928(@OriginalArg(0) Class320 arg0, @OriginalArg(1) Class320 arg1) {
		@Pc(2) Class320 local2 = method25906(arg0);
		local2.method25867(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!mh", name = "bo", descriptor = "(Lclient!mh;Lclient!mh;)Lclient!mh;", line = 154)
	public static final Class320 method25929(@OriginalArg(0) Class320 arg0, @OriginalArg(1) Class320 arg1) {
		@Pc(2) Class320 local2 = method25906(arg0);
		local2.method25867(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!mh", name = "bc", descriptor = "(Lclient!mh;)F", line = 160)
	public final float method25860(@OriginalArg(0) Class320 arg0) {
		return this.aFloat259 * arg0.aFloat259 + this.aFloat260 * arg0.aFloat260 + this.aFloat261 * arg0.aFloat261;
	}

	@OriginalMember(owner = "client!mh", name = "m", descriptor = "(Lclient!mh;)F", line = 160)
	public final float method25877(@OriginalArg(0) Class320 arg0) {
		return this.aFloat259 * arg0.aFloat259 + this.aFloat260 * arg0.aFloat260 + this.aFloat261 * arg0.aFloat261;
	}

	@OriginalMember(owner = "client!mh", name = "bn", descriptor = "(Lclient!mh;)F", line = 160)
	public final float method25931(@OriginalArg(0) Class320 arg0) {
		return this.aFloat259 * arg0.aFloat259 + this.aFloat260 * arg0.aFloat260 + this.aFloat261 * arg0.aFloat261;
	}

	@OriginalMember(owner = "client!mh", name = "be", descriptor = "(Lclient!mh;)F", line = 160)
	public final float method25954(@OriginalArg(0) Class320 arg0) {
		return this.aFloat259 * arg0.aFloat259 + this.aFloat260 * arg0.aFloat260 + this.aFloat261 * arg0.aFloat261;
	}

	@OriginalMember(owner = "client!mh", name = "bx", descriptor = "(Lclient!mh;Lclient!mh;)F", line = 164)
	public static final float method25955(@OriginalArg(0) Class320 arg0, @OriginalArg(1) Class320 arg1) {
		return arg0.method25877(arg1);
	}

	@OriginalMember(owner = "client!mh", name = "v", descriptor = "(Lclient!mh;Lclient!mh;)F", line = 164)
	public static final float method25962(@OriginalArg(0) Class320 arg0, @OriginalArg(1) Class320 arg1) {
		return arg0.method25877(arg1);
	}

	@OriginalMember(owner = "client!mh", name = "t", descriptor = "(Lclient!mh;)V", line = 168)
	final void method25878(@OriginalArg(0) Class320 arg0) {
		this.method25863(this.aFloat260 * arg0.aFloat261 - this.aFloat261 * arg0.aFloat260, this.aFloat261 * arg0.aFloat259 - this.aFloat259 * arg0.aFloat261, this.aFloat259 * arg0.aFloat260 - this.aFloat260 * arg0.aFloat259);
	}

	@OriginalMember(owner = "client!mh", name = "bh", descriptor = "(Lclient!mh;)V", line = 168)
	final void method25934(@OriginalArg(0) Class320 arg0) {
		this.method25863(this.aFloat260 * arg0.aFloat261 - this.aFloat261 * arg0.aFloat260, this.aFloat261 * arg0.aFloat259 - this.aFloat259 * arg0.aFloat261, this.aFloat259 * arg0.aFloat260 - this.aFloat260 * arg0.aFloat259);
	}

	@OriginalMember(owner = "client!mh", name = "w", descriptor = "(Lclient!mh;Lclient!mh;)Lclient!mh;", line = 172)
	public static final Class320 method25879(@OriginalArg(0) Class320 arg0, @OriginalArg(1) Class320 arg1) {
		@Pc(2) Class320 local2 = method25906(arg0);
		local2.method25878(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!mh", name = "bj", descriptor = "(Lclient!mh;Lclient!mh;)Lclient!mh;", line = 172)
	public static final Class320 method25935(@OriginalArg(0) Class320 arg0, @OriginalArg(1) Class320 arg1) {
		@Pc(2) Class320 local2 = method25906(arg0);
		local2.method25878(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!mh", name = "bq", descriptor = "(Lclient!mh;Lclient!mh;)Lclient!mh;", line = 172)
	public static final Class320 method25936(@OriginalArg(0) Class320 arg0, @OriginalArg(1) Class320 arg1) {
		@Pc(2) Class320 local2 = method25906(arg0);
		local2.method25878(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!mh", name = "bv", descriptor = "(Lclient!mh;Lclient!mh;)Lclient!mh;", line = 172)
	public static final Class320 method25937(@OriginalArg(0) Class320 arg0, @OriginalArg(1) Class320 arg1) {
		@Pc(2) Class320 local2 = method25906(arg0);
		local2.method25878(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!mh", name = "o", descriptor = "()F", line = 178)
	public final float method25861() {
		return (float) Math.sqrt((double) (this.aFloat259 * this.aFloat259 + this.aFloat260 * this.aFloat260 + this.aFloat261 * this.aFloat261));
	}

	@OriginalMember(owner = "client!mh", name = "bz", descriptor = "()F", line = 178)
	public final float method25938() {
		return (float) Math.sqrt((double) (this.aFloat259 * this.aFloat259 + this.aFloat260 * this.aFloat260 + this.aFloat261 * this.aFloat261));
	}

	@OriginalMember(owner = "client!mh", name = "ck", descriptor = "()F", line = 178)
	public final float method25939() {
		return (float) Math.sqrt((double) (this.aFloat259 * this.aFloat259 + this.aFloat260 * this.aFloat260 + this.aFloat261 * this.aFloat261));
	}

	@OriginalMember(owner = "client!mh", name = "cm", descriptor = "()V", line = 182)
	public final void method25940() {
		if (this.aFloat259 < 0.0F) {
			this.aFloat259 *= -1.0F;
		}
		if (this.aFloat260 < 0.0F) {
			this.aFloat260 *= -1.0F;
		}
		if (this.aFloat261 < 0.0F) {
			this.aFloat261 *= -1.0F;
		}
	}

	@OriginalMember(owner = "client!mh", name = "i", descriptor = "()V", line = 182)
	public final void method25952() {
		if (this.aFloat259 < 0.0F) {
			this.aFloat259 *= -1.0F;
		}
		if (this.aFloat260 < 0.0F) {
			this.aFloat260 *= -1.0F;
		}
		if (this.aFloat261 < 0.0F) {
			this.aFloat261 *= -1.0F;
		}
	}

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "(Lclient!mh;)V", line = 188)
	final void method25882(@OriginalArg(0) Class320 arg0) {
		this.aFloat259 *= arg0.aFloat259;
		this.aFloat260 *= arg0.aFloat260;
		this.aFloat261 *= arg0.aFloat261;
	}

	@OriginalMember(owner = "client!mh", name = "cj", descriptor = "(Lclient!mh;)V", line = 188)
	final void method25941(@OriginalArg(0) Class320 arg0) {
		this.aFloat259 *= arg0.aFloat259;
		this.aFloat260 *= arg0.aFloat260;
		this.aFloat261 *= arg0.aFloat261;
	}

	@OriginalMember(owner = "client!mh", name = "cu", descriptor = "(Lclient!mh;)V", line = 188)
	final void method25942(@OriginalArg(0) Class320 arg0) {
		this.aFloat259 *= arg0.aFloat259;
		this.aFloat260 *= arg0.aFloat260;
		this.aFloat261 *= arg0.aFloat261;
	}

	@OriginalMember(owner = "client!mh", name = "cq", descriptor = "(Lclient!mh;Lclient!mh;)Lclient!mh;", line = 194)
	public static final Class320 method25922(@OriginalArg(0) Class320 arg0, @OriginalArg(1) Class320 arg1) {
		@Pc(2) Class320 local2 = method25906(arg0);
		local2.method25882(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!mh", name = "k", descriptor = "(Lclient!mh;Lclient!mh;)Lclient!mh;", line = 194)
	public static final Class320 method25927(@OriginalArg(0) Class320 arg0, @OriginalArg(1) Class320 arg1) {
		@Pc(2) Class320 local2 = method25906(arg0);
		local2.method25882(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!mh", name = "cv", descriptor = "(Lclient!mh;Lclient!mh;)Lclient!mh;", line = 194)
	public static final Class320 method25943(@OriginalArg(0) Class320 arg0, @OriginalArg(1) Class320 arg1) {
		@Pc(2) Class320 local2 = method25906(arg0);
		local2.method25882(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!mh", name = "cl", descriptor = "(Lclient!mh;Lclient!mh;)Lclient!mh;", line = 194)
	public static final Class320 method25944(@OriginalArg(0) Class320 arg0, @OriginalArg(1) Class320 arg1) {
		@Pc(2) Class320 local2 = method25906(arg0);
		local2.method25882(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!mh", name = "at", descriptor = "(F)V", line = 200)
	public final void method25884(@OriginalArg(0) float arg0) {
		this.aFloat259 *= arg0;
		this.aFloat260 *= arg0;
		this.aFloat261 *= arg0;
	}

	@OriginalMember(owner = "client!mh", name = "cc", descriptor = "(F)V", line = 200)
	public final void method25892(@OriginalArg(0) float arg0) {
		this.aFloat259 *= arg0;
		this.aFloat260 *= arg0;
		this.aFloat261 *= arg0;
	}

	@OriginalMember(owner = "client!mh", name = "cg", descriptor = "(F)V", line = 200)
	public final void method25946(@OriginalArg(0) float arg0) {
		this.aFloat259 *= arg0;
		this.aFloat260 *= arg0;
		this.aFloat261 *= arg0;
	}

	@OriginalMember(owner = "client!mh", name = "cp", descriptor = "(F)V", line = 200)
	public final void method25947(@OriginalArg(0) float arg0) {
		this.aFloat259 *= arg0;
		this.aFloat260 *= arg0;
		this.aFloat261 *= arg0;
	}

	@OriginalMember(owner = "client!mh", name = "af", descriptor = "(Lclient!mh;)V", line = 206)
	final void method25862(@OriginalArg(0) Class320 arg0) {
		this.aFloat259 /= arg0.aFloat259;
		this.aFloat260 /= arg0.aFloat260;
		this.aFloat261 /= arg0.aFloat261;
	}

	@OriginalMember(owner = "client!mh", name = "cs", descriptor = "(Lclient!mh;)V", line = 206)
	final void method25949(@OriginalArg(0) Class320 arg0) {
		this.aFloat259 /= arg0.aFloat259;
		this.aFloat260 /= arg0.aFloat260;
		this.aFloat261 /= arg0.aFloat261;
	}

	@OriginalMember(owner = "client!mh", name = "cb", descriptor = "(Lclient!mh;Lclient!mh;)Lclient!mh;", line = 212)
	public static final Class320 method25886(@OriginalArg(0) Class320 arg0, @OriginalArg(1) Class320 arg1) {
		@Pc(2) Class320 local2 = method25906(arg0);
		local2.method25862(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!mh", name = "cx", descriptor = "(Lclient!mh;Lclient!mh;)Lclient!mh;", line = 212)
	public static final Class320 method25911(@OriginalArg(0) Class320 arg0, @OriginalArg(1) Class320 arg1) {
		@Pc(2) Class320 local2 = method25906(arg0);
		local2.method25862(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!mh", name = "ak", descriptor = "(Lclient!mh;Lclient!mh;)Lclient!mh;", line = 212)
	public static final Class320 method25948(@OriginalArg(0) Class320 arg0, @OriginalArg(1) Class320 arg1) {
		@Pc(2) Class320 local2 = method25906(arg0);
		local2.method25862(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!mh", name = "ct", descriptor = "(Lclient!mh;Lclient!mh;)Lclient!mh;", line = 212)
	public static final Class320 method25950(@OriginalArg(0) Class320 arg0, @OriginalArg(1) Class320 arg1) {
		@Pc(2) Class320 local2 = method25906(arg0);
		local2.method25862(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!mh", name = "cy", descriptor = "(Lclient!mh;Lclient!mh;)Lclient!mh;", line = 212)
	public static final Class320 method25951(@OriginalArg(0) Class320 arg0, @OriginalArg(1) Class320 arg1) {
		@Pc(2) Class320 local2 = method25906(arg0);
		local2.method25862(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!mh", name = "cz", descriptor = "(Lclient!mh;Lclient!mh;)Lclient!mh;", line = 212)
	public static final Class320 method25953(@OriginalArg(0) Class320 arg0, @OriginalArg(1) Class320 arg1) {
		@Pc(2) Class320 local2 = method25906(arg0);
		local2.method25862(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!mh", name = "aa", descriptor = "(F)V", line = 218)
	public final void method25887(@OriginalArg(0) float arg0) {
		this.aFloat259 /= arg0;
		this.aFloat260 /= arg0;
		this.aFloat261 /= arg0;
	}

	@OriginalMember(owner = "client!mh", name = "cn", descriptor = "(F)V", line = 218)
	public final void method25930(@OriginalArg(0) float arg0) {
		this.aFloat259 /= arg0;
		this.aFloat260 /= arg0;
		this.aFloat261 /= arg0;
	}

	@OriginalMember(owner = "client!mh", name = "cd", descriptor = "(F)V", line = 218)
	public final void method25945(@OriginalArg(0) float arg0) {
		this.aFloat259 /= arg0;
		this.aFloat260 /= arg0;
		this.aFloat261 /= arg0;
	}

	@OriginalMember(owner = "client!mh", name = "co", descriptor = "(F)V", line = 218)
	public final void method25957(@OriginalArg(0) float arg0) {
		this.aFloat259 /= arg0;
		this.aFloat260 /= arg0;
		this.aFloat261 /= arg0;
	}

	@OriginalMember(owner = "client!mh", name = "ah", descriptor = "(Lclient!mh;F)Lclient!mh;", line = 224)
	public static final Class320 method25888(@OriginalArg(0) Class320 arg0, @OriginalArg(1) float arg1) {
		@Pc(2) Class320 local2 = method25906(arg0);
		local2.method25884(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!mh", name = "ch", descriptor = "(Lclient!mh;F)Lclient!mh;", line = 224)
	public static final Class320 method25932(@OriginalArg(0) Class320 arg0, @OriginalArg(1) float arg1) {
		@Pc(2) Class320 local2 = method25906(arg0);
		local2.method25884(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!mh", name = "ci", descriptor = "(Lclient!mh;F)Lclient!mh;", line = 224)
	public static final Class320 method25958(@OriginalArg(0) Class320 arg0, @OriginalArg(1) float arg1) {
		@Pc(2) Class320 local2 = method25906(arg0);
		local2.method25884(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!mh", name = "an", descriptor = "(Lclient!mx;)V", line = 230)
	public final void method25889(@OriginalArg(0) Class335 arg0) {
		@Pc(8) Class335 local8 = Class335.method26294(this.aFloat259, this.aFloat260, this.aFloat261, 0.0F);
		@Pc(11) Class335 local11 = Class335.method26306(arg0);
		@Pc(15) Class335 local15 = Class335.method26313(local11, local8);
		local15.method26312(arg0);
		this.method25863(local15.aFloat287, local15.aFloat286, local15.aFloat285);
		local8.method26293();
		local11.method26293();
		local15.method26293();
	}

	@OriginalMember(owner = "client!mh", name = "ca", descriptor = "(Lclient!mx;)V", line = 230)
	public final void method25959(@OriginalArg(0) Class335 arg0) {
		@Pc(8) Class335 local8 = Class335.method26294(this.aFloat259, this.aFloat260, this.aFloat261, 0.0F);
		@Pc(11) Class335 local11 = Class335.method26306(arg0);
		@Pc(15) Class335 local15 = Class335.method26313(local11, local8);
		local15.method26312(arg0);
		this.method25863(local15.aFloat287, local15.aFloat286, local15.aFloat285);
		local8.method26293();
		local11.method26293();
		local15.method26293();
	}

	@OriginalMember(owner = "client!mh", name = "cr", descriptor = "(Lclient!mx;)V", line = 230)
	public final void method25960(@OriginalArg(0) Class335 arg0) {
		@Pc(8) Class335 local8 = Class335.method26294(this.aFloat259, this.aFloat260, this.aFloat261, 0.0F);
		@Pc(11) Class335 local11 = Class335.method26306(arg0);
		@Pc(15) Class335 local15 = Class335.method26313(local11, local8);
		local15.method26312(arg0);
		this.method25863(local15.aFloat287, local15.aFloat286, local15.aFloat285);
		local8.method26293();
		local11.method26293();
		local15.method26293();
	}

	@OriginalMember(owner = "client!mh", name = "ce", descriptor = "(Lclient!mx;)V", line = 230)
	public final void method25961(@OriginalArg(0) Class335 arg0) {
		@Pc(8) Class335 local8 = Class335.method26294(this.aFloat259, this.aFloat260, this.aFloat261, 0.0F);
		@Pc(11) Class335 local11 = Class335.method26306(arg0);
		@Pc(15) Class335 local15 = Class335.method26313(local11, local8);
		local15.method26312(arg0);
		this.method25863(local15.aFloat287, local15.aFloat286, local15.aFloat285);
		local8.method26293();
		local11.method26293();
		local15.method26293();
	}

	@OriginalMember(owner = "client!mh", name = "cw", descriptor = "(Lclient!mu;)V", line = 241)
	public final void method25858(@OriginalArg(0) Class332 arg0) {
		@Pc(2) float local2 = this.aFloat259;
		@Pc(5) float local5 = this.aFloat260;
		this.aFloat259 = arg0.aFloat270 * local2 + arg0.aFloat273 * local5 + arg0.aFloat280 * this.aFloat261 + arg0.aFloat272;
		this.aFloat260 = arg0.aFloat271 * local2 + arg0.aFloat274 * local5 + arg0.aFloat276 * this.aFloat261 + arg0.aFloat275;
		this.aFloat261 = arg0.aFloat278 * local2 + arg0.aFloat279 * local5 + arg0.aFloat277 * this.aFloat261 + arg0.aFloat269;
	}

	@OriginalMember(owner = "client!mh", name = "aj", descriptor = "(Lclient!mu;)V", line = 241)
	public final void method25914(@OriginalArg(0) Class332 arg0) {
		@Pc(2) float local2 = this.aFloat259;
		@Pc(5) float local5 = this.aFloat260;
		this.aFloat259 = arg0.aFloat270 * local2 + arg0.aFloat273 * local5 + arg0.aFloat280 * this.aFloat261 + arg0.aFloat272;
		this.aFloat260 = arg0.aFloat271 * local2 + arg0.aFloat274 * local5 + arg0.aFloat276 * this.aFloat261 + arg0.aFloat275;
		this.aFloat261 = arg0.aFloat278 * local2 + arg0.aFloat279 * local5 + arg0.aFloat277 * this.aFloat261 + arg0.aFloat269;
	}

	@OriginalMember(owner = "client!mh", name = "cf", descriptor = "(Lclient!mu;)V", line = 241)
	public final void method25963(@OriginalArg(0) Class332 arg0) {
		@Pc(2) float local2 = this.aFloat259;
		@Pc(5) float local5 = this.aFloat260;
		this.aFloat259 = arg0.aFloat270 * local2 + arg0.aFloat273 * local5 + arg0.aFloat280 * this.aFloat261 + arg0.aFloat272;
		this.aFloat260 = arg0.aFloat271 * local2 + arg0.aFloat274 * local5 + arg0.aFloat276 * this.aFloat261 + arg0.aFloat275;
		this.aFloat261 = arg0.aFloat278 * local2 + arg0.aFloat279 * local5 + arg0.aFloat277 * this.aFloat261 + arg0.aFloat269;
	}

	@OriginalMember(owner = "client!mh", name = "dv", descriptor = "(Lclient!mu;)V", line = 241)
	public final void method25964(@OriginalArg(0) Class332 arg0) {
		@Pc(2) float local2 = this.aFloat259;
		@Pc(5) float local5 = this.aFloat260;
		this.aFloat259 = arg0.aFloat270 * local2 + arg0.aFloat273 * local5 + arg0.aFloat280 * this.aFloat261 + arg0.aFloat272;
		this.aFloat260 = arg0.aFloat271 * local2 + arg0.aFloat274 * local5 + arg0.aFloat276 * this.aFloat261 + arg0.aFloat275;
		this.aFloat261 = arg0.aFloat278 * local2 + arg0.aFloat279 * local5 + arg0.aFloat277 * this.aFloat261 + arg0.aFloat269;
	}

	@OriginalMember(owner = "client!mh", name = "as", descriptor = "(Lclient!mu;)V", line = 249)
	public final void method25926(@OriginalArg(0) Class332 arg0) {
		@Pc(2) float local2 = this.aFloat259;
		@Pc(5) float local5 = this.aFloat260;
		this.aFloat259 = arg0.aFloat270 * local2 + arg0.aFloat273 * local5 + arg0.aFloat280 * this.aFloat261;
		this.aFloat260 = arg0.aFloat271 * local2 + arg0.aFloat274 * local5 + arg0.aFloat276 * this.aFloat261;
		this.aFloat261 = arg0.aFloat278 * local2 + arg0.aFloat279 * local5 + arg0.aFloat277 * this.aFloat261;
	}

	@OriginalMember(owner = "client!mh", name = "df", descriptor = "(Lclient!mu;)V", line = 249)
	public final void method25965(@OriginalArg(0) Class332 arg0) {
		@Pc(2) float local2 = this.aFloat259;
		@Pc(5) float local5 = this.aFloat260;
		this.aFloat259 = arg0.aFloat270 * local2 + arg0.aFloat273 * local5 + arg0.aFloat280 * this.aFloat261;
		this.aFloat260 = arg0.aFloat271 * local2 + arg0.aFloat274 * local5 + arg0.aFloat276 * this.aFloat261;
		this.aFloat261 = arg0.aFloat278 * local2 + arg0.aFloat279 * local5 + arg0.aFloat277 * this.aFloat261;
	}

	@OriginalMember(owner = "client!mh", name = "ai", descriptor = "(Lclient!mh;F)V", line = 257)
	public final void method25921(@OriginalArg(0) Class320 arg0, @OriginalArg(1) float arg1) {
		this.method25884(1.0F - arg1);
		this.method25872(method25888(arg0, arg1));
	}

	@OriginalMember(owner = "client!mh", name = "toString", descriptor = "()Ljava/lang/String;", line = 263)
	@Override
	public String toString() {
		return this.aFloat259 + ", " + this.aFloat260 + ", " + this.aFloat261;
	}

	@OriginalMember(owner = "client!mh", name = "ox", descriptor = "()Ljava/lang/String;", line = 263)
	public String method25908() {
		return this.aFloat259 + ", " + this.aFloat260 + ", " + this.aFloat261;
	}

	@OriginalMember(owner = "client!mh", name = "ou", descriptor = "()Ljava/lang/String;", line = 263)
	public String method25956() {
		return this.aFloat259 + ", " + this.aFloat260 + ", " + this.aFloat261;
	}
}
