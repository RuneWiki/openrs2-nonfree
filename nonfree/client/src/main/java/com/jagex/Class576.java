package com.jagex;

import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public class Class576 implements Interface64 {

	@OriginalMember(owner = "client!uh", name = "p", descriptor = "I")
	final int anInt5403;

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
	final int anInt5404;

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(II)V", line = 12)
	Class576(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5403 = arg0 * -502319593;
		this.anInt5404 = arg1 * 1770610565;
	}

	@OriginalMember(owner = "client!uh", name = "p", descriptor = "(Lclient!akz;[Lclient!tl;ILclient!tb;I)Z", line = 18)
	@Override
	public boolean method32034(@OriginalArg(0) Class77_Sub42 arg0, @OriginalArg(1) Interface62[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class141 arg3) {
		for (@Pc(1) int local1 = 0; local1 < arg2 && local1 < arg1.length; local1++) {
			@Pc(12) Interface62 local12 = arg1[local1];
			if (local12 != null && local12.method14158() == this.anInt5403 * -1305255513 && local12.method14149() == this.anInt5404 * 242205005) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "(Lclient!akz;[Lclient!tl;ILclient!tb;)Z", line = 18)
	@Override
	public boolean method32035(@OriginalArg(0) Class77_Sub42 arg0, @OriginalArg(1) Interface62[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class141 arg3) {
		for (@Pc(1) int local1 = 0; local1 < arg2 && local1 < arg1.length; local1++) {
			@Pc(12) Interface62 local12 = arg1[local1];
			if (local12 != null && local12.method14158() == this.anInt5403 * -1305255513 && local12.method14149() == this.anInt5404 * 242205005) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!uh", name = "l", descriptor = "(Lclient!akv;)Lclient!uh;", line = 27)
	static Class576 method31610(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(3) int local3 = arg0.method22478();
		@Pc(7) int local7 = arg0.method22478();
		return new Class576(local3, local7);
	}

	@OriginalMember(owner = "client!uh", name = "y", descriptor = "(Lclient!akv;)Lclient!uh;", line = 27)
	static Class576 method31611(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(3) int local3 = arg0.method22478();
		@Pc(7) int local7 = arg0.method22478();
		return new Class576(local3, local7);
	}

	@OriginalMember(owner = "client!uh", name = "t", descriptor = "(Lclient!apv;I)V", line = 268)
	public static void method31612(@OriginalArg(0) Class104_Sub1_Sub1_Sub1_Sub2 arg0) {
		@Pc(8) Class77_Sub16 local8 = (Class77_Sub16) Class77_Sub16.aClass12_12.method173((long) (arg0.anInt2867 * 1126388985));
		if (local8 == null) {
			return;
		}
		if (local8.aClass496_3 != null) {
			local8.aClass496_3.method30100(100);
			Class94_Sub4.aClass261_1.method26325(local8.aClass496_3);
			local8.aClass496_3 = null;
		}
		local8.method24063();
	}

	@OriginalMember(owner = "client!uh", name = "fu", descriptor = "(B)V", line = 2169)
	static void method31613() {
		if (Class284.aClass86_9.method20058()) {
			Class284.aClass86_9.method19957(Class470.aCanvas6);
			Class295.method27034();
			@Pc(11) Dimension local11 = Class470.aCanvas6.getSize();
			Class284.aClass86_9.method19948(Class470.aCanvas6, local11.width, local11.height);
			Class284.aClass86_9.method19959(Class470.aCanvas6);
		} else {
			Class533.method30776(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_1.method15109(), false);
		}
		Class430.method28815();
	}
}
