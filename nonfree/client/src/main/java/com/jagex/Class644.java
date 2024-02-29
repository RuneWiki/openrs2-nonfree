package com.jagex;

import java.io.IOException;
import java.util.Queue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xi")
final class Class644 implements Interface73 {

	@OriginalMember(owner = "client!xi", name = "p", descriptor = "(ZI)V", line = 42)
	@Override
	public void method32824(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!xi", name = "y", descriptor = "(Z)V", line = 42)
	@Override
	public void method32822() {
	}

	@OriginalMember(owner = "client!xi", name = "w", descriptor = "(Z)V", line = 42)
	@Override
	public void method32823() {
	}

	@OriginalMember(owner = "client!xi", name = "t", descriptor = "(Z)V", line = 42)
	@Override
	public void method32818() {
	}

	@OriginalMember(owner = "client!xi", name = "v", descriptor = "(III)V", line = 45)
	@Override
	public void method32821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(7) int local7 = arg0 & 0xFFFF;
		@Pc(10) Queue local10 = Class640.aQueue3;
		synchronized (Class640.aQueue3) {
			Class640.aQueue3.add(Class126_Sub1.method11583(local3, local7, arg1, arg2));
		}
	}

	@OriginalMember(owner = "client!xi", name = "c", descriptor = "(IIII)V", line = 45)
	@Override
	public void method32819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(7) int local7 = arg0 & 0xFFFF;
		@Pc(10) Queue local10 = Class640.aQueue3;
		synchronized (Class640.aQueue3) {
			Class640.aQueue3.add(Class126_Sub1.method11583(local3, local7, arg1, arg2));
		}
	}

	@OriginalMember(owner = "client!xi", name = "l", descriptor = "(III)V", line = 45)
	@Override
	public void method32820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(7) int local7 = arg0 & 0xFFFF;
		@Pc(10) Queue local10 = Class640.aQueue3;
		synchronized (Class640.aQueue3) {
			Class640.aQueue3.add(Class126_Sub1.method11583(local3, local7, arg1, arg2));
		}
	}

	@OriginalMember(owner = "client!xi", name = "x", descriptor = "(Lclient!akv;B)V", line = 411)
	public static void method32825(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(2) byte[] local2 = new byte[24];
		try {
			Class504.aClass34_4.method542(0L);
			Class504.aClass34_4.method552(local2);
			@Pc(11) int local11;
			for (local11 = 0; local11 < 24 && local2[local11] == 0; local11++) {
			}
			if (local11 >= 24) {
				throw new IOException();
			}
		} catch (@Pc(31) Exception local31) {
			for (@Pc(33) int local33 = 0; local33 < 24; local33++) {
				local2[local33] = -1;
			}
		}
		arg0.method22452(local2, 0, 24);
	}

	@OriginalMember(owner = "client!xi", name = "amg", descriptor = "(Lclient!yf;I)V", line = 11867)
	static final void method32826(@OriginalArg(0) Class665 arg0) {
		if (Class597.aClass107_Sub1_2.method8879() != Class321.aClass321_3) {
			throw new RuntimeException();
		}
		((Class149_Sub3) Class597.aClass107_Sub1_2.method8873()).method16722(arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307]);
	}

	@OriginalMember(owner = "client!xi", name = "apa", descriptor = "(Lclient!yf;I)V", line = 12227)
	static final void method32827(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		if (local12 < 0 || local12 > 5 || local12 == 2) {
			local12 = 3;
		}
		Class533.method30776(local12, false);
	}
}
