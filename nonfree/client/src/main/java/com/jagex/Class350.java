package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ju")
public class Class350 implements Interface31 {

	@OriginalMember(owner = "client!ju", name = "p", descriptor = "Lclient!mu;")
	final Class407 aClass407_1;

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(Lclient!mu;)V", line = 11)
	Class350(@OriginalArg(0) Class407 arg0) {
		this.aClass407_1 = arg0;
	}

	@OriginalMember(owner = "client!ju", name = "c", descriptor = "(ZB)V", line = 16)
	@Override
	public void method27921(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Class284.aClass86_9.method20088(0, 0, Class149_Sub4.anInt2368 * 1771907305, Class19.anInt108 * -1091172141, this.aClass407_1.anInt4706 * -1905671225, 0);
		}
	}

	@OriginalMember(owner = "client!ju", name = "l", descriptor = "(Z)V", line = 16)
	@Override
	public void method27918(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Class284.aClass86_9.method20088(0, 0, Class149_Sub4.anInt2368 * 1771907305, Class19.anInt108 * -1091172141, this.aClass407_1.anInt4706 * -1905671225, 0);
		}
	}

	@OriginalMember(owner = "client!ju", name = "y", descriptor = "()V", line = 19)
	@Override
	public void method27919() {
	}

	@OriginalMember(owner = "client!ju", name = "p", descriptor = "(S)V", line = 19)
	@Override
	public void method27917() {
	}

	@OriginalMember(owner = "client!ju", name = "v", descriptor = "(I)Z", line = 22)
	@Override
	public boolean method27915() {
		return true;
	}

	@OriginalMember(owner = "client!ju", name = "w", descriptor = "()Z", line = 22)
	@Override
	public boolean method27920() {
		return true;
	}

	@OriginalMember(owner = "client!ju", name = "t", descriptor = "()Z", line = 22)
	@Override
	public boolean method27924() {
		return true;
	}

	@OriginalMember(owner = "client!ju", name = "q", descriptor = "()Z", line = 22)
	@Override
	public boolean method27916() {
		return true;
	}

	@OriginalMember(owner = "client!ju", name = "x", descriptor = "()Z", line = 22)
	@Override
	public boolean method27923() {
		return true;
	}

	@OriginalMember(owner = "client!ju", name = "d", descriptor = "()Z", line = 22)
	@Override
	public boolean method27922() {
		return true;
	}

	@OriginalMember(owner = "client!ju", name = "w", descriptor = "([SI)V", line = 68)
	public static void method27880(@OriginalArg(0) short[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			arg0[local1] = 1024;
		}
	}

	@OriginalMember(owner = "client!ju", name = "l", descriptor = "(ZI)V", line = 89)
	public static void method27881(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ju", name = "cc", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 4850)
	static final void method27882(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		@Pc(17) boolean local17 = arg2.anIntArray536[(arg2.anInt5784 -= 308999563) * 2088438307] == 1;
		if (arg0.aBoolean666 != local17) {
			arg0.aBoolean666 = local17;
			Class461.method29531(arg0);
		}
		if (arg0.anInt3927 * 1365669833 == -1 && !arg1.aBoolean662) {
			Class449.method29228(arg0.anInt3863 * -1278450723);
		}
	}
}
