package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
final class Class488 implements Interface10 {

	@OriginalMember(owner = "client!qi", name = "kq", descriptor = "I")
	public static int anInt5047;

	@OriginalMember(owner = "client!qi", name = "p", descriptor = "(II)Lclient!hk;", line = 13)
	public static Class301 method29992(@OriginalArg(0) int arg0) {
		if (Class301.aClass301_2.anInt4017 * -28635091 == arg0) {
			return Class301.aClass301_2;
		} else if (Class301.aClass301_1.anInt4017 * -28635091 == arg0) {
			return Class301.aClass301_1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "(Lclient!akv;)Ljava/lang/Object;", line = 30)
	@Override
	public Object method30210(@OriginalArg(0) Class77_Sub39 arg0) {
		return new Class77_Sub36(arg0);
	}

	@OriginalMember(owner = "client!qi", name = "p", descriptor = "(Lclient!akv;I)Ljava/lang/Object;", line = 30)
	@Override
	public Object method30209(@OriginalArg(0) Class77_Sub39 arg0) {
		return new Class77_Sub36(arg0);
	}

	@OriginalMember(owner = "client!qi", name = "v", descriptor = "(Lclient!akv;)Ljava/lang/Object;", line = 30)
	@Override
	public Object method30208(@OriginalArg(0) Class77_Sub39 arg0) {
		return new Class77_Sub36(arg0);
	}

	@OriginalMember(owner = "client!qi", name = "l", descriptor = "(Lclient!akv;)Ljava/lang/Object;", line = 30)
	@Override
	public Object method30211(@OriginalArg(0) Class77_Sub39 arg0) {
		return new Class77_Sub36(arg0);
	}

	@OriginalMember(owner = "client!qi", name = "p", descriptor = "(IIIIIIII)V", line = 35)
	public static void method29993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) Class77_Sub4 local1 = null;
		for (@Pc(6) Class77_Sub4 local6 = (Class77_Sub4) Class77_Sub4.aClass695_17.method36395(); local6 != null; local6 = (Class77_Sub4) Class77_Sub4.aClass695_17.method36406()) {
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
			Class77_Sub4.aClass695_17.method36383(local1);
		}
		local1.anInt1453 = arg4 * -1796323797;
		local1.anInt1458 = arg5 * -804529983;
		local1.anInt1457 = arg6 * -917323277;
		local1.aBoolean323 = true;
		local1.aBoolean324 = false;
	}

	@OriginalMember(owner = "client!qi", name = "ago", descriptor = "(Lclient!yf;B)V", line = 10593)
	static final void method29994(@OriginalArg(0) Class665 arg0) {
		if (Class662.aClass141_1.method14784(82)) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 1;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!qi", name = "aqz", descriptor = "(Lclient!yf;I)V", line = 12339)
	static final void method29995(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 308999563;
	}

	@OriginalMember(owner = "client!qi", name = "axz", descriptor = "(Lclient!yf;B)V", line = 13381)
	static final void method29996(@OriginalArg(0) Class665 arg0) {
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = ((Class104_Sub1_Sub1_Sub1_Sub2) arg0.aClass104_Sub1_Sub1_Sub1_4).method21176(true);
	}
}
