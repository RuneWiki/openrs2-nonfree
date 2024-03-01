package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aca")
public class Class13_Sub5 extends Class13 {

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "J")
	final long aLong14;

	@OriginalMember(owner = "client!aca", name = "g", descriptor = "I")
	final int anInt581;

	@OriginalMember(owner = "client!aca", name = "<init>", descriptor = "(Lclient!ahb;Z)V", line = 11)
	Class13_Sub5(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0);
		@Pc(6) int local6 = arg0.method20271();
		if (arg1) {
			this.aLong14 = ((long) local6 | 0x100000000L) * 8752114450546368881L;
		} else {
			this.aLong14 = (long) local6 * 8752114450546368881L;
		}
		this.anInt581 = arg0.method20275() * -1331143181;
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(I)V", line = 19)
	@Override
	public void method16888() {
		@Pc(7) Class3_Sub21 local7 = (Class3_Sub21) Class131.aClass581_23.method33217(this.aLong14 * -259004378315915375L);
		if (local7 == null) {
			Class131.aClass581_23.method33241(new Class3_Sub21(this.anInt581 * 2133164859), this.aLong14 * -259004378315915375L);
		} else {
			local7.anInt1285 = this.anInt581 * 214335;
		}
	}

	@OriginalMember(owner = "client!aca", name = "h", descriptor = "()V", line = 19)
	@Override
	public void method16896() {
		@Pc(7) Class3_Sub21 local7 = (Class3_Sub21) Class131.aClass581_23.method33217(this.aLong14 * -259004378315915375L);
		if (local7 == null) {
			Class131.aClass581_23.method33241(new Class3_Sub21(this.anInt581 * 2133164859), this.aLong14 * -259004378315915375L);
		} else {
			local7.anInt1285 = this.anInt581 * 214335;
		}
	}

	@OriginalMember(owner = "client!aca", name = "e", descriptor = "(I)V", line = 639)
	public static void method5647() {
		if (Class5.aClass221_4 != null) {
			Class5.aClass221_4.method24396();
		}
		if (Class383.aThread8 == null) {
			return;
		}
		while (true) {
			try {
				Class383.aThread8.join();
				break;
			} catch (@Pc(10) InterruptedException local10) {
			}
		}
	}

	@OriginalMember(owner = "client!aca", name = "je", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 5690)
	static final void method5646(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg0.aString170 = (String) arg2.anObjectArray42[(arg2.anInt5315 -= 790013775) * 996806575];
	}

	@OriginalMember(owner = "client!aca", name = "auy", descriptor = "(Lclient!vs;B)V", line = 12590)
	static final void method5648(@OriginalArg(0) Class536 arg0) {
		@Pc(3) Class26_Sub1_Sub1_Sub1_Sub1 local3 = (Class26_Sub1_Sub1_Sub1_Sub1) arg0.aClass26_Sub1_Sub1_Sub1_4;
		@Pc(5) boolean local5 = false;
		@Pc(8) Class571 local8 = local3.aClass571_1;
		if (local8.anIntArray508 != null) {
			local8 = local8.method33044(Class424.aClass165_1, Class424.aClass165_1);
		}
		if (local8 != null) {
			local5 = local8.aBoolean832;
		}
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local5 ? 1 : 0;
	}
}
