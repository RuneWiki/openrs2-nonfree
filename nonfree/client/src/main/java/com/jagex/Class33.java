package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public class Class33 implements Interface19 {

	@OriginalMember(owner = "client!hq", name = "g", descriptor = "Lclient!co;")
	Class6 aClass6_5;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "Lclient!ny;")
	final Class359 aClass359_6;

	@OriginalMember(owner = "client!hq", name = "p", descriptor = "Lclient!kt;")
	final Class49 aClass49_2;

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lclient!ny;Lclient!kt;)V", line = 14)
	Class33(@OriginalArg(0) Class359 arg0, @OriginalArg(1) Class49 arg1) {
		this.aClass359_6 = arg0;
		this.aClass49_2 = arg1;
	}

	@OriginalMember(owner = "client!hq", name = "p", descriptor = "(I)V", line = 20)
	@Override
	public void method24604() {
		this.aClass6_5 = Class308.method25753(this.aClass359_6, this.aClass49_2.anInt1017 * 1948455005);
	}

	@OriginalMember(owner = "client!hq", name = "h", descriptor = "()V", line = 20)
	@Override
	public void method24603() {
		this.aClass6_5 = Class308.method25753(this.aClass359_6, this.aClass49_2.anInt1017 * 1948455005);
	}

	@OriginalMember(owner = "client!hq", name = "x", descriptor = "()V", line = 20)
	@Override
	public void method24608() {
		this.aClass6_5 = Class308.method25753(this.aClass359_6, this.aClass49_2.anInt1017 * 1948455005);
	}

	@OriginalMember(owner = "client!hq", name = "s", descriptor = "()V", line = 20)
	@Override
	public void method24607() {
		this.aClass6_5 = Class308.method25753(this.aClass359_6, this.aClass49_2.anInt1017 * 1948455005);
	}

	@OriginalMember(owner = "client!hq", name = "u", descriptor = "()V", line = 20)
	@Override
	public void method24609() {
		this.aClass6_5 = Class308.method25753(this.aClass359_6, this.aClass49_2.anInt1017 * 1948455005);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ZI)V", line = 24)
	@Override
	public void method24606(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			@Pc(19) int local19 = this.aClass49_2.aClass277_6.method25394(this.aClass6_5.method16772(), client.anInt3032 * 581921171) + this.aClass49_2.anInt1018 * -1445052455;
			@Pc(37) int local37 = this.aClass49_2.aClass276_6.method25383(this.aClass6_5.method16779(), client.anInt3131 * -645382887) + this.aClass49_2.anInt1019 * -1782123231;
			this.aClass6_5.method16783(local19, local37);
		}
	}

	@OriginalMember(owner = "client!hq", name = "l", descriptor = "(Z)V", line = 24)
	@Override
	public void method24605(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			@Pc(19) int local19 = this.aClass49_2.aClass277_6.method25394(this.aClass6_5.method16772(), client.anInt3032 * 581921171) + this.aClass49_2.anInt1018 * -1445052455;
			@Pc(37) int local37 = this.aClass49_2.aClass276_6.method25383(this.aClass6_5.method16779(), client.anInt3131 * -645382887) + this.aClass49_2.anInt1019 * -1782123231;
			this.aClass6_5.method16783(local19, local37);
		}
	}

	@OriginalMember(owner = "client!hq", name = "g", descriptor = "(I)Z", line = 32)
	@Override
	public boolean method24602() {
		return this.aClass359_6.method26674(this.aClass49_2.anInt1017 * 1948455005);
	}

	@OriginalMember(owner = "client!hq", name = "y", descriptor = "()Z", line = 32)
	@Override
	public boolean method24610() {
		return this.aClass359_6.method26674(this.aClass49_2.anInt1017 * 1948455005);
	}

	@OriginalMember(owner = "client!hq", name = "h", descriptor = "(I[IB)Z", line = 283)
	public static boolean method7569(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (Class16.aBooleanArray3[arg0]) {
			return true;
		}
		Class178.aClass186Array1[arg0] = Class510.method29578(arg0, arg1, Class178.aClass186Array1[arg0], false);
		if (Class178.aClass186Array1[arg0] == null) {
			return false;
		} else {
			Class16.aBooleanArray3[arg0] = true;
			return true;
		}
	}

	@OriginalMember(owner = "client!hq", name = "eu", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 4926)
	static final void method7567(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg0.aBoolean633 = arg2.anIntArray496[(arg2.anInt5319 -= 312124549) * 960738381] == 1;
		Class223.method24442(arg0);
	}

	@OriginalMember(owner = "client!hq", name = "ahi", descriptor = "(Lclient!vs;B)V", line = 10255)
	static final void method7568(@OriginalArg(0) Class536 arg0) {
		if (Class552.aBoolean823 && Class350.aFrame3 != null) {
			Class157.method23193(Class510.aClass3_Sub45_37.aClass60_Sub11_1.method13403(), -1, -1, false);
		}
	}
}
