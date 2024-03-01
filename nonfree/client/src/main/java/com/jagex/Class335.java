package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mx")
public final class Class335 {

	@OriginalMember(owner = "client!mx", name = "a", descriptor = "I")
	static int anInt4595;

	@OriginalMember(owner = "client!mx", name = "g", descriptor = "I")
	static int anInt4596;

	@OriginalMember(owner = "client!mx", name = "p", descriptor = "[Lclient!mx;")
	static Class335[] aClass335Array1 = new Class335[0];

	@OriginalMember(owner = "client!mx", name = "x", descriptor = "F")
	public float aFloat285;

	@OriginalMember(owner = "client!mx", name = "h", descriptor = "F")
	public float aFloat286;

	@OriginalMember(owner = "client!mx", name = "l", descriptor = "F")
	public float aFloat287;

	@OriginalMember(owner = "client!mx", name = "s", descriptor = "F")
	public float aFloat288;

	static {
		new Class335();
	}

	@OriginalMember(owner = "client!mx", name = "p", descriptor = "(I)V", line = 20)
	public static void method26307(@OriginalArg(0) int arg0) {
		anInt4595 = arg0;
		aClass335Array1 = new Class335[arg0];
		anInt4596 = 0;
	}

	@OriginalMember(owner = "client!mx", name = "k", descriptor = "(I)V", line = 20)
	public static void method26325(@OriginalArg(0) int arg0) {
		anInt4595 = arg0;
		aClass335Array1 = new Class335[arg0];
		anInt4596 = 0;
	}

	@OriginalMember(owner = "client!mx", name = "a", descriptor = "()Lclient!mx;", line = 26)
	public static Class335 method26300() {
		@Pc(2) Class335[] local2 = aClass335Array1;
		synchronized (aClass335Array1) {
			if (anInt4596 == 0) {
				return new Class335();
			} else {
				aClass335Array1[--anInt4596].method26297();
				return aClass335Array1[anInt4596];
			}
		}
	}

	@OriginalMember(owner = "client!mx", name = "at", descriptor = "()Lclient!mx;", line = 26)
	public static Class335 method26321() {
		@Pc(2) Class335[] local2 = aClass335Array1;
		synchronized (aClass335Array1) {
			if (anInt4596 == 0) {
				return new Class335();
			} else {
				aClass335Array1[--anInt4596].method26297();
				return aClass335Array1[anInt4596];
			}
		}
	}

	@OriginalMember(owner = "client!mx", name = "af", descriptor = "()Lclient!mx;", line = 26)
	public static Class335 method26322() {
		@Pc(2) Class335[] local2 = aClass335Array1;
		synchronized (aClass335Array1) {
			if (anInt4596 == 0) {
				return new Class335();
			} else {
				aClass335Array1[--anInt4596].method26297();
				return aClass335Array1[anInt4596];
			}
		}
	}

	@OriginalMember(owner = "client!mx", name = "g", descriptor = "(FFFF)Lclient!mx;", line = 36)
	static Class335 method26294(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(2) Class335[] local2 = aClass335Array1;
		synchronized (aClass335Array1) {
			if (anInt4596 == 0) {
				return new Class335(arg0, arg1, arg2, arg3);
			} else {
				aClass335Array1[--anInt4596].method26299(arg0, arg1, arg2, arg3);
				return aClass335Array1[anInt4596];
			}
		}
	}

	@OriginalMember(owner = "client!mx", name = "ak", descriptor = "(FFFF)Lclient!mx;", line = 36)
	static Class335 method26323(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(2) Class335[] local2 = aClass335Array1;
		synchronized (aClass335Array1) {
			if (anInt4596 == 0) {
				return new Class335(arg0, arg1, arg2, arg3);
			} else {
				aClass335Array1[--anInt4596].method26299(arg0, arg1, arg2, arg3);
				return aClass335Array1[anInt4596];
			}
		}
	}

	@OriginalMember(owner = "client!mx", name = "aa", descriptor = "(FFFF)Lclient!mx;", line = 36)
	static Class335 method26324(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(2) Class335[] local2 = aClass335Array1;
		synchronized (aClass335Array1) {
			if (anInt4596 == 0) {
				return new Class335(arg0, arg1, arg2, arg3);
			} else {
				aClass335Array1[--anInt4596].method26299(arg0, arg1, arg2, arg3);
				return aClass335Array1[anInt4596];
			}
		}
	}

