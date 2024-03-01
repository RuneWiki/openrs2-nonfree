package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public class Class476 {

	@OriginalMember(owner = "client!td", name = "tu", descriptor = "I")
	static int anInt5134;

	@OriginalMember(owner = "client!td", name = "b", descriptor = "I")
	int anInt5122;

	@OriginalMember(owner = "client!td", name = "c", descriptor = "I")
	int anInt5123;

	@OriginalMember(owner = "client!td", name = "g", descriptor = "I")
	int anInt5124;

	@OriginalMember(owner = "client!td", name = "p", descriptor = "I")
	int anInt5125;

	@OriginalMember(owner = "client!td", name = "h", descriptor = "I")
	int anInt5126;

	@OriginalMember(owner = "client!td", name = "l", descriptor = "I")
	int anInt5127;

	@OriginalMember(owner = "client!td", name = "s", descriptor = "I")
	int anInt5128;

	@OriginalMember(owner = "client!td", name = "u", descriptor = "I")
	int anInt5129;

	@OriginalMember(owner = "client!td", name = "y", descriptor = "I")
	int anInt5130;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "I")
	int anInt5131;

	@OriginalMember(owner = "client!td", name = "x", descriptor = "I")
	int anInt5132;

	@OriginalMember(owner = "client!td", name = "z", descriptor = "I")
	int anInt5133;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;", line = 44)
	public static String method28797(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(7) StringBuilder local7 = new StringBuilder(local2);
		for (@Pc(9) int local9 = 0; local9 < local2; local9++) {
			@Pc(16) char local16 = arg0.charAt(local9);
			if (local16 >= 'a' && local16 <= 'z' || !(local16 < 'A' || local16 > 'Z') || local16 >= '0' && local16 <= '9' || local16 == '.' || local16 == '-' || local16 == '*' || local16 == '_') {
				local7.append(local16);
			} else if (local16 == ' ') {
				local7.append('+');
			} else {
				@Pc(63) byte local63 = Class525.method32378(local16);
				local7.append('%');
				@Pc(73) int local73 = local63 >> 4 & 0xF;
				if (local73 >= 10) {
					local7.append((char) (local73 + 55));
				} else {
					local7.append((char) (local73 + 48));
				}
				local73 = local63 & 0xF;
				if (local73 >= 10) {
					local7.append((char) (local73 + 55));
				} else {
					local7.append((char) (local73 + 48));
				}
			}
		}
		return local7.toString();
	}

	@OriginalMember(owner = "client!td", name = "y", descriptor = "(Lclient!vs;B)V", line = 47)
	static void method28796(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2]).method29474(Class424.aClass165_1, arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]) ? 1 : 0;
		arg0.anInt5319 -= 312124549;
	}

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V", line = 246)
	Class476() {
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!td;)Z", line = 249)
	boolean method28793(@OriginalArg(0) Class476 arg0) {
		return arg0.anInt5122 * 1174425445 == this.anInt5122 * 1174425445 && this.anInt5123 * -138846813 == arg0.anInt5123 * -138846813 && arg0.anInt5133 * -1339547639 == this.anInt5133 * -1339547639;
	}

	@OriginalMember(owner = "client!td", name = "p", descriptor = "(Lclient!td;S)Z", line = 249)
	boolean method28794(@OriginalArg(0) Class476 arg0) {
		return arg0.anInt5122 * 1174425445 == this.anInt5122 * 1174425445 && this.anInt5123 * -138846813 == arg0.anInt5123 * -138846813 && arg0.anInt5133 * -1339547639 == this.anInt5133 * -1339547639;
	}

	@OriginalMember(owner = "client!td", name = "g", descriptor = "(Lclient!td;)Z", line = 249)
	boolean method28795(@OriginalArg(0) Class476 arg0) {
		return arg0.anInt5122 * 1174425445 == this.anInt5122 * 1174425445 && this.anInt5123 * -138846813 == arg0.anInt5123 * -138846813 && arg0.anInt5133 * -1339547639 == this.anInt5133 * -1339547639;
	}
}
