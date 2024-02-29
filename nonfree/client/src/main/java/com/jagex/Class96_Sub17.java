package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afv")
public class Class96_Sub17 extends Class96 {

	@OriginalMember(owner = "client!afv", name = "c", descriptor = "I")
	final int anInt923;

	@OriginalMember(owner = "client!afv", name = "v", descriptor = "I")
	final int anInt924;

	@OriginalMember(owner = "client!afv", name = "<init>", descriptor = "(Lclient!akv;)V", line = 12)
	Class96_Sub17(@OriginalArg(0) Class77_Sub39 arg0) {
		super(arg0);
		this.anInt923 = arg0.method22483() * 1160638325;
		this.anInt924 = arg0.method22549() * 308294529;
	}

	@OriginalMember(owner = "client!afv", name = "c", descriptor = "(I)V", line = 18)
	@Override
	public void method19911() {
		@Pc(6) Class225 local6 = Class128_Sub1.aClass225Array1[this.anInt923 * -1837750051];
		Class40.method686(local6.anInt3750 * -1762601189, local6.anInt3752 * -836779145, local6.anInt3749 * -1455419505, local6.aClass593_1.anInt5502 * 403227023, local6.aClass593_1.anInt5501 * 847393323, local6.anInt3753 * -1387240389, this.anInt924 * 421268609, 0);
	}

	@OriginalMember(owner = "client!afv", name = "y", descriptor = "()V", line = 18)
	@Override
	public void method19912() {
		@Pc(6) Class225 local6 = Class128_Sub1.aClass225Array1[this.anInt923 * -1837750051];
		Class40.method686(local6.anInt3750 * -1762601189, local6.anInt3752 * -836779145, local6.anInt3749 * -1455419505, local6.aClass593_1.anInt5502 * 403227023, local6.aClass593_1.anInt5501 * 847393323, local6.anInt3753 * -1387240389, this.anInt924 * 421268609, 0);
	}

	@OriginalMember(owner = "client!afv", name = "w", descriptor = "()V", line = 18)
	@Override
	public void method19913() {
		@Pc(6) Class225 local6 = Class128_Sub1.aClass225Array1[this.anInt923 * -1837750051];
		Class40.method686(local6.anInt3750 * -1762601189, local6.anInt3752 * -836779145, local6.anInt3749 * -1455419505, local6.aClass593_1.anInt5502 * 403227023, local6.aClass593_1.anInt5501 * 847393323, local6.anInt3753 * -1387240389, this.anInt924 * 421268609, 0);
	}

	@OriginalMember(owner = "client!afv", name = "q", descriptor = "()Z", line = 23)
	@Override
	boolean method19905() {
		@Pc(8) Class234 local8 = (Class234) Class96_Sub11.aClass35_Sub2_3.method18319(this.anInt924 * 421268609);
		return local8.method25888();
	}

	@OriginalMember(owner = "client!afv", name = "l", descriptor = "(I)Z", line = 23)
	@Override
	boolean method19903() {
		@Pc(8) Class234 local8 = (Class234) Class96_Sub11.aClass35_Sub2_3.method18319(this.anInt924 * 421268609);
		return local8.method25888();
	}

	@OriginalMember(owner = "client!afv", name = "t", descriptor = "()Z", line = 23)
	@Override
	boolean method19904() {
		@Pc(8) Class234 local8 = (Class234) Class96_Sub11.aClass35_Sub2_3.method18319(this.anInt924 * 421268609);
		return local8.method25888();
	}

	@OriginalMember(owner = "client!afv", name = "x", descriptor = "(IB)V", line = 107)
	public static void method7691(@OriginalArg(0) int arg0) {
		@Pc(4) Class77_Sub1_Sub6 local4 = Class456.method29469(5, (long) arg0);
		local4.method21544();
	}
}
