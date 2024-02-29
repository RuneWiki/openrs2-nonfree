package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!acw")
public class Class69 {

	@OriginalMember(owner = "client!acw", name = "p", descriptor = "I")
	public static final int anInt200 = 8;

	@OriginalMember(owner = "client!acw", name = "<init>", descriptor = "()V", line = 6)
	Class69() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!acw", name = "ar", descriptor = "(IB)I", line = 479)
	public static int method984(@OriginalArg(0) int arg0) {
		Class574.aTwitchWebcamFrameData1 = null;
		Class574.aClass83_36 = null;
		return arg0 >= 0 && arg0 < Class574.aTwitchWebcamDeviceArray1.length ? Class529.aTwitchTV1.StopWebcamDevice(Class574.aTwitchWebcamDeviceArray1[arg0].l * -455097687) : -1;
	}
}
