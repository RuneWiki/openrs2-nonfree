package com.jagex;

import java.awt.event.ActionEvent;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public class Class482 {

	@OriginalMember(owner = "client!tj", name = "p", descriptor = "Ljava/util/List;")
	static List aList19;

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "[Lclient!aob;")
	static Class53_Sub1_Sub1_Sub1[] aClass53_Sub1_Sub1_Sub1Array2;

	@OriginalMember(owner = "client!tj", name = "h", descriptor = "[Lclient!tf;")
	static Class478[] aClass478Array1;

	@OriginalMember(owner = "client!tj", name = "ef", descriptor = "Z")
	static boolean aBoolean801;

	@OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
	static int anInt5151 = 0;

	@OriginalMember(owner = "client!tj", name = "l", descriptor = "I")
	static int anInt5152 = 0;

	@OriginalMember(owner = "client!tj", name = "x", descriptor = "I")
	static int anInt5156 = 0;

	@OriginalMember(owner = "client!tj", name = "s", descriptor = "I")
	static int anInt5154 = 0;

	@OriginalMember(owner = "client!tj", name = "u", descriptor = "I")
	static int anInt5153 = 0;

	@OriginalMember(owner = "client!tj", name = "y", descriptor = "I")
	static int anInt5155 = 0;

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "Lclient!xn;")
	static Class581 aClass581_37 = new Class581(8);

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
	static int anInt5157 = 0;

	@OriginalMember(owner = "client!tj", name = "z", descriptor = "I")
	static int anInt5158 = -1248758494;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "()V", line = 25)
	Class482() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!tj", name = "s", descriptor = "(Lclient!ny;)V", line = 30)
	public static void method29084(@OriginalArg(0) Class359 arg0) {
		anInt5151 = 0;
		anInt5152 = 0;
		aList19 = new LinkedList();
		aClass53_Sub1_Sub1_Sub1Array2 = new Class53_Sub1_Sub1_Sub1[1024];
		aClass478Array1 = new Class478[Class126.anIntArray324[anInt5158 * 1631733361] + 1];
		anInt5156 = 0;
		anInt5154 = 0;
		Class122.method22838(arg0);
		Class290.method25537(arg0);
	}

	@OriginalMember(owner = "client!tj", name = "u", descriptor = "(Lclient!ny;)V", line = 30)
	public static void method29090(@OriginalArg(0) Class359 arg0) {
		anInt5151 = 0;
		anInt5152 = 0;
		aList19 = new LinkedList();
		aClass53_Sub1_Sub1_Sub1Array2 = new Class53_Sub1_Sub1_Sub1[1024];
		aClass478Array1 = new Class478[Class126.anIntArray324[anInt5158 * 1631733361] + 1];
		anInt5156 = 0;
		anInt5154 = 0;
		Class122.method22838(arg0);
		Class290.method25537(arg0);
	}

	@OriginalMember(owner = "client!tj", name = "y", descriptor = "(Lclient!de;J)V", line = 42)
	public static void method29086(@OriginalArg(0) Class21 arg0, @OriginalArg(1) long arg1) {
		anInt5155 = anInt5153 * -1353291173;
		anInt5153 = 0;
		Class176.method23413();
		@Pc(11) Iterator local11 = aList19.iterator();
		while (local11.hasNext()) {
			@Pc(18) Class478 local18 = (Class478) local11.next();
			@Pc(23) boolean local23 = local18.method28835(arg0, arg1);
			if (!local23) {
				local11.remove();
				aClass478Array1[anInt5154 * -40012635] = local18;
				anInt5154 = (anInt5154 * -40012635 + 1 & Class126.anIntArray324[anInt5158 * 1631733361]) * 1873629997;
			}
		}
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(Lclient!de;J)V", line = 42)
	public static void method29089(@OriginalArg(0) Class21 arg0, @OriginalArg(1) long arg1) {
		anInt5155 = anInt5153 * -1353291173;
		anInt5153 = 0;
		Class176.method23413();
		@Pc(11) Iterator local11 = aList19.iterator();
		while (local11.hasNext()) {
			@Pc(18) Class478 local18 = (Class478) local11.next();
			@Pc(23) boolean local23 = local18.method28835(arg0, arg1);
			if (!local23) {
				local11.remove();
				aClass478Array1[anInt5154 * -40012635] = local18;
				anInt5154 = (anInt5154 * -40012635 + 1 & Class126.anIntArray324[anInt5158 * 1631733361]) * 1873629997;
			}
		}
	}

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(Lclient!rp;Lclient!de;)V", line = 59)
	public static void method29087(@OriginalArg(0) Class438 arg0, @OriginalArg(1) Class21 arg1) {
		@Pc(2) Iterator local2 = aList19.iterator();
		while (local2.hasNext()) {
			@Pc(9) Class478 local9 = (Class478) local2.next();
			if (local9.aBoolean796) {
				local9.method28831(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!tj", name = "z", descriptor = "(Lclient!rp;Lclient!de;)V", line = 59)
	public static void method29088(@OriginalArg(0) Class438 arg0, @OriginalArg(1) Class21 arg1) {
		@Pc(2) Iterator local2 = aList19.iterator();
		while (local2.hasNext()) {
			@Pc(9) Class478 local9 = (Class478) local2.next();
			if (local9.aBoolean796) {
				local9.method28831(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!tj", name = "n", descriptor = "()V", line = 68)
	public static void method29083() {
		aClass581_37 = new Class581(8);
		anInt5157 = 0;
		@Pc(9) Iterator local9 = aList19.iterator();
		while (local9.hasNext()) {
			@Pc(16) Class478 local16 = (Class478) local9.next();
			local16.method28832();
		}
	}

	@OriginalMember(owner = "client!tj", name = "j", descriptor = "()V", line = 68)
	public static void method29091() {
		aClass581_37 = new Class581(8);
		anInt5157 = 0;
		@Pc(9) Iterator local9 = aList19.iterator();
		while (local9.hasNext()) {
			@Pc(16) Class478 local16 = (Class478) local9.next();
			local16.method28832();
		}
	}

	@OriginalMember(owner = "client!tj", name = "e", descriptor = "(I)V", line = 79)
	public static void method29092(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		anInt5158 = arg0 * 1523104401;
		aClass478Array1 = new Class478[Class126.anIntArray324[anInt5158 * 1631733361] + 1];
		anInt5156 = 0;
		anInt5154 = 0;
	}

	@OriginalMember(owner = "client!tj", name = "r", descriptor = "()I", line = 87)
	public static int method29085() {
		return anInt5158 * 1631733361;
	}

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "()I", line = 87)
	public static int method29093() {
		return anInt5158 * 1631733361;
	}

	@OriginalMember(owner = "client!tj", name = "t", descriptor = "(Ljava/lang/Object;I)V", line = 567)
	static void method29095(@OriginalArg(0) Object arg0) {
		if (Class155.anEventQueue1 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < 50 && Class155.anEventQueue1.peekEvent() != null; local4++) {
			Class60_Sub11.method13407(1L);
		}
		try {
			if (arg0 != null) {
				Class155.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
			}
		} catch (@Pc(27) Exception local27) {
		}
	}

	@OriginalMember(owner = "client!tj", name = "hq", descriptor = "(Lclient!akp;III)V", line = 4225)
	public static void method29094(@OriginalArg(0) Class26_Sub1_Sub1_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) int[] local2 = new int[4];
		Arrays.fill(local2, 0, local2.length, arg1);
		Class435.method27993(arg0, local2, arg2, false);
	}
}
