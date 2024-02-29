package com.jagex;

import java.util.LinkedList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public class Class575 {

	@OriginalMember(owner = "client!ug", name = "p", descriptor = "Ljava/util/LinkedList;")
	static LinkedList aLinkedList8 = new LinkedList();

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V", line = 15)
	Class575() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!ug", name = "q", descriptor = "(Lclient!ako;)V", line = 20)
	public static void method31588(@OriginalArg(0) Class39_Sub1 arg0) {
		Class86.method19916(arg0);
	}

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)V", line = 24)
	public static void method31589(@OriginalArg(0) int arg0) {
		Class86.method19916(new Class584(arg0));
	}

	@OriginalMember(owner = "client!ug", name = "s", descriptor = "(I)V", line = 24)
	public static void method31590(@OriginalArg(0) int arg0) {
		Class86.method19916(new Class584(arg0));
	}

	@OriginalMember(owner = "client!ug", name = "x", descriptor = "(I)V", line = 24)
	public static void method31591(@OriginalArg(0) int arg0) {
		Class86.method19916(new Class584(arg0));
	}

	@OriginalMember(owner = "client!ug", name = "r", descriptor = "(Lclient!aba;)V", line = 28)
	public static void method31592(@OriginalArg(0) Class27 arg0) {
		Class86.method19916(new Class572(arg0));
	}

	@OriginalMember(owner = "client!ug", name = "g", descriptor = "(Lclient!aba;)V", line = 28)
	public static void method31593(@OriginalArg(0) Class27 arg0) {
		Class86.method19916(new Class572(arg0));
	}

	@OriginalMember(owner = "client!ug", name = "z", descriptor = "(III)V", line = 32)
	public static void method31594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Class86.method19916(new Class48_Sub1(arg0, arg1, arg2, client.anInt3404 * 1262399261, Class7.aClass129_1.anInt1344 * 1930739095, Class7.aClass129_1.anInt1345 * 1871597189, Class7.aClass129_1.method12184(), Class7.aClass129_1.method12179(), Class643.aClass469_3.method29586()));
	}

	@OriginalMember(owner = "client!ug", name = "j", descriptor = "(Lclient!abz;Ljava/lang/String;ILjava/lang/Throwable;)V", line = 36)
	public static void method31595(@OriginalArg(0) Class49 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Throwable arg3) {
		Class86.method19916(new Class582(arg0, arg1, arg2, arg3));
	}

	@OriginalMember(owner = "client!ug", name = "u", descriptor = "(Lclient!uv;)V", line = 40)
	static void method31596(@OriginalArg(0) Interface67 arg0) {
		while (aLinkedList8.size() > 10) {
			aLinkedList8.remove();
		}
		aLinkedList8.add(arg0);
	}

	@OriginalMember(owner = "client!ug", name = "k", descriptor = "(Lclient!uv;)V", line = 40)
	static void method31597(@OriginalArg(0) Interface67 arg0) {
		while (aLinkedList8.size() > 10) {
			aLinkedList8.remove();
		}
		aLinkedList8.add(arg0);
	}

	@OriginalMember(owner = "client!ug", name = "i", descriptor = "(Lclient!uv;)V", line = 40)
	static void method31598(@OriginalArg(0) Interface67 arg0) {
		while (aLinkedList8.size() > 10) {
			aLinkedList8.remove();
		}
		aLinkedList8.add(arg0);
	}

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "()V", line = 45)
	public static void method31599() {
		if (client.anInt3390 * -1850530127 != 16 && client.anInt3390 * -1850530127 != 3 || client.aClass82_2 == null) {
			return;
		}
		while (true) {
			@Pc(17) Interface67 local17 = (Interface67) aLinkedList8.poll();
			if (local17 == null) {
				return;
			}
			local17.method31719();
		}
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(Lclient!gm;Lclient!cd;IIIIILjava/lang/String;Lclient!dj;Lclient!aar;IB)V", line = 846)
	static void method31600(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class90 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7, @OriginalArg(8) Class94 arg8, @OriginalArg(9) Class17 arg9, @OriginalArg(10) int arg10) {
		@Pc(18) int local18;
		if (Class11.anInt36 * -891094135 == 3) {
			local18 = (int) ((double) Class597.aClass107_Sub1_2.method8899() * 2607.5945876176133D) + client.anInt3462 * -2045337339 & 0x3FFF;
		} else if (Class11.anInt36 * -891094135 == 5) {
			local18 = (int) client.aFloat247 & 0x3FFF;
		} else {
			local18 = (int) client.aFloat247 + client.anInt3462 * -2045337339 & 0x3FFF;
		}
		@Pc(55) int local55 = Math.max(arg0.anInt3874 * -881188269 / 2, arg0.anInt3875 * -1279656873 / 2) + 10;
		@Pc(63) int local63 = arg4 * arg4 + arg5 * arg5;
		if (local63 > local55 * local55) {
			return;
		}
		@Pc(73) int local73 = Class436.anIntArray464[local18];
		@Pc(77) int local77 = Class436.anIntArray463[local18];
		if (Class11.anInt36 * -891094135 != 5) {
			local73 = local73 * 256 / (client.anInt3380 * -2002513841 + 256);
			local77 = local77 * 256 / (client.anInt3380 * -2002513841 + 256);
		}
		@Pc(112) int local112 = arg5 * local73 + arg4 * local77 >> 14;
		@Pc(122) int local122 = arg5 * local77 - local73 * arg4 >> 14;
		@Pc(129) int local129 = arg9.method308(arg7, 100, null);
		@Pc(137) int local137 = arg9.method312(arg7, 100, 0, null);
		@Pc(143) int local143 = local112 - local129 / 2;
		if (local143 >= -(arg0.anInt3874 * -881188269) && local143 <= arg0.anInt3874 * -881188269 && local122 >= -(arg0.anInt3875 * -1279656873) && local122 <= arg0.anInt3875 * -1279656873) {
			arg8.method7614(arg7, arg0.anInt3874 * -881188269 / 2 + arg2 + local143, arg0.anInt3875 * -1279656873 / 2 + arg3 - local122 - arg6 - local137, local129, 50, arg10, 0, 1, 0, 0, null, null, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!ug", name = "lo", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 6527)
	static final void method31601(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg0.method26623();
	}

	@OriginalMember(owner = "client!ug", name = "xs", descriptor = "(Lclient!yf;I)V", line = 8652)
	static final void method31602(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class60.aClass138_1.method14222() ? 1 : 0;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class60.aClass138_1.method14242() ? 1 : 0;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class60.aClass138_1.method14235() ? 1 : 0;
	}

	@OriginalMember(owner = "client!ug", name = "aka", descriptor = "(Lclient!yf;I)V", line = 11340)
	static final void method31603(@OriginalArg(0) Class665 arg0) {
		Class219.method25722();
	}

	@OriginalMember(owner = "client!ug", name = "alx", descriptor = "(Lclient!yf;I)V", line = 11448)
	static final void method31604(@OriginalArg(0) Class665 arg0) throws Exception_Sub2 {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(31) Class447 local31 = Class447.method29120((float) local13, (float) local13, (float) local13);
		if (local31.aFloat277 == -1.0F) {
			local31.aFloat277 = Float.POSITIVE_INFINITY;
		}
		if (local31.aFloat276 == -1.0F) {
			local31.aFloat276 = Float.POSITIVE_INFINITY;
		}
		if (-1.0F == local31.aFloat278) {
			local31.aFloat278 = Float.POSITIVE_INFINITY;
		}
		Class597.aClass107_Sub1_2.method8814(local31);
		Class597.aClass107_Sub1_2.method8799((float) local23 / 1000.0F);
		local31.method29130();
	}

	@OriginalMember(owner = "client!ug", name = "ant", descriptor = "(Lclient!yf;I)V", line = 11884)
	static final void method31605(@OriginalArg(0) Class665 arg0) {
		Class20.method414();
	}

	@OriginalMember(owner = "client!ug", name = "anq", descriptor = "(Lclient!yf;I)V", line = 11932)
	static final void method31606(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class68.method976().method36479();
	}

	@OriginalMember(owner = "client!ug", name = "azi", descriptor = "(Lclient!yf;I)V", line = 13723)
	static final void method31607(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.aClass248_1.method26141(local13).method26398(local23);
	}
}
