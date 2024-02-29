package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public class Class220 {

	@OriginalMember(owner = "client!ec", name = "fp", descriptor = "Lclient!pw;")
	public static Class478 aClass478_90;

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "Lclient!ec;")
	public static final Class220 aClass220_8 = new Class220(1);

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "Lclient!ec;")
	static final Class220 aClass220_9 = new Class220(6);

	@OriginalMember(owner = "client!ec", name = "v", descriptor = "Lclient!ec;")
	public static final Class220 aClass220_2 = new Class220(5);

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "Lclient!ec;")
	static final Class220 aClass220_3 = new Class220(2);

	@OriginalMember(owner = "client!ec", name = "y", descriptor = "Lclient!ec;")
	static final Class220 aClass220_4 = new Class220(7);

	@OriginalMember(owner = "client!ec", name = "w", descriptor = "Lclient!ec;")
	static final Class220 aClass220_5 = new Class220(9);

	@OriginalMember(owner = "client!ec", name = "t", descriptor = "Lclient!ec;")
	static final Class220 aClass220_6 = new Class220(8);

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "Lclient!ec;")
	static final Class220 aClass220_7 = new Class220(4);

	@OriginalMember(owner = "client!ec", name = "x", descriptor = "Lclient!ec;")
	static final Class220 aClass220_1 = new Class220(0);

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "Lclient!ec;")
	static final Class220 aClass220_10 = new Class220(3);

	@OriginalMember(owner = "client!ec", name = "s", descriptor = "I")
	final int anInt3740;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(I)V", line = 17)
	Class220(@OriginalArg(0) int arg0) {
		this.anInt3740 = arg0 * 2003871517;
	}

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "(I)I", line = 22)
	public int method25727() {
		return this.anInt3740 * -766815435 | 0x2000000;
	}

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "()I", line = 22)
	public int method25728() {
		return this.anInt3740 * -766815435 | 0x2000000;
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "()I", line = 22)
	public int method25729() {
		return this.anInt3740 * -766815435 | 0x2000000;
	}

	@OriginalMember(owner = "client!ec", name = "v", descriptor = "()I", line = 22)
	public int method25730() {
		return this.anInt3740 * -766815435 | 0x2000000;
	}

	@OriginalMember(owner = "client!ec", name = "po", descriptor = "(Lclient!yf;I)V", line = 7349)
	static final void method25731(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class307.method27256(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!ec", name = "ls", descriptor = "(II)V", line = 11841)
	static final void method25732(@OriginalArg(0) int arg0) {
		Class509.method30281();
		@Pc(10) int local10 = ((Class75_Sub2) Class562.aClass80_Sub1_Sub1_2.method18319(arg0)).anInt225 * 204778967;
		if (local10 == 0) {
			return;
		}
		@Pc(23) int local23 = Class55.aClass124_1.method35934((Class75) Class562.aClass80_Sub1_Sub1_2.method18319(arg0));
		if (local10 == 5) {
			client.anInt3471 = local23 * -308071353;
		}
		if (local10 == 6) {
			client.anInt3477 = local23 * -28012801;
		}
	}
}
