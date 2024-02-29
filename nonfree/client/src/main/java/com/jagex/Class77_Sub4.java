package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajc")
public final class Class77_Sub4 extends Class77 {

	@OriginalMember(owner = "client!ajc", name = "k", descriptor = "Lclient!zm;")
	public static Class695 aClass695_17 = new Class695();

	@OriginalMember(owner = "client!ajc", name = "u", descriptor = "Lclient!zm;")
	public static Class695 aClass695_18 = new Class695();

	@OriginalMember(owner = "client!ajc", name = "e", descriptor = "J")
	static long aLong59 = 4551746311500396985L;

	@OriginalMember(owner = "client!ajc", name = "q", descriptor = "I")
	int anInt1450;

	@OriginalMember(owner = "client!ajc", name = "x", descriptor = "I")
	int anInt1451;

	@OriginalMember(owner = "client!ajc", name = "w", descriptor = "I")
	public int anInt1452;

	@OriginalMember(owner = "client!ajc", name = "s", descriptor = "I")
	public int anInt1453;

	@OriginalMember(owner = "client!ajc", name = "z", descriptor = "Lclient!ve;")
	Class594 aClass594_1;

	@OriginalMember(owner = "client!ajc", name = "t", descriptor = "I")
	public int anInt1454;

	@OriginalMember(owner = "client!ajc", name = "d", descriptor = "I")
	int anInt1455;

	@OriginalMember(owner = "client!ajc", name = "l", descriptor = "I")
	int anInt1456;

	@OriginalMember(owner = "client!ajc", name = "r", descriptor = "I")
	public int anInt1457;

	@OriginalMember(owner = "client!ajc", name = "g", descriptor = "I")
	int anInt1458;

	@OriginalMember(owner = "client!ajc", name = "y", descriptor = "I")
	int anInt1459;

	@OriginalMember(owner = "client!ajc", name = "j", descriptor = "Z")
	boolean aBoolean323 = true;

	@OriginalMember(owner = "client!ajc", name = "i", descriptor = "Z")
	boolean aBoolean324 = false;

	@OriginalMember(owner = "client!ajc", name = "<init>", descriptor = "()V", line = 32)
	Class77_Sub4() {
	}

