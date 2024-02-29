package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ux")
public class Class586 {

	@OriginalMember(owner = "client!ux", name = "<init>", descriptor = "()V", line = 7)
	Class586() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!ux", name = "v", descriptor = "(Lclient!akv;)Lclient!uf;", line = 12)
	public static Interface64 method31728(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(5) Class592 local5 = Class327.method27538(arg0.method22478());
		if (local5 == Class592.aClass592_3) {
			return Class35_Sub17.method17429(arg0);
		} else if (Class592.aClass592_2 == local5) {
			return Class77.method24067(arg0);
		} else if (local5 == Class592.aClass592_1) {
			return Class551.method30989(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ux", name = "c", descriptor = "(Lclient!akv;)Lclient!uf;", line = 12)
	public static Interface64 method31729(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(5) Class592 local5 = Class327.method27538(arg0.method22478());
		if (local5 == Class592.aClass592_3) {
			return Class35_Sub17.method17429(arg0);
		} else if (Class592.aClass592_2 == local5) {
			return Class77.method24067(arg0);
		} else if (local5 == Class592.aClass592_1) {
			return Class551.method30989(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ux", name = "v", descriptor = "(Lclient!dx;J)V", line = 57)
	public static void method31730(@OriginalArg(0) Class86 arg0, @OriginalArg(1) long arg1) {
		Class622.anInt5634 = Class622.anInt5636 * 407378687;
		Class622.anInt5636 = 0;
		Class280.method26667();
		@Pc(11) Iterator local11 = Class622.aList24.iterator();
		while (local11.hasNext()) {
			@Pc(18) Class626 local18 = (Class626) local11.next();
			@Pc(23) boolean local23 = local18.method32509(arg0, arg1);
			if (!local23) {
				local11.remove();
				OutputStream_Sub1.aClass626Array1[Class622.anInt5632 * -2056179105] = local18;
				Class622.anInt5632 = (Class622.anInt5632 * -2056179105 + 1 & Class214.anIntArray351[-1429983313 * Class622.anInt5637]) * -80762465;
			}
		}
	}

	@OriginalMember(owner = "client!ux", name = "mz", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 6891)
	static final void method31731(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5781 -= 1460193483) * 1485266147];
		if (Class139.method14334(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray26 = Class73.method1040(local13, arg2);
		arg0.aBoolean681 = true;
	}

	@OriginalMember(owner = "client!ux", name = "aij", descriptor = "(Lclient!yf;B)V", line = 10804)
	static final void method31732(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		Class77_Sub2.method21792(local12 >> 14 & 0x3FFF, local12 & 0x3FFF);
	}

	@OriginalMember(owner = "client!ux", name = "lk", descriptor = "(I)V", line = 11685)
	public static final void method31733() {
		client.aBoolean624 = true;
	}
}
