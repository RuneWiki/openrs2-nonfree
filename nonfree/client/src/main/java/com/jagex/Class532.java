package com.jagex;

import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public class Class532 implements Interface56 {

	@OriginalMember(owner = "client!vn", name = "p", descriptor = "Lclient!vn;")
	public static final Class532 aClass532_6 = new Class532(2, 0);

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "Lclient!vn;")
	public static final Class532 aClass532_2 = new Class532(4, 1);

	@OriginalMember(owner = "client!vn", name = "g", descriptor = "Lclient!vn;")
	public static final Class532 aClass532_5 = new Class532(3, 2);

	@OriginalMember(owner = "client!vn", name = "l", descriptor = "Lclient!vn;")
	public static final Class532 aClass532_4 = new Class532(7, 3);

	@OriginalMember(owner = "client!vn", name = "h", descriptor = "Lclient!vn;")
	public static final Class532 aClass532_1 = new Class532(0, 4);

	@OriginalMember(owner = "client!vn", name = "x", descriptor = "Lclient!vn;")
	public static final Class532 aClass532_3 = new Class532(1, 5);

	@OriginalMember(owner = "client!vn", name = "s", descriptor = "Lclient!vn;")
	public static final Class532 aClass532_7 = new Class532(5, 6);

	@OriginalMember(owner = "client!vn", name = "u", descriptor = "Lclient!vn;")
	public static final Class532 aClass532_8 = new Class532(6, 7);

	@OriginalMember(owner = "client!vn", name = "y", descriptor = "I")
	public final int anInt5310;

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "I")
	final int anInt5311;

	@OriginalMember(owner = "client!vn", name = "p", descriptor = "(IB)Lclient!gi;", line = 16)
	public static Class198 method32501(@OriginalArg(0) int arg0) {
		if (Class198.aClass198_4.anInt3688 * 615478785 == arg0) {
			return Class198.aClass198_4;
		} else if (Class198.aClass198_3.anInt3688 * 615478785 == arg0) {
			return Class198.aClass198_3;
		} else if (Class198.aClass198_5.anInt3688 * 615478785 == arg0) {
			return Class198.aClass198_5;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vn", name = "s", descriptor = "()[Lclient!vn;", line = 20)
	public static Class532[] method32497() {
		return new Class532[] { aClass532_4, aClass532_1, aClass532_8, aClass532_2, aClass532_5, aClass532_7, aClass532_6, aClass532_3 };
	}

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(II)V", line = 23)
	Class532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5310 = arg0 * -280301733;
		this.anInt5311 = arg1 * -987931267;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)I", line = 29)
	@Override
	public int method33765() {
		return this.anInt5311 * -1128807467;
	}

	@OriginalMember(owner = "client!vn", name = "h", descriptor = "()I", line = 29)
	@Override
	public int method33766() {
		return this.anInt5311 * -1128807467;
	}

	@OriginalMember(owner = "client!vn", name = "x", descriptor = "()I", line = 29)
	@Override
	public int method33764() {
		return this.anInt5311 * -1128807467;
	}

	@OriginalMember(owner = "client!vn", name = "l", descriptor = "()I", line = 29)
	@Override
	public int method33767() {
		return this.anInt5311 * -1128807467;
	}

	@OriginalMember(owner = "client!vn", name = "g", descriptor = "(I)Lclient!vn;", line = 33)
	public Class532 method32498() {
		switch(this.anInt5310 * 1372301523) {
			case 0:
				return aClass532_6;
			case 1:
				return aClass532_2;
			case 2:
				return aClass532_1;
			case 3:
				return aClass532_7;
			case 4:
				return aClass532_3;
			case 5:
				return aClass532_5;
			case 6:
				return aClass532_4;
			case 7:
				return aClass532_8;
			default:
				throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!vn", name = "u", descriptor = "()Lclient!vn;", line = 33)
	public Class532 method32499() {
		switch(this.anInt5310 * 1372301523) {
			case 0:
				return aClass532_6;
			case 1:
				return aClass532_2;
			case 2:
				return aClass532_1;
			case 3:
				return aClass532_7;
			case 4:
				return aClass532_3;
			case 5:
				return aClass532_5;
			case 6:
				return aClass532_4;
			case 7:
				return aClass532_8;
			default:
				throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!vn", name = "h", descriptor = "(JIZLclient!vk;B)Ljava/lang/String;", line = 114)
	public static String method32500(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class530 arg3) {
		@Pc(1) char local1 = ',';
		@Pc(3) char local3 = '.';
		if (arg3 == Class530.aClass530_9) {
			local1 = '.';
			local3 = ',';
		}
		if (arg3 == Class530.aClass530_3) {
			local3 = 160;
		}
		@Pc(17) boolean local17 = false;
		if (arg0 < 0L) {
			local17 = true;
			arg0 = -arg0;
		}
		@Pc(31) StringBuilder local31 = new StringBuilder(26);
		@Pc(35) int local35;
		@Pc(41) int local41;
		if (arg1 > 0) {
			for (local35 = 0; local35 < arg1; local35++) {
				local41 = (int) arg0;
				arg0 /= 10L;
				local31.append((char) (local41 + 48 - (int) arg0 * 10));
			}
			local31.append(local1);
		}
		local35 = 0;
		while (true) {
			local41 = (int) arg0;
			arg0 /= 10L;
			local31.append((char) (local41 + 48 - (int) arg0 * 10));
			if (arg0 == 0L) {
				if (local17) {
					local31.append('-');
				}
				return local31.reverse().toString();
			}
			if (arg2) {
				local35++;
				if (local35 % 3 == 0) {
					local31.append(local3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vn", name = "fq", descriptor = "(IB)V", line = 2376)
	static void method32502(@OriginalArg(0) int arg0) {
		if (Class510.aClass3_Sub45_37.aClass60_Sub34_1.method14467() == 0) {
			arg0 = -1;
		}
		if (client.anInt3121 * -702356249 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(20) Class608 local20 = FileFilter_Sub1.aClass597_1.method33466(arg0);
			@Pc(24) Class15 local24 = local20.method33559();
			if (local24 == null) {
				arg0 = -1;
			} else {
				Class316.aClass393_1.setcustomcursor(Class106.aCanvas6, local24.method3448(true), local24.method3446(), local24.method3441(), new Point(local20.anInt5532 * -45827963, local20.anInt5534 * -1956350165));
				client.anInt3121 = arg0 * 2040917719;
			}
		}
		if (arg0 == -1 && client.anInt3121 * -702356249 != -1) {
			Class316.aClass393_1.setcustomcursor(Class106.aCanvas6, null, -1, -1, new Point());
			client.anInt3121 = -2040917719;
		}
	}

	@OriginalMember(owner = "client!vn", name = "lr", descriptor = "(Ljava/lang/String;B)I", line = 11310)
	public static final int method32503(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(6) int local6 = 0; local6 < client.anInt3042 * -1645830611; local6++) {
			if (arg0.equalsIgnoreCase(client.aClass313Array1[local6].aString202)) {
				return local6;
			}
		}
		return -1;
	}
}
