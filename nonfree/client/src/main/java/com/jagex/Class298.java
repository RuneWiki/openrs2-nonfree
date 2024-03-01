package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public class Class298 {

	@OriginalMember(owner = "client!lh", name = "s", descriptor = "I")
	public static final int anInt4394 = 24;

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "I")
	public static final int anInt4395 = 22;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
	public static final int anInt4396 = 2;

	@OriginalMember(owner = "client!lh", name = "l", descriptor = "I")
	public static final int anInt4397 = 14;

	@OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
	public static final int anInt4398 = 17;

	@OriginalMember(owner = "client!lh", name = "x", descriptor = "I")
	public static final int anInt4399 = 1;

	@OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
	public static final int anInt4400 = 28;

	@OriginalMember(owner = "client!lh", name = "u", descriptor = "I")
	public static final int anInt4401 = 7;

	@OriginalMember(owner = "client!lh", name = "y", descriptor = "I")
	public static final int anInt4402 = 21;

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
	public static final int anInt4403 = 13;

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
	public static final int anInt4404 = 27;

	@OriginalMember(owner = "client!lh", name = "z", descriptor = "I")
	public static final int anInt4405 = 6;

	@OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
	public static final int anInt4406 = 11;

	@OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
	public static final int anInt4407 = 4;

	@OriginalMember(owner = "client!lh", name = "m", descriptor = "I")
	public static final int anInt4408 = 10;

	@OriginalMember(owner = "client!lh", name = "r", descriptor = "I")
	public static final int anInt4409 = 23;

	@OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
	public static final int anInt4410 = 26;

	@OriginalMember(owner = "client!lh", name = "q", descriptor = "I")
	public static final int anInt4411 = 19;

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
	public static final int anInt4412 = 25;

	@OriginalMember(owner = "client!lh", name = "v", descriptor = "I")
	public static final int anInt4413 = 9;

	@OriginalMember(owner = "client!lh", name = "t", descriptor = "I")
	public static final int anInt4414 = 8;

	@OriginalMember(owner = "client!lh", name = "w", descriptor = "I")
	public static final int anInt4415 = 3;

	@OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
	public static final int anInt4416 = 15;

	@OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
	public static final int anInt4417 = 29;

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
	public static final int anInt4418 = 16;

	@OriginalMember(owner = "client!lh", name = "k", descriptor = "I")
	public static final int anInt4419 = 20;

	@OriginalMember(owner = "client!lh", name = "db", descriptor = "Lclient!ahy;")
	public static Class3_Sub47 aClass3_Sub47_1;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V", line = 31)
	Class298() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!lh", name = "g", descriptor = "(I)V", line = 37)
	public static void method25634() {
		if (Class514.aClass48_6 != null) {
			Class514.aClass48_6.method9511();
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IS)Lclient!kb;", line = 99)
	public static Class271 method25629(@OriginalArg(0) int arg0) {
		@Pc(5) Class271 local5 = (Class271) Class271.aClass161_31.method23219((long) arg0);
		if (local5 != null) {
			return local5;
		}
		@Pc(16) byte[] local16 = Class271.aClass359_50.method26713(0, arg0);
		local5 = new Class271();
		if (local16 != null) {
			local5.method25293(new Class3_Sub41(local16));
		}
		local5.method25306();
		Class271.aClass161_31.method23222(local5, (long) arg0);
		return local5;
	}

	@OriginalMember(owner = "client!lh", name = "az", descriptor = "(Lclient!vs;I)V", line = 4061)
	static final void method25630(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 312124549;
	}

	@OriginalMember(owner = "client!lh", name = "km", descriptor = "(IILclient!fo;I)V", line = 10134)
	static void method25632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class178 arg2) {
		@Pc(6) int local6 = arg0 + arg2.anInt3498 * -1494060731;
		@Pc(10) int local10 = arg1 + 15;
		if (!client.aBoolean574) {
			return;
		}
		@Pc(14) int local14 = -256;
		if (client.anInt3019 * 1617726299 < 20) {
			local14 = -65536;
		}
		Class454.aClass14_12.method3309("Fps:" + client.anInt3019 * 1617726299 + " (" + client.anInt3027 * 222336985 + " ms)", local6, local10, local14, -1);
		local10 += 15;
		@Pc(49) Runtime local49 = Runtime.getRuntime();
		@Pc(54) long local54 = local49.totalMemory() / 1024L;
		@Pc(61) long local61 = local54 - local49.freeMemory() / 1024L;
		@Pc(63) int local63 = -256;
		if (local61 > 262144L) {
			local63 = -65536;
		}
		Class454.aClass14_12.method3309("Mem:" + local61 + "/" + local54 + "k", local6, local10, local63, -1);
		local10 += 15;
		@Pc(96) long local96 = client.aClass82_2.aClass382_1.method27307();
		@Pc(98) String local98 = "N/A";
		if (local96 != -1L) {
			local98 = local96 + "ms";
			if (local96 > 500L) {
				local98 = Class271.method25310(16711680) + local98 + Class271.method25310(16776960);
			}
		}
		Class454.aClass14_12.method3309("Game: In:" + client.aClass82_2.anInt2922 * 1206402479 + "B/s " + "Out:" + client.aClass82_2.anInt2921 * -653192553 + "B/s " + "Ping:" + local98, local6, local10, -256, -1);
		local10 += 15;
		@Pc(169) long local169 = client.aClass82_1.aClass382_1.method27307();
		@Pc(171) String local171 = "N/A";
		if (local169 != -1L) {
			local171 = local169 + "ms";
			if (local169 > 500L) {
				local171 = Class271.method25310(16711680) + local171 + Class271.method25310(16776960);
			}
		}
		Class454.aClass14_12.method3309("Lobby: In:" + client.aClass82_1.anInt2922 * 1206402479 + "B/s " + "Out:" + client.aClass82_1.anInt2921 * -653192553 + "B/s " + "Ping:" + local171, local6, local10, -256, -1);
		local10 += 15;
		@Pc(242) int local242 = Class613.aClass21_13.method17157() / 1024;
		Class454.aClass14_12.method3309("Offheap:" + local242 + "k", local6, local10, local242 > 65536 ? -65536 : -256, -1);
		local10 += 15;
		@Pc(267) int local267 = 0;
		@Pc(269) int local269 = 0;
		@Pc(271) int local271 = 0;
		@Pc(273) int local273;
		for (local273 = 0; local273 < Class296.aClass46_Sub1Array1.length; local273++) {
			if (Class296.aClass46_Sub1Array1[local273] != null && Class296.aClass46_Sub1Array1[local273].method8530()) {
				local267 += Class296.aClass46_Sub1Array1[local273].method8531();
				local269 += Class296.aClass46_Sub1Array1[local273].method8532();
				local271 += Class296.aClass46_Sub1Array1[local273].method8533();
			}
		}
		local273 = local267 == 0 ? 0 : local271 * 100 / local267;
		@Pc(335) int local335 = local267 == 0 ? 0 : local269 * 10000 / local267;
		@Pc(356) String local356 = "Cache:" + Class532.method32500((long) local335, 2, true, Class530.aClass530_9) + "% (" + local273 + "%)";
		Class418.aClass14_11.method3309(local356, local6, local10, -256, -1);
		local10 += 12;
	}

	@OriginalMember(owner = "client!lh", name = "kh", descriptor = "(ZI)V", line = 10211)
	static final void method25633(@OriginalArg(0) boolean arg0) {
		Class338.method26415(client.anInt3125 * -1579500007, Class128.anInt3317 * 2037417253, Class575.anInt5428 * 1261116487, arg0);
	}

	@OriginalMember(owner = "client!lh", name = "apf", descriptor = "(Lclient!vs;I)V", line = 11639)
	static final void method25631(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.aBoolean567 ? 1 : 0;
	}
}