	@OriginalMember(owner = "client!ajc", name = "x", descriptor = "(IIIIIII)V", line = 35)
	public static void method13205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) Class77_Sub4 local1 = null;
		for (@Pc(6) Class77_Sub4 local6 = (Class77_Sub4) aClass695_17.method36395(); local6 != null; local6 = (Class77_Sub4) aClass695_17.method36406()) {
			if (local6.anInt1456 * -511427777 == arg0 && local6.anInt1452 * -1522052283 == arg1 && local6.anInt1454 * -1246362377 == arg2 && arg3 == local6.anInt1459 * -1831835741) {
				local1 = local6;
				break;
			}
		}
		if (local1 == null) {
			local1 = new Class77_Sub4();
			local1.anInt1456 = arg0 * -453954369;
			local1.anInt1459 = arg3 * 2108621835;
			local1.anInt1452 = arg1 * 1402161037;
			local1.anInt1454 = arg2 * 2107243719;
			if (arg1 >= 0 && arg2 >= 0 && arg1 < client.aClass517_1.method30411() && arg2 < client.aClass517_1.method30417()) {
				Class258.method26230(local1);
			}
			aClass695_17.method36383(local1);
		}
		local1.anInt1453 = arg4 * -1796323797;
		local1.anInt1458 = arg5 * -804529983;
		local1.anInt1457 = arg6 * -917323277;
		local1.aBoolean323 = true;
		local1.aBoolean324 = false;
	}

	@OriginalMember(owner = "client!ajc", name = "d", descriptor = "(IIIIIILclient!ve;)V", line = 61)
	static void method13206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class594 arg6) {
		@Pc(1) Class77_Sub4 local1 = null;
		for (@Pc(6) Class77_Sub4 local6 = (Class77_Sub4) aClass695_18.method36395(); local6 != null; local6 = (Class77_Sub4) aClass695_18.method36406()) {
			if (arg0 == local6.anInt1456 * -511427777 && local6.anInt1452 * -1522052283 == arg1 && local6.anInt1454 * -1246362377 == arg2 && arg3 == local6.anInt1459 * -1831835741) {
				local1 = local6;
				break;
			}
		}
		if (local1 == null) {
			local1 = new Class77_Sub4();
			local1.anInt1456 = arg0 * -453954369;
			local1.anInt1459 = arg3 * 2108621835;
			local1.anInt1452 = arg1 * 1402161037;
			local1.anInt1454 = arg2 * 2107243719;
			aClass695_18.method36383(local1);
		}
		local1.anInt1453 = arg4 * -1796323797;
		local1.anInt1458 = arg5 * -804529983;
		local1.aClass594_1 = arg6;
		local1.aBoolean323 = true;
		local1.aBoolean324 = false;
	}

	@OriginalMember(owner = "client!ajc", name = "s", descriptor = "(IIIIIILclient!ve;)V", line = 61)
	static void method13207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class594 arg6) {
		@Pc(1) Class77_Sub4 local1 = null;
		for (@Pc(6) Class77_Sub4 local6 = (Class77_Sub4) aClass695_18.method36395(); local6 != null; local6 = (Class77_Sub4) aClass695_18.method36406()) {
			if (arg0 == local6.anInt1456 * -511427777 && local6.anInt1452 * -1522052283 == arg1 && local6.anInt1454 * -1246362377 == arg2 && arg3 == local6.anInt1459 * -1831835741) {
				local1 = local6;
				break;
			}
		}
		if (local1 == null) {
			local1 = new Class77_Sub4();
			local1.anInt1456 = arg0 * -453954369;
			local1.anInt1459 = arg3 * 2108621835;
			local1.anInt1452 = arg1 * 1402161037;
			local1.anInt1454 = arg2 * 2107243719;
			aClass695_18.method36383(local1);
		}
		local1.anInt1453 = arg4 * -1796323797;
		local1.anInt1458 = arg5 * -804529983;
		local1.aClass594_1 = arg6;
		local1.aBoolean323 = true;
		local1.aBoolean324 = false;
	}

	@OriginalMember(owner = "client!ajc", name = "r", descriptor = "()V", line = 126)
	static final void method13208() {
		@Pc(4) Class77_Sub4 local4;
		for (local4 = (Class77_Sub4) aClass695_17.method36395(); local4 != null; local4 = (Class77_Sub4) aClass695_17.method36406()) {
			Class413.method28609(local4, false);
		}
		for (local4 = (Class77_Sub4) aClass695_18.method36395(); local4 != null; local4 = (Class77_Sub4) aClass695_18.method36406()) {
			Class413.method28609(local4, true);
		}
	}

	@OriginalMember(owner = "client!ajc", name = "g", descriptor = "()V", line = 126)
	static final void method13209() {
		@Pc(4) Class77_Sub4 local4;
		for (local4 = (Class77_Sub4) aClass695_17.method36395(); local4 != null; local4 = (Class77_Sub4) aClass695_17.method36406()) {
			Class413.method28609(local4, false);
		}
		for (local4 = (Class77_Sub4) aClass695_18.method36395(); local4 != null; local4 = (Class77_Sub4) aClass695_18.method36406()) {
			Class413.method28609(local4, true);
		}
	}

	@OriginalMember(owner = "client!ajc", name = "z", descriptor = "(Lclient!ajc;Z)V", line = 139)
	static final void method13210(@OriginalArg(0) Class77_Sub4 arg0, @OriginalArg(1) boolean arg1) {
		if (arg0.aBoolean324) {
			if (arg0.anInt1450 * 311151295 < 0 || Class143_Sub30.method15972(client.aClass517_1.method30444(), arg0.anInt1450 * 311151295, arg0.anInt1455 * 665019215)) {
				if (arg1) {
					Class102_Sub1.method7920(arg0.anInt1456 * -511427777, arg0.anInt1459 * -1831835741, arg0.anInt1452 * -1522052283, arg0.anInt1454 * -1246362377, null);
				} else {
					Class566.method31368(arg0.anInt1456 * -511427777, arg0.anInt1459 * -1831835741, arg0.anInt1452 * -1522052283, arg0.anInt1454 * -1246362377, arg0.anInt1450 * 311151295, arg0.anInt1451 * 352976243, arg0.anInt1455 * 665019215, -1, 0);
				}
				arg0.method24063();
			}
		} else if (arg0.aBoolean323 && arg0.anInt1452 * -1522052283 >= 1 && arg0.anInt1454 * -1246362377 >= 1 && arg0.anInt1452 * -1522052283 <= client.aClass517_1.method30411() - 2 && arg0.anInt1454 * -1246362377 <= client.aClass517_1.method30417() - 2 && (arg0.anInt1453 * -1375582077 < 0 || Class143_Sub30.method15972(client.aClass517_1.method30444(), arg0.anInt1453 * -1375582077, arg0.anInt1458 * -1945323711))) {
			if (arg1) {
				Class102_Sub1.method7920(arg0.anInt1456 * -511427777, arg0.anInt1459 * -1831835741, arg0.anInt1452 * -1522052283, arg0.anInt1454 * -1246362377, arg0.aClass594_1);
			} else {
				Class566.method31368(arg0.anInt1456 * -511427777, arg0.anInt1459 * -1831835741, arg0.anInt1452 * -1522052283, arg0.anInt1454 * -1246362377, arg0.anInt1453 * -1375582077, arg0.anInt1457 * 220446523, arg0.anInt1458 * -1945323711, -1, 0);
			}
			arg0.aBoolean323 = false;
			if (!arg1 && arg0.anInt1450 * 311151295 == arg0.anInt1453 * -1375582077 && arg0.anInt1450 * 311151295 == -1) {
				arg0.method24063();
			} else if (!arg1 && arg0.anInt1453 * -1375582077 == arg0.anInt1450 * 311151295 && arg0.anInt1457 * 220446523 == arg0.anInt1451 * 352976243 && arg0.anInt1458 * -1945323711 == arg0.anInt1455 * 665019215) {
				arg0.method24063();
			}
		}
	}

	@OriginalMember(owner = "client!ajc", name = "b", descriptor = "(Lclient!ajc;Z)V", line = 139)
	static final void method13211(@OriginalArg(0) Class77_Sub4 arg0, @OriginalArg(1) boolean arg1) {
		if (arg0.aBoolean324) {
			if (arg0.anInt1450 * 311151295 < 0 || Class143_Sub30.method15972(client.aClass517_1.method30444(), arg0.anInt1450 * 311151295, arg0.anInt1455 * 665019215)) {
				if (arg1) {
					Class102_Sub1.method7920(arg0.anInt1456 * -511427777, arg0.anInt1459 * -1831835741, arg0.anInt1452 * -1522052283, arg0.anInt1454 * -1246362377, null);
				} else {
					Class566.method31368(arg0.anInt1456 * -511427777, arg0.anInt1459 * -1831835741, arg0.anInt1452 * -1522052283, arg0.anInt1454 * -1246362377, arg0.anInt1450 * 311151295, arg0.anInt1451 * 352976243, arg0.anInt1455 * 665019215, -1, 0);
				}
				arg0.method24063();
			}
		} else if (arg0.aBoolean323 && arg0.anInt1452 * -1522052283 >= 1 && arg0.anInt1454 * -1246362377 >= 1 && arg0.anInt1452 * -1522052283 <= client.aClass517_1.method30411() - 2 && arg0.anInt1454 * -1246362377 <= client.aClass517_1.method30417() - 2 && (arg0.anInt1453 * -1375582077 < 0 || Class143_Sub30.method15972(client.aClass517_1.method30444(), arg0.anInt1453 * -1375582077, arg0.anInt1458 * -1945323711))) {
			if (arg1) {
				Class102_Sub1.method7920(arg0.anInt1456 * -511427777, arg0.anInt1459 * -1831835741, arg0.anInt1452 * -1522052283, arg0.anInt1454 * -1246362377, arg0.aClass594_1);
			} else {
				Class566.method31368(arg0.anInt1456 * -511427777, arg0.anInt1459 * -1831835741, arg0.anInt1452 * -1522052283, arg0.anInt1454 * -1246362377, arg0.anInt1453 * -1375582077, arg0.anInt1457 * 220446523, arg0.anInt1458 * -1945323711, -1, 0);
			}
			arg0.aBoolean323 = false;
			if (!arg1 && arg0.anInt1450 * 311151295 == arg0.anInt1453 * -1375582077 && arg0.anInt1450 * 311151295 == -1) {
				arg0.method24063();
			} else if (!arg1 && arg0.anInt1453 * -1375582077 == arg0.anInt1450 * 311151295 && arg0.anInt1457 * 220446523 == arg0.anInt1451 * 352976243 && arg0.anInt1458 * -1945323711 == arg0.anInt1455 * 665019215) {
				arg0.method24063();
			}
		}
	}

	@OriginalMember(owner = "client!ajc", name = "j", descriptor = "(Lclient!ajc;Z)V", line = 139)
	static final void method13212(@OriginalArg(0) Class77_Sub4 arg0, @OriginalArg(1) boolean arg1) {
		if (arg0.aBoolean324) {
			if (arg0.anInt1450 * 311151295 < 0 || Class143_Sub30.method15972(client.aClass517_1.method30444(), arg0.anInt1450 * 311151295, arg0.anInt1455 * 665019215)) {
				if (arg1) {
					Class102_Sub1.method7920(arg0.anInt1456 * -511427777, arg0.anInt1459 * -1831835741, arg0.anInt1452 * -1522052283, arg0.anInt1454 * -1246362377, null);
				} else {
					Class566.method31368(arg0.anInt1456 * -511427777, arg0.anInt1459 * -1831835741, arg0.anInt1452 * -1522052283, arg0.anInt1454 * -1246362377, arg0.anInt1450 * 311151295, arg0.anInt1451 * 352976243, arg0.anInt1455 * 665019215, -1, 0);
				}
				arg0.method24063();
			}
		} else if (arg0.aBoolean323 && arg0.anInt1452 * -1522052283 >= 1 && arg0.anInt1454 * -1246362377 >= 1 && arg0.anInt1452 * -1522052283 <= client.aClass517_1.method30411() - 2 && arg0.anInt1454 * -1246362377 <= client.aClass517_1.method30417() - 2 && (arg0.anInt1453 * -1375582077 < 0 || Class143_Sub30.method15972(client.aClass517_1.method30444(), arg0.anInt1453 * -1375582077, arg0.anInt1458 * -1945323711))) {
			if (arg1) {
				Class102_Sub1.method7920(arg0.anInt1456 * -511427777, arg0.anInt1459 * -1831835741, arg0.anInt1452 * -1522052283, arg0.anInt1454 * -1246362377, arg0.aClass594_1);
			} else {
				Class566.method31368(arg0.anInt1456 * -511427777, arg0.anInt1459 * -1831835741, arg0.anInt1452 * -1522052283, arg0.anInt1454 * -1246362377, arg0.anInt1453 * -1375582077, arg0.anInt1457 * 220446523, arg0.anInt1458 * -1945323711, -1, 0);
			}
			arg0.aBoolean323 = false;
			if (!arg1 && arg0.anInt1450 * 311151295 == arg0.anInt1453 * -1375582077 && arg0.anInt1450 * 311151295 == -1) {
				arg0.method24063();
			} else if (!arg1 && arg0.anInt1453 * -1375582077 == arg0.anInt1450 * 311151295 && arg0.anInt1457 * 220446523 == arg0.anInt1451 * 352976243 && arg0.anInt1458 * -1945323711 == arg0.anInt1455 * 665019215) {
				arg0.method24063();
			}
		}
	}

	@OriginalMember(owner = "client!ajc", name = "h", descriptor = "(IIIIIIIII)V", line = 160)
	static final void method13213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 < 1 || arg3 < 1 || arg2 > client.aClass517_1.method30411() - 2 || arg3 > client.aClass517_1.method30417() - 2) {
			return;
		}
		@Pc(21) int local21 = arg0;
		if (arg0 < 3 && client.aClass517_1.method30441().method29665(arg2, arg3)) {
			local21 = arg0 + 1;
		}
		if (client.aClass517_1.method30435() == null) {
			return;
		}
		client.aClass517_1.method30459().method12515(Class284.aClass86_9, arg0, arg1, arg2, arg3);
		if (arg4 >= 0) {
			@Pc(55) int local55 = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub10_1.method15222();
			Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub10_1, 1);
			client.aClass517_1.method30459().method12503(Class284.aClass86_9, local21, arg0, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub10_1, local55);
		}
		Class143_Sub28.method15928(Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100);
	}

	@OriginalMember(owner = "client!ajc", name = "a", descriptor = "(IIIIIIIII)V", line = 160)
	static final void method13214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 < 1 || arg3 < 1 || arg2 > client.aClass517_1.method30411() - 2 || arg3 > client.aClass517_1.method30417() - 2) {
			return;
		}
		@Pc(21) int local21 = arg0;
		if (arg0 < 3 && client.aClass517_1.method30441().method29665(arg2, arg3)) {
			local21 = arg0 + 1;
		}
		if (client.aClass517_1.method30435() == null) {
			return;
		}
		client.aClass517_1.method30459().method12515(Class284.aClass86_9, arg0, arg1, arg2, arg3);
		if (arg4 >= 0) {
			@Pc(55) int local55 = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub10_1.method15222();
			Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub10_1, 1);
			client.aClass517_1.method30459().method12503(Class284.aClass86_9, local21, arg0, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub10_1, local55);
		}
		Class143_Sub28.method15928(Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100);
	}

	@OriginalMember(owner = "client!ajc", name = "n", descriptor = "(IIIIIIIII)V", line = 160)
	static final void method13215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 < 1 || arg3 < 1 || arg2 > client.aClass517_1.method30411() - 2 || arg3 > client.aClass517_1.method30417() - 2) {
			return;
		}
		@Pc(21) int local21 = arg0;
		if (arg0 < 3 && client.aClass517_1.method30441().method29665(arg2, arg3)) {
			local21 = arg0 + 1;
		}
		if (client.aClass517_1.method30435() == null) {
			return;
		}
		client.aClass517_1.method30459().method12515(Class284.aClass86_9, arg0, arg1, arg2, arg3);
		if (arg4 >= 0) {
			@Pc(55) int local55 = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub10_1.method15222();
			Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub10_1, 1);
			client.aClass517_1.method30459().method12503(Class284.aClass86_9, local21, arg0, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub10_1, local55);
		}
		Class143_Sub28.method15928(Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100);
	}

	@OriginalMember(owner = "client!ajc", name = "m", descriptor = "(IIIIIIIII)V", line = 160)
	static final void method13216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 < 1 || arg3 < 1 || arg2 > client.aClass517_1.method30411() - 2 || arg3 > client.aClass517_1.method30417() - 2) {
			return;
		}
		@Pc(21) int local21 = arg0;
		if (arg0 < 3 && client.aClass517_1.method30441().method29665(arg2, arg3)) {
			local21 = arg0 + 1;
		}
		if (client.aClass517_1.method30435() == null) {
			return;
		}
		client.aClass517_1.method30459().method12515(Class284.aClass86_9, arg0, arg1, arg2, arg3);
		if (arg4 >= 0) {
			@Pc(55) int local55 = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub10_1.method15222();
			Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub10_1, 1);
			client.aClass517_1.method30459().method12503(Class284.aClass86_9, local21, arg0, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub10_1, local55);
		}
		Class143_Sub28.method15928(Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100);
	}

	@OriginalMember(owner = "client!ajc", name = "bx", descriptor = "(II)Z", line = 1410)
	static boolean method13217(@OriginalArg(0) int arg0) {
		if (arg0 == 9 || arg0 == 10 || arg0 == 11 || arg0 == 12 || arg0 == 13 || arg0 == 1003) {
			return true;
		} else {
			return arg0 == 8;
		}
	}

	@OriginalMember(owner = "client!ajc", name = "yg", descriptor = "(Lclient!yf;B)V", line = 8943)
	static final void method13218(@OriginalArg(0) Class665 arg0) {
		if (client.aString163 == null) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class462.anInt4970 * -217094943;
		}
	}
}