	@OriginalMember(owner = "client!mx", name = "l", descriptor = "(Lclient!mx;)Lclient!mx;", line = 46)
	public static Class335 method26295(@OriginalArg(0) Class335 arg0) {
		@Pc(2) Class335[] local2 = aClass335Array1;
		synchronized (aClass335Array1) {
			if (anInt4596 == 0) {
				return new Class335(arg0);
			} else {
				aClass335Array1[--anInt4596].method26315(arg0);
				return aClass335Array1[anInt4596];
			}
		}
	}

	@OriginalMember(owner = "client!mx", name = "ah", descriptor = "(Lclient!mx;)Lclient!mx;", line = 46)
	public static Class335 method26360(@OriginalArg(0) Class335 arg0) {
		@Pc(2) Class335[] local2 = aClass335Array1;
		synchronized (aClass335Array1) {
			if (anInt4596 == 0) {
				return new Class335(arg0);
			} else {
				aClass335Array1[--anInt4596].method26315(arg0);
				return aClass335Array1[anInt4596];
			}
		}
	}

	@OriginalMember(owner = "client!mx", name = "h", descriptor = "()V", line = 56)
	public void method26293() {
		@Pc(2) Class335[] local2 = aClass335Array1;
		synchronized (aClass335Array1) {
			if (anInt4596 < anInt4595 - 1) {
				aClass335Array1[anInt4596++] = this;
			}
		}
	}

	@OriginalMember(owner = "client!mx", name = "an", descriptor = "()V", line = 56)
	public void method26326() {
		@Pc(2) Class335[] local2 = aClass335Array1;
		synchronized (aClass335Array1) {
			if (anInt4596 < anInt4595 - 1) {
				aClass335Array1[anInt4596++] = this;
			}
		}
	}

	@OriginalMember(owner = "client!mx", name = "aj", descriptor = "()V", line = 56)
	public void method26327() {
		@Pc(2) Class335[] local2 = aClass335Array1;
		synchronized (aClass335Array1) {
			if (anInt4596 < anInt4595 - 1) {
				aClass335Array1[anInt4596++] = this;
			}
		}
	}

	@OriginalMember(owner = "client!mx", name = "<init>", descriptor = "()V", line = 61)
	public Class335() {
		this.method26297();
	}

