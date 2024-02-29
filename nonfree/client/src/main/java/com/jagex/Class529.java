package com.jagex;

import com.jagex.twitchtv.TwitchTV;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public class Class529 {

	@OriginalMember(owner = "client!sc", name = "t", descriptor = "I")
	static int anInt5171;

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "Lclient!com/jagex/twitchtv/TwitchTV;")
	static TwitchTV aTwitchTV1;

	@OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
	public int anInt5170;

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "[I")
	public int[] anIntArray481;

	@OriginalMember(owner = "client!sc", name = "v", descriptor = "[I")
	public int[] anIntArray480;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(I)V", line = 11)
	public Class529(@OriginalArg(0) int arg0) {
		this.anInt5170 = arg0 * -1704772327;
		this.anIntArray481 = new int[this.anInt5170 * -942354647];
		this.anIntArray480 = new int[this.anInt5170 * -942354647];
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(Lclient!pw;Ljava/lang/String;Z)Lclient!sc;", line = 18)
	public static Class529 method30715(@OriginalArg(0) Class478 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		@Pc(4) int local4 = arg0.method29764(arg1);
		if (local4 == -1) {
			return new Class529(0);
		}
		@Pc(18) byte[] local18 = arg0.method29725(local4, 1);
		if (local18 == null) {
			return new Class529(0);
		}
		@Pc(30) Class77_Sub39 local30 = new Class77_Sub39(local18);
		@Pc(34) int local34 = local30.method22483();
		@Pc(39) Class529 local39 = new Class529(local34);
		@Pc(41) int local41 = 0;
		while (true) {
			while (local41 < local39.anInt5170 * -942354647) {
				@Pc(51) int local51 = local30.method22500();
				@Pc(55) int local55 = local30.method22483();
				@Pc(59) int local59 = local30.method22478();
				if (!arg2 && local59 == 1) {
					local39.anInt5170 -= -1704772327;
				} else {
					local39.anIntArray481[local41] = local51;
					local39.anIntArray480[local41] = local55;
					local41++;
				}
			}
			return local39;
		}
	}

	@OriginalMember(owner = "client!sc", name = "v", descriptor = "(Lclient!pw;Ljava/lang/String;Z)Lclient!sc;", line = 18)
	public static Class529 method30716(@OriginalArg(0) Class478 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		@Pc(4) int local4 = arg0.method29764(arg1);
		if (local4 == -1) {
			return new Class529(0);
		}
		@Pc(18) byte[] local18 = arg0.method29725(local4, 1);
		if (local18 == null) {
			return new Class529(0);
		}
		@Pc(30) Class77_Sub39 local30 = new Class77_Sub39(local18);
		@Pc(34) int local34 = local30.method22483();
		@Pc(39) Class529 local39 = new Class529(local34);
		@Pc(41) int local41 = 0;
		while (true) {
			while (local41 < local39.anInt5170 * -942354647) {
				@Pc(51) int local51 = local30.method22500();
				@Pc(55) int local55 = local30.method22483();
				@Pc(59) int local59 = local30.method22478();
				if (!arg2 && local59 == 1) {
					local39.anInt5170 -= -1704772327;
				} else {
					local39.anIntArray481[local41] = local51;
					local39.anIntArray480[local41] = local55;
					local41++;
				}
			}
			return local39;
		}
	}

	@OriginalMember(owner = "client!sc", name = "aj", descriptor = "(Lclient!arc;B)V", line = 982)
	static void method30717(@OriginalArg(0) Class77_Sub39_Sub1 arg0) {
		@Pc(2) Class40[] local2 = Class28.method493();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class40 local12 = local2[local4];
			if (local12 != Class40.aClass40_28) {
				@Pc(21) Class478 local21 = (Class478) Class592.aMap21.get(local12);
				if (local21 == null) {
					arg0.method22417(0);
				} else {
					arg0.method22417(local21.method29714());
				}
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "ea", descriptor = "(II)Z", line = 1728)
	static boolean method30718(@OriginalArg(0) int arg0) {
		return arg0 == 15 || arg0 == 9 || arg0 == 7 || arg0 == 16;
	}

	@OriginalMember(owner = "client!sc", name = "hj", descriptor = "(I)V", line = 3801)
	static final void method30719() {
		for (@Pc(1) int local1 = 0; local1 < client.anInt3527 * -1125820437; local1++) {
			@Pc(10) int local10 = client.anIntArray317[local1];
			@Pc(16) Class77_Sub6 local16 = (Class77_Sub6) client.aClass12_22.method173((long) local10);
			if (local16 != null) {
				@Pc(23) Class104_Sub1_Sub1_Sub1_Sub1 local23 = (Class104_Sub1_Sub1_Sub1_Sub1) local16.anObject5;
				Class314.method27366(local23, false);
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "cd", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;B)V", line = 4998)
	static final void method30720(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg0.anInt3885 = arg2.anIntArray536[(arg2.anInt5784 -= 308999563) * 2088438307] * -2004398725;
		Class461.method29531(arg0);
	}

	@OriginalMember(owner = "client!sc", name = "mr", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 6824)
	static final void method30721(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5781 -= 1460193483) * 1485266147];
		if (Class139.method14334(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray22 = Class73.method1040(local13, arg2);
		arg0.aBoolean681 = true;
	}

	@OriginalMember(owner = "client!sc", name = "oi", descriptor = "(Lclient!yf;I)V", line = 7191)
	static final void method30722(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class80_Sub1_Sub1.method1663(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!sc", name = "qo", descriptor = "(Lclient!yf;I)V", line = 7478)
	static final void method30723(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local11.anInt3896 * -1230478387;
	}
}
