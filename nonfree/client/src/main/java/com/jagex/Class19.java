package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public abstract class Class19 {

	@OriginalMember(owner = "client!df", name = "hs", descriptor = "Lclient!vd;")
	public static Class523 aClass523_14;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V", line = 4)
	Class19() {
	}

	@OriginalMember(owner = "client!df", name = "p", descriptor = "(I)[Lclient!ww;", line = 20)
	public static Class564[] method21408() {
		return new Class564[] { Class564.aClass564_8, Class564.aClass564_9, Class564.aClass564_10, Class564.aClass564_4, Class564.aClass564_2, Class564.aClass564_3, Class564.aClass564_6, Class564.aClass564_5, Class564.aClass564_7 };
	}

	@OriginalMember(owner = "client!df", name = "oj", descriptor = "(Lclient!vs;I)V", line = 6739)
	static final void method21407(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class56.method12594(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!df", name = "rr", descriptor = "(Lclient!vs;I)V", line = 7191)
	static final void method21410(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		Class21.method17423(local11, arg0);
	}

	@OriginalMember(owner = "client!df", name = "atl", descriptor = "(Lclient!vs;I)V", line = 12446)
	static final void method21409(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub17_1.method14599(local12);
	}

	@OriginalMember(owner = "client!df", name = "q", descriptor = "()I")
	public abstract int method21389();

	@OriginalMember(owner = "client!df", name = "p", descriptor = "()I")
	public abstract int method21390();

	@OriginalMember(owner = "client!df", name = "a", descriptor = "()I")
	public abstract int method21391();

	@OriginalMember(owner = "client!df", name = "g", descriptor = "()V")
	public abstract void method21392();

	@OriginalMember(owner = "client!df", name = "l", descriptor = "()Z")
	abstract boolean method21393();

	@OriginalMember(owner = "client!df", name = "x", descriptor = "()I")
	public abstract int method21394();

	@OriginalMember(owner = "client!df", name = "r", descriptor = "()V")
	public abstract void method21395();

	@OriginalMember(owner = "client!df", name = "u", descriptor = "()Z")
	abstract boolean method21396();

	@OriginalMember(owner = "client!df", name = "y", descriptor = "()Z")
	abstract boolean method21397();

	@OriginalMember(owner = "client!df", name = "z", descriptor = "()Z")
	abstract boolean method21398();

	@OriginalMember(owner = "client!df", name = "c", descriptor = "()Z")
	abstract boolean method21399();

	@OriginalMember(owner = "client!df", name = "h", descriptor = "()Z")
	abstract boolean method21400();

	@OriginalMember(owner = "client!df", name = "j", descriptor = "()Z")
	abstract boolean method21401();

	@OriginalMember(owner = "client!df", name = "n", descriptor = "()V")
	public abstract void method21402();

	@OriginalMember(owner = "client!df", name = "b", descriptor = "()Z")
	abstract boolean method21403();

	@OriginalMember(owner = "client!df", name = "s", descriptor = "()I")
	public abstract int method21404();

	@OriginalMember(owner = "client!df", name = "d", descriptor = "()I")
	public abstract int method21405();

	@OriginalMember(owner = "client!df", name = "e", descriptor = "()V")
	public abstract void method21406();
}
