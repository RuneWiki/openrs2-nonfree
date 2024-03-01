package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acx")
public class Class13_Sub21 extends Class13 {

	@OriginalMember(owner = "client!acx", name = "bn", descriptor = "Lclient!wo;")
	static Class557 aClass557_1;

	@OriginalMember(owner = "client!acx", name = "rt", descriptor = "Lclient!cb;")
	public static Class10 aClass10_1;

	@OriginalMember(owner = "client!acx", name = "a", descriptor = "I")
	final int anInt749;

	@OriginalMember(owner = "client!acx", name = "g", descriptor = "I")
	final int anInt750;

	@OriginalMember(owner = "client!acx", name = "<init>", descriptor = "(Lclient!ahb;)V", line = 11)
	Class13_Sub21(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
		this.anInt749 = arg0.method20271() * 959326709;
		this.anInt750 = arg0.method20269() * -1776431709;
	}

	@OriginalMember(owner = "client!acx", name = "a", descriptor = "(I)V", line = 17)
	@Override
	public void method16888() {
		Class510.aClass183_1.method23595(this.anInt749 * -1077118371);
	}

	@OriginalMember(owner = "client!acx", name = "h", descriptor = "()V", line = 17)
	@Override
	public void method16896() {
		Class510.aClass183_1.method23595(this.anInt749 * -1077118371);
	}

	@OriginalMember(owner = "client!acx", name = "x", descriptor = "()Z", line = 21)
	@Override
	boolean method16891() {
		Class510.aClass183_1.method23590(this.anInt749 * -1077118371, this.anInt750 * -273297909);
		return true;
	}

	@OriginalMember(owner = "client!acx", name = "l", descriptor = "(I)Z", line = 21)
	@Override
	boolean method16890() {
		Class510.aClass183_1.method23590(this.anInt749 * -1077118371, this.anInt750 * -273297909);
		return true;
	}

	@OriginalMember(owner = "client!acx", name = "s", descriptor = "()Z", line = 21)
	@Override
	boolean method16893() {
		Class510.aClass183_1.method23590(this.anInt749 * -1077118371, this.anInt750 * -273297909);
		return true;
	}

	@OriginalMember(owner = "client!acx", name = "a", descriptor = "(B)V", line = 90)
	public static void method7241() {
		@Pc(4) Class3_Sub20 local4;
		for (local4 = (Class3_Sub20) Class3_Sub20.aClass553_19.method32768(); local4 != null; local4 = (Class3_Sub20) Class3_Sub20.aClass553_19.method32709()) {
			if (local4.aBoolean299) {
				local4.method11391();
			}
		}
		for (local4 = (Class3_Sub20) Class3_Sub20.aClass553_18.method32768(); local4 != null; local4 = (Class3_Sub20) Class3_Sub20.aClass553_18.method32709()) {
			if (local4.aBoolean299) {
				local4.method11391();
			}
		}
	}
}
