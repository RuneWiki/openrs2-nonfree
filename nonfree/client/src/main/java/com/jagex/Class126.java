package com.jagex;

import com.jagex.twitchtv.TwitchWebcamFrameData;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public abstract class Class126 {

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V", line = 4)
	Class126() {
	}

	@OriginalMember(owner = "client!pb", name = "ax", descriptor = "(III)I", line = 473)
	public static int method11564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Class574.aTwitchWebcamFrameData1 = new TwitchWebcamFrameData();
		return arg0 >= 0 && arg0 < Class574.aTwitchWebcamDeviceArray1.length ? Class529.aTwitchTV1.StartWebcamDevice(Class574.aTwitchWebcamDeviceArray1[arg0].l * -455097687, arg1) : -1;
	}

	@OriginalMember(owner = "client!pb", name = "ad", descriptor = "(I)V", line = 486)
	static void method11565() {
		Class574.aTwitchWebcamDeviceArray1 = Class529.aTwitchTV1.GetWebcamDevices();
	}

	@OriginalMember(owner = "client!pb", name = "aub", descriptor = "(Lclient!yf;I)V", line = 13062)
	static final void method11566(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
	}

	@OriginalMember(owner = "client!pb", name = "z", descriptor = "(I)I")
	abstract int method11567(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pb", name = "i", descriptor = "(I)[B")
	abstract byte[] method11568(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(II)[B")
	abstract byte[] method11569(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pb", name = "v", descriptor = "(II)V")
	abstract void method11570(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pb", name = "l", descriptor = "(II)I")
	abstract int method11571(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pb", name = "w", descriptor = "()Lclient!pm;")
	abstract Class468 method11572();

	@OriginalMember(owner = "client!pb", name = "t", descriptor = "(I)V")
	abstract void method11573(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pb", name = "q", descriptor = "(I)V")
	abstract void method11574(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pb", name = "x", descriptor = "(I)V")
	abstract void method11575(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "(I)V")
	abstract void method11576(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pb", name = "s", descriptor = "(I)V")
	abstract void method11577(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pb", name = "r", descriptor = "(I)I")
	abstract int method11578(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "(I)I")
	abstract int method11579(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pb", name = "j", descriptor = "(I)[B")
	abstract byte[] method11580(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pb", name = "p", descriptor = "(I)Lclient!pm;")
	abstract Class468 method11581();

	@OriginalMember(owner = "client!pb", name = "y", descriptor = "()Lclient!pm;")
	abstract Class468 method11582();
}
