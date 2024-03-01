package com.jagex;

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public class Class394 {

	@OriginalMember(owner = "client!pm", name = "p", descriptor = "I")
	int anInt4758;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
	int anInt4757;

	@OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
	int anInt4760;

	@OriginalMember(owner = "client!pm", name = "l", descriptor = "I")
	int anInt4759;

	@OriginalMember(owner = "client!pm", name = "h", descriptor = "Ljava/lang/String;")
	String aString216;

	@OriginalMember(owner = "client!pm", name = "h", descriptor = "(Lclient!ud;I)V", line = 13)
	public static void method27447(@OriginalArg(0) Interface54 arg0) {
		if (IcmpService_Sub1.anIcmpService_Sub1_1 == null) {
			throw new IllegalStateException("");
		}
		IcmpService_Sub1.anIcmpService_Sub1_1.aList2.add(arg0);
	}

	@OriginalMember(owner = "client!pm", name = "i", descriptor = "(IZI)Lclient!agq;", line = 37)
	public static Class3_Sub32 method27446(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) Class3_Sub32[] local2 = Class3_Sub32.aClass3_Sub32Array1;
		synchronized (Class3_Sub32.aClass3_Sub32Array1) {
			if (Class3_Sub32.anInt1341 * 2037424989 == 0) {
				return new Class3_Sub32(arg0, arg1);
			} else {
				Class3_Sub32.aClass3_Sub32Array1[(Class3_Sub32.anInt1341 -= -676345611) * 2037424989].method11713(arg0, arg1);
				return Class3_Sub32.aClass3_Sub32Array1[Class3_Sub32.anInt1341 * 2037424989];
			}
		}
	}

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(IIIILjava/lang/String;)V", line = 873)
	public Class394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4) {
		this.anInt4758 = arg0 * 1928176039;
		this.anInt4757 = arg1 * -424284059;
		this.anInt4760 = arg2 * -1383572945;
		this.anInt4759 = arg3 * 7281731;
		this.aString216 = arg4;
	}

	@OriginalMember(owner = "client!pm", name = "p", descriptor = "(I)I", line = 882)
	int method27431() {
		return this.anInt4758 * 1546712599;
	}

	@OriginalMember(owner = "client!pm", name = "x", descriptor = "()I", line = 882)
	int method27436() {
		return this.anInt4758 * 1546712599;
	}

	@OriginalMember(owner = "client!pm", name = "s", descriptor = "()I", line = 882)
	int method27437() {
		return this.anInt4758 * 1546712599;
	}

	@OriginalMember(owner = "client!pm", name = "u", descriptor = "()I", line = 882)
	int method27443() {
		return this.anInt4758 * 1546712599;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)I", line = 886)
	int method27432() {
		return this.anInt4757 * -1626128019;
	}

	@OriginalMember(owner = "client!pm", name = "y", descriptor = "()I", line = 886)
	int method27439() {
		return this.anInt4757 * -1626128019;
	}

	@OriginalMember(owner = "client!pm", name = "g", descriptor = "(S)I", line = 890)
	int method27433() {
		return this.anInt4760 * -135189297;
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "()I", line = 890)
	int method27440() {
		return this.anInt4760 * -135189297;
	}

	@OriginalMember(owner = "client!pm", name = "l", descriptor = "(I)I", line = 894)
	int method27434() {
		return this.anInt4759 * 970526827;
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "()I", line = 894)
	int method27438() {
		return this.anInt4759 * 970526827;
	}

	@OriginalMember(owner = "client!pm", name = "z", descriptor = "()I", line = 894)
	int method27441() {
		return this.anInt4759 * 970526827;
	}

	@OriginalMember(owner = "client!pm", name = "h", descriptor = "(B)Ljava/lang/String;", line = 898)
	String method27435() {
		return this.aString216;
	}

	@OriginalMember(owner = "client!pm", name = "j", descriptor = "()Ljava/lang/String;", line = 898)
	String method27442() {
		return this.aString216;
	}

	@OriginalMember(owner = "client!pm", name = "gf", descriptor = "(ZI)V", line = 2452)
	public static final void method27445(@OriginalArg(0) boolean arg0) {
		@Pc(1) Class82[] local1 = client.aClass82Array1;
		for (@Pc(3) int local3 = 0; local3 < local1.length; local3++) {
			@Pc(11) Class82 local11 = local1[local3];
			try {
				local11.method21617();
			} catch (@Pc(16) IOException local16) {
			}
			local11.method21604();
		}
		Class23.method5942();
		Class604.method33534(false);
		client.aClass370_1.method26962();
		client.aClass370_1.method26981();
		client.aClass370_1.method26965();
		Class473.method28782();
		Class209.method24237();
		Class606.method33538(true);
		Class591.method33333();
		Class330.method26174();
		client.anInt3115 = 447017549;
		if (arg0) {
			Class166.method23342(10);
			return;
		}
		Class166.method23342(2);
		try {
			Class588.method33291(Class524.anApplet2, "loggedout");
		} catch (@Pc(64) Throwable local64) {
		}
	}

	@OriginalMember(owner = "client!pm", name = "ais", descriptor = "(Lclient!vs;I)V", line = 10546)
	static final void method27444(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 1248498196;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(33) int local33 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2];
		@Pc(43) int local43 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 3];
		@Pc(47) Class464 local47 = client.aClass370_1.method26942();
		Class556.method32809((local13 >> 14 & 0x3FFF) - local47.anInt5071 * -1567811631, (local13 & 0x3FFF) - local47.anInt5073 * 1360175441, local23 << 2, local33, local43, false);
	}
}
