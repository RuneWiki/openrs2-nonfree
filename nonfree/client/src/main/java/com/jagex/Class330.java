package com.jagex;

import java.util.HashMap;
import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ms")
public class Class330 {

	@OriginalMember(owner = "client!ms", name = "g", descriptor = "I")
	public static final int anInt4588 = 1;

	@OriginalMember(owner = "client!ms", name = "h", descriptor = "I")
	public static final int anInt4589 = 3;

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "I")
	public static final int anInt4590 = 0;

	@OriginalMember(owner = "client!ms", name = "l", descriptor = "I")
	public static final int anInt4591 = 2;

	@OriginalMember(owner = "client!ms", name = "p", descriptor = "I")
	public static final int anInt4592 = 4;

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "()V", line = 10)
	Class330() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "([BILjava/lang/CharSequence;I)I", line = 21)
	public static int method26175(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) CharSequence arg2) {
		@Pc(2) int local2 = arg2.length();
		@Pc(4) int local4 = arg1;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			@Pc(13) char local13 = arg2.charAt(local6);
			if (local13 <= 127) {
				arg0[local4++] = (byte) local13;
			} else if (local13 <= 2047) {
				arg0[local4++] = (byte) (local13 >> 6 | 0xC0);
				arg0[local4++] = (byte) (local13 & 0x3F | 0x80);
			} else {
				arg0[local4++] = (byte) (local13 >> 12 | 0xE0);
				arg0[local4++] = (byte) (local13 >> 6 & 0x3F | 0x80);
				arg0[local4++] = (byte) (local13 & 0x3F | 0x80);
			}
		}
		return local4 - arg1;
	}

	@OriginalMember(owner = "client!ms", name = "h", descriptor = "([Lclient!zf;I)Ljava/util/Map;", line = 30)
	public static Map method26173(@OriginalArg(0) Class70_Sub1[] arg0) {
		if (arg0 == null || arg0.length == 0) {
			return null;
		}
		@Pc(10) HashMap local10 = new HashMap();
		@Pc(12) Class70_Sub1[] local12 = arg0;
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(22) Class70_Sub1 local22 = local12[local14];
			local10.put(local22.aClass43_72, local22);
		}
		return local10;
	}

	@OriginalMember(owner = "client!ms", name = "fr", descriptor = "(I)V", line = 2427)
	static final void method26174() {
		Class161.method23267();
		client.aClass370_1.method26981();
		@Pc(6) int local6;
		for (local6 = 0; local6 < client.aClass68Array1.length; local6++) {
			client.aClass68Array1[local6] = null;
		}
		for (local6 = 0; local6 < client.aClass398Array1.length; local6++) {
			client.aClass398Array1[local6] = null;
		}
		Class11.method1214();
		for (local6 = 0; local6 < 2048; local6++) {
			client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[local6] = null;
		}
		client.anInt3163 = 0;
		client.aClass581_21.method33222();
		client.anInt3054 = 0;
		client.aClass581_19.method33222();
		Class375.method27232(Class205.method24189());
		client.anInt3060 = 0;
		Class424.aClass165_1.aClass460_1.method28564();
		Class357.aClass245_1 = null;
		Class471.aClass245_2 = null;
		Class14_Sub5.aClass3_Sub30_1 = null;
		Class68.aClass3_Sub30_2 = null;
		Class413.aClass507_1 = null;
		Class230.aLong247 = 0L;
		Class604.method33533();
		Class463.method28610();
	}
}
