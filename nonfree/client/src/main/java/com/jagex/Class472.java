package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public class Class472 {

	@OriginalMember(owner = "client!t", name = "a", descriptor = "I")
	int anInt5118;

	@OriginalMember(owner = "client!t", name = "p", descriptor = "I")
	int anInt5119;

	@OriginalMember(owner = "client!t", name = "g", descriptor = "(Lclient!rp;Lclient!de;I)V", line = 59)
	public static void method28775(@OriginalArg(0) Class438 arg0, @OriginalArg(1) Class21 arg1) {
		@Pc(2) Iterator local2 = Class482.aList19.iterator();
		while (local2.hasNext()) {
			@Pc(9) Class478 local9 = (Class478) local2.next();
			if (local9.aBoolean796) {
				local9.method28831(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "x", descriptor = "(I)I", line = 315)
	public static int method28774() {
		return Class5.aClass221_4.method24386();
	}

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "()V", line = 898)
	Class472() {
	}

	@OriginalMember(owner = "client!t", name = "bn", descriptor = "(III)Z", line = 1915)
	static boolean method28776(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= 1000 && arg0 < 1000) {
			return true;
		} else if (arg1 >= 1000 || arg0 >= 1000) {
			return arg1 >= 1000 && arg0 >= 1000;
		} else if (Class530.method32480(arg0)) {
			return true;
		} else {
			return !Class530.method32480(arg1);
		}
	}

	@OriginalMember(owner = "client!t", name = "eg", descriptor = "(Lclient!vs;I)V", line = 4931)
	static final void method28777(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class33.method7567(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!t", name = "on", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;B)V", line = 6679)
	static final void method28778(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray42[(arg2.anInt5315 -= 790013775) * 996806575];
		if (Class201.method24159(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray8 = Class484.method29109(local13, arg2);
		arg0.aBoolean644 = true;
	}
}
