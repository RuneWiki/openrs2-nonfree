package com.jagex;

import com.jagex.twitchtv.TwitchWebcamDevice;
import com.jagex.twitchtv.TwitchWebcamDeviceCapability;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public class Class173 implements Interface20 {

	@OriginalMember(owner = "client!bl", name = "y", descriptor = "I")
	static int anInt3294;

	@OriginalMember(owner = "client!bl", name = "ff", descriptor = "Lclient!pw;")
	public static Class478 aClass478_87;

	@OriginalMember(owner = "client!bl", name = "pa", descriptor = "I")
	static int anInt3295;

	@OriginalMember(owner = "client!bl", name = "p", descriptor = "I")
	int anInt3292;

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
	int anInt3293;

	@OriginalMember(owner = "client!bl", name = "v", descriptor = "[F")
	float[] aFloatArray92;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(II)V", line = 10)
	Class173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3292 = arg0 * -828002397;
		this.anInt3293 = arg1 * 1704609127;
		this.aFloatArray92 = new float[this.anInt3293 * 339609175 * 1306524683 * this.anInt3292];
	}

	@OriginalMember(owner = "client!bl", name = "p", descriptor = "(I)[Lclient!zy;", line = 14)
	static Class705[] method24539() {
		return new Class705[] { Class705.aClass705_2, Class705.aClass705_4, Class705.aClass705_6, Class705.aClass705_5, Class705.aClass705_3 };
	}

	@OriginalMember(owner = "client!bl", name = "l", descriptor = "()I", line = 17)
	@Override
	public int method30325() {
		return this.anInt3292 * 1306524683;
	}

	@OriginalMember(owner = "client!bl", name = "y", descriptor = "()I", line = 17)
	@Override
	public int method30326() {
		return this.anInt3292 * 1306524683;
	}

	@OriginalMember(owner = "client!bl", name = "p", descriptor = "()I", line = 17)
	@Override
	public int method30324() {
		return this.anInt3292 * 1306524683;
	}

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "()I", line = 21)
	@Override
	public int method30329() {
		return this.anInt3293 * 339609175;
	}

	@OriginalMember(owner = "client!bl", name = "w", descriptor = "()I", line = 21)
	@Override
	public int method30323() {
		return this.anInt3293 * 339609175;
	}

	@OriginalMember(owner = "client!bl", name = "t", descriptor = "()I", line = 21)
	@Override
	public int method30328() {
		return this.anInt3293 * 339609175;
	}

	@OriginalMember(owner = "client!bl", name = "q", descriptor = "()I", line = 21)
	@Override
	public int method30330() {
		return this.anInt3293 * 339609175;
	}

	@OriginalMember(owner = "client!bl", name = "x", descriptor = "()I", line = 21)
	@Override
	public int method30327() {
		return this.anInt3293 * 339609175;
	}

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "()I", line = 21)
	@Override
	public int method30331() {
		return this.anInt3293 * 339609175;
	}

	@OriginalMember(owner = "client!bl", name = "r", descriptor = "()V", line = 24)
	@Override
	public void method30321() {
	}

	@OriginalMember(owner = "client!bl", name = "s", descriptor = "()V", line = 24)
	@Override
	public void method30320() {
	}

	@OriginalMember(owner = "client!bl", name = "v", descriptor = "()V", line = 24)
	@Override
	public void method30322() {
	}

	@OriginalMember(owner = "client!bl", name = "g", descriptor = "()V", line = 24)
	@Override
	public void method30319() {
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(Lclient!yf;B)V", line = 160)
	static void method24540(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(27) TwitchWebcamDevice local27 = Class562.method31323(local13);
		@Pc(29) TwitchWebcamDeviceCapability local29 = null;
		if (local27 != null) {
			local29 = local27.c(local23);
		}
		if (local29 != null) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local29.p * -1656448669;
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local29.c * -1356474957;
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local29.v * -1260779495;
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local29.l * -1646869335;
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local29.y * -2026063923;
			return;
		}
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
	}

	@OriginalMember(owner = "client!bl", name = "fx", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;B)V", line = 5550)
	static final void method24541(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg2.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg2.anIntArray536[arg2.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg2.anIntArray536[arg2.anInt5784 * 2088438307 + 1];
		@Pc(29) Class67 local29 = (Class67) Class77_Sub13_Sub12.aClass35_Sub22_1.method18319(local13);
		if (local23 == local29.anInt198 * 263946597) {
			arg0.method26650(local13);
		} else {
			arg0.method26644(local13, local23);
		}
	}

	@OriginalMember(owner = "client!bl", name = "xg", descriptor = "(Lclient!yf;B)V", line = 8743)
	static final void method24542(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(26) String local26 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		if (local12 == -1) {
			throw new RuntimeException();
		}
		@Pc(39) Class36 local39 = (Class36) Class663.aClass35_Sub21_1.method18319(local12);
		if (local39.aClass498_1 != Class498.aClass498_158) {
			throw new RuntimeException();
		}
		@Pc(52) int[] local52 = local39.method631(local26);
		@Pc(54) int local54 = 0;
		if (local52 != null) {
			local54 = local52.length;
		}
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local54;
	}

	@OriginalMember(owner = "client!bl", name = "ars", descriptor = "(Lclient!yf;S)V", line = 12507)
	static final void method24543(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
	}

	@OriginalMember(owner = "client!bl", name = "axs", descriptor = "(Lclient!yf;B)V", line = 13458)
	static final void method24544(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.anInt3470 * 476125061 == arg0.aClass104_Sub1_Sub1_Sub1_4.method21144() ? 1 : 0;
	}
}
