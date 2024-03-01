package com.jagex;

import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class552 {

	@OriginalMember(owner = "client!wj", name = "au", descriptor = "I")
	static int anInt5332;

	@OriginalMember(owner = "client!wj", name = "p", descriptor = "Z")
	public static boolean aBoolean823 = true;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V", line = 10)
	Class552() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!wj", name = "l", descriptor = "(Lclient!wn;)[Lclient!xe;", line = 15)
	public static Class573[] method32696(@OriginalArg(0) Class556 arg0) {
		@Pc(3) int[] local3 = arg0.method32798();
		@Pc(9) Class573[] local9 = new Class573[local3.length >> 2];
		for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
			@Pc(19) Class573 local19 = new Class573();
			local9[local11] = local19;
			local19.anInt5423 = local3[local11 << 2] * -1461281489;
			local19.anInt5424 = local3[(local11 << 2) + 1] * 1776837851;
			local19.anInt5425 = local3[(local11 << 2) + 2] * 1443619699;
			local19.anInt5422 = local3[(local11 << 2) + 3] * -1574001159;
		}
		return local9;
	}

	@OriginalMember(owner = "client!wj", name = "h", descriptor = "(Lclient!wn;)[Lclient!xe;", line = 15)
	public static Class573[] method32697(@OriginalArg(0) Class556 arg0) {
		@Pc(3) int[] local3 = arg0.method32798();
		@Pc(9) Class573[] local9 = new Class573[local3.length >> 2];
		for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
			@Pc(19) Class573 local19 = new Class573();
			local9[local11] = local19;
			local19.anInt5423 = local3[local11 << 2] * -1461281489;
			local19.anInt5424 = local3[(local11 << 2) + 1] * 1776837851;
			local19.anInt5425 = local3[(local11 << 2) + 2] * 1443619699;
			local19.anInt5422 = local3[(local11 << 2) + 3] * -1574001159;
		}
		return local9;
	}

	@OriginalMember(owner = "client!wj", name = "x", descriptor = "(Lclient!wn;IIII)Ljava/awt/Frame;", line = 29)
	public static Frame method32698(@OriginalArg(0) Class556 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg3 == 0) {
			@Pc(6) Class573[] local6 = Class360.method26766(arg0);
			if (local6 == null) {
				return null;
			}
			@Pc(13) boolean local13 = false;
			for (@Pc(15) int local15 = 0; local15 < local6.length; local15++) {
				if (local6[local15].anInt5423 * 1081330127 == arg1 && local6[local15].anInt5424 * 1418262355 == arg2 && (arg4 == 0 || arg4 == local6[local15].anInt5422 * 1459817545) && (!local13 || local6[local15].anInt5425 * 1293089211 > arg3)) {
					arg3 = local6[local15].anInt5425 * 1293089211;
					local13 = true;
				}
			}
			if (!local13) {
				return null;
			}
		}
		@Pc(75) Frame local75 = new Frame("Jagex Full Screen");
		local75.setResizable(false);
		arg0.method32799(local75, arg1, arg2, arg3, arg4);
		return local75;
	}

	@OriginalMember(owner = "client!wj", name = "p", descriptor = "(Lclient!ahb;Lclient!zf;I)Lclient!xy;", line = 33)
	static Class591 method32699(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) Class70_Sub1 arg1) {
		@Pc(4) Class591 local4 = new Class591(arg1);
		while (true) {
			@Pc(8) int local8 = arg0.method20269();
			if (local8 == 255) {
				return local4;
			}
			@Pc(18) Class342 local18 = (Class342) Class371.method27203(Class342.class, local8);
			while (true) {
				@Pc(22) int local22 = arg0.method20269();
				if (local22 == 255) {
					break;
				}
				arg0.anInt2803 -= -918980331;
				@Pc(38) Class304 local38 = arg1.method14718(arg0, local18);
				if (local38 != null) {
					local4.method33310(local38.anInt4428 * 1628864065, local38.anObject17);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wj", name = "s", descriptor = "(Lclient!wn;Ljava/awt/Frame;)V", line = 52)
	public static void method32695(@OriginalArg(0) Class556 arg0, @OriginalArg(1) Frame arg1) {
		arg0.method32804();
		arg1.setVisible(false);
		arg1.dispose();
	}

	@OriginalMember(owner = "client!wj", name = "bf", descriptor = "(III)B", line = 79)
	static byte method32700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Class456.aClass456_6.anInt5061 * 821735799 == arg0) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
