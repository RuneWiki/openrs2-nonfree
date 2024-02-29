package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public class Class385 {

	@OriginalMember(owner = "client!lr", name = "p", descriptor = "Lclient!lr;")
	public static final Class385 aClass385_8 = new Class385();

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "Lclient!lr;")
	public static final Class385 aClass385_5 = new Class385();

	@OriginalMember(owner = "client!lr", name = "v", descriptor = "Lclient!lr;")
	public static final Class385 aClass385_4 = new Class385();

	@OriginalMember(owner = "client!lr", name = "l", descriptor = "Lclient!lr;")
	public static final Class385 aClass385_6 = new Class385();

	@OriginalMember(owner = "client!lr", name = "y", descriptor = "Lclient!lr;")
	public static final Class385 aClass385_2 = new Class385();

	@OriginalMember(owner = "client!lr", name = "w", descriptor = "Lclient!lr;")
	public static final Class385 aClass385_7 = new Class385();

	@OriginalMember(owner = "client!lr", name = "t", descriptor = "Lclient!lr;")
	public static final Class385 aClass385_3 = new Class385();

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "()V", line = 32)
	Class385() {
	}

	@OriginalMember(owner = "client!lr", name = "hk", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;S)V", line = 5873)
	static final void method28342(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg0.anInt3888 = -1070830455;
		arg0.anInt3889 = arg2.anIntArray536[(arg2.anInt5784 -= 308999563) * 2088438307] * 931070365;
		if (arg0.anInt3927 * 1365669833 == -1 && !arg1.aBoolean662) {
			Class623.method32473(arg0.anInt3863 * -1278450723);
		}
	}

	@OriginalMember(owner = "client!lr", name = "oy", descriptor = "(Lclient!yf;S)V", line = 7244)
	static final void method28343(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class556.method31254(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!lr", name = "acq", descriptor = "(Lclient!yf;B)V", line = 9489)
	static final void method28344(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = (int) (Math.random() * (double) local12);
	}

	@OriginalMember(owner = "client!lr", name = "ka", descriptor = "(IILclient!gm;B)V", line = 10752)
	static void method28345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class277 arg2) {
		@Pc(6) int local6 = arg0 + arg2.anInt3874 * -881188269;
		@Pc(10) int local10 = arg1 + 15;
		if (!client.aBoolean626) {
			return;
		}
		@Pc(14) int local14 = -256;
		if (client.anInt3362 * 1720947399 < 20) {
			local14 = -65536;
		}
		Class128_Sub1.aClass94_5.method7607("Fps:" + client.anInt3362 * 1720947399 + " (" + client.anInt3363 * -482787859 + " ms)", local6, local10, local14, -1);
		local10 += 15;
		@Pc(49) Runtime local49 = Runtime.getRuntime();
		@Pc(54) long local54 = local49.totalMemory() / 1024L;
		@Pc(61) long local61 = local54 - local49.freeMemory() / 1024L;
		@Pc(63) int local63 = -256;
		if (local61 > 262144L) {
			local63 = -65536;
		}
		Class128_Sub1.aClass94_5.method7607("Mem:" + local61 + "/" + local54 + "k", local6, local10, local63, -1);
		local10 += 15;
		@Pc(96) long local96 = client.aClass82_2.aClass459_1.method29506();
		@Pc(98) String local98 = "N/A";
		if (local96 != -1L) {
			local98 = local96 + "ms";
			if (local96 > 500L) {
				local98 = Class192.method25433(16711680) + local98 + Class192.method25433(16776960);
			}
		}
		Class128_Sub1.aClass94_5.method7607("Game: In:" + client.aClass82_2.anInt321 * 749941029 + "B/s " + "Out:" + client.aClass82_2.anInt326 * -939451607 + "B/s " + "Ping:" + local98, local6, local10, -256, -1);
		local10 += 15;
		@Pc(169) long local169 = client.aClass82_1.aClass459_1.method29506();
		@Pc(171) String local171 = "N/A";
		if (local169 != -1L) {
			local171 = local169 + "ms";
			if (local169 > 500L) {
				local171 = Class192.method25433(16711680) + local171 + Class192.method25433(16776960);
			}
		}
		Class128_Sub1.aClass94_5.method7607("Lobby: In:" + client.aClass82_1.anInt321 * 749941029 + "B/s " + "Out:" + client.aClass82_1.anInt326 * -939451607 + "B/s " + "Ping:" + local171, local6, local10, -256, -1);
		local10 += 15;
		@Pc(242) int local242 = Class284.aClass86_9.method20049() / 1024;
		Class128_Sub1.aClass94_5.method7607("Offheap:" + local242 + "k", local6, local10, local242 > 65536 ? -65536 : -256, -1);
		local10 += 15;
		@Pc(267) int local267 = 0;
		@Pc(269) int local269 = 0;
		@Pc(271) int local271 = 0;
		for (@Pc(273) int local273 = 0; local273 < Class503.aClass126_Sub1Array2.length; local273++) {
			if (Class503.aClass126_Sub1Array2[local273] != null && Class503.aClass126_Sub1Array2[local273].method11614()) {
				local267 += Class503.aClass126_Sub1Array2[local273].method11604();
				local269 += Class503.aClass126_Sub1Array2[local273].method11608();
				local271 += Class503.aClass126_Sub1Array2[local273].method11609();
			}
		}
		@Pc(326) long local326 = local267 == 0 ? 0L : (long) local271 * 100L / (long) local267;
		@Pc(339) long local339 = local267 == 0 ? 0L : (long) local269 * 10000L / (long) local267;
		@Pc(359) String local359 = "Cache:" + Class102.method7917(local339, 2, true, Class667.aClass667_6) + "% (" + local326 + "%)";
		Class248.aClass94_7.method7607(local359, local6, local10, -256, -1);
		local10 += 12;
	}
}
