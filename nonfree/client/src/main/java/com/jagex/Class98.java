package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jw")
public class Class98 implements Interface31 {

	@OriginalMember(owner = "client!jw", name = "d", descriptor = "Lclient!zo;")
	static Class697 aClass697_2;

	@OriginalMember(owner = "client!jw", name = "i", descriptor = "Lclient!aqm;")
	static Class77_Sub1_Sub7 aClass77_Sub1_Sub7_2;

	@OriginalMember(owner = "client!jw", name = "t", descriptor = "[I")
	static int[] anIntArray105;

	@OriginalMember(owner = "client!jw", name = "y", descriptor = "Lclient!aaz;")
	public static Class25 aClass25_7;

	@OriginalMember(owner = "client!jw", name = "aa", descriptor = "I")
	public static int anInt940;

	@OriginalMember(owner = "client!jw", name = "v", descriptor = "Lclient!cy;")
	Class83 aClass83_7;

	@OriginalMember(owner = "client!jw", name = "c", descriptor = "Lclient!pw;")
	final Class478 aClass478_19;

	@OriginalMember(owner = "client!jw", name = "p", descriptor = "Lclient!ml;")
	final Class121 aClass121_2;

	@OriginalMember(owner = "client!jw", name = "<init>", descriptor = "(Lclient!pw;Lclient!ml;)V", line = 14)
	Class98(@OriginalArg(0) Class478 arg0, @OriginalArg(1) Class121 arg1) {
		this.aClass478_19 = arg0;
		this.aClass121_2 = arg1;
	}

	@OriginalMember(owner = "client!jw", name = "p", descriptor = "(S)V", line = 20)
	@Override
	public void method27917() {
		this.aClass83_7 = Class273.method26540(this.aClass478_19, this.aClass121_2.anInt1202 * 1909682011);
	}

	@OriginalMember(owner = "client!jw", name = "y", descriptor = "()V", line = 20)
	@Override
	public void method27919() {
		this.aClass83_7 = Class273.method26540(this.aClass478_19, this.aClass121_2.anInt1202 * 1909682011);
	}

	@OriginalMember(owner = "client!jw", name = "l", descriptor = "(Z)V", line = 24)
	@Override
	public void method27918(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			@Pc(19) int local19 = this.aClass121_2.aClass410_5.method28569(this.aClass83_7.method18121(), client.anInt3394 * -321474631) + this.aClass121_2.anInt1203 * -1151439181;
			@Pc(37) int local37 = this.aClass121_2.aClass402_5.method28502(this.aClass83_7.method18198(), client.anInt3464 * 43072843) + this.aClass121_2.anInt1204 * -963484815;
			this.aClass83_7.method18123(local19, local37);
		}
	}

	@OriginalMember(owner = "client!jw", name = "c", descriptor = "(ZB)V", line = 24)
	@Override
	public void method27921(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			@Pc(19) int local19 = this.aClass121_2.aClass410_5.method28569(this.aClass83_7.method18121(), client.anInt3394 * -321474631) + this.aClass121_2.anInt1203 * -1151439181;
			@Pc(37) int local37 = this.aClass121_2.aClass402_5.method28502(this.aClass83_7.method18198(), client.anInt3464 * 43072843) + this.aClass121_2.anInt1204 * -963484815;
			this.aClass83_7.method18123(local19, local37);
		}
	}

	@OriginalMember(owner = "client!jw", name = "v", descriptor = "(I)Z", line = 32)
	@Override
	public boolean method27915() {
		return this.aClass478_19.method29730(this.aClass121_2.anInt1202 * 1909682011);
	}

	@OriginalMember(owner = "client!jw", name = "d", descriptor = "()Z", line = 32)
	@Override
	public boolean method27922() {
		return this.aClass478_19.method29730(this.aClass121_2.anInt1202 * 1909682011);
	}

	@OriginalMember(owner = "client!jw", name = "w", descriptor = "()Z", line = 32)
	@Override
	public boolean method27920() {
		return this.aClass478_19.method29730(this.aClass121_2.anInt1202 * 1909682011);
	}

	@OriginalMember(owner = "client!jw", name = "t", descriptor = "()Z", line = 32)
	@Override
	public boolean method27924() {
		return this.aClass478_19.method29730(this.aClass121_2.anInt1202 * 1909682011);
	}

	@OriginalMember(owner = "client!jw", name = "x", descriptor = "()Z", line = 32)
	@Override
	public boolean method27923() {
		return this.aClass478_19.method29730(this.aClass121_2.anInt1202 * 1909682011);
	}

	@OriginalMember(owner = "client!jw", name = "q", descriptor = "()Z", line = 32)
	@Override
	public boolean method27916() {
		return this.aClass478_19.method29730(this.aClass121_2.anInt1202 * 1909682011);
	}

	@OriginalMember(owner = "client!jw", name = "c", descriptor = "(I)Z", line = 245)
	public static boolean method7802() {
		return Class354.aBoolean719;
	}

	@OriginalMember(owner = "client!jw", name = "x", descriptor = "(B)Z", line = 383)
	static boolean method7803() {
		if (aClass77_Sub1_Sub7_2 == null) {
			return false;
		} else {
			if (aClass77_Sub1_Sub7_2.anInt2987 * -1986934021 >= 2000) {
				aClass77_Sub1_Sub7_2.anInt2987 -= 585141872;
			}
			return aClass77_Sub1_Sub7_2.anInt2987 * -1986934021 == 1007;
		}
	}

	@OriginalMember(owner = "client!jw", name = "kf", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 6389)
	static final void method7804(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg2.anInt5784 -= 617999126;
		@Pc(7) byte local7 = 10;
		@Pc(21) byte[] local21 = new byte[] { (byte) arg2.anIntArray536[arg2.anInt5784 * 2088438307] };
		@Pc(37) byte[] local37 = new byte[] { (byte) arg2.anIntArray536[arg2.anInt5784 * 2088438307 + 1] };
		Class358.method27972(arg0, local7, local21, local37, arg2);
	}

	@OriginalMember(owner = "client!jw", name = "agj", descriptor = "(Lclient!yf;B)V", line = 10464)
	static final void method7805(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = RuntimeException_Sub4.aClass41_2.method688(local13).anIntArray285[local23];
	}
}
