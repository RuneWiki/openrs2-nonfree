package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ot")
public final class Class452 {

	@OriginalMember(owner = "client!ot", name = "v", descriptor = "I")
	static int anInt4956;

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "I")
	static int anInt4957;

	@OriginalMember(owner = "client!ot", name = "p", descriptor = "[Lclient!ot;")
	static Class452[] aClass452Array1 = new Class452[0];

	@OriginalMember(owner = "client!ot", name = "q", descriptor = "F")
	public float aFloat283;

	@OriginalMember(owner = "client!ot", name = "l", descriptor = "F")
	public float aFloat284;

	@OriginalMember(owner = "client!ot", name = "y", descriptor = "F")
	public float aFloat285;

	@OriginalMember(owner = "client!ot", name = "t", descriptor = "F")
	public float aFloat286;

	static {
		new Class452();
	}

	@OriginalMember(owner = "client!ot", name = "p", descriptor = "(I)V", line = 20)
	public static void method29266(@OriginalArg(0) int arg0) {
		anInt4957 = arg0;
		aClass452Array1 = new Class452[arg0];
		anInt4956 = 0;
	}

	@OriginalMember(owner = "client!ot", name = "h", descriptor = "(I)V", line = 20)
	public static void method29267(@OriginalArg(0) int arg0) {
		anInt4957 = arg0;
		aClass452Array1 = new Class452[arg0];
		anInt4956 = 0;
	}

	@OriginalMember(owner = "client!ot", name = "aj", descriptor = "(I)V", line = 20)
	public static void method29268(@OriginalArg(0) int arg0) {
		anInt4957 = arg0;
		aClass452Array1 = new Class452[arg0];
		anInt4956 = 0;
	}

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "()Lclient!ot;", line = 26)
	public static Class452 method29269() {
		@Pc(2) Class452[] local2 = aClass452Array1;
		synchronized (aClass452Array1) {
			if (anInt4956 == 0) {
				return new Class452();
			} else {
				aClass452Array1[--anInt4956].method29297();
				return aClass452Array1[anInt4956];
			}
		}
	}

	@OriginalMember(owner = "client!ot", name = "ai", descriptor = "()Lclient!ot;", line = 26)
	public static Class452 method29270() {
		@Pc(2) Class452[] local2 = aClass452Array1;
		synchronized (aClass452Array1) {
			if (anInt4956 == 0) {
				return new Class452();
			} else {
				aClass452Array1[--anInt4956].method29297();
				return aClass452Array1[anInt4956];
			}
		}
	}

	@OriginalMember(owner = "client!ot", name = "v", descriptor = "(FFFF)Lclient!ot;", line = 36)
	static Class452 method29271(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(2) Class452[] local2 = aClass452Array1;
		synchronized (aClass452Array1) {
			if (anInt4956 == 0) {
				return new Class452(arg0, arg1, arg2, arg3);
			} else {
				aClass452Array1[--anInt4956].method29285(arg0, arg1, arg2, arg3);
				return aClass452Array1[anInt4956];
			}
		}
	}

	@OriginalMember(owner = "client!ot", name = "al", descriptor = "(FFFF)Lclient!ot;", line = 36)
	static Class452 method29272(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(2) Class452[] local2 = aClass452Array1;
		synchronized (aClass452Array1) {
			if (anInt4956 == 0) {
				return new Class452(arg0, arg1, arg2, arg3);
			} else {
				aClass452Array1[--anInt4956].method29285(arg0, arg1, arg2, arg3);
				return aClass452Array1[anInt4956];
			}
		}
	}

	@OriginalMember(owner = "client!ot", name = "ag", descriptor = "(FFFF)Lclient!ot;", line = 36)
	static Class452 method29273(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(2) Class452[] local2 = aClass452Array1;
		synchronized (aClass452Array1) {
			if (anInt4956 == 0) {
				return new Class452(arg0, arg1, arg2, arg3);
			} else {
				aClass452Array1[--anInt4956].method29285(arg0, arg1, arg2, arg3);
				return aClass452Array1[anInt4956];
			}
		}
	}

	@OriginalMember(owner = "client!ot", name = "ao", descriptor = "(Lclient!ot;)Lclient!ot;", line = 46)
	public static Class452 method29274(@OriginalArg(0) Class452 arg0) {
		@Pc(2) Class452[] local2 = aClass452Array1;
		synchronized (aClass452Array1) {
			if (anInt4956 == 0) {
				return new Class452(arg0);
			} else {
				aClass452Array1[--anInt4956].method29286(arg0);
				return aClass452Array1[anInt4956];
			}
		}
	}

	@OriginalMember(owner = "client!ot", name = "ak", descriptor = "(Lclient!ot;)Lclient!ot;", line = 46)
	public static Class452 method29275(@OriginalArg(0) Class452 arg0) {
		@Pc(2) Class452[] local2 = aClass452Array1;
		synchronized (aClass452Array1) {
			if (anInt4956 == 0) {
				return new Class452(arg0);
			} else {
				aClass452Array1[--anInt4956].method29286(arg0);
				return aClass452Array1[anInt4956];
			}
		}
	}

	@OriginalMember(owner = "client!ot", name = "l", descriptor = "(Lclient!ot;)Lclient!ot;", line = 46)
	public static Class452 method29276(@OriginalArg(0) Class452 arg0) {
		@Pc(2) Class452[] local2 = aClass452Array1;
		synchronized (aClass452Array1) {
			if (anInt4956 == 0) {
				return new Class452(arg0);
			} else {
				aClass452Array1[--anInt4956].method29286(arg0);
				return aClass452Array1[anInt4956];
			}
		}
	}

	@OriginalMember(owner = "client!ot", name = "y", descriptor = "()V", line = 56)
	public void method29277() {
		@Pc(2) Class452[] local2 = aClass452Array1;
		synchronized (aClass452Array1) {
			if (anInt4956 < anInt4957 - 1) {
				aClass452Array1[anInt4956++] = this;
			}
		}
	}

	@OriginalMember(owner = "client!ot", name = "au", descriptor = "()V", line = 56)
	public void method29278() {
		@Pc(2) Class452[] local2 = aClass452Array1;
		synchronized (aClass452Array1) {
			if (anInt4956 < anInt4957 - 1) {
				aClass452Array1[anInt4956++] = this;
			}
		}
	}

	@OriginalMember(owner = "client!ot", name = "ax", descriptor = "()V", line = 56)
	public void method29279() {
		@Pc(2) Class452[] local2 = aClass452Array1;
		synchronized (aClass452Array1) {
			if (anInt4956 < anInt4957 - 1) {
				aClass452Array1[anInt4956++] = this;
			}
		}
	}

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "()V", line = 61)
	public Class452() {
		this.method29297();
	}

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(FFFF)V", line = 65)
	public Class452(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.method29285(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lclient!ot;)V", line = 69)
	public Class452(@OriginalArg(0) Class452 arg0) {
		this.method29286(arg0);
	}

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(FFF)V", line = 73)
	public Class452(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method29295(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ot", name = "w", descriptor = "(Lclient!akv;)V", line = 78)
	public void method29280(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aFloat284 = arg0.method22517();
		this.aFloat286 = arg0.method22517();
		this.aFloat285 = arg0.method22517();
		this.aFloat283 = arg0.method22517();
	}

	@OriginalMember(owner = "client!ot", name = "ar", descriptor = "(Lclient!akv;)V", line = 78)
	public void method29281(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aFloat284 = arg0.method22517();
		this.aFloat286 = arg0.method22517();
		this.aFloat285 = arg0.method22517();
		this.aFloat283 = arg0.method22517();
	}

	@OriginalMember(owner = "client!ot", name = "ad", descriptor = "(Lclient!akv;)V", line = 78)
	public void method29282(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aFloat284 = arg0.method22517();
		this.aFloat286 = arg0.method22517();
		this.aFloat285 = arg0.method22517();
		this.aFloat283 = arg0.method22517();
	}

	@OriginalMember(owner = "client!ot", name = "ac", descriptor = "(FFFF)V", line = 85)
	void method29283(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloat284 = arg0;
		this.aFloat286 = arg1;
		this.aFloat285 = arg2;
		this.aFloat283 = arg3;
	}

	@OriginalMember(owner = "client!ot", name = "av", descriptor = "(FFFF)V", line = 85)
	void method29284(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloat284 = arg0;
		this.aFloat286 = arg1;
		this.aFloat285 = arg2;
		this.aFloat283 = arg3;
	}

	@OriginalMember(owner = "client!ot", name = "t", descriptor = "(FFFF)V", line = 85)
	void method29285(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aFloat284 = arg0;
		this.aFloat286 = arg1;
		this.aFloat285 = arg2;
		this.aFloat283 = arg3;
	}

	@OriginalMember(owner = "client!ot", name = "q", descriptor = "(Lclient!ot;)V", line = 92)
	public void method29286(@OriginalArg(0) Class452 arg0) {
		this.aFloat284 = arg0.aFloat284;
		this.aFloat286 = arg0.aFloat286;
		this.aFloat285 = arg0.aFloat285;
		this.aFloat283 = arg0.aFloat283;
	}

	@OriginalMember(owner = "client!ot", name = "at", descriptor = "(Lclient!ot;)V", line = 92)
	public void method29287(@OriginalArg(0) Class452 arg0) {
		this.aFloat284 = arg0.aFloat284;
		this.aFloat286 = arg0.aFloat286;
		this.aFloat285 = arg0.aFloat285;
		this.aFloat283 = arg0.aFloat283;
	}

	@OriginalMember(owner = "client!ot", name = "ae", descriptor = "(Lclient!ot;)V", line = 92)
	public void method29288(@OriginalArg(0) Class452 arg0) {
		this.aFloat284 = arg0.aFloat284;
		this.aFloat286 = arg0.aFloat286;
		this.aFloat285 = arg0.aFloat285;
		this.aFloat283 = arg0.aFloat283;
	}

	@OriginalMember(owner = "client!ot", name = "ah", descriptor = "(Lclient!ot;)V", line = 92)
	public void method29289(@OriginalArg(0) Class452 arg0) {
		this.aFloat284 = arg0.aFloat284;
		this.aFloat286 = arg0.aFloat286;
		this.aFloat285 = arg0.aFloat285;
		this.aFloat283 = arg0.aFloat283;
	}

	@OriginalMember(owner = "client!ot", name = "x", descriptor = "(Lclient!oo;F)V", line = 99)
	public void method29290(@OriginalArg(0) Class447 arg0, @OriginalArg(1) float arg1) {
		this.method29292(arg0.aFloat277, arg0.aFloat276, arg0.aFloat278, arg1);
	}

	@OriginalMember(owner = "client!ot", name = "as", descriptor = "(Lclient!oo;F)V", line = 99)
	public void method29291(@OriginalArg(0) Class447 arg0, @OriginalArg(1) float arg1) {
		this.method29292(arg0.aFloat277, arg0.aFloat276, arg0.aFloat278, arg1);
	}

	@OriginalMember(owner = "client!ot", name = "d", descriptor = "(FFFF)V", line = 103)
	public void method29292(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(6) float local6 = (float) Math.sin((double) (arg3 * 0.5F));
		@Pc(13) float local13 = (float) Math.cos((double) (arg3 * 0.5F));
		this.aFloat284 = arg0 * local6;
		this.aFloat286 = arg1 * local6;
		this.aFloat285 = arg2 * local6;
		this.aFloat283 = local13;
	}

	@OriginalMember(owner = "client!ot", name = "aq", descriptor = "(FFFF)V", line = 103)
	public void method29293(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(6) float local6 = (float) Math.sin((double) (arg3 * 0.5F));
		@Pc(13) float local13 = (float) Math.cos((double) (arg3 * 0.5F));
		this.aFloat284 = arg0 * local6;
		this.aFloat286 = arg1 * local6;
		this.aFloat285 = arg2 * local6;
		this.aFloat283 = local13;
	}

	@OriginalMember(owner = "client!ot", name = "am", descriptor = "(FFF)V", line = 112)
	public void method29294(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method29292(0.0F, 1.0F, 0.0F, arg0);
		@Pc(7) Class452 local7 = method29269();
		local7.method29292(1.0F, 0.0F, 0.0F, arg1);
		this.method29330(local7);
		local7.method29292(0.0F, 0.0F, 1.0F, arg2);
		this.method29330(local7);
		local7.method29277();
	}

	@OriginalMember(owner = "client!ot", name = "s", descriptor = "(FFF)V", line = 112)
	public void method29295(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method29292(0.0F, 1.0F, 0.0F, arg0);
		@Pc(7) Class452 local7 = method29269();
		local7.method29292(1.0F, 0.0F, 0.0F, arg1);
		this.method29330(local7);
		local7.method29292(0.0F, 0.0F, 1.0F, arg2);
		this.method29330(local7);
		local7.method29277();
	}

	@OriginalMember(owner = "client!ot", name = "ay", descriptor = "(FFF)V", line = 112)
	public void method29296(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method29292(0.0F, 1.0F, 0.0F, arg0);
		@Pc(7) Class452 local7 = method29269();
		local7.method29292(1.0F, 0.0F, 0.0F, arg1);
		this.method29330(local7);
		local7.method29292(0.0F, 0.0F, 1.0F, arg2);
		this.method29330(local7);
		local7.method29277();
	}

	@OriginalMember(owner = "client!ot", name = "r", descriptor = "()V", line = 122)
	final void method29297() {
		this.aFloat285 = 0.0F;
		this.aFloat286 = 0.0F;
		this.aFloat284 = 0.0F;
		this.aFloat283 = 1.0F;
	}

	@OriginalMember(owner = "client!ot", name = "an", descriptor = "()V", line = 122)
	final void method29298() {
		this.aFloat285 = 0.0F;
		this.aFloat286 = 0.0F;
		this.aFloat284 = 0.0F;
		this.aFloat283 = 1.0F;
	}

	@OriginalMember(owner = "client!ot", name = "ab", descriptor = "()V", line = 122)
	final void method29299() {
		this.aFloat285 = 0.0F;
		this.aFloat286 = 0.0F;
		this.aFloat284 = 0.0F;
		this.aFloat283 = 1.0F;
	}

	@OriginalMember(owner = "client!ot", name = "aa", descriptor = "()V", line = 122)
	final void method29300() {
		this.aFloat285 = 0.0F;
		this.aFloat286 = 0.0F;
		this.aFloat284 = 0.0F;
		this.aFloat283 = 1.0F;
	}

	@OriginalMember(owner = "client!ot", name = "af", descriptor = "()V", line = 122)
	final void method29301() {
		this.aFloat285 = 0.0F;
		this.aFloat286 = 0.0F;
		this.aFloat284 = 0.0F;
		this.aFloat283 = 1.0F;
	}

	@OriginalMember(owner = "client!ot", name = "g", descriptor = "()V", line = 129)
	final void method29302() {
		this.aFloat284 = -this.aFloat284;
		this.aFloat286 = -this.aFloat286;
		this.aFloat285 = -this.aFloat285;
		this.aFloat283 = -this.aFloat283;
	}

	@OriginalMember(owner = "client!ot", name = "az", descriptor = "()V", line = 129)
	final void method29303() {
		this.aFloat284 = -this.aFloat284;
		this.aFloat286 = -this.aFloat286;
		this.aFloat285 = -this.aFloat285;
		this.aFloat283 = -this.aFloat283;
	}

	@OriginalMember(owner = "client!ot", name = "ap", descriptor = "()V", line = 129)
	final void method29304() {
		this.aFloat284 = -this.aFloat284;
		this.aFloat286 = -this.aFloat286;
		this.aFloat285 = -this.aFloat285;
		this.aFloat283 = -this.aFloat283;
	}

	@OriginalMember(owner = "client!ot", name = "aw", descriptor = "()V", line = 129)
	final void method29305() {
		this.aFloat284 = -this.aFloat284;
		this.aFloat286 = -this.aFloat286;
		this.aFloat285 = -this.aFloat285;
		this.aFloat283 = -this.aFloat283;
	}

	@OriginalMember(owner = "client!ot", name = "ba", descriptor = "()V", line = 136)
	public final void method29306() {
		this.aFloat284 = -this.aFloat284;
		this.aFloat286 = -this.aFloat286;
		this.aFloat285 = -this.aFloat285;
	}

	@OriginalMember(owner = "client!ot", name = "z", descriptor = "()V", line = 136)
	public final void method29307() {
		this.aFloat284 = -this.aFloat284;
		this.aFloat286 = -this.aFloat286;
		this.aFloat285 = -this.aFloat285;
	}

	@OriginalMember(owner = "client!ot", name = "bc", descriptor = "()V", line = 136)
	public final void method29308() {
		this.aFloat284 = -this.aFloat284;
		this.aFloat286 = -this.aFloat286;
		this.aFloat285 = -this.aFloat285;
	}

	@OriginalMember(owner = "client!ot", name = "bj", descriptor = "()V", line = 136)
	public final void method29309() {
		this.aFloat284 = -this.aFloat284;
		this.aFloat286 = -this.aFloat286;
		this.aFloat285 = -this.aFloat285;
	}

	@OriginalMember(owner = "client!ot", name = "bv", descriptor = "()V", line = 136)
	public final void method29310() {
		this.aFloat284 = -this.aFloat284;
		this.aFloat286 = -this.aFloat286;
		this.aFloat285 = -this.aFloat285;
	}

	@OriginalMember(owner = "client!ot", name = "bl", descriptor = "(Lclient!ot;)Lclient!ot;", line = 142)
	public static final Class452 method29311(@OriginalArg(0) Class452 arg0) {
		@Pc(2) Class452 local2 = method29276(arg0);
		local2.method29307();
		return local2;
	}

	@OriginalMember(owner = "client!ot", name = "bb", descriptor = "(Lclient!ot;)Lclient!ot;", line = 142)
	public static final Class452 method29312(@OriginalArg(0) Class452 arg0) {
		@Pc(2) Class452 local2 = method29276(arg0);
		local2.method29307();
		return local2;
	}

	@OriginalMember(owner = "client!ot", name = "j", descriptor = "(Lclient!ot;)Lclient!ot;", line = 142)
	public static final Class452 method29313(@OriginalArg(0) Class452 arg0) {
		@Pc(2) Class452 local2 = method29276(arg0);
		local2.method29307();
		return local2;
	}

	@OriginalMember(owner = "client!ot", name = "bd", descriptor = "()V", line = 148)
	public final void method29314() {
		@Pc(4) float local4 = 1.0F / method29327(this);
		this.aFloat284 *= local4;
		this.aFloat286 *= local4;
		this.aFloat285 *= local4;
		this.aFloat283 *= local4;
	}

	@OriginalMember(owner = "client!ot", name = "i", descriptor = "()V", line = 148)
	public final void method29315() {
		@Pc(4) float local4 = 1.0F / method29327(this);
		this.aFloat284 *= local4;
		this.aFloat286 *= local4;
		this.aFloat285 *= local4;
		this.aFloat283 *= local4;
	}

	@OriginalMember(owner = "client!ot", name = "by", descriptor = "()V", line = 148)
	public final void method29316() {
		@Pc(4) float local4 = 1.0F / method29327(this);
		this.aFloat284 *= local4;
		this.aFloat286 *= local4;
		this.aFloat285 *= local4;
		this.aFloat283 *= local4;
	}

	@OriginalMember(owner = "client!ot", name = "bx", descriptor = "()V", line = 148)
	public final void method29317() {
		@Pc(4) float local4 = 1.0F / method29327(this);
		this.aFloat284 *= local4;
		this.aFloat286 *= local4;
		this.aFloat285 *= local4;
		this.aFloat283 *= local4;
	}

	@OriginalMember(owner = "client!ot", name = "k", descriptor = "(Lclient!ot;)V", line = 156)
	final void method29318(@OriginalArg(0) Class452 arg0) {
		this.aFloat284 += arg0.aFloat284;
		this.aFloat286 += arg0.aFloat286;
		this.aFloat285 += arg0.aFloat285;
		this.aFloat283 += arg0.aFloat283;
	}

	@OriginalMember(owner = "client!ot", name = "bw", descriptor = "(Lclient!ot;)V", line = 156)
	final void method29319(@OriginalArg(0) Class452 arg0) {
		this.aFloat284 += arg0.aFloat284;
		this.aFloat286 += arg0.aFloat286;
		this.aFloat285 += arg0.aFloat285;
		this.aFloat283 += arg0.aFloat283;
	}

	@OriginalMember(owner = "client!ot", name = "bi", descriptor = "(Lclient!ot;)V", line = 156)
	final void method29320(@OriginalArg(0) Class452 arg0) {
		this.aFloat284 += arg0.aFloat284;
		this.aFloat286 += arg0.aFloat286;
		this.aFloat285 += arg0.aFloat285;
		this.aFloat283 += arg0.aFloat283;
	}

	@OriginalMember(owner = "client!ot", name = "u", descriptor = "(Lclient!ot;)F", line = 163)
	final float method29321(@OriginalArg(0) Class452 arg0) {
		return this.aFloat284 * arg0.aFloat284 + this.aFloat286 * arg0.aFloat286 + this.aFloat285 * arg0.aFloat285 + this.aFloat283 * arg0.aFloat283;
	}

	@OriginalMember(owner = "client!ot", name = "bs", descriptor = "(Lclient!ot;)F", line = 163)
	final float method29322(@OriginalArg(0) Class452 arg0) {
		return this.aFloat284 * arg0.aFloat284 + this.aFloat286 * arg0.aFloat286 + this.aFloat285 * arg0.aFloat285 + this.aFloat283 * arg0.aFloat283;
	}

	@OriginalMember(owner = "client!ot", name = "bg", descriptor = "(Lclient!ot;)F", line = 163)
	final float method29323(@OriginalArg(0) Class452 arg0) {
		return this.aFloat284 * arg0.aFloat284 + this.aFloat286 * arg0.aFloat286 + this.aFloat285 * arg0.aFloat285 + this.aFloat283 * arg0.aFloat283;
	}

	@OriginalMember(owner = "client!ot", name = "e", descriptor = "(Lclient!ot;Lclient!ot;)F", line = 167)
	static final float method29324(@OriginalArg(0) Class452 arg0, @OriginalArg(1) Class452 arg1) {
		return arg0.method29321(arg1);
	}

	@OriginalMember(owner = "client!ot", name = "bt", descriptor = "(Lclient!ot;Lclient!ot;)F", line = 167)
	static final float method29325(@OriginalArg(0) Class452 arg0, @OriginalArg(1) Class452 arg1) {
		return arg0.method29321(arg1);
	}

	@OriginalMember(owner = "client!ot", name = "bz", descriptor = "(Lclient!ot;)F", line = 171)
	static final float method29326(@OriginalArg(0) Class452 arg0) {
		return (float) Math.sqrt((double) method29324(arg0, arg0));
	}

	@OriginalMember(owner = "client!ot", name = "f", descriptor = "(Lclient!ot;)F", line = 171)
	static final float method29327(@OriginalArg(0) Class452 arg0) {
		return (float) Math.sqrt((double) method29324(arg0, arg0));
	}

	@OriginalMember(owner = "client!ot", name = "bu", descriptor = "(Lclient!ot;)F", line = 171)
	static final float method29328(@OriginalArg(0) Class452 arg0) {
		return (float) Math.sqrt((double) method29324(arg0, arg0));
	}

	@OriginalMember(owner = "client!ot", name = "bn", descriptor = "(Lclient!ot;)V", line = 175)
	public final void method29329(@OriginalArg(0) Class452 arg0) {
		this.method29285(arg0.aFloat283 * this.aFloat284 + arg0.aFloat284 * this.aFloat283 + arg0.aFloat286 * this.aFloat285 - arg0.aFloat285 * this.aFloat286, arg0.aFloat283 * this.aFloat286 - arg0.aFloat284 * this.aFloat285 + arg0.aFloat286 * this.aFloat283 + arg0.aFloat285 * this.aFloat284, arg0.aFloat283 * this.aFloat285 + arg0.aFloat284 * this.aFloat286 - arg0.aFloat286 * this.aFloat284 + arg0.aFloat285 * this.aFloat283, arg0.aFloat283 * this.aFloat283 - arg0.aFloat284 * this.aFloat284 - arg0.aFloat286 * this.aFloat286 - arg0.aFloat285 * this.aFloat285);
	}

	@OriginalMember(owner = "client!ot", name = "o", descriptor = "(Lclient!ot;)V", line = 175)
	public final void method29330(@OriginalArg(0) Class452 arg0) {
		this.method29285(arg0.aFloat283 * this.aFloat284 + arg0.aFloat284 * this.aFloat283 + arg0.aFloat286 * this.aFloat285 - arg0.aFloat285 * this.aFloat286, arg0.aFloat283 * this.aFloat286 - arg0.aFloat284 * this.aFloat285 + arg0.aFloat286 * this.aFloat283 + arg0.aFloat285 * this.aFloat284, arg0.aFloat283 * this.aFloat285 + arg0.aFloat284 * this.aFloat286 - arg0.aFloat286 * this.aFloat284 + arg0.aFloat285 * this.aFloat283, arg0.aFloat283 * this.aFloat283 - arg0.aFloat284 * this.aFloat284 - arg0.aFloat286 * this.aFloat286 - arg0.aFloat285 * this.aFloat285);
	}

	@OriginalMember(owner = "client!ot", name = "bp", descriptor = "(Lclient!ot;)V", line = 175)
	public final void method29331(@OriginalArg(0) Class452 arg0) {
		this.method29285(arg0.aFloat283 * this.aFloat284 + arg0.aFloat284 * this.aFloat283 + arg0.aFloat286 * this.aFloat285 - arg0.aFloat285 * this.aFloat286, arg0.aFloat283 * this.aFloat286 - arg0.aFloat284 * this.aFloat285 + arg0.aFloat286 * this.aFloat283 + arg0.aFloat285 * this.aFloat284, arg0.aFloat283 * this.aFloat285 + arg0.aFloat284 * this.aFloat286 - arg0.aFloat286 * this.aFloat284 + arg0.aFloat285 * this.aFloat283, arg0.aFloat283 * this.aFloat283 - arg0.aFloat284 * this.aFloat284 - arg0.aFloat286 * this.aFloat286 - arg0.aFloat285 * this.aFloat285);
	}

	@OriginalMember(owner = "client!ot", name = "bf", descriptor = "(Lclient!ot;)V", line = 175)
	public final void method29332(@OriginalArg(0) Class452 arg0) {
		this.method29285(arg0.aFloat283 * this.aFloat284 + arg0.aFloat284 * this.aFloat283 + arg0.aFloat286 * this.aFloat285 - arg0.aFloat285 * this.aFloat286, arg0.aFloat283 * this.aFloat286 - arg0.aFloat284 * this.aFloat285 + arg0.aFloat286 * this.aFloat283 + arg0.aFloat285 * this.aFloat284, arg0.aFloat283 * this.aFloat285 + arg0.aFloat284 * this.aFloat286 - arg0.aFloat286 * this.aFloat284 + arg0.aFloat285 * this.aFloat283, arg0.aFloat283 * this.aFloat283 - arg0.aFloat284 * this.aFloat284 - arg0.aFloat286 * this.aFloat286 - arg0.aFloat285 * this.aFloat285);
	}

	@OriginalMember(owner = "client!ot", name = "bm", descriptor = "(Lclient!ot;)V", line = 175)
	public final void method29333(@OriginalArg(0) Class452 arg0) {
		this.method29285(arg0.aFloat283 * this.aFloat284 + arg0.aFloat284 * this.aFloat283 + arg0.aFloat286 * this.aFloat285 - arg0.aFloat285 * this.aFloat286, arg0.aFloat283 * this.aFloat286 - arg0.aFloat284 * this.aFloat285 + arg0.aFloat286 * this.aFloat283 + arg0.aFloat285 * this.aFloat284, arg0.aFloat283 * this.aFloat285 + arg0.aFloat284 * this.aFloat286 - arg0.aFloat286 * this.aFloat284 + arg0.aFloat285 * this.aFloat283, arg0.aFloat283 * this.aFloat283 - arg0.aFloat284 * this.aFloat284 - arg0.aFloat286 * this.aFloat286 - arg0.aFloat285 * this.aFloat285);
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(Lclient!ot;Lclient!ot;)Lclient!ot;", line = 179)
	static final Class452 method29334(@OriginalArg(0) Class452 arg0, @OriginalArg(1) Class452 arg1) {
		@Pc(2) Class452 local2 = method29276(arg0);
		local2.method29330(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ot", name = "bo", descriptor = "(Lclient!ot;Lclient!ot;)Lclient!ot;", line = 179)
	static final Class452 method29335(@OriginalArg(0) Class452 arg0, @OriginalArg(1) Class452 arg1) {
		@Pc(2) Class452 local2 = method29276(arg0);
		local2.method29330(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ot", name = "bk", descriptor = "(F)V", line = 185)
	final void method29336(@OriginalArg(0) float arg0) {
		this.aFloat284 *= arg0;
		this.aFloat286 *= arg0;
		this.aFloat285 *= arg0;
		this.aFloat283 *= arg0;
	}

	@OriginalMember(owner = "client!ot", name = "n", descriptor = "(F)V", line = 185)
	final void method29337(@OriginalArg(0) float arg0) {
		this.aFloat284 *= arg0;
		this.aFloat286 *= arg0;
		this.aFloat285 *= arg0;
		this.aFloat283 *= arg0;
	}

	@OriginalMember(owner = "client!ot", name = "br", descriptor = "(F)V", line = 185)
	final void method29338(@OriginalArg(0) float arg0) {
		this.aFloat284 *= arg0;
		this.aFloat286 *= arg0;
		this.aFloat285 *= arg0;
		this.aFloat283 *= arg0;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lclient!ot;F)Lclient!ot;", line = 192)
	static final Class452 method29339(@OriginalArg(0) Class452 arg0, @OriginalArg(1) float arg1) {
		@Pc(2) Class452 local2 = method29276(arg0);
		local2.method29337(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ot", name = "bq", descriptor = "(Lclient!ot;F)Lclient!ot;", line = 192)
	static final Class452 method29340(@OriginalArg(0) Class452 arg0, @OriginalArg(1) float arg1) {
		@Pc(2) Class452 local2 = method29276(arg0);
		local2.method29337(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ot", name = "bh", descriptor = "(Lclient!ot;F)Lclient!ot;", line = 192)
	static final Class452 method29341(@OriginalArg(0) Class452 arg0, @OriginalArg(1) float arg1) {
		@Pc(2) Class452 local2 = method29276(arg0);
		local2.method29337(arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ot", name = "m", descriptor = "(Lclient!ot;F)V", line = 198)
	public final void method29342(@OriginalArg(0) Class452 arg0, @OriginalArg(1) float arg1) {
		if (this.method29321(arg0) < 0.0F) {
			this.method29302();
		}
		this.method29337(1.0F - arg1);
		@Pc(16) Class452 local16 = method29339(arg0, arg1);
		this.method29318(local16);
		local16.method29277();
		this.method29315();
	}

	@OriginalMember(owner = "client!ot", name = "cb", descriptor = "(Lclient!ot;F)V", line = 198)
	public final void method29343(@OriginalArg(0) Class452 arg0, @OriginalArg(1) float arg1) {
		if (this.method29321(arg0) < 0.0F) {
			this.method29302();
		}
		this.method29337(1.0F - arg1);
		@Pc(16) Class452 local16 = method29339(arg0, arg1);
		this.method29318(local16);
		local16.method29277();
		this.method29315();
	}

	@OriginalMember(owner = "client!ot", name = "be", descriptor = "(Lclient!ot;F)V", line = 198)
	public final void method29344(@OriginalArg(0) Class452 arg0, @OriginalArg(1) float arg1) {
		if (this.method29321(arg0) < 0.0F) {
			this.method29302();
		}
		this.method29337(1.0F - arg1);
		@Pc(16) Class452 local16 = method29339(arg0, arg1);
		this.method29318(local16);
		local16.method29277();
		this.method29315();
	}

	@OriginalMember(owner = "client!ot", name = "cg", descriptor = "(Lclient!ot;F)V", line = 198)
	public final void method29345(@OriginalArg(0) Class452 arg0, @OriginalArg(1) float arg1) {
		if (this.method29321(arg0) < 0.0F) {
			this.method29302();
		}
		this.method29337(1.0F - arg1);
		@Pc(16) Class452 local16 = method29339(arg0, arg1);
		this.method29318(local16);
		local16.method29277();
		this.method29315();
	}

	@OriginalMember(owner = "client!ot", name = "toString", descriptor = "()Ljava/lang/String;", line = 208)
	@Override
	public String toString() {
		return this.aFloat284 + "," + this.aFloat286 + "," + this.aFloat285 + "," + this.aFloat283;
	}

	@OriginalMember(owner = "client!ot", name = "rs", descriptor = "()Ljava/lang/String;", line = 208)
	public String method29346() {
		return this.aFloat284 + "," + this.aFloat286 + "," + this.aFloat285 + "," + this.aFloat283;
	}

	@OriginalMember(owner = "client!ot", name = "ro", descriptor = "()Ljava/lang/String;", line = 208)
	public String method29347() {
		return this.aFloat284 + "," + this.aFloat286 + "," + this.aFloat285 + "," + this.aFloat283;
	}
}
