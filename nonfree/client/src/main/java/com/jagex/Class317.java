package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public class Class317 {

	@OriginalMember(owner = "client!ic", name = "fi", descriptor = "Lclient!pw;")
	public static Class478 aClass478_94;

	@OriginalMember(owner = "client!ic", name = "p", descriptor = "Lclient!ic;")
	static final Class317 aClass317_12 = new Class317(0);

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "Lclient!ic;")
	static final Class317 aClass317_2 = new Class317(1);

	@OriginalMember(owner = "client!ic", name = "v", descriptor = "Lclient!ic;")
	static final Class317 aClass317_3 = new Class317(2);

	@OriginalMember(owner = "client!ic", name = "l", descriptor = "Lclient!ic;")
	static final Class317 aClass317_4 = new Class317(3);

	@OriginalMember(owner = "client!ic", name = "y", descriptor = "Lclient!ic;")
	static final Class317 aClass317_5 = new Class317(4);

	@OriginalMember(owner = "client!ic", name = "w", descriptor = "Lclient!ic;")
	static final Class317 aClass317_1 = new Class317(5);

	@OriginalMember(owner = "client!ic", name = "t", descriptor = "Lclient!ic;")
	static final Class317 aClass317_7 = new Class317(6);

	@OriginalMember(owner = "client!ic", name = "q", descriptor = "Lclient!ic;")
	static final Class317 aClass317_8 = new Class317(7);

	@OriginalMember(owner = "client!ic", name = "x", descriptor = "Lclient!ic;")
	static final Class317 aClass317_13 = new Class317(8);

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "Lclient!ic;")
	static final Class317 aClass317_10 = new Class317(9);

	@OriginalMember(owner = "client!ic", name = "s", descriptor = "Lclient!ic;")
	static final Class317 aClass317_9 = new Class317(10);

	@OriginalMember(owner = "client!ic", name = "r", descriptor = "Lclient!ic;")
	static final Class317 aClass317_11 = new Class317(11);

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "Lclient!ic;")
	static final Class317 aClass317_14 = new Class317(12);

	@OriginalMember(owner = "client!ic", name = "z", descriptor = "Lclient!ic;")
	static final Class317 aClass317_6 = new Class317(13);

	@OriginalMember(owner = "client!ic", name = "j", descriptor = "Lclient!ic;")
	static final Class317 aClass317_15 = new Class317(14);

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
	final int anInt4070;

	@OriginalMember(owner = "client!ic", name = "p", descriptor = "(B)[Lclient!ht;", line = 14)
	static Class309[] method27385() {
		return new Class309[] { Class309.aClass309_2, Class309.aClass309_3, Class309.aClass309_4 };
	}

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(I)V", line = 21)
	Class317(@OriginalArg(0) int arg0) {
		this.anInt4070 = arg0 * 734676979;
	}

	@OriginalMember(owner = "client!ic", name = "hj", descriptor = "(Lclient!yf;I)V", line = 5838)
	static final void method27386(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class77_Sub19.method13488(local16, local22, true, 1, arg0);
	}

	@OriginalMember(owner = "client!ic", name = "jv", descriptor = "(IIIIIIIB)V", line = 6215)
	static final void method27387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (client.anInt3443 * -1468443459 != 1) {
			return;
		}
		@Pc(9) int local9 = Class152.anInt2399 * -1843550713;
		@Pc(11) int[] local11 = Class152.anIntArray221;
		@Pc(13) int local13;
		for (local13 = 0; local13 < local9; local13++) {
			@Pc(22) Class104_Sub1_Sub1_Sub1_Sub2 local22 = client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[local11[local13]];
			if (local22 != null) {
				local22.method21127(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
			}
		}
		for (local13 = 0; local13 < client.anInt3527 * -1125820437; local13++) {
			@Pc(48) int local48 = client.anIntArray317[local13];
			@Pc(54) Class77_Sub6 local54 = (Class77_Sub6) client.aClass12_22.method173((long) local48);
			if (local54 != null) {
				((Class104_Sub1_Sub1_Sub1) local54.anObject5).method21127(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "auc", descriptor = "(Lclient!yf;I)V", line = 13077)
	static final void method27388(@OriginalArg(0) Class665 arg0) {
		Class471.method29623();
		Class209.method25586();
		client.aClass517_1.method30486();
		Class667.method33150();
		client.aBoolean593 = false;
	}
}