	@OriginalMember(owner = "client!mx", name = "<init>", descriptor = "(FFFF)V", line = 65)
	public Class335(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.method26299(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!mx", name = "<init>", descriptor = "(Lclient!mx;)V", line = 69)
	public Class335(@OriginalArg(0) Class335 arg0) {
		this.method26315(arg0);
	}

	@OriginalMember(owner = "client!mx", name = "<init>", descriptor = "(FFF)V", line = 73)
	public Class335(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method26303(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!mx", name = "x", descriptor = "(Lclient!ahb;)V", line = 78)
	public void method26296(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aFloat287 = arg0.method20448();
		this.aFloat286 = arg0.method20448();
		this.aFloat285 = arg0.method20448();
		this.aFloat288 = arg0.method20448();
	}

	@OriginalMember(owner = "client!mx", name = "ai", descriptor = "(Lclient!ahb;)V", line = 78)
	public void method26311(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aFloat287 = arg0.method20448();
		this.aFloat286 = arg0.method20448();
		this.aFloat285 = arg0.method20448();
		this.aFloat288 = arg0.method20448();
	}

	@OriginalMember(owner = "client!mx", name = "as", descriptor = "(Lclient!ahb;)V", line = 78)
	public void method26328(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aFloat287 = arg0.method20448();
		this.aFloat286 = arg0.method20448();
		this.aFloat285 = arg0.method20448();
		this.aFloat288 = arg0.method20448();
	}

	@OriginalMember(owner = "client!mx", name = "aq", descriptor = "(Lclient!ahb;)V", line = 78)
	public void method26352(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aFloat287 = arg0.method20448();
		this.aFloat286 = arg0.method20448();
		this.aFloat285 = arg0.method20448();
		this.aFloat288 = arg0.method20448();
	}

	@OriginalMember(owner = "client!mx", name = "s", descriptor = "(FFFF)V", line = 85)
	void method26299(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloat287 = arg0;
		this.aFloat286 = arg1;
		this.aFloat285 = arg2;
		this.aFloat288 = arg3;
	}

	@OriginalMember(owner = "client!mx", name = "av", descriptor = "(FFFF)V", line = 85)
	void method26331(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloat287 = arg0;
		this.aFloat286 = arg1;
		this.aFloat285 = arg2;
		this.aFloat288 = arg3;
	}

	@OriginalMember(owner = "client!mx", name = "ax", descriptor = "(FFFF)V", line = 85)
	void method26332(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloat287 = arg0;
		this.aFloat286 = arg1;
		this.aFloat285 = arg2;
		this.aFloat288 = arg3;
	}

	@OriginalMember(owner = "client!mx", name = "az", descriptor = "(FFFF)V", line = 85)
	void method26333(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloat287 = arg0;
		this.aFloat286 = arg1;
		this.aFloat285 = arg2;
		this.aFloat288 = arg3;
	}

	@OriginalMember(owner = "client!mx", name = "al", descriptor = "(FFFF)V", line = 85)
	void method26334(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloat287 = arg0;
		this.aFloat286 = arg1;
		this.aFloat285 = arg2;
		this.aFloat288 = arg3;
	}

	@OriginalMember(owner = "client!mx", name = "u", descriptor = "(Lclient!mx;)V", line = 92)
	public void method26315(@OriginalArg(0) Class335 arg0) {
		this.aFloat287 = arg0.aFloat287;
		this.aFloat286 = arg0.aFloat286;
		this.aFloat285 = arg0.aFloat285;
		this.aFloat288 = arg0.aFloat288;
	}

	@OriginalMember(owner = "client!mx", name = "ap", descriptor = "(Lclient!mx;)V", line = 92)
	public void method26336(@OriginalArg(0) Class335 arg0) {
		this.aFloat287 = arg0.aFloat287;
		this.aFloat286 = arg0.aFloat286;
		this.aFloat285 = arg0.aFloat285;
		this.aFloat288 = arg0.aFloat288;
	}

	@OriginalMember(owner = "client!mx", name = "ao", descriptor = "(Lclient!mx;)V", line = 92)
	public void method26337(@OriginalArg(0) Class335 arg0) {
		this.aFloat287 = arg0.aFloat287;
		this.aFloat286 = arg0.aFloat286;
		this.aFloat285 = arg0.aFloat285;
		this.aFloat288 = arg0.aFloat288;
	}

	@OriginalMember(owner = "client!mx", name = "y", descriptor = "(Lclient!mh;F)V", line = 99)
	public void method26301(@OriginalArg(0) Class320 arg0, @OriginalArg(1) float arg1) {
		this.method26365(arg0.aFloat259, arg0.aFloat260, arg0.aFloat261, arg1);
	}

	@OriginalMember(owner = "client!mx", name = "ab", descriptor = "(Lclient!mh;F)V", line = 99)
	public void method26308(@OriginalArg(0) Class320 arg0, @OriginalArg(1) float arg1) {
		this.method26365(arg0.aFloat259, arg0.aFloat260, arg0.aFloat261, arg1);
	}

	@OriginalMember(owner = "client!mx", name = "au", descriptor = "(Lclient!mh;F)V", line = 99)
	public void method26338(@OriginalArg(0) Class320 arg0, @OriginalArg(1) float arg1) {
		this.method26365(arg0.aFloat259, arg0.aFloat260, arg0.aFloat261, arg1);
	}

	@OriginalMember(owner = "client!mx", name = "ay", descriptor = "(Lclient!mh;F)V", line = 99)
	public void method26339(@OriginalArg(0) Class320 arg0, @OriginalArg(1) float arg1) {
		this.method26365(arg0.aFloat259, arg0.aFloat260, arg0.aFloat261, arg1);
	}

	@OriginalMember(owner = "client!mx", name = "ag", descriptor = "(FFFF)V", line = 103)
	public void method26362(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(6) float local6 = (float) Math.sin((double) (arg3 * 0.5F));
		@Pc(13) float local13 = (float) Math.cos((double) (arg3 * 0.5F));
		this.aFloat287 = arg0 * local6;
		this.aFloat286 = arg1 * local6;
		this.aFloat285 = arg2 * local6;
		this.aFloat288 = local13;
	}

	@OriginalMember(owner = "client!mx", name = "b", descriptor = "(FFFF)V", line = 103)
	public void method26365(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(6) float local6 = (float) Math.sin((double) (arg3 * 0.5F));
		@Pc(13) float local13 = (float) Math.cos((double) (arg3 * 0.5F));
		this.aFloat287 = arg0 * local6;
		this.aFloat286 = arg1 * local6;
		this.aFloat285 = arg2 * local6;
		this.aFloat288 = local13;
	}

	@OriginalMember(owner = "client!mx", name = "c", descriptor = "(FFF)V", line = 112)
	public void method26303(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method26365(0.0F, 1.0F, 0.0F, arg0);
		@Pc(7) Class335 local7 = method26300();
		local7.method26365(1.0F, 0.0F, 0.0F, arg1);
		this.method26312(local7);
		local7.method26365(0.0F, 0.0F, 1.0F, arg2);
		this.method26312(local7);
		local7.method26293();
	}

	@OriginalMember(owner = "client!mx", name = "am", descriptor = "(FFF)V", line = 112)
	public void method26341(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method26365(0.0F, 1.0F, 0.0F, arg0);
		@Pc(7) Class335 local7 = method26300();
		local7.method26365(1.0F, 0.0F, 0.0F, arg1);
		this.method26312(local7);
		local7.method26365(0.0F, 0.0F, 1.0F, arg2);
		this.method26312(local7);
		local7.method26293();
	}

	@OriginalMember(owner = "client!mx", name = "ar", descriptor = "(FFF)V", line = 112)
	public void method26342(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method26365(0.0F, 1.0F, 0.0F, arg0);
		@Pc(7) Class335 local7 = method26300();
		local7.method26365(1.0F, 0.0F, 0.0F, arg1);
		this.method26312(local7);
		local7.method26365(0.0F, 0.0F, 1.0F, arg2);
		this.method26312(local7);
		local7.method26293();
	}

	@OriginalMember(owner = "client!mx", name = "ae", descriptor = "(FFF)V", line = 112)
	public void method26343(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method26365(0.0F, 1.0F, 0.0F, arg0);
		@Pc(7) Class335 local7 = method26300();
		local7.method26365(1.0F, 0.0F, 0.0F, arg1);
		this.method26312(local7);
		local7.method26365(0.0F, 0.0F, 1.0F, arg2);
		this.method26312(local7);
		local7.method26293();
	}

	@OriginalMember(owner = "client!mx", name = "ad", descriptor = "(FFF)V", line = 112)
	public void method26344(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method26365(0.0F, 1.0F, 0.0F, arg0);
		@Pc(7) Class335 local7 = method26300();
		local7.method26365(1.0F, 0.0F, 0.0F, arg1);
		this.method26312(local7);
		local7.method26365(0.0F, 0.0F, 1.0F, arg2);
		this.method26312(local7);
		local7.method26293();
	}

	@OriginalMember(owner = "client!mx", name = "aw", descriptor = "(FFF)V", line = 112)
	public void method26368(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method26365(0.0F, 1.0F, 0.0F, arg0);
		@Pc(7) Class335 local7 = method26300();
		local7.method26365(1.0F, 0.0F, 0.0F, arg1);
		this.method26312(local7);
		local7.method26365(0.0F, 0.0F, 1.0F, arg2);
		this.method26312(local7);
		local7.method26293();
	}

	@OriginalMember(owner = "client!mx", name = "z", descriptor = "()V", line = 122)
	final void method26297() {
		this.aFloat285 = 0.0F;
		this.aFloat286 = 0.0F;
		this.aFloat287 = 0.0F;
		this.aFloat288 = 1.0F;
	}

	@OriginalMember(owner = "client!mx", name = "ac", descriptor = "()V", line = 122)
	final void method26346() {
		this.aFloat285 = 0.0F;
		this.aFloat286 = 0.0F;
		this.aFloat287 = 0.0F;
		this.aFloat288 = 1.0F;
	}

	@OriginalMember(owner = "client!mx", name = "bw", descriptor = "()V", line = 122)
	final void method26347() {
		this.aFloat285 = 0.0F;
		this.aFloat286 = 0.0F;
		this.aFloat287 = 0.0F;
		this.aFloat288 = 1.0F;
	}

	@OriginalMember(owner = "client!mx", name = "j", descriptor = "()V", line = 129)
	final void method26304() {
		this.aFloat287 = -this.aFloat287;
		this.aFloat286 = -this.aFloat286;
		this.aFloat285 = -this.aFloat285;
		this.aFloat288 = -this.aFloat288;
	}

	@OriginalMember(owner = "client!mx", name = "bp", descriptor = "()V", line = 129)
	final void method26348() {
		this.aFloat287 = -this.aFloat287;
		this.aFloat286 = -this.aFloat286;
		this.aFloat285 = -this.aFloat285;
		this.aFloat288 = -this.aFloat288;
	}

	@OriginalMember(owner = "client!mx", name = "bd", descriptor = "()V", line = 129)
	final void method26349() {
		this.aFloat287 = -this.aFloat287;
		this.aFloat286 = -this.aFloat286;
		this.aFloat285 = -this.aFloat285;
		this.aFloat288 = -this.aFloat288;
	}

	@OriginalMember(owner = "client!mx", name = "bs", descriptor = "()V", line = 129)
	final void method26350() {
		this.aFloat287 = -this.aFloat287;
		this.aFloat286 = -this.aFloat286;
		this.aFloat285 = -this.aFloat285;
		this.aFloat288 = -this.aFloat288;
	}

	@OriginalMember(owner = "client!mx", name = "bm", descriptor = "()V", line = 136)
	public final void method26329() {
		this.aFloat287 = -this.aFloat287;
		this.aFloat286 = -this.aFloat286;
		this.aFloat285 = -this.aFloat285;
	}

	@OriginalMember(owner = "client!mx", name = "n", descriptor = "()V", line = 136)
	public final void method26351() {
		this.aFloat287 = -this.aFloat287;
		this.aFloat286 = -this.aFloat286;
		this.aFloat285 = -this.aFloat285;
	}

	@OriginalMember(owner = "client!mx", name = "bf", descriptor = "()V", line = 136)
	public final void method26356() {
		this.aFloat287 = -this.aFloat287;
		this.aFloat286 = -this.aFloat286;
		this.aFloat285 = -this.aFloat285;
	}

	@OriginalMember(owner = "client!mx", name = "e", descriptor = "(Lclient!mx;)Lclient!mx;", line = 142)
	public static final Class335 method26306(@OriginalArg(0) Class335 arg0) {
		@Pc(2) Class335 local2 = method26295(arg0);
		local2.method26351();
		return local2;
	}

	@OriginalMember(owner = "client!mx", name = "bt", descriptor = "(Lclient!mx;)Lclient!mx;", line = 142)
	public static final Class335 method26353(@OriginalArg(0) Class335 arg0) {
		@Pc(2) Class335 local2 = method26295(arg0);
		local2.method26351();
		return local2;
	}

	@OriginalMember(owner = "client!mx", name = "bk", descriptor = "(Lclient!mx;)Lclient!mx;", line = 142)
	public static final Class335 method26354(@OriginalArg(0) Class335 arg0) {
		@Pc(2) Class335 local2 = method26295(arg0);
		local2.method26351();
		return local2;
	}

	@OriginalMember(owner = "client!mx", name = "r", descriptor = "()V", line = 148)
	public final void method26298() {
		@Pc(4) float local4 = 1.0F / method26361(this);
		this.aFloat287 *= local4;
		this.aFloat286 *= local4;
		this.aFloat285 *= local4;
		this.aFloat288 *= local4;
	}

	@OriginalMember(owner = "client!mx", name = "d", descriptor = "(Lclient!mx;)V", line = 156)
	final void method26310(@OriginalArg(0) Class335 arg0) {
		this.aFloat287 += arg0.aFloat287;
		this.aFloat286 += arg0.aFloat286;
		this.aFloat285 += arg0.aFloat285;
		this.aFloat288 += arg0.aFloat288;
	}

	@OriginalMember(owner = "client!mx", name = "bg", descriptor = "(Lclient!mx;)V", line = 156)
	final void method26317(@OriginalArg(0) Class335 arg0) {
		this.aFloat287 += arg0.aFloat287;
		this.aFloat286 += arg0.aFloat286;
		this.aFloat285 += arg0.aFloat285;
		this.aFloat288 += arg0.aFloat288;
	}

	@OriginalMember(owner = "client!mx", name = "bb", descriptor = "(Lclient!mx;)V", line = 156)
	final void method26335(@OriginalArg(0) Class335 arg0) {
		this.aFloat287 += arg0.aFloat287;
		this.aFloat286 += arg0.aFloat286;
		this.aFloat285 += arg0.aFloat285;
		this.aFloat288 += arg0.aFloat288;
	}

	@OriginalMember(owner = "client!mx", name = "br", descriptor = "(Lclient!mx;)V", line = 156)
	final void method26355(@OriginalArg(0) Class335 arg0) {
		this.aFloat287 += arg0.aFloat287;
		this.aFloat286 += arg0.aFloat286;
		this.aFloat285 += arg0.aFloat285;
		this.aFloat288 += arg0.aFloat288;
	}

	@OriginalMember(owner = "client!mx", name = "q", descriptor = "(Lclient!mx;)F", line = 163)
	final float method26309(@OriginalArg(0) Class335 arg0) {
		return this.aFloat287 * arg0.aFloat287 + this.aFloat286 * arg0.aFloat286 + this.aFloat285 * arg0.aFloat285 + this.aFloat288 * arg0.aFloat288;
	}

	@OriginalMember(owner = "client!mx", name = "bl", descriptor = "(Lclient!mx;)F", line = 163)
	final float method26340(@OriginalArg(0) Class335 arg0) {
		return this.aFloat287 * arg0.aFloat287 + this.aFloat286 * arg0.aFloat286 + this.aFloat285 * arg0.aFloat285 + this.aFloat288 * arg0.aFloat288;
	}

	@OriginalMember(owner = "client!mx", name = "by", descriptor = "(Lclient!mx;)F", line = 163)
	final float method26357(@OriginalArg(0) Class335 arg0) {
		return this.aFloat287 * arg0.aFloat287 + this.aFloat286 * arg0.aFloat286 + this.aFloat285 * arg0.aFloat285 + this.aFloat288 * arg0.aFloat288;
	}

	@OriginalMember(owner = "client!mx", name = "bi", descriptor = "(Lclient!mx;)F", line = 163)
	final float method26359(@OriginalArg(0) Class335 arg0) {
		return this.aFloat287 * arg0.aFloat287 + this.aFloat286 * arg0.aFloat286 + this.aFloat285 * arg0.aFloat285 + this.aFloat288 * arg0.aFloat288;
	}

	@OriginalMember(owner = "client!mx", name = "m", descriptor = "(Lclient!mx;Lclient!mx;)F", line = 167)
	static final float method26292(@OriginalArg(0) Class335 arg0, @OriginalArg(1) Class335 arg1) {
		return arg0.method26309(arg1);
	}

	@OriginalMember(owner = "client!mx", name = "bu", descriptor = "(Lclient!mx;Lclient!mx;)F", line = 167)
	static final float method26358(@OriginalArg(0) Class335 arg0, @OriginalArg(1) Class335 arg1) {
		return arg0.method26309(arg1);
	}

	@OriginalMember(owner = "client!mx", name = "ba", descriptor = "(Lclient!mx;)F", line = 171)
	static final float method26302(@OriginalArg(0) Class335 arg0) {
		return (float) Math.sqrt((double) method26292(arg0, arg0));
	}

	@OriginalMember(owner = "client!mx", name = "bo", descriptor = "(Lclient!mx;)F", line = 171)
	static final float method26345(@OriginalArg(0) Class335 arg0) {
		return (float) Math.sqrt((double) method26292(arg0, arg0));
	}

	@OriginalMember(owner = "client!mx", name = "v", descriptor = "(Lclient!mx;)F", line = 171)
	static final float method26361(@OriginalArg(0) Class335 arg0) {
		return (float) Math.sqrt((double) method26292(arg0, arg0));
	}

	@OriginalMember(owner = "client!mx", name = "be", descriptor = "(Lclient!mx;)V", line = 175)
	public final void method26305(@OriginalArg(0) Class335 arg0) {
		this.method26299(arg0.aFloat288 * this.aFloat287 + arg0.aFloat287 * this.aFloat288 + arg0.aFloat286 * this.aFloat285 - arg0.aFloat285 * this.aFloat286, arg0.aFloat288 * this.aFloat286 - arg0.aFloat287 * this.aFloat285 + arg0.aFloat286 * this.aFloat288 + arg0.aFloat285 * this.aFloat287, arg0.aFloat288 * this.aFloat285 + arg0.aFloat287 * this.aFloat286 - arg0.aFloat286 * this.aFloat287 + arg0.aFloat285 * this.aFloat288, arg0.aFloat288 * this.aFloat288 - arg0.aFloat287 * this.aFloat287 - arg0.aFloat286 * this.aFloat286 - arg0.aFloat285 * this.aFloat285);
	}

	@OriginalMember(owner = "client!mx", name = "t", descriptor = "(Lclient!mx;)V", line = 175)
	public final void method26312(@OriginalArg(0) Class335 arg0) {
		this.method26299(arg0.aFloat288 * this.aFloat287 + arg0.aFloat287 * this.aFloat288 + arg0.aFloat286 * this.aFloat285 - arg0.aFloat285 * this.aFloat286, arg0.aFloat288 * this.aFloat286 - arg0.aFloat287 * this.aFloat285 + arg0.aFloat286 * this.aFloat288 + arg0.aFloat285 * this.aFloat287, arg0.aFloat288 * this.aFloat285 + arg0.aFloat287 * this.aFloat286 - arg0.aFloat286 * this.aFloat287 + arg0.aFloat285 * this.aFloat288, arg0.aFloat288 * this.aFloat288 - arg0.aFloat287 * this.aFloat287 - arg0.aFloat286 * this.aFloat286 - arg0.aFloat285 * this.aFloat285);
	}

	@OriginalMember(owner = "client!mx", name = "bc", descriptor = "(Lclient!mx;)V", line = 175)
	public final void method26363(@OriginalArg(0) Class335 arg0) {
		this.method26299(arg0.aFloat288 * this.aFloat287 + arg0.aFloat287 * this.aFloat288 + arg0.aFloat286 * this.aFloat285 - arg0.aFloat285 * this.aFloat286, arg0.aFloat288 * this.aFloat286 - arg0.aFloat287 * this.aFloat285 + arg0.aFloat286 * this.aFloat288 + arg0.aFloat285 * this.aFloat287, arg0.aFloat288 * this.aFloat285 + arg0.aFloat287 * this.aFloat286 - arg0.aFloat286 * this.aFloat287 + arg0.aFloat285 * this.aFloat288, arg0.aFloat288 * this.aFloat288 - arg0.aFloat287 * this.aFloat287 - arg0.aFloat286 * this.aFloat286 - arg0.aFloat285 * this.aFloat285);
	}

	@OriginalMember(owner = "client!mx", name = "bn", descriptor = "(Lclient!mx;)V", line = 175)
	public final void method26364(@OriginalArg(0) Class335 arg0) {
		this.method26299(arg0.aFloat288 * this.aFloat287 + arg0.aFloat287 * this.aFloat288 + arg0.aFloat286 * this.aFloat285 - arg0.aFloat285 * this.aFloat286, arg0.aFloat288 * this.aFloat286 - arg0.aFloat287 * this.aFloat285 + arg0.aFloat286 * this.aFloat288 + arg0.aFloat285 * this.aFloat287, arg0.aFloat288 * this.aFloat285 + arg0.aFloat287 * this.aFloat286 - arg0.aFloat286 * this.aFloat287 + arg0.aFloat285 * this.aFloat288, arg0.aFloat288 * this.aFloat288 - arg0.aFloat287 * this.aFloat287 - arg0.aFloat286 * this.aFloat286 - arg0.aFloat285 * this.aFloat285);
	}

	@OriginalMember(owner = "client!mx", name = "bx", descriptor = "(Lclient!mx;)V", line = 175)
	public final void method26366(@OriginalArg(0) Class335 arg0) {
		this.method26299(arg0.aFloat288 * this.aFloat287 + arg0.aFloat287 * this.aFloat288 + arg0.aFloat286 * this.aFloat285 - arg0.aFloat285 * this.aFloat286, arg0.aFloat288 * this.aFloat286 - arg0.aFloat287 * this.aFloat285 + arg0.aFloat286 * this.aFloat288 + arg0.aFloat285 * this.aFloat287, arg0.aFloat288 * this.aFloat285 + arg0.aFloat287 * this.aFloat286 - arg0.aFloat286 * this.aFloat287 + arg0.aFloat285 * this.aFloat288, arg0.aFloat288 * this.aFloat288 - arg0.aFloat287 * this.aFloat287 - arg0.aFloat286 * this.aFloat286 - arg0.aFloat285 * this.aFloat285);
	}

	@OriginalMember(owner = "client!mx", name = "w", descriptor = "(Lclient!mx;Lclient!mx;)Lclient!mx;", line = 179)
	static final Class335 method26313(@OriginalArg(0) Class335 arg0, @OriginalArg(1) Class335 arg1) {
		@Pc(2) Class335 local2 = method26295(arg0);
		local2.method26312(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!mx", name = "bh", descriptor = "(Lclient!mx;Lclient!mx;)Lclient!mx;", line = 179)
	static final Class335 method26367(@OriginalArg(0) Class335 arg0, @OriginalArg(1) Class335 arg1) {
		@Pc(2) Class335 local2 = method26295(arg0);
		local2.method26312(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!mx", name = "o", descriptor = "(F)V", line = 185)
	final void method26314(@OriginalArg(0) float arg0) {
		this.aFloat287 *= arg0;
		this.aFloat286 *= arg0;
		this.aFloat285 *= arg0;
		this.aFloat288 *= arg0;
	}

	@OriginalMember(owner = "client!mx", name = "bj", descriptor = "(Lclient!mx;F)Lclient!mx;", line = 192)
	static final Class335 method26320(@OriginalArg(0) Class335 arg0, @OriginalArg(1) float arg1) {
		@Pc(2) Class335 local2 = method26295(arg0);
		local2.method26314(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!mx", name = "i", descriptor = "(Lclient!mx;F)Lclient!mx;", line = 192)
	static final Class335 method26330(@OriginalArg(0) Class335 arg0, @OriginalArg(1) float arg1) {
		@Pc(2) Class335 local2 = method26295(arg0);
		local2.method26314(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!mx", name = "f", descriptor = "(Lclient!mx;F)V", line = 198)
	public final void method26316(@OriginalArg(0) Class335 arg0, @OriginalArg(1) float arg1) {
		if (this.method26309(arg0) < 0.0F) {
			this.method26304();
		}
		this.method26314(1.0F - arg1);
		@Pc(16) Class335 local16 = method26330(arg0, arg1);
		this.method26310(local16);
		local16.method26293();
		this.method26298();
	}

	@OriginalMember(owner = "client!mx", name = "bq", descriptor = "(Lclient!mx;F)V", line = 198)
	public final void method26369(@OriginalArg(0) Class335 arg0, @OriginalArg(1) float arg1) {
		if (this.method26309(arg0) < 0.0F) {
			this.method26304();
		}
		this.method26314(1.0F - arg1);
		@Pc(16) Class335 local16 = method26330(arg0, arg1);
		this.method26310(local16);
		local16.method26293();
		this.method26298();
	}

	@OriginalMember(owner = "client!mx", name = "toString", descriptor = "()Ljava/lang/String;", line = 208)
	@Override
	public String toString() {
		return this.aFloat287 + "," + this.aFloat286 + "," + this.aFloat285 + "," + this.aFloat288;
	}

	@OriginalMember(owner = "client!mx", name = "ox", descriptor = "()Ljava/lang/String;", line = 208)
	public String method26318() {
		return this.aFloat287 + "," + this.aFloat286 + "," + this.aFloat285 + "," + this.aFloat288;
	}

	@OriginalMember(owner = "client!mx", name = "ou", descriptor = "()Ljava/lang/String;", line = 208)
	public String method26319() {
		return this.aFloat287 + "," + this.aFloat286 + "," + this.aFloat285 + "," + this.aFloat288;
	}
}
