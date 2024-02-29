package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public class Class580 implements Interface64 {

	@OriginalMember(owner = "client!um", name = "e", descriptor = "[[S")
	public static short[][] aShortArrayArray4;

	@OriginalMember(owner = "client!um", name = "p", descriptor = "I")
	final int anInt5442;

	@OriginalMember(owner = "client!um", name = "c", descriptor = "I")
	final int anInt5443;

	@OriginalMember(owner = "client!um", name = "v", descriptor = "[I")
	final int[] anIntArray504;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(II[I)V", line = 13)
	Class580(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		this.anInt5442 = arg0 * 1220441799;
		this.anInt5443 = arg1 * 556373361;
		this.anIntArray504 = arg2;
	}

	@OriginalMember(owner = "client!um", name = "c", descriptor = "(Lclient!akz;[Lclient!tl;ILclient!tb;)Z", line = 20)
	@Override
	public boolean method32035(@OriginalArg(0) Class77_Sub42 arg0, @OriginalArg(1) Interface62[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class141 arg3) {
		if (arg0 != null) {
			if (this.anInt5442 * -477402377 != arg0.method22715()) {
				return false;
			}
			if (this.anInt5443 * -651261039 > arg0.method22731()) {
				return false;
			}
			@Pc(32) int[] local32 = this.anIntArray504;
			for (@Pc(34) int local34 = 0; local34 < local32.length; local34++) {
				@Pc(42) int local42 = local32[local34];
				if (!arg3.method14784(local42)) {
					return false;
				}
			}
		} else if (-477402377 * this.anInt5442 != -1) {
			return false;
		}
		return true;
	}

	@OriginalMember(owner = "client!um", name = "p", descriptor = "(Lclient!akz;[Lclient!tl;ILclient!tb;I)Z", line = 20)
	@Override
	public boolean method32034(@OriginalArg(0) Class77_Sub42 arg0, @OriginalArg(1) Interface62[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class141 arg3) {
		if (arg0 != null) {
			if (this.anInt5442 * -477402377 != arg0.method22715()) {
				return false;
			}
			if (this.anInt5443 * -651261039 > arg0.method22731()) {
				return false;
			}
			@Pc(32) int[] local32 = this.anIntArray504;
			for (@Pc(34) int local34 = 0; local34 < local32.length; local34++) {
				@Pc(42) int local42 = local32[local34];
				if (!arg3.method14784(local42)) {
					return false;
				}
			}
		} else if (-477402377 * this.anInt5442 != -1) {
			return false;
		}
		return true;
	}

	@OriginalMember(owner = "client!um", name = "p", descriptor = "(Lclient!xo;I)V", line = 24)
	public static void method31678(@OriginalArg(0) Class650 arg0) {
		if (arg0.aClass386_3 == Class386.aClass386_2) {
			Class637.aClass117_6 = new Class117_Sub1(arg0);
		} else if (arg0.aClass386_3 == Class386.aClass386_1) {
			Class637.aClass117_6 = new Class117_Sub2(arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!um", name = "r", descriptor = "(IZI)Lclient!aks;", line = 37)
	public static Class77_Sub36 method31679(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) Class77_Sub36[] local2 = Class77_Sub36.aClass77_Sub36Array1;
		synchronized (Class77_Sub36.aClass77_Sub36Array1) {
			if (Class77_Sub36.anInt1775 * 2450901 == 0) {
				return new Class77_Sub36(arg0, arg1);
			} else {
				Class77_Sub36.aClass77_Sub36Array1[(Class77_Sub36.anInt1775 -= 1809361789) * 2450901].method14446(arg0, arg1);
				return Class77_Sub36.aClass77_Sub36Array1[Class77_Sub36.anInt1775 * 2450901];
			}
		}
	}

	@OriginalMember(owner = "client!um", name = "l", descriptor = "(Lclient!akv;)Lclient!um;", line = 40)
	static Class580 method31680(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(3) int local3 = arg0.method22478();
		@Pc(7) int local7 = arg0.method22478();
		@Pc(11) int local11 = arg0.method22478();
		@Pc(14) int[] local14 = new int[local11];
		for (@Pc(16) int local16 = 0; local16 < local11; local16++) {
			local14[local16] = arg0.method22478();
		}
		return new Class580(local3, local7, local14);
	}

	@OriginalMember(owner = "client!um", name = "eb", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 5372)
	static final void method31681(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg0.anInt3930 = arg2.anIntArray536[(arg2.anInt5784 -= 308999563) * 2088438307] * -279362861;
		Class461.method29531(arg0);
	}

	@OriginalMember(owner = "client!um", name = "aol", descriptor = "(Lclient!yf;B)V", line = 12031)
	static final void method31682(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(27) String local27 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		@Pc(42) boolean local42 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1] == 1;
		Class68.method977(local13, local27, local42);
	}

	@OriginalMember(owner = "client!um", name = "asj", descriptor = "(Lclient!yf;B)V", line = 12602)
	static final void method31683(@OriginalArg(0) Class665 arg0) {
		@Pc(2) long local2 = Class280.method26667();
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = (int) (local2 / 86400000L) - 11745;
	}
}
