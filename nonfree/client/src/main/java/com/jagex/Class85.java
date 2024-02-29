package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public abstract class Class85 {

	@OriginalMember(owner = "client!dh", name = "z", descriptor = "S")
	static short aShort12;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "()V", line = 4)
	Class85() {
	}

	@OriginalMember(owner = "client!dh", name = "p", descriptor = "(B)I", line = 22)
	static int method4905() {
		return (Class304.anInt4056 += -1583824911) * 304107793 - 1;
	}

	@OriginalMember(owner = "client!dh", name = "em", descriptor = "(III)V", line = 958)
	public static void method4906(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Class136_Sub1.anInt1703 = (arg0 - Class136_Sub1.anInt1674) * -1421361991;
		Class136_Sub1.anInt1704 = (arg1 - Class136_Sub1.anInt1675) * 2017528667;
	}

	@OriginalMember(owner = "client!dh", name = "dk", descriptor = "(Lclient!yf;I)V", line = 5143)
	static final void method4907(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class94.method7651(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!dh", name = "pc", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;B)V", line = 7314)
	static final void method4908(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5781 -= 1460193483) * 1485266147];
		if (Class139.method14334(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray30 = Class73.method1040(local13, arg2);
		arg0.aBoolean681 = true;
	}

	@OriginalMember(owner = "client!dh", name = "azq", descriptor = "(Lclient!yf;B)V", line = 13774)
	static final void method4909(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(19) String local19 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		@Pc(27) int local27 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(37) int local37 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		if (!Class330.method27593(local19.charAt(0))) {
			throw new RuntimeException();
		} else if (local19.isEmpty() || local19.length() > 10) {
			throw new RuntimeException();
		} else if (!Class205.aClass299_1.method27083(local19, local27, local37)) {
			throw new RuntimeException();
		}
	}
}
