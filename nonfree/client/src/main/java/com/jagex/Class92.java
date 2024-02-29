package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public abstract class Class92 {

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "()V", line = 4)
	Class92() {
	}

	@OriginalMember(owner = "client!dn", name = "p", descriptor = "(Lclient!hg;B)V", line = 14)
	public static void method23484(@OriginalArg(0) Class298 arg0) {
		Class310.aClass298_1 = arg0;
	}

	@OriginalMember(owner = "client!dn", name = "p", descriptor = "(II)Lclient!iz;", line = 14)
	static Class336 method23485(@OriginalArg(0) int arg0) {
		if (arg0 == Class336.aClass336_3.anInt4131 * 1876983303) {
			return Class336.aClass336_3;
		} else if (Class336.aClass336_5.anInt4131 * 1876983303 == arg0) {
			return Class336.aClass336_5;
		} else if (Class336.aClass336_4.anInt4131 * 1876983303 == arg0) {
			return Class336.aClass336_4;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dn", name = "al", descriptor = "(II)V", line = 182)
	static void method23486(@OriginalArg(0) int arg0) {
		Class93.anInt731 = arg0 * 1517932627;
		Class77_Sub42_Sub2.aClass77_Sub42_Sub2Array1 = new Class77_Sub42_Sub2[arg0];
		Class77_Sub1_Sub3.anInt285 = 0;
	}

	@OriginalMember(owner = "client!dn", name = "hg", descriptor = "(Lclient!yf;I)V", line = 5859)
	static final void method23487(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class462.method29540(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!dn", name = "jg", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;B)V", line = 6187)
	static final void method23488(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg0.anInt3877 = arg2.anIntArray536[(arg2.anInt5784 -= 308999563) * 2088438307] * 36724065;
		arg0.anInt3918 = arg2.anIntArray536[(arg2.anInt5784 -= 308999563) * 2088438307] * -727149769;
	}

	@OriginalMember(owner = "client!dn", name = "wl", descriptor = "(Lclient!yf;B)V", line = 8556)
	static final void method23489(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 1235998252;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(33) int local33 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		@Pc(43) int local43 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 3];
		@Pc(49) int local49 = local13 + (local23 << 14);
		@Pc(55) int local55 = local49 + (local33 << 28);
		@Pc(59) int local59 = local55 + local43;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local59;
	}

	@OriginalMember(owner = "client!dn", name = "ayp", descriptor = "(Lclient!kw;I)Lclient!cq;", line = 13541)
	static Interface18 method23490(@OriginalArg(0) Class368 arg0) {
		return new Class675(arg0);
	}

	@OriginalMember(owner = "client!dn", name = "p", descriptor = "()I")
	public abstract int method23491();

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "()Z")
	abstract boolean method23492();

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "()I")
	public abstract int method23493();

	@OriginalMember(owner = "client!dn", name = "s", descriptor = "()Z")
	abstract boolean method23494();

	@OriginalMember(owner = "client!dn", name = "r", descriptor = "()Z")
	abstract boolean method23495();

	@OriginalMember(owner = "client!dn", name = "y", descriptor = "()Z")
	abstract boolean method23496();

	@OriginalMember(owner = "client!dn", name = "w", descriptor = "()I")
	public abstract int method23497();

	@OriginalMember(owner = "client!dn", name = "t", descriptor = "()I")
	public abstract int method23498();

	@OriginalMember(owner = "client!dn", name = "q", descriptor = "()I")
	public abstract int method23499();

	@OriginalMember(owner = "client!dn", name = "x", descriptor = "()Z")
	abstract boolean method23500();

	@OriginalMember(owner = "client!dn", name = "u", descriptor = "()V")
	public abstract void method23501();

	@OriginalMember(owner = "client!dn", name = "i", descriptor = "()V")
	public abstract void method23502();

	@OriginalMember(owner = "client!dn", name = "g", descriptor = "()Z")
	abstract boolean method23503();

	@OriginalMember(owner = "client!dn", name = "z", descriptor = "()Z")
	abstract boolean method23504();

	@OriginalMember(owner = "client!dn", name = "j", descriptor = "()Z")
	abstract boolean method23505();

	@OriginalMember(owner = "client!dn", name = "v", descriptor = "()V")
	public abstract void method23506();

	@OriginalMember(owner = "client!dn", name = "k", descriptor = "()V")
	public abstract void method23507();

	@OriginalMember(owner = "client!dn", name = "l", descriptor = "()Z")
	abstract boolean method23508();
}
