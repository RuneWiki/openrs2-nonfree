package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajg")
public class Class77_Sub8 extends Class77 {

	@OriginalMember(owner = "client!ajg", name = "s", descriptor = "Lclient!akv;")
	static Class77_Sub39 aClass77_Sub39_9;

	@OriginalMember(owner = "client!ajg", name = "l", descriptor = "I")
	int anInt1468;

	@OriginalMember(owner = "client!ajg", name = "y", descriptor = "I")
	int anInt1467;

	@OriginalMember(owner = "client!ajg", name = "w", descriptor = "I")
	int anInt1471;

	@OriginalMember(owner = "client!ajg", name = "t", descriptor = "I")
	int anInt1470;

	@OriginalMember(owner = "client!ajg", name = "q", descriptor = "I")
	int anInt1469;

	@OriginalMember(owner = "client!ajg", name = "x", descriptor = "Z")
	boolean aBoolean325;

	@OriginalMember(owner = "client!ajg", name = "<init>", descriptor = "(IIIIIZ)V", line = 66)
	Class77_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt1468 = arg0 * 1082972827;
		this.anInt1467 = arg1 * -1058746657;
		this.anInt1471 = arg2 * -261912427;
		this.anInt1470 = arg3 * 1051515433;
		this.anInt1469 = arg4 * -1834723261;
		this.aBoolean325 = arg5;
	}

	@OriginalMember(owner = "client!ajg", name = "er", descriptor = "(Lclient!yf;I)V", line = 5307)
	static final void method13286(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class157.method24297(local11, local14, arg0);
	}
}
