package com.jagex;

import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zz")
public final class Class706 {

	@OriginalMember(owner = "client!zz", name = "p", descriptor = "Z")
	public static boolean aBoolean868 = true;

	@OriginalMember(owner = "client!zz", name = "<init>", descriptor = "()V", line = 10)
	Class706() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!zz", name = "y", descriptor = "(Lclient!aap;)[Lclient!aaf;", line = 15)
	public static Class7[] method36570(@OriginalArg(0) Class15 arg0) {
		@Pc(3) int[] local3 = arg0.method251();
		@Pc(9) Class7[] local9 = new Class7[local3.length >> 2];
		for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
			@Pc(19) Class7 local19 = new Class7();
			local9[local11] = local19;
			local19.anInt24 = local3[local11 << 2] * 1773936893;
			local19.anInt25 = local3[(local11 << 2) + 1] * 1510603849;
			local19.anInt26 = local3[(local11 << 2) + 2] * 1739643887;
			local19.anInt27 = local3[(local11 << 2) + 3] * 791594069;
		}
		return local9;
	}

	@OriginalMember(owner = "client!zz", name = "l", descriptor = "(Lclient!aap;)[Lclient!aaf;", line = 15)
	public static Class7[] method36571(@OriginalArg(0) Class15 arg0) {
		@Pc(3) int[] local3 = arg0.method251();
		@Pc(9) Class7[] local9 = new Class7[local3.length >> 2];
		for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
			@Pc(19) Class7 local19 = new Class7();
			local9[local11] = local19;
			local19.anInt24 = local3[local11 << 2] * 1773936893;
			local19.anInt25 = local3[(local11 << 2) + 1] * 1510603849;
			local19.anInt26 = local3[(local11 << 2) + 2] * 1739643887;
			local19.anInt27 = local3[(local11 << 2) + 3] * 791594069;
		}
		return local9;
	}

	@OriginalMember(owner = "client!zz", name = "d", descriptor = "(Lclient!aap;IIII)Ljava/awt/Frame;", line = 29)
	public static Frame method36572(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg3 == 0) {
			@Pc(6) Class7[] local6 = Class642.method32811(arg0);
			if (local6 == null) {
				return null;
			}
			@Pc(12) boolean local12 = false;
			for (@Pc(14) int local14 = 0; local14 < local6.length; local14++) {
				if (local6[local14].anInt24 * -1991181227 == arg1 && local6[local14].anInt25 * -778390023 == arg2 && (arg4 == 0 || arg4 == local6[local14].anInt27 * 1793071357) && (!local12 || local6[local14].anInt26 * 198554383 > arg3)) {
					arg3 = local6[local14].anInt26 * 198554383;
					local12 = true;
				}
			}
			if (!local12) {
				return null;
			}
		}
		@Pc(75) Frame local75 = new Frame("Jagex Full Screen");
		local75.setResizable(false);
		arg0.method254(local75, arg1, arg2, arg3, arg4);
		return local75;
	}

	@OriginalMember(owner = "client!zz", name = "w", descriptor = "(Lclient!aap;IIII)Ljava/awt/Frame;", line = 29)
	public static Frame method36573(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg3 == 0) {
			@Pc(6) Class7[] local6 = Class642.method32811(arg0);
			if (local6 == null) {
				return null;
			}
			@Pc(12) boolean local12 = false;
			for (@Pc(14) int local14 = 0; local14 < local6.length; local14++) {
				if (local6[local14].anInt24 * -1991181227 == arg1 && local6[local14].anInt25 * -778390023 == arg2 && (arg4 == 0 || arg4 == local6[local14].anInt27 * 1793071357) && (!local12 || local6[local14].anInt26 * 198554383 > arg3)) {
					arg3 = local6[local14].anInt26 * 198554383;
					local12 = true;
				}
			}
			if (!local12) {
				return null;
			}
		}
		@Pc(75) Frame local75 = new Frame("Jagex Full Screen");
		local75.setResizable(false);
		arg0.method254(local75, arg1, arg2, arg3, arg4);
		return local75;
	}

	@OriginalMember(owner = "client!zz", name = "t", descriptor = "(Lclient!aap;IIII)Ljava/awt/Frame;", line = 29)
	public static Frame method36574(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg3 == 0) {
			@Pc(6) Class7[] local6 = Class642.method32811(arg0);
			if (local6 == null) {
				return null;
			}
			@Pc(12) boolean local12 = false;
			for (@Pc(14) int local14 = 0; local14 < local6.length; local14++) {
				if (local6[local14].anInt24 * -1991181227 == arg1 && local6[local14].anInt25 * -778390023 == arg2 && (arg4 == 0 || arg4 == local6[local14].anInt27 * 1793071357) && (!local12 || local6[local14].anInt26 * 198554383 > arg3)) {
					arg3 = local6[local14].anInt26 * 198554383;
					local12 = true;
				}
			}
			if (!local12) {
				return null;
			}
		}
		@Pc(75) Frame local75 = new Frame("Jagex Full Screen");
		local75.setResizable(false);
		arg0.method254(local75, arg1, arg2, arg3, arg4);
		return local75;
	}

	@OriginalMember(owner = "client!zz", name = "r", descriptor = "(Lclient!aap;IIII)Ljava/awt/Frame;", line = 29)
	public static Frame method36575(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg3 == 0) {
			@Pc(6) Class7[] local6 = Class642.method32811(arg0);
			if (local6 == null) {
				return null;
			}
			@Pc(12) boolean local12 = false;
			for (@Pc(14) int local14 = 0; local14 < local6.length; local14++) {
				if (local6[local14].anInt24 * -1991181227 == arg1 && local6[local14].anInt25 * -778390023 == arg2 && (arg4 == 0 || arg4 == local6[local14].anInt27 * 1793071357) && (!local12 || local6[local14].anInt26 * 198554383 > arg3)) {
					arg3 = local6[local14].anInt26 * 198554383;
					local12 = true;
				}
			}
			if (!local12) {
				return null;
			}
		}
		@Pc(75) Frame local75 = new Frame("Jagex Full Screen");
		local75.setResizable(false);
		arg0.method254(local75, arg1, arg2, arg3, arg4);
		return local75;
	}

	@OriginalMember(owner = "client!zz", name = "x", descriptor = "(Lclient!aap;IIII)Ljava/awt/Frame;", line = 29)
	public static Frame method36576(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg3 == 0) {
			@Pc(6) Class7[] local6 = Class642.method32811(arg0);
			if (local6 == null) {
				return null;
			}
			@Pc(12) boolean local12 = false;
			for (@Pc(14) int local14 = 0; local14 < local6.length; local14++) {
				if (local6[local14].anInt24 * -1991181227 == arg1 && local6[local14].anInt25 * -778390023 == arg2 && (arg4 == 0 || arg4 == local6[local14].anInt27 * 1793071357) && (!local12 || local6[local14].anInt26 * 198554383 > arg3)) {
					arg3 = local6[local14].anInt26 * 198554383;
					local12 = true;
				}
			}
			if (!local12) {
				return null;
			}
		}
		@Pc(75) Frame local75 = new Frame("Jagex Full Screen");
		local75.setResizable(false);
		arg0.method254(local75, arg1, arg2, arg3, arg4);
		return local75;
	}

	@OriginalMember(owner = "client!zz", name = "q", descriptor = "(Lclient!aap;IIII)Ljava/awt/Frame;", line = 29)
	public static Frame method36577(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg3 == 0) {
			@Pc(6) Class7[] local6 = Class642.method32811(arg0);
			if (local6 == null) {
				return null;
			}
			@Pc(12) boolean local12 = false;
			for (@Pc(14) int local14 = 0; local14 < local6.length; local14++) {
				if (local6[local14].anInt24 * -1991181227 == arg1 && local6[local14].anInt25 * -778390023 == arg2 && (arg4 == 0 || arg4 == local6[local14].anInt27 * 1793071357) && (!local12 || local6[local14].anInt26 * 198554383 > arg3)) {
					arg3 = local6[local14].anInt26 * 198554383;
					local12 = true;
				}
			}
			if (!local12) {
				return null;
			}
		}
		@Pc(75) Frame local75 = new Frame("Jagex Full Screen");
		local75.setResizable(false);
		arg0.method254(local75, arg1, arg2, arg3, arg4);
		return local75;
	}

	@OriginalMember(owner = "client!zz", name = "s", descriptor = "(Lclient!aap;IIII)Ljava/awt/Frame;", line = 29)
	public static Frame method36578(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg3 == 0) {
			@Pc(6) Class7[] local6 = Class642.method32811(arg0);
			if (local6 == null) {
				return null;
			}
			@Pc(12) boolean local12 = false;
			for (@Pc(14) int local14 = 0; local14 < local6.length; local14++) {
				if (local6[local14].anInt24 * -1991181227 == arg1 && local6[local14].anInt25 * -778390023 == arg2 && (arg4 == 0 || arg4 == local6[local14].anInt27 * 1793071357) && (!local12 || local6[local14].anInt26 * 198554383 > arg3)) {
					arg3 = local6[local14].anInt26 * 198554383;
					local12 = true;
				}
			}
			if (!local12) {
				return null;
			}
		}
		@Pc(75) Frame local75 = new Frame("Jagex Full Screen");
		local75.setResizable(false);
		arg0.method254(local75, arg1, arg2, arg3, arg4);
		return local75;
	}

	@OriginalMember(owner = "client!zz", name = "g", descriptor = "(Lclient!aap;Ljava/awt/Frame;)V", line = 52)
	public static void method36579(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Frame arg1) {
		arg0.method256();
		arg1.setVisible(false);
		arg1.dispose();
	}

	@OriginalMember(owner = "client!zz", name = "z", descriptor = "(Lclient!aap;Ljava/awt/Frame;)V", line = 52)
	public static void method36580(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Frame arg1) {
		arg0.method256();
		arg1.setVisible(false);
		arg1.dispose();
	}

	@OriginalMember(owner = "client!zz", name = "j", descriptor = "(Lclient!aap;Ljava/awt/Frame;)V", line = 52)
	public static void method36581(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Frame arg1) {
		arg0.method256();
		arg1.setVisible(false);
		arg1.dispose();
	}
}
