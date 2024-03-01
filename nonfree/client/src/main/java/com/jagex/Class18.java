package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public abstract class Class18 {

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V", line = 4)
	Class18() {
	}

	@OriginalMember(owner = "client!db", name = "u", descriptor = "(S)V", line = 49)
	public static void method17008() {
		if (client.anInt3039 * 1115111877 != 5 && client.anInt3039 * 1115111877 != 7 || client.aClass82_2 == null) {
			return;
		}
		while (true) {
			@Pc(16) Interface47 local16 = (Interface47) Class433.aLinkedList3.poll();
			if (local16 == null) {
				return;
			}
			local16.method28244();
		}
	}

	@OriginalMember(owner = "client!db", name = "ek", descriptor = "(II)Z", line = 1694)
	static boolean method17009(@OriginalArg(0) int arg0) {
		return arg0 == 2 || arg0 == 19 || arg0 == 15 || arg0 == 16 || arg0 == 4 || arg0 == 1;
	}

	@OriginalMember(owner = "client!db", name = "ade", descriptor = "(Lclient!vs;B)V", line = 9223)
	static final void method17010(@OriginalArg(0) Class536 arg0) {
		Class21_Sub1.anInt289 = 0;
	}
}
